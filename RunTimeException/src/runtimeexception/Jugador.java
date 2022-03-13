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
public class Jugador extends Personaje {
   private String urlImagen="file:spaceShipSingleShoot.png";
   private String urlImagenAtaque="File:Missile.png";
    public Jugador(int hp) {
        super(hp);
    }

    public Jugador(int hp, String urlImagen, String urlImagenAtaque) {
        super(hp);
        this.urlImagen = urlImagen;
        this.urlImagenAtaque=urlImagenAtaque;
    }

    public ImageView spriteIntegrada (Image image) {
        ImageView mv = new ImageView(image);

        mv.setRotate(-90);
        mv.setLayoutX(-100);
        mv.setLayoutY(200);
        mv.setFitHeight(100);
        mv.setFitWidth(100);
        mv.setPreserveRatio(true);


        return mv;
    }
    public ImageView spriteAtaque (Image image3){
        
        ImageView mv3 = new ImageView(image3);
            
            mv3.setRotate(90);
            mv3.setLayoutX(50);
            mv3.setLayoutY(325);
            mv3.setFitHeight(50);
            mv3.setFitWidth(50);
            mv3.setPreserveRatio(true);
            
            return mv3;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUrlImagenAtaque() {
        return urlImagenAtaque;
    }

    public void setUrlImagenAtaque(String urlImagenAtaque) {
        this.urlImagenAtaque = urlImagenAtaque;
    }

}
