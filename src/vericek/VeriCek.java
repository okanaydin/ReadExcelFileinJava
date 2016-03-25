
package vericek;
/**
 *
 * @author okanaydin
 */

import java.io.File;
import jxl.Workbook;
import jxl.Sheet;
        
        
        
public class VeriCek {

    private Workbook excelWorkbook;
    private Sheet excelSheet;
    
    VeriCek(String FilePath) throws Exception{
        File excelFile= new File(FilePath);
        excelWorkbook = Workbook.getWorkbook(excelFile);
        excelSheet = excelWorkbook.getSheet(0);
    }
    
    public String getString(int x, int y) throws Exception{
        try {
            return excelSheet.getCell(x,y).getContents();
            
        }catch (Exception ex){
            throw new Exception("Veri Okuma Hatası");
        }
    }
    
    
    public static void main(String[] args) throws Exception {

            VeriCek tempExcel;
            tempExcel = new VeriCek("/Users/okanaydin/Desktop/okan.xls");
        
            for (int i = 0; i < tempExcel.excelSheet.getRows(); i++) {
                for (int j = 0; j < tempExcel.excelSheet.getColumns(); j++) {
                    System.out.print(tempExcel.getString(j, i)+ " ");                  
                }
                System.out.println(" ");
            
        }
        
    }
    
}
