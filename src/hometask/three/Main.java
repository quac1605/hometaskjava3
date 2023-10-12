package hometask.three;

import hometask.three.Vehicle.Color;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create Engine Object
		CombustionEngine combustEngine = new CombustionEngine();
		ElectricEngine electricEngine = new ElectricEngine();
		HybridEngine hybridEngine = new HybridEngine();
		
		// Create Manufacture Object
		Manufacture manufacturer1 = new Manufacture("VW");
		Manufacture manufacturer2 = new Manufacture("Tesla");
		Manufacture manufacturer3 = new Manufacture("Audi");
		
		// Create Vehicle Object
		Vehicle Vehicle1 = new ICEV(1, manufacturer1, "Amarok", 2021, Color.BLACK, 20000, 1111, combustEngine);
		Vehicle Vehicle2 = new ICEV(2, manufacturer1,"Amarok",2022, Color.WHITE, 23000, 2222, combustEngine);
		Vehicle Vehicle3 = new HybridV(3, manufacturer1,"Arteon",2021, Color.BLACK, 34000, 3333, hybridEngine);
		Vehicle Vehicle4 = new HybridV(4, manufacturer1,"Caddy",2021, Color.WHITE, 40000, 4444, hybridEngine);
		Vehicle Vehicle5 = new BEV(5, manufacturer2,"EQA",2022, Color.RED, 45000, 5555, electricEngine);
		Vehicle Vehicle6 = new BEV(6, manufacturer2,"EQA",2022, Color.RED, 60000, 6666, electricEngine);
		Vehicle Vehicle7 = new BEV(7, manufacturer2,"EQE SUV",2020, Color.GREEN, 30000, 7777, electricEngine);
		Vehicle Vehicle8 = new ICEV(8, manufacturer3,"A1",2019, Color.BLUE, 44000, 8888, combustEngine);
		Vehicle Vehicle9 = new ICEV(9, manufacturer3,"A1",2019, Color.YELLOW, 22000, 9999, combustEngine);
		Vehicle Vehicle10 = new HybridV(10, manufacturer3,"A3",2019, Color.GRAY, 32000, 1010, hybridEngine);
		Vehicle Vehicle11 = new BEV(11, manufacturer3,"A3",2018, Color.GRAY, 55000, 1234, electricEngine);
		Vehicle Vehicle12 = new BEV(12, manufacturer3,"A4",2017, Color.BROWN, 50000, 4321, electricEngine);
		Vehicle Vehicle13 = new ICEV(13, manufacturer3,"A1",2020, Color.YELLOW, 24000, 9990, combustEngine);
		
		// Create ArrayList
		List<Vehicle> arrList = new ArrayList<Vehicle>();
		arrList.add(Vehicle1);
		arrList.add(Vehicle2);
		arrList.add(Vehicle3);
		arrList.add(Vehicle4);
		arrList.add(Vehicle5);
		arrList.add(Vehicle6);
		arrList.add(Vehicle7);
		arrList.add(Vehicle8);
		arrList.add(Vehicle9);
		arrList.add(Vehicle10);
		arrList.add(Vehicle11);
		arrList.add(Vehicle12);
		arrList.add(Vehicle13);
		
		for (Vehicle i : arrList) {
			i.ShowCharacteristics();
		}
		
	}
}
