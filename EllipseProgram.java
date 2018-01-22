
/**
 * โปรแกรมคำนวณพื้นที่และเส้นรอบรูปวงรี
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EllipseProgram
{
    // instance variables - replace the example below with your own
    private Ellipse ellipse;
    int  choice;
    int  sMajorAxis, sMinorAxis;

    public static void main(String[] args)
    {
        EllipseProgram program = new EllipseProgram();

        program.start();
    } // end main

    /**
     * Constructor for objects of class TriangleProgram
     */
    public EllipseProgram()
    {

    } // end constructor

    public void start()
    {
        // put your code here
        getInput();
        displayOutput();
    }

    public void getInput()
    {

        String  inputStr;

        inputStr           = JOptionPane.showInputDialog(null,
            "โปรแกรมนี้คำนวณหาพื้นที่ หรือความยาวเส้นรอบรูปวงรี\n"
            + "กด 1 เพื่อคำนวณพื้นที\n"
            + "กด 2 เพื่อคำนวณความยาวเส้นวงรี\n\n");

        choice            = Integer.parseInt(inputStr);

        inputStr  = JOptionPane.showInputDialog(null,
            "ป้อนความยาวกึ่งแกนเอก:");
        sMajorAxis  = Integer.parseInt(inputStr);

        inputStr  = JOptionPane.showInputDialog(null,
            "ป้อนความยาวกึ่งแกนโท:");
        sMinorAxis = Integer.parseInt(inputStr);

        //create a new triangle with the input values
       ellipse = new Ellipse(sMajorAxis, sMinorAxis);

        // echo input
       /* String message;

        message = "ความยาวกึ่งแกนเอก = " + sMinorAxis + " ความยาวกึ่งแกนโท = " + sMinorAxis;
        System.out.println(message);*/

    } // end getInput

    public void displayOutput()
    {
        String sideStr;
        String message;

        sideStr = "ความยาวกึ่งแกนของรูปวงรี" + "\n" 
        + "กึ่งแกนเอก = " + sMajorAxis + ", " 
        + "กึ่งแกนโท = " + sMinorAxis + "\n\n";
        
        DecimalFormat df = new DecimalFormat("0.00");
        switch (choice)
        {
            case 1:

            if (ellipse.getArea() == Ellipse.INVALID_DIMENSION){
                message = sideStr + "ความยาวด้านไม่ถูกต้อง";
            } else {
                message = sideStr + "พื้นที่ = " + df.format(ellipse.getArea());
            }
            break;
            
            case 2:
            if (ellipse.getPerimeter() == Ellipse.INVALID_DIMENSION){
                message = sideStr + "ความยาวด้านไม่ถูกต้อง";
            } else {
                message = sideStr + "พื้นที่ = " + df.format(ellipse.getPerimeter());
            }
            break;
            default:
            message = "ตัวเลือกไม่ถูกต้อง";
        } // end switch
        JOptionPane.showMessageDialog(null, message);
    } // end displayOutput

} // end TriangleProgram
