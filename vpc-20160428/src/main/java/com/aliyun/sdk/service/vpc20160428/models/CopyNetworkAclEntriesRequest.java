// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyNetworkAclEntriesRequest} extends {@link RequestModel}
 *
 * <p>CopyNetworkAclEntriesRequest</p>
 */
public class CopyNetworkAclEntriesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("NetworkAclId")
    @Validation(required = true)
    private String networkAclId;

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

    @Query
    @NameInMap("SourceNetworkAclId")
    @Validation(required = true)
    private String sourceNetworkAclId;

    private CopyNetworkAclEntriesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.networkAclId = builder.networkAclId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceNetworkAclId = builder.sourceNetworkAclId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyNetworkAclEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
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

    /**
     * @return sourceNetworkAclId
     */
    public String getSourceNetworkAclId() {
        return this.sourceNetworkAclId;
    }

    public static final class Builder extends Request.Builder<CopyNetworkAclEntriesRequest, Builder> {
        private String clientToken; 
        private String networkAclId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceNetworkAclId; 

        private Builder() {
            super();
        } 

        private Builder(CopyNetworkAclEntriesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.networkAclId = request.networkAclId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceNetworkAclId = request.sourceNetworkAclId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * NetworkAclId.
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
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

        /**
         * SourceNetworkAclId.
         */
        public Builder sourceNetworkAclId(String sourceNetworkAclId) {
            this.putQueryParameter("SourceNetworkAclId", sourceNetworkAclId);
            this.sourceNetworkAclId = sourceNetworkAclId;
            return this;
        }

        @Override
        public CopyNetworkAclEntriesRequest build() {
            return new CopyNetworkAclEntriesRequest(this);
        } 

    } 

}
