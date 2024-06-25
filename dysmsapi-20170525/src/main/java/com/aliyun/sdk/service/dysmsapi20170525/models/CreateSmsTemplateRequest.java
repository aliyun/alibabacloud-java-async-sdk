// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSmsTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsTemplateRequest</p>
 */
public class CreateSmsTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplySceneContent")
    private String applySceneContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntlType")
    private Integer intlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List < String > moreData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedSignName")
    private String relatedSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 500)
    private String templateContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateRule")
    private String templateRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer templateType;

    private CreateSmsTemplateRequest(Builder builder) {
        super(builder);
        this.applySceneContent = builder.applySceneContent;
        this.intlType = builder.intlType;
        this.moreData = builder.moreData;
        this.ownerId = builder.ownerId;
        this.relatedSignName = builder.relatedSignName;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateRule = builder.templateRule;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applySceneContent
     */
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    /**
     * @return intlType
     */
    public Integer getIntlType() {
        return this.intlType;
    }

    /**
     * @return moreData
     */
    public java.util.List < String > getMoreData() {
        return this.moreData;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return relatedSignName
     */
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateRule
     */
    public String getTemplateRule() {
        return this.templateRule;
    }

    /**
     * @return templateType
     */
    public Integer getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateSmsTemplateRequest, Builder> {
        private String applySceneContent; 
        private Integer intlType; 
        private java.util.List < String > moreData; 
        private Long ownerId; 
        private String relatedSignName; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateContent; 
        private String templateName; 
        private String templateRule; 
        private Integer templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsTemplateRequest request) {
            super(request);
            this.applySceneContent = request.applySceneContent;
            this.intlType = request.intlType;
            this.moreData = request.moreData;
            this.ownerId = request.ownerId;
            this.relatedSignName = request.relatedSignName;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.templateRule = request.templateRule;
            this.templateType = request.templateType;
        } 

        /**
         * ApplySceneContent.
         */
        public Builder applySceneContent(String applySceneContent) {
            this.putQueryParameter("ApplySceneContent", applySceneContent);
            this.applySceneContent = applySceneContent;
            return this;
        }

        /**
         * IntlType.
         */
        public Builder intlType(Integer intlType) {
            this.putQueryParameter("IntlType", intlType);
            this.intlType = intlType;
            return this;
        }

        /**
         * MoreData.
         */
        public Builder moreData(java.util.List < String > moreData) {
            String moreDataShrink = shrink(moreData, "MoreData", "json");
            this.putQueryParameter("MoreData", moreDataShrink);
            this.moreData = moreData;
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
         * RelatedSignName.
         */
        public Builder relatedSignName(String relatedSignName) {
            this.putQueryParameter("RelatedSignName", relatedSignName);
            this.relatedSignName = relatedSignName;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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
         * TemplateContent.
         */
        public Builder templateContent(String templateContent) {
            this.putQueryParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateRule.
         */
        public Builder templateRule(String templateRule) {
            this.putQueryParameter("TemplateRule", templateRule);
            this.templateRule = templateRule;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(Integer templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateSmsTemplateRequest build() {
            return new CreateSmsTemplateRequest(this);
        } 

    } 

}
