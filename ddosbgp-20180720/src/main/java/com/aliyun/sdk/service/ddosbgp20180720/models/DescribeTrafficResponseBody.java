// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrafficResponseBody</p>
 */
public class DescribeTrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowList")
    private java.util.List < FlowList> flowList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTrafficResponseBody(Builder builder) {
        this.flowList = builder.flowList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowList
     */
    public java.util.List < FlowList> getFlowList() {
        return this.flowList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FlowList> flowList; 
        private String requestId; 

        /**
         * The queried traffic statistics.
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrafficResponseBody build() {
            return new DescribeTrafficResponseBody(this);
        } 

    } 

    public static class FlowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackBps")
        private Long attackBps;

        @com.aliyun.core.annotation.NameInMap("AttackPps")
        private Long attackPps;

        @com.aliyun.core.annotation.NameInMap("FlowType")
        private String flowType;

        @com.aliyun.core.annotation.NameInMap("Kbps")
        private Integer kbps;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Integer pps;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Integer time;

        private FlowList(Builder builder) {
            this.attackBps = builder.attackBps;
            this.attackPps = builder.attackPps;
            this.flowType = builder.flowType;
            this.kbps = builder.kbps;
            this.name = builder.name;
            this.pps = builder.pps;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowList create() {
            return builder().build();
        }

        /**
         * @return attackBps
         */
        public Long getAttackBps() {
            return this.attackBps;
        }

        /**
         * @return attackPps
         */
        public Long getAttackPps() {
            return this.attackPps;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        /**
         * @return kbps
         */
        public Integer getKbps() {
            return this.kbps;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long attackBps; 
            private Long attackPps; 
            private String flowType; 
            private Integer kbps; 
            private String name; 
            private Integer pps; 
            private Integer time; 

            /**
             * The bandwidth of attack traffic. Unit: bit/s.
             * <p>
             * 
             * >  This parameter is returned only if attack traffic exists.
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * The packet forwarding rate of attack traffic. Unit: packets per second.
             * <p>
             * 
             * >  This parameter is returned only if attack traffic exists.
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * The type of the traffic statistics. Valid values:
             * <p>
             * 
             * *   **max**: the peak traffic within the specified interval
             * *   **avg**: the average traffic within the specified interval
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * The bandwidth of the total traffic. Unit: Kbit/s.
             */
            public Builder kbps(Integer kbps) {
                this.kbps = kbps;
                return this;
            }

            /**
             * The ID of the traffic statistics.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The packet forwarding rate of the total traffic. Unit: packets per second.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * The time when the traffic statistics are calculated. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public FlowList build() {
                return new FlowList(this);
            } 

        } 

    }
}
