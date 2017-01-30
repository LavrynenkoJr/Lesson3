package LessonHZ;


import java.util.*;

public class Main {


    public static void main(String[] args) {

        //oneTask();
        //twoTask();
        //fourTask();
        //fiveTask();
        //sixTask();
        //sevenTask();
        eightTask();
    }

    private static void eightTask()
    {

    }

    private static void sevenTask()
    {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(random(1, 20));
        }

        soutSet(set);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int a = iterator.next();
            if (a > 10)
                iterator.remove();
        }
        System.out.println();
        soutSet(set);
    }

    private static void soutSet(Set<Integer> set) {
        for (Integer number: set)
        {
            System.out.println(number);
        }
    }

    private static void sixTask()
    {
        HashMap<String, Cat> map = new HashMap<String, Cat>();

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName("CatNumber " + i);
            map.put(cat.getName(), cat);
        }
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        for (String name: set)
        {
            System.out.println(name);
        }
    }

    private static void fiveTask() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("диня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair: map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    private static void fourTask() {
        HashSet<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("диня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String s: set)
        {
            System.out.println(s);
        }
    }

    private static void twoTask() {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put(i + "", "value " + i);
        }
        for (String key: map.keySet())
        {
            System.out.println(key);
        }
    }

    private static void oneTask() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(random(50, 100));
        }
        Collections.sort(list);

        for (int i = list.size() - 1; i >= list.size() - 5; i--) {
            System.out.println(list.get(i));
        }
    }

    private static int random(int minValue, int maxValue) {
        return (int) (Math.random() * (maxValue - minValue)) + minValue;
    }
}
