package Alphabet;

import java.io.*;


/*
*
* 로컬 파일을 수정하는 프로그램의 실패작 입니다.
*
* 오류 수정을 거쳐서 Copy.java 에 완성본을
* 만들었습니다.
*
*
* */
public class Failed {

    public static void main(String[] args) throws IOException{
        try(BufferedReader in = new BufferedReader(new FileReader("output.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("output.txt"))){


            String[] arr = new String[5];

            int i =0;

            //PrintWriter out = new PrintWriter(new FileWriter("output.txt"))이
            //먼저 실행되면서 "output.txt"이 초기화 되어서 읽을 수 없다.

            while((in.readLine()) != null) {
                //readLine()메서드가 두번 호출 되었다
                arr[i]=in.readLine();
                i++;
            }

            int j=0;
            while(arr[j] != null) {
                out.println((j+1)+" "+arr[j]);
                j++;
            }

        }
    }
}
