package streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByExample {

    // sort a list of list of string

    public static void main(String[] args) {

        Menu menu = new Menu();
        Map<Dish.Type, List<Dish>> map = sortAListOfDishes(menu.menu.stream());
        map.entrySet().stream().forEach(System.out::println);

        int arr[] = new int[] { 1, 2, 2, 3, 3, 4, 1, 3, 1, 2, 2 };
        FreqCollector freqCollector = new FreqCollector();
        Arrays.stream(arr).forEach(freqCollector::add);
        freqCollector.getMap().entrySet().stream().forEach(System.out::println);

    }

    static Map<Dish.Type, List<Dish>> sortAListOfDishes(Stream<Dish> dishes) {
        return dishes.collect(Collectors.groupingBy(Dish::getType));
    }

    static List<Integer> sort(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

}

class FreqCollector {
    private Map<Integer, Integer> map = new HashMap<>();

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void add(int element) {
        map.put(element, map.getOrDefault(element, 0) + 1);
    }

}
