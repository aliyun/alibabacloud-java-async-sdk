// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySenderAddressNotificationRequest} extends {@link RequestModel}
 *
 * <p>ModifySenderAddressNotificationRequest</p>
 */
public class ModifySenderAddressNotificationRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SenderAddress")
    @Validation(required = true)
    private String senderAddress;

    @Query
    @NameInMap("SenderAddressId")
    @Validation(required = true)
    private String senderAddressId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private ModifySenderAddressNotificationRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.senderAddress = builder.senderAddress;
        this.senderAddressId = builder.senderAddressId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySenderAddressNotificationRequest create() {
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
     * @return region
     */
    public String getRegion() {
        return this.region;
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
     * @return senderAddress
     */
    public String getSenderAddress() {
        return this.senderAddress;
    }

    /**
     * @return senderAddressId
     */
    public String getSenderAddressId() {
        return this.senderAddressId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifySenderAddressNotificationRequest, Builder> {
        private Long ownerId; 
        private String region; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String senderAddress; 
        private String senderAddressId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifySenderAddressNotificationRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.region = response.region;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.senderAddress = response.senderAddress;
            this.senderAddressId = response.senderAddressId;
            this.status = response.status;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * SenderAddress.
         */
        public Builder senderAddress(String senderAddress) {
            this.putQueryParameter("SenderAddress", senderAddress);
            this.senderAddress = senderAddress;
            return this;
        }

        /**
         * SenderAddressId.
         */
        public Builder senderAddressId(String senderAddressId) {
            this.putQueryParameter("SenderAddressId", senderAddressId);
            this.senderAddressId = senderAddressId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifySenderAddressNotificationRequest build() {
            return new ModifySenderAddressNotificationRequest(this);
        } 

    } 

}
