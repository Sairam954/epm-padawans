class GuessingGame {
    public int answer;
    public int min;
    public int max;

    public GuessingGame(int min, int max) {
	this.min=min;
	this.max=max;
    }

    public int guess() {
      	 answer=(max+min)/2;
	    return answer;
    }

    public void lower() {
   		max=answer;
    }

    public void higher() {
		min=answer;
    }
}
