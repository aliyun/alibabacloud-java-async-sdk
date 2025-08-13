// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeRecommendTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecommendTaskDetailResponseBody</p>
 */
public class DescribeRecommendTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeRecommendTaskDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendTaskDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeRecommendTaskDetailResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeRecommendTaskDetailResponseBody build() {
            return new DescribeRecommendTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecommendTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendTaskDetailResponseBody</p>
     */
    public static class RecommendRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("left")
        private String left;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("right")
        private String right;

        private RecommendRules(Builder builder) {
            this.left = builder.left;
            this.operator = builder.operator;
            this.right = builder.right;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendRules create() {
            return builder().build();
        }

        /**
         * @return left
         */
        public String getLeft() {
            return this.left;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return right
         */
        public String getRight() {
            return this.right;
        }

        public static final class Builder {
            private String left; 
            private String operator; 
            private String right; 

            private Builder() {
            } 

            private Builder(RecommendRules model) {
                this.left = model.left;
                this.operator = model.operator;
                this.right = model.right;
            } 

            /**
             * <p>Left variable</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder left(String left) {
                this.left = left;
                return this;
            }

            /**
             * <p>Operator</p>
             * 
             * <strong>example:</strong>
             * <p>equals</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Right variable</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder right(String right) {
                this.right = right;
                return this;
            }

            public RecommendRules build() {
                return new RecommendRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendTaskDetailResponseBody</p>
     */
    public static class RecommendRuleDTOs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("computeExpression")
        private String computeExpression;

        @com.aliyun.core.annotation.NameInMap("hitSample")
        private Long hitSample;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("notHitSample")
        private Long notHitSample;

        @com.aliyun.core.annotation.NameInMap("recommendRules")
        private java.util.List<RecommendRules> recommendRules;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("velocities")
        private String velocities;

        private RecommendRuleDTOs(Builder builder) {
            this.computeExpression = builder.computeExpression;
            this.hitSample = builder.hitSample;
            this.id = builder.id;
            this.notHitSample = builder.notHitSample;
            this.recommendRules = builder.recommendRules;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.velocities = builder.velocities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendRuleDTOs create() {
            return builder().build();
        }

        /**
         * @return computeExpression
         */
        public String getComputeExpression() {
            return this.computeExpression;
        }

        /**
         * @return hitSample
         */
        public Long getHitSample() {
            return this.hitSample;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return notHitSample
         */
        public Long getNotHitSample() {
            return this.notHitSample;
        }

        /**
         * @return recommendRules
         */
        public java.util.List<RecommendRules> getRecommendRules() {
            return this.recommendRules;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return velocities
         */
        public String getVelocities() {
            return this.velocities;
        }

        public static final class Builder {
            private String computeExpression; 
            private Long hitSample; 
            private Long id; 
            private Long notHitSample; 
            private java.util.List<RecommendRules> recommendRules; 
            private String ruleId; 
            private String ruleName; 
            private String status; 
            private String velocities; 

            private Builder() {
            } 

            private Builder(RecommendRuleDTOs model) {
                this.computeExpression = model.computeExpression;
                this.hitSample = model.hitSample;
                this.id = model.id;
                this.notHitSample = model.notHitSample;
                this.recommendRules = model.recommendRules;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.velocities = model.velocities;
            } 

            /**
             * <p>Calculation path</p>
             * 
             * <strong>example:</strong>
             * <p>1&amp;2</p>
             */
            public Builder computeExpression(String computeExpression) {
                this.computeExpression = computeExpression;
                return this;
            }

            /**
             * <p>Number of hit samples</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder hitSample(Long hitSample) {
                this.hitSample = hitSample;
                return this;
            }

            /**
             * <p>Primary key ID of the rule</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Number of unhit samples</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notHitSample(Long notHitSample) {
                this.notHitSample = notHitSample;
                return this;
            }

            /**
             * <p>List of candidate rules</p>
             */
            public Builder recommendRules(java.util.List<RecommendRules> recommendRules) {
                this.recommendRules = recommendRules;
                return this;
            }

            /**
             * <p>Strategy ID</p>
             * 
             * <strong>example:</strong>
             * <p>102224</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>Rule name</p>
             * 
             * <strong>example:</strong>
             * <p>营销风险识别评分_高风险_拒绝_副本</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Status</p>
             * 
             * <strong>example:</strong>
             * <p>NO_RULE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>List of indicators in JSON string format</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key&quot;:&quot;dxkkLw8fe18&quot;,&quot;value&quot;:&quot;2&quot;}]</p>
             */
            public Builder velocities(String velocities) {
                this.velocities = velocities;
                return this;
            }

            public RecommendRuleDTOs build() {
                return new RecommendRuleDTOs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendTaskDetailResponseBody</p>
     */
    public static class RecommendVariableDTOs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private RecommendVariableDTOs(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendVariableDTOs create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String title; 

            private Builder() {
            } 

            private Builder(RecommendVariableDTOs model) {
                this.id = model.id;
                this.title = model.title;
            } 

            /**
             * <p>Primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>手机号</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RecommendVariableDTOs build() {
                return new RecommendVariableDTOs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecommendTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecommendTaskDetailResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("expectVelocities")
        private java.util.List<String> expectVelocities;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("normalSize")
        private Long normalSize;

        @com.aliyun.core.annotation.NameInMap("recommendRuleDTOs")
        private java.util.List<RecommendRuleDTOs> recommendRuleDTOs;

        @com.aliyun.core.annotation.NameInMap("recommendVariableDTOs")
        private java.util.List<RecommendVariableDTOs> recommendVariableDTOs;

        @com.aliyun.core.annotation.NameInMap("riskSize")
        private Long riskSize;

        @com.aliyun.core.annotation.NameInMap("sampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("sampleScene")
        private String sampleScene;

        @com.aliyun.core.annotation.NameInMap("sampleSceneName")
        private String sampleSceneName;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        private ResultObject(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.expectVelocities = builder.expectVelocities;
            this.gmtCreate = builder.gmtCreate;
            this.normalSize = builder.normalSize;
            this.recommendRuleDTOs = builder.recommendRuleDTOs;
            this.recommendVariableDTOs = builder.recommendVariableDTOs;
            this.riskSize = builder.riskSize;
            this.sampleName = builder.sampleName;
            this.sampleScene = builder.sampleScene;
            this.sampleSceneName = builder.sampleSceneName;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return expectVelocities
         */
        public java.util.List<String> getExpectVelocities() {
            return this.expectVelocities;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return normalSize
         */
        public Long getNormalSize() {
            return this.normalSize;
        }

        /**
         * @return recommendRuleDTOs
         */
        public java.util.List<RecommendRuleDTOs> getRecommendRuleDTOs() {
            return this.recommendRuleDTOs;
        }

        /**
         * @return recommendVariableDTOs
         */
        public java.util.List<RecommendVariableDTOs> getRecommendVariableDTOs() {
            return this.recommendVariableDTOs;
        }

        /**
         * @return riskSize
         */
        public Long getRiskSize() {
            return this.riskSize;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return sampleScene
         */
        public String getSampleScene() {
            return this.sampleScene;
        }

        /**
         * @return sampleSceneName
         */
        public String getSampleSceneName() {
            return this.sampleSceneName;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 
            private java.util.List<String> expectVelocities; 
            private Long gmtCreate; 
            private Long normalSize; 
            private java.util.List<RecommendRuleDTOs> recommendRuleDTOs; 
            private java.util.List<RecommendVariableDTOs> recommendVariableDTOs; 
            private Long riskSize; 
            private String sampleName; 
            private String sampleScene; 
            private String sampleSceneName; 
            private Long taskId; 
            private String taskName; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.expectVelocities = model.expectVelocities;
                this.gmtCreate = model.gmtCreate;
                this.normalSize = model.normalSize;
                this.recommendRuleDTOs = model.recommendRuleDTOs;
                this.recommendVariableDTOs = model.recommendVariableDTOs;
                this.riskSize = model.riskSize;
                this.sampleName = model.sampleName;
                this.sampleScene = model.sampleScene;
                this.sampleSceneName = model.sampleSceneName;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_aszbjb7236</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册风险</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Comparison indicators</p>
             */
            public Builder expectVelocities(java.util.List<String> expectVelocities) {
                this.expectVelocities = expectVelocities;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1621578648000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Number of normal samples</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder normalSize(Long normalSize) {
                this.normalSize = normalSize;
                return this;
            }

            /**
             * <p>Recommended strategy list</p>
             */
            public Builder recommendRuleDTOs(java.util.List<RecommendRuleDTOs> recommendRuleDTOs) {
                this.recommendRuleDTOs = recommendRuleDTOs;
                return this;
            }

            /**
             * <p>Selected variable list</p>
             */
            public Builder recommendVariableDTOs(java.util.List<RecommendVariableDTOs> recommendVariableDTOs) {
                this.recommendVariableDTOs = recommendVariableDTOs;
                return this;
            }

            /**
             * <p>Number of risk samples</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder riskSize(Long riskSize) {
                this.riskSize = riskSize;
                return this;
            }

            /**
             * <p>Sample name</p>
             * 
             * <strong>example:</strong>
             * <p>白样本</p>
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * <p>Sample scenario</p>
             * 
             * <strong>example:</strong>
             * <p>account_abuse_detection</p>
             */
            public Builder sampleScene(String sampleScene) {
                this.sampleScene = sampleScene;
                return this;
            }

            /**
             * <p>Sample scenario name</p>
             * 
             * <strong>example:</strong>
             * <p>防虚假账号</p>
             */
            public Builder sampleSceneName(String sampleSceneName) {
                this.sampleSceneName = sampleSceneName;
                return this;
            }

            /**
             * <p>Task ID</p>
             * 
             * <strong>example:</strong>
             * <p>887</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task name</p>
             * 
             * <strong>example:</strong>
             * <p>策略推荐任务</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>Task status.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
