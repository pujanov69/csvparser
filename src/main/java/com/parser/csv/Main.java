package com.parser.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.parser.csv.dto.Sc2RatesDTO;

public class Main {
	
	public static Sc2RatesDTO s2Dto;

	public static void main(String[] args) throws IOException {
		System.out.println("Hello, from CSV Parser");
		
		
		String documentsPath = System.getProperty("user.home") + "/Documents";
		
		//read the file
		Path documentsDirectory = Paths.get(documentsPath);
		
		String filename = "FeuilleDeCalcul-824423107 00013-2020.csv";
		
		Path csvPath = documentsDirectory.resolve(filename);
		
		System.out.println(csvPath);
		
		CSVParser csvParser = CSVParser.parse(csvPath, Charset.defaultCharset(), CSVFormat.DEFAULT.withHeader("line"));
		
		//Stream<CSVRecord> csvRecordStream = StreamSupport.stream(csvParser.spliterator(), false);
		
		/*List<Map<String, String>> rowList = csvRecordStream
		.skip(1)
		.map(csvRecord -> csvRecord.toMap())
		.collect(Collectors.toList());*/
		
		s2Dto = new Sc2RatesDTO();
		
		csvParser.forEach(csvRecord -> {
			
		//System.out.println(csvRecord.toMap());
		
		//System.out.println(csvRecord);
		
		System.out.println(csvRecord.get(0));
		
		String line = csvRecord.get(0);
		
		
		String[] array1 = line.split(";");
		
		System.out.println("Arrray elem 1--->" + array1[0].toString());
		
		System.out.println("Array-->" + Arrays.toString(array1));
				
		
		int lineNumber = (int) csvRecord.getRecordNumber();
		
		System.out.println("Line Number-->"+lineNumber);
		
		switch(lineNumber) {
		case 4:
			s2Dto.setSiretEntity(array1[0]);
			s2Dto.setRiskCode(array1[2]);
			s2Dto.setPeople1(array1[7]);
			break;
		case 22:
			
			String[] riskValue = array1[0].split(":");
			String rkValue = riskValue[1].substring(1);
			s2Dto.setRiskValue(Integer.parseInt(rkValue));
			break;
		case 24:
			s2Dto.setWagesN4(array1[1]);
			break;
		case 25:
			s2Dto.setWagesN3(array1[1]);
			break;
		case 26:
			s2Dto.setWagesN2(array1[1]);
			break;
		case 29:
			s2Dto.setPeople2(array1[1]);
			break;	
			
		default:
			if(array1 != null) {
				System.out.println("Line with 3rd element");
				 
				if(array1.length > 9) {
				try {	
				int index = array1[8].indexOf(' ');
			     //index = array.IndexOf(' ', index + 1);
				
				String rate = array1[8].substring(0,index);
				s2Dto.setRate(Float.parseFloat(rate));
				s2Dto.setEffectDate(array1[9]);
				s2Dto.setNotificationDate(array1[10]);
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				}
				
			}
			
		}
		
		
		});
		
		
		System.out.println("S2Dtos--->" + s2Dto.toString());
		
		//System.out.println(rowList);
		
		
		
		
		
	}

}
