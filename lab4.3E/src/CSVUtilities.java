

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities 
{
	ArrayList<String> CSVData;
	int numColumn;
	public CSVUtilities(File csv) throws IOException
	{
		boolean toggle = true;
		ArrayList<String> no = new ArrayList<String>();
		Path pathToFile = Paths.get(csv.getAbsolutePath());
		BufferedReader buff = Files.newBufferedReader(pathToFile);
		String line = buff.readLine();
		while (line != null) { 
			line = buff.readLine();
			String[] attributes = null;
			if (line != null) {
				attributes = line.split(",");
				if(toggle)
				{
					toggle = ! toggle;
					this.numColumn = attributes.length;
				}
			} 
			if (attributes != null) {
				for (String x : attributes) {
					no.add(x);
				} 
			}
		}
		this.CSVData = no;
	}
	
	public List<String> getColumnHeaders()
	{
		ArrayList<String> no = new ArrayList<String>();
		for(int i = 0; i < numColumn; i++)
		{
			no.add(CSVData.get(i));
		}
		return no;
	}
	
	public List<String> getColumnData(int column)
	{
		ArrayList<String> no = new ArrayList<String>();
		for(int i = column; i < this.CSVData.size(); i = i + numColumn)
		{	String x = CSVData.get(i);
			if(!(x.equals("")))
			{
				no.add(CSVData.get(i));
			}
			else
			{
				no.add("NULL");
			}
		}
		return no;
	}
	
	public List<Integer> getDataInt(int column)
	{
		ArrayList<Integer> no = new ArrayList<Integer>();
		for(int i = column; i < this.CSVData.size(); i = i + numColumn)
		{
			String x =(CSVData.get(i));
			if(!(x.equals("")))
			{
				no.add(Integer.parseInt(x));
			}
			else
			{
				no.add(null);
			}
		}
		return no;
	}
	
	public List<Double> getDataDouble(int column)
	{
		ArrayList<Double> no = new ArrayList<Double>();
		for(int i = column; i < this.CSVData.size(); i = i + numColumn)
		{
			String x =(CSVData.get(i));
			if(!(x.equals("")))
			{
				no.add(Double.parseDouble(x));
			}
			else
			{
				no.add(null);
			}
		}
		return no;
	}

}
