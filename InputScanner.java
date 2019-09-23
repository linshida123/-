public class InputScanner{
	public static void main (String[] args){
		
		final String youngsister = "YOINGER";
		final String oldsister = "OLDER";
		final String sister = "SECRET";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the age of your sister:");
		int age = scan.nextInt();
		
		String nickname = sister;
		
		int check = age/18;//算法
		
		//0-18 18-35 35-
		
		switch(check ){
			case youngsister;
			System.out.println("you are young");
			break;
		
		case oldsister;
		     System.out.println("you are old");
			 break;
			 
		case sister;
		     System.out.println("it is a secret");
			 break;	 
		
		default:
		     System.out.println("Please try again");
		}	 
	}	