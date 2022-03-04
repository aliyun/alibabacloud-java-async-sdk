// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Query
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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PublicIpAddresses")
    private String publicIpAddresses;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("LockReason")
    private String lockReason;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("Ipv6Address")
    private java.util.List < String > ipv6Address;

    @Query
    @NameInMap("HttpTokens")
    private String httpTokens;

    @Query
    @NameInMap("AdditionalAttributes")
    private java.util.List < String > additionalAttributes;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("HttpEndpoint")
    private String httpEndpoint;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("InnerIpAddresses")
    private String innerIpAddresses;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("PrivateIpAddresses")
    private String privateIpAddresses;

    @Query
    @NameInMap("EipAddresses")
    private String eipAddresses;

    @Query
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @Query
    @NameInMap("IoOptimized")
    private Boolean ioOptimized;

    @Query
    @NameInMap("RdmaIpAddresses")
    private String rdmaIpAddresses;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    private DescribeInstancesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.sourceRegionId = builder.sourceRegionId;
        this.deviceAvailable = builder.deviceAvailable;
        this.needSaleCycle = builder.needSaleCycle;
        this.httpPutResponseHopLimit = builder.httpPutResponseHopLimit;
        this.regionId = builder.regionId;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.pageNumber = builder.pageNumber;
        this.nextToken = builder.nextToken;
        this.publicIpAddresses = builder.publicIpAddresses;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.imageId = builder.imageId;
        this.status = builder.status;
        this.lockReason = builder.lockReason;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.ipv6Address = builder.ipv6Address;
        this.httpTokens = builder.httpTokens;
        this.additionalAttributes = builder.additionalAttributes;
        this.tag = builder.tag;
        this.resourceGroupId = builder.resourceGroupId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
        this.httpEndpoint = builder.httpEndpoint;
        this.pageSize = builder.pageSize;
        this.vSwitchId = builder.vSwitchId;
        this.keyPairName = builder.keyPairName;
        this.instanceType = builder.instanceType;
        this.instanceIds = builder.instanceIds;
        this.innerIpAddresses = builder.innerIpAddresses;
        this.securityGroupId = builder.securityGroupId;
        this.dryRun = builder.dryRun;
        this.maxResults = builder.maxResults;
        this.privateIpAddresses = builder.privateIpAddresses;
        this.eipAddresses = builder.eipAddresses;
        this.hpcClusterId = builder.hpcClusterId;
        this.ioOptimized = builder.ioOptimized;
        this.rdmaIpAddresses = builder.rdmaIpAddresses;
        this.instanceName = builder.instanceName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return publicIpAddresses
     */
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return ipv6Address
     */
    public java.util.List < String > getIpv6Address() {
        return this.ipv6Address;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return httpEndpoint
     */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return innerIpAddresses
     */
    public String getInnerIpAddresses() {
        return this.innerIpAddresses;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return privateIpAddresses
     */
    public String getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    /**
     * @return eipAddresses
     */
    public String getEipAddresses() {
        return this.eipAddresses;
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return ioOptimized
     */
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    /**
     * @return rdmaIpAddresses
     */
    public String getRdmaIpAddresses() {
        return this.rdmaIpAddresses;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private java.util.List < Filter> filter; 
        private String sourceRegionId; 
        private Boolean deviceAvailable; 
        private Boolean needSaleCycle; 
        private Integer httpPutResponseHopLimit; 
        private String regionId; 
        private String instanceNetworkType; 
        private Integer pageNumber; 
        private String nextToken; 
        private String publicIpAddresses; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String imageId; 
        private String status; 
        private String lockReason; 
        private String instanceTypeFamily; 
        private java.util.List < String > ipv6Address; 
        private String httpTokens; 
        private java.util.List < String > additionalAttributes; 
        private java.util.List < Tag> tag; 
        private String resourceGroupId; 
        private String vpcId; 
        private String zoneId; 
        private String httpEndpoint; 
        private Integer pageSize; 
        private String vSwitchId; 
        private String keyPairName; 
        private String instanceType; 
        private String instanceIds; 
        private String innerIpAddresses; 
        private String securityGroupId; 
        private Boolean dryRun; 
        private Integer maxResults; 
        private String privateIpAddresses; 
        private String eipAddresses; 
        private String hpcClusterId; 
        private Boolean ioOptimized; 
        private String rdmaIpAddresses; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest request) {
            super(request);
            this.filter = request.filter;
            this.sourceRegionId = request.sourceRegionId;
            this.deviceAvailable = request.deviceAvailable;
            this.needSaleCycle = request.needSaleCycle;
            this.httpPutResponseHopLimit = request.httpPutResponseHopLimit;
            this.regionId = request.regionId;
            this.instanceNetworkType = request.instanceNetworkType;
            this.pageNumber = request.pageNumber;
            this.nextToken = request.nextToken;
            this.publicIpAddresses = request.publicIpAddresses;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.imageId = request.imageId;
            this.status = request.status;
            this.lockReason = request.lockReason;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.ipv6Address = request.ipv6Address;
            this.httpTokens = request.httpTokens;
            this.additionalAttributes = request.additionalAttributes;
            this.tag = request.tag;
            this.resourceGroupId = request.resourceGroupId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
            this.httpEndpoint = request.httpEndpoint;
            this.pageSize = request.pageSize;
            this.vSwitchId = request.vSwitchId;
            this.keyPairName = request.keyPairName;
            this.instanceType = request.instanceType;
            this.instanceIds = request.instanceIds;
            this.innerIpAddresses = request.innerIpAddresses;
            this.securityGroupId = request.securityGroupId;
            this.dryRun = request.dryRun;
            this.maxResults = request.maxResults;
            this.privateIpAddresses = request.privateIpAddresses;
            this.eipAddresses = request.eipAddresses;
            this.hpcClusterId = request.hpcClusterId;
            this.ioOptimized = request.ioOptimized;
            this.rdmaIpAddresses = request.rdmaIpAddresses;
            this.instanceName = request.instanceName;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
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
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The Token returned by the last API call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * The reason why the resource is locked.
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
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
         * The IPv6 address specified for the Eni.
         */
        public Builder ipv6Address(java.util.List < String > ipv6Address) {
            this.putQueryParameter("Ipv6Address", ipv6Address);
            this.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * Specifies whether to use the enhanced mode (IMDSv2) when accessing instance metadata. Valid values:
         * <p>
         * -optional.
         * -required: force use. If this parameter is set, the instance metadata cannot be accessed in normal mode.
         * 
         * Default value: optional.
         * > For more information about how to access instance metadata, see [instance metadata access mode](~~ 150575 ~~).
         */
        public Builder httpTokens(String httpTokens) {
            this.putQueryParameter("HttpTokens", httpTokens);
            this.httpTokens = httpTokens;
            return this;
        }

        /**
         * Other property values. Valid values of N: 1 to 20. Valid values:
         * <p>
         * 
         * -META_OPTIONS: instance metadata.
         * -DDH_CLUSTER: Dedicated host cluster.
         * -NETWORK_PRIMARY_ENI_IP: the secondary IP address of the primary Eni.
         */
        public Builder additionalAttributes(java.util.List < String > additionalAttributes) {
            this.putQueryParameter("AdditionalAttributes", additionalAttributes);
            this.additionalAttributes = additionalAttributes;
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
         * The ID of the resource group to which the instance belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
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
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
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
         * The instance type.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
         * The list of internal IP addresses of classic network instances. This parameter takes effect when InstanceNetworkType is set to classic. The value can be a JSON Array consisting of multiple IP addresses. A maximum of 100 IP addresses can be entered. Separate IP addresses with commas (,).
         */
        public Builder innerIpAddresses(String innerIpAddresses) {
            this.putQueryParameter("InnerIpAddresses", innerIpAddresses);
            this.innerIpAddresses = innerIpAddresses;
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
         * The number of entries to return on each page. Maximum Value: 100.
         * <p>
         * 
         * Default value:
         * 
         * -If the value is not set or the value is less than 10, the default value is 10.
         * -If the value is greater than 100, the default value is 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The private IP address of the VPC-connected instance. This parameter takes effect when InstanceNetworkType is set to vpc. The value can be a JSON array consisting of multiple IP addresses. A maximum of 100 IP addresses can be entered. Separate IP addresses with commas (,).
         */
        public Builder privateIpAddresses(String privateIpAddresses) {
            this.putQueryParameter("PrivateIpAddresses", privateIpAddresses);
            this.privateIpAddresses = privateIpAddresses;
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
         * The ID of the HPC cluster to which the instance belongs.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.putQueryParameter("HpcClusterId", hpcClusterId);
            this.hpcClusterId = hpcClusterId;
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
         * The Rdma IP address of the HPC instance.
         */
        public Builder rdmaIpAddresses(String rdmaIpAddresses) {
            this.putQueryParameter("RdmaIpAddresses", rdmaIpAddresses);
            this.rdmaIpAddresses = rdmaIpAddresses;
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
