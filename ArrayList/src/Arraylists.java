import java.util.ArrayList;
public class Arraylists
	{
		
		public static void main(String[] args)
			{
				yeet();
				shweet();
				wheat();
			}
		public static void yeet()
		{
				ArrayList <Double> yeet = new ArrayList <Double>();
				yeet.add(2.1);
				yeet.add(5.7);
				yeet.add(6.3);
				yeet.add(7.8);
				yeet.add(8.3);
				for(int i=0; i<yeet.size();i++)
					{
						System.out.println(yeet.get(i));
					}
		}
		public static void shweet()
		{
				double sum = 0;
				ArrayList <Double> shweet = new ArrayList <Double>();
				shweet.add(2.1);
				shweet.add(5.7);
				shweet.add(6.3);
				shweet.add(7.8);
				shweet.add(8.3);
				for(int i=0; i<shweet.size();i++)
					{
						sum=sum + shweet.get(i);
							
							}
							System.out.println("you answer is "+sum);
		}
		public static void wheat()
		{
			double sum = 0;
			ArrayList <Double> wheat = new ArrayList <Double>();
			wheat.add(2.1);
			wheat.add(5.7);
			wheat.add(6.3);
			wheat.add(7.8);
			wheat.add(8.3);
			wheat.add(8.9);
			wheat.add(9.3);
			wheat.remove(0);
			for(int i=0; i<wheat.size();i++)
			{
				sum=sum + wheat.get(i);
			}
			System.out.println(sum/wheat.size());
		}
	}