// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendBatchSmsRequest} extends {@link RequestModel}
 *
 * <p>SendBatchSmsRequest</p>
 */
public class SendBatchSmsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumberJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumberJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SignNameJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signNameJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SmsUpExtendCodeJson")
    private String smsUpExtendCodeJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateParamJson")
    private String templateParamJson;

    private SendBatchSmsRequest(Builder builder) {
        super(builder);
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.phoneNumberJson = builder.phoneNumberJson;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signNameJson = builder.signNameJson;
        this.smsUpExtendCodeJson = builder.smsUpExtendCodeJson;
        this.templateCode = builder.templateCode;
        this.templateParamJson = builder.templateParamJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendBatchSmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumberJson
     */
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
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
     * @return signNameJson
     */
    public String getSignNameJson() {
        return this.signNameJson;
    }

    /**
     * @return smsUpExtendCodeJson
     */
    public String getSmsUpExtendCodeJson() {
        return this.smsUpExtendCodeJson;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParamJson
     */
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

    public static final class Builder extends Request.Builder<SendBatchSmsRequest, Builder> {
        private String outId; 
        private Long ownerId; 
        private String phoneNumberJson; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signNameJson; 
        private String smsUpExtendCodeJson; 
        private String templateCode; 
        private String templateParamJson; 

        private Builder() {
            super();
        } 

        private Builder(SendBatchSmsRequest request) {
            super(request);
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.phoneNumberJson = request.phoneNumberJson;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signNameJson = request.signNameJson;
            this.smsUpExtendCodeJson = request.smsUpExtendCodeJson;
            this.templateCode = request.templateCode;
            this.templateParamJson = request.templateParamJson;
        } 

        /**
         * <p>The extension field of the external record. The value is a string that contains no more than 256 characters.</p>
         * <blockquote>
         * <p>The parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abcdefg</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * <p>The mobile number of the recipient. Format:</p>
         * <ul>
         * <li>Message delivery to the Chinese mainland: +/+86/0086/86 or an 11-digit mobile number without a prefix. Example: 1590000****.</li>
         * <li>Message delivery to countries or regions outside the Chinese mainland: Dialing code + Mobile number. Example: 852000012****.</li>
         * </ul>
         * <blockquote>
         * <p>We recommend that you call the SendSms operation to send verification codes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1590000****&quot;,&quot;1350000****&quot;]</p>
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putBodyParameter("PhoneNumberJson", phoneNumberJson);
            this.phoneNumberJson = phoneNumberJson;
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
         * <p>The signature.</p>
         * <p>Log on to the Alibaba Cloud SMS console. In the left-side navigation pane, click <strong>Go Globe</strong> or <strong>Go China</strong>. You can view the signature in the <strong>Signature</strong> column on the <strong>Signatures</strong> tab.</p>
         * <blockquote>
         * <p>The signatures must be approved and correspond to the mobile numbers in sequence.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Aliyun&quot;,&quot;Alibaba&quot;]</p>
         */
        public Builder signNameJson(String signNameJson) {
            this.putBodyParameter("SignNameJson", signNameJson);
            this.signNameJson = signNameJson;
            return this;
        }

        /**
         * <p>The extension code of the MO message. Format: JSON array.</p>
         * <blockquote>
         * <p>The parameter is optional.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;90999&quot;,&quot;90998&quot;]</p>
         */
        public Builder smsUpExtendCodeJson(String smsUpExtendCodeJson) {
            this.putBodyParameter("SmsUpExtendCodeJson", smsUpExtendCodeJson);
            this.smsUpExtendCodeJson = smsUpExtendCodeJson;
            return this;
        }

        /**
         * <p>The code of the message template.</p>
         * <p>Log on to the Alibaba Cloud SMS console. In the left-side navigation pane, click <strong>Go Globe</strong> or <strong>Go China</strong>. You can view the message template in the <strong>Template Code</strong> column on the <strong>Message Templates</strong> tab.</p>
         * <blockquote>
         * <p>The message templates must be created on the Go Globe page and approved.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_15255****</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>The value of the variable in the message template.</p>
         * <blockquote>
         * <p>If you need to add line breaks to the JSON template, make sure that the format is valid. In addition, the sequence of variable values must be the same as that of the mobile numbers and signatures.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;TemplateParamJson&quot;},{&quot;name&quot;:&quot;TemplateParamJson&quot;}]</p>
         */
        public Builder templateParamJson(String templateParamJson) {
            this.putBodyParameter("TemplateParamJson", templateParamJson);
            this.templateParamJson = templateParamJson;
            return this;
        }

        @Override
        public SendBatchSmsRequest build() {
            return new SendBatchSmsRequest(this);
        } 

    } 

}
