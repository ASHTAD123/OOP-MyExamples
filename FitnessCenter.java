class FitnessCenter {
	
		String name;
		String type;
		String location;
		String manager;
		String timeSlot;
		
		int seatingCapacity;		
}

class GymPoint extends FitnessCenter {

		FitnessCenter fc = new FitnessCenter();
					  fc.name = "Gym Point";
					  fc.type = "Gymnasium";
					  fc.location = "Vasai";
					  fc.manager="Ketan";
					  fc.timeslot="7am to 9pm";
					  fc.seatingCapacity = 20;					  
}
class NextGenFitness extends FitnessCenter {

		FitnessCenter fc = new FitnessCenter();
					  fc.name = "NextGenFitness";
					  fc.type = "Gymnasium";
					  fc.location = "Vasai";
					  fc.manager="Ram";
					  fc.timeslot="7am to 9pm";
					  fc.seatingCapacity = 30;					  
}
class shreeYogaCenter extends FitnessCenter {

		FitnessCenter fc = new FitnessCenter();
					  fc.name = "shreeYogaCenter";
					  fc.type = "yogaCenter";
					  fc.location = "Naigoan";
					  fc.manager="Ashok";
					  fc.timeslot="7am to 4pm";
					  fc.seatingCapacity = 50;					  
}
