import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CepInput2Maude {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		parse("files/dec2016-apr2017-AirMeasurement.csv", "files/dec2016-apr2017-AirMeasurement.maude");
	}
	
	/**
	 * 
	 *
stationTs;	stationId;	pm2_5;	pm10;	o3;	no2;	so2;	co

1480546800;	1;	-1;	-1;	0.043210283;	3.0399408;	2.927161;	0.3781152
1480547400;	1;	-1;	-1;	0.04293522;	2.7742116;	2.8164861;	0.38158932




< S : Stream | events : (

  < N + 1 : AirMeasurement | ts : 10, stationId : 1, pm25 : -1.0, pm10 : -1.0, o3 : -10.043210283, no2 : 3.0399408, so2 : 2.927161, co : 0.3781152 > ; 
  < N + 2 : AirMeasurement | ts : 20, stationId : 1, pm25 : -1.0, pm10 : -1.0, o3 : 0.04293522, no2 : 2.7742116, so2 : 2.8164861, co : 0.38158932 > ;

	 * 
	 */
	
	private static void parse(String filePath, String csvPath) throws FileNotFoundException, IOException {
		
		InputStream is = new FileInputStream(filePath);
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		
		FileWriter fw = new FileWriter(csvPath);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("< S : Stream | events : (\n");
		
		String line = buf.readLine(); // ignore the first line
		line = buf.readLine();
		
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, ";");
			String outline = "< N + 1 : AirMeasurement | ts : "+fixTime(st.nextToken())+", stationId : "+st.nextToken()+", pm25 : "+st.nextToken()+", pm10 : "+st.nextToken()+", o3 : "+st.nextToken()+", no2 : "+st.nextToken()+", so2 : "+st.nextToken()+", co : "+st.nextToken()+" > ;";
			bw.write(outline+"\n");
			line = buf.readLine();
		}
		
		bw.write(" nil ) >");
		bw.close();
		fw.close();
	}

	private static String fixTime(String t) {
		Integer time = (Integer.parseInt(t) - 1480546800 ) / 60;
		return time.toString();
	}

}
