package QS1.stream;

public class StreamInfo {
    public String uName;
    public String uAccountNo;
    private double uBalance;
    private int numberOfMovie;

    public int getNumberOfMovie() {
        return numberOfMovie;
    }

    public void setNumberOfMovie(int _numberOfMovie) {
        this.numberOfMovie=_numberOfMovie;
    }

    public double getuBalance() {
        return uBalance;
    }

    public void setuBalance(double uBalance) {
        this.uBalance = uBalance;
    }
    public StreamInfo(){

    }
    public StreamInfo(String _uName,String _uAccountNo,double _uBalance,int _numberOfMovie){
        this.uName=_uName;
        this.uAccountNo=_uAccountNo;
        this.uBalance=_uBalance;
        this.numberOfMovie=_numberOfMovie;
    }
    public void updateUAccountNo(String uAccountNo){
        this.uAccountNo=uAccountNo;
    }
    public void updateName(String uName){
        this.uName=uName;
    }
    public void watchMovie()
    {
       updateBalance(50);
       updateMovieNumber(1);
    }

    //extra for private instance.
    public void updateBalance(int x){
        this.uBalance-=x;
    }
    public void updateMovieNumber(int y){
        this.numberOfMovie+=y;
    }
}
