class HelloWorld {
	
	public static final int MAX_HELLO = 10;
	public static void main(String args[]){
		System.out.println("Hello World!");
		for( int idx = 1 ; idx <= MAX_HELLO ; idx++ ){
			System.out.println("Hello World" + idx);
		}
	}
}