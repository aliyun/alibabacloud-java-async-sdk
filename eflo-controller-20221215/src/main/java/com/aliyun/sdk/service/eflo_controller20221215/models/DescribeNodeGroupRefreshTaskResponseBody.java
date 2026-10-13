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
 * {@link DescribeNodeGroupRefreshTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeGroupRefreshTaskResponseBody</p>
 */
public class DescribeNodeGroupRefreshTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Long failedCount;

    @com.aliyun.core.annotation.NameInMap("FinishedCount")
    private Long finishedCount;

    @com.aliyun.core.annotation.NameInMap("MaxDisruptiveAction")
    private String maxDisruptiveAction;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupRefreshTaskId")
    private String nodeGroupRefreshTaskId;

    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalNodeCount")
    private Long totalNodeCount;

    private DescribeNodeGroupRefreshTaskResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.failedCount = builder.failedCount;
        this.finishedCount = builder.finishedCount;
        this.maxDisruptiveAction = builder.maxDisruptiveAction;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupRefreshTaskId = builder.nodeGroupRefreshTaskId;
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.totalNodeCount = builder.totalNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeGroupRefreshTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Integer maxResults; 
        private String nextToken; 
        private String nodeGroupId; 
        private String nodeGroupRefreshTaskId; 
        private java.util.List<Nodes> nodes; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private Long totalNodeCount; 

        private Builder() {
        } 

        private Builder(DescribeNodeGroupRefreshTaskResponseBody model) {
            this.endTime = model.endTime;
            this.failedCount = model.failedCount;
            this.finishedCount = model.finishedCount;
            this.maxDisruptiveAction = model.maxDisruptiveAction;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.nodeGroupId = model.nodeGroupId;
            this.nodeGroupRefreshTaskId = model.nodeGroupRefreshTaskId;
            this.nodes = model.nodes;
            this.requestId = model.requestId;
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
         * <p>The pagination token for the next query. An empty value indicates that no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>7ed93fda-5e7f-436a-ae5a-bd8e6b04e36b</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>The refresh task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-159136551662516768776</p>
         */
        public Builder nodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
            this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
            return this;
        }

        /**
         * <p>The list of nodes.</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <li>Pending: the refresh task is created and waiting to be executed.</li>
         * <li>InProgress: the refresh task is being processed.</li>
         * <li>Success: the refresh task is executed.</li>
         * <li>Failed: the refresh task failed to be executed.</li>
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
         * <p>The total number of nodes to be refreshed in the task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalNodeCount(Long totalNodeCount) {
            this.totalNodeCount = totalNodeCount;
            return this;
        }

        public DescribeNodeGroupRefreshTaskResponseBody build() {
            return new DescribeNodeGroupRefreshTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeGroupRefreshTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeGroupRefreshTaskResponseBody</p>
     */
    public static class PropertyDrifts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualValue")
        private String actualValue;

        @com.aliyun.core.annotation.NameInMap("MinRequiredAction")
        private String minRequiredAction;

        @com.aliyun.core.annotation.NameInMap("PropertyPath")
        private String propertyPath;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private Boolean skipped;

        @com.aliyun.core.annotation.NameInMap("TargetValue")
        private String targetValue;

        private PropertyDrifts(Builder builder) {
            this.actualValue = builder.actualValue;
            this.minRequiredAction = builder.minRequiredAction;
            this.propertyPath = builder.propertyPath;
            this.skipped = builder.skipped;
            this.targetValue = builder.targetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyDrifts create() {
            return builder().build();
        }

        /**
         * @return actualValue
         */
        public String getActualValue() {
            return this.actualValue;
        }

        /**
         * @return minRequiredAction
         */
        public String getMinRequiredAction() {
            return this.minRequiredAction;
        }

        /**
         * @return propertyPath
         */
        public String getPropertyPath() {
            return this.propertyPath;
        }

        /**
         * @return skipped
         */
        public Boolean getSkipped() {
            return this.skipped;
        }

        /**
         * @return targetValue
         */
        public String getTargetValue() {
            return this.targetValue;
        }

        public static final class Builder {
            private String actualValue; 
            private String minRequiredAction; 
            private String propertyPath; 
            private Boolean skipped; 
            private String targetValue; 

            private Builder() {
            } 

            private Builder(PropertyDrifts model) {
                this.actualValue = model.actualValue;
                this.minRequiredAction = model.minRequiredAction;
                this.propertyPath = model.propertyPath;
                this.skipped = model.skipped;
                this.targetValue = model.targetValue;
            } 

            /**
             * <p>The current value of the node property. Complex types are serialized as JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>old-role</p>
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * <p>The minimum action required to apply the target value: Refresh, Reboot, or Reimage. For more information, see the MaxDisruptiveAction parameter of the RefreshNodeGroupNodes operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Refresh</p>
             */
            public Builder minRequiredAction(String minRequiredAction) {
                this.minRequiredAction = minRequiredAction;
                return this;
            }

            /**
             * <p>The property path in dot notation.</p>
             * 
             * <strong>example:</strong>
             * <p>RamRoleName</p>
             */
            public Builder propertyPath(String propertyPath) {
                this.propertyPath = propertyPath;
                return this;
            }

            /**
             * <p>Indicates whether the property was skipped because it exceeded the MaxDisruptiveAction constraint.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skipped(Boolean skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * <p>The target value of the node property. Complex types are serialized as JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>new-role</p>
             */
            public Builder targetValue(String targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            public PropertyDrifts build() {
                return new PropertyDrifts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNodeGroupRefreshTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeGroupRefreshTaskResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PropertyDrifts")
        private java.util.List<PropertyDrifts> propertyDrifts;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Nodes(Builder builder) {
            this.action = builder.action;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.nodeId = builder.nodeId;
            this.propertyDrifts = builder.propertyDrifts;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return propertyDrifts
         */
        public java.util.List<PropertyDrifts> getPropertyDrifts() {
            return this.propertyDrifts;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String action; 
            private String errorCode; 
            private String errorMessage; 
            private String nodeId; 
            private java.util.List<PropertyDrifts> propertyDrifts; 
            private String status; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.action = model.action;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.nodeId = model.nodeId;
                this.propertyDrifts = model.propertyDrifts;
                this.status = model.status;
            } 

            /**
             * <p>The action level actually performed on the node. If multiple properties are refreshed on the node, the highest required action level is used. Valid values:</p>
             * <ul>
             * <li>Refresh: in-place refresh.</li>
             * <li>Reboot: restart.</li>
             * <li>Reimage: reimage.
             * If the entire node is skipped, this value is empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Refresh</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>NodeInMaintenance</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The node has been confirmed for maintenance and there is no need to confirm the maintenance again. sn: 21B917666,status:ClusterNodeRepairing</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>node-001</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The property drift list for the node, including both executed and skipped properties.</p>
             */
            public Builder propertyDrifts(java.util.List<PropertyDrifts> propertyDrifts) {
                this.propertyDrifts = propertyDrifts;
                return this;
            }

            /**
             * <p>The node refresh status. Valid values:</p>
             * <ul>
             * <li>Pending: the node is waiting to be refreshed.</li>
             * <li>InProgress: the node is being refreshed.</li>
             * <li>Success: the node is refreshed.</li>
             * <li>Failed: the node failed to be refreshed.</li>
             * <li>Skipped: all properties to be refreshed on the node exceeded the MaxDisruptiveAction constraint and were skipped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
