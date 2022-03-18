package recursive;

import java.util.ArrayList;

class Factorial {
    public int factorialFunc(int n) {
        if (n > 1) {
            return n * factorialFunc(n - 1);
        } else {
            return 1;
        }
    }
}

class Factorial2 {
    public int factorial2Func(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * this.factorial2Func(n - 1);
    }

    //연습해보기
    // 숫자가 들어 있는 배열이 주어졌을 떄 배열의 합을 리턴하는 코드를 작성해보시오 (재귀_
    //class Sum{
    public int sumFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        }
        return dataList.get(0) + this.sumFunc(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

    public int factorial3Func(int data){
        if(data == 1){
            return 1;
        }else if (data ==2){
            return 2;
        }else if(data ==3){
            return 4;
        }
        return this.factorial3Func(data -1) +this.factorial3Func(data-2)+this.factorial3Func(data-3);
    }

}


public class RecursiveCall {
    public static void main(String[] args) {
        Factorial2 fObject = new Factorial2();
        int x = fObject.factorial2Func(5);
        System.out.println(x + "\n");

        //ArrayList의 SubList메서드

        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int data = 0; data < 10; data++) {
            testData.add(data);
        }
        System.out.println(testData);
        System.out.println(testData.subList(1, testData.size() - 1));
    }
}
