import com.google.gson.Gson;

import static java.time.LocalDate.of;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        SchedulePayload schedulePayload = Builder.schedulePayloadBuilder(
                of(2018, 1, 1),
                "mdtID",
                "SomeType",
                "Interval!",
                "UTC",
                "some msg here!");
        System.out.println(gson.toJson(schedulePayload));
    }
}
