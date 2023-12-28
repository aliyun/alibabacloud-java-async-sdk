// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ThreeElementsVerificationRequest} extends {@link RequestModel}
 *
 * <p>ThreeElementsVerificationRequest</p>
 */
public class ThreeElementsVerificationRequest extends Request {
    @Query
    @NameInMap("AuthCode")
    @Validation(required = true)
    private String authCode;

    @Query
    @NameInMap("CertCode")
    @Validation(required = true)
    private String certCode;

    @Query
    @NameInMap("InputNumber")
    @Validation(required = true)
    private String inputNumber;

    @Query
    @NameInMap("Mask")
    @Validation(required = true)
    private String mask;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ThreeElementsVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.certCode = builder.certCode;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ThreeElementsVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return certCode
     */
    public String getCertCode() {
        return this.certCode;
    }

    /**
     * @return inputNumber
     */
    public String getInputNumber() {
        return this.inputNumber;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<ThreeElementsVerificationRequest, Builder> {
        private String authCode; 
        private String certCode; 
        private String inputNumber; 
        private String mask; 
        private String name; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ThreeElementsVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.certCode = request.certCode;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The authorization code.
         * <p>
         * 
         * >  On the **My Applications** page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/analysis/apply), you can obtain the authorization code (also known as authorization ID).
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * The ID card number to be verified.
         * <p>
         * 
         * *   If the value of Mask is NORMAL, specify a value in plaintext for this field.
         * *   If the value of Mask is MD5, specify a MD5-encrypted value for this field.
         * *   If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.
         * 
         * >  Letters in the encrypted strings are not case-sensitive.
         */
        public Builder certCode(String certCode) {
            this.putQueryParameter("CertCode", certCode);
            this.certCode = certCode;
            return this;
        }

        /**
         * The phone number to be verified.
         * <p>
         * 
         * *   If the value of Mask is NORMAL, specify a value in plaintext for this field.
         * *   If the value of Mask is MD5, specify a MD5-encrypted value for this field.
         * *   If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.
         * 
         * >  Letters in the encrypted strings are not case-sensitive.
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * The encryption method. Valid values:
         * <p>
         * 
         * *   **NORMAL**: The phone number is not encrypted.
         * *   **MD5**
         * *   **SHA256**
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * The name to be verified.
         * <p>
         * 
         * *   If the value of Mask is NORMAL, specify a value in plaintext for this field.
         * *   If the value of Mask is MD5, specify a MD5-encrypted value for this field.
         * *   If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.
         * 
         * >  Letters in the encrypted strings are not case-sensitive.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public ThreeElementsVerificationRequest build() {
            return new ThreeElementsVerificationRequest(this);
        } 

    } 

}
