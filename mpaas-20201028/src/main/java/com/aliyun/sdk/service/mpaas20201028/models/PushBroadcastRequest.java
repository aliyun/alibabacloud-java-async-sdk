// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushBroadcastRequest} extends {@link RequestModel}
 *
 * <p>PushBroadcastRequest</p>
 */
public class PushBroadcastRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AndroidChannel")
    @Validation(maximum = 10)
    private Integer androidChannel;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("BindPeriod")
    private Integer bindPeriod;

    @Body
    @NameInMap("ChannelId")
    private String channelId;

    @Body
    @NameInMap("Classification")
    private String classification;

    @Body
    @NameInMap("DeliveryType")
    @Validation(required = true, maximum = 10)
    private Long deliveryType;

    @Body
    @NameInMap("ExpiredSeconds")
    @Validation(required = true, maximum = 259200)
    private Long expiredSeconds;

    @Body
    @NameInMap("ExtendedParams")
    private String extendedParams;

    @Body
    @NameInMap("MiChannelId")
    private String miChannelId;

    @Body
    @NameInMap("Msgkey")
    @Validation(required = true)
    private String msgkey;

    @Body
    @NameInMap("NotifyType")
    private String notifyType;

    @Body
    @NameInMap("PushAction")
    @Validation(maximum = 10)
    private Long pushAction;

    @Body
    @NameInMap("PushStatus")
    @Validation(maximum = 10)
    private Long pushStatus;

    @Body
    @NameInMap("Silent")
    @Validation(maximum = 10)
    private Long silent;

    @Body
    @NameInMap("StrategyContent")
    private String strategyContent;

    @Body
    @NameInMap("StrategyType")
    private Integer strategyType;

    @Body
    @NameInMap("TaskName")
    private String taskName;

    @Body
    @NameInMap("TemplateKeyValue")
    private String templateKeyValue;

    @Body
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Body
    @NameInMap("ThirdChannelCategory")
    private java.util.Map < String, ? > thirdChannelCategory;

    @Body
    @NameInMap("UnBindPeriod")
    @Validation(maximum = 10)
    private Long unBindPeriod;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private PushBroadcastRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.androidChannel = builder.androidChannel;
        this.appId = builder.appId;
        this.bindPeriod = builder.bindPeriod;
        this.channelId = builder.channelId;
        this.classification = builder.classification;
        this.deliveryType = builder.deliveryType;
        this.expiredSeconds = builder.expiredSeconds;
        this.extendedParams = builder.extendedParams;
        this.miChannelId = builder.miChannelId;
        this.msgkey = builder.msgkey;
        this.notifyType = builder.notifyType;
        this.pushAction = builder.pushAction;
        this.pushStatus = builder.pushStatus;
        this.silent = builder.silent;
        this.strategyContent = builder.strategyContent;
        this.strategyType = builder.strategyType;
        this.taskName = builder.taskName;
        this.templateKeyValue = builder.templateKeyValue;
        this.templateName = builder.templateName;
        this.thirdChannelCategory = builder.thirdChannelCategory;
        this.unBindPeriod = builder.unBindPeriod;
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
    public Integer getAndroidChannel() {
        return this.androidChannel;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return bindPeriod
     */
    public Integer getBindPeriod() {
        return this.bindPeriod;
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
     * @return thirdChannelCategory
     */
    public java.util.Map < String, ? > getThirdChannelCategory() {
        return this.thirdChannelCategory;
    }

    /**
     * @return unBindPeriod
     */
    public Long getUnBindPeriod() {
        return this.unBindPeriod;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PushBroadcastRequest, Builder> {
        private String regionId; 
        private Integer androidChannel; 
        private String appId; 
        private Integer bindPeriod; 
        private String channelId; 
        private String classification; 
        private Long deliveryType; 
        private Long expiredSeconds; 
        private String extendedParams; 
        private String miChannelId; 
        private String msgkey; 
        private String notifyType; 
        private Long pushAction; 
        private Long pushStatus; 
        private Long silent; 
        private String strategyContent; 
        private Integer strategyType; 
        private String taskName; 
        private String templateKeyValue; 
        private String templateName; 
        private java.util.Map < String, ? > thirdChannelCategory; 
        private Long unBindPeriod; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PushBroadcastRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.androidChannel = request.androidChannel;
            this.appId = request.appId;
            this.bindPeriod = request.bindPeriod;
            this.channelId = request.channelId;
            this.classification = request.classification;
            this.deliveryType = request.deliveryType;
            this.expiredSeconds = request.expiredSeconds;
            this.extendedParams = request.extendedParams;
            this.miChannelId = request.miChannelId;
            this.msgkey = request.msgkey;
            this.notifyType = request.notifyType;
            this.pushAction = request.pushAction;
            this.pushStatus = request.pushStatus;
            this.silent = request.silent;
            this.strategyContent = request.strategyContent;
            this.strategyType = request.strategyType;
            this.taskName = request.taskName;
            this.templateKeyValue = request.templateKeyValue;
            this.templateName = request.templateName;
            this.thirdChannelCategory = request.thirdChannelCategory;
            this.unBindPeriod = request.unBindPeriod;
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
        public Builder androidChannel(Integer androidChannel) {
            this.putBodyParameter("AndroidChannel", androidChannel);
            this.androidChannel = androidChannel;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BindPeriod.
         */
        public Builder bindPeriod(Integer bindPeriod) {
            this.putBodyParameter("BindPeriod", bindPeriod);
            this.bindPeriod = bindPeriod;
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
         * DeliveryType.
         */
        public Builder deliveryType(Long deliveryType) {
            this.putBodyParameter("DeliveryType", deliveryType);
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * ExpiredSeconds.
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
         * Msgkey.
         */
        public Builder msgkey(String msgkey) {
            this.putBodyParameter("Msgkey", msgkey);
            this.msgkey = msgkey;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * ThirdChannelCategory.
         */
        public Builder thirdChannelCategory(java.util.Map < String, ? > thirdChannelCategory) {
            String thirdChannelCategoryShrink = shrink(thirdChannelCategory, "ThirdChannelCategory", "json");
            this.putBodyParameter("ThirdChannelCategory", thirdChannelCategoryShrink);
            this.thirdChannelCategory = thirdChannelCategory;
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
         * WorkspaceId.
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
