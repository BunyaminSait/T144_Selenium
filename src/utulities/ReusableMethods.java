package utulities;

import org.openqa.selenium.WebElement;

import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;

public class ReusableMethods {

    // verilen web elementlerden olusan listeyi
    // String'lerden olusan bir liste olarak kaydedip, döndursun

    public static List<String> getStringList(List<WebElement> kaynakList){
        List<String> stringList = new ArrayList<>();

        for ( WebElement eachElement : kaynakList
        ) {

            stringList.add(eachElement.getText());

        }

        return stringList;

    }

}
