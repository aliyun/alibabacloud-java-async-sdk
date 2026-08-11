// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListNodeGroupRefreshTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeGroupRefreshTasksResponseBody</p>
 */
public class ListNodeGroupRefreshTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NodeGroupRefreshTasks")
    private java.util.List<NodeGroupRefreshTasks> nodeGroupRefreshTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNodeGroupRefreshTasksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupRefreshTasks = builder.nodeGroupRefreshTasks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeGroupRefreshTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeGroupRefreshTasks
     */
    public java.util.List<NodeGroupRefreshTasks> getNodeGroupRefreshTasks() {
        return this.nodeGroupRefreshTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NodeGroupRefreshTasks> nodeGroupRefreshTasks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNodeGroupRefreshTasksResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.nodeGroupRefreshTasks = model.nodeGroupRefreshTasks;
            this.requestId = model.requestId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * NodeGroupRefreshTasks.
         */
        public Builder nodeGroupRefreshTasks(java.util.List<NodeGroupRefreshTasks> nodeGroupRefreshTasks) {
            this.nodeGroupRefreshTasks = nodeGroupRefreshTasks;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>03668372-18FF-5959-98D9-6B36A4643C7A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodeGroupRefreshTasksResponseBody build() {
            return new ListNodeGroupRefreshTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeGroupRefreshTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeGroupRefreshTasksResponseBody</p>
     */
    public static class NodeGroupRefreshTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("FinishedCount")
        private Long finishedCount;

        @com.aliyun.core.annotation.NameInMap("MaxDisruptiveAction")
        private String maxDisruptiveAction;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeGroupRefreshTaskId")
        private String nodeGroupRefreshTaskId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalNodeCount")
        private Long totalNodeCount;

        private NodeGroupRefreshTasks(Builder builder) {
            this.endTime = builder.endTime;
            this.failedCount = builder.failedCount;
            this.finishedCount = builder.finishedCount;
            this.maxDisruptiveAction = builder.maxDisruptiveAction;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupRefreshTaskId = builder.nodeGroupRefreshTaskId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalNodeCount = builder.totalNodeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroupRefreshTasks create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return finishedCount
         */
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        /**
         * @return maxDisruptiveAction
         */
        public String getMaxDisruptiveAction() {
            return this.maxDisruptiveAction;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeGroupRefreshTaskId
         */
        public String getNodeGroupRefreshTaskId() {
            return this.nodeGroupRefreshTaskId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalNodeCount
         */
        public Long getTotalNodeCount() {
            return this.totalNodeCount;
        }

        public static final class Builder {
            private String endTime; 
            private Long failedCount; 
            private Long finishedCount; 
            private String maxDisruptiveAction; 
            private String nodeGroupId; 
            private String nodeGroupRefreshTaskId; 
            private String startTime; 
            private String status; 
            private Long totalNodeCount; 

            private Builder() {
            } 

            private Builder(NodeGroupRefreshTasks model) {
                this.endTime = model.endTime;
                this.failedCount = model.failedCount;
                this.finishedCount = model.finishedCount;
                this.maxDisruptiveAction = model.maxDisruptiveAction;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeGroupRefreshTaskId = model.nodeGroupRefreshTaskId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalNodeCount = model.totalNodeCount;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * FinishedCount.
             */
            public Builder finishedCount(Long finishedCount) {
                this.finishedCount = finishedCount;
                return this;
            }

            /**
             * MaxDisruptiveAction.
             */
            public Builder maxDisruptiveAction(String maxDisruptiveAction) {
                this.maxDisruptiveAction = maxDisruptiveAction;
                return this;
            }

            /**
             * NodeGroupId.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * NodeGroupRefreshTaskId.
             */
            public Builder nodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
                this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalNodeCount.
             */
            public Builder totalNodeCount(Long totalNodeCount) {
                this.totalNodeCount = totalNodeCount;
                return this;
            }

            public NodeGroupRefreshTasks build() {
                return new NodeGroupRefreshTasks(this);
            } 

        } 

    }
}
