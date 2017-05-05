package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Sid on 02/05/2017.
 */
@Component
public class Logic
{
    public MyProperties mp;

    public Logic() {

        System.out.println ("In Constructor");
    }


    @Autowired
    public void setMp (MyProperties m)
    {
        this.mp = m;
    }

    public void printProperties ()
    {
        if (mp == null)
        {
            System.out.println ("Bean NOT created");
        }

        System.out.println (mp.getEmail());
    }

}
