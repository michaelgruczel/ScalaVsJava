package java;

import java.util.ArrayList;
import java.util.List;

public class JavaTimeSheetTest {


        public static void main(String args[]) {

            JavaTimeSheetEntry test1 =  new JavaTimeSheetEntry();
            JavaTimeSheetEntry test2 =  new JavaTimeSheetEntry("homer");
            JavaTimeSheetEntry test3 =  new JavaTimeSheetEntry("homer", 30);
            JavaTimeSheetEntry test4 =  new JavaTimeSheetEntry(30);


            System.out.println(test1);
            System.out.println(test2);
            System.out.println(test3);
            System.out.println(test4);

            JavaTimeSheetEntry test5 =  test3.add(test4);
            System.out.println(test5);

            List<JavaTimeSheetEntry> list = new ArrayList<JavaTimeSheetEntry>();
            list.add(test1);
            list.add(test2);
            list.add(test3);
            list.add(test4);
            list.add(test5);

            System.out.println(JavaTimeSheetUtil.filterEntriesByUser("homer", list));
            System.out.println(JavaTimeSheetUtil.addTime(10, list));
            System.out.println(JavaTimeSheetUtil.aggregateTimes(list));
            System.out.println(JavaTimeSheetUtil.timesGroupedByUser(list));


        }
}