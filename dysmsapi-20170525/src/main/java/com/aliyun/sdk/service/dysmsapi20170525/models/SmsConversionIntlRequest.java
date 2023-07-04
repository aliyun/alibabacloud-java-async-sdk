// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmsConversionIntlRequest} extends {@link RequestModel}
 *
 * <p>SmsConversionIntlRequest</p>
 */
public class SmsConversionIntlRequest extends Request {
    @Query
    @NameInMap("ConversionTime")
    private Long conversionTime;

    @Query
    @NameInMap("Delivered")
    @Validation(required = true)
    private Boolean delivered;

    @Query
    @NameInMap("MessageId")
    @Validation(required = true)
    private String messageId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SmsConversionIntlRequest(Builder builder) {
        super(builder);
        this.conversionTime = builder.conversionTime;
        this.delivered = builder.delivered;
        this.messageId = builder.messageId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsConversionIntlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversionTime
     */
    public Long getConversionTime() {
        return this.conversionTime;
    }

    /**
     * @return delivered
     */
    public Boolean getDelivered() {
        return this.delivered;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
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

    public static final class Builder extends Request.Builder<SmsConversionIntlRequest, Builder> {
        private Long conversionTime; 
        private Boolean delivered; 
        private String messageId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SmsConversionIntlRequest request) {
            super(request);
            this.conversionTime = request.conversionTime;
            this.delivered = request.delivered;
            this.messageId = request.messageId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ConversionTime.
         */
        public Builder conversionTime(Long conversionTime) {
            this.putQueryParameter("ConversionTime", conversionTime);
            this.conversionTime = conversionTime;
            return this;
        }

        /**
         * Delivered.
         */
        public Builder delivered(Boolean delivered) {
            this.putQueryParameter("Delivered", delivered);
            this.delivered = delivered;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
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
        public SmsConversionIntlRequest build() {
            return new SmsConversionIntlRequest(this);
        } 

    } 

}
