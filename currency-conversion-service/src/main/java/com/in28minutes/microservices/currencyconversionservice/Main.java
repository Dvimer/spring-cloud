package com.in28minutes.microservices.currencyconversionservice;

public class Main
{
	public static void main(String[] args)
	{
		Inter inter = new Demo();
		inter.musl();
	}

}

interface Inter
{
	void musl();
}

interface InterF
{
	void mult(int a, int b);
}

interface InterG
{
	int getLengh(String name);

	default int getLeaghName(String name)
	{
		InterG interG = String::length;
		return interG.getLengh(name);
	}
}

class Demo implements Inter
{
	@Override
	public void musl()
	{
		System.out.println("fsddfsfas");
	}
}

class Test
{
	public static void main(String[] args)
	{
		Inter inter = () -> System.out.println("fsddfsfas");
		inter.musl();

		InterF interF = (a, b) -> System.out.println("Add count " + (a + b));
		interF.mult(10, 20);
		interF.mult(10, 2033);

		InterG interG
		System.out.println(interG.getLengh("43635476453723"));

	}
}