package memory;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemoryFinder {

    public Memory get() {
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        long used = total - free;
        return new Memory(used, max);
    }

    // 빈으로 등록할 것인데, 잘 등록되었는지 확인하기 위해 로그를 남김
    @PostConstruct
    public void init() {
        log.info("init memory Finder");
    }
}
