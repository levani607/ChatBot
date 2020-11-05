package ChatBot;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public  class Chatbot {


    public static boolean x = true;

    public void trans(String shemotanili) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("მითხარი ეროვნული ვალუტის კურსი", "1 USD = 3.4600GEL");
        myMap.put("მაჩვენე ფილიალები", "ფილიალების მისმართებია:");
        myMap.put("გამარჯობა", "გაგიმარჯოს");
        myMap.put("ნახვამდის", "კარგად ბრძანდებოდეთ");
        Set<String> rr = myMap.keySet();

        String Answer = myMap.get(shemotanili);

        if (Answer == null)
            System.out.println("სამწუხაროდ ამ თემაზე ინფორმაციას არ ვფლობ");
        else if (Answer==myMap.get("ნახვამდის")) {
            System.out.println(Answer);
            x =false;
        } else
            System.out.println(Answer);

    }
}
