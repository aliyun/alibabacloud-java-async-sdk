// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesRequest</p>
 */
public class DescribeInstancesRequest extends Request {
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DeviceAvailable")
    private Boolean deviceAvailable;

    @Query
    @NameInMap("NeedSaleCycle")
    private Boolean needSaleCycle;

    @Query
    @NameInMap("HttpPutResponseHopLimit")
    private Integer httpPutResponseHopLimit;

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
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("EipAddresses")
    private String eipAddresses;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("RdmaIpAddresses")
    private String rdmaIpAddresses;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("IoOptimized")
    private Boolean ioOptimized;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("PublicIpAddresses")
    private String publicIpAddresses;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("HttpEndpoint")
    private String httpEndpoint;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("LockReason")
    private String lockReason;

    @Query
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("HttpTokens")
    private String httpTokens;

    @Query
    @NameInMap("AdditionalAttributes")
    private java.util.List < String > additionalAttributes;

    @Query
    @NameInMap("InnerIpAddresses")
    private String innerIpAddresses;

    @Query
    @NameInMap("PrivateIpAddresses")
    private String privateIpAddresses;

    private DescribeInstancesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.sourceRegionId = builder.sourceRegionId;
        this.deviceAvailable = builder.deviceAvailable;
        this.needSaleCycle = builder.needSaleCycle;
        this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
        this.ipv6Address = builder.ipv6Address;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
        this.vSwitchId = builder.vSwitchId;
        this.instanceIds = builder.instanceIds;
        this.pageSize = builder.pageSize;
        this.eipAddresses = builder.eipAddresses;
        this.imageId = builder.imageId;
        this.rdmaIpAddresses = builder.rdmaIpAddresses;
        this.keyPairName = builder.keyPairName;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.ioOptimized = builder.ioOptimized;
        this.instanceType = builder.instanceType;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.zoneId = builder.zoneId;
        this.publicIpAddresses = builder.publicIpAddresses;
        this.dryRun = builder.dryRun;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.httpEndpoint = builder.httpEndpoint;
        this.instanceChargeType = builder.instanceChargeType;
        this.status = builder.status;
        this.pageNumber = builder.pageNumber;
        this.securityGroupId = builder.securityGroupId;
        this.internetChargeType = builder.internetChargeType;
        this.lockReason = builder.lockReason;
        this.hpcClusterId = builder.hpcClusterId;
        this.instanceName = builder.instanceName;
        this.maxResults = builder.maxResults;
        this.httpTokens = builder.httpTokens;
        this.additionalAttributes = builder.additionalAttributes;
        this.innerIpAddresses = builder.innerIpAddresses;
        this.privateIpAddresses = builder.privateIpAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return deviceAvailable
     */
    public Boolean getDeviceAvailable() {
        return this.deviceAvailable;
    }

    /**
     * @return needSaleCycle
     */
    public Boolean getNeedSaleCycle() {
        return this.needSaleCycle;
    }

