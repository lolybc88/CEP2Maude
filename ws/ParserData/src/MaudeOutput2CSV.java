import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaudeOutput2CSV {
	
	public static void main(String[] args) throws IOException {
	
		String filePath = "C:/Users/Atenea/Desktop/maudeOutput2csv/Maude2csv/OutputAccidentsRnd-1.txt";
		String csvPath = "C:/Users/Atenea/Desktop/maudeOutput2csv/Maude2csv/OutputAccidentsRnd-1.csv";
		
		parse(filePath, csvPath);
		System.out.println("Done");
	}

	private static void parse(String filePath, String csvPath) throws FileNotFoundException, IOException {
		InputStream is = new FileInputStream(filePath);
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line.replace("\n", "").replace("\t", "").replace(" ", ""));
			line = buf.readLine();
		}
		String fileAsString = sb.toString();
		
		FileWriter fw = new FileWriter(csvPath);
		BufferedWriter bw = new BufferedWriter(fw);
		
		StringTokenizer st = new StringTokenizer(fileAsString, "<>\n;");
		boolean start = false;
		while (st.hasMoreTokens() && !start){
			String token = st.nextToken();
			if (token.contains("'e:Stream|events:(")){
				start = true;
			}
		}
		if (start){
			boolean end = false;
			while (st.hasMoreTokens() && !end){
				String token = st.nextToken();
				if (token.contains(")")){
					end = true;
				} else {
					String s = parseEvent(token);
					bw.write(s+"\n");
				}
			}
		}
		bw.close();
		fw.close();
	}

	private static String parseEvent(String token) {
		StringTokenizer st = new StringTokenizer(token, "|:,");
		String id = st.nextToken();
		String eventName = st.nextToken();
		String s = id + ";" + eventName + ";";
		while (st.hasMoreTokens()){
			String property = st.nextToken();
			String value = st.nextToken();
			s += property + ";" + value + ";"; 
		}
		return s;
	}

}
