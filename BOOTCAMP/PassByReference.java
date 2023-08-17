class PassByReference 
{
	int a=69;
	static void abc(PassByRefernce p2)
	{
		System.out.println(p2.a);
	}
	public static void main(String[] args) 
	{
		PassByRefernce p1=new PassByRefernce();
		System.out.println(p1.a);
		abc(p1);
	}
}
