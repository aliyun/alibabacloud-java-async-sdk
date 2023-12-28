// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UAIDVerificationRequest} extends {@link RequestModel}
 *
 * <p>UAIDVerificationRequest</p>
 */
public class UAIDVerificationRequest extends Request {
    @Query
    @NameInMap("AuthCode")
    @Validation(required = true)
    private String authCode;

    @Query
    @NameInMap("Carrier")
    @Validation(required = true)
    private String carrier;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("OutId")
    private String outId;

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
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Query
    @NameInMap("UserGrantId")
    private String userGrantId;

    private UAIDVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.carrier = builder.carrier;
        this.ip = builder.ip;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.token = builder.token;
        this.userGrantId = builder.userGrantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UAIDVerificationRequest create() {
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
     * @return carrier
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userGrantId
     */
    public String getUserGrantId() {
        return this.userGrantId;
    }

    public static final class Builder extends Request.Builder<UAIDVerificationRequest, Builder> {
        private String authCode; 
        private String carrier; 
        private String ip; 
        private String outId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String token; 
        private String userGrantId; 

        private Builder() {
            super();
        } 

        private Builder(UAIDVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.carrier = request.carrier;
            this.ip = request.ip;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.token = request.token;
            this.userGrantId = request.userGrantId;
        } 

        /**
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * Carrier.
         */
        public Builder carrier(String carrier) {
            this.putQueryParameter("Carrier", carrier);
            this.carrier = carrier;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * OutId.
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
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * UserGrantId.
         */
        public Builder userGrantId(String userGrantId) {
            this.putQueryParameter("UserGrantId", userGrantId);
            this.userGrantId = userGrantId;
            return this;
        }

        @Override
        public UAIDVerificationRequest build() {
            return new UAIDVerificationRequest(this);
        } 

    } 

}
