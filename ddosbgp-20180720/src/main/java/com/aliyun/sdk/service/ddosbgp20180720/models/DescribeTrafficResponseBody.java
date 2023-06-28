// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrafficResponseBody</p>
 */
public class DescribeTrafficResponseBody extends TeaModel {
    @NameInMap("FlowList")
    private java.util.List < FlowList> flowList;

    @NameInMap("RequestId")
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
         * The ID of the traffic statistics.
         */
        public Builder flowList(java.util.List < FlowList> flowList) {
            this.flowList = flowList;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
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
        @NameInMap("AttackBps")
        private Long attackBps;

        @NameInMap("AttackPps")
        private Long attackPps;

        @NameInMap("FlowType")
        private String flowType;

        @NameInMap("Kbps")
        private Integer kbps;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pps")
        private Integer pps;

        @NameInMap("Time")
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
             * AttackBps.
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * Queries traffic statistics of an Anti-DDoS Origin instance within a specific time period.
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
             * <p>
             * 
             * For more information about sample requests, see the "**Examples**" section of this topic.
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * Kbps.
             */
            public Builder kbps(Integer kbps) {
                this.kbps = kbps;
                return this;
            }

            /**
             * DescribeTraffic
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * WB269094
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            /**
             * The ID of the request.
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
