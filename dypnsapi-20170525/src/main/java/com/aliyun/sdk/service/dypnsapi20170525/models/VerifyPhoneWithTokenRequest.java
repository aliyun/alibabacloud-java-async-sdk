// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyPhoneWithTokenRequest} extends {@link RequestModel}
 *
 * <p>VerifyPhoneWithTokenRequest</p>
 */
public class VerifyPhoneWithTokenRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SpToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spToken;

    private VerifyPhoneWithTokenRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spToken = builder.spToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPhoneWithTokenRequest create() {
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
     * @return spToken
     */
    public String getSpToken() {
        return this.spToken;
    }

    public static final class Builder extends Request.Builder<VerifyPhoneWithTokenRequest, Builder> {
        private Long ownerId; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spToken; 

        private Builder() {
            super();
        } 

        private Builder(VerifyPhoneWithTokenRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spToken = request.spToken;
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
         * <p>1380000****</p>
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
         * <p>The token for phone number verification that is obtained by the JavaScript SDK.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dfafdafad542****</p>
         */
        public Builder spToken(String spToken) {
            this.putQueryParameter("SpToken", spToken);
            this.spToken = spToken;
            return this;
        }

        @Override
        public VerifyPhoneWithTokenRequest build() {
            return new VerifyPhoneWithTokenRequest(this);
        } 

    } 

}
