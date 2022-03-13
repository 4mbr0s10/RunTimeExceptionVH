/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeexception;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author celta
 */
public class Enemigo extends Personaje {
    private String urlImagenEnemigo="file:ovni.png";
    private String urlImagenAtaqueEnemigo="file:MissilVerde.png";
    public Enemigo(int hp) {
        super(hp);
    }

    public Enemigo(int hp, String urlImagenEnemigo, String urlImagenAtaqueEnemigo) {
        super(hp);
        this.urlImagenEnemigo = urlImagenEnemigo;
        this.urlImagenAtaqueEnemigo=urlImagenAtaqueEnemigo;
    }

    public ImageView spriteIntegradoEnemigo (Image image4) {

        ImageView mv4 = new ImageView(image4);

        mv4.setLayoutX(1000);
        mv4.setLayoutY(330);
        mv4.setFitHeight(100);
        mv4.setFitWidth(100);
        mv4.setPreserveRatio(true);
        return mv4;
    }
       public ImageView spriteAtaqueEnemigo (Image image5){
        
        ImageView mv5 = new ImageView(image5);
            
      mv5.setLayoutX(1030);
            mv5.setLayoutY(330);
            mv5.setFitHeight(50);
            mv5.setFitWidth(50);
            mv5.setRotate(-90);
            mv5.setPreserveRatio(true);
            
            return mv5;
    }

    public String getUrlImagenEnemigo() {
        return urlImagenEnemigo;
    }

    public void setUrlImagenEnemigo(String urlImagenEnemigo) {
        this.urlImagenEnemigo = urlImagenEnemigo;
    }

    public String getUrlImagenAtaqueEnemigo() {
        return urlImagenAtaqueEnemigo;
    }

    public void setUrlImagenAtaqueEnemigo(String urlImagenAtaqueEnemigo) {
        this.urlImagenAtaqueEnemigo = urlImagenAtaqueEnemigo;
    }
}
