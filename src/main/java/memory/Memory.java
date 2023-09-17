package memory;

import lombok.Getter;

@Getter
public class Memory {
    private Long used;
    private Long max;

    public Memory(Long used, Long max) {
        this.used = used;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "used=" + used +
                ", max=" + max +
                '}';
    }
}
