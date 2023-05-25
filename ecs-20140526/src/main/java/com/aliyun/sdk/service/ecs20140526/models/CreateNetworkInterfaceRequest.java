// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkInterfaceRequest</p>
 */
public class CreateNetworkInterfaceRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Ipv4Prefix")
    private java.util.List < String > ipv4Prefix;

    @Query
    @NameInMap("Ipv4PrefixCount")
    @Validation(maximum = 10, minimum = 1)
    private Integer ipv4PrefixCount;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("Ipv6Prefix")
    private java.util.List < String > ipv6Prefix;

    @Query
    @NameInMap("Ipv6PrefixCount")
    @Validation(maximum = 10, minimum = 1)
    private Integer ipv6PrefixCount;

    @Query
    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @Query
    @NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PrimaryIpAddress")
    private String primaryIpAddress;

    @Query
    @NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

    @Query
    @NameInMap("QueueNumber")
    private Integer queueNumber;

    @Query
    @NameInMap("QueuePairNumber")
    private Integer queuePairNumber;

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
    @NameInMap("SecondaryPrivateIpAddressCount")
    private Integer secondaryPrivateIpAddressCount;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("Visible")
    private Boolean visible;

    private CreateNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.businessType = builder.businessType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceType = builder.instanceType;
        this.ipv4Prefix = builder.ipv4Prefix;
        this.ipv4PrefixCount = builder.ipv4PrefixCount;
        this.ipv6Address = builder.ipv6Address;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.ipv6Prefix = builder.ipv6Prefix;
        this.ipv6PrefixCount = builder.ipv6PrefixCount;
        this.networkInterfaceName = builder.networkInterfaceName;
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
        this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupIds = builder.securityGroupIds;
        this.tag = builder.tag;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
    public java.util.List < String > getIpv4Prefix() {
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
    public java.util.List < String > getIpv6Address() {
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
    public java.util.List < String > getIpv6Prefix() {
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
    public java.util.List < String > getPrivateIpAddress() {
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
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
        private String description; 
        private String instanceType; 
        private java.util.List < String > ipv4Prefix; 
        private Integer ipv4PrefixCount; 
        private java.util.List < String > ipv6Address; 
        private Integer ipv6AddressCount; 
        private java.util.List < String > ipv6Prefix; 
        private Integer ipv6PrefixCount; 
        private String networkInterfaceName; 
        private String networkInterfaceTrafficMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String primaryIpAddress; 
        private java.util.List < String > privateIpAddress; 
        private Integer queueNumber; 
        private Integer queuePairNumber; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer secondaryPrivateIpAddressCount; 
        private String securityGroupId; 
        private java.util.List < String > securityGroupIds; 
        private java.util.List < Tag> tag; 
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
            this.description = request.description;
            this.instanceType = request.instanceType;
            this.ipv4Prefix = request.ipv4Prefix;
            this.ipv4PrefixCount = request.ipv4PrefixCount;
            this.ipv6Address = request.ipv6Address;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.ipv6Prefix = request.ipv6Prefix;
            this.ipv6PrefixCount = request.ipv6PrefixCount;
            this.networkInterfaceName = request.networkInterfaceName;
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
            this.secondaryPrivateIpAddressCount = request.secondaryPrivateIpAddressCount;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupIds = request.securityGroupIds;
            this.tag = request.tag;
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
         * > This parameter is no longer used.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique across requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the ENI. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * > This parameter is no longer used.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable for general users.
         */
        public Builder ipv4Prefix(java.util.List < String > ipv4Prefix) {
            this.putQueryParameter("Ipv4Prefix", ipv4Prefix);
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable to general users.
         */
        public Builder ipv4PrefixCount(Integer ipv4PrefixCount) {
            this.putQueryParameter("Ipv4PrefixCount", ipv4PrefixCount);
            this.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }

        /**
         * The IPv6 addresses to assign to the ENI. You can specify up to 10 IPv6 addresses. Valid values of N: 1 to 10.
         * <p>
         * 
         * Example: Ipv6Address.1=2001:db8:1234:1a00::\*\*\*\*
         * 
         * > To assign IPv6 addresses to the ENI, you must specify `Ipv6Addresses.N` or `Ipv6AddressCount` but not both.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * The number of IPv6 addresses to generate at random for the ENI. Valid values: 1 to 10.
         * <p>
         * 
         * > To assign IPv6 addresses to the ENI, you must specify `Ipv6Addresses.N` or `Ipv6AddressCount` but not both.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable for general users.
         */
        public Builder ipv6Prefix(java.util.List < String > ipv6Prefix) {
            this.putQueryParameter("Ipv6Prefix", ipv6Prefix);
            this.ipv6Prefix = ipv6Prefix;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable to general users.
         */
        public Builder ipv6PrefixCount(Integer ipv6PrefixCount) {
            this.putQueryParameter("Ipv6PrefixCount", ipv6PrefixCount);
            this.ipv6PrefixCount = ipv6PrefixCount;
            return this;
        }

        /**
         * The name of the ENI. The name must be 2 to 128 characters in length, It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (.), underscores (\_), and hyphens (-).
         * <p>
         * 
         * This parameter is empty by default.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * The communication mode of the ENI. Valid values:
         * <p>
         * 
         * *   Standard: The TCP communication mode is used.
         * *   HighPerformance: Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.
         * 
         * > HighPerformance supports only the c7re RDMA-enhanced instance family. The maximum number of ENIs in the RDMA mode that can be attached to a c7re instance is determined by the instance type. The c7re instance family is in invitational preview in Beijing Zone K. For more information, see [Instance families](~~25378~~).
         * 
         * Default value: Standard.
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
         * The primary private IP address to assign to the ENI.
         * <p>
         * 
         * The specified IP address must be an idle IP address within the CIDR block of the vSwitch with which to associate the ENI. If this parameter is not specified, an idle IP address is randomly assigned from within the CIDR block of the vSwitch.
         */
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.putQueryParameter("PrimaryIpAddress", primaryIpAddress);
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }

        /**
         * Secondary private IP address N to assign to the ENI. The IP address must be an idle IP address within the CIDR block of the vSwitch with which to associate the ENI. Valid values of N: 0 to 10.
         * <p>
         * 
         * > To assign secondary private IP addresses to the ENI, you cannot specify both the `PrivateIpAddress.N` and `SecondaryPrivateIpAddressCount` parameters.
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The number of queues supported by the ENI. Valid values: 1 to 2048.
         * <p>
         * 
         * When you attach the ENI to an instance, make sure that the value of this parameter is smaller than the maximum number of queues per ENI allowed for the instance type. To view the maximum number of queues per ENI allowed for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and then check the `MaximumQueueNumberPerEni` response parameter.
         * 
         * This parameter is empty by default. If this parameter is not specified when you attach the ENI to an instance, the default number of queues per ENI for the instance type of this instance is used. To view the default number of queues per ENI for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and then check the `SecondaryEniQueueNumber` response parameter.
         */
        public Builder queueNumber(Integer queueNumber) {
            this.putQueryParameter("QueueNumber", queueNumber);
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * > This parameter is in invitational preview and is unavailable to general users.
         */
        public Builder queuePairNumber(Integer queuePairNumber) {
            this.putQueryParameter("QueuePairNumber", queuePairNumber);
            this.queuePairNumber = queuePairNumber;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the ENI. You can call the [ListResourceGroups](~~158855~~) operation to query the most recent resource group list.
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
         * The number of private IP addresses to be automatically created by ECS.
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount);
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        /**
         * The ID of the security group to which to assign the ENI. The security group and the ENI must belong to the same VPC.
         * <p>
         * 
         * > You must specify `SecurityGroupId` or `SecurityGroupIds.N` but not both.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The IDs of security groups to which to assign the ENI. The security group and the ENI must belong to the same VPC. The valid values of N are determined by the maximum number of security groups to which an ENI can be assigned. For more information, see [Limits](~~25412~~).
         * <p>
         * 
         * > You must specify `SecurityGroupId` or `SecurityGroupIds.N` but not both.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The tags to add to the ENI.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the vSwitch with which to associate the ENI. Private IP addresses are assigned to the ENI from within the CIDR block of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * > This parameter is no longer used.
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
             * The key of tag N to add to the ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the ENI. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`.
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
