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
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. If NextToken is empty, no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>563d42ae0b17572449ec8c97f7f66069</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of node group refresh tasks.</p>
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
             * <p>The end time of the refresh task in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20T10:30:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of failed nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The number of finished nodes, including succeeded, failed, and skipped nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder finishedCount(Long finishedCount) {
                this.finishedCount = finishedCount;
                return this;
            }

            /**
             * <p>The maximum disruptive action level allowed for the refresh operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Refresh</p>
             */
            public Builder maxDisruptiveAction(String maxDisruptiveAction) {
                this.maxDisruptiveAction = maxDisruptiveAction;
                return this;
            }

            /**
             * <p>The node group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-3525</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>task-159136551662516768776</p>
             */
            public Builder nodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
                this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
                return this;
            }

            /**
             * <p>The start time of the refresh task in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20T10:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>Pending: The refresh task is created and waiting to be executed.</li>
             * <li>InProgress: The refresh task is being processed.</li>
             * <li>Success: The refresh task is executed.</li>
             * <li>Failed: The refresh task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InProgress</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of nodes to be refreshed by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
