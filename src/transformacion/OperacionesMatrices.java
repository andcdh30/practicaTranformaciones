package transformacion;


/**
 *
 * @author I.S.C.
 */
public class OperacionesMatrices {
    
    public static double[] multiplicacionMatrices(double[] p, double[][] b){
        double[] resultado = new double[3];
        for (int i = 0; i < 3; i++) {
            resultado[i] = 0;
            for (int j = 0; j < 3; j++) {
                resultado[i] += b[i][j] * p[j];
            }
        }
        return resultado;
        
    }
    
    public static double[] traslacion(double x, double y, double tx, double ty) {
        // Matriz de traslación
        double[][] b = {
            {1, 0, tx},
            {0, 1, ty},
            {0, 0, 1}
        };

        // Vector del punto en coordenadas homogéneas
        double[] p = {x, y, 1};

        // Resultado de la multiplicación b * p
        double[] resultado = multiplicacionMatrices(p, b);


        return resultado; // devuelve {x', y', 1}
    }
    
    public static double[] escalamiento(double x, double y, double sx, double sy) {
        // Matriz de escalamiento
        double[][] b = {
            {sx, 0, 0},
            {0, sy, 0},
            {0, 0, 1}
        };

        // Vector del punto en coordenadas homogéneas
        double[] p = {x, y, 1};

        // Resultado de la multiplicación b * p
        double[] resultado = multiplicacionMatrices(p, b);


        return resultado; // devuelve {x', y', 1}
    }
    
    public static double[] rotacion(double x, double y, double theta) {
        // Matriz de rotacion
        double[][] b = {
            {(Math.cos(Math.toRadians(theta))), -1* Math.sin(Math.toRadians(theta)), 0},
            {Math.sin(Math.toRadians(theta)), Math.cos(Math.toRadians(theta)), 0},
            {0, 0, 1}
        };

        // Vector del punto en coordenadas homogéneas
        double[] p = {x, y, 1};

        // Resultado de la multiplicación b * p
        double[] resultado = multiplicacionMatrices(p, b);


        return resultado; // devuelve {x', y', 1}
    }
    
    public static double[] sesgo(double x, double y, double shx, double shy) {
        // Matriz de sesgo
        double[][] b = {
            {1, shx, 0},
            {shy, 1, 0},
            {0, 0, 1}
        };

        // Vector del punto en coordenadas homogéneas
        double[] p = {x, y, 1};

        // Resultado de la multiplicación b * p
        double[] resultado = multiplicacionMatrices(p, b);


        return resultado; // devuelve {x', y', 1}
    }
    
    public static void main(String[] args) {
        System.out.println("transformacion.OperacionesMatrices.main()");
        System.out.println("Traslacion ");
        double[] resultado = traslacion( 2,  3,  3,  2);
        for (int i = 0; i < 3; i++) {
            System.out.println(resultado[i]);
            
        }
        System.out.println("");
        System.out.println("escalamiento ");
        resultado = escalamiento( 2,  3, 2, 0.5);
        for (int i = 0; i < 3; i++) {
            System.out.println(resultado[i]);
            
        }
        System.out.println("");
        System.out.println("Rotacion ");
        resultado = rotacion( 2,  3, 45);
        for (int i = 0; i < 3; i++) {
            System.out.println(resultado[i]);
            
        }
        
        System.out.println("");
        System.out.println("sesgo ");
        resultado = sesgo( 2,  3, 0.5, 0.2);
        for (int i = 0; i < 3; i++) {
            System.out.println(resultado[i]);
            
        }
        
        
    }
    
}
