// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi_intl20170725.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVerificationRequest} extends {@link RequestModel}
 *
 * <p>CheckVerificationRequest</p>
 */
public class CheckVerificationRequest extends Request {
    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceSid")
    private String serviceSid;

    @Query
    @NameInMap("To")
    private String to;

    @Query
    @NameInMap("VerificationId")
    @Validation(required = true)
    private String verificationId;

    private CheckVerificationRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceSid = builder.serviceSid;
        this.to = builder.to;
        this.verificationId = builder.verificationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return serviceSid
     */
    public String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return verificationId
     */
    public String getVerificationId() {
        return this.verificationId;
    }

    public static final class Builder extends Request.Builder<CheckVerificationRequest, Builder> {
        private String code; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String serviceSid; 
        private String to; 
        private String verificationId; 

        private Builder() {
            super();
        } 

        private Builder(CheckVerificationRequest request) {
            super(request);
            this.code = request.code;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serviceSid = request.serviceSid;
            this.to = request.to;
            this.verificationId = request.verificationId;
        } 

        /**
         * The verification code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
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
         * The service ID that is displayed in the Phone Number Verification Service console.
         */
        public Builder serviceSid(String serviceSid) {
            this.putQueryParameter("ServiceSid", serviceSid);
            this.serviceSid = serviceSid;
            return this;
        }

        /**
         * The mobile phone number of the recipient. You must add the country code to the beginning of the mobile phone number. Example: 6212345\*\*\*\*01.
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * The unique authentication ID that is returned by calling the StartVerification operation.
         */
        public Builder verificationId(String verificationId) {
            this.putQueryParameter("VerificationId", verificationId);
            this.verificationId = verificationId;
            return this;
        }

        @Override
        public CheckVerificationRequest build() {
            return new CheckVerificationRequest(this);
        } 

    } 

}
