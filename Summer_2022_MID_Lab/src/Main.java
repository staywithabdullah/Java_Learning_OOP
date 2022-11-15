import QS1.stream.StreamInfo;
import QS1.stream.StreamInfoV2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arrSize;
        arrSize= in.nextInt();
        in.nextLine();
        StreamInfoV2[] stream=new StreamInfoV2[arrSize];

        for(int i =0; i<arrSize;i++){
            stream[i]=new StreamInfoV2();

            System.out.println("Enter client " +(1+i)+" Name:");
            stream[i].updateName(in.nextLine());

            System.out.println("Enter client "+(1+i)+" Account number:");
            stream[i].updateUAccountNo(in.nextLine());

            System.out.println("Enter client "+(1+i)+" Balance:");
            stream[i].setuBalance(in.nextDouble());

            stream[i].setNumberOfMovie(0);

            System.out.println("Enter client "+(1+i)+" Movie:");

            int moviesCount=in.nextInt();
            in.nextLine();
            for(int j=1; j<moviesCount;j++)
            {
                ((StreamInfo)stream[i]).watchMovie();
            }
        }

        for(int i=0; i<arrSize; i++){
            System.out.println("Client "+(1+i) +" Balance:"+ stream[i].getuBalance());
            System.out.println("Client "+(1+i) + " Movies watch:" +stream[i].getNumberOfMovie());
        }
        int minMovie=stream[0].getNumberOfMovie();
        int j=0;
        for(int i=0; i<arrSize; i++){
            if(minMovie>stream[i].getNumberOfMovie())
                j=i;
        }
        System.out.println("Client "+ stream[j].uName+" seen the minimum number of Movie.");

    }
}
