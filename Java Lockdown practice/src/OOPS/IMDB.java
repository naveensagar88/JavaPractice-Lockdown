package OOPS;

public class IMDB implements MoviesSection,Top10List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MoviesSection db = new IMDB();
		db.Action();
		db.Drama();db.Horror();
		
		Top10List tp = new IMDB();
		tp.DarkKnight();
		tp.Godfather();
		tp.ShawshankRedemption();
		System.out.println(Top10List.firststRank);
		
		
		
		
		IMDB id = new IMDB();
		
		id.Ratings();
		
		System.out.println(MoviesSection.a+b);
		
		
		
		
		
		
		

	}
	
	public void Ratings()
	{
		
		System.out.println("Top rated movies");
	}
	
	

	@Override
	public void Horror() {
		// TODO Auto-generated method stub
		
		System.out.println("Horror genere list movies");
		
	}

	@Override
	public void Drama() {
		// TODO Auto-generated method stub
		System.out.println("Drama genere list movies");

	}

	@Override
	public void Action() {
		// TODO Auto-generated method stub
		System.out.println("Action genere list movies");

	}

	@Override
	public void ShawshankRedemption() {
		// TODO Auto-generated method stub
		System.out.println("ShawshankRedemption = " + "Rank 1" );
		

	}

	@Override
	public void Godfather() {
		// TODO Auto-generated method stub
		System.out.println("Godfather = " + "Rank 2" );
		
	}

	@Override
	public void DarkKnight() {
		// TODO Auto-generated method stub
		System.out.println("Darkknight = " + "Rank 3" );
		
	}

}
