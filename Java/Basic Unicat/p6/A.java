public class A{
	public static void main(String[] args){
	B b=new B();
	C c=new C();
	D d=new D();
	d.settotal(b.getprice(),c.getNoOfItems());
	
	System.out.println("The total value is " + d.total);
}
}
class B{
	public float price =10.5f;
	public float getprice(){
	return price;
}
}
class C{
	public int NoOfItems =15;
	public int getNoOfItems(){
	return NoOfItems; 
}
}
class D{
	public float total;
	public void settotal(float p,int i){
	total=p*i;

}
}