package SIGMA_BGW.SIG.V1001;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SIGMA
{
    public ArrayList<SIGMA_TRA_DTA> TRA_DTA = new ArrayList<>();
    public ArrayList<SIGMA_XYZ_DTA> XYZ_DTA = new ArrayList<>();
    
    
    public void IMPORT_TRI(String File)
    {
        try(BufferedReader BR = new BufferedReader(new InputStreamReader(new FileInputStream(File), "UTF-8")))
        {
            for(String TMP; (TMP = BR.readLine()) != null;)
            {
                String[] DTA = TMP.trim().split("\\s+");
                
                if(DTA[0].equals("TRA"))
                {
                    SIGMA_TRA_DTA TRA = new SIGMA_TRA_DTA();
                    
                    TRA.CRS = Integer.parseInt(DTA[1]);
                    
                    TRA.TX = DTA[2].equals("0") ? Boolean.FALSE : Boolean.TRUE;
                    TRA.TY = DTA[3].equals("0") ? Boolean.FALSE : Boolean.TRUE;
                    TRA.TZ = DTA[4].equals("0") ? Boolean.FALSE : Boolean.TRUE;
                    
                    TRA.RX = DTA[5].equals("0") ? Boolean.FALSE : Boolean.TRUE;
                    TRA.RY = DTA[6].equals("0") ? Boolean.FALSE : Boolean.TRUE;
                    TRA.RZ = DTA[7].equals("0") ? Boolean.FALSE : Boolean.TRUE;
                    
                    TRA.SP = DTA[8].equals("0") ? Boolean.FALSE : Boolean.TRUE;
                    
                    TRA_DTA.add(TRA);
                }
                
                if(DTA[0].equals("XYZ"))
                {
                    SIGMA_XYZ_DTA XYZ = new SIGMA_XYZ_DTA();
                    
                    XYZ.PID = DTA[2];
                    
                    XYZ.CRS = Integer.parseInt(DTA[1]);
                    
                    Double MCX_DTA = DTA[3].equals("/") ? Double.NaN : Double.parseDouble(DTA[3]);
                    Double MCY_DTA = DTA[4].equals("/") ? Double.NaN : Double.parseDouble(DTA[4]);
                    Double MCZ_DTA = DTA[5].equals("/") ? Double.NaN : Double.parseDouble(DTA[5]);
                    
                    Double SCX_DTA = DTA[6].equals("/") ? Double.NaN : Double.parseDouble(DTA[6]);
                    Double SCY_DTA = DTA[7].equals("/") ? Double.NaN : Double.parseDouble(DTA[7]);
                    Double SCZ_DTA = DTA[8].equals("/") ? Double.NaN : Double.parseDouble(DTA[8]);
                    
                    XYZ.SET_X_DTA(MCX_DTA, SCX_DTA);
                    XYZ.SET_Y_DTA(MCY_DTA, SCY_DTA);
                    XYZ.SET_Z_DTA(MCZ_DTA, SCZ_DTA);
                    
                    XYZ_DTA.add(XYZ);
                }
            }
        }
        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}
