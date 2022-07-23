package post;

import midia.Midia;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private List<Midia> listaMidiasPost = new ArrayList<>();      
    private SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
    private Date horarioPublicacao = new Date();          
    private String textoPost;
    private int curtidas;        
    
    public Post(String textoPost, int curtidas) {
        if(textoPost != null && textoPost.length() > 0 && textoPost.length() <= 100) {
        	this.curtidas = curtidas;
        	this.textoPost = textoPost;
        	return;
        }   
        else
            System.out.println("Caracteres inválidos!");
    }

    public String getTextoPost() {
        return textoPost;
    }

    public void setTextoPost(String textoPost) {
        this.textoPost = textoPost;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void adicionarMidia (Midia midia) {
        listaMidiasPost.add(midia);
    }
    
    public void removerMidia (Midia midia) {
        listaMidiasPost.remove(midia);
    }
    
    public void exibirHorarioPost() {
        System.out.println(formatar.format(horarioPublicacao));
    }
    
    @Override
    public String toString() {
    	String midias = "\n";
    	if (listaMidiasPost.size() == 0)
    		return "\nPost:" + textoPost + "\nHorário da Publicação: " + horarioPublicacao + "\nCurtidas: " + curtidas;
    	else
    		for (Midia midia : listaMidiasPost) {
				midias = midias + midia.toString();
			}
    		return "\nPost: " + textoPost + "\n\nMidias: " + midias + "\n\nHorário da Publicação: " + horarioPublicacao + "\nCurtidas: " + curtidas;
    }
}


