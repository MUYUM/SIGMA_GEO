package SIGMA_BGW.PCS;

public class OCS_PCS_DTA implements Runnable
{
    private Thread THR;
    private String UID;

    public OCS_PCS_DTA(String NAME)
    {
       UID = NAME;
    }

    public void run()
    {
        try
        {
            while(true)
            {
                Thread.sleep(250);
            }
        }
        catch (InterruptedException e)
        {
           
        }
    }

    public void start ()
    {
       if (THR == null)
       {
          THR = new Thread(this, UID);
          THR.start ();
       }
    }
}
