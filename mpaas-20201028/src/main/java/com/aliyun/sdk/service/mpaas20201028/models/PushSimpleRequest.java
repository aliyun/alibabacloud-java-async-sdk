// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushSimpleRequest} extends {@link RequestModel}
 *
 * <p>PushSimpleRequest</p>
 */
public class PushSimpleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

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
    @NameInMap("IconUrls")
    private String iconUrls;

    @Body
    @NameInMap("ImageUrls")
    private String imageUrls;

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
    @NameInMap("PushStyle")
    private Integer pushStyle;

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
    @NameInMap("ThirdChannelCategory")
    private java.util.Map < String, ? > thirdChannelCategory;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("Uri")
    private String uri;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private PushSimpleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.classification = builder.classification;
        this.content = builder.content;
        this.deliveryType = builder.deliveryType;
        this.expiredSeconds = builder.expiredSeconds;
        this.extendedParams = builder.extendedParams;
        this.iconUrls = builder.iconUrls;
        this.imageUrls = builder.imageUrls;
        this.miChannelId = builder.miChannelId;
        this.notifyType = builder.notifyType;
        this.pushAction = builder.pushAction;
        this.pushStyle = builder.pushStyle;
        this.silent = builder.silent;
        this.smsSignName = builder.smsSignName;
        this.smsStrategy = builder.smsStrategy;
        this.smsTemplateCode = builder.smsTemplateCode;
        this.smsTemplateParam = builder.smsTemplateParam;
        this.strategyContent = builder.strategyContent;
        this.strategyType = builder.strategyType;
        this.targetMsgkey = builder.targetMsgkey;
        this.taskName = builder.taskName;
        this.thirdChannelCategory = builder.thirdChannelCategory;
        this.title = builder.title;
        this.uri = builder.uri;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushSimpleRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
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
     * @return iconUrls
     */
    public String getIconUrls() {
        return this.iconUrls;
    }

    /**
     * @return imageUrls
     */
    public String getImageUrls() {
        return this.imageUrls;
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
     * @return pushStyle
     */
    public Integer getPushStyle() {
        return this.pushStyle;
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
     * @return thirdChannelCategory
     */
    public java.util.Map < String, ? > getThirdChannelCategory() {
        return this.thirdChannelCategory;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PushSimpleRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String channelId; 
        private String classification; 
        private String content; 
        private Long deliveryType; 
        private Long expiredSeconds; 
        private String extendedParams; 
        private String iconUrls; 
        private String imageUrls; 
        private String miChannelId; 
        private String notifyType; 
        private Long pushAction; 
        private Integer pushStyle; 
        private Long silent; 
        private String smsSignName; 
        private Integer smsStrategy; 
        private String smsTemplateCode; 
        private String smsTemplateParam; 
        private String strategyContent; 
        private Integer strategyType; 
        private String targetMsgkey; 
        private String taskName; 
        private java.util.Map < String, ? > thirdChannelCategory; 
        private String title; 
        private String uri; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PushSimpleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.classification = request.classification;
            this.content = request.content;
            this.deliveryType = request.deliveryType;
            this.expiredSeconds = request.expiredSeconds;
            this.extendedParams = request.extendedParams;
            this.iconUrls = request.iconUrls;
            this.imageUrls = request.imageUrls;
            this.miChannelId = request.miChannelId;
            this.notifyType = request.notifyType;
            this.pushAction = request.pushAction;
            this.pushStyle = request.pushStyle;
            this.silent = request.silent;
            this.smsSignName = request.smsSignName;
            this.smsStrategy = request.smsStrategy;
            this.smsTemplateCode = request.smsTemplateCode;
            this.smsTemplateParam = request.smsTemplateParam;
            this.strategyContent = request.strategyContent;
            this.strategyType = request.strategyType;
            this.targetMsgkey = request.targetMsgkey;
            this.taskName = request.taskName;
            this.thirdChannelCategory = request.thirdChannelCategory;
            this.title = request.title;
            this.uri = request.uri;
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
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
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
         * IconUrls.
         */
        public Builder iconUrls(String iconUrls) {
            this.putBodyParameter("IconUrls", iconUrls);
            this.iconUrls = iconUrls;
            return this;
        }

        /**
         * ImageUrls.
         */
        public Builder imageUrls(String imageUrls) {
            this.putBodyParameter("ImageUrls", imageUrls);
            this.imageUrls = imageUrls;
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
         * PushStyle.
         */
        public Builder pushStyle(Integer pushStyle) {
            this.putBodyParameter("PushStyle", pushStyle);
            this.pushStyle = pushStyle;
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
         * ThirdChannelCategory.
         */
        public Builder thirdChannelCategory(java.util.Map < String, ? > thirdChannelCategory) {
            String thirdChannelCategoryShrink = shrink(thirdChannelCategory, "ThirdChannelCategory", "json");
            this.putBodyParameter("ThirdChannelCategory", thirdChannelCategoryShrink);
            this.thirdChannelCategory = thirdChannelCategory;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
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
        public PushSimpleRequest build() {
            return new PushSimpleRequest(this);
        } 

    } 

}
