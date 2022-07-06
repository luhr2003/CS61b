public class Walrus {
    public int weight;
    public double height;
    Walrus(int weight_,double height_){
        weight=weight_;
        height=height_;
    }
    public void report(){
        System.out.print(weight+" "+height);
        System.out.println();
    }
    public static void change(Walrus p)
    {
        p.weight=120;
        p.height=182;
    }
}
