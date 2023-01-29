Scanner input = new Scanner(System.in);
		
		
		int n1, n2;
		int r; 
		
		System.out.print("Enter the value 1: ");
		n1 = input.nextInt();
		System.out.print("Enter the value 2: ");
		n2 = input.nextInt();
		
		while(n2!=0) {
			r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		
		System.out.println("GCD = " + n1);
