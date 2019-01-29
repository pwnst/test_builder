import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Actions {
    @SerializedName("SendRecurringMessage")
    private SendRecurringMessage sendRecurringMessage;
}
