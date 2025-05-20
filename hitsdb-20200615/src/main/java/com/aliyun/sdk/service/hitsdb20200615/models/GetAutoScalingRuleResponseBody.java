// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetAutoScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScalingRuleResponseBody</p>
 */
public class GetAutoScalingRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAutoScalingRuleResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoScalingRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAutoScalingRuleResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoScalingRuleResponseBody build() {
            return new GetAutoScalingRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ObservationWindow")
        private Integer observationWindow;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("ScaleInStep")
        private Integer scaleInStep;

        @com.aliyun.core.annotation.NameInMap("ScaleOutStep")
        private Integer scaleOutStep;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TargetMetric")
        private String targetMetric;

        @com.aliyun.core.annotation.NameInMap("TargetNodes")
        private Integer targetNodes;

        @com.aliyun.core.annotation.NameInMap("ThresholdLower")
        private Integer thresholdLower;

        @com.aliyun.core.annotation.NameInMap("ThresholdUpper")
        private Integer thresholdUpper;

        @com.aliyun.core.annotation.NameInMap("TriggerCronExpr")
        private String triggerCronExpr;

        private Data(Builder builder) {
            this.configId = builder.configId;
            this.enabled = builder.enabled;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.observationWindow = builder.observationWindow;
            this.operationType = builder.operationType;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.scaleInStep = builder.scaleInStep;
            this.scaleOutStep = builder.scaleOutStep;
            this.silenceTime = builder.silenceTime;
            this.startTime = builder.startTime;
            this.targetMetric = builder.targetMetric;
            this.targetNodes = builder.targetNodes;
            this.thresholdLower = builder.thresholdLower;
            this.thresholdUpper = builder.thresholdUpper;
            this.triggerCronExpr = builder.triggerCronExpr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return observationWindow
         */
        public Integer getObservationWindow() {
            return this.observationWindow;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
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
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return scaleInStep
         */
        public Integer getScaleInStep() {
            return this.scaleInStep;
        }

        /**
         * @return scaleOutStep
         */
        public Integer getScaleOutStep() {
            return this.scaleOutStep;
        }

        /**
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return targetMetric
         */
        public String getTargetMetric() {
            return this.targetMetric;
        }

        /**
         * @return targetNodes
         */
        public Integer getTargetNodes() {
            return this.targetNodes;
        }

        /**
         * @return thresholdLower
         */
        public Integer getThresholdLower() {
            return this.thresholdLower;
        }

        /**
         * @return thresholdUpper
         */
        public Integer getThresholdUpper() {
            return this.thresholdUpper;
        }

        /**
         * @return triggerCronExpr
         */
        public String getTriggerCronExpr() {
            return this.triggerCronExpr;
        }

        public static final class Builder {
            private String configId; 
            private Boolean enabled; 
            private String endTime; 
            private String instanceId; 
            private Integer observationWindow; 
            private String operationType; 
            private String ruleId; 
            private String ruleName; 
            private String ruleType; 
            private Integer scaleInStep; 
            private Integer scaleOutStep; 
            private Integer silenceTime; 
            private String startTime; 
            private String targetMetric; 
            private Integer targetNodes; 
            private Integer thresholdLower; 
            private Integer thresholdUpper; 
            private String triggerCronExpr; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configId = model.configId;
                this.enabled = model.enabled;
                this.endTime = model.endTime;
                this.instanceId = model.instanceId;
                this.observationWindow = model.observationWindow;
                this.operationType = model.operationType;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleType = model.ruleType;
                this.scaleInStep = model.scaleInStep;
                this.scaleOutStep = model.scaleOutStep;
                this.silenceTime = model.silenceTime;
                this.startTime = model.startTime;
                this.targetMetric = model.targetMetric;
                this.targetNodes = model.targetNodes;
                this.thresholdLower = model.thresholdLower;
                this.thresholdUpper = model.thresholdUpper;
                this.triggerCronExpr = model.triggerCronExpr;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ObservationWindow.
             */
            public Builder observationWindow(Integer observationWindow) {
                this.observationWindow = observationWindow;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * ScaleInStep.
             */
            public Builder scaleInStep(Integer scaleInStep) {
                this.scaleInStep = scaleInStep;
                return this;
            }

            /**
             * ScaleOutStep.
             */
            public Builder scaleOutStep(Integer scaleOutStep) {
                this.scaleOutStep = scaleOutStep;
                return this;
            }

            /**
             * SilenceTime.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
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
             * TargetMetric.
             */
            public Builder targetMetric(String targetMetric) {
                this.targetMetric = targetMetric;
                return this;
            }

            /**
             * TargetNodes.
             */
            public Builder targetNodes(Integer targetNodes) {
                this.targetNodes = targetNodes;
                return this;
            }

            /**
             * ThresholdLower.
             */
            public Builder thresholdLower(Integer thresholdLower) {
                this.thresholdLower = thresholdLower;
                return this;
            }

            /**
             * ThresholdUpper.
             */
            public Builder thresholdUpper(Integer thresholdUpper) {
                this.thresholdUpper = thresholdUpper;
                return this;
            }

            /**
             * TriggerCronExpr.
             */
            public Builder triggerCronExpr(String triggerCronExpr) {
                this.triggerCronExpr = triggerCronExpr;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
