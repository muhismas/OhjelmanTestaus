
import java.util.ArrayList;


public class Tehtavienhallinta {
    private ArrayList<Tehtava> tehtavat;
    
    public Tehtavienhallinta(){
        tehtavat = new ArrayList<>();
    }
    
    public ArrayList<String> tehtavalista() {
        ArrayList<String> palautettavat = new ArrayList<>();
        for(Tehtava tehtava : tehtavat){
            palautettavat.add(tehtava.getNimi());
        }
        return palautettavat;
    }
    
    public void lisaa(String tehtava){
        tehtavat.add(new Tehtava(tehtava));
    }
    
    public void merkkaaTehdyksi(String tehdyksiMerkattavaTehtava){
        for(Tehtava tehtava : tehtavat){
            if(tehtava.getNimi().equals(tehdyksiMerkattavaTehtava)){
                tehtava.setTehty(true);
                break;
            }
        }
    }
    
    public boolean onTehty(String tarkistettava){
        for(Tehtava tehtava: tehtavat){
            if(tehtava.getNimi().equals(tarkistettava)){
                return tehtava.onTehty();
            }
        }
        return false;
    }
}
