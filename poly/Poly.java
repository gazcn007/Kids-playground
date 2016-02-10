 
public class Poly {

    double[] coefficients;


    public Poly() {
        coefficients = new double[1];
        coefficients[0] = 0;
    }
    
    public Poly(int degree) {
        coefficients = new double[degree+1];
        for (int i = 0; i <= degree; i++)
            coefficients[i] = 0;
    }
    
    
    public Poly(double[] a) {
        coefficients = new double[a.length];
        for (int i = 0; i < a.length; i++)
            coefficients[i] = a[i];
    }
    
    public int getDegree() {
        return coefficients.length-1;
    }
    
    public double getCoefficient(int i) throws Exception{
        if (i >= coefficients.length)
        throw new Exception("Bad Poly");
        return coefficients[i];
    }
    
    
    
    public void setCoefficient(int i, double value) {
        coefficients[i] = value;
    }
    
    public Poly add(Poly p) {
        int n = getDegree();
        int m = p.getDegree();
        Poly result = new Poly(Poly.max(n, m));
        int i;

        try{
            for (i = 0; i <= Poly.min(n, m); i++) 
                result.setCoefficient(i, coefficients[i] + p.getCoefficient(i));
            if (i <= n) {
                //we have to copy the remaining coefficients from this object
                for ( ; i <= n; i++) 
                    result.setCoefficient(i, coefficients[i]);
            } else {
                // we have to copy the remaining coefficients from p
                for ( ; i <= m; i++) 
                    result.setCoefficient(i, p.getCoefficient(i));
            }
        } catch (Exception e) {
       }
        return result;
    }
    
    
    public Poly multiply(Poly p) throws Exception{
        if (p == null)
        throw new Exception("Bad Poly");
        int length=coefficients.length+p.coefficients.length-1;
        double [] newCoefficient = new double [length];
        for (int i=0; i<coefficients.length;i++)
        {
            for (int j=0;j<p.coefficients.length;j++)
                {
                    newCoefficient[i+j]=newCoefficient[i+j]+coefficients[i]*p.coefficients[j];
                } 
        }
        return new Poly(newCoefficient);
        
    }
    
    public Poly multiplyByConstant (double x) throws Exception
    {
       double [] constant = new double[1];
       return multiply(new Poly(constant));       
    }
    
    public void cleanZeroes() throws Exception
    {
        if(coefficients[coefficients.length -1] != 0) return; 
        
        
        int count=0;
        for (int i=coefficients.length-1;i>=0 && coefficients[i] == 0;i--)
        {
            count++;
        }
        
        double []copy = new double[coefficients.length - count]; 
        for(int i = 0; i< copy.length; ++i){
            copy[i] = coefficients[i]; 
        }
        coefficients = copy; 
    }
    
    public Poly derivative ()
    {
        double [] array=new double [coefficients.length-1];
        for (int i=0;i<array.length;i++)
        {
            array[i]=coefficients[i+1]*(i+1);
        }
        return new Poly(array);
    }
    
    public void displayPoly () {
        for (int i=0; i < coefficients.length; i++)
            System.out.print(" "+coefficients[i]+"*X^"+i);
        System.out.println();
    }
    
    private static int max (int n, int m) {
        if (n > m)
            return n;
        return m;
    }
        
    private static int min (int n, int m) {
        if (n > m)
            return m;
        return n;
    }

    
}
