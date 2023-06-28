// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopTrafficResponseBody</p>
 */
public class DescribeTopTrafficResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    @NameInMap("TrafficList")
    private java.util.List < TrafficList> trafficList;

    private DescribeTopTrafficResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.trafficList = builder.trafficList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopTrafficResponseBody create() {
        return builder().build();
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

    /**
     * @return trafficList
     */
    public java.util.List < TrafficList> getTrafficList() {
        return this.trafficList;
    }

    public static final class Builder {
        private String requestId; 
        private Long total; 
        private java.util.List < TrafficList> trafficList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * The information about the traffic that is forwarded by the on-demand instance.
         */
        public Builder trafficList(java.util.List < TrafficList> trafficList) {
            this.trafficList = trafficList;
            return this;
        }

        public DescribeTopTrafficResponseBody build() {
            return new DescribeTopTrafficResponseBody(this);
        } 

    } 

    public static class TrafficList extends TeaModel {
        @NameInMap("AttackBps")
        private Integer attackBps;

        @NameInMap("AttackPps")
        private Integer attackPps;

        @NameInMap("Bps")
        private Integer bps;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Pps")
        private Integer pps;

        private TrafficList(Builder builder) {
            this.attackBps = builder.attackBps;
            this.attackPps = builder.attackPps;
            this.bps = builder.bps;
            this.ip = builder.ip;
            this.pps = builder.pps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficList create() {
            return builder().build();
        }

        /**
         * @return attackBps
         */
        public Integer getAttackBps() {
            return this.attackBps;
        }

        /**
         * @return attackPps
         */
        public Integer getAttackPps() {
            return this.attackPps;
        }

        /**
         * @return bps
         */
        public Integer getBps() {
            return this.bps;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        public static final class Builder {
            private Integer attackBps; 
            private Integer attackPps; 
            private Integer bps; 
            private String ip; 
            private Integer pps; 

            /**
             * The attack traffic. Unit: Kbit/s.
             */
            public Builder attackBps(Integer attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * The number of attack data packets. Unit: packets per second (pps).
             */
            public Builder attackPps(Integer attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * The total traffic. Unit: Kbit/s.
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The IP address from which the most traffic is forwarded by the on-demand instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The total number of data packets. Unit: pps.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            public TrafficList build() {
                return new TrafficList(this);
            } 

        } 

    }
}
