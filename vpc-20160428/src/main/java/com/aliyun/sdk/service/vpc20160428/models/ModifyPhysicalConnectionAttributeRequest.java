// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPhysicalConnectionAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyPhysicalConnectionAttributeRequest</p>
 */
public class ModifyPhysicalConnectionAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CircuitCode")
    private String circuitCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineOperator")
    private String lineOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerLocation")
    private String peerLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String physicalConnectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortType")
    private String portType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedundantPhysicalConnectionId")
    private String redundantPhysicalConnectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bandwidth")
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
         * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        public Builder circuitCode(String circuitCode) {
            this.putQueryParameter("CircuitCode", circuitCode);
            this.circuitCode = circuitCode;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>efefe566754h</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the Express Connect circuit.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the Express Connect circuit.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom</li>
         * <li><strong>CU</strong>: China Unicom</li>
         * <li><strong>CM</strong>: China Mobile</li>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland</li>
         * <li><strong>Equinix</strong>: Equinix</li>
         * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CT</p>
         */
        public Builder lineOperator(String lineOperator) {
            this.putQueryParameter("LineOperator", lineOperator);
            this.lineOperator = lineOperator;
            return this;
        }

        /**
         * <p>The name of the Express Connect circuit.</p>
         * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
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
         * <p>The geographical location of the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>XX Number, XX Road, XX Town, XX District, Hangzhou City, Zhejiang Province.</p>
         */
        public Builder peerLocation(String peerLocation) {
            this.putQueryParameter("PeerLocation", peerLocation);
            this.peerLocation = peerLocation;
            return this;
        }

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-119mfjzm******</p>
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * <p>The port type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-T</strong> (default): 1,000 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 kilometers)</li>
         * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
         * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 kilometers)</li>
         * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
         * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
         * </ul>
         * <blockquote>
         * <p> To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000Base-LX</p>
         */
        public Builder portType(String portType) {
            this.putQueryParameter("PortType", portType);
            this.portType = portType;
            return this;
        }

        /**
         * <p>The ID of the redundant Express Connect circuit. The redundant Express Connect circuit must be in the <strong>Allocated</strong>, <strong>Confirmed</strong>, or <strong>Enabled</strong> state.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-119mfjzm7</p>
         */
        public Builder redundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.putQueryParameter("RedundantPhysicalConnectionId", redundantPhysicalConnectionId);
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>The bandwidth value for the connection over the Express Connect circuit. Unit: Mbit/s. Valid values: 2 to 10240.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
