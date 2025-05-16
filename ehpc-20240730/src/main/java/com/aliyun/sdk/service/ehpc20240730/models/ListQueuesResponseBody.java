// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
    private java.util.List<Queues> queues;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Queues> getQueues() {
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
        private java.util.List<Queues> queues; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListQueuesResponseBody model) {
            this.clusterId = model.clusterId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.queues = model.queues;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The information about the queues.</p>
         */
        public Builder queues(java.util.List<Queues> queues) {
            this.queues = queues;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C6E5005C-00B0-4F27-98BB-95AB88016C22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQueuesResponseBody build() {
            return new ListQueuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.creatingCounts = model.creatingCounts;
                this.exceptionCounts = model.exceptionCounts;
                this.runningCounts = model.runningCounts;
            } 

            /**
             * <p>The number of compute nodes that are not ready.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder creatingCounts(Integer creatingCounts) {
                this.creatingCounts = creatingCounts;
                return this;
            }

            /**
             * <p>The number of malfunctioning compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exceptionCounts(Integer exceptionCounts) {
                this.exceptionCounts = exceptionCounts;
                return this;
            }

            /**
             * <p>The number of running compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueuesResponseBody</p>
     */
    public static class Queues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputeNodes")
        private java.util.List<NodeTemplate> computeNodes;

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
        private java.util.List<String> vSwitchIds;

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
        public java.util.List<NodeTemplate> getComputeNodes() {
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
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private java.util.List<NodeTemplate> computeNodes; 
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
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Queues model) {
                this.computeNodes = model.computeNodes;
                this.createTime = model.createTime;
                this.enableScaleIn = model.enableScaleIn;
                this.enableScaleOut = model.enableScaleOut;
                this.maxCount = model.maxCount;
                this.maxCountPerCycle = model.maxCountPerCycle;
                this.minCount = model.minCount;
                this.nodes = model.nodes;
                this.queueName = model.queueName;
                this.totalCores = model.totalCores;
                this.updateTime = model.updateTime;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The hardware configurations of the compute nodes that are added in auto scale-outs. Up to five nodes are displayed.</p>
             */
            public Builder computeNodes(java.util.List<NodeTemplate> computeNodes) {
                this.computeNodes = computeNodes;
                return this;
            }

            /**
             * <p>The time when the queue was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-10T02:04:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether auto scale-in is enabled for the queue. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableScaleIn(Boolean enableScaleIn) {
                this.enableScaleIn = enableScaleIn;
                return this;
            }

            /**
             * <p>Indicates whether auto scale-out is enabled for the queue. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableScaleOut(Boolean enableScaleOut) {
                this.enableScaleOut = enableScaleOut;
                return this;
            }

            /**
             * <p>The maximum number of compute nodes that the queue can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxCount(Integer maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes that are added to the queue in each auto scale-out.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxCountPerCycle(Integer maxCountPerCycle) {
                this.maxCountPerCycle = maxCountPerCycle;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes that the queue must contain.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minCount(Integer minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * <p>The statistics about the compute nodes in the queue.</p>
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>comp</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The total number of vCPUs that are used by all compute nodes in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder totalCores(Integer totalCores) {
                this.totalCores = totalCores;
                return this;
            }

            /**
             * <p>The time when the queue was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-25T02:02:32</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The vSwitches that can be used for added nodes during auto scale-outs. Up to three vSwitches are displayed.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Queues build() {
                return new Queues(this);
            } 

        } 

    }
}
