// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociatePhysicalConnectionToVirtualBorderRouterRequest} extends {@link RequestModel}
 *
 * <p>AssociatePhysicalConnectionToVirtualBorderRouterRequest</p>
 */
public class AssociatePhysicalConnectionToVirtualBorderRouterRequest extends Request {
    @Query
    @NameInMap("CircuitCode")
    private String circuitCode;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EnableIpv6")
    private String enableIpv6;

    @Query
    @NameInMap("LocalGatewayIp")
    private String localGatewayIp;

    @Query
    @NameInMap("LocalIpv6GatewayIp")
    private String localIpv6GatewayIp;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeerGatewayIp")
    private String peerGatewayIp;

    @Query
    @NameInMap("PeerIpv6GatewayIp")
    private String peerIpv6GatewayIp;

    @Query
    @NameInMap("PeeringIpv6SubnetMask")
    private String peeringIpv6SubnetMask;

    @Query
    @NameInMap("PeeringSubnetMask")
    private String peeringSubnetMask;

    @Query
    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    private String physicalConnectionId;

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
    @NameInMap("VbrId")
    @Validation(required = true)
    private String vbrId;

    @Query
    @NameInMap("VlanId")
    @Validation(required = true)
    private String vlanId;

    private AssociatePhysicalConnectionToVirtualBorderRouterRequest(Builder builder) {
        super(builder);
        this.circuitCode = builder.circuitCode;
        this.clientToken = builder.clientToken;
        this.enableIpv6 = builder.enableIpv6;
        this.localGatewayIp = builder.localGatewayIp;
        this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerGatewayIp = builder.peerGatewayIp;
        this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
        this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
        this.peeringSubnetMask = builder.peeringSubnetMask;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vbrId = builder.vbrId;
        this.vlanId = builder.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociatePhysicalConnectionToVirtualBorderRouterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return circuitCode
     */
    public String getCircuitCode() {
        return this.circuitCode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableIpv6
     */
    public String getEnableIpv6() {
        return this.enableIpv6;
    }

    /**
     * @return localGatewayIp
     */
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    /**
     * @return localIpv6GatewayIp
     */
    public String getLocalIpv6GatewayIp() {
        return this.localIpv6GatewayIp;
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
     * @return peerGatewayIp
     */
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    /**
     * @return peerIpv6GatewayIp
     */
    public String getPeerIpv6GatewayIp() {
        return this.peerIpv6GatewayIp;
    }

    /**
     * @return peeringIpv6SubnetMask
     */
    public String getPeeringIpv6SubnetMask() {
        return this.peeringIpv6SubnetMask;
    }

    /**
     * @return peeringSubnetMask
     */
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
    }

    /**
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
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
     * @return vbrId
     */
    public String getVbrId() {
        return this.vbrId;
    }

    /**
     * @return vlanId
     */
    public String getVlanId() {
        return this.vlanId;
    }

    public static final class Builder extends Request.Builder<AssociatePhysicalConnectionToVirtualBorderRouterRequest, Builder> {
        private String circuitCode; 
        private String clientToken; 
        private String enableIpv6; 
        private String localGatewayIp; 
        private String localIpv6GatewayIp; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerGatewayIp; 
        private String peerIpv6GatewayIp; 
        private String peeringIpv6SubnetMask; 
        private String peeringSubnetMask; 
        private String physicalConnectionId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vbrId; 
        private String vlanId; 

        private Builder() {
            super();
        } 

        private Builder(AssociatePhysicalConnectionToVirtualBorderRouterRequest request) {
            super(request);
            this.circuitCode = request.circuitCode;
            this.clientToken = request.clientToken;
            this.enableIpv6 = request.enableIpv6;
            this.localGatewayIp = request.localGatewayIp;
            this.localIpv6GatewayIp = request.localIpv6GatewayIp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerGatewayIp = request.peerGatewayIp;
            this.peerIpv6GatewayIp = request.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = request.peeringIpv6SubnetMask;
            this.peeringSubnetMask = request.peeringSubnetMask;
            this.physicalConnectionId = request.physicalConnectionId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vbrId = request.vbrId;
            this.vlanId = request.vlanId;
        } 

        /**
         * CircuitCode.
         */
        public Builder circuitCode(String circuitCode) {
            this.putQueryParameter("CircuitCode", circuitCode);
            this.circuitCode = circuitCode;
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
         * EnableIpv6.
         */
        public Builder enableIpv6(String enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * LocalGatewayIp.
         */
        public Builder localGatewayIp(String localGatewayIp) {
            this.putQueryParameter("LocalGatewayIp", localGatewayIp);
            this.localGatewayIp = localGatewayIp;
            return this;
        }

        /**
         * LocalIpv6GatewayIp.
         */
        public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
            this.putQueryParameter("LocalIpv6GatewayIp", localIpv6GatewayIp);
            this.localIpv6GatewayIp = localIpv6GatewayIp;
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
         * PeerGatewayIp.
         */
        public Builder peerGatewayIp(String peerGatewayIp) {
            this.putQueryParameter("PeerGatewayIp", peerGatewayIp);
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }

        /**
         * PeerIpv6GatewayIp.
         */
        public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.putQueryParameter("PeerIpv6GatewayIp", peerIpv6GatewayIp);
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }

        /**
         * PeeringIpv6SubnetMask.
         */
        public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.putQueryParameter("PeeringIpv6SubnetMask", peeringIpv6SubnetMask);
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }

        /**
         * PeeringSubnetMask.
         */
        public Builder peeringSubnetMask(String peeringSubnetMask) {
            this.putQueryParameter("PeeringSubnetMask", peeringSubnetMask);
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }

        /**
         * PhysicalConnectionId.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
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
         * VbrId.
         */
        public Builder vbrId(String vbrId) {
            this.putQueryParameter("VbrId", vbrId);
            this.vbrId = vbrId;
            return this;
        }

        /**
         * VlanId.
         */
        public Builder vlanId(String vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        @Override
        public AssociatePhysicalConnectionToVirtualBorderRouterRequest build() {
            return new AssociatePhysicalConnectionToVirtualBorderRouterRequest(this);
        } 

    } 

}
