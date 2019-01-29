import lombok.Builder;
import lombok.Data;

@Data
@Builder
class SendRecurringMessage {
    private String mdtID;
}
