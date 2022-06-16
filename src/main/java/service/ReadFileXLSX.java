package service;

import com.gather_students.homwork.model.Student;
import com.gather_students.homwork.reponsitories.StudentReponsitory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileXLSX {
    @Autowired
    private StudentReponsitory studentReponsitory;
    String getCellValue(Row row, int index) {
        //kieu Integer --> Excel hieu la Double
        return new DataFormatter().formatCellValue(row.getCell(index));
    }

    public List<Student> importDataFromExcel(MultipartFile files) throws IOException {
        List<Student> students = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        // Read student data form excel file sheet1.
        XSSFSheet worksheet = workbook.getSheetAt(0);
        for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
            XSSFRow row = worksheet.getRow(i);
            Student student = new Student(Integer.parseInt(getCellValue(row, 0)),
                    getCellValue(row, 1),getCellValue(row, 2),getCellValue(row, 3),
                    getCellValue(row, 4),getCellValue(row, 5),Integer.parseInt(getCellValue(row, 6)),
                    Integer.parseInt(getCellValue(row, 7)),Integer.parseInt(getCellValue(row, 8)),
                    getCellValue(row, 9),getCellValue(row, 10),getCellValue(row, 11),
                    getCellValue(row, 12),getCellValue(row, 13),Integer.parseInt(getCellValue(row, 14)),
                    Integer.parseInt(getCellValue(row, 15)),Integer.parseInt(getCellValue(row, 16)),
                    Integer.parseInt(getCellValue(row, 17)),Integer.parseInt(getCellValue(row, 18)),
                    Integer.parseInt(getCellValue(row, 19)),Integer.parseInt(getCellValue(row, 20)),
                    getCellValue(row, 22)
            );
                students.add(student);
            }
        studentReponsitory.saveAll(students);
        return students;
    }
}

