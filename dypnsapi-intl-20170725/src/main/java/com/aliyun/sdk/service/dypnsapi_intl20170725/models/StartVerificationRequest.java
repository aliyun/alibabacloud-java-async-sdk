// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi_intl20170725.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartVerificationRequest} extends {@link RequestModel}
 *
 * <p>StartVerificationRequest</p>
 */
public class StartVerificationRequest extends Request {
    @Query
    @NameInMap("Channel")
    @Validation(required = true)
    private String channel;

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
    @Validation(required = true)
    private String serviceSid;

    @Query
    @NameInMap("To")
    @Validation(required = true)
    private String to;

    private StartVerificationRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceSid = builder.serviceSid;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
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

    public static final class Builder extends Request.Builder<StartVerificationRequest, Builder> {
        private String channel; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String serviceSid; 
        private String to; 

        private Builder() {
            super();
        } 

        private Builder(StartVerificationRequest request) {
            super(request);
            this.channel = request.channel;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serviceSid = request.serviceSid;
            this.to = request.to;
        } 

        /**
         * The channels that you can use for verification.
         * <p>
         * 
         * Valid values:
         * 
         * *   Voice
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   SMS
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   WhatsApp
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
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

        @Override
        public StartVerificationRequest build() {
            return new StartVerificationRequest(this);
        } 

    } 

}
