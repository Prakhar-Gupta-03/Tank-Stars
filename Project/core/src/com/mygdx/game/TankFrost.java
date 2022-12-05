package com.tankstars.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class TankFrost {
    private int hitPoints;
    private Skin tankSkin;
    private TextureAtlas tankAtlas;
    private Sprite tankSprite;
    private com.tankstars.game.Weapon FrostBlast;
    private com.tankstars.game.Weapon FrostBite;
    private com.tankstars.game.Weapon FrostBlizzard;
    private com.tankstars.game.Weapon FrostAssaultDrones;
    private com.tankstars.game.Weapon FrostHighPressure;
    private com.tankstars.game.Weapon FrostIceSplitter;
    private boolean isPlayer1;
    private boolean isPlayer2;
    public TankFrost(boolean isPlayer1, boolean isPlayer2){
        tankAtlas = new TextureAtlas("Tanks/items.pack");
        tankSkin = new Skin(tankAtlas);
        tankSprite = new Sprite(tankAtlas.findRegion("TankFrost"));
        this.isPlayer1 = isPlayer1;
        this.isPlayer2 = isPlayer2;
        FrostBlast = new com.tankstars.game.Weapon(new Sprite(tankAtlas.findRegion("FrostBlast")), "Blast");
        FrostBite = new com.tankstars.game.Weapon(new Sprite(tankAtlas.findRegion("FrostBite")), "Bite");
        FrostBlizzard = new com.tankstars.game.Weapon(new Sprite(tankAtlas.findRegion("Blizzard")), "Blizzard");
        FrostAssaultDrones = new com.tankstars.game.Weapon(new Sprite(tankAtlas.findRegion("AssaultDrones")), "AssaultDrones");
        FrostHighPressure = new com.tankstars.game.Weapon(new Sprite(tankAtlas.findRegion("HighPressure")), "HighPressure");
        FrostIceSplitter = new com.tankstars.game.Weapon(new Sprite(tankAtlas.findRegion("IceSplitter")), "IceSplitter");
    }
    public Sprite getTankSprite(){
        return tankSprite;
    }
}
