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
 * {@link CloudUpdateTaskRequest} extends {@link RequestModel}
 *
 * <p>CloudUpdateTaskRequest</p>
 */
public class CloudUpdateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentGroup")
    private String agentGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTimeout")
    private Long agentTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnswerRate")
    private Long answerRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoComplete")
    private Long autoComplete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStart")
    private Long autoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStartDay")
    private String autoStartDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStartTime")
    private String autoStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStop")
    private Long autoStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStopDay")
    private String autoStopDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStopTime")
    private String autoStopTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoTaskType")
    private Long autoTaskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoTriggerTimeStrategy")
    private String autoTriggerTimeStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallLimitStrategy")
    private String callLimitStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallPriorityStrategy")
    private String callPriorityStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallRouteStrategy")
    private Long callRouteStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallStrategy")
    private String callStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallVariables")
    private String callVariables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidProperty")
    private String clidProperty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Long concurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerClidType")
    private Long customerClidType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerClidWeight")
    private String customerClidWeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerClidWeightFlag")
    private Long customerClidWeightFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerClids")
    private String customerClids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerClidsCategory")
    private Long customerClidsCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerClidsGroup")
    private String customerClidsGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerMoh")
    private String customerMoh;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerTimeout")
    private Long customerTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerVoice")
    private String customerVoice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceEndFlag")
    private Long forceEndFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRewarm")
    private Long isRewarm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IvrId")
    private Long ivrId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IvrName")
    private String ivrName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxWaitTime")
    private Long maxWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAvailableAgentCount")
    private Long minAvailableAgentCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PredictAdjust")
    private Long predictAdjust;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quotiety")
    private Double quotiety;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryStrategy")
    private String retryStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryStrategyOnlyToday")
    private Long retryStrategyOnlyToday;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryStrategyTimeType")
    private Long retryStrategyTimeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStrategy")
    private String timeStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserFields")
    private String userFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarmUpDuration")
    private Long warmUpDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Wrapup")
    private Long wrapup;

    private CloudUpdateTaskRequest(Builder builder) {
        super(builder);
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
        this.callLimitStrategy = builder.callLimitStrategy;
        this.callPriorityStrategy = builder.callPriorityStrategy;
        this.callRouteStrategy = builder.callRouteStrategy;
        this.callStrategy = builder.callStrategy;
        this.callVariables = builder.callVariables;
        this.clidProperty = builder.clidProperty;
        this.cnos = builder.cnos;
        this.concurrency = builder.concurrency;
        this.customerClidType = builder.customerClidType;
        this.customerClidWeight = builder.customerClidWeight;
        this.customerClidWeightFlag = builder.customerClidWeightFlag;
        this.customerClids = builder.customerClids;
        this.customerClidsCategory = builder.customerClidsCategory;
        this.customerClidsGroup = builder.customerClidsGroup;
        this.customerMoh = builder.customerMoh;
        this.customerTimeout = builder.customerTimeout;
        this.customerVoice = builder.customerVoice;
        this.description = builder.description;
        this.enterpriseId = builder.enterpriseId;
        this.forceEndFlag = builder.forceEndFlag;
        this.isRewarm = builder.isRewarm;
        this.ivrId = builder.ivrId;
        this.ivrName = builder.ivrName;
        this.maxWaitTime = builder.maxWaitTime;
        this.minAvailableAgentCount = builder.minAvailableAgentCount;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.predictAdjust = builder.predictAdjust;
        this.quotiety = builder.quotiety;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retryStrategy = builder.retryStrategy;
        this.retryStrategyOnlyToday = builder.retryStrategyOnlyToday;
        this.retryStrategyTimeType = builder.retryStrategyTimeType;
        this.taskId = builder.taskId;
        this.timeStrategy = builder.timeStrategy;
        this.userFields = builder.userFields;
        this.warmUpDuration = builder.warmUpDuration;
        this.wrapup = builder.wrapup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudUpdateTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getCallStrategy() {
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
     * @return customerClidsGroup
     */
    public String getCustomerClidsGroup() {
        return this.customerClidsGroup;
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
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return forceEndFlag
     */
    public Long getForceEndFlag() {
        return this.forceEndFlag;
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
     * @return ivrName
     */
    public String getIvrName() {
        return this.ivrName;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timeStrategy
     */
    public String getTimeStrategy() {
        return this.timeStrategy;
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

    public static final class Builder extends Request.Builder<CloudUpdateTaskRequest, Builder> {
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
        private String callLimitStrategy; 
        private String callPriorityStrategy; 
        private Long callRouteStrategy; 
        private String callStrategy; 
        private String callVariables; 
        private String clidProperty; 
        private String cnos; 
        private Long concurrency; 
        private Long customerClidType; 
        private String customerClidWeight; 
        private Long customerClidWeightFlag; 
        private String customerClids; 
        private Long customerClidsCategory; 
        private String customerClidsGroup; 
        private String customerMoh; 
        private Long customerTimeout; 
        private String customerVoice; 
        private String description; 
        private Long enterpriseId; 
        private Long forceEndFlag; 
        private Long isRewarm; 
        private Long ivrId; 
        private String ivrName; 
        private Long maxWaitTime; 
        private Long minAvailableAgentCount; 
        private String name; 
        private Long ownerId; 
        private Long predictAdjust; 
        private Double quotiety; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String retryStrategy; 
        private Long retryStrategyOnlyToday; 
        private Long retryStrategyTimeType; 
        private String taskId; 
        private String timeStrategy; 
        private String userFields; 
        private Long warmUpDuration; 
        private Long wrapup; 

        private Builder() {
            super();
        } 

        private Builder(CloudUpdateTaskRequest request) {
            super(request);
            this.agentGroup = request.agentGroup;
            this.agentTimeout = request.agentTimeout;
            this.answerRate = request.answerRate;
            this.autoComplete = request.autoComplete;
            this.autoStart = request.autoStart;
            this.autoStartDay = request.autoStartDay;
            this.autoStartTime = request.autoStartTime;
            this.autoStop = request.autoStop;
            this.autoStopDay = request.autoStopDay;
            this.autoStopTime = request.autoStopTime;
            this.autoTaskType = request.autoTaskType;
            this.autoTriggerTimeStrategy = request.autoTriggerTimeStrategy;
            this.callLimitStrategy = request.callLimitStrategy;
            this.callPriorityStrategy = request.callPriorityStrategy;
            this.callRouteStrategy = request.callRouteStrategy;
            this.callStrategy = request.callStrategy;
            this.callVariables = request.callVariables;
            this.clidProperty = request.clidProperty;
            this.cnos = request.cnos;
            this.concurrency = request.concurrency;
            this.customerClidType = request.customerClidType;
            this.customerClidWeight = request.customerClidWeight;
            this.customerClidWeightFlag = request.customerClidWeightFlag;
            this.customerClids = request.customerClids;
            this.customerClidsCategory = request.customerClidsCategory;
            this.customerClidsGroup = request.customerClidsGroup;
            this.customerMoh = request.customerMoh;
            this.customerTimeout = request.customerTimeout;
            this.customerVoice = request.customerVoice;
            this.description = request.description;
            this.enterpriseId = request.enterpriseId;
            this.forceEndFlag = request.forceEndFlag;
            this.isRewarm = request.isRewarm;
            this.ivrId = request.ivrId;
            this.ivrName = request.ivrName;
            this.maxWaitTime = request.maxWaitTime;
            this.minAvailableAgentCount = request.minAvailableAgentCount;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.predictAdjust = request.predictAdjust;
            this.quotiety = request.quotiety;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retryStrategy = request.retryStrategy;
            this.retryStrategyOnlyToday = request.retryStrategyOnlyToday;
            this.retryStrategyTimeType = request.retryStrategyTimeType;
            this.taskId = request.taskId;
            this.timeStrategy = request.timeStrategy;
            this.userFields = request.userFields;
            this.warmUpDuration = request.warmUpDuration;
            this.wrapup = request.wrapup;
        } 

        /**
         * <p>外呼组号；callGroupType=2时必填。注：一个外呼组可以绑定到多个任务，但只能同时运行一个任务中</p>
         * 
         * <strong>example:</strong>
         * <p>6,7</p>
         */
        public Builder agentGroup(String agentGroup) {
            this.putQueryParameter("AgentGroup", agentGroup);
            this.agentGroup = agentGroup;
            return this;
        }

        /**
         * <p>座席超时时间；单位秒数，默认10秒，取值范围5 ~ 60</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder agentTimeout(Long agentTimeout) {
            this.putQueryParameter("AgentTimeout", agentTimeout);
            this.agentTimeout = agentTimeout;
            return this;
        }

        /**
         * <p>初始化预计客户接通率；默认50，取值范围1～100，预热阶段的呼叫，按照此接通率计算呼叫频率</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder answerRate(Long answerRate) {
            this.putQueryParameter("AnswerRate", answerRate);
            this.answerRate = answerRate;
            return this;
        }

        /**
         * <p>0.关闭 1.开启，默认开启。开启：任务中的号码呼叫完后，任务自动完成，状态设置为结束，关闭：任务中的号码呼叫完后，任务自动暂停，状态设置为暂停注：任务在结束状态时无法再次启动。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoComplete(Long autoComplete) {
            this.putQueryParameter("AutoComplete", autoComplete);
            this.autoComplete = autoComplete;
            return this;
        }

        /**
         * <p>定时开始；0.关闭 1.开启，默认关闭。值为1时autoStartDay和autoStartTime参数才生效，并且至少设置其中的一个</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoStart(Long autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * <p>定时开始日期；autoStart=1时生效。参数不传入时默认在当天的autoStartTime定时启动。格式：yyyy-MM-dd，如：2017-01-01</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        public Builder autoStartDay(String autoStartDay) {
            this.putQueryParameter("AutoStartDay", autoStartDay);
            this.autoStartDay = autoStartDay;
            return this;
        }

        /**
         * <p>定时开始时间；autoStart=1时生效。参数不传入时默认在autoStartDay的00:00:00定时启动。格式：HH:mm:ss，如：08:00:00</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        public Builder autoStartTime(String autoStartTime) {
            this.putQueryParameter("AutoStartTime", autoStartTime);
            this.autoStartTime = autoStartTime;
            return this;
        }

        /**
         * <p>定时完成；0.关闭 1.开启，默认关闭。值为1时autoStopDay和autoStopTime参数才生效，并且至少设置其中的一个</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoStop(Long autoStop) {
            this.putQueryParameter("AutoStop", autoStop);
            this.autoStop = autoStop;
            return this;
        }

        /**
         * <p>定时完成日期；autoStop=1时生效。参数不传入时默认在当天的autoStopTime定时完成。格式：yyyy-MM-dd，如：2017-01-01</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder autoStopDay(String autoStopDay) {
            this.putQueryParameter("AutoStopDay", autoStopDay);
            this.autoStopDay = autoStopDay;
            return this;
        }

        /**
         * <p>定时完成时间；autoStop=1时生效。参数不传入时默认在autoStopDay的23:59:59定时完成。格式：HH:mm:ss，如：17:00:00</p>
         * 
         * <strong>example:</strong>
         * <p>17:00:00</p>
         */
        public Builder autoStopTime(String autoStopTime) {
            this.putQueryParameter("AutoStopTime", autoStopTime);
            this.autoStopTime = autoStopTime;
            return this;
        }

        /**
         * <p>0.连续呼叫 1.间隔呼叫，默认连续呼叫。配合定时开始（autoStart）和定时结束（autoStop）参数使用，如任务需要在每天的特定时间段内呼叫则开启间隔呼叫方式</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoTaskType(Long autoTaskType) {
            this.putQueryParameter("AutoTaskType", autoTaskType);
            this.autoTaskType = autoTaskType;
            return this;
        }

        /**
         * <p>间隔呼叫时间段；autoTaskType=1时必填。呼叫的时间段配置。参数格式：时间条件编号。支持多个，多个使用英文&quot;,&quot;逗号隔开，如：9,22。注：时间条件列表可通过查询时间条件设置列表接口获取</p>
         * 
         * <strong>example:</strong>
         * <p>9,22</p>
         */
        public Builder autoTriggerTimeStrategy(String autoTriggerTimeStrategy) {
            this.putQueryParameter("AutoTriggerTimeStrategy", autoTriggerTimeStrategy);
            this.autoTriggerTimeStrategy = autoTriggerTimeStrategy;
            return this;
        }

        /**
         * <p>座席当日接听的通话个数上限，使用方式详见下方说明；JsonArray格式 [{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}] 注：使用座席当日接听数限制功能需开启企业配置，功能开启并且配置上限后系统才开始统计当日接听数</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cnos&quot;:[&quot;2000&quot;,&quot;2001&quot;],&quot;limit&quot;:&quot;5&quot;}]</p>
         */
        public Builder callLimitStrategy(String callLimitStrategy) {
            this.putQueryParameter("CallLimitStrategy", callLimitStrategy);
            this.callLimitStrategy = callLimitStrategy;
            return this;
        }

        /**
         * <p>数据结构为Json格式<code>{&quot;strategy&quot;:[{&quot;sort&quot;:1,&quot;type&quot;:&quot;retryCall&quot;, &quot;desc&quot;:0},{&quot;sort&quot;:2,&quot;type&quot;:&quot;firstCall&quot;,&quot;orderType&quot;:0}]}</code>格式说明：sort是重试号码和未呼叫号码的呼叫顺序 type：retryCall重试号码、firstCall未呼叫号码当type=retryCall，desc：0.优先呼叫待重呼轮次数值较小的号码，即轮次靠前（如第1轮、第2轮）的号码先被呼叫 1.优先呼叫待重呼轮次数值较大的号码，即轮次靠后（如第5轮、第4轮）的号码先被呼叫当type=firstCall时，orderType：随机呼叫，0顺序(优先级) 1随机 2顺序(导入时间)</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;strategy&quot;:[{&quot;sort&quot;:1,&quot;type&quot;:&quot;retryCall&quot;, &quot;desc&quot;:0},{&quot;sort&quot;:2,&quot;type&quot;:&quot;firstCall&quot;,&quot;orderType&quot;:0}]}</p>
         */
        public Builder callPriorityStrategy(String callPriorityStrategy) {
            this.putQueryParameter("CallPriorityStrategy", callPriorityStrategy);
            this.callPriorityStrategy = callPriorityStrategy;
            return this;
        }

        /**
         * <p>1.直连座席 2.AI转人工 直连座席模式：客户接听后直接分配座席，无空闲座席可溢出语音导航（需配置语音导航），保障高优先级客户直连体验 AI转人工：客户接入后，优先进入语音导航中配置的智能体机器人，按交互结果决定是否转接座席，提升自动化覆盖率，降低人工成本</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder callRouteStrategy(Long callRouteStrategy) {
            this.putQueryParameter("CallRouteStrategy", callRouteStrategy);
            this.callRouteStrategy = callRouteStrategy;
            return this;
        }

        /**
         * <p>座席分配规则；1.随机 2.顺序 3.座席未进线最大时（从上一次呼叫结束到当前的总时长） 4.座席状态[空闲]最长时长（座席最近一次切换为空闲状态的持续时长），默认随机</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder callStrategy(String callStrategy) {
            this.putQueryParameter("CallStrategy", callStrategy);
            this.callStrategy = callStrategy;
            return this;
        }

        /**
         * <p>座席通道变量。JsonArray格式；最大支持5个变量。默认空值， 示例：[{&quot;name&quot;:&quot;abcdefg&quot;,&quot;value&quot;:&quot;${cdr_enterprise_id}&quot;}] 注：单个字段值的长度不能超过1000个字符。变量会以SIP_HEADER的形式设置到座席侧通道</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;abcdefg&quot;,&quot;value&quot;:&quot;${cdr_enterprise_id}&quot;}]</p>
         */
        public Builder callVariables(String callVariables) {
            this.putQueryParameter("CallVariables", callVariables);
            this.callVariables = callVariables;
            return this;
        }

        /**
         * <p>外显规则；customerClidType=2时生效。Json格式，外显号码选择规则：默认区号，是否匹配省会等；如：{&quot;defaultAreaCode&quot;:&quot;010&quot;, &quot;isMatchCapital&quot;:&quot;1&quot;}。不建议使用</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;defaultAreaCode&quot;:&quot;010&quot;, &quot;isMatchCapital&quot;:&quot;1&quot;}</p>
         */
        public Builder clidProperty(String clidProperty) {
            this.putQueryParameter("ClidProperty", clidProperty);
            this.clidProperty = clidProperty;
            return this;
        }

        /**
         * <p>座席工号列表；callGroupType=1时必填。支持多个座席工号，多个之间使用英文逗号&quot;,&quot;分隔注：一个座席只能在一个运行中的任务中</p>
         * 
         * <strong>example:</strong>
         * <p>1111,2222</p>
         */
        public Builder cnos(String cnos) {
            this.putQueryParameter("Cnos", cnos);
            this.cnos = cnos;
            return this;
        }

        /**
         * <p>任务维度限制最大并发数，实际并发不会超过最大并发限制。type=1时，配置成0表示不限制，座席数量少于10时建议配置该参数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder concurrency(Long concurrency) {
            this.putQueryParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>客户侧外显规则；customerClidsCategory=1或2时生效。1.随机 2.按区号，默认随机。不建议使用</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customerClidType(Long customerClidType) {
            this.putQueryParameter("CustomerClidType", customerClidType);
            this.customerClidType = customerClidType;
            return this;
        }

        /**
         * <p>外显号码比例配置内容；customerClidsCategory=1且customerClidWeightFlag=1时生效。JsonArray格式 [{&quot;number&quot;:&quot;123,345&quot;,&quot;weight&quot;:&quot;5&quot;}, {&quot;number&quot;:&quot;567,789&quot;,&quot;weight&quot;:&quot;5&quot;}]，不建议使用</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;number&quot;:&quot;123,345&quot;,&quot;weight&quot;:&quot;5&quot;}, {&quot;number&quot;:&quot;567,789&quot;,&quot;weight&quot;:&quot;5&quot;}]</p>
         */
        public Builder customerClidWeight(String customerClidWeight) {
            this.putQueryParameter("CustomerClidWeight", customerClidWeight);
            this.customerClidWeight = customerClidWeight;
            return this;
        }

        /**
         * <p>外显号码比例配置开关；customerClidsCategory=1时生效。0.关闭 1.开启，默认关闭。不建议使用</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder customerClidWeightFlag(Long customerClidWeightFlag) {
            this.putQueryParameter("CustomerClidWeightFlag", customerClidWeightFlag);
            this.customerClidWeightFlag = customerClidWeightFlag;
            return this;
        }

        /**
         * <p>客户侧外显号码列表；customerClidsCategory=1或2时必填。支持多个，多个直接使用英文逗号&quot;,&quot;分隔。不建议使用</p>
         * 
         * <strong>example:</strong>
         * <p>64203667,23434294</p>
         */
        public Builder customerClids(String customerClids) {
            this.putQueryParameter("CustomerClids", customerClids);
            this.customerClids = customerClids;
            return this;
        }

        /**
         * <p>客户侧外显号码类型；1.外显固话 2.外显手机号 4.外显号码池 5.外显导航注：推荐使用外显导航，可以灵活调整和控制外显策略。其他类型将逐步下线</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customerClidsCategory(Long customerClidsCategory) {
            this.putQueryParameter("CustomerClidsCategory", customerClidsCategory);
            this.customerClidsCategory = customerClidsCategory;
            return this;
        }

        /**
         * <p>客户侧外显号码池名称或外显导航标识；customerClidsCategory=4或5时必填。customerClidsCategory=4时customerClidsGroup传号码池名称。customerClidsCategory=5时customerClidsGroup传外显导航标识</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder customerClidsGroup(String customerClidsGroup) {
            this.putQueryParameter("CustomerClidsGroup", customerClidsGroup);
            this.customerClidsGroup = customerClidsGroup;
            return this;
        }

        /**
         * <p>客户侧等待音；客户接听后呼叫座席，等待座席接听时播放的语音，默认为空白音。支持公共语音和企业语音，值为语音文件的path，如:60000011533526918819</p>
         * 
         * <strong>example:</strong>
         * <p>60000011533526918819</p>
         */
        public Builder customerMoh(String customerMoh) {
            this.putQueryParameter("CustomerMoh", customerMoh);
            this.customerMoh = customerMoh;
            return this;
        }

        /**
         * <p>客户超时时间；单位秒数，默认30秒，取值范围5 ~ 60</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        public Builder customerTimeout(Long customerTimeout) {
            this.putQueryParameter("CustomerTimeout", customerTimeout);
            this.customerTimeout = customerTimeout;
            return this;
        }

        /**
         * <p>客户侧提示音；客户接听后呼转座席前播放的语音，提示音播放完成后再找座席，默认无提示音。支持公共语音和企业语音，值为语音文件的path，如:60000011533526918819</p>
         * 
         * <strong>example:</strong>
         * <p>60000011533526918819</p>
         */
        public Builder customerVoice(String customerVoice) {
            this.putQueryParameter("CustomerVoice", customerVoice);
            this.customerVoice = customerVoice;
            return this;
        }

        /**
         * <p>任务描述；需进行UTF-8格式的URLEncode编码，长度小于200字</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>定时完成时强制结束任务；autoStop=1时生效。0.关闭 1.开启，默认关闭。开启配置后，当任务到定时完成时间时无论任务中的号码是否已经呼完，均将任务状态设置为结束。适用于对数据有呼叫时间限制的场景。注：任务在结束状态时无法再次启动。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder forceEndFlag(Long forceEndFlag) {
            this.putQueryParameter("ForceEndFlag", forceEndFlag);
            this.forceEndFlag = forceEndFlag;
            return this;
        }

        /**
         * <p>暂停后重新预热；0.关闭，1开启，默认开启，任务暂停后是否需要重新预热</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isRewarm(Long isRewarm) {
            this.putQueryParameter("IsRewarm", isRewarm);
            this.isRewarm = isRewarm;
            return this;
        }

        /**
         * <p>语音导航Id；参数ivrId和ivrName二选一，同时传入时ivrId生效，在创建自动外呼任务时ivrId或ivrName必选其一。预测外呼使用场景：如果客户接听后未在特定时间内（默认2秒）找到可用座席，通话将溢出到语音导航继续排队找座席。同时支持在呼转座席，座席未接听时也溢出到语音导航，需要开启企业配置生效自动外呼使用场景：客户接听后，转到的语音导航</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder ivrId(Long ivrId) {
            this.putQueryParameter("IvrId", ivrId);
            this.ivrId = ivrId;
            return this;
        }

        /**
         * <p>语音导航名称；参数ivrId和ivrName二选一，同时传入时ivrId生效，在创建自动外呼任务时ivrId或ivrName必选其一。</p>
         * 
         * <strong>example:</strong>
         * <p>IvrName1</p>
         */
        public Builder ivrName(String ivrName) {
            this.putQueryParameter("IvrName", ivrName);
            this.ivrName = ivrName;
            return this;
        }

        /**
         * <p>座席最长等待时间；默认40秒，最小10，最大600，允许座席空闲的最大时间。任务执行过程中，如果座席平均空闲时间大于maxWaitTime，每次呼叫个数会增加</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder maxWaitTime(Long maxWaitTime) {
            this.putQueryParameter("MaxWaitTime", maxWaitTime);
            this.maxWaitTime = maxWaitTime;
            return this;
        }

        /**
         * <p>最小可用座席数；默认为10，取值范围1 ~ 10。任务内可用座席数小于当前值时，任务自动暂停，避免骚扰</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minAvailableAgentCount(Long minAvailableAgentCount) {
            this.putQueryParameter("MinAvailableAgentCount", minAvailableAgentCount);
            this.minAvailableAgentCount = minAvailableAgentCount;
            return this;
        }

        /**
         * <p>任务名称；需进行UTF-8格式的URLEncode编码，长度小于50字</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>超呼率；默认值为100，取值范围50～400</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder predictAdjust(Long predictAdjust) {
            this.putQueryParameter("PredictAdjust", predictAdjust);
            this.predictAdjust = predictAdjust;
            return this;
        }

        /**
         * <p>骚扰率；默认值为1，取值范围为大于0，小于等于20，支持小数，精确到小数点两位。值越小呼叫的号码越少，值越大呼叫的号码越多，座席利用率越高</p>
         * 
         * <strong>example:</strong>
         * <p>19.00</p>
         */
        public Builder quotiety(Double quotiety) {
            this.putQueryParameter("Quotiety", quotiety);
            this.quotiety = quotiety;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>重试策略；「基础模式」数据结构为Json格式<code>{&quot;retry&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;1-1-1&quot;},{&quot;round&quot;:2,&quot;time&quot;:&quot;2-2-2&quot;}]}</code>格式说明：retry是重试次数，round是第几次重试，time是第几次重试间隔的时间：1-1-1，第一个1是天，第二个1是小时，第三个1是分钟「高级模式」高级模式需要开启「号码状态识别」服务数据结构为JsonArray格式 <code>[{&quot;condition&quot;:{&quot;sipCause&quot;:[710,719]},&quot;retry&quot;:1,&quot;sort&quot;:1,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;0-0-10&quot;}]},{&quot;condition&quot;:{&quot;sipCause&quot;:[800]},&quot;retry&quot;:1,&quot;sort&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:2,&quot;time&quot;:&quot;0-0-10&quot;}]}]</code>格式说明：condition是重试条件，sort是重试条件的顺序，其余字段与基础模式一致 注：基础模式和高级模式的区分根据传入的参数格式自动识别。基于首次呼叫时间重试时，每轮的重试时间必须大于上一轮的时间</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;retry&quot;:2,&quot;strategy&quot;:[{&quot;round&quot;:1,&quot;time&quot;:&quot;1-1-1&quot;},{&quot;round&quot;:2,&quot;time&quot;:&quot;2-2-2&quot;}]}</p>
         */
        public Builder retryStrategy(String retryStrategy) {
            this.putQueryParameter("RetryStrategy", retryStrategy);
            this.retryStrategy = retryStrategy;
            return this;
        }

        /**
         * <p>任务仅当天生效；0.关闭 1.开启，删除待重试的数据和待呼叫的数据 2.开启，删除待重试的数据 3.开启，删除待呼叫的数据，默认关闭</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retryStrategyOnlyToday(Long retryStrategyOnlyToday) {
            this.putQueryParameter("RetryStrategyOnlyToday", retryStrategyOnlyToday);
            this.retryStrategyOnlyToday = retryStrategyOnlyToday;
            return this;
        }

        /**
         * <p>重试策略时间类型；配置重试策略时生效。 1.基于首次呼叫时间 2.基于上次呼叫时间，默认基于首次呼叫时间</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retryStrategyTimeType(Long retryStrategyTimeType) {
            this.putQueryParameter("RetryStrategyTimeType", retryStrategyTimeType);
            this.retryStrategyTimeType = retryStrategyTimeType;
            return this;
        }

        /**
         * <p>外呼任务Id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>133224</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>禁呼时间；在特定的时间段内禁止呼叫。参数格式：时间条件编号。支持多个，多个使用英文&quot;,&quot;逗号隔开，如：9,22。注：时间条件列表可通过查询时间条件设置列表接口获取</p>
         * 
         * <strong>example:</strong>
         * <p>9,22</p>
         */
        public Builder timeStrategy(String timeStrategy) {
            this.putQueryParameter("TimeStrategy", timeStrategy);
            this.timeStrategy = timeStrategy;
            return this;
        }

        /**
         * <p>任务自定义字段。JsonArray格式；数组的每个元素只支持传递一组键值对，传递多组只取第一组，如 {&quot;key&quot;, &quot;value&quot;}。 默认空值，示例：[{&quot;name&quot;:&quot;1234&quot;},{&quot;name1&quot;:&quot;12345&quot;}] 注：单个字段值的长度不能超过1000个字符</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;1234&quot;},{&quot;name1&quot;:&quot;12345&quot;}]</p>
         */
        public Builder userFields(String userFields) {
            this.putQueryParameter("UserFields", userFields);
            this.userFields = userFields;
            return this;
        }

        /**
         * <p>任务预热时间；默认300秒, 取值范围60 ～ 600</p>
         * 
         * <strong>example:</strong>
         * <p>370</p>
         */
        public Builder warmUpDuration(Long warmUpDuration) {
            this.putQueryParameter("WarmUpDuration", warmUpDuration);
            this.warmUpDuration = warmUpDuration;
            return this;
        }

        /**
         * <p>座席整理时间；默认30秒，取值范围1～10800，整理时间会影响每次呼叫的个数，值越大，呼叫号码个数会减小</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder wrapup(Long wrapup) {
            this.putQueryParameter("Wrapup", wrapup);
            this.wrapup = wrapup;
            return this;
        }

        @Override
        public CloudUpdateTaskRequest build() {
            return new CloudUpdateTaskRequest(this);
        } 

    } 

}
