  
//
//  TestPoly.java
//  


public class TestPoly {

    public static void main (String[] args) {
        Poly p = new Poly();
        p.displayPoly();
        
        Poly q = new Poly(2);
        q.displayPoly();
        
        double[] a = {1, 2, 3};
        Poly r = new Poly(a);
        r.displayPoly();
        
        try{
            q.getCoefficient(2);                
            q.setCoefficient(2, 5);
        } catch(Exception e) {
            System.out.println(e);
        }

        try{
            q.getCoefficient(4);
        } catch(Exception e) {
                    System.out.println(e);
                }

        q.displayPoly();
        r.displayPoly();
                
        p = q.add(r);
        p.displayPoly();
        
        q = new Poly(new double[]{ 4 ,5 ,3 ,2 }); 
        r = new Poly( new double[]{ 3, 1, 4}); 
        
       
        try {
        p = q.multiply(r); 
        p.displayPoly(); 
}catch (Exception e){ System.out.println(e); } 
    try {
        p = p.derivative(); 
        p.displayPoly(); 
}catch (Exception e){ System.out.println(e); } 
    }
}