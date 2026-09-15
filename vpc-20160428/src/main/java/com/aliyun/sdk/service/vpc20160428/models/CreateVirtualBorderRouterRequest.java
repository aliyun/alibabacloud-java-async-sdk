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
 * {@link CreateVirtualBorderRouterRequest} extends {@link RequestModel}
 *
 * <p>CreateVirtualBorderRouterRequest</p>
 */
public class CreateVirtualBorderRouterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

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
    @com.aliyun.core.annotation.NameInMap("EnableIpv6")
    private Boolean enableIpv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
    private String localGatewayIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalIpv6GatewayIp")
    private String localIpv6GatewayIp;

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
    @com.aliyun.core.annotation.NameInMap("PeerGatewayIp")
    private String peerGatewayIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerIpv6GatewayIp")
    private String peerIpv6GatewayIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeeringIpv6SubnetMask")
    private String peeringIpv6SubnetMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeeringSubnetMask")
    private String peeringSubnetMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String physicalConnectionId;

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
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrOwnerId")
    private Long vbrOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlanId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<Tags> tags; 
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
         * <p>The bandwidth of the VBR instance. Unit: Mbit/s.</p>
         * <ul>
         * <li>When you create a VBR instance for a dedicated Express Connect circuit, valid values are <strong>50</strong>, <strong>100</strong>, <strong>200</strong>, <strong>300</strong>, <strong>400</strong>, <strong>500</strong>, <strong>1000</strong>, <strong>2048</strong>, <strong>5120</strong>, <strong>8192</strong>, <strong>10240</strong>, <strong>20480</strong>, <strong>40960</strong>, <strong>50120</strong>, <strong>61440</strong>, and <strong>102400</strong>.</li>
         * <li>When you create a VBR instance for shared Express Connect circuits, you do not need to configure this parameter. The bandwidth of the VBR is the bandwidth of the shared Express Connect circuits that is specified in Settings when the shared Express Connect circuits are created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The circuit code provided by the carrier for the Express Connect circuit. </p>
         * <blockquote>
         * <p>Only the owner of the Express Connect circuit can specify this parameter.</p>
         * </blockquote>
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
         * <p>The client generates the value of this parameter. Make sure that the value is unique among different requests.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may vary for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the VBR instance.  </p>
         * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * <p>The Alibaba Cloud-side IP address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
         * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder localGatewayIp(String localGatewayIp) {
            this.putQueryParameter("LocalGatewayIp", localGatewayIp);
            this.localGatewayIp = localGatewayIp;
            return this;
        }

        /**
         * <p>The Alibaba Cloud-side IPv6 address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
         * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
         */
        public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
            this.putQueryParameter("LocalIpv6GatewayIp", localIpv6GatewayIp);
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }

        /**
         * <p>The name of the VBR instance.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The customer-side IP address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
         * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        public Builder peerGatewayIp(String peerGatewayIp) {
            this.putQueryParameter("PeerGatewayIp", peerGatewayIp);
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }

        /**
         * <p>The customer-side IPv6 address of the VBR instance. Only the VBR owner can specify or modify this property.</p>
         * <p>This parameter is required when you create a VBR instance for the owner of the Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:4:4:4:4:4:4</p>
         */
        public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.putQueryParameter("PeerIpv6GatewayIp", peerIpv6GatewayIp);
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }

        /**
         * <p>The subnet mask for the Alibaba Cloud-side and customer-side IPv6 addresses of the VBR instance. </p>
         * <p>The two IPv6 addresses must be in the same subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:4004:cc:400::/56</p>
         */
        public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.putQueryParameter("PeeringIpv6SubnetMask", peeringIpv6SubnetMask);
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }

        /**
         * <p>The subnet mask for the Alibaba Cloud-side and customer-side IP addresses of the VBR instance. </p>
         * <p>The two IP addresses must be in the same subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.252</p>
         */
        public Builder peeringSubnetMask(String peeringSubnetMask) {
            this.putQueryParameter("PeeringSubnetMask", peeringSubnetMask);
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }

        /**
         * <p>The instance ID of the Express Connect circuit. </p>
         * <p>You can create a VBR instance for a dedicated Express Connect circuit or for shared Express Connect circuits.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zextbehcx****</p>
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
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
         * <p>The tags of the resource.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The account ID of the VBR instance owner.</p>
         * <p>The default value is the Alibaba Cloud account ID used for logon.</p>
         * 
         * <strong>example:</strong>
         * <p>168811111****</p>
         */
        public Builder vbrOwnerId(Long vbrOwnerId) {
            this.putQueryParameter("VbrOwnerId", vbrOwnerId);
            this.vbrOwnerId = vbrOwnerId;
            return this;
        }

        /**
         * <p>The VLAN ID of the VBR instance. Valid values: <strong>0 to 2999</strong>. </p>
         * <blockquote>
         * <p>Only the owner of the Express Connect circuit can specify this parameter. The VLAN IDs of two VBR instances on the same Express Connect circuit must be different.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

    /**
     * 
     * {@link CreateVirtualBorderRouterRequest} extends {@link TeaModel}
     *
     * <p>CreateVirtualBorderRouterRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You must specify at least 1 tag key and can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
