package sandbox.domain;

import com.sun.jna.Structure;
import com.sun.jna.win32.StdCallLibrary;
import java.util.ArrayList;
import java.util.List;

public interface Kernel32 extends StdCallLibrary {

    public static class SYSTEMTIME extends Structure {

        public short wYear;
        public short wMonth;
        public short wDayOfWeek;
        public short wDay;
        public short wHour;
        public short wMinute;
        public short wSecond;
        public short wMilliseconds;

        @Override
        protected List<String> getFieldOrder() {
            List<String> fieldOrders = new ArrayList<>();
            fieldOrders.add("wYear");
            fieldOrders.add("wMonth");
            fieldOrders.add("wDayOfWeek");
            fieldOrders.add("wDay");
            fieldOrders.add("wHour");
            fieldOrders.add("wMinute");
            fieldOrders.add("wSecond");
            fieldOrders.add("wMilliseconds");

            return fieldOrders;
        }
    }

    void GetLocalTime(SYSTEMTIME result);
}
