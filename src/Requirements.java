import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Requirements {
    private final Integer gpuGb;
    private final Integer HDDGb;
    private final Integer RAMGb;
    private final Double cpuGhz;
    private final Integer coresNum;
}
