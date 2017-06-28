create schema Motorbike (
	motorbikeId integer , location string , tirePressure1 double, tirePressure2 double, seated boolean )
	
@Name('BlowOutTire') 
@Priority(1) 				
insert into BlowOutTire
select a2.motorbikeId as motorbikeId,
   a1.location as location_a1,
   a1.tirePressure1 as tirePressure1_a1, 
   a1.tirePressure2 as tirePressure2_a1, 
   a2.location as location_a2, 			    
   a2.tirePressure1 as tirePressure1_a2, 
   a2.tirePressure2 as tirePressure2_a2 
from pattern [
   (every a1 = Motorbike(a1.tirePressure1 >= 2.0) -> 
   		  a2 = Motorbike(a2.tirePressure1 <= 1.2)
   						 where timer:within(5 milliseconds) 
   or
   every a3 = Motorbike(a3.tirePressure2 >= 2.0) -> 
		 a4 = Motorbike(a4.tirePressure2 <= 1.2)
		  where timer:within(5 milliseconds))]