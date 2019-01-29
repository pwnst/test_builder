import java.time.LocalDate;

public class Builder {
    static SchedulePayload schedulePayloadBuilder(
            LocalDate endDate,
            String mdtID,
            String scheduleType,
            String sendInterval,
            String timeZone,
            String translatedString
    ) {
        return SchedulePayload.builder()
                .actions(
                        Actions.builder()
                                .sendRecurringMessage(
                                        SendRecurringMessage.builder()
                                                .mdtID(mdtID)
                                                .build()
                                )
                                .build()
                )
                .endDate(endDate)
                .scheduleType(scheduleType)
                .sendInterval(sendInterval)
                .timeZone(timeZone)
                .translatedString(translatedString)
                .build();
    }
}
