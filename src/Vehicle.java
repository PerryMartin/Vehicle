
public class Vehicle {
	
	private String _licensePlateNumber;
	private String _colour;
	private int _numberOfDoors;
	private double _speed = 0;
	private double _maxSpeed;

	public Vehicle(String startPlate, String startColour, int startDoors, int startSpeed, int startMaxSpeed){
		
		this._licensePlateNumber = startPlate;
		this._colour = startColour;
		this._numberOfDoors = startDoors;
		this._speed = startSpeed;
		this._maxSpeed = startMaxSpeed;
		        
		
		
	}
	
	protected void Accelerate(double speedUp){
		
          if(this._speed <= this._maxSpeed - speedUp){
			
			this._maxSpeed += speedUp;
			
		}
		
	}
	
	protected void Brake(double stop){

		
		if(this._speed >= stop){
			
			this._maxSpeed -= stop;
			
		}
		else if(this._speed <= stop){
			
			this._speed = 0;
			
		}	
		
		
		
	}
	
	public void print(){
		
		System.out.println("Speed: " + this._speed);
		System.out.println("Max Speed: " + this._maxSpeed);
		System.out.println("Colour: " + this._colour);
		System.out.println("# of Doors: " + this._numberOfDoors);
		System.out.println("License Plate Number: " + this._licensePlateNumber);
		System.out.println();
	}
}
