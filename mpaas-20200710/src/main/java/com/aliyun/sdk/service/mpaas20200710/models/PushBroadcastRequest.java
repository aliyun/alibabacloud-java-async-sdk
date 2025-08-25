// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link PushBroadcastRequest} extends {@link RequestModel}
 *
 * <p>PushBroadcastRequest</p>
 */
public class PushBroadcastRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidChannel")
    private Long androidChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindEndTime")
    private Long bindEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindStartTime")
    private Long bindStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Classification")
    private String classification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10)
    private Long deliveryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpiredSeconds")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 259200)
    private Long expiredSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendedParams")
    private String extendedParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MiChannelId")
    private String miChannelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Msgkey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgkey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyLevel")
    private java.util.Map<String, ?> notifyLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyType")
    private String notifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushAction")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Long pushAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushStatus")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Long pushStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Silent")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Long silent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyContent")
    private String strategyContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StrategyType")
    private Integer strategyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateKeyValue")
    private String templateKeyValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdChannelCategory")
    private java.util.Map<String, ?> thirdChannelCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeMode")
    private Integer timeMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransparentMessagePayload")
    private Object transparentMessagePayload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransparentMessageUrgency")
    private String transparentMessageUrgency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnBindEndTime")
    private Long unBindEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnBindPeriod")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Long unBindPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnBindStartTime")
    private Long unBindStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private PushBroadcastRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.androidChannel = builder.androidChannel;
        this.appId = builder.appId;
        this.bindEndTime = builder.bindEndTime;
        this.bindStartTime = builder.bindStartTime;
        this.channelId = builder.channelId;
        this.classification = builder.classification;
        this.deliveryType = builder.deliveryType;
        this.expiredSeconds = builder.expiredSeconds;
        this.extendedParams = builder.extendedParams;
        this.miChannelId = builder.miChannelId;
        this.msgkey = builder.msgkey;
        this.notifyLevel = builder.notifyLevel;
        this.notifyType = builder.notifyType;
        this.pushAction = builder.pushAction;
        this.pushStatus = builder.pushStatus;
        this.silent = builder.silent;
        this.strategyContent = builder.strategyContent;
        this.strategyType = builder.strategyType;
        this.taskName = builder.taskName;
        this.templateKeyValue = builder.templateKeyValue;
        this.templateName = builder.templateName;
        this.tenantId = builder.tenantId;
        this.thirdChannelCategory = builder.thirdChannelCategory;
        this.timeMode = builder.timeMode;
        this.transparentMessagePayload = builder.transparentMessagePayload;
        this.transparentMessageUrgency = builder.transparentMessageUrgency;
        this.unBindEndTime = builder.unBindEndTime;
        this.unBindPeriod = builder.unBindPeriod;
        this.unBindStartTime = builder.unBindStartTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushBroadcastRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return androidChannel
     */
    public Long getAndroidChannel() {
        return this.androidChannel;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return bindEndTime
     */
    public Long getBindEndTime() {
        return this.bindEndTime;
    }

    /**
     * @return bindStartTime
     */
    public Long getBindStartTime() {
        return this.bindStartTime;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return classification
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * @return deliveryType
     */
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return expiredSeconds
     */
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    /**
     * @return extendedParams
     */
    public String getExtendedParams() {
        return this.extendedParams;
    }

    /**
     * @return miChannelId
     */
    public String getMiChannelId() {
        return this.miChannelId;
    }

    /**
     * @return msgkey
     */
    public String getMsgkey() {
        return this.msgkey;
    }

    /**
     * @return notifyLevel
     */
    public java.util.Map<String, ?> getNotifyLevel() {
        return this.notifyLevel;
    }

    /**
     * @return notifyType
     */
    public String getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return pushAction
     */
    public Long getPushAction() {
        return this.pushAction;
    }

    /**
     * @return pushStatus
     */
    public Long getPushStatus() {
        return this.pushStatus;
    }

    /**
     * @return silent
     */
    public Long getSilent() {
        return this.silent;
    }

    /**
     * @return strategyContent
     */
    public String getStrategyContent() {
        return this.strategyContent;
    }

    /**
     * @return strategyType
     */
    public Integer getStrategyType() {
        return this.strategyType;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return templateKeyValue
     */
    public String getTemplateKeyValue() {
        return this.templateKeyValue;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return thirdChannelCategory
     */
    public java.util.Map<String, ?> getThirdChannelCategory() {
        return this.thirdChannelCategory;
    }

    /**
     * @return timeMode
     */
    public Integer getTimeMode() {
        return this.timeMode;
    }

    /**
     * @return transparentMessagePayload
     */
    public Object getTransparentMessagePayload() {
        return this.transparentMessagePayload;
    }

    /**
     * @return transparentMessageUrgency
     */
    public String getTransparentMessageUrgency() {
        return this.transparentMessageUrgency;
    }

    /**
     * @return unBindEndTime
     */
    public Long getUnBindEndTime() {
        return this.unBindEndTime;
    }

    /**
     * @return unBindPeriod
     */
    public Long getUnBindPeriod() {
        return this.unBindPeriod;
    }

    /**
     * @return unBindStartTime
     */
    public Long getUnBindStartTime() {
        return this.unBindStartTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PushBroadcastRequest, Builder> {
        private String regionId; 
        private Long androidChannel; 
        private String appId; 
        private Long bindEndTime; 
        private Long bindStartTime; 
        private String channelId; 
        private String classification; 
        private Long deliveryType; 
        private Long expiredSeconds; 
        private String extendedParams; 
        private String miChannelId; 
        private String msgkey; 
        private java.util.Map<String, ?> notifyLevel; 
        private String notifyType; 
        private Long pushAction; 
        private Long pushStatus; 
        private Long silent; 
        private String strategyContent; 
        private Integer strategyType; 
        private String taskName; 
        private String templateKeyValue; 
        private String templateName; 
        private String tenantId; 
        private java.util.Map<String, ?> thirdChannelCategory; 
        private Integer timeMode; 
        private Object transparentMessagePayload; 
        private String transparentMessageUrgency; 
        private Long unBindEndTime; 
        private Long unBindPeriod; 
        private Long unBindStartTime; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PushBroadcastRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.androidChannel = request.androidChannel;
            this.appId = request.appId;
            this.bindEndTime = request.bindEndTime;
            this.bindStartTime = request.bindStartTime;
            this.channelId = request.channelId;
            this.classification = request.classification;
            this.deliveryType = request.deliveryType;
            this.expiredSeconds = request.expiredSeconds;
            this.extendedParams = request.extendedParams;
            this.miChannelId = request.miChannelId;
            this.msgkey = request.msgkey;
            this.notifyLevel = request.notifyLevel;
            this.notifyType = request.notifyType;
            this.pushAction = request.pushAction;
            this.pushStatus = request.pushStatus;
            this.silent = request.silent;
            this.strategyContent = request.strategyContent;
            this.strategyType = request.strategyType;
            this.taskName = request.taskName;
            this.templateKeyValue = request.templateKeyValue;
            this.templateName = request.templateName;
            this.tenantId = request.tenantId;
            this.thirdChannelCategory = request.thirdChannelCategory;
            this.timeMode = request.timeMode;
            this.transparentMessagePayload = request.transparentMessagePayload;
            this.transparentMessageUrgency = request.transparentMessageUrgency;
            this.unBindEndTime = request.unBindEndTime;
            this.unBindPeriod = request.unBindPeriod;
            this.unBindStartTime = request.unBindStartTime;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AndroidChannel.
         */
        public Builder androidChannel(Long androidChannel) {
            this.putBodyParameter("AndroidChannel", androidChannel);
            this.androidChannel = androidChannel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BindEndTime.
         */
        public Builder bindEndTime(Long bindEndTime) {
            this.putBodyParameter("BindEndTime", bindEndTime);
            this.bindEndTime = bindEndTime;
            return this;
        }

        /**
         * BindStartTime.
         */
        public Builder bindStartTime(Long bindStartTime) {
            this.putBodyParameter("BindStartTime", bindStartTime);
            this.bindStartTime = bindStartTime;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * Classification.
         */
        public Builder classification(String classification) {
            this.putBodyParameter("Classification", classification);
            this.classification = classification;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryType(Long deliveryType) {
            this.putBodyParameter("DeliveryType", deliveryType);
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder expiredSeconds(Long expiredSeconds) {
            this.putBodyParameter("ExpiredSeconds", expiredSeconds);
            this.expiredSeconds = expiredSeconds;
            return this;
        }

        /**
         * ExtendedParams.
         */
        public Builder extendedParams(String extendedParams) {
            this.putBodyParameter("ExtendedParams", extendedParams);
            this.extendedParams = extendedParams;
            return this;
        }

        /**
         * MiChannelId.
         */
        public Builder miChannelId(String miChannelId) {
            this.putBodyParameter("MiChannelId", miChannelId);
            this.miChannelId = miChannelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder msgkey(String msgkey) {
            this.putBodyParameter("Msgkey", msgkey);
            this.msgkey = msgkey;
            return this;
        }

        /**
         * NotifyLevel.
         */
        public Builder notifyLevel(java.util.Map<String, ?> notifyLevel) {
            String notifyLevelShrink = shrink(notifyLevel, "NotifyLevel", "json");
            this.putBodyParameter("NotifyLevel", notifyLevelShrink);
            this.notifyLevel = notifyLevel;
            return this;
        }

        /**
         * NotifyType.
         */
        public Builder notifyType(String notifyType) {
            this.putBodyParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * PushAction.
         */
        public Builder pushAction(Long pushAction) {
            this.putBodyParameter("PushAction", pushAction);
            this.pushAction = pushAction;
            return this;
        }

        /**
         * PushStatus.
         */
        public Builder pushStatus(Long pushStatus) {
            this.putBodyParameter("PushStatus", pushStatus);
            this.pushStatus = pushStatus;
            return this;
        }

        /**
         * Silent.
         */
        public Builder silent(Long silent) {
            this.putBodyParameter("Silent", silent);
            this.silent = silent;
            return this;
        }

        /**
         * StrategyContent.
         */
        public Builder strategyContent(String strategyContent) {
            this.putBodyParameter("StrategyContent", strategyContent);
            this.strategyContent = strategyContent;
            return this;
        }

        /**
         * StrategyType.
         */
        public Builder strategyType(Integer strategyType) {
            this.putBodyParameter("StrategyType", strategyType);
            this.strategyType = strategyType;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TemplateKeyValue.
         */
        public Builder templateKeyValue(String templateKeyValue) {
            this.putBodyParameter("TemplateKeyValue", templateKeyValue);
            this.templateKeyValue = templateKeyValue;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ThirdChannelCategory.
         */
        public Builder thirdChannelCategory(java.util.Map<String, ?> thirdChannelCategory) {
            String thirdChannelCategoryShrink = shrink(thirdChannelCategory, "ThirdChannelCategory", "json");
            this.putBodyParameter("ThirdChannelCategory", thirdChannelCategoryShrink);
            this.thirdChannelCategory = thirdChannelCategory;
            return this;
        }

        /**
         * TimeMode.
         */
        public Builder timeMode(Integer timeMode) {
            this.putBodyParameter("TimeMode", timeMode);
            this.timeMode = timeMode;
            return this;
        }

        /**
         * TransparentMessagePayload.
         */
        public Builder transparentMessagePayload(Object transparentMessagePayload) {
            this.putBodyParameter("TransparentMessagePayload", transparentMessagePayload);
            this.transparentMessagePayload = transparentMessagePayload;
            return this;
        }

        /**
         * TransparentMessageUrgency.
         */
        public Builder transparentMessageUrgency(String transparentMessageUrgency) {
            this.putBodyParameter("TransparentMessageUrgency", transparentMessageUrgency);
            this.transparentMessageUrgency = transparentMessageUrgency;
            return this;
        }

        /**
         * UnBindEndTime.
         */
        public Builder unBindEndTime(Long unBindEndTime) {
            this.putBodyParameter("UnBindEndTime", unBindEndTime);
            this.unBindEndTime = unBindEndTime;
            return this;
        }

        /**
         * UnBindPeriod.
         */
        public Builder unBindPeriod(Long unBindPeriod) {
            this.putBodyParameter("UnBindPeriod", unBindPeriod);
            this.unBindPeriod = unBindPeriod;
            return this;
        }

        /**
         * UnBindStartTime.
         */
        public Builder unBindStartTime(Long unBindStartTime) {
            this.putBodyParameter("UnBindStartTime", unBindStartTime);
            this.unBindStartTime = unBindStartTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PushBroadcastRequest build() {
            return new PushBroadcastRequest(this);
        } 

    } 

}
