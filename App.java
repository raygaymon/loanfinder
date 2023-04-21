package sg.edu.nus.iss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //create instance of thread program
        ThreadExample tde = new ThreadExample("testing");

        //CREATE threat object and put thread program as parameter
        Thread t = new Thread(tde);

        t.start();
        
        //another way to run threads
        //.newFixedThreadPool creates a collection of threads
        // ExecutorService executor = Executors.newFixedThreadPool(1);
        // executor.execute(t);

        Bank posb = new Bank(4);
        Bank china = new Bank (7);
        Bank dbs = new DBSBank(4);

        posb.findLoan(590000,7);
        china.findLoan(590000,7);
        posb.findLoan(890000,7);
        china.findLoan(890000,7);
        posb.findLoan(1245000,9);
        china.findLoan(1245000,9);
        dbs.findLoan(590000,7);
        dbs.findLoan(1245000,100);
        dbs.findLoan(845000,78);
        dbs.findLoan(8450,3);
    }
}
