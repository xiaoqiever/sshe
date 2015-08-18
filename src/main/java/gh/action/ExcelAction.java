package gh.action;

import java.io.File;

import org.hibernate.Session;

import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

public class ExcelAction {
	public void processExcel(String filePath){
		File file = new File(filePath); 
		Workbook book = new Workbook() {
			
			@Override
			protected void parse() throws BiffException, PasswordException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isProtected() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Sheet[] getSheets() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getSheetNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Sheet getSheet(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Sheet getSheet(int arg0) throws IndexOutOfBoundsException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[] getRangeNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getNumberOfSheets() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Cell getCell(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Cell findCellByName(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Range[] findByName(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
		Sheet sheet = book.getSheet(0);
		//Session session = new Session();
		int rows = sheet.getRows();
		for(int i = 0; i < rows; i++){
			int columns = sheet.getColumns();
			for(int j = 0; j < columns; j++) {
				String content = sheet.getCell(j, i).getContents().toString();
			}
		}
	}
}
