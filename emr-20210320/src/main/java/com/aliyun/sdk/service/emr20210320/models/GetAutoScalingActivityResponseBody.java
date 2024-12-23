// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetAutoScalingActivityResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScalingActivityResponseBody</p>
 */
public class GetAutoScalingActivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivity")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the scaling activity.</p>
         */
        public Builder scalingActivity(ScalingActivity scalingActivity) {
            this.scalingActivity = scalingActivity;
            return this;
        }

        public GetAutoScalingActivityResponseBody build() {
            return new GetAutoScalingActivityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoScalingActivityResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingActivityResponseBody</p>
     */
    public static class ScalingActivity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private String activityId;

        @com.aliyun.core.annotation.NameInMap("ActivityResults")
        private java.util.List<ScalingActivityResult> activityResults;

        @com.aliyun.core.annotation.NameInMap("ActivityState")
        private String activityState;

        @com.aliyun.core.annotation.NameInMap("ActivityType")
        private String activityType;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ExpectNum")
        private Integer expectNum;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeGroupName")
        private String nodeGroupName;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("RuleDetail")
        private ScalingRule ruleDetail;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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
            this.policyType = builder.policyType;
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
        public java.util.List<ScalingActivityResult> getActivityResults() {
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
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
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
            private java.util.List<ScalingActivityResult> activityResults; 
            private String activityState; 
            private String activityType; 
            private String clusterId; 
            private String description; 
            private Long endTime; 
            private Integer expectNum; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private String operationId; 
            private String policyType; 
            private ScalingRule ruleDetail; 
            private String ruleName; 
            private Long startTime; 

            /**
             * <p>The ID of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>asa-36373b084d6b4b13aa50f4129a9e****</p>
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * <p>The instances that correspond to the scaling activity.</p>
             */
            public Builder activityResults(java.util.List<ScalingActivityResult> activityResults) {
                this.activityResults = activityResults;
                return this;
            }

            /**
             * <p>The status of the scaling activity. Valid values:</p>
             * <ul>
             * <li>REJECTED</li>
             * <li>SUCCESSFUL</li>
             * <li>FAILED</li>
             * <li>IN_PROGRESS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_PROGRESS</p>
             */
            public Builder activityState(String activityState) {
                this.activityState = activityState;
                return this;
            }

            /**
             * <p>The type of the scaling activity. Valid value:</p>
             * <ul>
             * <li>SCALE_OUT</li>
             * <li>SCALE_IN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SCALE_OUT</p>
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-b933c5aac8fe****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The description of the scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>clusterId not exist</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when scaling ended.</p>
             * 
             * <strong>example:</strong>
             * <p>1639715634819</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of added or removed instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder expectNum(Integer expectNum) {
                this.expectNum = expectNum;
                return this;
            }

            /**
             * <p>The ID of the node group.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-869471354ecd****</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The name of the node group.</p>
             * 
             * <strong>example:</strong>
             * <p>task-01</p>
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * <p>The operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>op-13c37a77c505****</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The description of the scaling rule.</p>
             */
            public Builder ruleDetail(ScalingRule ruleDetail) {
                this.ruleDetail = ruleDetail;
                return this;
            }

            /**
             * <p>The name of the scaling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>scaling-out-memory</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The time when scaling started.</p>
             * 
             * <strong>example:</strong>
             * <p>1639714634819</p>
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
