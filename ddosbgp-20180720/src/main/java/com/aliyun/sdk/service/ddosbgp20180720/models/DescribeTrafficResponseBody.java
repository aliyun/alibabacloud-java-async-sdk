// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The queried traffic statistics.</p>
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6A507DC8-F657-4C13-84E2-D1D1B9400753</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrafficResponseBody build() {
            return new DescribeTrafficResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrafficResponseBody</p>
     */
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
             * <p>The bandwidth of attack traffic. Unit: bit/s.</p>
             * <blockquote>
             * <p> This parameter is returned only if attack traffic exists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * <p>The packet forwarding rate of attack traffic. Unit: packets per second.</p>
             * <blockquote>
             * <p> This parameter is returned only if attack traffic exists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * <p>The type of the traffic statistics. Valid values:</p>
             * <ul>
             * <li><strong>max</strong>: the peak traffic within the specified interval</li>
             * <li><strong>avg</strong>: the average traffic within the specified interval</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>max</p>
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * <p>The bandwidth of the total traffic. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>417</p>
             */
            public Builder kbps(Integer kbps) {
                this.kbps = kbps;
                return this;
            }

            /**
             * <p>The ID of the traffic statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>8e33f19e-5644-11eb-b5c1-d89d67182200</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The packet forwarding rate of the total traffic. Unit: packets per second.</p>
             * 
             * <strong>example:</strong>
             * <p>274</p>
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The time when the traffic statistics are calculated. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620951900</p>
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
