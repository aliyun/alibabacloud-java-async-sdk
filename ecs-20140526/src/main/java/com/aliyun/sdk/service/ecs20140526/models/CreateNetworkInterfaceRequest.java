// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkInterfaceRequest</p>
 */
public class CreateNetworkInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionTrackingConfiguration")
    private ConnectionTrackingConfiguration connectionTrackingConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteOnRelease")
    private Boolean deleteOnRelease;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnhancedNetwork")
    private EnhancedNetwork enhancedNetwork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4Prefix")
    private java.util.List<String> ipv4Prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4PrefixCount")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer ipv4PrefixCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Address")
    private java.util.List<String> ipv6Address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Prefix")
    private java.util.List<String> ipv6Prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6PrefixCount")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer ipv6PrefixCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficConfig")
    private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryIpAddress")
    private String primaryIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private java.util.List<String> privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueNumber")
    private Integer queueNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
    private Integer queuePairNumber;

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
    @com.aliyun.core.annotation.NameInMap("RxQueueSize")
    private Integer rxQueueSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryPrivateIpAddressCount")
    private Integer secondaryPrivateIpAddressCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List<String> securityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDestCheck")
    private Boolean sourceDestCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TxQueueSize")
    private Integer txQueueSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visible")
    private Boolean visible;

    private CreateNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.businessType = builder.businessType;
        this.clientToken = builder.clientToken;
        this.connectionTrackingConfiguration = builder.connectionTrackingConfiguration;
        this.deleteOnRelease = builder.deleteOnRelease;
        this.description = builder.description;
        this.enhancedNetwork = builder.enhancedNetwork;
        this.instanceType = builder.instanceType;
        this.ipv4Prefix = builder.ipv4Prefix;
        this.ipv4PrefixCount = builder.ipv4PrefixCount;
        this.ipv6Address = builder.ipv6Address;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.ipv6Prefix = builder.ipv6Prefix;
        this.ipv6PrefixCount = builder.ipv6PrefixCount;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.networkInterfaceTrafficConfig = builder.networkInterfaceTrafficConfig;
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.primaryIpAddress = builder.primaryIpAddress;
        this.privateIpAddress = builder.privateIpAddress;
        this.queueNumber = builder.queueNumber;
        this.queuePairNumber = builder.queuePairNumber;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rxQueueSize = builder.rxQueueSize;
        this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.sourceDestCheck = builder.sourceDestCheck;
        this.tag = builder.tag;
        this.txQueueSize = builder.txQueueSize;
        this.vSwitchId = builder.vSwitchId;
        this.visible = builder.visible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkInterfaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionTrackingConfiguration
     */
    public ConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
        return this.connectionTrackingConfiguration;
    }

    /**
     * @return deleteOnRelease
     */
    public Boolean getDeleteOnRelease() {
        return this.deleteOnRelease;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enhancedNetwork
     */
    public EnhancedNetwork getEnhancedNetwork() {
        return this.enhancedNetwork;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ipv4Prefix
     */
    public java.util.List<String> getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    /**
     * @return ipv4PrefixCount
     */
    public Integer getIpv4PrefixCount() {
        return this.ipv4PrefixCount;
    }

    /**
     * @return ipv6Address
     */
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return ipv6Prefix
     */
    public java.util.List<String> getIpv6Prefix() {
        return this.ipv6Prefix;
    }

    /**
     * @return ipv6PrefixCount
     */
    public Integer getIpv6PrefixCount() {
        return this.ipv6PrefixCount;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * @return networkInterfaceTrafficConfig
     */
    public NetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
        return this.networkInterfaceTrafficConfig;
    }

    /**
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
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
     * @return primaryIpAddress
     */
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    /**
     * @return privateIpAddress
     */
    public java.util.List<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return queueNumber
     */
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    /**
     * @return queuePairNumber
     */
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
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
     * @return rxQueueSize
     */
    public Integer getRxQueueSize() {
        return this.rxQueueSize;
    }

    /**
     * @return secondaryPrivateIpAddressCount
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return sourceDestCheck
     */
    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return txQueueSize
     */
    public Integer getTxQueueSize() {
        return this.txQueueSize;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return visible
     */
    public Boolean getVisible() {
        return this.visible;
    }

    public static final class Builder extends Request.Builder<CreateNetworkInterfaceRequest, Builder> {
        private String sourceRegionId; 
        private String businessType; 
        private String clientToken; 
        private ConnectionTrackingConfiguration connectionTrackingConfiguration; 
        private Boolean deleteOnRelease; 
        private String description; 
        private EnhancedNetwork enhancedNetwork; 
        private String instanceType; 
        private java.util.List<String> ipv4Prefix; 
        private Integer ipv4PrefixCount; 
        private java.util.List<String> ipv6Address; 
        private Integer ipv6AddressCount; 
        private java.util.List<String> ipv6Prefix; 
        private Integer ipv6PrefixCount; 
        private String networkInterfaceName; 
        private NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig; 
        private String networkInterfaceTrafficMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String primaryIpAddress; 
        private java.util.List<String> privateIpAddress; 
        private Integer queueNumber; 
        private Integer queuePairNumber; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer rxQueueSize; 
        private Integer secondaryPrivateIpAddressCount; 
        private String securityGroupId; 
        private java.util.List<String> securityGroupIds; 
        private Boolean sourceDestCheck; 
        private java.util.List<Tag> tag; 
        private Integer txQueueSize; 
        private String vSwitchId; 
        private Boolean visible; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkInterfaceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.businessType = request.businessType;
            this.clientToken = request.clientToken;
            this.connectionTrackingConfiguration = request.connectionTrackingConfiguration;
            this.deleteOnRelease = request.deleteOnRelease;
            this.description = request.description;
            this.enhancedNetwork = request.enhancedNetwork;
            this.instanceType = request.instanceType;
            this.ipv4Prefix = request.ipv4Prefix;
            this.ipv4PrefixCount = request.ipv4PrefixCount;
            this.ipv6Address = request.ipv6Address;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.ipv6Prefix = request.ipv6Prefix;
            this.ipv6PrefixCount = request.ipv6PrefixCount;
            this.networkInterfaceName = request.networkInterfaceName;
            this.networkInterfaceTrafficConfig = request.networkInterfaceTrafficConfig;
            this.networkInterfaceTrafficMode = request.networkInterfaceTrafficMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.primaryIpAddress = request.primaryIpAddress;
            this.privateIpAddress = request.privateIpAddress;
            this.queueNumber = request.queueNumber;
            this.queuePairNumber = request.queuePairNumber;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rxQueueSize = request.rxQueueSize;
            this.secondaryPrivateIpAddressCount = request.secondaryPrivateIpAddressCount;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupIds = request.securityGroupIds;
            this.sourceDestCheck = request.sourceDestCheck;
            this.tag = request.tag;
            this.txQueueSize = request.txQueueSize;
            this.vSwitchId = request.vSwitchId;
            this.visible = request.visible;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is no longer used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The connection tracking configurations of the ENI.</p>
         * <p>Before you use this parameter, learn about how to manage connection timeout periods. For more information, see <a href="https://help.aliyun.com/document_detail/2865958.html">Manage connection timeout periods</a>.</p>
         */
        public Builder connectionTrackingConfiguration(ConnectionTrackingConfiguration connectionTrackingConfiguration) {
            this.putQueryParameter("ConnectionTrackingConfiguration", connectionTrackingConfiguration);
            this.connectionTrackingConfiguration = connectionTrackingConfiguration;
            return this;
        }

        /**
         * <p>Specifies whether to release the ENI when the associated instance is released. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteOnRelease(Boolean deleteOnRelease) {
            this.putQueryParameter("DeleteOnRelease", deleteOnRelease);
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }

        /**
         * <p>The description of the ENI. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         */
        public Builder enhancedNetwork(EnhancedNetwork enhancedNetwork) {
            this.putQueryParameter("EnhancedNetwork", enhancedNetwork);
            this.enhancedNetwork = enhancedNetwork;
            return this;
        }

        /**
         * <p>The type of the ENI. Valid values:</p>
         * <ul>
         * <li>Secondary: secondary ENI.</li>
         * <li>Trunk: trunk ENI. This value is in invitational preview.</li>
         * </ul>
         * <p>Default value: Secondary.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>IPv4 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
         * <blockquote>
         * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
         * </blockquote>
         */
        public Builder ipv4Prefix(java.util.List<String> ipv4Prefix) {
            this.putQueryParameter("Ipv4Prefix", ipv4Prefix);
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }

        /**
         * <p>The number of IPv4 prefixes to assign to the ENI. Valid values: 1 to 10.</p>
         * <blockquote>
         * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder ipv4PrefixCount(Integer ipv4PrefixCount) {
            this.putQueryParameter("Ipv4PrefixCount", ipv4PrefixCount);
            this.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }

        /**
         * <p>IPv6 addresses to assign to the ENI. Valid values of N: 1 to 10.</p>
         * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::****</p>
         * <blockquote>
         * <p> To assign IPv6 addresses to the ENI, you must specify the <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code> parameter, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1234:1a00::****</p>
         */
        public Builder ipv6Address(java.util.List<String> ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * <p>The number of IPv6 addresses to randomly generate for the ENI. Valid values: 1 to 10.</p>
         * <blockquote>
         * <p> To assign IPv6 addresses to the ENI, you must specify the <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code> parameter, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * <p>IPv6 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
         * <blockquote>
         * <p> To assign IPv6 prefixes to the ENI, you must specify the Ipv6Prefix.N or Ipv6PrefixCount parameter, but not both.</p>
         * </blockquote>
         */
        public Builder ipv6Prefix(java.util.List<String> ipv6Prefix) {
            this.putQueryParameter("Ipv6Prefix", ipv6Prefix);
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }

        /**
         * <p>The number of IPv6 prefixes to assign to the ENI. Valid values: 1 to 10.</p>
         * <blockquote>
         * <p> To assign IPv6 prefixes to the ENI, you must specify the Ipv6Prefix.N or Ipv6PrefixCount parameter, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder ipv6PrefixCount(Integer ipv6PrefixCount) {
            this.putQueryParameter("Ipv6PrefixCount", ipv6PrefixCount);
            this.ipv6PrefixCount = ipv6PrefixCount;
            return this;
        }

        /**
         * <p>The name of the ENI. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>testNetworkInterfaceName</p>
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * <p>The communication settings of the ENI.</p>
         */
        public Builder networkInterfaceTrafficConfig(NetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
            this.putQueryParameter("NetworkInterfaceTrafficConfig", networkInterfaceTrafficConfig);
            this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;
            return this;
        }

        /**
         * <p>The communication mode of the ENI. Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
         * </ul>
         * <blockquote>
         * <p> ENIs in RDMA mode can be attached only to instances of the instance types that support ERIs. The number of ENIs in RDMA mode that are attached to an instance cannot exceed the maximum number of ENIs that the instance type supports. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of ECS instance families</a> and <a href="https://help.aliyun.com/document_detail/336853.html">Configure eRDMA on an enterprise-level instance</a>.</p>
         * </blockquote>
         * <p>Default value: Standard.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
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
         * <p>The primary private IP address of the ENI.</p>
         * <p>The specified IP address must be an idle IP address within the CIDR block of the vSwitch. If you do not specify this parameter, a random idle IP address within the vSwitch CIDR block is assigned to the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code></p>
         */
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.putQueryParameter("PrimaryIpAddress", primaryIpAddress);
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }

        /**
         * <p>Secondary private IP addresses to assign to the ENI. The IP addresses must be idle IP addresses in the CIDR block of the vSwitch with which to associate the ENI. Valid values of N: 0 to 10.</p>
         * <blockquote>
         * <p> To assign secondary private IP addresses to the ENI, you can specify the <code>PrivateIpAddress.N</code> or <code>SecondaryPrivateIpAddressCount</code> parameter, but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code></p>
         */
        public Builder privateIpAddress(java.util.List<String> privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The number of queues supported by the ENI. Valid values: 1 to 2048.</p>
         * <p>When you attach the ENI to an instance, make sure that the value of this parameter is less than the maximum number of queues per ENI that is allowed for the instance type. To view the maximum number of queues per ENI allowed for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and then check the return value of <code>MaximumQueueNumberPerEni</code>.</p>
         * <p>This parameter is left empty by default. If you do not specify this parameter, the default number of queues per ENI for the instance type of an instance is used when you attach the ENI to the instance. To view the default number of queues per ENI for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and then check the return value of <code>SecondaryEniQueueNumber</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder queueNumber(Integer queueNumber) {
            this.putQueryParameter("QueueNumber", queueNumber);
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * <p>The number of queue pairs (QPs) supported by the elastic RDMA interface (ERI).</p>
         * <p>If you want to attach multiple ERIs to an instance, we recommend that you specify QueuePairNumber for each ERI based on the value of <code>QueuePairNumber</code> supported by the instance type and the number of ERIs that you want to use. Make sure that the total number of QPs of all ERIs does not exceed the maximum number of QPs supported by the instance type. For information about the maximum number of QPs supported by an instance type, see <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a>.</p>
         * <blockquote>
         * <p> If you do not specify QueuePairNumber for an ERI, the maximum number of QPs supported by the instance type may be used as the number of QPs supported by the ERI. In this case, you cannot attach an additional ERI to the instance. However, you can attach other types of ENIs to the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder queuePairNumber(Integer queuePairNumber) {
            this.putQueryParameter("QueuePairNumber", queuePairNumber);
            this.queuePairNumber = queuePairNumber;
            return this;
        }

        /**
         * <p>The region in which to create the ENI. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which you want to assign the ENI. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the most recent resource group list.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
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
         * <p>The receive (Rx) queue depth of the ENI.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>The Rx queue depth of an ENI must be the same as the Tx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
         * <li>A larger Rx queue depth yields higher inbound throughput but consumes more memory.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        public Builder rxQueueSize(Integer rxQueueSize) {
            this.putQueryParameter("RxQueueSize", rxQueueSize);
            this.rxQueueSize = rxQueueSize;
            return this;
        }

        /**
         * <p>The number of private IP addresses to be assigned by ECS. Valid values: 1 to 49.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount);
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        /**
         * <p>The ID of the security group to which to assign the ENI. The security group and the ENI must belong to the same VPC.</p>
         * <blockquote>
         * <p>You must specify <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1fg655nh68xyz9i****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The IDs of security groups to which to assign the ENI. The security groups and the ENI must belong to the same VPC. The valid values of N are determined based on the maximum number of security groups to which an ENI can be assigned. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
         * <blockquote>
         * <p> You must specify <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but not both.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1fg655nh68xyz9i****</p>
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sourceDestCheck(Boolean sourceDestCheck) {
            this.putQueryParameter("SourceDestCheck", sourceDestCheck);
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        /**
         * <p>The tags to add to the ENI.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The transmit (Tx) queue depth of the ENI.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
         * <li>A larger Tx queue depth yields higher outbound throughput but consumes more memory.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        public Builder txQueueSize(Integer txQueueSize) {
            this.putQueryParameter("TxQueueSize", txQueueSize);
            this.txQueueSize = txQueueSize;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which to connect the ENI. Private IP addresses are assigned to the ENI from within the CIDR block of the vSwitch.</p>
         * <blockquote>
         * <p> A secondary ENI can be attached to only an instance that is in the same zone as the ENI. The instance and the ENI can be connected to different vSwitches.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1s5fnvk4gn2tws03****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is no longer used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder visible(Boolean visible) {
            this.putQueryParameter("Visible", visible);
            this.visible = visible;
            return this;
        }

        @Override
        public CreateNetworkInterfaceRequest build() {
            return new CreateNetworkInterfaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkInterfaceRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceRequest</p>
     */
    public static class ConnectionTrackingConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TcpClosedAndTimeWaitTimeout")
        private Integer tcpClosedAndTimeWaitTimeout;

        @com.aliyun.core.annotation.NameInMap("TcpEstablishedTimeout")
        private Integer tcpEstablishedTimeout;

        @com.aliyun.core.annotation.NameInMap("UdpTimeout")
        private Integer udpTimeout;

        private ConnectionTrackingConfiguration(Builder builder) {
            this.tcpClosedAndTimeWaitTimeout = builder.tcpClosedAndTimeWaitTimeout;
            this.tcpEstablishedTimeout = builder.tcpEstablishedTimeout;
            this.udpTimeout = builder.udpTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionTrackingConfiguration create() {
            return builder().build();
        }

        /**
         * @return tcpClosedAndTimeWaitTimeout
         */
        public Integer getTcpClosedAndTimeWaitTimeout() {
            return this.tcpClosedAndTimeWaitTimeout;
        }

        /**
         * @return tcpEstablishedTimeout
         */
        public Integer getTcpEstablishedTimeout() {
            return this.tcpEstablishedTimeout;
        }

        /**
         * @return udpTimeout
         */
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

        public static final class Builder {
            private Integer tcpClosedAndTimeWaitTimeout; 
            private Integer tcpEstablishedTimeout; 
            private Integer udpTimeout; 

            /**
             * <p>The timeout period for TCP connections in the TIME_WAIT or CLOSE_WAIT state. Unit: seconds. Valid values: integers from 3 to 15.</p>
             * <p>Default value: 3.</p>
             * <blockquote>
             * <p> If the associated Elastic Compute Service (ECS) instance is used with a Network Load Balancer (NLB) or Classic Load Balancer (CLB) instance, the default timeout period for TCP connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder tcpClosedAndTimeWaitTimeout(Integer tcpClosedAndTimeWaitTimeout) {
                this.tcpClosedAndTimeWaitTimeout = tcpClosedAndTimeWaitTimeout;
                return this;
            }

            /**
             * <p>The timeout period for TCP connections in the ESTABLISHED state. Unit: seconds. Valid values: 30, 60, 80, 100, 200, 300, 500, 700, and 910.</p>
             * <p>Default value: 910.</p>
             * 
             * <strong>example:</strong>
             * <p>910</p>
             */
            public Builder tcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
                this.tcpEstablishedTimeout = tcpEstablishedTimeout;
                return this;
            }

            /**
             * <p>The timeout period for UDP flows. Unit: seconds. Valid values: 10, 20, 30, 60, 80, and 100.</p>
             * <p>Default value: 30.</p>
             * <blockquote>
             * <p> If the associated ECS instance is used with an NLB or CLB instance, the default timeout period for UDP flows is 100 seconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder udpTimeout(Integer udpTimeout) {
                this.udpTimeout = udpTimeout;
                return this;
            }

            public ConnectionTrackingConfiguration build() {
                return new ConnectionTrackingConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetworkInterfaceRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceRequest</p>
     */
    public static class EnhancedNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableRss")
        private Boolean enableRss;

        @com.aliyun.core.annotation.NameInMap("EnableSriov")
        private Boolean enableSriov;

        private EnhancedNetwork(Builder builder) {
            this.enableRss = builder.enableRss;
            this.enableSriov = builder.enableSriov;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnhancedNetwork create() {
            return builder().build();
        }

        /**
         * @return enableRss
         */
        public Boolean getEnableRss() {
            return this.enableRss;
        }

        /**
         * @return enableSriov
         */
        public Boolean getEnableSriov() {
            return this.enableSriov;
        }

        public static final class Builder {
            private Boolean enableRss; 
            private Boolean enableSriov; 

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableRss(Boolean enableRss) {
                this.enableRss = enableRss;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableSriov(Boolean enableSriov) {
                this.enableSriov = enableSriov;
                return this;
            }

            public EnhancedNetwork build() {
                return new EnhancedNetwork(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetworkInterfaceRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceRequest</p>
     */
    public static class NetworkInterfaceTrafficConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceTrafficMode")
        private String networkInterfaceTrafficMode;

        @com.aliyun.core.annotation.NameInMap("QueueNumber")
        private Integer queueNumber;

        @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
        private Integer queuePairNumber;

        @com.aliyun.core.annotation.NameInMap("RxQueueSize")
        private Integer rxQueueSize;

        @com.aliyun.core.annotation.NameInMap("TxQueueSize")
        private Integer txQueueSize;

        private NetworkInterfaceTrafficConfig(Builder builder) {
            this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
            this.queueNumber = builder.queueNumber;
            this.queuePairNumber = builder.queuePairNumber;
            this.rxQueueSize = builder.rxQueueSize;
            this.txQueueSize = builder.txQueueSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceTrafficConfig create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceTrafficMode
         */
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        /**
         * @return queueNumber
         */
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        /**
         * @return queuePairNumber
         */
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        /**
         * @return rxQueueSize
         */
        public Integer getRxQueueSize() {
            return this.rxQueueSize;
        }

        /**
         * @return txQueueSize
         */
        public Integer getTxQueueSize() {
            return this.txQueueSize;
        }

        public static final class Builder {
            private String networkInterfaceTrafficMode; 
            private Integer queueNumber; 
            private Integer queuePairNumber; 
            private Integer rxQueueSize; 
            private Integer txQueueSize; 

            /**
             * <p>The communication mode of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>HighPerformance</p>
             */
            public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
                this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
                return this;
            }

            /**
             * <p>The number of queues supported by the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder queueNumber(Integer queueNumber) {
                this.queueNumber = queueNumber;
                return this;
            }

            /**
             * <p>The number of QPs supported by the ERI.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder queuePairNumber(Integer queuePairNumber) {
                this.queuePairNumber = queuePairNumber;
                return this;
            }

            /**
             * <p>The Rx queue depth of the ENI.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available. To use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
             * </blockquote>
             * <p>When you specify this parameter, take note of the following items:</p>
             * <ul>
             * <li>This parameter is applicable only to 7th-generation or later ECS instance types.</li>
             * <li>This parameter is applicable to Linux images.</li>
             * <li>A larger Rx queue depth yields higher inbound throughput and reduces packet loss rates but consumes more memory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder rxQueueSize(Integer rxQueueSize) {
                this.rxQueueSize = rxQueueSize;
                return this;
            }

            /**
             * <p>The Tx queue depth of the ENI.</p>
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available. To use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
             * </blockquote>
             * <p>When you specify this parameter, take note of the following items:</p>
             * <ul>
             * <li>This parameter is applicable only to 7th-generation or later ECS instance types.</li>
             * <li>This parameter is applicable to Linux images.</li>
             * <li>A larger Tx queue depth yields higher outbound throughput and reduces packet loss rates but consumes more memory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder txQueueSize(Integer txQueueSize) {
                this.txQueueSize = txQueueSize;
                return this;
            }

            public NetworkInterfaceTrafficConfig build() {
                return new NetworkInterfaceTrafficConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNetworkInterfaceRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkInterfaceRequest</p>
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
             * <p>The key of tag N to add to the ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the ENI. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
