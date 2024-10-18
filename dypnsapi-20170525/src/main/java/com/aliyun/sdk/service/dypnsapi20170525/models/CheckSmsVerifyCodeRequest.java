// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckSmsVerifyCodeRequest} extends {@link RequestModel}
 *
 * <p>CheckSmsVerifyCodeRequest</p>
 */
public class CheckSmsVerifyCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseAuthPolicy")
    private Long caseAuthPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    private String countryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemeName")
    private String schemeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyCode;

    private CheckSmsVerifyCodeRequest(Builder builder) {
        super(builder);
        this.caseAuthPolicy = builder.caseAuthPolicy;
        this.countryCode = builder.countryCode;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemeName = builder.schemeName;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSmsVerifyCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caseAuthPolicy
     */
    public Long getCaseAuthPolicy() {
        return this.caseAuthPolicy;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
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
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<CheckSmsVerifyCodeRequest, Builder> {
        private Long caseAuthPolicy; 
        private String countryCode; 
        private String outId; 
        private Long ownerId; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemeName; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(CheckSmsVerifyCodeRequest request) {
            super(request);
            this.caseAuthPolicy = request.caseAuthPolicy;
            this.countryCode = request.countryCode;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.schemeName = request.schemeName;
            this.verifyCode = request.verifyCode;
        } 

        /**
         * <p>The verification policy for uppercase and lowercase letters of the verification code. Valid values:</p>
         * <ul>
         * <li>1: The verification policy does not distinguish uppercase and lowercase letters.</li>
         * <li>2: The verification policy distinguishes uppercase and lowercase letters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder caseAuthPolicy(Long caseAuthPolicy) {
            this.putQueryParameter("CaseAuthPolicy", caseAuthPolicy);
            this.caseAuthPolicy = caseAuthPolicy;
            return this;
        }

        /**
         * <p>The country code of the phone number. Default value: 86.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * <p>The external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12123231</p>
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
         * <p>The phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18653529399</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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
         * <p>The verification service name. If this parameter is not specified, the default service is used. The name can be up to 20 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        /**
         * <p>The verification code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1231</p>
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public CheckSmsVerifyCodeRequest build() {
            return new CheckSmsVerifyCodeRequest(this);
        } 

    } 

}
