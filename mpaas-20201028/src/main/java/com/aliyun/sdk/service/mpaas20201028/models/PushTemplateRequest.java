// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushTemplateRequest} extends {@link RequestModel}
 *
 * <p>PushTemplateRequest</p>
 */
public class PushTemplateRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ActivityContentState")
    private Object activityContentState;

    @Body
    @NameInMap("ActivityEvent")
    private String activityEvent;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

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
    @NameInMap("DismissalDate")
    private Long dismissalDate;

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
    @NameInMap("NotifyType")
    private String notifyType;

    @Body
    @NameInMap("PushAction")
    @Validation(maximum = 10)
    private Long pushAction;

    @Body
    @NameInMap("Silent")
    @Validation(maximum = 10)
    private Long silent;

    @Body
    @NameInMap("SmsSignName")
    private String smsSignName;

    @Body
    @NameInMap("SmsStrategy")
    private Integer smsStrategy;

    @Body
    @NameInMap("SmsTemplateCode")
    private String smsTemplateCode;

    @Body
    @NameInMap("SmsTemplateParam")
    private String smsTemplateParam;

    @Body
    @NameInMap("StrategyContent")
    private String strategyContent;

    @Body
    @NameInMap("StrategyType")
    private Integer strategyType;

    @Body
    @NameInMap("TargetMsgkey")
    @Validation(required = true)
    private String targetMsgkey;

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
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private PushTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.activityContentState = builder.activityContentState;
        this.activityEvent = builder.activityEvent;
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.classification = builder.classification;
        this.deliveryType = builder.deliveryType;
        this.dismissalDate = builder.dismissalDate;
        this.expiredSeconds = builder.expiredSeconds;
        this.extendedParams = builder.extendedParams;
        this.miChannelId = builder.miChannelId;
        this.notifyType = builder.notifyType;
        this.pushAction = builder.pushAction;
        this.silent = builder.silent;
        this.smsSignName = builder.smsSignName;
        this.smsStrategy = builder.smsStrategy;
        this.smsTemplateCode = builder.smsTemplateCode;
        this.smsTemplateParam = builder.smsTemplateParam;
        this.strategyContent = builder.strategyContent;
        this.strategyType = builder.strategyType;
        this.targetMsgkey = builder.targetMsgkey;
        this.taskName = builder.taskName;
        this.templateKeyValue = builder.templateKeyValue;
        this.templateName = builder.templateName;
        this.thirdChannelCategory = builder.thirdChannelCategory;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushTemplateRequest create() {
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
     * @return activityContentState
     */
    public Object getActivityContentState() {
        return this.activityContentState;
    }

    /**
     * @return activityEvent
     */
    public String getActivityEvent() {
        return this.activityEvent;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return dismissalDate
     */
    public Long getDismissalDate() {
        return this.dismissalDate;
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
     * @return silent
     */
    public Long getSilent() {
        return this.silent;
    }

    /**
     * @return smsSignName
     */
    public String getSmsSignName() {
        return this.smsSignName;
    }

    /**
     * @return smsStrategy
     */
    public Integer getSmsStrategy() {
        return this.smsStrategy;
    }

    /**
     * @return smsTemplateCode
     */
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    /**
     * @return smsTemplateParam
     */
    public String getSmsTemplateParam() {
        return this.smsTemplateParam;
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
     * @return targetMsgkey
     */
    public String getTargetMsgkey() {
        return this.targetMsgkey;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PushTemplateRequest, Builder> {
        private String regionId; 
        private Object activityContentState; 
        private String activityEvent; 
        private String appId; 
        private String channelId; 
        private String classification; 
        private Long deliveryType; 
        private Long dismissalDate; 
        private Long expiredSeconds; 
        private String extendedParams; 
        private String miChannelId; 
        private String notifyType; 
        private Long pushAction; 
        private Long silent; 
        private String smsSignName; 
        private Integer smsStrategy; 
        private String smsTemplateCode; 
        private String smsTemplateParam; 
        private String strategyContent; 
        private Integer strategyType; 
        private String targetMsgkey; 
        private String taskName; 
        private String templateKeyValue; 
        private String templateName; 
        private java.util.Map < String, ? > thirdChannelCategory; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PushTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.activityContentState = request.activityContentState;
            this.activityEvent = request.activityEvent;
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.classification = request.classification;
            this.deliveryType = request.deliveryType;
            this.dismissalDate = request.dismissalDate;
            this.expiredSeconds = request.expiredSeconds;
            this.extendedParams = request.extendedParams;
            this.miChannelId = request.miChannelId;
            this.notifyType = request.notifyType;
            this.pushAction = request.pushAction;
            this.silent = request.silent;
            this.smsSignName = request.smsSignName;
            this.smsStrategy = request.smsStrategy;
            this.smsTemplateCode = request.smsTemplateCode;
            this.smsTemplateParam = request.smsTemplateParam;
            this.strategyContent = request.strategyContent;
            this.strategyType = request.strategyType;
            this.targetMsgkey = request.targetMsgkey;
            this.taskName = request.taskName;
            this.templateKeyValue = request.templateKeyValue;
            this.templateName = request.templateName;
            this.thirdChannelCategory = request.thirdChannelCategory;
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
         * ActivityContentState.
         */
        public Builder activityContentState(Object activityContentState) {
            this.putBodyParameter("ActivityContentState", activityContentState);
            this.activityContentState = activityContentState;
            return this;
        }

        /**
         * ActivityEvent.
         */
        public Builder activityEvent(String activityEvent) {
            this.putBodyParameter("ActivityEvent", activityEvent);
            this.activityEvent = activityEvent;
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
         * DismissalDate.
         */
        public Builder dismissalDate(Long dismissalDate) {
            this.putBodyParameter("DismissalDate", dismissalDate);
            this.dismissalDate = dismissalDate;
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
         * Silent.
         */
        public Builder silent(Long silent) {
            this.putBodyParameter("Silent", silent);
            this.silent = silent;
            return this;
        }

        /**
         * SmsSignName.
         */
        public Builder smsSignName(String smsSignName) {
            this.putBodyParameter("SmsSignName", smsSignName);
            this.smsSignName = smsSignName;
            return this;
        }

        /**
         * SmsStrategy.
         */
        public Builder smsStrategy(Integer smsStrategy) {
            this.putBodyParameter("SmsStrategy", smsStrategy);
            this.smsStrategy = smsStrategy;
            return this;
        }

        /**
         * SmsTemplateCode.
         */
        public Builder smsTemplateCode(String smsTemplateCode) {
            this.putBodyParameter("SmsTemplateCode", smsTemplateCode);
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }

        /**
         * SmsTemplateParam.
         */
        public Builder smsTemplateParam(String smsTemplateParam) {
            this.putBodyParameter("SmsTemplateParam", smsTemplateParam);
            this.smsTemplateParam = smsTemplateParam;
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
         * TargetMsgkey.
         */
        public Builder targetMsgkey(String targetMsgkey) {
            this.putBodyParameter("TargetMsgkey", targetMsgkey);
            this.targetMsgkey = targetMsgkey;
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PushTemplateRequest build() {
            return new PushTemplateRequest(this);
        } 

    } 

}