    /**
     * @return httpPutResponseHopLimit
     */
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return eipAddresses
     */
    public String getEipAddresses() {
        return this.eipAddresses;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return rdmaIpAddresses
     */
    public String getRdmaIpAddresses() {
        return this.rdmaIpAddresses;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ioOptimized
     */
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return publicIpAddresses
     */
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return httpEndpoint
     */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return httpTokens
     */
    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * @return additionalAttributes
     */
    public java.util.List < String > getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    /**
     * @return innerIpAddresses
     */
    public String getInnerIpAddresses() {
        return this.innerIpAddresses;
    }

    /**
     * @return privateIpAddresses
     */
    public String getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private java.util.List < Filter> filter; 
        private String sourceRegionId; 
        private Boolean deviceAvailable; 
        private Boolean needSaleCycle; 
        private Integer httpPutResponseHopLimit; 
        private java.util.List < String > ipv6Address; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String vpcId; 
        private String vSwitchId; 
        private String instanceIds; 
        private Integer pageSize; 
        private String eipAddresses; 
        private String imageId; 
        private String rdmaIpAddresses; 
        private String keyPairName; 
        private String nextToken; 
        private String resourceGroupId; 
        private Boolean ioOptimized; 
        private String instanceType; 
        private String instanceNetworkType; 
        private String zoneId; 
        private String publicIpAddresses; 
        private Boolean dryRun; 
        private String instanceTypeFamily; 
        private String httpEndpoint; 
        private String instanceChargeType; 
        private String status; 
        private Integer pageNumber; 
        private String securityGroupId; 
        private String internetChargeType; 
        private String lockReason; 
        private String hpcClusterId; 
        private String instanceName; 
        private Integer maxResults; 
        private String httpTokens; 
        private java.util.List < String > additionalAttributes; 
        private String innerIpAddresses; 
        private String privateIpAddresses; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest response) {
            super(response);
            this.filter = response.filter;
            this.sourceRegionId = response.sourceRegionId;
            this.deviceAvailable = response.deviceAvailable;
            this.needSaleCycle = response.needSaleCycle;
            this.httpPutResponseHopLimit = response.httpPutResponseHopLimit;
            this.ipv6Address = response.ipv6Address;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.vpcId = response.vpcId;
            this.vSwitchId = response.vSwitchId;
            this.instanceIds = response.instanceIds;
            this.pageSize = response.pageSize;
            this.eipAddresses = response.eipAddresses;
            this.imageId = response.imageId;
            this.rdmaIpAddresses = response.rdmaIpAddresses;
            this.keyPairName = response.keyPairName;
            this.nextToken = response.nextToken;
            this.resourceGroupId = response.resourceGroupId;
            this.ioOptimized = response.ioOptimized;
            this.instanceType = response.instanceType;
            this.instanceNetworkType = response.instanceNetworkType;
            this.zoneId = response.zoneId;
            this.publicIpAddresses = response.publicIpAddresses;
            this.dryRun = response.dryRun;
            this.instanceTypeFamily = response.instanceTypeFamily;
            this.httpEndpoint = response.httpEndpoint;
            this.instanceChargeType = response.instanceChargeType;
            this.status = response.status;
            this.pageNumber = response.pageNumber;
            this.securityGroupId = response.securityGroupId;
            this.internetChargeType = response.internetChargeType;
            this.lockReason = response.lockReason;
            this.hpcClusterId = response.hpcClusterId;
            this.instanceName = response.instanceName;
            this.maxResults = response.maxResults;
            this.httpTokens = response.httpTokens;
            this.additionalAttributes = response.additionalAttributes;
            this.innerIpAddresses = response.innerIpAddresses;
            this.privateIpAddresses = response.privateIpAddresses;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.filter = filter;
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
         * DeviceAvailable.
         */
        public Builder deviceAvailable(Boolean deviceAvailable) {
            this.putQueryParameter("DeviceAvailable", deviceAvailable);
            this.deviceAvailable = deviceAvailable;
            return this;
        }

        /**
         * NeedSaleCycle.
         */
        public Builder needSaleCycle(Boolean needSaleCycle) {
            this.putQueryParameter("NeedSaleCycle", needSaleCycle);
            this.needSaleCycle = needSaleCycle;
            return this;
        }

        /**
         * HttpPutResponseHopLimit.
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit);
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * Ipv6Address.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
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
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VPC VPC ID.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the instance. The value can be a JSON Array consisting of multiple instance IDs. A maximum of 100 IDs can be entered. Separate IDs with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 100.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The list of elastic IP addresses of the instance. This parameter takes effect when InstanceNetworkType is set to vpc. The value can be a JSON Array consisting of multiple IP addresses. A maximum of 100 IP addresses can be entered. Separate IP addresses with commas (,).
         */
        public Builder eipAddresses(String eipAddresses) {
            this.putQueryParameter("EipAddresses", eipAddresses);
            this.eipAddresses = eipAddresses;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The Rdma IP address of the HPC instance.
         */
        public Builder rdmaIpAddresses(String rdmaIpAddresses) {
            this.putQueryParameter("RdmaIpAddresses", rdmaIpAddresses);
            this.rdmaIpAddresses = rdmaIpAddresses;
            return this;
        }

        /**
         * The name of the SSH key pair used by the instance.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The Token returned by the last API call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Indicates whether the instance is an I/O optimized instance.
         */
        public Builder ioOptimized(Boolean ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * The instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * -classic: classic network.
         * -vpc: VPC.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The list of public IP addresses of the instance. The value can be a JSON Array consisting of multiple IP addresses. A maximum of 100 IP addresses can be entered. Separate IP addresses with commas (,).
         */
        public Builder publicIpAddresses(String publicIpAddresses) {
            this.putQueryParameter("PublicIpAddresses", publicIpAddresses);
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request without querying the resource status. Check whether the AccessKey is valid, whether the RAM user is authorized, and whether required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, an error code DryRunOperation is returned.
         * -false (default): a normal request is sent. After the request passes the check, the 2XX HTTP status code is returned and the resource status is directly queried.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The instance type family.
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * Specifies whether to enable the access channel for instance metadata. Valid values:
         * <p>
         * -enabled: enabled.
         * -disabled: disabled.
         * 
         * The default value is enabled.
         * > For more information about instance metadata, see [instance metadata Overview](~~ 49122 ~~).
         */
        public Builder httpEndpoint(String httpEndpoint) {
            this.putQueryParameter("HttpEndpoint", httpEndpoint);
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * -PostPaid: pay-as-you-go.
         * -PrePaid: subscription.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The status of the instance. Valid values:
         * <p>
         * 
         * -Pending: creating.
         * -Running: Running.
         * -Starting: Starting.
         * -Stopping: stopped.
         * -Stopped: Stopped.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The page number of the instance status list.
         * <p>
         * 
         * The start value is 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The security group to which the instance belongs.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The billing method of the Internet bandwidth. Valid values:
         * <p>
         * 
         * -PayByBandwidth: pay-by-bandwidth.
         * -PayByTraffic: pay by traffic.
         * 
         * > **pay-by-traffic** mode: The peak inbound and outbound bandwidth is the upper limit of the bandwidth and is not used as a service commitment indicator. When a resource scramble occurs, the peak bandwidth may be limited. If your business needs to be guaranteed by bandwidth, use the **pay-by-bandwidth** mode.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The reason why the resource is locked.
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
            return this;
        }

        /**
         * The ID of the HPC cluster to which the instance belongs.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * The name of the instance. You can use the wildcard * to perform fuzzy search.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum Value: 100.
         * <p>
         * 
         * Default value:
         * 
         * -If the value is not set or the value is less than 10, the default value is 10.
         * -When the value set is greater than 100, the default value is 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Access instance metadata whether to enforce the reinforced mode (IMDSv2). Valid values:
         * <p>
         * -optional: not mandatory.
         * -required: force use. Set the value rear, normal mode cannot access instance metadata.
         * 
         * The default value is optional.
         * > about access instance metadata pattern more information, please see [instance metadata access mode](~~ 150575 ~~).
         */
        public Builder httpTokens(String httpTokens) {
            this.putQueryParameter("HttpTokens", httpTokens);
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * Other property values. N value range is 1~20. Valid values:
         * <p>
         * 
         * -META_OPTIONS: instance metadata.
         * -DDH_CLUSTER: proprietary host cluster.
         * -NETWORK_PRIMARY_ENI_IP: the secondary IP address of the primary Eni.
         */
        public Builder additionalAttributes(java.util.List < String > additionalAttributes) {
            this.putQueryParameter("AdditionalAttributes", additionalAttributes);
            this.additionalAttributes = additionalAttributes;
            return this;
        }

        /**
         * Classic network instances of the type internal network IP list. When InstanceNetworkType = classic effect when, values can be by multiple IP composition a JSON Array supports up to 100 IP,IP between separate them with commas (,).
         */
        public Builder innerIpAddresses(String innerIpAddresses) {
            this.putQueryParameter("InnerIpAddresses", innerIpAddresses);
            this.innerIpAddresses = innerIpAddresses;
            return this;
        }

        /**
         * VPC network type instance private IP. When InstanceNetworkType = vpc effect when, values can be by multiple IP composition a JSON Array supports up to 100 IP,IP between separate them with commas (,).
         */
        public Builder privateIpAddresses(String privateIpAddresses) {
            this.putQueryParameter("PrivateIpAddresses", privateIpAddresses);
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }

        @Override
        public DescribeInstancesRequest build() {
            return new DescribeInstancesRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Filter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
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
             * The filter key used to query resources. The value must be "CreationStartTime ". Set "Filter.1.Key" and "Filter.1.Value" to query resource information created after a specified time point.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The filter value when you query resources. When you specify this parameter, you must specify the "Filter.1.Key" parameter in the format of "yyyy-MM-ddTHH:mmZ", in UTC +0 time zone.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("key")
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
             * 标签键。
             * <p>
             * 
             * > 为提高兼容性，建议您使用另一个`Tag.N.Key`参数。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 实例的标签值。N的取值范围为1~20。
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
