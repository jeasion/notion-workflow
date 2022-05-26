package com.jeasion.notion.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author liushanping
 */
@AllArgsConstructor
@Getter
public enum TimeInterval {
    SECOND("SECOND"), MINUTE("MINUTE"), HOUR("HOUR"), DAY("DAY"), MONTH("MONTH"), YEAR("YEAR"), NULL("");

    private final String interval;


    public static TimeInterval ofTimeInterval(String timeInterval) {
        for (TimeInterval interval : TimeInterval.values()) {
            if (interval.getInterval().equals(timeInterval)) {
                return interval;
            }
        }
        return NULL;
    }

}
