import java.util.Scanner;

class proses
{
    float  nilai_x2,nilai_fx_1, nilai_fx_2, nilai_fx_3, nilai_fx_4, nilai_x,  proses_fx, proses_fx_turunan_1, proses_fx_turunan_2, jumlah_batas_literasi, nilai_E,proses_fx2;
    Scanner input = new Scanner(System.in);
    public void inputan_nilai_fx()
    {
        System.out.println("masukkan nilai f(x): ");
        System.out.print("nilai 1 (x^3)       = ");
         nilai_fx_1 = input.nextFloat();
        System.out.print("nilai 2 (x^2)       = ");
         nilai_fx_2 = input.nextFloat();
        System.out.print("nilai 3 (x)         = ");
         nilai_fx_3 = input.nextFloat();
        System.out.print("nilai 4 (bil bulat) = ");
         nilai_fx_4 = input.nextFloat();
        proses_turunan();
    }

    public void proses_turunan()
    {
        System.out.println();
        System.out.println("turunan");
        System.out.println("f(x)   = "+nilai_fx_1+"x^3 + "+nilai_fx_2+"x^2 + "+ nilai_fx_3 +"x + "+nilai_fx_4);
        System.out.println("f'(x)  = "+nilai_fx_1*nilai_fx_1+"x^2 + "+nilai_fx_2*nilai_fx_2+"x + "+ nilai_fx_3);
        System.out.println("f''(x) = "+nilai_fx_1*nilai_fx_1*nilai_fx_1+"x + "+nilai_fx_2*nilai_fx_2);
        input_nilai_x();
    }

    public void input_nilai_x()
    {
        System.out.println();
        System.out.print("masukkan nilai x = ");
        nilai_x = input.nextFloat();
        proses_turunan_dengan_nilai_x();
    }

    public void proses_turunan_dengan_nilai_x()
    {
        System.out.println();
        proses_fx = ((nilai_fx_1*(nilai_x*nilai_x*nilai_x))+(nilai_fx_2*(nilai_x*nilai_x))+(nilai_fx_3*nilai_x)+nilai_fx_4);
        proses_fx_turunan_1 = (((nilai_fx_1*nilai_fx_1)*(nilai_x*nilai_x))+((nilai_fx_2*nilai_fx_2)*nilai_x)+nilai_fx_3);
        proses_fx_turunan_2 = (nilai_fx_1*nilai_fx_1*nilai_fx_1)*nilai_x+nilai_fx_2*nilai_fx_2;
        System.out.println("turunan dengan nilai x = " + nilai_x);
        System.out.println("f(x)   = "+ proses_fx );
        System.out.println("f'(x)  = "+ proses_fx_turunan_1);
        System.out.println("f''(x) = "+ proses_fx_turunan_2);
        cek_syarat();
    }

    public void cek_syarat()
    {
        System.out.println();
        System.out.println("nilai syarat = "+(proses_fx*proses_fx_turunan_2/proses_fx_turunan_2*proses_fx_turunan_1) + " < 0");
        boolean syarat = (proses_fx*proses_fx_turunan_2/proses_fx_turunan_2*proses_fx_turunan_1)<0;

        if (syarat == true)
        {
            System.out.println("status syarat = memenuhi syarat < 0");
            input_literasi();
        }
        else
        {
            System.out.println("status syarat = tidak memenuhi syarat < 0");
            input_nilai_x();

        }
    }

    public void input_literasi()
    {
        System.out.println("");
        System.out.print("masukkan maksimal literasi = ");
        jumlah_batas_literasi = input.nextFloat();
        proses_iterasi_1();
    }

    public void  proses_iterasi_1()
    {
        nilai_x2 = nilai_x - proses_fx/proses_fx_turunan_1;
        proses_fx2 = ((nilai_fx_1*(nilai_x2*nilai_x2*nilai_x2))+(nilai_fx_2*(nilai_x2*nilai_x2))+(nilai_fx_3*nilai_x2)+nilai_fx_4);
        nilai_E = nilai_x - proses_fx2;
        proses_fx =  nilai_E;
        System.out.println();
        System.out.println("iterasi 1");
        System.out.println("x2              = "+ nilai_x2);
        System.out.println("f("+nilai_x2+") = "+proses_fx2);
        System.out.println("E               = " + (nilai_x - proses_fx2));
        nilai_x = nilai_x2;
        proses_fx = (nilai_x - proses_fx2);
        proses_iterasi_lebih_dari_1();
    }

    public void proses_iterasi_lebih_dari_1()
    {
        for (int perulangan = 2; perulangan <= jumlah_batas_literasi; perulangan++)
        {
            proses_fx_turunan_1 = (((nilai_fx_1*nilai_fx_1)*(nilai_x*nilai_x))+((nilai_fx_2*nilai_fx_2)*nilai_x)+nilai_fx_3);
            nilai_x2 = nilai_x - proses_fx/proses_fx_turunan_1;
            proses_fx2 = ((nilai_fx_1*(nilai_x2*nilai_x2*nilai_x2))+(nilai_fx_2*(nilai_x2*nilai_x2))+(nilai_fx_3*nilai_x2)+nilai_fx_4);
            nilai_E = nilai_x - proses_fx2;
            proses_fx =  nilai_E;
            System.out.println("");
            System.out.println("iterasi ke-"+perulangan);
            System.out.println("x1              = " + nilai_x );
            System.out.println("f(x1)           = " + proses_fx);
            System.out.println("f'(x1)          = "+ proses_fx_turunan_1);
            System.out.println("x2              = "+ nilai_x2);
            System.out.println("f("+nilai_x2+") = "+proses_fx2);
            System.out.println("E               = " + (nilai_x - proses_fx2));
            nilai_x = nilai_x;2;
            proses_fx = (nilai_x - proses_fx2)

        }

    }

}
public class Main {
    public static void main(String[] args)
    {
        new proses().inputan_nilai_fx();
    }

}