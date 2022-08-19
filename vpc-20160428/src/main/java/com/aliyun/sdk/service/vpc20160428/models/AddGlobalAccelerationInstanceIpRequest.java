// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGlobalAccelerationInstanceIpRequest} extends {@link RequestModel}
 *
 * <p>AddGlobalAccelerationInstanceIpRequest</p>
 */
public class AddGlobalAccelerationInstanceIpRequest extends Request {
    @Query
    @NameInMap("GlobalAccelerationInstanceId")
    @Validation(required = true)
    private String globalAccelerationInstanceId;

    @Query
    @NameInMap("IpInstanceId")
    @Validation(required = true)
    private String ipInstanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AddGlobalAccelerationInstanceIpRequest(Builder builder) {
        super(builder);
        this.globalAccelerationInstanceId = builder.globalAccelerationInstanceId;
        this.ipInstanceId = builder.ipInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGlobalAccelerationInstanceIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalAccelerationInstanceId
     */
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    /**
     * @return ipInstanceId
     */
    public String getIpInstanceId() {
        return this.ipInstanceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<AddGlobalAccelerationInstanceIpRequest, Builder> {
        private String globalAccelerationInstanceId; 
        private String ipInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AddGlobalAccelerationInstanceIpRequest request) {
            super(request);
            this.globalAccelerationInstanceId = request.globalAccelerationInstanceId;
            this.ipInstanceId = request.ipInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * GlobalAccelerationInstanceId.
         */
        public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.putQueryParameter("GlobalAccelerationInstanceId", globalAccelerationInstanceId);
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }

        /**
         * IpInstanceId.
         */
        public Builder ipInstanceId(String ipInstanceId) {
            this.putQueryParameter("IpInstanceId", ipInstanceId);
            this.ipInstanceId = ipInstanceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public AddGlobalAccelerationInstanceIpRequest build() {
            return new AddGlobalAccelerationInstanceIpRequest(this);
        } 

    } 

}
