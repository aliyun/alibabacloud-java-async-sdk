// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDoSEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSEventsResponseBody</p>
 */
public class DescribeDDoSEventsResponseBody extends TeaModel {
    @NameInMap("DDoSEvents")
    private java.util.List < DDoSEvents> DDoSEvents;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeDDoSEventsResponseBody(Builder builder) {
        this.DDoSEvents = builder.DDoSEvents;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DDoSEvents
     */
    public java.util.List < DDoSEvents> getDDoSEvents() {
        return this.DDoSEvents;
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
        private java.util.List < DDoSEvents> DDoSEvents; 
        private String requestId; 
        private Long total; 

        /**
         * DDoSEvents.
         */
        public Builder DDoSEvents(java.util.List < DDoSEvents> DDoSEvents) {
            this.DDoSEvents = DDoSEvents;
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

        public DescribeDDoSEventsResponseBody build() {
            return new DescribeDDoSEventsResponseBody(this);
        } 

    } 

    public static class DDoSEvents extends TeaModel {
        @NameInMap("Bps")
        private Long bps;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        private String port;

        @NameInMap("Pps")
        private Long pps;

        @NameInMap("Region")
        private String region;

        @NameInMap("StartTime")
        private Long startTime;

        private DDoSEvents(Builder builder) {
            this.bps = builder.bps;
            this.endTime = builder.endTime;
            this.eventType = builder.eventType;
            this.ip = builder.ip;
            this.port = builder.port;
            this.pps = builder.pps;
            this.region = builder.region;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DDoSEvents create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Long getBps() {
            return this.bps;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return pps
         */
        public Long getPps() {
            return this.pps;
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
            private Long bps; 
            private Long endTime; 
            private String eventType; 
            private String ip; 
            private String port; 
            private Long pps; 
            private String region; 
            private Long startTime; 

            /**
             * Bps.
             */
            public Builder bps(Long bps) {
                this.bps = bps;
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
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
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
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Pps.
             */
            public Builder pps(Long pps) {
                this.pps = pps;
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

            public DDoSEvents build() {
                return new DDoSEvents(this);
            } 

        } 

    }
}
