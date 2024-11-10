class est {
    void checknumber(int n) throws Exception{
        if(n<0){
        throw new Exception("number is negative");
        }else{
        throw new Exception("number is positive");
    }
}
public static void main(String[] args)
{
    est obj = new est();
    try
    {
        obj.checknumber(-20);
    }
    catch(Exception e)
    {
        System.out.println("catch exception : " + e.getMessage());
    }
}
}