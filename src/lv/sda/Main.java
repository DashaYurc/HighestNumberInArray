package lv.sda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();

            }
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println("The largest number is: " + max);
        }


    }

