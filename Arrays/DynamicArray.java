// import java.util.*;

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

    public void insertAtIndex(int v, int x) {
        //insert at this index
        x = x-1;
        for(int i=li;i>=x;i--) {
            A[i+1] = A[i];
        }
        A[x] = v;
        li++;

        //ensuring that the array is dynamic
        if(li >= A.length /2) {
            int B[] = new int[2*A.length];

            for(int i=0;i<=li;i++) {
                B[i] = A[i];
            }

            A=B;
        }
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

    public void deleteAtIndex(int x) {
        //delete at this index
        x = x-1;
        for(int i=x;i<li;i++) {
            A[i] = A[i+1];
        }
        li--;

        //ensuring that the array is dynamic after deletion
        if(li < A.length /2) {
            int B[] = new int[A.length/2];

            for(int i=0;i<=li;i++) {
                B[i] = A[i];
            }
            A=B;
        }
    }

    public void deleteAtFirstOccurence(int e) {
        int F=0;
        //searching and deleting the element from the start
        for(int i=0;i<=li;i++) {

            if (A[i] == e) {
                F=1;

                if(i == li) {
                    li--;
                }
                else {
                    for(int j=i;j<li;j++) {
                        A[j] = A[j+1];
                    }
                    li--;
                } 
                break;
            }
        }
        if(F == 0) {
            System.out.println("Element Not Found");
        }
        //checking if size of array is not less than half or not
        if(li < A.length /2) {
            int B[] = new int[A.length/2];

            for(int i=0;i<=li;i++) {
                B[i] = A[i];
            }
            A=B;
        }
    }

    public void deleteAtLastOccurence(int e) {
        int F=0;
        //searching and deleting the element from the last
        for(int i=li;i>=0;i--) {

            if (A[i] == e) {
                F = 1;
                
                if(i == li) {
                    li--;
                }
                else {
                    for(int j=i;j<li;j++) {
                        A[j] = A[j+1];
                    }
                    li--;
                } 
                break;
            }
        }

        if(F == 0) {
            System.out.println("Element Not Found");
        }

        //checking if size of array is not less than half or not
        if(li < A.length /2) {
            int B[] = new int[A.length/2];

            for(int i=0;i<=li;i++) {
                B[i] = A[i];
            }
            A=B;
        }
    }

    public void deleteAllOccurences(int x) {
        // int F=0;
        for(int i=0;i<=li;i++) {
            if(A[i] == x) {
                // F=1;
                deleteAtFirstOccurence(x);
            }
        }
        // if(F==0)
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
        // Scanner sc = new Scanner(System.in);
        DynamicArray obj = new DynamicArray();
        

        for(int i=1;i<=10;i++) {
            obj.insert(i);
        }

        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(10);

        obj.display();

        obj.deleteAtFirstOccurence(4);
        obj.display();

        obj.insertAtIndex(28, 5);
        obj.display();

        obj.deleteAtIndex(5);
        obj.display();

        obj.deleteAllOccurences(4);
        obj.display();


        obj.deleteAtLastOccurence(3);
        obj.deleteAtLastOccurence(10);
        obj.display();

        for(int i=1;i<=10;i++) {
            obj.insert(i);
        }
        obj.display();

        for(int i=1;i<=10;i++) {
            obj.delete();
            obj.display();
        }
    
        // obj.display();
    }
}