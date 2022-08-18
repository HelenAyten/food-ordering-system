package domain.dto.track;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrderQuery {
    //Client tarafından siparişin son durumunu sorgulamak için kullanılır.

    @NotNull
    private final UUID orderTrackingId;
}
