package SIGMA_BGW;

import SIGMA_BGW.PCS.OCS_PCS_DTA;
import java.io.File;

public class SIGMA
{
    public static void main(String[] args)
    {
        System.out.println("SigmaBGW");
        System.out.println("=========================");
        
//      ==================================================
//      PROCESS
//      ==================================================
    
        SIGMA_BGW.SIG.V1001.SIGMA SIG = new SIGMA_BGW.SIG.V1001.SIGMA();
        
        SIG.IMPORT_TRI("../DATA/MISC/Transfromation_01.txt");
    
//      ==================================================



//      ==================================================
//      Multi Threading
//      ==================================================        
//        OCS_PCS_DTA PCS = new OCS_PCS_DTA("");
//        PCS.start();
//      ==================================================
    }
}
