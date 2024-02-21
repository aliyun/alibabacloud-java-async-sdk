// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterTransitRouterMulticastGroupSourcesRequest} extends {@link RequestModel}
 *
 * <p>RegisterTransitRouterMulticastGroupSourcesRequest</p>
 */
public class RegisterTransitRouterMulticastGroupSourcesRequest extends Request {
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

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private RegisterTransitRouterMulticastGroupSourcesRequest(Builder builder) {
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
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterTransitRouterMulticastGroupSourcesRequest create() {
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

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<RegisterTransitRouterMulticastGroupSourcesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String groupIpAddress; 
        private java.util.List < String > networkInterfaceIds; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterMulticastDomainId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterTransitRouterMulticastGroupSourcesRequest request) {
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
            this.vpcId = request.vpcId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID is different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a dry run, without sending the actual request. Default values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The IP address of the multicast group to which the multicast source belongs. Valid values: **224.0.0.1** to **239.255.255.254**.
         * <p>
         * 
         * If the multicast group does not exist in the multicast domain, the system automatically creates the multicast group in the multicast domain.
         */
        public Builder groupIpAddress(String groupIpAddress) {
            this.putQueryParameter("GroupIpAddress", groupIpAddress);
            this.groupIpAddress = groupIpAddress;
            return this;
        }

        /**
         * The IDs of ENIs.
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
         * The ID of the multicast domain to which the multicast source belongs.
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * The ID of the VPC to which the ENI belongs.
         * <p>
         * 
         * *   If the ENI belongs to the current Alibaba Cloud account, ignore this parameter.
         * *   If the ENI belongs to a different Alibaba Cloud account, you must set this parameter.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public RegisterTransitRouterMulticastGroupSourcesRequest build() {
            return new RegisterTransitRouterMulticastGroupSourcesRequest(this);
        } 

    } 

}
