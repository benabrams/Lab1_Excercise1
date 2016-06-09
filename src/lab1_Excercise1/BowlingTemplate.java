//package BowlingTemplate;
package lab1_Excercise1;
public class BowlingTemplate {

	private String name;
	private int[][] scores = new int[10][3];
	private int strikes;
	private int spares;
	private int frame;
	private int shot;
	private int gutterBalls;
	private int score;
	//private int p;//added by Ben
	private static final char tempScoreValue = 'N';
	private static final int maxNumFrames = 10;
	private static final int maxNumShots = 3;
	
	public BowlingTemplate(String n){
		name = n;
		for(int i = 0; i < maxNumFrames; i++){
			for(int j = 0; j < maxNumShots; j++){
				scores[i][j] = 0;
			}
		}
		strikes = 0;
		spares = 0;
		gutterBalls = 0;
		score = 0;
		//p = 0;
		frame = 0;
		shot = 0;
	}
	
	public boolean shot(int p){  //return false if the frame is over.//commented parameter out- Ben /*int p*/
		boolean nextShot = true;//change by Ben 6/7/16
		if(p == 10){
			//your code goes here!
			//shot = p;
			shot = 0;
			scores[frame][shot] = p;
			//set a score by looking back 2 scores
			strikes++;
			System.out.println(strikes);
			
			nextShot = false;
			System.out.println(nextShot);
			frame++;
		}
		else if(p < 10){
			//your code goes here!
			if (shot == 1 && frame != 9){
				shot = 0;
				frame++;
			} else if( shot == 1 && frame == 9){
				
			} else{
				shot = 1;
			}
			
			System.out.println(nextShot);
			//for(int i = 0; i < 10; i++){
			/*spares++;*/
			scores[frame][shot] = p;
			score += p;
			//p += p + p;
			
			//p = 10 + p;
			System.out.println("Pins: " + p + "score "+score);
			
			if(p == 0){
				gutterBalls++;
				System.out.println("Gutter Balls " + gutterBalls);
			}
			//gutterBalls++;
			
			
		}
		
		return  nextShot = true;
	}
	public int getFrame(){
		return frame;
	}

	public String toString(){
		return name + "'s game after frame " + frame + ": Strikes " + strikes 
				+ ", Spares " + spares + ", Gutter Balls " + gutterBalls + ", Score " + score;
	}
	
	public void computeScoreFrame(){
		int f = getFrame()-1;
		if(f >=2){ //look two frames back
			//your algorithm for the bonus points goes here.
			
		}
		else if(f == 1){ //look one frame back
			//your algorithm for the bonus points goes here.
			
		}
		else{  //first frame
			score += scores[f][0] + scores[f][1];
			System.out.println(score);
		}
	}
	public int getScore(){
		return score;
	}
}

