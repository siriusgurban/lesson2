public class whyclass {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int z=5;
        switch (z){
            case 1:
                System.out.println("1");
                break;
            case 5:
                System.out.println("5");
                break;
            case 12:
                System.out.println("12");
                break;
        }

int money = 50_000;

    }

    public static void same(String[] args) {
        for(int i=10; i<20; i++){
            System.out.println(Math.round(i));

        }


    }

    public static void hgvymain(String args[])
    {

        int i, j, k, space=10;

        for(i=0; i<10; i++)
        {
            for(k=0; k<space; k++)
            {
                System.out.print(" ");
            }

            for(j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();

            space--;
        }

    }


    public static void msain(String[] args) {


        int[][][] c = new int[0][0][0];
        
        System.out.println(c.length);
        int[][] d = c[0];

        for(int i=1; i<c.length; i++){
            for (int j=0; j<c[j].length; j++){
                for (int k=0; k<c[i][j].length; k++){
                    System.out.printf("%3d", c[i][j][k]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");

        }



    }

    public static void dwqdmain(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
    }

    //ascii






}


