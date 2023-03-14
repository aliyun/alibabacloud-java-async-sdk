// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAttackEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainAttackEventsResponseBody</p>
 */
public class DescribeDomainAttackEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < Events> events;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeDomainAttackEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainAttackEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
        return this.events;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Events> events; 
        private String requestId; 
        private Long total; 

        /**
         * Events.
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDomainAttackEventsResponseBody build() {
            return new DescribeDomainAttackEventsResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("BlockCount")
        private Long blockCount;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Finished")
        private Boolean finished;

        @NameInMap("MaxQps")
        private Integer maxQps;

        @NameInMap("StartTime")
        private Long startTime;

        private Events(Builder builder) {
            this.blockCount = builder.blockCount;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.finished = builder.finished;
            this.maxQps = builder.maxQps;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return blockCount
         */
        public Long getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return maxQps
         */
        public Integer getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long blockCount; 
            private Integer duration; 
            private Long endTime; 
            private Boolean finished; 
            private Integer maxQps; 
            private Long startTime; 

            /**
             * BlockCount.
             */
            public Builder blockCount(Long blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * MaxQps.
             */
            public Builder maxQps(Integer maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
