create schema Motorbike ( motorbikeid integer, location string, tirePreassure1 double, seated boolean )
create schema AirMeasurement ( stationTs long , stationId integer )

@Name( "BlowOutTire" )
@Priority(3)
insert into BlowOutTire
select a1.motorbikeid as motorbikeid, a2.tirePreassure1 as preassure
from pattern [every a1 = Motorbike(a1.tirePreassure1 >= 2.0) ->
					a2 = Motorbike(a2.tirePreassure1 <= 1.2)
			  where timer:within(5 milliseconds)]	
