// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueuesResponseBody</p>
 */
public class ListQueuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Queues")
    private java.util.List < Queues> queues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListQueuesResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queues = builder.queues;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queues
     */
    public java.util.List < Queues> getQueues() {
        return this.queues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String clusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Queues> queues; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Queues.
         */
        public Builder queues(java.util.List < Queues> queues) {
            this.queues = queues;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQueuesResponseBody build() {
            return new ListQueuesResponseBody(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatingCounts")
        private Integer creatingCounts;

        @com.aliyun.core.annotation.NameInMap("ExceptionCounts")
        private Integer exceptionCounts;

        @com.aliyun.core.annotation.NameInMap("RunningCounts")
        private Integer runningCounts;

        private Nodes(Builder builder) {
            this.creatingCounts = builder.creatingCounts;
            this.exceptionCounts = builder.exceptionCounts;
            this.runningCounts = builder.runningCounts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return creatingCounts
         */
        public Integer getCreatingCounts() {
            return this.creatingCounts;
        }

        /**
         * @return exceptionCounts
         */
        public Integer getExceptionCounts() {
            return this.exceptionCounts;
        }

        /**
         * @return runningCounts
         */
        public Integer getRunningCounts() {
            return this.runningCounts;
        }

        public static final class Builder {
            private Integer creatingCounts; 
            private Integer exceptionCounts; 
            private Integer runningCounts; 

            /**
             * CreatingCounts.
             */
            public Builder creatingCounts(Integer creatingCounts) {
                this.creatingCounts = creatingCounts;
                return this;
            }

            /**
             * ExceptionCounts.
             */
            public Builder exceptionCounts(Integer exceptionCounts) {
                this.exceptionCounts = exceptionCounts;
                return this;
            }

            /**
             * RunningCounts.
             */
            public Builder runningCounts(Integer runningCounts) {
                this.runningCounts = runningCounts;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeNodes")
        private java.util.List < NodeTemplate > computeNodes;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnableScaleIn")
        private Boolean enableScaleIn;

        @com.aliyun.core.annotation.NameInMap("EnableScaleOut")
        private Boolean enableScaleOut;

        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private Integer maxCount;

        @com.aliyun.core.annotation.NameInMap("MaxCountPerCycle")
        private Integer maxCountPerCycle;

        @com.aliyun.core.annotation.NameInMap("MinCount")
        private Integer minCount;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private Nodes nodes;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("TotalCores")
        private Integer totalCores;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        private Queues(Builder builder) {
            this.computeNodes = builder.computeNodes;
            this.createTime = builder.createTime;
            this.enableScaleIn = builder.enableScaleIn;
            this.enableScaleOut = builder.enableScaleOut;
            this.maxCount = builder.maxCount;
            this.maxCountPerCycle = builder.maxCountPerCycle;
            this.minCount = builder.minCount;
            this.nodes = builder.nodes;
            this.queueName = builder.queueName;
            this.totalCores = builder.totalCores;
            this.updateTime = builder.updateTime;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queues create() {
            return builder().build();
        }

        /**
         * @return computeNodes
         */
        public java.util.List < NodeTemplate > getComputeNodes() {
            return this.computeNodes;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableScaleIn
         */
        public Boolean getEnableScaleIn() {
            return this.enableScaleIn;
        }

        /**
         * @return enableScaleOut
         */
        public Boolean getEnableScaleOut() {
            return this.enableScaleOut;
        }

        /**
         * @return maxCount
         */
        public Integer getMaxCount() {
            return this.maxCount;
        }

        /**
         * @return maxCountPerCycle
         */
        public Integer getMaxCountPerCycle() {
            return this.maxCountPerCycle;
        }

        /**
         * @return minCount
         */
        public Integer getMinCount() {
            return this.minCount;
        }

        /**
         * @return nodes
         */
        public Nodes getNodes() {
            return this.nodes;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return totalCores
         */
        public Integer getTotalCores() {
            return this.totalCores;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private java.util.List < NodeTemplate > computeNodes; 
            private String createTime; 
            private Boolean enableScaleIn; 
            private Boolean enableScaleOut; 
            private Integer maxCount; 
            private Integer maxCountPerCycle; 
            private Integer minCount; 
            private Nodes nodes; 
            private String queueName; 
            private Integer totalCores; 
            private String updateTime; 
            private java.util.List < String > vSwitchIds; 

            /**
             * ComputeNodes.
             */
            public Builder computeNodes(java.util.List < NodeTemplate > computeNodes) {
                this.computeNodes = computeNodes;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnableScaleIn.
             */
            public Builder enableScaleIn(Boolean enableScaleIn) {
                this.enableScaleIn = enableScaleIn;
                return this;
            }

            /**
             * EnableScaleOut.
             */
            public Builder enableScaleOut(Boolean enableScaleOut) {
                this.enableScaleOut = enableScaleOut;
                return this;
            }

            /**
             * MaxCount.
             */
            public Builder maxCount(Integer maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * MaxCountPerCycle.
             */
            public Builder maxCountPerCycle(Integer maxCountPerCycle) {
                this.maxCountPerCycle = maxCountPerCycle;
                return this;
            }

            /**
             * MinCount.
             */
            public Builder minCount(Integer minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * TotalCores.
             */
            public Builder totalCores(Integer totalCores) {
                this.totalCores = totalCores;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
