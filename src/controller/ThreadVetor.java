package controller;

public class ThreadVetor extends Thread{
	private int n;
	private int [] vet;
	
	public ThreadVetor(int n, int [] vet) {
		this.n = n;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		percorrer();
	}
	
	private void percorrer() {
		int x;
		double initTime = System.nanoTime();
		if(this.n % 2 == 0) {
			for (int i = 0; i < this.vet.length; i++) {
				x = vet[i];
			}
		}else {
			for(int var : this.vet) {
				x = var;
			}
		}
		double time = (System.nanoTime() - initTime)/(Math.pow(10, 9));
		System.out.println("O tempo percorrido para " + this.n + " foi de: " + time + "s.");
	}
}
