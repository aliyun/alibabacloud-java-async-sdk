// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfacesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkInterfacesRequest</p>
 */
public class DescribeNetworkInterfacesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NetworkInterfaceId")
    private java.util.List < String > networkInterfaceId;

    @Query
    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    @Deprecated
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Deprecated
    private Integer pageSize;

    @Query
    @NameInMap("PrimaryIpAddress")
    private String primaryIpAddress;

    @Query
    @NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

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
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private DescribeNetworkInterfacesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.instanceId = builder.instanceId;
        this.ipv6Address = builder.ipv6Address;
        this.maxResults = builder.maxResults;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.primaryIpAddress = builder.primaryIpAddress;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.serviceManaged = builder.serviceManaged;
        this.status = builder.status;
        this.tag = builder.tag;
        this.type = builder.type;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfacesRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipv6Address
     */
    public java.util.List < String > getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkInterfaceId
     */
    public java.util.List < String > getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInterfacesRequest, Builder> {
        private String sourceRegionId; 
        private String instanceId; 
        private java.util.List < String > ipv6Address; 
        private Integer maxResults; 
        private java.util.List < String > networkInterfaceId; 
        private String networkInterfaceName; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String primaryIpAddress; 
        private java.util.List < String > privateIpAddress; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private Boolean serviceManaged; 
        private String status; 
        private java.util.List < Tag> tag; 
        private String type; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInterfacesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.instanceId = request.instanceId;
            this.ipv6Address = request.ipv6Address;
            this.maxResults = request.maxResults;
            this.networkInterfaceId = request.networkInterfaceId;
            this.networkInterfaceName = request.networkInterfaceName;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.primaryIpAddress = request.primaryIpAddress;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.serviceManaged = request.serviceManaged;
            this.status = request.status;
            this.tag = request.tag;
            this.type = request.type;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
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
         * The ID of the instance to which the ENI is attached.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * An array that consists of the IPv6 address of the ENI. You can specify multiple IPv6 addresses. Valid values of N: 1 to 100.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * The maximum number of entries to return on each page. Valid values: 10 to 500.
         * <p>
         * 
         * Default values:
         * 
         * *   If this parameter is not specified or if this parameter is set to a value less than 10, the default value is 10.
         * *   If this parameter is set to a value greater than 500, the default value is 500.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * An array that consists of the IDs of the ENIs. You specify multiple ENI IDs. Valid values of N: 1 to 100.
         */
        public Builder networkInterfaceId(java.util.List < String > networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The name of the ENI.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * The query token. Set the value to the `NextToken` value returned in the last call to this operation.
         * <p>
         * 
         * For more information about how to check the responses returned by this operation, see the preceding "Description" section.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * >This parameter is no longer used. We recommend that you specify the MaxResults or NextToken parameter for a paged query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * >This parameter is no longer used. We recommend that you specify the MaxResults or NextToken parameter for a paged query.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The primary private IPv4 address of the ENI.
         */
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.putQueryParameter("PrimaryIpAddress", primaryIpAddress);
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }

        /**
         * An array that consists of the secondary private IPv4 addresses of the ENI. You can specify multiple secondary private IPv4 addresses. Valid values of N: 1 to 100.
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The region ID of the ENI. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the ENI belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be returned.
         * <p>
         * 
         * > Resources in the default resource group are displayed in the response regardless of how this parameter is set.
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
         * The ID of the security group to which the secondary ENI belongs.
         * <p>
         * 
         * *   To query the details of secondary ENIs based on the ID of a security group, specify this parameter.
         * *   To query the details of primary ENIs based on the ID of a security group, call the [DescribeInstances](~~25506~~) operation and specify the `SecurityGroupId` parameter.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * Specifies whether the user of the ENI is an Alibaba Cloud service or a distributor.
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.putQueryParameter("ServiceManaged", serviceManaged);
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * The state of the ENI. Valid values:
         * <p>
         * 
         * *   Available: The ENI is available.
         * *   Attaching: The ENI is being attached to an instance.
         * *   InUse: The ENI is attached to an instance.
         * *   Detaching: The ENI is being detached from an instance.
         * *   Deleting: The ENI is being deleted.
         * 
         * This parameter is empty by default, which indicates that ENIs in all states are queried.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tags to use for query.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of the ENI. Valid values:
         * <p>
         * 
         * *   Primary
         * *   Secondary
         * 
         * This parameter is empty by default, which indicates that both primary and secondary ENIs are queried.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The ID of the vSwitch with which the ENI is associated.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the ENI belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeNetworkInterfacesRequest build() {
            return new DescribeNetworkInterfacesRequest(this);
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
             * The key of tag N of the ENI. Valid values of N: 1 to 20.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N of the ENI. Valid values of N: 1 to 20.
             * <p>
             * 
             * If a single tag is specified to query ENIs, up to 1,000 ENIs that have this tag can be returned. If multiple tags are specified to query ENIs, up to 1,000 ENIs that have all these tags can be returned. To query more than 1,000 resources that have specified tags, call the [ListTagResources](~~110425~~) operation.
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
