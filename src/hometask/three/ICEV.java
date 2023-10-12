package hometask.three;

public class ICEV extends Vehicle{

	public ICEV(int id, Manufacture brand, String model, int yearManufacture, Color color, int price,
			int registrationNumber, CombustionEngine engineType) {
		super(id, brand, model, yearManufacture, color, price, registrationNumber, engineType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ShowCharacteristics() {
		System.out.println("Vehicle id " + this.id +" is Internal Combustion Engine Vehicle!!");
	}
}
