// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link TopTenElapsedTimeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>TopTenElapsedTimeInstanceResponseBody</p>
 */
public class TopTenElapsedTimeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceConsumeTimeRank")
    private InstanceConsumeTimeRank instanceConsumeTimeRank;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TopTenElapsedTimeInstanceResponseBody model) {
            this.instanceConsumeTimeRank = model.instanceConsumeTimeRank;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ranking record of the running durations of the instances.</p>
         */
        public Builder instanceConsumeTimeRank(InstanceConsumeTimeRank instanceConsumeTimeRank) {
            this.instanceConsumeTimeRank = instanceConsumeTimeRank;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6347364dadsfadf****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TopTenElapsedTimeInstanceResponseBody build() {
            return new TopTenElapsedTimeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TopTenElapsedTimeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>TopTenElapsedTimeInstanceResponseBody</p>
     */
    public static class ConsumeTimeRank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessDate")
        private Long businessDate;

        @com.aliyun.core.annotation.NameInMap("Consumed")
        private Long consumed;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProgramType")
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

            private Builder() {
            } 

            private Builder(ConsumeTimeRank model) {
                this.businessDate = model.businessDate;
                this.consumed = model.consumed;
                this.instanceId = model.instanceId;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.owner = model.owner;
                this.programType = model.programType;
            } 

            /**
             * <p>The data timestamp of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1600963200000</p>
             */
            public Builder businessDate(Long businessDate) {
                this.businessDate = businessDate;
                return this;
            }

            /**
             * <p>The run time length of the instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder consumed(Long consumed) {
                this.consumed = consumed;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>95279527</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9527</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Node name</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>952795279527</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The type of the node. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link TopTenElapsedTimeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>TopTenElapsedTimeInstanceResponseBody</p>
     */
    public static class InstanceConsumeTimeRank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumeTimeRank")
        private java.util.List<ConsumeTimeRank> consumeTimeRank;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
        public java.util.List<ConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<ConsumeTimeRank> consumeTimeRank; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(InstanceConsumeTimeRank model) {
                this.consumeTimeRank = model.consumeTimeRank;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ranking data of the running durations of the instances.</p>
             */
            public Builder consumeTimeRank(java.util.List<ConsumeTimeRank> consumeTimeRank) {
                this.consumeTimeRank = consumeTimeRank;
                return this;
            }

            /**
             * <p>The timestamp at which the ranking of the running durations of the instances was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1600963200000</p>
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
