public class dog {
    public  int weight;
    public static dog maxdog(dog d1,dog d2){
        if(d1.weight<d2.weight)
            return d2;
        else
            return d1;
    }
    dog(int x)
    {
        weight=x;
    }
    public void makeNoise()
    {
        System.out.println(weight);
    }
}
