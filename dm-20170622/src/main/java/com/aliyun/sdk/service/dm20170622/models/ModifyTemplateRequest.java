// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateRequest</p>
 */
public class ModifyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromType")
    @com.aliyun.core.annotation.Validation(maximum = 2, minimum = 1)
    private Integer fromType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsContent")
    private String smsContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsType")
    private Integer smsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateNickName")
    private String templateNickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateSubject")
    private String templateSubject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateText")
    private String templateText;

    private ModifyTemplateRequest(Builder builder) {
        super(builder);
        this.fromType = builder.fromType;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smsContent = builder.smsContent;
        this.smsType = builder.smsType;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.templateNickName = builder.templateNickName;
        this.templateSubject = builder.templateSubject;
        this.templateText = builder.templateText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromType
     */
    public Integer getFromType() {
        return this.fromType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return smsContent
     */
    public String getSmsContent() {
        return this.smsContent;
    }

    /**
     * @return smsType
     */
    public Integer getSmsType() {
        return this.smsType;
    }

    /**
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateNickName
     */
    public String getTemplateNickName() {
        return this.templateNickName;
    }

    /**
     * @return templateSubject
     */
    public String getTemplateSubject() {
        return this.templateSubject;
    }

    /**
     * @return templateText
     */
    public String getTemplateText() {
        return this.templateText;
    }

    public static final class Builder extends Request.Builder<ModifyTemplateRequest, Builder> {
        private Integer fromType; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smsContent; 
        private Integer smsType; 
        private Integer templateId; 
        private String templateName; 
        private String templateNickName; 
        private String templateSubject; 
        private String templateText; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateRequest request) {
            super(request);
            this.fromType = request.fromType;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smsContent = request.smsContent;
            this.smsType = request.smsType;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
            this.templateNickName = request.templateNickName;
            this.templateSubject = request.templateSubject;
            this.templateText = request.templateText;
        } 

        /**
         * FromType.
         */
        public Builder fromType(Integer fromType) {
            this.putQueryParameter("FromType", fromType);
            this.fromType = fromType;
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
         * SmsContent.
         */
        public Builder smsContent(String smsContent) {
            this.putQueryParameter("SmsContent", smsContent);
            this.smsContent = smsContent;
            return this;
        }

        /**
         * SmsType.
         */
        public Builder smsType(Integer smsType) {
            this.putQueryParameter("SmsType", smsType);
            this.smsType = smsType;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Integer templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
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
         * TemplateNickName.
         */
        public Builder templateNickName(String templateNickName) {
            this.putQueryParameter("TemplateNickName", templateNickName);
            this.templateNickName = templateNickName;
            return this;
        }

        /**
         * TemplateSubject.
         */
        public Builder templateSubject(String templateSubject) {
            this.putQueryParameter("TemplateSubject", templateSubject);
            this.templateSubject = templateSubject;
            return this;
        }

        /**
         * TemplateText.
         */
        public Builder templateText(String templateText) {
            this.putQueryParameter("TemplateText", templateText);
            this.templateText = templateText;
            return this;
        }

        @Override
        public ModifyTemplateRequest build() {
            return new ModifyTemplateRequest(this);
        } 

    } 

}
