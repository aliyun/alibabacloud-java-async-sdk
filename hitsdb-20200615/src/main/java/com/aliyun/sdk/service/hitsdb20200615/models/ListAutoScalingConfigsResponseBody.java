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
 * {@link ListAutoScalingConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoScalingConfigsResponseBody</p>
 */
public class ListAutoScalingConfigsResponseBody extends TeaModel {
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

    private ListAutoScalingConfigsResponseBody(Builder builder) {
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

    public static ListAutoScalingConfigsResponseBody create() {
        return builder().build();
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

        public ListAutoScalingConfigsResponseBody build() {
            return new ListAutoScalingConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutoScalingConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoScalingConfigsResponseBody</p>
     */
    public static class ScaleRuleList extends TeaModel {
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

        private ScaleRuleList(Builder builder) {
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

        public static ScaleRuleList create() {
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

            public ScaleRuleList build() {
                return new ScaleRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutoScalingConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoScalingConfigsResponseBody</p>
     */
    public static class ScaleConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("ConfigName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("EffectiveTimeEnd")
        private String effectiveTimeEnd;

        @com.aliyun.core.annotation.NameInMap("EffectiveTimeStart")
        private String effectiveTimeStart;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NodesMax")
        private Integer nodesMax;

        @com.aliyun.core.annotation.NameInMap("NodesMin")
        private Integer nodesMin;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleList")
        private java.util.List<ScaleRuleList> scaleRuleList;

        @com.aliyun.core.annotation.NameInMap("ScaleType")
        private String scaleType;

        @com.aliyun.core.annotation.NameInMap("SpecId")
        private String specId;

        private ScaleConfigs(Builder builder) {
            this.configId = builder.configId;
            this.configName = builder.configName;
            this.effectiveTimeEnd = builder.effectiveTimeEnd;
            this.effectiveTimeStart = builder.effectiveTimeStart;
            this.enabled = builder.enabled;
            this.engine = builder.engine;
            this.instanceId = builder.instanceId;
            this.nodesMax = builder.nodesMax;
            this.nodesMin = builder.nodesMin;
            this.scaleRuleList = builder.scaleRuleList;
            this.scaleType = builder.scaleType;
            this.specId = builder.specId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleConfigs create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return effectiveTimeEnd
         */
        public String getEffectiveTimeEnd() {
            return this.effectiveTimeEnd;
        }

        /**
         * @return effectiveTimeStart
         */
        public String getEffectiveTimeStart() {
            return this.effectiveTimeStart;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodesMax
         */
        public Integer getNodesMax() {
            return this.nodesMax;
        }

        /**
         * @return nodesMin
         */
        public Integer getNodesMin() {
            return this.nodesMin;
        }

        /**
         * @return scaleRuleList
         */
        public java.util.List<ScaleRuleList> getScaleRuleList() {
            return this.scaleRuleList;
        }

        /**
         * @return scaleType
         */
        public String getScaleType() {
            return this.scaleType;
        }

        /**
         * @return specId
         */
        public String getSpecId() {
            return this.specId;
        }

        public static final class Builder {
            private String configId; 
            private String configName; 
            private String effectiveTimeEnd; 
            private String effectiveTimeStart; 
            private Boolean enabled; 
            private String engine; 
            private String instanceId; 
            private Integer nodesMax; 
            private Integer nodesMin; 
            private java.util.List<ScaleRuleList> scaleRuleList; 
            private String scaleType; 
            private String specId; 

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * ConfigName.
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * EffectiveTimeEnd.
             */
            public Builder effectiveTimeEnd(String effectiveTimeEnd) {
                this.effectiveTimeEnd = effectiveTimeEnd;
                return this;
            }

            /**
             * EffectiveTimeStart.
             */
            public Builder effectiveTimeStart(String effectiveTimeStart) {
                this.effectiveTimeStart = effectiveTimeStart;
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
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
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
             * NodesMax.
             */
            public Builder nodesMax(Integer nodesMax) {
                this.nodesMax = nodesMax;
                return this;
            }

            /**
             * NodesMin.
             */
            public Builder nodesMin(Integer nodesMin) {
                this.nodesMin = nodesMin;
                return this;
            }

            /**
             * ScaleRuleList.
             */
            public Builder scaleRuleList(java.util.List<ScaleRuleList> scaleRuleList) {
                this.scaleRuleList = scaleRuleList;
                return this;
            }

            /**
             * ScaleType.
             */
            public Builder scaleType(String scaleType) {
                this.scaleType = scaleType;
                return this;
            }

            /**
             * SpecId.
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            public ScaleConfigs build() {
                return new ScaleConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutoScalingConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoScalingConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScaleConfigs")
        private java.util.List<ScaleConfigs> scaleConfigs;

        private Data(Builder builder) {
            this.scaleConfigs = builder.scaleConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scaleConfigs
         */
        public java.util.List<ScaleConfigs> getScaleConfigs() {
            return this.scaleConfigs;
        }

        public static final class Builder {
            private java.util.List<ScaleConfigs> scaleConfigs; 

            /**
             * ScaleConfigs.
             */
            public Builder scaleConfigs(java.util.List<ScaleConfigs> scaleConfigs) {
                this.scaleConfigs = scaleConfigs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
