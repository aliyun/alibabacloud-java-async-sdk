// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBatchSmsRequest} extends {@link RequestModel}
 *
 * <p>SendBatchSmsRequest</p>
 */
public class SendBatchSmsRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNumberJson")
    @Validation(required = true)
    private String phoneNumberJson;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SignNameJson")
    @Validation(required = true)
    private String signNameJson;

    @Query
    @NameInMap("SmsUpExtendCodeJson")
    private String smsUpExtendCodeJson;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Query
    @NameInMap("TemplateParamJson")
    private String templateParamJson;

    private SendBatchSmsRequest(Builder builder) {
        super(builder);
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

        private Builder(SendBatchSmsRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.phoneNumberJson = response.phoneNumberJson;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.signNameJson = response.signNameJson;
            this.smsUpExtendCodeJson = response.smsUpExtendCodeJson;
            this.templateCode = response.templateCode;
            this.templateParamJson = response.templateParamJson;
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
         * PhoneNumberJson.
         */
        public Builder phoneNumberJson(String phoneNumberJson) {
            this.putQueryParameter("PhoneNumberJson", phoneNumberJson);
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
         * SignNameJson.
         */
        public Builder signNameJson(String signNameJson) {
            this.putQueryParameter("SignNameJson", signNameJson);
            this.signNameJson = signNameJson;
            return this;
        }

        /**
         * SmsUpExtendCodeJson.
         */
        public Builder smsUpExtendCodeJson(String smsUpExtendCodeJson) {
            this.putQueryParameter("SmsUpExtendCodeJson", smsUpExtendCodeJson);
            this.smsUpExtendCodeJson = smsUpExtendCodeJson;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateParamJson.
         */
        public Builder templateParamJson(String templateParamJson) {
            this.putQueryParameter("TemplateParamJson", templateParamJson);
            this.templateParamJson = templateParamJson;
            return this;
        }

        @Override
        public SendBatchSmsRequest build() {
            return new SendBatchSmsRequest(this);
        } 

    } 

}
