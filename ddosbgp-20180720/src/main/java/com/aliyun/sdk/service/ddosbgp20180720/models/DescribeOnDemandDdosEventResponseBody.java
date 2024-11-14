// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOnDemandDdosEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnDemandDdosEventResponseBody</p>
 */
public class DescribeOnDemandDdosEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List < Events> events;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeOnDemandDdosEventResponseBody(Builder builder) {
        this.events = builder.events;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnDemandDdosEventResponseBody create() {
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
         * <p>6A507DC8-F657-4C13-84E2-D1D1B9400753</p>
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

        public DescribeOnDemandDdosEventResponseBody build() {
            return new DescribeOnDemandDdosEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOnDemandDdosEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnDemandDdosEventResponseBody</p>
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
             * <p>1557891306</p>
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The attacked IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The attack traffic. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>110000</p>
             */
            public Builder mbps(Integer mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * <p>The packet forwarding rate of the DDoS attack. Unit: packets per second (PPS).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The time when the DDoS attack started. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1557889506</p>
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the DDoS attack event. Valid values:</p>
             * <ul>
             * <li><strong>hole_begin</strong>: indicates that blackhole filtering is triggered.</li>
             * <li><strong>hole_end</strong>: indicates that tblackhole filtering is deactivated.</li>
             * <li><strong>defense_begin</strong>: indicates that traffic scrubbing is in progress.</li>
             * <li><strong>defense_end</strong>: indicates that traffic scrubbing is complete.</li>
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
