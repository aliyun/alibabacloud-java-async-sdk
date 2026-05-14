// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudQueryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CloudQueryTaskResponseBody</p>
 */
public class CloudQueryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudQueryTaskResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryTaskResponseBody create() {
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudQueryTaskResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public CloudQueryTaskResponseBody build() {
            return new CloudQueryTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudQueryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryTaskResponseBody</p>
     */
    public static class TaskProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentGroup")
        private String agentGroup;

        @com.aliyun.core.annotation.NameInMap("AgentTimeout")
        private Long agentTimeout;

        @com.aliyun.core.annotation.NameInMap("AnswerRate")
        private Long answerRate;

        @com.aliyun.core.annotation.NameInMap("AutoComplete")
        private Long autoComplete;

        @com.aliyun.core.annotation.NameInMap("AutoStart")
        private Long autoStart;

        @com.aliyun.core.annotation.NameInMap("AutoStartDay")
        private String autoStartDay;

        @com.aliyun.core.annotation.NameInMap("AutoStartTime")
        private String autoStartTime;

        @com.aliyun.core.annotation.NameInMap("AutoStop")
        private Long autoStop;

        @com.aliyun.core.annotation.NameInMap("AutoStopDay")
        private String autoStopDay;

        @com.aliyun.core.annotation.NameInMap("AutoStopTime")
        private String autoStopTime;

        @com.aliyun.core.annotation.NameInMap("AutoTaskType")
        private Long autoTaskType;

        @com.aliyun.core.annotation.NameInMap("AutoTriggerTimeStrategy")
        private String autoTriggerTimeStrategy;

        @com.aliyun.core.annotation.NameInMap("CallGroupType")
        private Long callGroupType;

        @com.aliyun.core.annotation.NameInMap("CallLimitStrategy")
        private String callLimitStrategy;

        @com.aliyun.core.annotation.NameInMap("CallPriorityStrategy")
        private String callPriorityStrategy;

        @com.aliyun.core.annotation.NameInMap("CallRouteStrategy")
        private Long callRouteStrategy;

        @com.aliyun.core.annotation.NameInMap("CallStrategy")
        private Long callStrategy;

        @com.aliyun.core.annotation.NameInMap("CallVariables")
        private String callVariables;

        @com.aliyun.core.annotation.NameInMap("ClidProperty")
        private String clidProperty;

        @com.aliyun.core.annotation.NameInMap("Cnos")
        private String cnos;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Long concurrency;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomerClidType")
        private Long customerClidType;

        @com.aliyun.core.annotation.NameInMap("CustomerClidWeight")
        private String customerClidWeight;

        @com.aliyun.core.annotation.NameInMap("CustomerClidWeightFlag")
        private Long customerClidWeightFlag;

        @com.aliyun.core.annotation.NameInMap("CustomerClids")
        private String customerClids;

        @com.aliyun.core.annotation.NameInMap("CustomerClidsCategory")
        private Long customerClidsCategory;

        @com.aliyun.core.annotation.NameInMap("CustomerMoh")
        private String customerMoh;

        @com.aliyun.core.annotation.NameInMap("CustomerTimeout")
        private Long customerTimeout;

        @com.aliyun.core.annotation.NameInMap("CustomerVoice")
        private String customerVoice;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("ForceEndFlag")
        private Long forceEndFlag;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsRewarm")
        private Long isRewarm;

        @com.aliyun.core.annotation.NameInMap("IvrId")
        private Long ivrId;

        @com.aliyun.core.annotation.NameInMap("MaxWaitTime")
        private Long maxWaitTime;

        @com.aliyun.core.annotation.NameInMap("MinAvailableAgentCount")
        private Long minAvailableAgentCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverCallLimitCnos")
        private String overCallLimitCnos;

        @com.aliyun.core.annotation.NameInMap("OverTime")
        private String overTime;

        @com.aliyun.core.annotation.NameInMap("PauseDuration")
        private Long pauseDuration;

        @com.aliyun.core.annotation.NameInMap("PauseTime")
        private String pauseTime;

        @com.aliyun.core.annotation.NameInMap("PredictAdjust")
        private Long predictAdjust;

        @com.aliyun.core.annotation.NameInMap("Quotiety")
        private Double quotiety;

        @com.aliyun.core.annotation.NameInMap("RetryStrategy")
        private String retryStrategy;

        @com.aliyun.core.annotation.NameInMap("RetryStrategyOnlyToday")
        private Long retryStrategyOnlyToday;

        @com.aliyun.core.annotation.NameInMap("RetryStrategyTimeType")
        private Long retryStrategyTimeType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        @com.aliyun.core.annotation.NameInMap("StatusTriggerType")
        private Long statusTriggerType;

        @com.aliyun.core.annotation.NameInMap("TimeStrategy")
        private String timeStrategy;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        @com.aliyun.core.annotation.NameInMap("UserFields")
        private String userFields;

        @com.aliyun.core.annotation.NameInMap("WarmUpDuration")
        private Long warmUpDuration;

        @com.aliyun.core.annotation.NameInMap("Wrapup")
        private Long wrapup;

        private TaskProperties(Builder builder) {
            this.agentGroup = builder.agentGroup;
            this.agentTimeout = builder.agentTimeout;
            this.answerRate = builder.answerRate;
            this.autoComplete = builder.autoComplete;
            this.autoStart = builder.autoStart;
            this.autoStartDay = builder.autoStartDay;
            this.autoStartTime = builder.autoStartTime;
            this.autoStop = builder.autoStop;
            this.autoStopDay = builder.autoStopDay;
            this.autoStopTime = builder.autoStopTime;
            this.autoTaskType = builder.autoTaskType;
            this.autoTriggerTimeStrategy = builder.autoTriggerTimeStrategy;
            this.callGroupType = builder.callGroupType;
            this.callLimitStrategy = builder.callLimitStrategy;
            this.callPriorityStrategy = builder.callPriorityStrategy;
            this.callRouteStrategy = builder.callRouteStrategy;
            this.callStrategy = builder.callStrategy;
            this.callVariables = builder.callVariables;
            this.clidProperty = builder.clidProperty;
            this.cnos = builder.cnos;
            this.concurrency = builder.concurrency;
            this.createTime = builder.createTime;
            this.customerClidType = builder.customerClidType;
            this.customerClidWeight = builder.customerClidWeight;
            this.customerClidWeightFlag = builder.customerClidWeightFlag;
            this.customerClids = builder.customerClids;
            this.customerClidsCategory = builder.customerClidsCategory;
            this.customerMoh = builder.customerMoh;
            this.customerTimeout = builder.customerTimeout;
            this.customerVoice = builder.customerVoice;
            this.description = builder.description;
            this.enterpriseId = builder.enterpriseId;
            this.forceEndFlag = builder.forceEndFlag;
            this.id = builder.id;
            this.isRewarm = builder.isRewarm;
            this.ivrId = builder.ivrId;
            this.maxWaitTime = builder.maxWaitTime;
            this.minAvailableAgentCount = builder.minAvailableAgentCount;
            this.name = builder.name;
            this.overCallLimitCnos = builder.overCallLimitCnos;
            this.overTime = builder.overTime;
            this.pauseDuration = builder.pauseDuration;
            this.pauseTime = builder.pauseTime;
            this.predictAdjust = builder.predictAdjust;
            this.quotiety = builder.quotiety;
            this.retryStrategy = builder.retryStrategy;
            this.retryStrategyOnlyToday = builder.retryStrategyOnlyToday;
            this.retryStrategyTimeType = builder.retryStrategyTimeType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusDescription = builder.statusDescription;
            this.statusTriggerType = builder.statusTriggerType;
            this.timeStrategy = builder.timeStrategy;
            this.type = builder.type;
            this.userFields = builder.userFields;
            this.warmUpDuration = builder.warmUpDuration;
            this.wrapup = builder.wrapup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskProperties create() {
            return builder().build();
        }

        /**
         * @return agentGroup
         */
        public String getAgentGroup() {
            return this.agentGroup;
        }

        /**
         * @return agentTimeout
         */
        public Long getAgentTimeout() {
            return this.agentTimeout;
        }

        /**
         * @return answerRate
         */
        public Long getAnswerRate() {
            return this.answerRate;
        }

        /**
         * @return autoComplete
         */
        public Long getAutoComplete() {
            return this.autoComplete;
        }

        /**
         * @return autoStart
         */
        public Long getAutoStart() {
            return this.autoStart;
        }

        /**
         * @return autoStartDay
         */
        public String getAutoStartDay() {
            return this.autoStartDay;
        }

        /**
         * @return autoStartTime
         */
        public String getAutoStartTime() {
            return this.autoStartTime;
        }

        /**
         * @return autoStop
         */
        public Long getAutoStop() {
            return this.autoStop;
        }

        /**
         * @return autoStopDay
         */
        public String getAutoStopDay() {
            return this.autoStopDay;
        }

        /**
         * @return autoStopTime
         */
        public String getAutoStopTime() {
            return this.autoStopTime;
        }

        /**
         * @return autoTaskType
         */
        public Long getAutoTaskType() {
            return this.autoTaskType;
        }

        /**
         * @return autoTriggerTimeStrategy
         */
        public String getAutoTriggerTimeStrategy() {
            return this.autoTriggerTimeStrategy;
        }

        /**
         * @return callGroupType
         */
        public Long getCallGroupType() {
            return this.callGroupType;
        }

        /**
         * @return callLimitStrategy
         */
        public String getCallLimitStrategy() {
            return this.callLimitStrategy;
        }

        /**
         * @return callPriorityStrategy
         */
        public String getCallPriorityStrategy() {
            return this.callPriorityStrategy;
        }

        /**
         * @return callRouteStrategy
         */
        public Long getCallRouteStrategy() {
            return this.callRouteStrategy;
        }

        /**
         * @return callStrategy
         */
        public Long getCallStrategy() {
            return this.callStrategy;
        }

        /**
         * @return callVariables
         */
        public String getCallVariables() {
            return this.callVariables;
        }

        /**
         * @return clidProperty
         */
        public String getClidProperty() {
            return this.clidProperty;
        }

        /**
         * @return cnos
         */
        public String getCnos() {
            return this.cnos;
        }

        /**
         * @return concurrency
         */
        public Long getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customerClidType
         */
        public Long getCustomerClidType() {
            return this.customerClidType;
        }

        /**
         * @return customerClidWeight
         */
        public String getCustomerClidWeight() {
            return this.customerClidWeight;
        }

        /**
         * @return customerClidWeightFlag
         */
        public Long getCustomerClidWeightFlag() {
            return this.customerClidWeightFlag;
        }

        /**
         * @return customerClids
         */
        public String getCustomerClids() {
            return this.customerClids;
        }

        /**
         * @return customerClidsCategory
         */
        public Long getCustomerClidsCategory() {
            return this.customerClidsCategory;
        }

        /**
         * @return customerMoh
         */
        public String getCustomerMoh() {
            return this.customerMoh;
        }

        /**
         * @return customerTimeout
         */
        public Long getCustomerTimeout() {
            return this.customerTimeout;
        }

        /**
         * @return customerVoice
         */
        public String getCustomerVoice() {
            return this.customerVoice;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return forceEndFlag
         */
        public Long getForceEndFlag() {
            return this.forceEndFlag;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isRewarm
         */
        public Long getIsRewarm() {
            return this.isRewarm;
        }

        /**
         * @return ivrId
         */
        public Long getIvrId() {
            return this.ivrId;
        }

        /**
         * @return maxWaitTime
         */
        public Long getMaxWaitTime() {
            return this.maxWaitTime;
        }

        /**
         * @return minAvailableAgentCount
         */
        public Long getMinAvailableAgentCount() {
            return this.minAvailableAgentCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return overCallLimitCnos
         */
        public String getOverCallLimitCnos() {
            return this.overCallLimitCnos;
        }

        /**
         * @return overTime
         */
        public String getOverTime() {
            return this.overTime;
        }

        /**
         * @return pauseDuration
         */
        public Long getPauseDuration() {
            return this.pauseDuration;
        }

        /**
         * @return pauseTime
         */
        public String getPauseTime() {
            return this.pauseTime;
        }

        /**
         * @return predictAdjust
         */
        public Long getPredictAdjust() {
            return this.predictAdjust;
        }

        /**
         * @return quotiety
         */
        public Double getQuotiety() {
            return this.quotiety;
        }

        /**
         * @return retryStrategy
         */
        public String getRetryStrategy() {
            return this.retryStrategy;
        }

        /**
         * @return retryStrategyOnlyToday
         */
        public Long getRetryStrategyOnlyToday() {
            return this.retryStrategyOnlyToday;
        }

        /**
         * @return retryStrategyTimeType
         */
        public Long getRetryStrategyTimeType() {
            return this.retryStrategyTimeType;
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
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        /**
         * @return statusTriggerType
         */
        public Long getStatusTriggerType() {
            return this.statusTriggerType;
        }

        /**
         * @return timeStrategy
         */
        public String getTimeStrategy() {
            return this.timeStrategy;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return userFields
         */
        public String getUserFields() {
            return this.userFields;
        }

        /**
         * @return warmUpDuration
         */
        public Long getWarmUpDuration() {
            return this.warmUpDuration;
        }

        /**
         * @return wrapup
         */
        public Long getWrapup() {
            return this.wrapup;
        }

        public static final class Builder {
            private String agentGroup; 
            private Long agentTimeout; 
            private Long answerRate; 
            private Long autoComplete; 
            private Long autoStart; 
            private String autoStartDay; 
            private String autoStartTime; 
            private Long autoStop; 
            private String autoStopDay; 
            private String autoStopTime; 
            private Long autoTaskType; 
            private String autoTriggerTimeStrategy; 
            private Long callGroupType; 
            private String callLimitStrategy; 
            private String callPriorityStrategy; 
            private Long callRouteStrategy; 
            private Long callStrategy; 
            private String callVariables; 
            private String clidProperty; 
            private String cnos; 
            private Long concurrency; 
            private String createTime; 
            private Long customerClidType; 
            private String customerClidWeight; 
            private Long customerClidWeightFlag; 
            private String customerClids; 
            private Long customerClidsCategory; 
            private String customerMoh; 
            private Long customerTimeout; 
            private String customerVoice; 
            private String description; 
            private String enterpriseId; 
            private Long forceEndFlag; 
            private Long id; 
            private Long isRewarm; 
            private Long ivrId; 
            private Long maxWaitTime; 
            private Long minAvailableAgentCount; 
            private String name; 
            private String overCallLimitCnos; 
            private String overTime; 
            private Long pauseDuration; 
            private String pauseTime; 
            private Long predictAdjust; 
            private Double quotiety; 
            private String retryStrategy; 
            private Long retryStrategyOnlyToday; 
            private Long retryStrategyTimeType; 
            private String startTime; 
            private Long status; 
            private String statusDescription; 
            private Long statusTriggerType; 
            private String timeStrategy; 
            private Long type; 
            private String userFields; 
            private Long warmUpDuration; 
            private Long wrapup; 

            private Builder() {
            } 

            private Builder(TaskProperties model) {
                this.agentGroup = model.agentGroup;
                this.agentTimeout = model.agentTimeout;
                this.answerRate = model.answerRate;
                this.autoComplete = model.autoComplete;
                this.autoStart = model.autoStart;
                this.autoStartDay = model.autoStartDay;
                this.autoStartTime = model.autoStartTime;
                this.autoStop = model.autoStop;
                this.autoStopDay = model.autoStopDay;
                this.autoStopTime = model.autoStopTime;
                this.autoTaskType = model.autoTaskType;
                this.autoTriggerTimeStrategy = model.autoTriggerTimeStrategy;
                this.callGroupType = model.callGroupType;
                this.callLimitStrategy = model.callLimitStrategy;
                this.callPriorityStrategy = model.callPriorityStrategy;
                this.callRouteStrategy = model.callRouteStrategy;
                this.callStrategy = model.callStrategy;
                this.callVariables = model.callVariables;
                this.clidProperty = model.clidProperty;
                this.cnos = model.cnos;
                this.concurrency = model.concurrency;
                this.createTime = model.createTime;
                this.customerClidType = model.customerClidType;
                this.customerClidWeight = model.customerClidWeight;
                this.customerClidWeightFlag = model.customerClidWeightFlag;
                this.customerClids = model.customerClids;
                this.customerClidsCategory = model.customerClidsCategory;
                this.customerMoh = model.customerMoh;
                this.customerTimeout = model.customerTimeout;
                this.customerVoice = model.customerVoice;
                this.description = model.description;
                this.enterpriseId = model.enterpriseId;
                this.forceEndFlag = model.forceEndFlag;
                this.id = model.id;
                this.isRewarm = model.isRewarm;
                this.ivrId = model.ivrId;
                this.maxWaitTime = model.maxWaitTime;
                this.minAvailableAgentCount = model.minAvailableAgentCount;
                this.name = model.name;
                this.overCallLimitCnos = model.overCallLimitCnos;
                this.overTime = model.overTime;
                this.pauseDuration = model.pauseDuration;
                this.pauseTime = model.pauseTime;
                this.predictAdjust = model.predictAdjust;
                this.quotiety = model.quotiety;
                this.retryStrategy = model.retryStrategy;
                this.retryStrategyOnlyToday = model.retryStrategyOnlyToday;
                this.retryStrategyTimeType = model.retryStrategyTimeType;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusDescription = model.statusDescription;
                this.statusTriggerType = model.statusTriggerType;
                this.timeStrategy = model.timeStrategy;
                this.type = model.type;
                this.userFields = model.userFields;
                this.warmUpDuration = model.warmUpDuration;
                this.wrapup = model.wrapup;
            } 

            /**
             * <p>外呼组号</p>
             * 
             * <strong>example:</strong>
             * <p>WH124</p>
             */
            public Builder agentGroup(String agentGroup) {
                this.agentGroup = agentGroup;
                return this;
            }

            /**
             * <p>座席超时时间，单位秒</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder agentTimeout(Long agentTimeout) {
                this.agentTimeout = agentTimeout;
                return this;
            }

            /**
             * <p>初始化预计客户接通率</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder answerRate(Long answerRate) {
                this.answerRate = answerRate;
                return this;
            }

            /**
             * <p>自动完成，0.关闭 1.开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder autoComplete(Long autoComplete) {
                this.autoComplete = autoComplete;
                return this;
            }

            /**
             * <p>定时开始，0.关闭 1.开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder autoStart(Long autoStart) {
                this.autoStart = autoStart;
                return this;
            }

            /**
             * <p>定时开始日期，格式：yyyy-MM-dd，如：2017-02-11</p>
             * 
             * <strong>example:</strong>
             * <p>2017-02-11</p>
             */
            public Builder autoStartDay(String autoStartDay) {
                this.autoStartDay = autoStartDay;
                return this;
            }

            /**
             * <p>定时开始时间，格式：HH:mm:ss，如：08:00:00</p>
             * 
             * <strong>example:</strong>
             * <p>08:00:00</p>
             */
            public Builder autoStartTime(String autoStartTime) {
                this.autoStartTime = autoStartTime;
                return this;
            }

            /**
             * <p>定时完成，0.关闭 1.开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder autoStop(Long autoStop) {
                this.autoStop = autoStop;
                return this;
            }

            /**
             * <p>定时完成日期，格式：yyyy-MM-dd，如：2017-02-11</p>
             * 
             * <strong>example:</strong>
             * <p>2017-02-11</p>
             */
            public Builder autoStopDay(String autoStopDay) {
                this.autoStopDay = autoStopDay;
                return this;
            }

            /**
             * <p>定时完成时间，格式：HH:mm:ss，如：17:00:00</p>
             * 
             * <strong>example:</strong>
             * <p>17:00:00</p>
             */
            public Builder autoStopTime(String autoStopTime) {
                this.autoStopTime = autoStopTime;
                return this;
            }

            /**
             * <p>呼叫方式，0.连续呼叫 1.间隔呼叫</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder autoTaskType(Long autoTaskType) {
                this.autoTaskType = autoTaskType;
                return this;
            }

            /**
             * <p>间隔呼叫时间段，呼叫的时间段配置。参数格式：时间条件编号。支持多个，多个使用英文&quot;,&quot;逗号隔开，如：9,22</p>
             * 
             * <strong>example:</strong>
             * <p>9,22</p>
             */
            public Builder autoTriggerTimeStrategy(String autoTriggerTimeStrategy) {
                this.autoTriggerTimeStrategy = autoTriggerTimeStrategy;
                return this;
            }

            /**
             * <p>指定座席方式，1.座席工号列表 2.外呼组</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callGroupType(Long callGroupType) {
                this.callGroupType = callGroupType;
                return this;
            }

            /**
             * <p>座席当日接听数限制，JsonArray格式[{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}]</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}]</p>
             */
            public Builder callLimitStrategy(String callLimitStrategy) {
                this.callLimitStrategy = callLimitStrategy;
                return this;
            }

            /**
             * <p>呼叫顺序，数据结构为Json格式<code>{&quot;strategy&quot;:[{&quot;sort&quot;:1,&quot;type&quot;:&quot;retryCall&quot;, &quot;desc&quot;:0},{&quot;sort&quot;:2,&quot;type&quot;:&quot;firstCall&quot;,&quot;orderType&quot;:0}]}</code>，格式说明：sort是重试号码和未呼叫号码的呼叫顺序 ，type：retryCall重试号码、firstCall未呼叫号码，当type=retryCall，desc：0.优先呼叫待重呼轮次数值较小的号码，即轮次靠前（如第1轮、第2轮）的号码先被呼叫 1.优先呼叫待重呼轮次数值较大的号码，即轮次靠后（如第5轮、第4轮）的号码先被呼叫，当type=firstCall时，orderType：随机呼叫，0顺序(优先级) 1随机 2顺序(导入时间)</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;strategy&quot;:[{&quot;sort&quot;:1,&quot;type&quot;:&quot;retryCall&quot;, &quot;desc&quot;:0},{&quot;sort&quot;:2,&quot;type&quot;:&quot;firstCall&quot;,&quot;orderType&quot;:0}]}</p>
             */
            public Builder callPriorityStrategy(String callPriorityStrategy) {
                this.callPriorityStrategy = callPriorityStrategy;
                return this;
            }

            /**
             * <p>呼叫流转模式， 1.直连座席 2.AI转人工 直连座席模式：客户接听后直接分配座席，无空闲座席可溢出语音导航（需配置语音导航），保障高优先级客户直连体验 AI转人工：客户接入后，优先进入语音导航中配置的智能体机器人，按交互结果决定是否转接座席，提升自动化覆盖率，降低人工成本</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callRouteStrategy(Long callRouteStrategy) {
                this.callRouteStrategy = callRouteStrategy;
                return this;
            }

            /**
             * <p>座席分配规则，1.随机 2.顺序 3.座席未进线最大时（从上一次呼叫结束到当前的总时长） 4.座席状态[空闲]最长时长（座席最近一次切换为空闲状态的持续时长）</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callStrategy(Long callStrategy) {
                this.callStrategy = callStrategy;
                return this;
            }

            /**
             * <p>座席通道变量</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
             */
            public Builder callVariables(String callVariables) {
                this.callVariables = callVariables;
                return this;
            }

            /**
             * <p>外显规则，Json格式，外显号码选择规则：默认区号，是否匹配省会等；如：{&quot;defaultAreaCode&quot;:&quot;010&quot;, &quot;isMatchCapital&quot;:&quot;1&quot;}</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder clidProperty(String clidProperty) {
                this.clidProperty = clidProperty;
                return this;
            }

            /**
             * <p>座席工号列表</p>
             * 
             * <strong>example:</strong>
             * <p>1111,2222</p>
             */
            public Builder cnos(String cnos) {
                this.cnos = cnos;
                return this;
            }

            /**
             * <p>最大并发限制</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder concurrency(Long concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>任务创建时间 ，格式为： yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-12 18:03:14</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>客户侧外显规则，1.随机 2.按区号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customerClidType(Long customerClidType) {
                this.customerClidType = customerClidType;
                return this;
            }

            /**
             * <p>外显号码比例配置内容</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;number&quot;:&quot;123,345&quot;,&quot;weight&quot;:&quot;5&quot;},{&quot;number&quot;:&quot;567,789&quot;,&quot;weight&quot;:&quot;5&quot;}]</p>
             */
            public Builder customerClidWeight(String customerClidWeight) {
                this.customerClidWeight = customerClidWeight;
                return this;
            }

            /**
             * <p>外显号码比例配置开关，0.关闭 1.开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder customerClidWeightFlag(Long customerClidWeightFlag) {
                this.customerClidWeightFlag = customerClidWeightFlag;
                return this;
            }

            /**
             * <p>客户侧外显号码列表</p>
             * 
             * <strong>example:</strong>
             * <p>02138276106</p>
             */
            public Builder customerClids(String customerClids) {
                this.customerClids = customerClids;
                return this;
            }

            /**
             * <p>客户侧外显号码类型，1.外显固话 2.外显手机号  4.外显号码池 5.外显导航</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder customerClidsCategory(Long customerClidsCategory) {
                this.customerClidsCategory = customerClidsCategory;
                return this;
            }

            /**
             * <p>客户侧等待音</p>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder customerMoh(String customerMoh) {
                this.customerMoh = customerMoh;
                return this;
            }

            /**
             * <p>客户超时时间，单位秒</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder customerTimeout(Long customerTimeout) {
                this.customerTimeout = customerTimeout;
                return this;
            }

            /**
             * <p>客户侧提示音</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder customerVoice(String customerVoice) {
                this.customerVoice = customerVoice;
                return this;
            }

            /**
             * <p>任务描述</p>
             * 
             * <strong>example:</strong>
             * <p>desc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>呼叫中心Id</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>定时完成时强制结束任务，开启配置后，当任务到定时完成时间时无论任务中的号码是否已经呼完，均将任务状态设置为结束。适用于对数据有呼叫时间限制的场景。注：任务在结束状态时无法再次启动。 0：否，1：是</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder forceEndFlag(Long forceEndFlag) {
                this.forceEndFlag = forceEndFlag;
                return this;
            }

            /**
             * <p>外呼任务Id</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>暂停后重新预热，0.关闭，1开启</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isRewarm(Long isRewarm) {
                this.isRewarm = isRewarm;
                return this;
            }

            /**
             * <p>语音导航Id，预测外呼使用场景：直连座席模式下如果客户接听后未在特定时间内（默认2秒）找到可用座席，通话将溢出到语音导航继续排队找座席。同时支持在呼转座席，座席未接听时也溢出到语音导航，需要开启企业配置生效。AI转人工模式下，呼叫先转到语音导航 自动外呼使用场景：客户接听后，转到的语音导航</p>
             * 
             * <strong>example:</strong>
             * <p>133</p>
             */
            public Builder ivrId(Long ivrId) {
                this.ivrId = ivrId;
                return this;
            }

            /**
             * <p>座席最大等待时间，单位秒</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder maxWaitTime(Long maxWaitTime) {
                this.maxWaitTime = maxWaitTime;
                return this;
            }

            /**
             * <p>最小可用座席数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minAvailableAgentCount(Long minAvailableAgentCount) {
                this.minAvailableAgentCount = minAvailableAgentCount;
                return this;
            }

            /**
             * <p>任务名称</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>超过呼叫限制的座席</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder overCallLimitCnos(String overCallLimitCnos) {
                this.overCallLimitCnos = overCallLimitCnos;
                return this;
            }

            /**
             * <p>任务结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder overTime(String overTime) {
                this.overTime = overTime;
                return this;
            }

            /**
             * <p>任务暂停时长(针对自动启动时间段) 单位分钟</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pauseDuration(Long pauseDuration) {
                this.pauseDuration = pauseDuration;
                return this;
            }

            /**
             * <p>任务暂停时间点</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 11:00:00</p>
             */
            public Builder pauseTime(String pauseTime) {
                this.pauseTime = pauseTime;
                return this;
            }

            /**
             * <p>超呼率</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder predictAdjust(Long predictAdjust) {
                this.predictAdjust = predictAdjust;
                return this;
            }

            /**
             * <p>骚扰率，支持小数，精确到小数点两位</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder quotiety(Double quotiety) {
                this.quotiety = quotiety;
                return this;
            }

            /**
             * <p>重试策略， 「基础模式」 数据结构为Json格式<code>{&quot;retry&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;1-1-1&quot;},{&quot;round&quot;:2,&quot;time&quot;:&quot;2-2-2&quot;}]}</code> 格式说明：retry是重试次数，round是第几次重试，time是第几次重试间隔的时间：1-1-1，第一个1是天，第二个1是小时，第三个1是分钟 「高级模式」 高级模式需要开启「号码状态识别」服务后。目前只支持「自动外呼」任务模式。 数据结构为JsonArray格式 <code>[{&quot;condition&quot;:{&quot;sipCause&quot;:[710,719]},&quot;retry&quot;:1,&quot;sort&quot;:1,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;0-0-10&quot;}]},{&quot;condition&quot;:{&quot;sipCause&quot;:[800]},&quot;retry&quot;:1,&quot;sort&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:2,&quot;time&quot;:&quot;0-0-10&quot;}]}]</code> 格式说明：condition是重试条件，sort是重试条件的顺序，其余字段与基础模式一致</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;retry&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;1-1-1&quot;},{&quot;round&quot;:2,&quot;time&quot;:&quot;2-2-2&quot;}]}</p>
             */
            public Builder retryStrategy(String retryStrategy) {
                this.retryStrategy = retryStrategy;
                return this;
            }

            /**
             * <p>重试仅当天生效，0.关闭 1.开启，删除待重试的数据和待呼叫的数据 2.开启，删除待重试的数据 3.开启，删除待呼叫的数据</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder retryStrategyOnlyToday(Long retryStrategyOnlyToday) {
                this.retryStrategyOnlyToday = retryStrategyOnlyToday;
                return this;
            }

            /**
             * <p>重试策略时间类型，1.基于首次呼叫时间 2.基于上次呼叫时间</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retryStrategyTimeType(Long retryStrategyTimeType) {
                this.retryStrategyTimeType = retryStrategyTimeType;
                return this;
            }

            /**
             * <p>任务开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>09:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>任务状态，0.初始 1.运行中 2.暂停 3.结束</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>任务状态描述</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * <p>任务状态变更类型，0.系统变更 1.人为变更</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder statusTriggerType(Long statusTriggerType) {
                this.statusTriggerType = statusTriggerType;
                return this;
            }

            /**
             * <p>禁止呼叫时间限制，在特定的时间段内禁止呼叫。参数格式：时间条件编号。支持多个，多个使用英文&quot;,&quot;逗号隔开，如：9,22。</p>
             * 
             * <strong>example:</strong>
             * <p>9,22</p>
             */
            public Builder timeStrategy(String timeStrategy) {
                this.timeStrategy = timeStrategy;
                return this;
            }

            /**
             * <p>任务类型，1.预测外呼任务 2.自动外呼任务</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * <p>任务自定义字段</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key1&quot;:&quot;value1&quot;},{&quot;key2&quot;:&quot;value2&quot;}]</p>
             */
            public Builder userFields(String userFields) {
                this.userFields = userFields;
                return this;
            }

            /**
             * <p>任务预热时间，单位秒</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder warmUpDuration(Long warmUpDuration) {
                this.warmUpDuration = warmUpDuration;
                return this;
            }

            /**
             * <p>座席整理时间，单位秒</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder wrapup(Long wrapup) {
                this.wrapup = wrapup;
                return this;
            }

            public TaskProperties build() {
                return new TaskProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudQueryTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskProperties")
        private java.util.List<TaskProperties> taskProperties;

        private Data(Builder builder) {
            this.taskProperties = builder.taskProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskProperties
         */
        public java.util.List<TaskProperties> getTaskProperties() {
            return this.taskProperties;
        }

        public static final class Builder {
            private java.util.List<TaskProperties> taskProperties; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.taskProperties = model.taskProperties;
            } 

            /**
             * TaskProperties.
             */
            public Builder taskProperties(java.util.List<TaskProperties> taskProperties) {
                this.taskProperties = taskProperties;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
