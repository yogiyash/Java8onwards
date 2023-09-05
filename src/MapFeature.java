import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.*;
public class MapFeature{

    public static void main(String[] args) {
        Integer [] arr = new Integer[] {1,2,3,4,5,5,6,7};
        HashMap<String,Integer[]> map = new HashMap<>();
        List <Integer> list = new ArrayList<>();
        Stream.of(arr).map(e->changer(e, 1)).forEach(list::add);
        map.put(1,list);
        list = new ArrayList<>();
        Stream.of(arr).map(e->changer(e, -9)).forEach(list::add);
        map.put(-9,list);
        List<List<Integer>> sl = new ArrayList<>();
        Stream.of(map.values()).forEach(sl::add);


    }

    public static Integer changer(Integer element, int mask){
        return element-mask;
    }

}