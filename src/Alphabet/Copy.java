package Alphabet;

import java.io.*;
/*
* 로컬파일을 수정할 수 있는 프로그램 입니다.
* Failed.java의 오류들을 수정해서 완성시켰습니다.
* 스트림 클래스로 로컬파일과 자바애플리케이션을 연결 시켜서
* 파일을 읽고 쓸 수 있습니다.
*
* 파일의 내용을 읽은 후 배열에 저장하고
* 배열에 저장된 내용+추가할 내용을 삽입할 수 있습니다.
* 배열 외에 다른 자료구조도 응용가능합니다.
* */
public class Copy {

    public static void main(String[] args) throws IOException{
        BufferedReader in= null;
        PrintWriter out= null;
        try {
            in = new BufferedReader(new FileReader("output.txt"));
            String[] arr = new String[5];

            //try-with-resources를 안쓰고
            //output.txt를 읽는 문장 아래에
            //out = new PrintWriter(new FileWriter("output.txt"));를
            //두어서 output.txt이 초기화 되는 일이 없게 만들었다.
            String str;
            int i =0;
            while((str =in.readLine()) != null) {
                arr[i]=str;
                i++;
            }

            out = new PrintWriter(new FileWriter("output.txt"));

            int j=0;
            while(arr[j] != null) {
                out.println((j+1)+" "+arr[j]);
                j++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {in.close();}
            if (out != null) {out.close();}
        }
    }
}
