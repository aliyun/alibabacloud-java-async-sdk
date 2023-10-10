// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnalysisConfig} extends {@link TeaModel}
 *
 * <p>AnalysisConfig</p>
 */
public class AnalysisConfig extends TeaModel {
    @NameInMap("badThroughputThreshold")
    private Double badThroughputThreshold;

    @NameInMap("fullGCFrequentIntervalThreshold")
    private Double fullGCFrequentIntervalThreshold;

    @NameInMap("highHeapUsageThreshold")
    private Double highHeapUsageThreshold;

    @NameInMap("highHumongousUsageThreshold")
    private Double highHumongousUsageThreshold;

    @NameInMap("highMetaspaceUsageThreshold")
    private Double highMetaspaceUsageThreshold;

    @NameInMap("highOldUsageThreshold")
    private Double highOldUsageThreshold;

    @NameInMap("highPromotionThreshold")
    private Double highPromotionThreshold;

    @NameInMap("highSysThreshold")
    private Double highSysThreshold;

    @NameInMap("longConcurrentThreshold")
    private Double longConcurrentThreshold;

    @NameInMap("longPauseThreshold")
    private Double longPauseThreshold;

    @NameInMap("lowUsrThreshold")
    private Double lowUsrThreshold;

    @NameInMap("oldGCFrequentIntervalThreshold")
    private Double oldGCFrequentIntervalThreshold;

    @NameInMap("smallGenerationThreshold")
    private Double smallGenerationThreshold;

    @NameInMap("timeRange")
    private TimeRange timeRange;

    @NameInMap("tooManyOldGCThreshold")
    private Double tooManyOldGCThreshold;

    @NameInMap("youngGCFrequentIntervalThreshold")
    private Double youngGCFrequentIntervalThreshold;

