// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendVerificationRequest} extends {@link RequestModel}
 *
 * <p>SendVerificationRequest</p>
 */
public class SendVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

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
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyType;

    private SendVerificationRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.target = builder.target;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<SendVerificationRequest, Builder> {
        private String bizType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String target; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(SendVerificationRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.target = request.target;
            this.verifyType = request.verifyType;
        } 

        /**
         * <p>The business type. Set the value to <strong>CONTACT</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTACT</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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
         * <p>The mobile phone number that receives the SMS verification code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>150****0000</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The mode of sending the SMS verification code. Set the value to <strong>SMS</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        public Builder verifyType(String verifyType) {
            this.putQueryParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public SendVerificationRequest build() {
            return new SendVerificationRequest(this);
        } 

    } 

}
