import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

class CoffeeBean implements Comparable<CoffeeBean> {

    private Character name;

    
    
    @Override
    public String toString() {
        return "CoffeeBean [name=" + name + "]";
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    CoffeeBean(char c ){
        this.name = c;
    }

    @Override
    public int compareTo(CoffeeBean o) {

        if (Objects.isNull(o) || name > o.getName())
            return 1;
        else if (o.getName() > name)
            return -1;
        else return 0;

    }

}

public class CompareExample{

    public static void main(String[] args) {
        
        CoffeeBean bean_a = new CoffeeBean('a');
        CoffeeBean bean_b = new CoffeeBean('c');

           CoffeeBean bean_x = new CoffeeBean('x');
        CoffeeBean bean_z = new CoffeeBean('z');

        CoffeeBean [] sorted =  new CoffeeBean[4];
        sorted[0]= bean_z;
        sorted[1] =  bean_a;
        sorted[2] = bean_x;
        sorted[3] = bean_b;

        Arrays.sort(sorted);

        Stream.of(sorted).forEach(System.out::println);


    }


}