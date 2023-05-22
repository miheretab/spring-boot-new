package hello;

import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.Arrays;

@Service
public class HelloService {

    public boolean isValid(String cardNumber) {
        String[] card = cardNumber.split("");
        int sum = 0;

        Collections.reverse(Arrays.asList(card));

        for(int i = 0; i < card.length; i++) {

            if ((i+1) % 2 == 0) {//second digit
                Integer doubled = 2 * Integer.parseInt(card[i]);

                if (doubled > 9) {
                    String[] doubledArray = doubled.toString().split("");
                    sum += Integer.parseInt(doubledArray[0]) + Integer.parseInt(doubledArray[1]);
                } else {
                    sum += doubled;
                }
            } else {
                sum += Integer.parseInt(card[i]);
            }
            //System.out.println(i+"-"+sum);
        }

        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
}