package SIGMA_BGW.SIG.V1001;

public class SIGMA_XYZ_DTA
{
    public static final String X = "X";
    public static final String Y = "Y";
    public static final String Z = "Z";
    
    public static final String USE_N = "X";
    public static final String USE_Y = "Y";

    public Integer CRS = 0;

    public String PID = "";

    public String MES_USE = "";

    public String DCX_USE = "";
    public String DCY_USE = "";
    public String DCZ_USE = "";

    public Double RCX_MOD = Double.NaN;
    public Double RCY_MOD = Double.NaN;
    public Double RCZ_MOD = Double.NaN;
     
    public Double MCX_DTA = Double.NaN; public Double SCX_DTA = Double.NaN; public Double SXY_DTA = Double.NaN;
    public Double MCY_DTA = Double.NaN; public Double SCY_DTA = Double.NaN; public Double SYZ_DTA = Double.NaN;
    public Double MCZ_DTA = Double.NaN; public Double SCZ_DTA = Double.NaN; public Double SZX_DTA = Double.NaN;

    public Double MCX_MOD = Double.NaN; public Double SCX_MOD = Double.NaN; public Double SXY_MOD = Double.NaN;
    public Double MCY_MOD = Double.NaN; public Double SCY_MOD = Double.NaN; public Double SYZ_MOD = Double.NaN;
    public Double MCZ_MOD = Double.NaN; public Double SCZ_MOD = Double.NaN; public Double SZX_MOD = Double.NaN;

    public Double MCX_RES = Double.NaN; public Double SCX_RES = Double.NaN; public Double SXY_RES = Double.NaN;
    public Double MCY_RES = Double.NaN; public Double SCY_RES = Double.NaN; public Double SYZ_RES = Double.NaN;
    public Double MCZ_RES = Double.NaN; public Double SCZ_RES = Double.NaN; public Double SZX_RES = Double.NaN;

    public void SET_X_DTA(Double MES, Double STD) { MCX_DTA = MES; SCX_DTA = STD; DCX_USE = Double.isNaN(STD) ? USE_N : USE_Y; }
    public void SET_Y_DTA(Double MES, Double STD) { MCY_DTA = MES; SCY_DTA = STD; DCY_USE = Double.isNaN(STD) ? USE_N : USE_Y; }
    public void SET_Z_DTA(Double MES, Double STD) { MCZ_DTA = MES; SCZ_DTA = STD; DCZ_USE = Double.isNaN(STD) ? USE_N : USE_Y; }
    
}
