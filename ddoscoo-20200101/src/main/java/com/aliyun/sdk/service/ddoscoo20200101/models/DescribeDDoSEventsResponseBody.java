// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDDoSEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSEventsResponseBody</p>
 */
public class DescribeDDoSEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DDoSEvents")
    private java.util.List < DDoSEvents> dDoSEvents;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The DDoS attack events.</p>
         */
        public Builder dDoSEvents(java.util.List < DDoSEvents> dDoSEvents) {
            this.dDoSEvents = dDoSEvents;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0CA72AF5-1795-4350-8C77-50A448A2F334</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned attack events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDDoSEventsResponseBody build() {
            return new DescribeDDoSEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDoSEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDoSEventsResponseBody</p>
     */
    public static class DDoSEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Long bps;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Long pps;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
             * <p>The bandwidth of attack traffic. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The time when the DDoS attack stopped. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583933330</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The type of the attack event. Valid values:</p>
             * <ul>
             * <li><strong>defense</strong>: traffic scrubbing events</li>
             * <li><strong>blackhole</strong>: blackhole filtering events</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>blackhole</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The attacked IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>203.<em><strong>.</strong></em>.132</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The attacked port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The packet forwarding rate of attack traffic. Unit: packets per second (pps).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The region from which the attack was launched. Valid values:</p>
             * <ul>
             * <li><strong>cn</strong>: a region in the Chinese mainland</li>
             * <li><strong>alb-ap-northeast-1-gf-x</strong>: Japan (Tokyo)</li>
             * <li><strong>alb-ap-southeast-gf-x</strong>: Singapore</li>
             * <li><strong>alb-cn-hongkong-gf-x</strong>: Hong Kong (China)</li>
             * <li><strong>alb-eu-central-1-gf-x</strong>: Germany (Frankfurt)</li>
             * <li><strong>alb-us-west-1-gf-x</strong>: US (Silicon Valley)</li>
             * </ul>
             * <blockquote>
             * <p>The values except <strong>cn</strong> are returned only when <strong>RegionId</strong> is set to <strong>ap-southeast-1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The time when the DDoS attack started. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1583933277</p>
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
