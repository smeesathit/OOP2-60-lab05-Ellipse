
/**
 * คลาสของรูปวงรี
 */
public class Ellipse
{
    // class variable
    public static final double PI = 3.1416;
    public static final int INVALID_DIMENSION = -1;

    // instance variables - for the three sides
    private int sMajorAxis; // semi-major axis
    private int sMinorAxis; // semi-minor axis

    /**
     * Constructor for objects of class Triangle
     */
    public Ellipse(int radius1, int radius2)
    {
        // initialise instance variables
        setSMajorAxis(radius1);
        setSMinorAxis(radius2);
    } // end constructor

    /**
     * set methods
     */
    public void setSMajorAxis(int radius)
    {
        if (radius > 0)
        {
            sMajorAxis = radius;
        }    else
        {
            sMajorAxis = INVALID_DIMENSION;
        }
    }

    public void setSMinorAxis(int radius)
    {
        if (radius > 0)
        {
            sMinorAxis = radius;
        }    else
        {
            sMinorAxis = INVALID_DIMENSION;
        }

    }

    // get methods
    public int getSMajorAxis()
    {
        return sMajorAxis;
    }

    public int setSMinorAxis()
    {
        return sMinorAxis;
    }

    // compute area and return result
    public double getArea()
    {

        double result = INVALID_DIMENSION;

        if (isValid()) {
            result = PI * sMajorAxis * sMinorAxis;
        }
        return result;
    }

    // compute perimeter and return result
    public double getPerimeter()
    {
        double result = INVALID_DIMENSION;

        if (isValid()) {
            result = 2 * PI * Math.sqrt((Math.pow(sMajorAxis, 2) + Math.pow(sMinorAxis, 2)) / 2.0);
        }
        return result;
    }

    private boolean isValid()
    {
        boolean flag = false;
        if (sMajorAxis != INVALID_DIMENSION && sMinorAxis != INVALID_DIMENSION)
        {flag = true;}
        return flag;
    }

} // end Ellipse