    private AnalysisConfig(Builder builder) {
        this.badThroughputThreshold = builder.badThroughputThreshold;
        this.fullGCFrequentIntervalThreshold = builder.fullGCFrequentIntervalThreshold;
        this.highHeapUsageThreshold = builder.highHeapUsageThreshold;
        this.highHumongousUsageThreshold = builder.highHumongousUsageThreshold;
        this.highMetaspaceUsageThreshold = builder.highMetaspaceUsageThreshold;
        this.highOldUsageThreshold = builder.highOldUsageThreshold;
        this.highPromotionThreshold = builder.highPromotionThreshold;
        this.highSysThreshold = builder.highSysThreshold;
        this.longConcurrentThreshold = builder.longConcurrentThreshold;
        this.longPauseThreshold = builder.longPauseThreshold;
        this.lowUsrThreshold = builder.lowUsrThreshold;
        this.oldGCFrequentIntervalThreshold = builder.oldGCFrequentIntervalThreshold;
        this.smallGenerationThreshold = builder.smallGenerationThreshold;
        this.timeRange = builder.timeRange;
        this.tooManyOldGCThreshold = builder.tooManyOldGCThreshold;
        this.youngGCFrequentIntervalThreshold = builder.youngGCFrequentIntervalThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalysisConfig create() {
        return builder().build();
    }

    /**
     * @return badThroughputThreshold
     */
    public Double getBadThroughputThreshold() {
        return this.badThroughputThreshold;
    }

    /**
     * @return fullGCFrequentIntervalThreshold
     */
    public Double getFullGCFrequentIntervalThreshold() {
        return this.fullGCFrequentIntervalThreshold;
    }

    /**
     * @return highHeapUsageThreshold
     */
    public Double getHighHeapUsageThreshold() {
        return this.highHeapUsageThreshold;
    }

    /**
     * @return highHumongousUsageThreshold
     */
    public Double getHighHumongousUsageThreshold() {
        return this.highHumongousUsageThreshold;
    }

    /**
     * @return highMetaspaceUsageThreshold
     */
    public Double getHighMetaspaceUsageThreshold() {
        return this.highMetaspaceUsageThreshold;
    }

    /**
     * @return highOldUsageThreshold
     */
    public Double getHighOldUsageThreshold() {
        return this.highOldUsageThreshold;
    }

    /**
     * @return highPromotionThreshold
     */
    public Double getHighPromotionThreshold() {
        return this.highPromotionThreshold;
    }

    /**
     * @return highSysThreshold
     */
    public Double getHighSysThreshold() {
        return this.highSysThreshold;
    }

    /**
     * @return longConcurrentThreshold
     */
    public Double getLongConcurrentThreshold() {
        return this.longConcurrentThreshold;
    }

    /**
     * @return longPauseThreshold
     */
    public Double getLongPauseThreshold() {
        return this.longPauseThreshold;
    }

    /**
     * @return lowUsrThreshold
     */
    public Double getLowUsrThreshold() {
        return this.lowUsrThreshold;
    }

    /**
     * @return oldGCFrequentIntervalThreshold
     */
    public Double getOldGCFrequentIntervalThreshold() {
        return this.oldGCFrequentIntervalThreshold;
    }

    /**
     * @return smallGenerationThreshold
     */
    public Double getSmallGenerationThreshold() {
        return this.smallGenerationThreshold;
    }

    /**
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return tooManyOldGCThreshold
     */
    public Double getTooManyOldGCThreshold() {
        return this.tooManyOldGCThreshold;
    }

    /**
     * @return youngGCFrequentIntervalThreshold
     */
    public Double getYoungGCFrequentIntervalThreshold() {
        return this.youngGCFrequentIntervalThreshold;
    }

    public static final class Builder {
        private Double badThroughputThreshold; 
        private Double fullGCFrequentIntervalThreshold; 
        private Double highHeapUsageThreshold; 
        private Double highHumongousUsageThreshold; 
        private Double highMetaspaceUsageThreshold; 
        private Double highOldUsageThreshold; 
        private Double highPromotionThreshold; 
        private Double highSysThreshold; 
        private Double longConcurrentThreshold; 
        private Double longPauseThreshold; 
        private Double lowUsrThreshold; 
        private Double oldGCFrequentIntervalThreshold; 
        private Double smallGenerationThreshold; 
        private TimeRange timeRange; 
        private Double tooManyOldGCThreshold; 
        private Double youngGCFrequentIntervalThreshold; 

        /**
         * badThroughputThreshold.
         */
        public Builder badThroughputThreshold(Double badThroughputThreshold) {
            this.badThroughputThreshold = badThroughputThreshold;
            return this;
        }

        /**
         * fullGCFrequentIntervalThreshold.
         */
        public Builder fullGCFrequentIntervalThreshold(Double fullGCFrequentIntervalThreshold) {
            this.fullGCFrequentIntervalThreshold = fullGCFrequentIntervalThreshold;
            return this;
        }

        /**
         * highHeapUsageThreshold.
         */
        public Builder highHeapUsageThreshold(Double highHeapUsageThreshold) {
            this.highHeapUsageThreshold = highHeapUsageThreshold;
            return this;
        }

        /**
         * highHumongousUsageThreshold.
         */
        public Builder highHumongousUsageThreshold(Double highHumongousUsageThreshold) {
            this.highHumongousUsageThreshold = highHumongousUsageThreshold;
            return this;
        }

        /**
         * highMetaspaceUsageThreshold.
         */
        public Builder highMetaspaceUsageThreshold(Double highMetaspaceUsageThreshold) {
            this.highMetaspaceUsageThreshold = highMetaspaceUsageThreshold;
            return this;
        }

        /**
         * highOldUsageThreshold.
         */
        public Builder highOldUsageThreshold(Double highOldUsageThreshold) {
            this.highOldUsageThreshold = highOldUsageThreshold;
            return this;
        }

        /**
         * highPromotionThreshold.
         */
        public Builder highPromotionThreshold(Double highPromotionThreshold) {
            this.highPromotionThreshold = highPromotionThreshold;
            return this;
        }

        /**
         * highSysThreshold.
         */
        public Builder highSysThreshold(Double highSysThreshold) {
            this.highSysThreshold = highSysThreshold;
            return this;
        }

        /**
         * longConcurrentThreshold.
         */
        public Builder longConcurrentThreshold(Double longConcurrentThreshold) {
            this.longConcurrentThreshold = longConcurrentThreshold;
            return this;
        }

        /**
         * longPauseThreshold.
         */
        public Builder longPauseThreshold(Double longPauseThreshold) {
            this.longPauseThreshold = longPauseThreshold;
            return this;
        }

        /**
         * lowUsrThreshold.
         */
        public Builder lowUsrThreshold(Double lowUsrThreshold) {
            this.lowUsrThreshold = lowUsrThreshold;
            return this;
        }

        /**
         * oldGCFrequentIntervalThreshold.
         */
        public Builder oldGCFrequentIntervalThreshold(Double oldGCFrequentIntervalThreshold) {
            this.oldGCFrequentIntervalThreshold = oldGCFrequentIntervalThreshold;
            return this;
        }

        /**
         * smallGenerationThreshold.
         */
        public Builder smallGenerationThreshold(Double smallGenerationThreshold) {
            this.smallGenerationThreshold = smallGenerationThreshold;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(TimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * tooManyOldGCThreshold.
         */
        public Builder tooManyOldGCThreshold(Double tooManyOldGCThreshold) {
            this.tooManyOldGCThreshold = tooManyOldGCThreshold;
            return this;
        }

        /**
         * youngGCFrequentIntervalThreshold.
         */
        public Builder youngGCFrequentIntervalThreshold(Double youngGCFrequentIntervalThreshold) {
            this.youngGCFrequentIntervalThreshold = youngGCFrequentIntervalThreshold;
            return this;
        }

        public AnalysisConfig build() {
            return new AnalysisConfig(this);
        } 

    } 

    public static class TimeRange extends TeaModel {
        @NameInMap("end")
        private Double end;

        @NameInMap("start")
        private Double start;

        private TimeRange(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public Double getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public Double getStart() {
            return this.start;
        }

        public static final class Builder {
            private Double end; 
            private Double start; 

            /**
             * end.
             */
            public Builder end(Double end) {
                this.end = end;
                return this;
            }

            /**
             * start.
             */
            public Builder start(Double start) {
                this.start = start;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
}
