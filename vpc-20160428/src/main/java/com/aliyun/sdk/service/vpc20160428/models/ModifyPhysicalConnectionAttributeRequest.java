// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPhysicalConnectionAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyPhysicalConnectionAttributeRequest</p>
 */
public class ModifyPhysicalConnectionAttributeRequest extends Request {
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
    @NameInMap("LineOperator")
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
    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    private String physicalConnectionId;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("bandwidth")
    private Integer bandwidth;

    private ModifyPhysicalConnectionAttributeRequest(Builder builder) {
        super(builder);
        this.circuitCode = builder.circuitCode;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.lineOperator = builder.lineOperator;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerLocation = builder.peerLocation;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.portType = builder.portType;
        this.redundantPhysicalConnectionId = builder.redundantPhysicalConnectionId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.bandwidth = builder.bandwidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPhysicalConnectionAttributeRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
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
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public static final class Builder extends Request.Builder<ModifyPhysicalConnectionAttributeRequest, Builder> {
        private String circuitCode; 
        private String clientToken; 
        private String description; 
        private String lineOperator; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerLocation; 
        private String physicalConnectionId; 
        private String portType; 
        private String redundantPhysicalConnectionId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer bandwidth; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPhysicalConnectionAttributeRequest request) {
            super(request);
            this.circuitCode = request.circuitCode;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.lineOperator = request.lineOperator;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerLocation = request.peerLocation;
            this.physicalConnectionId = request.physicalConnectionId;
            this.portType = request.portType;
            this.redundantPhysicalConnectionId = request.redundantPhysicalConnectionId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.bandwidth = request.bandwidth;
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
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
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
         * The description must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The connectivity provider of the Express Connect circuit. Valid values:
         * <p>
         * 
         * *   **CT**: China Telecom
         * *   **CU**: China Unicom
         * *   **CM**: China Mobile
         * *   **CO**: other connectivity providers in the Chinese mainland
         * *   **Equinix**: Equinix
         * *   **Other**: other connectivity providers outside the Chinese mainland
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
         * The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter but cannot start with `http://` or `https://`.
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
         * The ID of the Express Connect circuit.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * The port type of the Express Connect circuit. Valid values:
         * <p>
         * 
         * *   **100Base-T**: 100 Mbit/s copper Ethernet port
         * *   **1000Base-T** (default): 1,000 Mbit/s copper Ethernet port
         * *   **1000Base-LX**: 1,000 Mbit/s single-mode optical port (10 kilometers)
         * *   **10GBase-T**: 10,000 Mbit/s copper Ethernet port
         * *   **10GBase-LR**: 10,000 Mbit/s single-mode optical port (10 kilometers)
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
         * The bandwidth value for the connection over the Express Connect circuit. Unit: Mbit/s. Valid values: 2 to 10240.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        @Override
        public ModifyPhysicalConnectionAttributeRequest build() {
            return new ModifyPhysicalConnectionAttributeRequest(this);
        } 

    } 

}
