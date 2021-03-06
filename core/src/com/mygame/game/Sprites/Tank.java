package com.mygame.game.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import com.mygame.game.BattleCITYbygdx;

/**
 * Created by Aspire on 8/12/2559.
 */
public class Tank extends Sprite{
    public World world;
    public Body b2body;

    public Tank(World world){
        this.world = world;
        defineTank();
    }

    public void defineTank(){
        BodyDef bdef = new BodyDef();
        bdef.position.set(32 / BattleCITYbygdx.PPM,32/ BattleCITYbygdx.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(5/BattleCITYbygdx.PPM);

        fdef.shape = shape;
        b2body.createFixture(fdef);


    }
}
