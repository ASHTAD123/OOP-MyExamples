class Electronics {

		String brand;
		String color;
		String usage;
		String category;


		boolean isRecyclable;
		boolean isEnergyEfficient;
		boolean isHighVoltage;
		boolean isSolarPowered;
		boolean withBattery;
		boolean isUnderWarranty;
		boolean isRechargable

		int serialNumber;
		int modelNumber;
		int partNumber;
		int inputVoltage;
		int outputVoltage;
		int warrantyPeriod;
		int maxLifetime;

}
class Radio extends Electronics {

		Electronics radio = new Electronics();
					radio.brand = "Carvaa";
					radio.color = "sky blue";
					radio.usage = "to listen songs";
					radio.catergory = "music";
					radio.isRecyclable="false";
					radio.isEnergyEffiicnt="false";
					radio.isSolarPowered="false";
					radio.withBattery="true";
					radio.isUnderWarranty="true";
					radio.isRechargable="true;

					radio.serialNumber=121332433;
					radio.modelNumber=124592;
					radio.partNumber=101;
					radio.inputVoltage=200;
					radio.outputVoltage=500;
					radio.warrantyPeriod=1;
					radio.maxLifeTime=20;
}
class TV extends Electronics {

		Electronics tv = new Electronics();
					tv.brand = "Sony";
					tv.color = "sky blue";
					tv.usage = "to watch shows";
					tv.catergory = "entertaintment";
					tv.isRecyclable="false";
					tv.isEnergyEfficient="false";
					tv.isSolarPowered="false";
					tv.withBattery="false";
					tv.isUnderWarranty="true";
					tv.isRechargable="false";

					tv.serialNumber=12244651433;
					tv.modelNumber=123532;
					tv.partNumber=134;
					tv.inputVoltage=100;
					tv.outputVoltage=400;
					tv.warrantyPeriod=5;
					tv.maxLifeTime=10;
}