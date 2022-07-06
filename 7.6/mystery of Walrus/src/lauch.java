public class lauch {
    public static void main(String[] args){
        Walrus a=new Walrus(1000,8.3);
        Walrus b;
        b=a;
        b.weight=5;
        a.report();
        a.change(a);
        a.report();
        b.report();
    }
}
