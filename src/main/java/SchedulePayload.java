import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
class SchedulePayload {
    private Actions actions;
    private String timeZone;
    private String sendInterval;
    private LocalDate endDate;
    private String scheduleType;
    private String translatedString;
}
