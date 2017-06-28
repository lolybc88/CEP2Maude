create schema AirMeasurement (
	no2 integer, stationId string)

@Name('NO2_Avg')
@Priority(1) 
insert into NO2_Avg 
select a1.stationId as stationId 
from pattern [every a1 = AirMeasurement(no2 <> -1)].win:time(3600000 milliseconds) 