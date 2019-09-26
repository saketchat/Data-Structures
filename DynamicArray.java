import java.util.*;

class DynamicArray {

    int A[] = new int[4];
    int li=-1;

    public void insert(int x) {
        li++;
        A[li] = x;
        if(li >= A.length /2) {
            int B[] = new int[2*A.length];

            for(int i=0;i<=li;i++) {
                B[i] = A[i];
            }

            A=B;
        }
            // display();
            // System.out.println();    
    }

    public void delete() {
        // int x = A[li];
        // System.out.println("Deleted: "+ x);
        li--;
        if(li < A.length /2) {
            int B[] = new int[A.length/2];

            for(int i=0;i<=li;i++) {
                B[i] = A[i];
            }
            A=B;
        }
            // display();
            // System.out.println();    
    }

    public void display() {
        for(int i=0;i<=li;i++) {
            System.out.print(A[i]+" ");
            // System.out.print(i+" ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DynamicArray obj = new DynamicArray();
        obj.insert(5);
        obj.insert(4);
        obj.insert(2);
        obj.insert(1);
        obj.insert(6);
        obj.insert(5);
        obj.insert(4);
        obj.insert(2);
        obj.insert(1);
        obj.insert(6);
        obj.insert(1);
        obj.insert(6);
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        obj.insert(11);
        obj.insert(12);
        obj.insert(64);

        obj.display();

        obj.delete();
        obj.delete();
        obj.delete();
        obj.delete();
        obj.delete();
    
        obj.display();
    }
}