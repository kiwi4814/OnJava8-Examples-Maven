// references/ImmutableInteger.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// The Integer class cannot be changed

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImmutableInteger {
    public static void main(String[] args) {
        List<Integer> v = IntStream.range(0, 10)
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
        System.out.println(v);
        // But how do you change the int
        // inside the Integer?
    }
}
/* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
