package me.xiaoqing.bigexcel;

/**
 * Created by za-dingxiaoqing on 2017/12/21.
 */
public class ExcelReaderUtil {
    //excel2003扩展名
    public static final String EXCEL03_EXTENSION = ".xls";
    //excel2007扩展名
    public static final String EXCEL07_EXTENSION = ".xlsx";

    /**
     * 读取Excel文件，可能是03也可能是07版本
     * @param reader
     * @param fileName
     * @throws Exception
     */
    public static void readExcel(IRowReaderInterface reader, String fileName) throws Exception {
        // 处理excel2003文件
        if (fileName.endsWith(EXCEL03_EXTENSION)){
//            Excel2003Reader excel03 = new Excel2003Reader();
//            excel03.setRowReader(reader);
//            excel03.process(fileName);
            // 处理excel2007文件
        } else if (fileName.endsWith(EXCEL07_EXTENSION)){
            Excel2007ReaderHandler excel07 = new Excel2007ReaderHandler();
            excel07.setRowReader(reader);
            excel07.process(fileName);
        }
    }
}
