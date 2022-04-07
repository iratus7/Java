import java.util.Date;
import java.text.DecimalFormat;
import java.util.Random;

public class Foititis {
    // Δήλωση πεδίων
    private static int AA=0;
    private String AM;
    private String onomatEpwnymo;
    private int etosEisagwgis;
    private Date hmeromGennisis;
    private String mobilePhone;
    private float mo;
    
    // Δήλωση δημιουργών
    public Foititis(String AM) {
        this.AM = AM;
    }
     
    public Foititis(String AM,String onomatEpwnymo,int etosEisagwgis,String mobilePhone) {        
        this.AM = AM; 
        this.onomatEpwnymo = onomatEpwnymo; 
        this.etosEisagwgis = etosEisagwgis;
        Random rand = new Random();
        this.mo = rand.nextFloat()*10;
        this.mobilePhone = mobilePhone;
    }
    

    // Δήλωση μεθόδων
    public String dwseAM() {
        return AM;
    }

    public String getOnomatEpwnymo() {
        return onomatEpwnymo;
    }

    public int getEtosEisagwgis() {
        return etosEisagwgis;
    }
    public Date gethmeromGennisis() {
        return hmeromGennisis;
    }
    
    
    public String getMobile() {
        return mobilePhone;
    }
    public float getMo() {
        return mo;
    }
    public String getAm() {
        return AM;
    }

    public String toString() {
        return (AM + " " +
                onomatEpwnymo + " "+ mo +" "+ mobilePhone);       
    }

    public void setHmeromGennisis(Date hmeromGennisis) {
        this.hmeromGennisis = hmeromGennisis;
    }
    public void setMo(float mo) {
        this.mo = mo;
    }
    
    
    
    
    

    
}
