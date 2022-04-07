
import java.text.DecimalFormat;
import java.util.Date;

public class Foititis {
    
    private static int AA = 0;
    // Δήλωση πεδίων
    private String AM;
    private String onomatEpwnymo;
    private int etosEisagwgis;
    private Date hmeromGennisis;
        
    
    // Δήλωση δημιουργών
    public Foititis(int etosEisagwgis,String onomatEpwnymo) {
    AA++;
    DecimalFormat mf = new DecimalFormat("0000");
    String tempAA = mf.format(AA);
    this.AM= (etosEisagwgis + tempAA);
    this.onomatEpwnymo = onomatEpwnymo; 
        this.etosEisagwgis = etosEisagwgis;   
    }
    
    public Foititis(String AM) {
        this.AM = AM;
    }
    public Foititis(Date hmeromGennisis) {
        this.hmeromGennisis = hmeromGennisis; 
    }
     
    public Foititis(String AM, int etosEisagwgis, String onomatEpwnymo) {        
        this.AM = AM; 
        this.onomatEpwnymo = onomatEpwnymo; 
        this.etosEisagwgis = etosEisagwgis;

    }

    // Δήλωση μεθόδων
    public String dwseAM() {
        return AM;
    }
 public void setHmeromGennisis(Date hmeromGennisis) {
        this.hmeromGennisis = hmeromGennisis;
    }
 public Date getHmeromGennisis() {
        return hmeromGennisis;
    }
    public String getAm() {
        return AM;
    }
    public String getOnomatEpwnymo() {
        return onomatEpwnymo;
    }

    public int getEtosEisagwgis() {
        return etosEisagwgis;
    }

    public String toString() {
        return ("AM : "+AM + " ONOMA EPITHETO : "+onomatEpwnymo + " ETOS EISAGWGIS : "+etosEisagwgis+ " HMEROMINIA GENNISIS : " +hmeromGennisis);       
    }
    

    
}
