// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResolveAndRouteServiceInCenRequest} extends {@link RequestModel}
 *
 * <p>ResolveAndRouteServiceInCenRequest</p>
 */
public class ResolveAndRouteServiceInCenRequest extends Request {
    @Query
    @NameInMap("AccessRegionIds")
    @Validation(required = true)
    private java.util.List < String > accessRegionIds;

    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Host")
    @Validation(required = true)
    private String host;

    @Query
    @NameInMap("HostRegionId")
    @Validation(required = true)
    private String hostRegionId;

    @Query
    @NameInMap("HostVpcId")
    @Validation(required = true)
    private String hostVpcId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ResolveAndRouteServiceInCenRequest(Builder builder) {
        super(builder);
        this.accessRegionIds = builder.accessRegionIds;
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.host = builder.host;
        this.hostRegionId = builder.hostRegionId;
        this.hostVpcId = builder.hostVpcId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResolveAndRouteServiceInCenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessRegionIds
     */
    public java.util.List < String > getAccessRegionIds() {
        return this.accessRegionIds;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return hostRegionId
     */
    public String getHostRegionId() {
        return this.hostRegionId;
    }

    /**
     * @return hostVpcId
     */
    public String getHostVpcId() {
        return this.hostVpcId;
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

    public static final class Builder extends Request.Builder<ResolveAndRouteServiceInCenRequest, Builder> {
        private java.util.List < String > accessRegionIds; 
        private String cenId; 
        private String clientToken; 
        private String description; 
        private String host; 
        private String hostRegionId; 
        private String hostVpcId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ResolveAndRouteServiceInCenRequest response) {
            super(response);
            this.accessRegionIds = response.accessRegionIds;
            this.cenId = response.cenId;
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.host = response.host;
            this.hostRegionId = response.hostRegionId;
            this.hostVpcId = response.hostVpcId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * AccessRegionIds.
         */
        public Builder accessRegionIds(java.util.List < String > accessRegionIds) {
            this.putQueryParameter("AccessRegionIds", accessRegionIds);
            this.accessRegionIds = accessRegionIds;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * HostRegionId.
         */
        public Builder hostRegionId(String hostRegionId) {
            this.putQueryParameter("HostRegionId", hostRegionId);
            this.hostRegionId = hostRegionId;
            return this;
        }

        /**
         * HostVpcId.
         */
        public Builder hostVpcId(String hostVpcId) {
            this.putQueryParameter("HostVpcId", hostVpcId);
            this.hostVpcId = hostVpcId;
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
        public ResolveAndRouteServiceInCenRequest build() {
            return new ResolveAndRouteServiceInCenRequest(this);
        } 

    } 

}
