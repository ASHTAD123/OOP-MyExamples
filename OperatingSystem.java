interface OperatingSystem {

	 void powerOnMechanism();
	 void powerOffMechanism();
	 void bootingMechanism();
	 void loginMechanism();
	 void startingMechanism();
}
class windows implements OperatingSystem {

		void powerOnMechanism(){
			System.out.println(" Power on windows ");
		}
		void powerOffMechanism(){
			System.out.println(" Power off windows ");
		}
		void bootingMechanism(){
			System.out.println(" Booting windows ");
		}
		
		void loginMechanism(){
			System.out.println(" Login mechanism windows ");
		}
		
		void startingMechanism(){
			System.out.println(" starting mechanism windows ");
		}
}

class apple implements OperatingSystem {

		void powerOnMechanism(){
			System.out.println(" Power on apple ");
		}
		void powerOffMechanism(){
			System.out.println(" Power off apple ");
		}
		void bootingMechanism(){
			System.out.println(" Booting apple ");
		} 
		
		void loginMechanism(){
			System.out.println(" Login mechanism apple ");
		}
		
		void startingMechanism(){
			System.out.println(" starting mechanism apple ");
		}
}
