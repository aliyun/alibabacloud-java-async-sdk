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
    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("Visible")
    private Boolean visible;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("QueuePairNumber")
    private Integer queuePairNumber;

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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecondaryPrivateIpAddressCount")
    private Integer secondaryPrivateIpAddressCount;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Ipv6AddressCount")
    private Integer ipv6AddressCount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("QueueNumber")
    private Integer queueNumber;

    @Query
    @NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

    @Query
    @NameInMap("NetworkInterfaceTrafficMode")
    private String networkInterfaceTrafficMode;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("PrimaryIpAddress")
    private String primaryIpAddress;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    private CreateNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.tag = builder.tag;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.visible = builder.visible;
        this.instanceType = builder.instanceType;
        this.businessType = builder.businessType;
        this.queuePairNumber = builder.queuePairNumber;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.description = builder.description;
        this.secondaryPrivateIpAddressCount = builder.secondaryPrivateIpAddressCount;
        this.clientToken = builder.clientToken;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.regionId = builder.regionId;
        this.queueNumber = builder.queueNumber;
        this.privateIpAddress = builder.privateIpAddress;
        this.networkInterfaceTrafficMode = builder.networkInterfaceTrafficMode;
        this.securityGroupId = builder.securityGroupId;
        this.primaryIpAddress = builder.primaryIpAddress;
        this.ipv6Address = builder.ipv6Address;
        this.securityGroupIds = builder.securityGroupIds;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return visible
     */
    public Boolean getVisible() {
        return this.visible;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return queuePairNumber
     */
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return secondaryPrivateIpAddressCount
     */
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipv6AddressCount
     */
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return queueNumber
     */
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    /**
     * @return privateIpAddress
     */
    public java.util.List < String > getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return networkInterfaceTrafficMode
     */
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return primaryIpAddress
     */
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    /**
     * @return ipv6Address
     */
    public java.util.List < String > getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static final class Builder extends Request.Builder<CreateNetworkInterfaceRequest, Builder> {
        private java.util.List < Tag> tag; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private Boolean visible; 
        private String instanceType; 
        private String businessType; 
        private Integer queuePairNumber; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceGroupId; 
        private String vSwitchId; 
        private String networkInterfaceName; 
        private String description; 
        private Integer secondaryPrivateIpAddressCount; 
        private String clientToken; 
        private Integer ipv6AddressCount; 
        private String regionId; 
        private Integer queueNumber; 
        private java.util.List < String > privateIpAddress; 
        private String networkInterfaceTrafficMode; 
        private String securityGroupId; 
        private String primaryIpAddress; 
        private java.util.List < String > ipv6Address; 
        private java.util.List < String > securityGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkInterfaceRequest request) {
            super(request);
            this.tag = request.tag;
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.visible = request.visible;
            this.instanceType = request.instanceType;
            this.businessType = request.businessType;
            this.queuePairNumber = request.queuePairNumber;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceGroupId = request.resourceGroupId;
            this.vSwitchId = request.vSwitchId;
            this.networkInterfaceName = request.networkInterfaceName;
            this.description = request.description;
            this.secondaryPrivateIpAddressCount = request.secondaryPrivateIpAddressCount;
            this.clientToken = request.clientToken;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.regionId = request.regionId;
            this.queueNumber = request.queueNumber;
            this.privateIpAddress = request.privateIpAddress;
            this.networkInterfaceTrafficMode = request.networkInterfaceTrafficMode;
            this.securityGroupId = request.securityGroupId;
            this.primaryIpAddress = request.primaryIpAddress;
            this.ipv6Address = request.ipv6Address;
            this.securityGroupIds = request.securityGroupIds;
        } 

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * Visible.
         */
        public Builder visible(Boolean visible) {
            this.putQueryParameter("Visible", visible);
            this.visible = visible;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * QueuePairNumber.
         */
        public Builder queuePairNumber(Integer queuePairNumber) {
            this.putQueryParameter("QueuePairNumber", queuePairNumber);
            this.queuePairNumber = queuePairNumber;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the resource group. You can call [ListResourceGroups](~~ 158855 ~~) to query resource group information.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the vSwitch. The private IP address of the Eni is an idle IP address in the CIDR block of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The name of the Eni. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         * <p>
         * 
         * Default value: Null.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * The description of the Eni. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specify the number of private IP addresses to allow ECS to automatically create IP addresses for you.
         */
        public Builder secondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount);
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specify the number of randomly generated IPv6 addresses for the Eni. Valid values: 1 to 10.
         * <p>
         * 
         * > If you want to set an IPv6 address for an Eni, you must set either of "Ipv6Addresses.... or "Ipv6AddressCount", but you cannot set both parameters at the same time.
         */
        public Builder ipv6AddressCount(Integer ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * The ID of the region where the instance is located. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of Eni queues. Valid values: 1 to 2048.
         * <p>
         * 
         * When you associate an Eni with an Eni, the value must be less than the maximum number of queues that the instance type supports a single Eni. You can call the [DescribeInstanceTypes](~~ 25620 ~~) operation to query the maximum number of queues for a single NIC.
         * 
         * Default value: Null. The default number of Enis queues of the instance type is used for binding. You can call the [DescribeInstanceTypes](~~ 25620 ~~) operation to query the "secondaryeniqueuenumerber" field.
         * 
         */
        public Builder queueNumber(Integer queueNumber) {
            this.putQueryParameter("QueueNumber", queueNumber);
            this.queueNumber = queueNumber;
            return this;
        }

        /**
         * Select one or more secondary private IP addresses from the idle addresses in the CIDR block of the vSwitch to which the Eni belongs. Valid values of N: 0 to 10.
         * <p>
         * 
         * > when assigning a secondary private IP address, you cannot specify both the "PrivateIpAddress. "and the "SecondaryPrivateIpAddressCount" parameters".
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The communication mode of the Eni. Valid values:
         * <p>
         * 
         * -Standard: TCP communication mode is used.
         * -HighPerformance: enable ERI(Elastic RDMA Interface) Interface and use RDMA communication mode.
         * > currently, you can only set HighPerformance parameter values in the China (Beijing) and China (Guangzhou) regions.
         * 
         * Default value: Standard
         */
        public Builder networkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.putQueryParameter("NetworkInterfaceTrafficMode", networkInterfaceTrafficMode);
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }

        /**
         * Join a security group. The security group and the Eni must be in the same VPC.
         * <p>
         * 
         * > when calling an API, you must set either the "SecurityGroupId" or "SecurityGroupIds.... Parameter. However, you cannot set this parameter at the same time.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The primary private IP address of the Eni.
         * <p>
         * 
         * The specified IP address must be an idle address in the CIDR block of the vSwitch. If you do not specify the IP address, the idle address in the vSwitch is randomly allocated by default.
         */
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.putQueryParameter("PrimaryIpAddress", primaryIpAddress);
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }

        /**
         * Specify one or more IPv6 addresses for the Eni. You can set up to 10 IPv6 addresses. Valid values of N: 1 to 10.
         * <p>
         * 
         * Valid values: Ipv6Address.1=2001:db8:1234:1 a00::****
         * 
         * > If you want to set an IPv6 address for an Eni, you must set either of "Ipv6Addresses.... or "Ipv6AddressCount", but you cannot set both parameters at the same time.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * Join one or more security groups. The security group and the Eni must be in the same VPC. The value range of N depends on the number of security groups that Enis can join. For more information, see [limits](~~ 25412 ~~).
         * <p>
         * 
         * > when calling an api, you must set either the "SecurityGroupId" or "SecurityGroupIds.... parameter. However, you cannot set this parameter at the same time.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
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
             * 弹性网卡的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含`http://`或者`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 弹性网卡的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含`http://`或者`https://`。
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
