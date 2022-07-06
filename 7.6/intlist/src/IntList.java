public class IntList{
    int first;
    IntList rest;
    IntList(int first_,IntList rest_) {
        first = first_;
        rest = rest_;
    }
    public int size() {
        return rest == null ? 1 : rest.size() + 1;
    }

    public int iterativeSize()
    {
        IntList p=rest;
        int total=1;
        while(p!=null) {
            total++;
            p = p.rest;
        }
        return total;
    }

    public int iterativeGet(int x)
    {
        int ans=first;
        IntList p=rest;
        int initx=x;
        while(x!=0)
        {
            if(p==null)
                break;
            x--;
            ans=p.first;
            p=p.rest;
        }
        if(x!=0)
            throw new ArrayIndexOutOfBoundsException(initx);
        return ans;
    }
    public int get(int x)
    {
        if(rest==null&&x!=0)
            throw new ArrayIndexOutOfBoundsException();
        return x==0?first:rest.get(x-1);
    }

    public static void main(String[] Args){
        IntList a=new IntList(5,new IntList(9,new IntList(11,null)));
        IntList b=new IntList(13,null);
        b=new IntList(7,b);
        b=new IntList(6,b);
        b=new IntList(1,b);
        //这上面的两种是一样的，只不过一个是正的放置，一个是倒得放置

        System.out.println(a.size());
        System.out.println(b.size());

        System.out.println(a.iterativeSize());
        System.out.println(b.iterativeSize());

        for(int i=0;i<a.size();i++)
            System.out.print(a.get(i)+" ");
        System.out.println(" ");

        for(int i=0;i<b.size();i++)
            System.out.print(b.iterativeGet(i)+" ");
        System.out.println();
        System.out.print(a.get(3));
        System.out.print(b.iterativeGet(4));


        /*IntList a=new IntList();
        a.first=5;
        a.rest=null;

        a.rest=new IntList();
        a.rest.first=5;
        a.rest.rest=new IntList();
        a.rest.rest.first=7;
        a.rest.rest.rest=null;*/
    }
}