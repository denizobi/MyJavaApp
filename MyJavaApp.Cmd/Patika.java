public class Patika {
    static void number(int x, int z) {
        int y = 2;
        x = x * y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int y = 3;
        int z = 2;
        if (y != z) {
            int x = 20;
        }
        int x = 50;
        number(x, z);

        int[] numbers = {35,65,95};
        System.out.print(numbers.length + "," + numbers[1]);

        boolean a = true, b = false;
        System.out.println((a && b) || (a || b));

        byte bb = 0; int aa = bb++;
        System.out.print(aa);

        show(); yirmi(); yirmiuc(); recursiveMethod(4); basamaklarToplami(45612);

        float tt, xx;
        tt = 35 + 5;
        xx = tt / 4;
        System.out.println(xx);
    }

    static void show()
    {
        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        }
    }

    static void yirmi() {
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i)
        for (int j = 0; j < i + 1; ++j)
        arr[i][j] = j + 1;
        for (int i = 0; i < 3; ++i)
        for (int j = 0; j < i + 1; ++j)
        sum += arr[i][j];
        System.out.print(sum);
    }

    static void yirmiuc() {
        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
    }

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }
    static int basamaklarToplami(int sayi) {
        if (sayi == 0) {
            return 0;
        } else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }
}
