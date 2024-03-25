import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("введите номер задания: ");
        int p=in.nextInt();
        switch(p){
            case 1:
                double x=4.0/2.0+Math.pow(3,2);
                System.out.println("x = "+x);
                break;
            case 2:
                System.out.print("введите размерность массива: ");
                int n=in.nextInt();
                int[] mas = new int[n];
                int[] duplicateElements = new int[n];
                int duplicateCount = 0;
                for (int i = 0; i < mas.length; i++) {
                    System.out.print(i + 1 + " = ");
                    mas[i] = in.nextInt();
                }
                for (int i = 0; i < mas.length; i++) {
                    boolean isDuplicate = false;
                    for (int j = i + 1; j < mas.length; j++) {
                        if (mas[i] == mas[j]) {
                            if (isDuplicate) {
                                break;
                            }
                            duplicateElements[duplicateCount++] = mas[i];
                            isDuplicate = true;
                        }
                    }
                }
                for (int i = 0; i < duplicateCount; i++) {
                    System.out.print(duplicateElements[i] + " ");
                }
                break;
            case 3:
                int[][] arr = {
                        {6, 4, 12, 5},
                        {1, 0, 23, -7},
                        {24, -103, 54, 55},
                        {55, -103, 4, 15}
                };
                int max = arr[0][0], min = arr[0][0], IndSumMax = 0, IndSumMin = arr.length + arr[0].length;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                            IndSumMax = i + j;
                        }
                        if (arr[i][j] < min) {
                            min = arr[i][j];
                            IndSumMin = i + j;
                        }
                    }
                }
                System.out.println("Максимальный элемент: " + max);
                System.out.println("Минимальный элемент: " + min);
                System.out.println("Сумма индексов максимального элемента: " + IndSumMax);
                System.out.println("Сумма индексов минимального элемента: " + IndSumMin);
                break;
            case 4:
                System.out.println("Введите номер задания: ");
                int q= in.nextInt();
                switch(q){
                    case 1:
                        System.out.println("Введите число: ");
                        double num= in.nextDouble();
                        System.out.println("Введите делитель: ");
                        double d= in.nextDouble();
                        if(num%d==0) {
                            System.out.println("число "+num+" делится на "+d);
                        }
                        else{
                            System.out.println("число "+num+" не делится на "+d);
                        }
                        break;
                    case 3:
                        System.out.println("Введите число, соответствующее дню недели");
                        int c=in.nextInt();
                        switch(c){
                            case 1:
                                System.out.println("понедельник");
                                 
                            case 2:
                                System.out.println("вторник");
                                break;
                            case 3:
                                System.out.println("среда");
                                break;
                            case 4:
                                System.out.println("четверг");
                                break;
                            case 5:
                                System.out.println("пятница");
                                break;
                            case 6:
                                System.out.println("суббота");
                                break;
                            case 7:
                                System.out.println("воскресенье");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Введите столицу: ");
                        String stolica=in.next();
                        switch (stolica) {
                            case "Минск":
                                System.out.println("Беларусь");
                                break;
                            case "Вашингтон":
                                System.out.println("США");
                                break;
                            case "Варшава":
                                System.out.println("Польша");
                                break;
                            case "Париж":
                                System.out.println("Франция");
                                break;
                            case "Прага":
                                System.out.println("Чехия");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("введите число: ");
                        int nech= in.nextInt();
                        int e=1;
                        int sum=0;
                        while(e<=nech){
                            if(e%2!=0){
                                sum+=e;
                            }
                            e++;
                        }
                        System.out.println("Сумма = "+sum);
                        break;
                    case 6:
                        System.out.println("введите число: ");
                        int ch= in.nextInt();
                        int proizv=1;
                        int m=1;
                        while (m<=ch){
                            if(m%2==0){
                                proizv*=m;
                            }
                            m++;
                        }
                        System.out.println("Произведение = "+proizv);
                        break;
                }
                break;
            case 5:
                int s=11,f=51;
                do{
                    System.out.print(s+" ");
                    s++;
                }while(s<=f);
                break;
        }
    }
}
