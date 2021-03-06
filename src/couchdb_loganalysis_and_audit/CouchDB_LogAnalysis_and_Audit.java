
package couchdb_loganalysis_and_audit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Hossein Aghahosseini
 */

public class CouchDB_LogAnalysis_and_Audit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        couchLog cl = new couchLog();
        //cl.importFile("C:\\CouchDB\\couch.log");
        //cl.importFileWithDateSelection("C:\\CouchDB\\couch.log","2018-05-10T07:39:24","*");
        //cl.importFileWithDateSelection("C:\\CouchDB\\couch.log","*","2018-05-14T11:58:26");
        cl.importFileWithDateSelection("C:\\CouchDB\\couch.log","2018-05-14T07:26:11","2018-05-14T11:45:18");
        
        cl.showWarningInColor();
        //cl.exportLogToFile("E:\\a.txt");
        //System.out.print(cl.grepLog(-1,5));
        
        //couchLog cl2 = new couchLog(cl.getLogArrayList(-1, 5));
        
        //cl2.showWarningInColor();
        //System.out.print(cl2.grepLog(-1,5));
        
        couchLog cl2 = new couchLog(cl.getLogArrayList(-1, 6));
        cl2.exportLogToFile("E:\\a.txt");
        
        System.out.println("\nAnalyzed That!");
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
        String a = dtf.format(now);
        a = a.replace(' ', 'T');
        System.out.println(a);
        
    }
    
}
