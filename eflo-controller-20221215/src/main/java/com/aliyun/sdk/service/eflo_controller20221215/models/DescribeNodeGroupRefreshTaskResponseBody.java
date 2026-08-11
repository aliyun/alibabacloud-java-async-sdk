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
         * Nodes.
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
             * ActualValue.
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * MinRequiredAction.
             */
            public Builder minRequiredAction(String minRequiredAction) {
                this.minRequiredAction = minRequiredAction;
                return this;
            }

            /**
             * PropertyPath.
             */
            public Builder propertyPath(String propertyPath) {
                this.propertyPath = propertyPath;
                return this;
            }

            /**
             * Skipped.
             */
            public Builder skipped(Boolean skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * TargetValue.
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
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * PropertyDrifts.
             */
            public Builder propertyDrifts(java.util.List<PropertyDrifts> propertyDrifts) {
                this.propertyDrifts = propertyDrifts;
                return this;
            }

            /**
             * Status.
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
