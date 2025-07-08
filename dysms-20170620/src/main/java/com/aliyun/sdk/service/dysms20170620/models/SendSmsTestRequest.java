// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link SendSmsTestRequest} extends {@link RequestModel}
 *
 * <p>SendSmsTestRequest</p>
 */
public class SendSmsTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NcToken")
    private String ncToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteIp")
    private String remoteIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sig")
    private String sig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParam")
    private String templateParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestType")
    private String testType;

    private SendSmsTestRequest(Builder builder) {
        super(builder);
        this.ncToken = builder.ncToken;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.prodCode = builder.prodCode;
        this.remoteIp = builder.remoteIp;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sessionId = builder.sessionId;
        this.sig = builder.sig;
        this.signName = builder.signName;
        this.templateCode = builder.templateCode;
        this.templateParam = builder.templateParam;
        this.testType = builder.testType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSmsTestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ncToken
     */
    public String getNcToken() {
        return this.ncToken;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return remoteIp
     */
    public String getRemoteIp() {
        return this.remoteIp;
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sig
     */
    public String getSig() {
        return this.sig;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParam
     */
    public String getTemplateParam() {
        return this.templateParam;
    }

    /**
     * @return testType
     */
    public String getTestType() {
        return this.testType;
    }

    public static final class Builder extends Request.Builder<SendSmsTestRequest, Builder> {
        private String ncToken; 
        private Long ownerId; 
        private String phoneNumber; 
        private String prodCode; 
        private String remoteIp; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sessionId; 
        private String sig; 
        private String signName; 
        private String templateCode; 
        private String templateParam; 
        private String testType; 

        private Builder() {
            super();
        } 

        private Builder(SendSmsTestRequest request) {
            super(request);
            this.ncToken = request.ncToken;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.prodCode = request.prodCode;
            this.remoteIp = request.remoteIp;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sessionId = request.sessionId;
            this.sig = request.sig;
            this.signName = request.signName;
            this.templateCode = request.templateCode;
            this.templateParam = request.templateParam;
            this.testType = request.testType;
        } 

        /**
         * NcToken.
         */
        public Builder ncToken(String ncToken) {
            this.putQueryParameter("NcToken", ncToken);
            this.ncToken = ncToken;
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
         * <p>This parameter is required.</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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
         * RemoteIp.
         */
        public Builder remoteIp(String remoteIp) {
            this.putQueryParameter("RemoteIp", remoteIp);
            this.remoteIp = remoteIp;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Sig.
         */
        public Builder sig(String sig) {
            this.putQueryParameter("Sig", sig);
            this.sig = sig;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
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
         * TemplateParam.
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        /**
         * TestType.
         */
        public Builder testType(String testType) {
            this.putQueryParameter("TestType", testType);
            this.testType = testType;
            return this;
        }

        @Override
        public SendSmsTestRequest build() {
            return new SendSmsTestRequest(this);
        } 

    } 

}
