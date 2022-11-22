// Задание №2

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

package Seminar1;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = { 1, 1, 0, 1, 1, 1 }; //исходный массив
        
        int maxcount = 0;               
        int count = 0;
        for (int a : mas) {
            if (a == 1)
                count++;
            else
                count = 0;
            if (count > maxcount)
                maxcount = count;
        }
        
        System.out.printf("максимальное количество подряд идущих 1: %d", maxcount);

    }
}

// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] == 1) {
//         count++;
//         if (max < count){
//             max = count;
//         }
//     } else {
//         count = 0;
//     }
// }
