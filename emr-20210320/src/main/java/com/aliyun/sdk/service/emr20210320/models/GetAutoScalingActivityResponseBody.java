// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoScalingActivityResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScalingActivityResponseBody</p>
 */
public class GetAutoScalingActivityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingActivity")
    private ScalingActivity scalingActivity;

    private GetAutoScalingActivityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingActivity = builder.scalingActivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoScalingActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivity
     */
    public ScalingActivity getScalingActivity() {
        return this.scalingActivity;
    }

    public static final class Builder {
        private String requestId; 
        private ScalingActivity scalingActivity; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the scaling activity.
         */
        public Builder scalingActivity(ScalingActivity scalingActivity) {
            this.scalingActivity = scalingActivity;
            return this;
        }

        public GetAutoScalingActivityResponseBody build() {
            return new GetAutoScalingActivityResponseBody(this);
        } 

    } 

    public static class ScalingActivity extends TeaModel {
        @NameInMap("ActivityId")
        private String activityId;

        @NameInMap("ActivityResults")
        private java.util.List < ScalingActivityResult > activityResults;

        @NameInMap("ActivityState")
        private String activityState;

        @NameInMap("ActivityType")
        private String activityType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExpectNum")
        private Integer expectNum;

        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("NodeGroupName")
        private String nodeGroupName;

        @NameInMap("OperationId")
        private String operationId;

        @NameInMap("RuleDetail")
        private ScalingRule ruleDetail;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("StartTime")
        private Long startTime;

        private ScalingActivity(Builder builder) {
            this.activityId = builder.activityId;
            this.activityResults = builder.activityResults;
            this.activityState = builder.activityState;
            this.activityType = builder.activityType;
            this.clusterId = builder.clusterId;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.expectNum = builder.expectNum;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.operationId = builder.operationId;
            this.ruleDetail = builder.ruleDetail;
            this.ruleName = builder.ruleName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingActivity create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityResults
         */
        public java.util.List < ScalingActivityResult > getActivityResults() {
            return this.activityResults;
        }

        /**
         * @return activityState
         */
        public String getActivityState() {
            return this.activityState;
        }

        /**
         * @return activityType
         */
        public String getActivityType() {
            return this.activityType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return expectNum
         */
        public Integer getExpectNum() {
            return this.expectNum;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return ruleDetail
         */
        public ScalingRule getRuleDetail() {
            return this.ruleDetail;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String activityId; 
            private java.util.List < ScalingActivityResult > activityResults; 
            private String activityState; 
            private String activityType; 
            private String clusterId; 
            private String description; 
            private Long endTime; 
            private Integer expectNum; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private String operationId; 
            private ScalingRule ruleDetail; 
            private String ruleName; 
            private Long startTime; 

            /**
             * The ID of the scaling activity.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * The instances that correspond to the scaling activity.
             */
            public Builder activityResults(java.util.List < ScalingActivityResult > activityResults) {
                this.activityResults = activityResults;
                return this;
            }

            /**
             * The status of the scaling activity. Valid values:
             * <p>
             * 
             * *   REJECTED
             * *   SUCCESSFUL
             * *   FAILED
             * *   IN_PROGRESS
             */
            public Builder activityState(String activityState) {
                this.activityState = activityState;
                return this;
            }

            /**
             * The type of the scaling activity. Valid value:
             * <p>
             * 
             * *   SCALE_OUT
             * *   SCALE_IN
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The description of the scaling activity.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when scaling ended.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The number of added or removed instances.
             */
            public Builder expectNum(Integer expectNum) {
                this.expectNum = expectNum;
                return this;
            }

            /**
             * The ID of the node group.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * The name of the node group.
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * The operation ID.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * The description of the scaling rule.
             */
            public Builder ruleDetail(ScalingRule ruleDetail) {
                this.ruleDetail = ruleDetail;
                return this;
            }

            /**
             * The name of the scaling rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The time when scaling started.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public ScalingActivity build() {
                return new ScalingActivity(this);
            } 

        } 

    }
}
