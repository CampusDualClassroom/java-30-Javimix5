package com.campusdual.classroom;

public class Exercise30 {
    public static double divisionWithCustomException(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("No se puede dividir por cero");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Intentando dividir 10 entre 0...");
            double result = divisionWithCustomException(10, 0);
            System.out.println("Resultado: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Error controlado: " + e.getMessage());
            // Aquí puedes manejar el error de forma apropiada
        }
    }
}