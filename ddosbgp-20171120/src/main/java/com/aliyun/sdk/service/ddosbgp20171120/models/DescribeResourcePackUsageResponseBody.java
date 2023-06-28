// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackUsageResponseBody</p>
 */
public class DescribeResourcePackUsageResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("Interval")
    private Long interval;

    @NameInMap("PackUsages")
    private java.util.List < PackUsages> packUsages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    private DescribeResourcePackUsageResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.interval = builder.interval;
        this.packUsages = builder.packUsages;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return packUsages
     */
    public java.util.List < PackUsages> getPackUsages() {
        return this.packUsages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Long endTime; 
        private Long interval; 
        private java.util.List < PackUsages> packUsages; 
        private String requestId; 
        private Long startTime; 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * PackUsages.
         */
        public Builder packUsages(java.util.List < PackUsages> packUsages) {
            this.packUsages = packUsages;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeResourcePackUsageResponseBody build() {
            return new DescribeResourcePackUsageResponseBody(this);
        } 

    } 

    public static class PackUsages extends TeaModel {
        @NameInMap("Time")
        private Long time;

        @NameInMap("Traffic")
        private Float traffic;

        private PackUsages(Builder builder) {
            this.time = builder.time;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackUsages create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return traffic
         */
        public Float getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Long time; 
            private Float traffic; 

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Traffic.
             */
            public Builder traffic(Float traffic) {
                this.traffic = traffic;
                return this;
            }

            public PackUsages build() {
                return new PackUsages(this);
            } 

        } 

    }
}
