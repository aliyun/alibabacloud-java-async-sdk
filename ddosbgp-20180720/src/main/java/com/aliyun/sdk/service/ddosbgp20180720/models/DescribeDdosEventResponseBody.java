// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
    private java.util.List<Events> events;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
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
        private java.util.List<Events> events; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(DescribeDdosEventResponseBody model) {
            this.events = model.events;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The details of the DDoS attack events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F3B6C3F9-6B21-519D-B976-A1E14166F909</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of DDoS attack events returned.</p>
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

            private Builder() {
            } 

            private Builder(Events model) {
                this.endTime = model.endTime;
                this.ip = model.ip;
                this.mbps = model.mbps;
                this.pps = model.pps;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The end time of the attack. The time is a UNIX timestamp in seconds.</p>
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
             * <p>The traffic volume at the start of the attack. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mbps(Integer mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * <p>The packet rate at the start of the attack. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The end time of the attack. The time is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637554034</p>
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The current status of the attack event. Valid values:</p>
             * <ul>
             * <li><strong>hole_begin</strong>: Indicates that the attacked IP address is in the blackhole filtering status.</li>
             * <li><strong>hole_end</strong>: Indicates that the attacked IP address is removed from the blackhole filtering status.</li>
             * <li><strong>defense_begin</strong>: Indicates that the system scrubs traffic.</li>
             * <li><strong>defense_end</strong>: Indicates that the attack ends and the system scrubs traffic no more.</li>
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
