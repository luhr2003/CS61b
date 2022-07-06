public class mystery {
    public static int mystery1(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }
    public static void mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery1(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }
    public static int fib(int n)
    {
            return n>2?fib(n-1)+fib(n-2):n-1;
    }
    public static void main(String[] args){
        /*int[] a=new int[args.length-1];
        for(int i=0;i<args.length-1;i++)
            a[i]=Integer.parseInt(args[i]);
        int x=Integer.parseInt(args[args.length-1]);
        System.out.println(mystery1(a,x));*/
        /*int []a=new int [args.length];
        for(int i=0;i<args.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        mystery2(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");*/
        for(int i=1;i<40;i++)
            System.out.println(fib(i));
    }
}
