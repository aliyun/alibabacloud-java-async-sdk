// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAxnTrackNoRequest} extends {@link RequestModel}
 *
 * <p>AddAxnTrackNoRequest</p>
 */
public class AddAxnTrackNoRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNoX")
    @Validation(required = true)
    private String phoneNoX;

    @Query
    @NameInMap("PoolKey")
    @Validation(required = true)
    private String poolKey;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SubsId")
    @Validation(required = true)
    private String subsId;

    @Query
    @NameInMap("trackNo")
    @Validation(required = true)
    private String trackNo;

    private AddAxnTrackNoRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.phoneNoX = builder.phoneNoX;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subsId = builder.subsId;
        this.trackNo = builder.trackNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAxnTrackNoRequest create() {
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
     * @return phoneNoX
     */
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
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
     * @return subsId
     */
    public String getSubsId() {
        return this.subsId;
    }

    /**
     * @return trackNo
     */
    public String getTrackNo() {
        return this.trackNo;
    }

    public static final class Builder extends Request.Builder<AddAxnTrackNoRequest, Builder> {
        private Long ownerId; 
        private String phoneNoX; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subsId; 
        private String trackNo; 

        private Builder() {
            super();
        } 

        private Builder(AddAxnTrackNoRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.phoneNoX = response.phoneNoX;
            this.poolKey = response.poolKey;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.subsId = response.subsId;
            this.trackNo = response.trackNo;
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
         * PhoneNoX.
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * PoolKey.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
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
         * SubsId.
         */
        public Builder subsId(String subsId) {
            this.putQueryParameter("SubsId", subsId);
            this.subsId = subsId;
            return this;
        }

        /**
         * trackNo.
         */
        public Builder trackNo(String trackNo) {
            this.putQueryParameter("trackNo", trackNo);
            this.trackNo = trackNo;
            return this;
        }

        @Override
        public AddAxnTrackNoRequest build() {
            return new AddAxnTrackNoRequest(this);
        } 

    } 

}
