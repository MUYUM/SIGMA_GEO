package SIGMA_BGW;

import SIGMA_BGW.PCS.OCS_PCS_DTA;

public class SIGMA
{
    public static void main(String[] args)
    {
        System.out.println("SigmaBGW");
        System.out.println("=========================");
        
        OCS_PCS_DTA PCS = new OCS_PCS_DTA("");
        PCS.start();
    }
}
