// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link EditTaskRequest} extends {@link RequestModel}
 *
 * <p>EditTaskRequest</p>
 */
public class EditTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTimeList")
    private java.util.List<CallTimeList> callTimeList;

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
    private java.util.List<Long> repeatReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepeatTimes")
    private java.util.List<String> repeatTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendSmsPlan")
    private java.util.List<SendSmsPlan> sendSmsPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private Long templateType;

    private EditTaskRequest(Builder builder) {
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
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callTimeList
     */
    public java.util.List<CallTimeList> getCallTimeList() {
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
    public java.util.List<Long> getRepeatReason() {
        return this.repeatReason;
    }

    /**
     * @return repeatTimes
     */
    public java.util.List<String> getRepeatTimes() {
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
    public java.util.List<SendSmsPlan> getSendSmsPlan() {
        return this.sendSmsPlan;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
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

    public static final class Builder extends Request.Builder<EditTaskRequest, Builder> {
        private java.util.List<CallTimeList> callTimeList; 
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
        private java.util.List<Long> repeatReason; 
        private java.util.List<String> repeatTimes; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<SendSmsPlan> sendSmsPlan; 
        private Long status; 
        private Long taskId; 
        private Long templateId; 
        private Long templateType; 

        private Builder() {
            super();
        } 

        private Builder(EditTaskRequest request) {
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
            this.status = request.status;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
        } 

        /**
         * <p>外呼时间</p>
         */
        public Builder callTimeList(java.util.List<CallTimeList> callTimeList) {
            String callTimeListShrink = shrink(callTimeList, "CallTimeList", "json");
            this.putQueryParameter("CallTimeList", callTimeListShrink);
            this.callTimeList = callTimeList;
            return this;
        }

        /**
         * <p>回调地址</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>当发送闪信配置为1时，闪信模板ID必填</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder flashSmsTemplateId(Long flashSmsTemplateId) {
            this.putQueryParameter("FlashSmsTemplateId", flashSmsTemplateId);
            this.flashSmsTemplateId = flashSmsTemplateId;
            return this;
        }

        /**
         * <p>发送闪信配置,默认为0,0不发送闪信.1发送闪信</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder flashSmsType(Long flashSmsType) {
            this.putQueryParameter("FlashSmsType", flashSmsType);
            this.flashSmsType = flashSmsType;
            return this;
        }

        /**
         * <p>并发数</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        public Builder maxConcurrency(Long maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>任务名称</p>
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
         * <p>播放间隔时长</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        public Builder playSleepVal(Long playSleepVal) {
            this.putQueryParameter("PlaySleepVal", playSleepVal);
            this.playSleepVal = playSleepVal;
            return this;
        }

        /**
         * <p>录音播放次数</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder playTimes(Long playTimes) {
            this.putQueryParameter("PlayTimes", playTimes);
            this.playTimes = playTimes;
            return this;
        }

        /**
         * <p>重呼配置</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recallType(Long recallType) {
            this.putQueryParameter("RecallType", recallType);
            this.recallType = recallType;
            return this;
        }

        /**
         * <p>录音地址</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder recordPath(String recordPath) {
            this.putQueryParameter("RecordPath", recordPath);
            this.recordPath = recordPath;
            return this;
        }

        /**
         * <p>重呼次数</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        public Builder repeatCount(Long repeatCount) {
            this.putQueryParameter("RepeatCount", repeatCount);
            this.repeatCount = repeatCount;
            return this;
        }

        /**
         * <p>重呼间隔</p>
         * 
         * <strong>example:</strong>
         * <p>91</p>
         */
        public Builder repeatInterval(Long repeatInterval) {
            this.putQueryParameter("RepeatInterval", repeatInterval);
            this.repeatInterval = repeatInterval;
            return this;
        }

        /**
         * <p>重呼条件</p>
         */
        public Builder repeatReason(java.util.List<Long> repeatReason) {
            String repeatReasonShrink = shrink(repeatReason, "RepeatReason", "json");
            this.putQueryParameter("RepeatReason", repeatReasonShrink);
            this.repeatReason = repeatReason;
            return this;
        }

        /**
         * <p>重呼时间</p>
         */
        public Builder repeatTimes(java.util.List<String> repeatTimes) {
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
         * <p>短信发送规则</p>
         */
        public Builder sendSmsPlan(java.util.List<SendSmsPlan> sendSmsPlan) {
            String sendSmsPlanShrink = shrink(sendSmsPlan, "SendSmsPlan", "json");
            this.putQueryParameter("SendSmsPlan", sendSmsPlanShrink);
            this.sendSmsPlan = sendSmsPlan;
            return this;
        }

        /**
         * <p>任务状态</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>任务id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>话术模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>话术模板类型</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateType(Long templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public EditTaskRequest build() {
            return new EditTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link EditTaskRequest} extends {@link TeaModel}
     *
     * <p>EditTaskRequest</p>
     */
    public static class CallTimeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallTime")
        private java.util.List<String> callTime;

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
        public java.util.List<String> getCallTime() {
            return this.callTime;
        }

        public static final class Builder {
            private java.util.List<String> callTime; 

            private Builder() {
            } 

            private Builder(CallTimeList model) {
                this.callTime = model.callTime;
            } 

            /**
             * CallTime.
             */
            public Builder callTime(java.util.List<String> callTime) {
                this.callTime = callTime;
                return this;
            }

            public CallTimeList build() {
                return new CallTimeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EditTaskRequest} extends {@link TeaModel}
     *
     * <p>EditTaskRequest</p>
     */
    public static class SendSmsPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntentTags")
        private java.util.List<String> intentTags;

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
        public java.util.List<String> getIntentTags() {
            return this.intentTags;
        }

        /**
         * @return smsTemplateId
         */
        public Long getSmsTemplateId() {
            return this.smsTemplateId;
        }

        public static final class Builder {
            private java.util.List<String> intentTags; 
            private Long smsTemplateId; 

            private Builder() {
            } 

            private Builder(SendSmsPlan model) {
                this.intentTags = model.intentTags;
                this.smsTemplateId = model.smsTemplateId;
            } 

            /**
             * <p>意向标签</p>
             */
            public Builder intentTags(java.util.List<String> intentTags) {
                this.intentTags = intentTags;
                return this;
            }

            /**
             * <p>短信模板ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
