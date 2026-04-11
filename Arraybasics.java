public class Arraybasics {
    public static void main(String[] args)
    {   //declaring
        int[]a ={10, 20, 30, 40};
        System.out.println(a.length);
        System.out.println(a[1]);
        //traversing
        for(int i=0; i< a.length; i++)
        {
            System.out.println("index:"+i+" "+"value:"+a[i]);
        }
        // updating
         a[2]=65;
        System.out.println(a[2]);
    } 
}
