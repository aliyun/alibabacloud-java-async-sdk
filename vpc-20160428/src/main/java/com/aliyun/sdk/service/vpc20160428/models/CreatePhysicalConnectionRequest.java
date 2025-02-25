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
 * {@link CreatePhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreatePhysicalConnectionRequest</p>
 */
public class CreatePhysicalConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPointId;

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
    @com.aliyun.core.annotation.NameInMap("DeviceAdvancedCapacity")
    private java.util.List<String> deviceAdvancedCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineOperator")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bandwidth")
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
    public java.util.List<String> getDeviceAdvancedCapacity() {
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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<String> deviceAdvancedCapacity; 
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
        private java.util.List<Tag> tag; 
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
         * <p>The access point ID of the Express Connect circuit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-beijing-ft-A</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
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
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the Express Connect circuit.</p>
         * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The advanced features of the device.</p>
         */
        public Builder deviceAdvancedCapacity(java.util.List<String> deviceAdvancedCapacity) {
            this.putQueryParameter("DeviceAdvancedCapacity", deviceAdvancedCapacity);
            this.deviceAdvancedCapacity = deviceAdvancedCapacity;
            return this;
        }

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CT</strong>: China Telecom.</li>
         * <li><strong>CU</strong>: China Unicom.</li>
         * <li><strong>CM</strong>: China Mobile.</li>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland.</li>
         * <li><strong>Equinix</strong>: Equinix.</li>
         * <li><strong>Other</strong>: other connectivity providers outside the Chinese mainland.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>cn-hangzhou</p>
         */
        public Builder peerLocation(String peerLocation) {
            this.putQueryParameter("PeerLocation", peerLocation);
            this.peerLocation = peerLocation;
            return this;
        }

        /**
         * <p>The port type. Valid values:</p>
         * <ul>
         * <li><strong>100Base-T</strong>: 100 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-T</strong>: 1,000 Mbit/s copper Ethernet port</li>
         * <li><strong>1000Base-LX</strong>: 1,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>10GBase-T</strong>: 10,000 Mbit/s copper Ethernet port</li>
         * <li><strong>10GBase-LR</strong>: 10,000 Mbit/s single-mode optical port (10 km)</li>
         * <li><strong>40GBase-LR</strong>: 40,000 Mbit/s single-mode optical port</li>
         * <li><strong>100GBase-LR</strong>: 100,000 Mbit/s single-mode optical port</li>
         * </ul>
         * <blockquote>
         * <p> To use ports 40GBase-LR and 100GBase-LR, you must first contact your account manager.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000Base-T</p>
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
         * <p>pc-119mfjzm****</p>
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
         * <p>The ID of the resource group to which the Express Connect circuit belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmoiyermp****</p>
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
         * <p>The tag list.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The type of Express Connect circuit. Default value: <strong>VPC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the hosted connection. Unit: Mbit/s.</p>
         * <p>Valid values: <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>300</strong>, <strong>400</strong>, <strong>500</strong>, <strong>1000</strong>, <strong>2000</strong>, <strong>4000</strong>, <strong>5000</strong>, <strong>8000</strong>, and <strong>10000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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

    /**
     * 
     * {@link CreatePhysicalConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreatePhysicalConnectionRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of tag to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value to add to the resource. You can specify up to 20 tag values The tag value can be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
