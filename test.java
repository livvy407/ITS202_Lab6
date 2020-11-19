public class test
{
	public static void main(String[] args)
	{
		SequentialSearchST<String, Integer> obj = new SequentialSearchST<String, Integer>();
		obj.put("a",7);
		obj.put("b",1);
		obj.put("c",3);

		System.out.println(obj.keys());
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
	}
}