// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTaskRequest} extends {@link RequestModel}
 *
 * <p>AddTaskRequest</p>
 */
public class AddTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTimeList")
    private java.util.List < CallTimeList> callTimeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashSmsTemplateId")
    private Long flashSmsTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashSmsType")
    private Long flashSmsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    private Long maxConcurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaySleepVal")
    private Long playSleepVal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTimes")
    private Long playTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallType")
    private Long recallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordPath")
    private String recordPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatCount")
    private Long repeatCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatInterval")
    private Long repeatInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatReason")
    private java.util.List < String > repeatReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatTimes")
    private java.util.List < String > repeatTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendSmsPlan")
    private java.util.List < SendSmsPlan> sendSmsPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private Long templateType;

    private AddTaskRequest(Builder builder) {
        super(builder);
        this.callTimeList = builder.callTimeList;
        this.callbackUrl = builder.callbackUrl;
        this.flashSmsTemplateId = builder.flashSmsTemplateId;
        this.flashSmsType = builder.flashSmsType;
        this.maxConcurrency = builder.maxConcurrency;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.playSleepVal = builder.playSleepVal;
        this.playTimes = builder.playTimes;
        this.recallType = builder.recallType;
        this.recordPath = builder.recordPath;
        this.repeatCount = builder.repeatCount;
        this.repeatInterval = builder.repeatInterval;
        this.repeatReason = builder.repeatReason;
        this.repeatTimes = builder.repeatTimes;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sendSmsPlan = builder.sendSmsPlan;
        this.startTime = builder.startTime;
        this.taskType = builder.taskType;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callTimeList
     */
    public java.util.List < CallTimeList> getCallTimeList() {
        return this.callTimeList;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return flashSmsTemplateId
     */
    public Long getFlashSmsTemplateId() {
        return this.flashSmsTemplateId;
    }

    /**
     * @return flashSmsType
     */
    public Long getFlashSmsType() {
        return this.flashSmsType;
    }

    /**
     * @return maxConcurrency
     */
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
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
     * @return playSleepVal
     */
    public Long getPlaySleepVal() {
        return this.playSleepVal;
    }

    /**
     * @return playTimes
     */
    public Long getPlayTimes() {
        return this.playTimes;
    }

    /**
     * @return recallType
     */
    public Long getRecallType() {
        return this.recallType;
    }

    /**
     * @return recordPath
     */
    public String getRecordPath() {
        return this.recordPath;
    }

    /**
     * @return repeatCount
     */
    public Long getRepeatCount() {
        return this.repeatCount;
    }

    /**
     * @return repeatInterval
     */
    public Long getRepeatInterval() {
        return this.repeatInterval;
    }

    /**
     * @return repeatReason
     */
    public java.util.List < String > getRepeatReason() {
        return this.repeatReason;
    }

    /**
     * @return repeatTimes
     */
    public java.util.List < String > getRepeatTimes() {
        return this.repeatTimes;
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
     * @return sendSmsPlan
     */
    public java.util.List < SendSmsPlan> getSendSmsPlan() {
        return this.sendSmsPlan;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskType
     */
    public Long getTaskType() {
        return this.taskType;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public Long getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<AddTaskRequest, Builder> {
        private java.util.List < CallTimeList> callTimeList; 
        private String callbackUrl; 
        private Long flashSmsTemplateId; 
        private Long flashSmsType; 
        private Long maxConcurrency; 
        private String name; 
        private Long ownerId; 
        private Long playSleepVal; 
        private Long playTimes; 
        private Long recallType; 
        private String recordPath; 
        private Long repeatCount; 
        private Long repeatInterval; 
        private java.util.List < String > repeatReason; 
        private java.util.List < String > repeatTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < SendSmsPlan> sendSmsPlan; 
        private String startTime; 
        private Long taskType; 
        private Long templateId; 
        private Long templateType; 

        private Builder() {
            super();
        } 

        private Builder(AddTaskRequest request) {
            super(request);
            this.callTimeList = request.callTimeList;
            this.callbackUrl = request.callbackUrl;
            this.flashSmsTemplateId = request.flashSmsTemplateId;
            this.flashSmsType = request.flashSmsType;
            this.maxConcurrency = request.maxConcurrency;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.playSleepVal = request.playSleepVal;
            this.playTimes = request.playTimes;
            this.recallType = request.recallType;
            this.recordPath = request.recordPath;
            this.repeatCount = request.repeatCount;
            this.repeatInterval = request.repeatInterval;
            this.repeatReason = request.repeatReason;
            this.repeatTimes = request.repeatTimes;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sendSmsPlan = request.sendSmsPlan;
            this.startTime = request.startTime;
            this.taskType = request.taskType;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
        } 

        /**
         * 外呼时间
         */
        public Builder callTimeList(java.util.List < CallTimeList> callTimeList) {
            String callTimeListShrink = shrink(callTimeList, "CallTimeList", "json");
            this.putQueryParameter("CallTimeList", callTimeListShrink);
            this.callTimeList = callTimeList;
            return this;
        }

        /**
         * 回调地址
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * 当发送闪信配置为1时，闪信模板ID必填
         */
        public Builder flashSmsTemplateId(Long flashSmsTemplateId) {
            this.putQueryParameter("FlashSmsTemplateId", flashSmsTemplateId);
            this.flashSmsTemplateId = flashSmsTemplateId;
            return this;
        }

        /**
         * 发送闪信配置
         */
        public Builder flashSmsType(Long flashSmsType) {
            this.putQueryParameter("FlashSmsType", flashSmsType);
            this.flashSmsType = flashSmsType;
            return this;
        }

        /**
         * 并发数
         */
        public Builder maxConcurrency(Long maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * 任务名称
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
         * 播放间隔时长
         */
        public Builder playSleepVal(Long playSleepVal) {
            this.putQueryParameter("PlaySleepVal", playSleepVal);
            this.playSleepVal = playSleepVal;
            return this;
        }

        /**
         * 录音播放次数
         */
        public Builder playTimes(Long playTimes) {
            this.putQueryParameter("PlayTimes", playTimes);
            this.playTimes = playTimes;
            return this;
        }

        /**
         * 重呼配置
         */
        public Builder recallType(Long recallType) {
            this.putQueryParameter("RecallType", recallType);
            this.recallType = recallType;
            return this;
        }

        /**
         * 录音地址
         */
        public Builder recordPath(String recordPath) {
            this.putQueryParameter("RecordPath", recordPath);
            this.recordPath = recordPath;
            return this;
        }

        /**
         * 重呼次数
         */
        public Builder repeatCount(Long repeatCount) {
            this.putQueryParameter("RepeatCount", repeatCount);
            this.repeatCount = repeatCount;
            return this;
        }

        /**
         * 重呼间隔
         */
        public Builder repeatInterval(Long repeatInterval) {
            this.putQueryParameter("RepeatInterval", repeatInterval);
            this.repeatInterval = repeatInterval;
            return this;
        }

        /**
         * 重呼条件
         */
        public Builder repeatReason(java.util.List < String > repeatReason) {
            String repeatReasonShrink = shrink(repeatReason, "RepeatReason", "json");
            this.putQueryParameter("RepeatReason", repeatReasonShrink);
            this.repeatReason = repeatReason;
            return this;
        }

        /**
         * 重呼时间
         */
        public Builder repeatTimes(java.util.List < String > repeatTimes) {
            String repeatTimesShrink = shrink(repeatTimes, "RepeatTimes", "json");
            this.putQueryParameter("RepeatTimes", repeatTimesShrink);
            this.repeatTimes = repeatTimes;
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
         * 短信发送规则
         */
        public Builder sendSmsPlan(java.util.List < SendSmsPlan> sendSmsPlan) {
            String sendSmsPlanShrink = shrink(sendSmsPlan, "SendSmsPlan", "json");
            this.putQueryParameter("SendSmsPlan", sendSmsPlanShrink);
            this.sendSmsPlan = sendSmsPlan;
            return this;
        }

        /**
         * 任务启动日期
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 任务类型
         */
        public Builder taskType(Long taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * 话术模板ID
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * 话术模板类型
         */
        public Builder templateType(Long templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public AddTaskRequest build() {
            return new AddTaskRequest(this);
        } 

    } 

    public static class CallTimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallTime")
        private java.util.List < String > callTime;

        private CallTimeList(Builder builder) {
            this.callTime = builder.callTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallTimeList create() {
            return builder().build();
        }

        /**
         * @return callTime
         */
        public java.util.List < String > getCallTime() {
            return this.callTime;
        }

        public static final class Builder {
            private java.util.List < String > callTime; 

            /**
             * CallTime.
             */
            public Builder callTime(java.util.List < String > callTime) {
                this.callTime = callTime;
                return this;
            }

            public CallTimeList build() {
                return new CallTimeList(this);
            } 

        } 

    }
    public static class SendSmsPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntentTags")
        private java.util.List < String > intentTags;

        @com.aliyun.core.annotation.NameInMap("SmsTemplateId")
        private Long smsTemplateId;

        private SendSmsPlan(Builder builder) {
            this.intentTags = builder.intentTags;
            this.smsTemplateId = builder.smsTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SendSmsPlan create() {
            return builder().build();
        }

        /**
         * @return intentTags
         */
        public java.util.List < String > getIntentTags() {
            return this.intentTags;
        }

        /**
         * @return smsTemplateId
         */
        public Long getSmsTemplateId() {
            return this.smsTemplateId;
        }

        public static final class Builder {
            private java.util.List < String > intentTags; 
            private Long smsTemplateId; 

            /**
             * 意向标签
             */
            public Builder intentTags(java.util.List < String > intentTags) {
                this.intentTags = intentTags;
                return this;
            }

            /**
             * 短信模板ID
             */
            public Builder smsTemplateId(Long smsTemplateId) {
                this.smsTemplateId = smsTemplateId;
                return this;
            }

            public SendSmsPlan build() {
                return new SendSmsPlan(this);
            } 

        } 

    }
}
