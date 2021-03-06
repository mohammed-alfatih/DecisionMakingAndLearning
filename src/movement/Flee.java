package movement;

import objects.GameObject;
import processing.core.PVector;

/**
 * Created by mohz2 on 4/27/2017.
 */
public class Flee
{
    public static KinematicOutput getKinematic(GameObject character, PVector target)
    {
        KinematicOutput output = new KinematicOutput();
        output.velocity = PVector.sub(character.getPosition(), target);

        if (output.velocity.mag() > character.getMaxVel())
        {
            output.velocity.normalize();
            output.velocity.mult(character.getMaxVel());
        }

        return output;
    }
}