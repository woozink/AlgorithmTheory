package dynamicprogramming;

class Fibonachi {
    public int fibonachi1(int data){
       if(data <=1){
           return data;
       }else{
           return this.fibonachi1(data-1) + this.fibonachi1(data-2);
       }
    }
}

class Dynamic{
    public int dynamicFunc(int data){
        Integer[] cache = new Integer[data +1];
        cache[0] = 0;
        cache[1] = 1;
        for(int index =2; index < data+1; index++){
            cache[index] = cache[index-1] + cache[index-2];
        }
        return cache[data];
    }
}
public class DynamicP {
    public static void main(String[] args) {
        Fibonachi fObject = new Fibonachi();
        int x = fObject.fibonachi1(10);
        System.out.println(x);

        Dynamic dy = new Dynamic();
        int y = dy.dynamicFunc(20);
        System.out.println(y);
    }
}
