import java.util.ArrayList;

public class App {

    // access modifier [public private , protected, default]


    int sum(){
        ///code
        return 18;
    }

    int sumOfTwoValues(int a, int b){
        return a+b;
    }


    void show(){
        System.out.println("method no return type");
    }

    void print(String smg){
        //smg = "";
        System.out.println(smg);
    }

    int[] createArray(int a,int b, int c){
        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;

        return arr;
    }


    ArrayList addVales(String val){
        ArrayList list=new ArrayList();
        list.add(val);

        return list;
    }

    public static void main(String[] args) {
        App app=new App();
        int a =app.sum();
        System.out.println(a);

        System.out.println(app.sumOfTwoValues(1,4));

        app.show();
        app.print("I print one document");

        //ArrayList list= app.addVales("1");
        //System.out.println(list.get(0));

        int[] arr=app.createArray(2,3,6);
        for(int val : arr){
            System.out.println(val);
        }
     }

     
}

