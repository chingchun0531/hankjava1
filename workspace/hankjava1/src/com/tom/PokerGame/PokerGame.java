package com.tom.PokerGame;


public class PokerGame {
	
public static void main(String[] args) {
	int[] n = new int[10];	
	Card[] c = new Card[10];
	System.out.println(n[0]);
	c[0] = new Card(2);
	System.out.println(c[0].get());
	
		Poker poker = new Poker();
		poker.print();
	}
}

/*
int nums[] = new int[5];
nums[0] = 77;
nums[4] = 98;
System.out.println(nums[4]);
	System.out.println(nums.length);

for (int i = 0; i < nums.length; i++) {
	System.out.println(nums[i]);
}	
Random random = new Random();
for (int i = 0; i < 52; i++) {
	int number = random.nextInt(13) + 1;
	int flower = random.nextInt(4);
	System.out.print(number);
	char c = 0;
	switch (flower) {
	case 0:
		c = 'C';
		break;
	case 1:
		c = 'H';
		break;
	case 2:
		c = 'D';
		break;
	case 3:
		c = 'S';
		break;
	}
	System.out.println(c);

}
}
}
*/