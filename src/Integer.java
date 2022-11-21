import java.util.HashMap;
import java.util.Map;

public class Integer {

    private final Map<String, java.lang.Integer> map = new HashMap<>();

    private void addToMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueFromMap = map.get(key);
            if (valueFromMap == value) {
                throw new IllegalArgumentException("Внимание! Значения совпадают");
            } else {
                map.put(key, valueFromMap + value);
            }
        }
    }
}
