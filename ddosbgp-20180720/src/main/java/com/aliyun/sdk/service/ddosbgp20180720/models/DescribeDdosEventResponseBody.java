// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDdosEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosEventResponseBody</p>
 */
public class DescribeDdosEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List < Events> events;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The details about the DDoS attack event.</p>
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F3B6C3F9-6B21-519D-B976-A1E14166F909</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of DDoS attack events that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDdosEventResponseBody build() {
            return new DescribeDdosEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDdosEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosEventResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Mbps")
        private Integer mbps;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Integer pps;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The time when the DDoS attack stopped. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637554335</p>
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The attacked IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.89.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The volume of the request traffic at the start of the DDoS attack. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mbps(Integer mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * <p>The number of packets at the start of the DDoS attack. Unit: packets per second (PPS).</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The time when the DDoS attack started. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637554034</p>
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the DDoS attack event. Valid values:</p>
             * <ul>
             * <li><strong>hole_begin</strong>: indicates that blackhole filtering is triggered for the attacked IP address.</li>
             * <li><strong>hole_end</strong>: indicates that blackhole filtering is deactivated for the attacked IP address.</li>
             * <li><strong>defense_begin</strong>: indicates that attack traffic is being scrubbed.</li>
             * <li><strong>defense_end</strong>: indicates that attack traffic is scrubbed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>defense_end</p>
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
