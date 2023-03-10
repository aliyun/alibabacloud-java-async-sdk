// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosAllEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDosAllEventListResponseBody</p>
 */
public class DescribeDDosAllEventListResponseBody extends TeaModel {
    @NameInMap("AttackEvents")
    private java.util.List < AttackEvents> attackEvents;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private DescribeDDosAllEventListResponseBody(Builder builder) {
        this.attackEvents = builder.attackEvents;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDosAllEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackEvents
     */
    public java.util.List < AttackEvents> getAttackEvents() {
        return this.attackEvents;
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
        private java.util.List < AttackEvents> attackEvents; 
        private String requestId; 
        private Long total; 

        /**
         * An array that consists of attack events.
         */
        public Builder attackEvents(java.util.List < AttackEvents> attackEvents) {
            this.attackEvents = attackEvents;
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
         * The total number of DDoS attack events.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDDosAllEventListResponseBody build() {
            return new DescribeDDosAllEventListResponseBody(this);
        } 

    } 

    public static class AttackEvents extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Mbps")
        private Long mbps;

        @NameInMap("Port")
        private String port;

        @NameInMap("Pps")
        private Long pps;

        @NameInMap("StartTime")
        private Long startTime;

        private AttackEvents(Builder builder) {
            this.area = builder.area;
            this.endTime = builder.endTime;
            this.eventType = builder.eventType;
            this.ip = builder.ip;
            this.mbps = builder.mbps;
            this.port = builder.port;
            this.pps = builder.pps;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackEvents create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
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
         * @return mbps
         */
        public Long getMbps() {
            return this.mbps;
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
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String area; 
            private Long endTime; 
            private String eventType; 
            private String ip; 
            private Long mbps; 
            private String port; 
            private Long pps; 
            private Long startTime; 

            /**
             * The source location or region from which the attack was initiated. Valid values:
             * <p>
             * 
             * *   **cn**: Chinese mainland
             * *   **alb-cn-hongkong-gf-2**: China (Hongkong)
             * *   **alb-us-west-1-gf-2**: US (Silicon Valley)
             * *   **alb-ap-northeast-1-gf-1**: Japan (Tokyo)
             * *   **alb-ap-southeast-gf-1**: Singapore
             * *   **alb-eu-central-1-gf-1**: Germany (Frankfurt)
             * *   **alb-eu-central-1-gf-1** or **selb-eu-west-1-gf-1a**: UK (London)
             * *   **alb-us-east-gf-1**: US (Virginia)
             * *   **CT-yundi**: China (Hongkong) This value is returned only for Anti-DDoS Premium instances of the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * The time when the DDoS attack stopped. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The type of the DDoS attack event. Valid values:
             * <p>
             * 
             * *   **web-cc**: resource exhaustion attacks
             * *   **cc**: connection flood attacks
             * *   **defense**: DDoS attacks that trigger traffic scrubbing
             * *   **blackhole**: DDoS attacks that trigger blackhole filtering
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The attacked object. The attacked object varies based on the attack event type. The following list describes different attacked objects of different attack event types:
             * <p>
             * 
             * *   If **EventType** is set to **web-cc**, the value of this parameter indicates the domain name of the attacked website.
             * *   If **EventType** is set to **cc**, the value of this parameter indicates the IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.
             * *   If **EventType** is set to **defense** or **blackhole**, the value of this parameter indicates the IP address of the attacked Anti-DDoS Pro or Anti-DDoS Premium instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The peak bandwidth of the attack traffic. Unit: Mbit/s.
             */
            public Builder mbps(Long mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * The attacked port.
             * <p>
             * 
             * > If **EventType** is set to **web-cc**, this parameter is not returned.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The peak packet forwarding rate of attack traffic. Unit: packets per second (pps).
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * The time when the DDoS attack started. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public AttackEvents build() {
                return new AttackEvents(this);
            } 

        } 

    }
}
