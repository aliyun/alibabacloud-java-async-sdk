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
 * {@link SmsTemplateCreateRequest} extends {@link RequestModel}
 *
 * <p>SmsTemplateCreateRequest</p>
 */
public class SmsTemplateCreateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sign")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsType")
    private Long smsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private Long templateType;

    private SmsTemplateCreateRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sign = builder.sign;
        this.smsType = builder.smsType;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsTemplateCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return sign
     */
    public String getSign() {
        return this.sign;
    }

    /**
     * @return smsType
     */
    public Long getSmsType() {
        return this.smsType;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateType
     */
    public Long getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<SmsTemplateCreateRequest, Builder> {
        private String content; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sign; 
        private Long smsType; 
        private String templateName; 
        private Long templateType; 

        private Builder() {
            super();
        } 

        private Builder(SmsTemplateCreateRequest request) {
            super(request);
            this.content = request.content;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sign = request.sign;
            this.smsType = request.smsType;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * <p>短信内容</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
         * <p>短信签名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ef2i29fsljf</p>
         */
        public Builder sign(String sign) {
            this.putQueryParameter("Sign", sign);
            this.sign = sign;
            return this;
        }

        /**
         * <p>短信类型</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        public Builder smsType(Long smsType) {
            this.putQueryParameter("SmsType", smsType);
            this.smsType = smsType;
            return this;
        }

        /**
         * <p>模板名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>模板类型</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        public Builder templateType(Long templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public SmsTemplateCreateRequest build() {
            return new SmsTemplateCreateRequest(this);
        } 

    } 

}
