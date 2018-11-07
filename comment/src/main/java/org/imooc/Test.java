package org.imooc;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test {

    public static void main(String[] args) throws Exception {
     /*   //1.创建一个工作簿
        Workbook wb=new HSSFWorkbook();
        //2.创建一个工作表sheet
        Sheet sheet=wb.createSheet();
        //3.创建一个行对象
        Row nRow=sheet.createRow(4); //从0开始
        //4、创建一个单元格对象，指定列
        Cell nCell=nRow.createCell(4);
        //5、设置内容
        nCell.setCellValue("尚硅谷");
        //6.保存
        OutputStream stream=new FileOutputStream(new File("D:\\test1.xls"));
        wb.write(stream);
        //7.关闭
        stream.close();*/

        //1.创建一个工作簿
        Workbook wb=new HSSFWorkbook();
        //2.创建一个工作表sheet
        Sheet  sheet=wb.createSheet();
        //3.创建一个行对象
        Row  nRow=sheet.createRow(4); //从0开始
        //4、创建一个单元格对象，指定列
        Cell nCell=nRow.createCell(4);
        //5、设置内容
        nCell.setCellValue("尚硅谷");


        CellStyle titleStyle=wb.createCellStyle();
        Font font = wb.createFont();
        font.setFontName("微软雅黑");  //设置字体类型
        font.setFontHeightInPoints((short) 26);  //设置字体大小
        titleStyle.setFont(font);

        nCell.setCellStyle(titleStyle);
        //6.保存
        OutputStream stream=new FileOutputStream(new File("D:\\test2.xls"));
        wb.write(stream);
        //7.关闭
        stream.close();

    }
}
