package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc  implements Playable{
	
//	private String director;
//	private int length;
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title) {
		super(nbDigitalVideoDiscs++,title);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(nbDigitalVideoDiscs++,title,category,cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(nbDigitalVideoDiscs++,title,category,cost,director);
		
	}
	
	public DigitalVideoDisc(String title, String category, String director,int length, float cost) {
		super(nbDigitalVideoDiscs++,title,category,cost,director,length);
		
	}
	
	@Override
	public String toString() {
		return "DVD - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());		
	}
	
	


}
