package lab7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class OyutanManager {
	private List<Oyutan> oyutnuud;
	
	public OyutanManager() {
		oyutnuud= new ArrayList();
	}
	public void oyutannemeh(Oyutan o) {
		oyutnuud.add(o);
		System.out.println("Oyutan nemegdlee!");
	}
	public void oyutanustgah(String kod) {
		boolean ustgasan= oyutnuud.removeIf(o-> o.getOyutniikod().equals(kod));
		if(ustgasan) {
			System.out.println("oyutan ustgalaa!");
		}
		else {
			System.out.println("oyutan oldsongui!");
			
		}
	}

	public Oyutan oyutanhaih(String kod) {
		for (Oyutan o :oyutnuud) {
			if (o.getOyutniikod().equals(kod)) {
				return o;
			}
		}
		return null;
	}
	public void buhOyutniigharuulah() {
		if(oyutnuud.isEmpty()) {
			System.out.println("Oyutan baihgui baina!");
			return;
		}
		
	for(Oyutan o:oyutnuud) {
		System.out.println(o);
	}
	}
	public void nereerErembeleh() {
		oyutnuud.sort(Comparator.comparing(Oyutan::getNer));
		System.out.println("nereer eremblegdlee!");
	}
}
