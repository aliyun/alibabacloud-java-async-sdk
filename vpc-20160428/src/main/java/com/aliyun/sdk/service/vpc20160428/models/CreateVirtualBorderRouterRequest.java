// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualBorderRouterRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualBorderRouterRequest</p>
 */
public class CreateVirtualBorderRouterRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @Query
    @NameInMap("CircuitCode")
    private String circuitCode;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableIpv6")
    private Boolean enableIpv6;

    @Query
    @NameInMap("LocalGatewayIp")
    private String localGatewayIp;

    @Query
    @NameInMap("LocalIpv6GatewayIp")
    private String localIpv6GatewayIp;

    @Query
    @NameInMap("Name")
    private String name;

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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("VbrOwnerId")
    private Long vbrOwnerId;

    @Query
    @NameInMap("VlanId")
    @Validation(required = true)
    private Integer vlanId;

    private CreateVirtualBorderRouterRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.circuitCode = builder.circuitCode;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.enableIpv6 = builder.enableIpv6;
        this.localGatewayIp = builder.localGatewayIp;
        this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerGatewayIp = builder.peerGatewayIp;
        this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
        this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
        this.peeringSubnetMask = builder.peeringSubnetMask;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
        this.vbrOwnerId = builder.vbrOwnerId;
        this.vlanId = builder.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualBorderRouterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableIpv6
     */
    public Boolean getEnableIpv6() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vbrOwnerId
     */
    public Long getVbrOwnerId() {
        return this.vbrOwnerId;
    }

    /**
     * @return vlanId
     */
    public Integer getVlanId() {
        return this.vlanId;
    }

    public static final class Builder extends Request.Builder<CreateVirtualBorderRouterRequest, Builder> {
        private Long bandwidth; 
        private String circuitCode; 
        private String clientToken; 
        private String description; 
        private Boolean enableIpv6; 
        private String localGatewayIp; 
        private String localIpv6GatewayIp; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerGatewayIp; 
        private String peerIpv6GatewayIp; 
        private String peeringIpv6SubnetMask; 
        private String peeringSubnetMask; 
        private String physicalConnectionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tags> tags; 
        private Long vbrOwnerId; 
        private Integer vlanId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirtualBorderRouterRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.circuitCode = request.circuitCode;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.enableIpv6 = request.enableIpv6;
            this.localGatewayIp = request.localGatewayIp;
            this.localIpv6GatewayIp = request.localIpv6GatewayIp;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerGatewayIp = request.peerGatewayIp;
            this.peerIpv6GatewayIp = request.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = request.peeringIpv6SubnetMask;
            this.peeringSubnetMask = request.peeringSubnetMask;
            this.physicalConnectionId = request.physicalConnectionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
            this.vbrOwnerId = request.vbrOwnerId;
            this.vlanId = request.vlanId;
        } 

        /**
         * The bandwidth of the VBR. Unit: Mbit/s.
         * <p>
         * 
         * *   When you create a VBR for a dedicated connection, valid values are **50**, **100**, **200**, **300**, **400**, **500**, **1000**, **2048**, **5120**, **8192**, **10240**, **20480**, **40960**, **50120**, **61440**, and **102400**.
         * *   You do not need to set this parameter when you create a VBR for a hosted connection. The bandwidth is already configured when the hosted connection is created.
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.
         * <p>
         * 
         * >  Only the owner of the Express Connect circuit can set this parameter.
         */
        public Builder circuitCode(String circuitCode) {
            this.putQueryParameter("CircuitCode", circuitCode);
            this.circuitCode = circuitCode;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests.
         * 
         * >  If you do not set this parameter, the system automatically sets **ClientToken** to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the VBR.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to enable IPv6. Valid values:
         * <p>
         * 
         * *   **true**: enables IPv6.
         * *   **false** (default): disables IPv6.
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * The IP address of the VBR. Only the owner of the VBR can set or modify this parameter.
         * <p>
         * 
         * When you create a VBR for the owner of the Express Connect circuit, this parameter is required.
         */
        public Builder localGatewayIp(String localGatewayIp) {
            this.putQueryParameter("LocalGatewayIp", localGatewayIp);
            this.localGatewayIp = localGatewayIp;
            return this;
        }

        /**
         * The IPv6 address of the VBR. Only the owner of the VBR can set or modify this parameter.
         * <p>
         * 
         * When you create a VBR for the owner of the Express Connect circuit, this parameter is required.
         */
        public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
            this.putQueryParameter("LocalIpv6GatewayIp", localIpv6GatewayIp);
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }

        /**
         * The name of the VBR.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The IP address of the gateway device in the data center. Only the owner of the VBR can set or modify this parameter.
         * <p>
         * 
         * When you create a VBR for the owner of the Express Connect circuit, this parameter is required.
         */
        public Builder peerGatewayIp(String peerGatewayIp) {
            this.putQueryParameter("PeerGatewayIp", peerGatewayIp);
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }

        /**
         * The IPv6 address of the gateway device in the data center. Only the owner of the VBR can set or modify this parameter.
         * <p>
         * 
         * When you create a VBR for the owner of the Express Connect circuit, this parameter is required.
         */
        public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.putQueryParameter("PeerIpv6GatewayIp", peerIpv6GatewayIp);
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }

        /**
         * The subnet mask of the IPv6 addresses of the VBR and the gateway device in the data center.
         * <p>
         * 
         * The two IPv6 addresses must fall within the same subnet.
         */
        public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.putQueryParameter("PeeringIpv6SubnetMask", peeringIpv6SubnetMask);
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }

        /**
         * The subnet mask of the IP addresses of the VBR and the gateway device in the data center.
         * <p>
         * 
         * The two IP addresses must fall within the same subnet.
         */
        public Builder peeringSubnetMask(String peeringSubnetMask) {
            this.putQueryParameter("PeeringSubnetMask", peeringSubnetMask);
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }

        /**
         * The ID of the Express Connect circuit.
         * <p>
         * 
         * You can create a VBR for a dedicated connection or a hosted connection.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * The region ID of the Express Connect circuit.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * For more information about resource group, see [What is Resource Management?](~~94475~~)
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The tag list.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The account ID of the VBR owner.
         * <p>
         * 
         * The default value is the ID of the current Alibaba Cloud account.
         */
        public Builder vbrOwnerId(Long vbrOwnerId) {
            this.putQueryParameter("VbrOwnerId", vbrOwnerId);
            this.vbrOwnerId = vbrOwnerId;
            return this;
        }

        /**
         * The VLAN ID of the VBR. Valid values: **0 to 2999**.
         * <p>
         * 
         * >  Only the owner of the Express Connect circuit can set this parameter. The VLAN IDs of two VBRs of the same the Express Connect circuit must be different.
         */
        public Builder vlanId(Integer vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        @Override
        public CreateVirtualBorderRouterRequest build() {
            return new CreateVirtualBorderRouterRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The key cannot exceed 128 characters in length, and cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. You can specify at most 20 tag values. It can be an empty string.
             * <p>
             * 
             * The tag value cannot exceed 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
