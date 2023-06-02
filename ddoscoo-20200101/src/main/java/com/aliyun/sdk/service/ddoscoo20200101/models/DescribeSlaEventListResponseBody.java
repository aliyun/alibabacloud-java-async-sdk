// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlaEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlaEventListResponseBody</p>
 */
public class DescribeSlaEventListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlaEvent")
    private java.util.List < SlaEvent> slaEvent;

    @NameInMap("Total")
    private Long total;

    private DescribeSlaEventListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slaEvent = builder.slaEvent;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlaEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slaEvent
     */
    public java.util.List < SlaEvent> getSlaEvent() {
        return this.slaEvent;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SlaEvent> slaEvent; 
        private Long total; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlaEvent.
         */
        public Builder slaEvent(java.util.List < SlaEvent> slaEvent) {
            this.slaEvent = slaEvent;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeSlaEventListResponseBody build() {
            return new DescribeSlaEventListResponseBody(this);
        } 

    } 

    public static class SlaEvent extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Region")
        private String region;

        @NameInMap("StartTime")
        private Long startTime;

        private SlaEvent(Builder builder) {
            this.endTime = builder.endTime;
            this.ip = builder.ip;
            this.region = builder.region;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaEvent create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private String ip; 
            private String region; 
            private Long startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SlaEvent build() {
                return new SlaEvent(this);
            } 

        } 

    }
}
