package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Datos {
    private XSSFWorkbook workbook;
    private FileInputStream rutaArchivo;

    public String obtenerDatos (String hoja, String ruta, int rowValue, int cellValue ) throws IOException {

        String valor= null;
        rutaArchivo = new FileInputStream(new File(ruta));
        workbook = new XSSFWorkbook(rutaArchivo);
        Sheet sheet = workbook.getSheet(hoja);


        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        valor =cell.getStringCellValue();
        return valor;
    }
}
