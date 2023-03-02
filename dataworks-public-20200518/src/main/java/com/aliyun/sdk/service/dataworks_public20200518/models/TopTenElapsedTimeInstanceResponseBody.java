// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TopTenElapsedTimeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>TopTenElapsedTimeInstanceResponseBody</p>
 */
public class TopTenElapsedTimeInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceConsumeTimeRank")
    private InstanceConsumeTimeRank instanceConsumeTimeRank;

    @NameInMap("RequestId")
    private String requestId;

    private TopTenElapsedTimeInstanceResponseBody(Builder builder) {
        this.instanceConsumeTimeRank = builder.instanceConsumeTimeRank;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TopTenElapsedTimeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceConsumeTimeRank
     */
    public InstanceConsumeTimeRank getInstanceConsumeTimeRank() {
        return this.instanceConsumeTimeRank;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceConsumeTimeRank instanceConsumeTimeRank; 
        private String requestId; 

        /**
         * The ranking record of the running durations of the instances.
         */
        public Builder instanceConsumeTimeRank(InstanceConsumeTimeRank instanceConsumeTimeRank) {
            this.instanceConsumeTimeRank = instanceConsumeTimeRank;
            return this;
        }

        /**
         * The ID of the request. You can troubleshoot errors based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TopTenElapsedTimeInstanceResponseBody build() {
            return new TopTenElapsedTimeInstanceResponseBody(this);
        } 

    } 

    public static class ConsumeTimeRank extends TeaModel {
        @NameInMap("BusinessDate")
        private Long businessDate;

        @NameInMap("Consumed")
        private Long consumed;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProgramType")
        private Integer programType;

        private ConsumeTimeRank(Builder builder) {
            this.businessDate = builder.businessDate;
            this.consumed = builder.consumed;
            this.instanceId = builder.instanceId;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.programType = builder.programType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumeTimeRank create() {
            return builder().build();
        }

        /**
         * @return businessDate
         */
        public Long getBusinessDate() {
            return this.businessDate;
        }

        /**
         * @return consumed
         */
        public Long getConsumed() {
            return this.consumed;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return programType
         */
        public Integer getProgramType() {
            return this.programType;
        }

        public static final class Builder {
            private Long businessDate; 
            private Long consumed; 
            private Long instanceId; 
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Integer programType; 

            /**
             * The data timestamp of the instance.
             */
            public Builder businessDate(Long businessDate) {
                this.businessDate = businessDate;
                return this;
            }

            /**
             * The running duration of the instance. Unit: seconds.
             */
            public Builder consumed(Long consumed) {
                this.consumed = consumed;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the owner of the node.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The type of the node.
             * <p>
             * 
             * Valid values:
             * 
             * 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)
             */
            public Builder programType(Integer programType) {
                this.programType = programType;
                return this;
            }

            public ConsumeTimeRank build() {
                return new ConsumeTimeRank(this);
            } 

        } 

    }
    public static class InstanceConsumeTimeRank extends TeaModel {
        @NameInMap("ConsumeTimeRank")
        private java.util.List < ConsumeTimeRank> consumeTimeRank;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private InstanceConsumeTimeRank(Builder builder) {
            this.consumeTimeRank = builder.consumeTimeRank;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceConsumeTimeRank create() {
            return builder().build();
        }

        /**
         * @return consumeTimeRank
         */
        public java.util.List < ConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < ConsumeTimeRank> consumeTimeRank; 
            private Long updateTime; 

            /**
             * The ranking data of the running durations of the instances.
             */
            public Builder consumeTimeRank(java.util.List < ConsumeTimeRank> consumeTimeRank) {
                this.consumeTimeRank = consumeTimeRank;
                return this;
            }

            /**
             * The timestamp at which the ranking of the running durations of the instances was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InstanceConsumeTimeRank build() {
                return new InstanceConsumeTimeRank(this);
            } 

        } 

    }
}
