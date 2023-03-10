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
    private java.util.List < DDoSEvents> dDoSEvents;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeDDoSEventsResponseBody(Builder builder) {
        this.dDoSEvents = builder.dDoSEvents;
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
     * @return dDoSEvents
     */
    public java.util.List < DDoSEvents> getDDoSEvents() {
        return this.dDoSEvents;
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
        private java.util.List < DDoSEvents> dDoSEvents; 
        private String requestId; 
        private Long total; 

        /**
         * The DDoS attack events.
         */
        public Builder dDoSEvents(java.util.List < DDoSEvents> dDoSEvents) {
            this.dDoSEvents = dDoSEvents;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned attack events.
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
             * The bandwidth of attack traffic. Unit: bit/s.
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The time when the DDoS attack stopped. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The type of the attack event. Valid values:
             * <p>
             * 
             * *   **defense**: traffic scrubbing events
             * *   **blackhole**: blackhole filtering events
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The attacked IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The attacked port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The packet forwarding rate of attack traffic. Unit: packets per second (pps).
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * The region from which the attack was launched. Valid values:
             * <p>
             * 
             * *   **cn**: a region in the Chinese mainland
             * *   **alb-ap-northeast-1-gf-x**: Japan (Tokyo)
             * *   **alb-ap-southeast-gf-x**: Singapore
             * *   **alb-cn-hongkong-gf-x**: Hong Kong (China)
             * *   **alb-eu-central-1-gf-x**: Germany (Frankfurt)
             * *   **alb-us-west-1-gf-x**: US (Silicon Valley)
             * 
             * > The values except **cn** are returned only when **RegionId** is set to **ap-southeast-1**.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The time when the DDoS attack started. The value is a UNIX timestamp. Unit: seconds.
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
