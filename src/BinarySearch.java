import java.util.Scanner;

public class BinarySearch {
   static int[] list = {1,2,3,4,5,6,7,8};
   static int searchNumber(int[] list,int key){
       int low = 0;
       int hight = list.length-1;
       while (hight>=low){
           int mid = (hight+low)/2;
           if(key < list[mid]){
               hight = mid-1;
           } else if (key>list[mid]) {
               low = mid +1 ;
           }else {
               return mid;
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        System.out.println("nhap ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        System.out.println("so do o vi tri " + searchNumber(list,search));
    }
}