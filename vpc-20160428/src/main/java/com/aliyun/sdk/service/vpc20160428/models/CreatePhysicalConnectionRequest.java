// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreatePhysicalConnectionRequest</p>
 */
public class CreatePhysicalConnectionRequest extends Request {
    @Query
    @NameInMap("AccessPointId")
    @Validation(required = true)
    private String accessPointId;

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
    @NameInMap("DeviceAdvancedCapacity")
    private java.util.List < String > deviceAdvancedCapacity;

    @Query
    @NameInMap("LineOperator")
    @Validation(required = true)
    private String lineOperator;

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
    @NameInMap("PeerLocation")
    private String peerLocation;

    @Query
    @NameInMap("PortType")
    private String portType;

    @Query
    @NameInMap("RedundantPhysicalConnectionId")
    private String redundantPhysicalConnectionId;

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
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("bandwidth")
    private Integer bandwidth;

    private CreatePhysicalConnectionRequest(Builder builder) {
        super(builder);
        this.accessPointId = builder.accessPointId;
        this.circuitCode = builder.circuitCode;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.deviceAdvancedCapacity = builder.deviceAdvancedCapacity;
        this.lineOperator = builder.lineOperator;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerLocation = builder.peerLocation;
        this.portType = builder.portType;
        this.redundantPhysicalConnectionId = builder.redundantPhysicalConnectionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.type = builder.type;
        this.bandwidth = builder.bandwidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
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
     * @return deviceAdvancedCapacity
     */
    public java.util.List < String > getDeviceAdvancedCapacity() {
        return this.deviceAdvancedCapacity;
    }

    /**
     * @return lineOperator
     */
    public String getLineOperator() {
        return this.lineOperator;
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
     * @return peerLocation
     */
    public String getPeerLocation() {
        return this.peerLocation;
    }

    /**
     * @return portType
     */
    public String getPortType() {
        return this.portType;
    }

    /**
     * @return redundantPhysicalConnectionId
     */
    public String getRedundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public static final class Builder extends Request.Builder<CreatePhysicalConnectionRequest, Builder> {
        private String accessPointId; 
        private String circuitCode; 
        private String clientToken; 
        private String description; 
        private java.util.List < String > deviceAdvancedCapacity; 
        private String lineOperator; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerLocation; 
        private String portType; 
        private String redundantPhysicalConnectionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String type; 
        private Integer bandwidth; 

        private Builder() {
            super();
        } 

        private Builder(CreatePhysicalConnectionRequest request) {
            super(request);
            this.accessPointId = request.accessPointId;
            this.circuitCode = request.circuitCode;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.deviceAdvancedCapacity = request.deviceAdvancedCapacity;
            this.lineOperator = request.lineOperator;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerLocation = request.peerLocation;
            this.portType = request.portType;
            this.redundantPhysicalConnectionId = request.redundantPhysicalConnectionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.type = request.type;
            this.bandwidth = request.bandwidth;
        } 

        /**
         * The access point ID of the Express Connect circuit.
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.
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
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the Express Connect circuit.
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
         * The advanced features of the device.
         */
        public Builder deviceAdvancedCapacity(java.util.List < String > deviceAdvancedCapacity) {
            this.putQueryParameter("DeviceAdvancedCapacity", deviceAdvancedCapacity);
            this.deviceAdvancedCapacity = deviceAdvancedCapacity;
            return this;
        }

        /**
         * The connectivity provider of the Express Connect circuit. Valid values:
         * <p>
         * 
         * *   **CT**: China Telecom.
         * *   **CU**: China Unicom.
         * *   **CM**: China Mobile.
         * *   **CO**: other connectivity providers in the Chinese mainland.
         * *   **Equinix**: Equinix.
         * *   **Other**: other connectivity providers outside the Chinese mainland.
         */
        public Builder lineOperator(String lineOperator) {
            this.putQueryParameter("LineOperator", lineOperator);
            this.lineOperator = lineOperator;
            return this;
        }

        /**
         * The name of the Express Connect circuit.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
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
         * The geographical location of the data center.
         */
        public Builder peerLocation(String peerLocation) {
            this.putQueryParameter("PeerLocation", peerLocation);
            this.peerLocation = peerLocation;
            return this;
        }

        /**
         * The port type. Valid values:
         * <p>
         * 
         * *   **100Base-T**: 100 Mbit/s copper Ethernet port
         * *   **1000Base-T**: 1,000 Mbit/s copper Ethernet port
         * *   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 km)
         * *   **10GBase-T**: 10,000 Mbit/s copper Ethernet port
         * *   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 km)
         * *   **40GBase-LR**: 40,000 Mbit/s single-mode optical port
         * *   **100GBase-LR**: 100,000 Mbit/s single-mode optical port
         * 
         * >  To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.
         */
        public Builder portType(String portType) {
            this.putQueryParameter("PortType", portType);
            this.portType = portType;
            return this;
        }

        /**
         * The ID of the redundant Express Connect circuit. The redundant Express Connect circuit must be in the **Allocated**, **Confirmed**, or **Enabled** state.
         */
        public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.putQueryParameter("RedundantPhysicalConnectionId", redundantPhysicalConnectionId);
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
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
         * The ID of the resource group to which the Express Connect circuit belongs.
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
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of Express Connect circuit. Default value: **VPC**.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The maximum bandwidth of the hosted connection. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: **50**, **100**, **200**, **300**, **400**, **500**, **1000**, **2000**, **4000**, **5000**, **8000**, and **10000**.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        @Override
        public CreatePhysicalConnectionRequest build() {
            return new CreatePhysicalConnectionRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The key of tag to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value to add to the resource. You can specify up to 20 tag values The tag value can be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
