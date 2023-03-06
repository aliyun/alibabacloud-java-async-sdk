// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterTransitRouterMulticastGroupSourcesRequest} extends {@link RequestModel}
 *
 * <p>DeregisterTransitRouterMulticastGroupSourcesRequest</p>
 */
public class DeregisterTransitRouterMulticastGroupSourcesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("GroupIpAddress")
    @Validation(required = true)
    private String groupIpAddress;

    @Query
    @NameInMap("NetworkInterfaceIds")
    private java.util.List < String > networkInterfaceIds;

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

    @Query
    @NameInMap("TransitRouterMulticastDomainId")
    @Validation(required = true)
    private String transitRouterMulticastDomainId;

    private DeregisterTransitRouterMulticastGroupSourcesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.groupIpAddress = builder.groupIpAddress;
        this.networkInterfaceIds = builder.networkInterfaceIds;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterTransitRouterMulticastGroupSourcesRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return groupIpAddress
     */
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    /**
     * @return networkInterfaceIds
     */
    public java.util.List < String > getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
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

    /**
     * @return transitRouterMulticastDomainId
     */
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public static final class Builder extends Request.Builder<DeregisterTransitRouterMulticastGroupSourcesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String groupIpAddress; 
        private java.util.List < String > networkInterfaceIds; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterMulticastDomainId; 

        private Builder() {
            super();
        } 

        private Builder(DeregisterTransitRouterMulticastGroupSourcesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.groupIpAddress = request.groupIpAddress;
            this.networkInterfaceIds = request.networkInterfaceIds;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterMulticastDomainId = request.transitRouterMulticastDomainId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether only to check the request. Valid values:
         * <p>
         * 
         * *   **true**: only prechecks the API request. The multicast source is not deleted. The system checks the required parameters, the request format, and the service limits. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. After the request passes the precheck, the multicast source is deleted.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The IP address of the multicast group to which the multicast source belongs.
         */
        public Builder groupIpAddress(String groupIpAddress) {
            this.putQueryParameter("GroupIpAddress", groupIpAddress);
            this.groupIpAddress = groupIpAddress;
            return this;
        }

        /**
         * The IDs of the multicast sources. You can create only one multicast source in a multicast group.
         * <p>
         * 
         * >  This parameter is required.
         */
        public Builder networkInterfaceIds(java.util.List < String > networkInterfaceIds) {
            this.putQueryParameter("NetworkInterfaceIds", networkInterfaceIds);
            this.networkInterfaceIds = networkInterfaceIds;
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

        /**
         * The ID of the multicast group to which the multicast source belongs.
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        @Override
        public DeregisterTransitRouterMulticastGroupSourcesRequest build() {
            return new DeregisterTransitRouterMulticastGroupSourcesRequest(this);
        } 

    } 

}
