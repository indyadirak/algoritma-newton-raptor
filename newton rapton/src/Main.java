

import java.util.Scanner;

class proses
{
    Scanner input = new Scanner(System.in);
    public void inputan_nilai_fx()
    {
        System.out.println("masukkan nilai f(x) = Ax^B + Cx^D + Ex + F ");
        System.out.print("masukkan nilai A = ");
         double A = input.nextDouble();
        System.out.print("masukkan nilai B = ");
         double B = input.nextDouble();
        System.out.print("masukkan nilai C = ");
         double C = input.nextDouble();
        System.out.print("masukkan nilai D = ");
         double D = input.nextDouble();
        System.out.print("masukkan nilai E = ");
        double E = input.nextDouble();
        System.out.print("masukkan nilai F = ");
        double F = input.nextDouble();
        proses_turunan_tanpa_inputan_x(A,B,C,D,E,F);

    }

    public void proses_turunan_tanpa_inputan_x(double A, double B, double C, double D, double E, double F)
    {
        double proses_turunan_pertama_nilai_A = A * B;
        double proses_turunan_pertama_nilai_B = B - 1;
        double proses_turunan_pertama_nilai_C = C * D;
        double proses_turunan_pertama_nilai_D = D - 1;
        double proses_turunan_kedua_nilai_A   = proses_turunan_pertama_nilai_A * proses_turunan_pertama_nilai_B;
        double proses_turunan_kedua_nilai_B   = proses_turunan_pertama_nilai_B - 1;
        double proses_turunan_kedua_nilai_C   = proses_turunan_pertama_nilai_C * proses_turunan_pertama_nilai_D;
        double proses_turunan_kedua_nilai_D   = proses_turunan_pertama_nilai_D - 1;

        System.out.println(" ");
        System.out.println("proses turunan tanpa inputan : ");
        System.out.println("f(x)    = " + A + "x^" + B + " + " + C + "x^" + D + " + " + E + "x" + " + " + F );
        System.out.println("f'(x)   = " + proses_turunan_pertama_nilai_A + "x^" + proses_turunan_pertama_nilai_B + " + " + proses_turunan_pertama_nilai_C + "x^" + proses_turunan_pertama_nilai_D + " + " + E );
        System.out.println("f''(x)  = " + proses_turunan_kedua_nilai_A + "x^" + proses_turunan_kedua_nilai_B + " + " + proses_turunan_kedua_nilai_C + "x^" + proses_turunan_kedua_nilai_D);
        proses_turunan_dengan_inputan_x(A,B,C,D,E,F);
    }

    public void proses_turunan_dengan_inputan_x(double A, double B, double C, double D, double E, double F)
    {
        double proses_fx_B = 1, proses_fx_D = 1,proses_turunan_pertama_fx_B = 1, proses_turunan_pertama_fx_D = 1,proses_turunan_kedua_fx_B = 1, proses_turunan_kedua_fx_D = 1;

        System.out.println(" ");
        System.out.print("masukkan nilai x = ");
        double nilai_x = input.nextDouble();

        for (int perulangan = 0; perulangan < B ; perulangan++)
        {
            proses_fx_B = proses_fx_B * nilai_x;
        }

        for (int perulangan = 0; perulangan < D ; perulangan++)
        {
            proses_fx_D = proses_fx_D * nilai_x;
        }
        for (int perulangan = 0; perulangan < B-1 ; perulangan++)
        {
            proses_turunan_pertama_fx_B = proses_turunan_pertama_fx_B * nilai_x;
        }

        for (int perulangan = 0; perulangan < D-1 ; perulangan++)
        {
            proses_turunan_pertama_fx_D = proses_turunan_pertama_fx_D * nilai_x;
        }
        for (int perulangan = 0; perulangan < B-2 ; perulangan++)
        {
            proses_turunan_kedua_fx_B = proses_turunan_kedua_fx_B * nilai_x;
        }

        for (int perulangan = 0; perulangan < D-2 ; perulangan++)
        {
            proses_turunan_kedua_fx_D = proses_turunan_kedua_fx_D * nilai_x;
        }

        double proses_turunan_pertama_fx_A = A * B;
        double proses_turunan_pertama_fx_C = C * D;
        double proses_turunan_kedua_fx_A   = proses_turunan_pertama_fx_A * (B - 1);
        double proses_turunan_kedua_fx_C   = proses_turunan_pertama_fx_C * (D - 1);
        double proses_fx                   = (A * proses_fx_B ) + (C * proses_fx_D) + (E * nilai_x) + F;
        double proses_turunan_pertama_fx   = (proses_turunan_pertama_fx_A * proses_turunan_pertama_fx_B) + (proses_turunan_pertama_fx_C * proses_turunan_pertama_fx_D) + E;
        double proses_turunan_kedua_fx     = (proses_turunan_kedua_fx_A * proses_turunan_kedua_fx_B) + (proses_turunan_kedua_fx_C* proses_turunan_kedua_fx_D);

        System.out.println("nilai x = " + nilai_x);
        System.out.println("f(x)    = " + proses_fx );
        System.out.println("f'(x)   = " + proses_turunan_pertama_fx);
        System.out.println("f''(x)  = " + proses_turunan_kedua_fx);
    }
}
public class Main {
    public static void main(String[] args)
    {
        new proses().inputan_nilai_fx();
    }

}