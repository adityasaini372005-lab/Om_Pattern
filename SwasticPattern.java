
import java.util.Scanner;

public class SwasticPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int mid= n/2+1;
    int mid1=n/3+1;
    
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n; col++) {

    //    Swastic    if (row==1 && col>=mid || col==1 &&row<=mid || row==mid || col==mid||row==n && col<=mid || col==n && row>=mid) {
// OM if(row==1&&col<mid1||row==mid&&col<mid1||row==n&&col<mid1||col==mid1&&row>1&&row<n||col==mid+1||col==n||row==n&&col>mid+1||row==1&&col>mid+1||row==mid&&col>mid1&&col<=mid){
    if(row==1&&col<mid1 ||row==mid&& col<mid1 ||row==n&&col<mid1||col==mid1 ||col==mid+1|| row==1&& col>mid+1|| row==n&&col>mid+1||col==n||row==mid && col>mid1&&col<=mid){
                    System.out.print("* " );
        
                } else {
                    System.out.print("  ");
                }
            }
        
            System.out.println();
        }
        }
    }

