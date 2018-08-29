package kwic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermGenerator {

    List<String> arrayList;
    List<String> perms = new ArrayList<>();

    public PermGenerator(List<String> arrayList) {
        this.arrayList = arrayList;
    }

    public List getPerms() {
        return perms;
    }

    void generatePerms() {
        arrayList.stream().map((in) -> new ArrayList<>(Arrays.asList(in.split(" "))))
                .forEachOrdered((items) -> {
                    int numItems = items.size();
                    for (int i = 0; i < numItems; i++) {
                        String hd = items.remove(0);
                        items.add(hd);
                        perms.add(String.join(" ", items));
                    }
                });
        Collections.sort(perms);
    }
}
