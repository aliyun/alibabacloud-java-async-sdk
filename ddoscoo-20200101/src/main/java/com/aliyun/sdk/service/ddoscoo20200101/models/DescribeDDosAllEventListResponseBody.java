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
         * AttackEvents.
         */
        public Builder attackEvents(java.util.List < AttackEvents> attackEvents) {
            this.attackEvents = attackEvents;
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
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
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
             * Mbps.
             */
            public Builder mbps(Long mbps) {
                this.mbps = mbps;
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
             * StartTime.
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
