package za.ac.mandela.wrpv301.wrpv301;

public class Main {
    public static void main(String[] args) {
        Polynomial zero = new Polynomial( 0, 0 );

        Polynomial p1 = new Polynomial( 1, 3 );
        Polynomial p2 = new Polynomial( 2, 2 );
        Polynomial p3 = new Polynomial( 4, 0 );
        Polynomial p4 = new Polynomial( 0, 1 );
        Polynomial p = p1.plus( p2 ).plus( p3 ).plus( p4 );   // 4x^3 + 3x^2 + 1

        Polynomial q1 = new Polynomial( 1, 1 );
        Polynomial q2 = new Polynomial( 3, 0 );
        Polynomial q = q1.plus( q2 );                     // 3x^2 + 5


        Polynomial r = p.plus( q );
        Polynomial s = p.times( q );
        Polynomial t = p.compose( q );

        System.out.println( "zero(x) =     " + zero );
        System.out.println( "p(x) =        " + p );
        System.out.println( "q(x) =        " + q );
        System.out.println( "p(x) + q(x) = " + r );
        System.out.println( "p(x) * q(x) = " + s );
        System.out.println( "p(q(x))     = " + t );
        System.out.println( "0 - p(x)    = " + zero.minus( p ) );
        System.out.println( "p(3)        = " + p.evaluate( 3 ) );
        System.out.println( "p'(x)       = " + p.differentiate() );
        System.out.println( "p''(x)      = " + p.differentiate().differentiate() );

        p.divides( q );
    }
}
