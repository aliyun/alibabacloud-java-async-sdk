// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link CreateSmsTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsTemplateRequest</p>
 */
public class CreateSmsTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

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
    @com.aliyun.core.annotation.NameInMap("SmsTemplateContent")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 500)
    private String smsTemplateContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30)
    private String smsTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smsTemplateRule;

    private CreateSmsTemplateRequest(Builder builder) {
        super(builder);
        this.bizUrl = builder.bizUrl;
        this.businessType = builder.businessType;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smsTemplateContent = builder.smsTemplateContent;
        this.smsTemplateName = builder.smsTemplateName;
        this.smsTemplateRule = builder.smsTemplateRule;
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
     * @return bizUrl
     */
    public String getBizUrl() {
        return this.bizUrl;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return smsTemplateContent
     */
    public String getSmsTemplateContent() {
        return this.smsTemplateContent;
    }

    /**
     * @return smsTemplateName
     */
    public String getSmsTemplateName() {
        return this.smsTemplateName;
    }

    /**
     * @return smsTemplateRule
     */
    public String getSmsTemplateRule() {
        return this.smsTemplateRule;
    }

    public static final class Builder extends Request.Builder<CreateSmsTemplateRequest, Builder> {
        private String bizUrl; 
        private String businessType; 
        private Long ownerId; 
        private String prodCode; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smsTemplateContent; 
        private String smsTemplateName; 
        private String smsTemplateRule; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsTemplateRequest request) {
            super(request);
            this.bizUrl = request.bizUrl;
            this.businessType = request.businessType;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smsTemplateContent = request.smsTemplateContent;
            this.smsTemplateName = request.smsTemplateName;
            this.smsTemplateRule = request.smsTemplateRule;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizUrl(String bizUrl) {
            this.putQueryParameter("BizUrl", bizUrl);
            this.bizUrl = bizUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
         * <p>This parameter is required.</p>
         */
        public Builder smsTemplateContent(String smsTemplateContent) {
            this.putQueryParameter("SmsTemplateContent", smsTemplateContent);
            this.smsTemplateContent = smsTemplateContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder smsTemplateName(String smsTemplateName) {
            this.putQueryParameter("SmsTemplateName", smsTemplateName);
            this.smsTemplateName = smsTemplateName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder smsTemplateRule(String smsTemplateRule) {
            this.putQueryParameter("SmsTemplateRule", smsTemplateRule);
            this.smsTemplateRule = smsTemplateRule;
            return this;
        }

        @Override
        public CreateSmsTemplateRequest build() {
            return new CreateSmsTemplateRequest(this);
        } 

    } 

}
