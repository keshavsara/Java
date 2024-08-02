class calc
{
int sum,sub,mul,div;
void add(int x,int y)
{
sum=x+y;
System.out.println("Add result="+sum);
}
void sub(int a,int b)
{
sub=a-b;
System.out.println("Sub result="+sub);
}
void mul(int c,int d)
{
mul=c*d;
System.out.println("Mul result="+mul);
}
void div(int e,int f)
{
div=e/f;
System.out.println("Div result="+div);
}
public static void main(String arg[])
{
calc obj=new calc();
calc obj1=new calc();
calc obj2=new calc();
calc obj3=new calc();
obj.add(10,15);
obj1.sub(15,10);
obj2.mul(10,15);
obj3.div(20,10);
}
}