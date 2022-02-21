// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PrivateIpAddress")
    private java.util.List < String > privateIpAddress;

    @Query
    @NameInMap("NetworkInterfaceId")
    private java.util.List < String > networkInterfaceId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("NetworkInterfaceName")
    private String networkInterfaceName;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PrimaryIpAddress")
    private String primaryIpAddress;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    private DescribeNetworkInterfacesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.pageSize = builder.pageSize;
        this.privateIpAddress = builder.privateIpAddress;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.vSwitchId = builder.vSwitchId;
        this.ipv6Address = builder.ipv6Address;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.networkInterfaceName = builder.networkInterfaceName;
        this.vpcId = builder.vpcId;
        this.serviceManaged = builder.serviceManaged;
        this.nextToken = builder.nextToken;
        this.instanceId = builder.instanceId;
        this.primaryIpAddress = builder.primaryIpAddress;
        this.status = builder.status;
        this.pageNumber = builder.pageNumber;
        this.type = builder.type;
        this.maxResults = builder.maxResults;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return privateIpAddress
     */
    public java.util.List < String > getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return networkInterfaceId
     */
    public java.util.List < String > getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return ipv6Address
     */
    public java.util.List < String > getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return networkInterfaceName
     */
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return primaryIpAddress
     */
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkInterfacesRequest, Builder> {
        private String sourceRegionId; 
        private String resourceGroupId; 
        private Integer pageSize; 
        private java.util.List < String > privateIpAddress; 
        private java.util.List < String > networkInterfaceId; 
        private String vSwitchId; 
        private java.util.List < String > ipv6Address; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String securityGroupId; 
        private String networkInterfaceName; 
        private String vpcId; 
        private Boolean serviceManaged; 
        private String nextToken; 
        private String instanceId; 
        private String primaryIpAddress; 
        private String status; 
        private Integer pageNumber; 
        private String type; 
        private Integer maxResults; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkInterfacesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceGroupId = response.resourceGroupId;
            this.pageSize = response.pageSize;
            this.privateIpAddress = response.privateIpAddress;
            this.networkInterfaceId = response.networkInterfaceId;
            this.vSwitchId = response.vSwitchId;
            this.ipv6Address = response.ipv6Address;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.securityGroupId = response.securityGroupId;
            this.networkInterfaceName = response.networkInterfaceName;
            this.vpcId = response.vpcId;
            this.serviceManaged = response.serviceManaged;
            this.nextToken = response.nextToken;
            this.instanceId = response.instanceId;
            this.primaryIpAddress = response.primaryIpAddress;
            this.status = response.status;
            this.pageNumber = response.pageNumber;
            this.type = response.type;
            this.maxResults = response.maxResults;
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
         * The ID of the resource group. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 1000.
         * 
         * Default value: 10.
         * 
         * > This parameter is about to be offline. We recommend that you use the NextToken and MaxResults to complete the paging query.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The secondary private IPv4 address of the Eni. Valid values of N: 1 to 100.
         */
        public Builder privateIpAddress(java.util.List < String > privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The ID of the Eni. Valid values of N: 1 to 100.
         */
        public Builder networkInterfaceId(java.util.List < String > networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The ID of the vSwitch to which the Eni belongs.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The IPv6 address of the Eni. N indicates that multiple IPv6 addresses can be set. Valid values of N: 1 to 100.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The region ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the security group to which the secondary Eni belongs.
         * <p>
         * 
         * -If you want to query the information of the secondary Eni by using the security group ID, specify this parameter.
         * -To query the primary Eni information by using the security group ID, call [DescribeInstances](~~ 25506 ~~) to specify the "SecurityGroupId" parameter.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The name of the Eni.
         */
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.putQueryParameter("NetworkInterfaceName", networkInterfaceName);
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        /**
         * The VPC ID of the VPC to which the Eni belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * Whether the user of the Eni is a cloud product or a virtual merchant.
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.putQueryParameter("ServiceManaged", serviceManaged);
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * The Token returned by the last API call.
         * <p>
         * 
         * For more information about how to view the returned data, see the preceding API description.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the instance associated with the Eni.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Elastic network card main private network IPv4 address.
         */
        public Builder primaryIpAddress(String primaryIpAddress) {
            this.putQueryParameter("PrimaryIpAddress", primaryIpAddress);
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }

        /**
         * The status of the Eni. Valid values:
         * <p>
         * 
         * * Available: Available.
         * * Attaching: in the binding.
         * * InUse: are bound.
         * * Detaching: unbundling.
         * * Deleting: delete.
         * 
         * Default: empty, represents the query all state.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The page number of the query result.
         * <p>
         * 
         * Value from: 1.
         * 
         * Default value: 1.
         * 
         * > This parameter is about to be offline. We recommend that you use the NextToken and MaxResults to complete the paging query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The type of the Eni. Valid values:
         * <p>
         * 
         * -Primary: The Primary Eni.
         * -Secondary: Secondary network card.
         * 
         * Default: empty, said query all types.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The maximum number of entries to return on each page. Value range: 10~500.
         * <p>
         * 
         * Default value:
         * 
         * -When not set value or the value set is less than 10 when the default is 10.
         * -When the value set is greater than 500, the default value is 500.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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
             * 弹性网卡的标签键。N的取值范围：1~20
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 弹性网卡的标签值。N的取值范围：1~20
             * <p>
             * 
             * 使用一个标签过滤资源，查询到该标签下的资源数量不能超过1000个；使用多个标签过滤资源，查询到同时绑定了多个标签的资源数量不能超过1000个。如果资源数量超过1000个，请使用[ListTagResources](~~110425~~)接口进行查询。
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
