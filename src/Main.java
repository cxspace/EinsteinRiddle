import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cx on 2016/09/19.
 */
public class Main {

    private static int result[][];

    public static void  main(String args[]){

        Main main = new Main();
        result = DataDao.calculate();
        DataDao.printResult(result);

    }
}
