// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosEventResponseBody</p>
 */
public class DescribeDdosEventResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < Events> events;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeDdosEventResponseBody(Builder builder) {
        this.events = builder.events;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosEventResponseBody create() {
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

        public DescribeDdosEventResponseBody build() {
            return new DescribeDdosEventResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Mbps")
        private Integer mbps;

        @NameInMap("Pps")
        private Integer pps;

        @NameInMap("StartTime")
        private Integer startTime;

        @NameInMap("Status")
        private String status;

        private Events(Builder builder) {
            this.endTime = builder.endTime;
            this.ip = builder.ip;
            this.mbps = builder.mbps;
            this.pps = builder.pps;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return mbps
         */
        public Integer getMbps() {
            return this.mbps;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer endTime; 
            private String ip; 
            private Integer mbps; 
            private Integer pps; 
            private Integer startTime; 
            private String status; 

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
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
             * Mbps.
             */
            public Builder mbps(Integer mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * Pps.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
