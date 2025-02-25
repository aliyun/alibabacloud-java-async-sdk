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
 * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcAttributeResponseBody</p>
 */
public class DescribeVpcAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociatedCens")
    private AssociatedCens associatedCens;

    @com.aliyun.core.annotation.NameInMap("AssociatedPropagationSources")
    private AssociatedPropagationSources associatedPropagationSources;

    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("ClassicLinkEnabled")
    private Boolean classicLinkEnabled;

    @com.aliyun.core.annotation.NameInMap("CloudResources")
    private CloudResources cloudResources;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetId")
    private String dhcpOptionsSetId;

    @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetStatus")
    private String dhcpOptionsSetStatus;

    @com.aliyun.core.annotation.NameInMap("DnsHostnameStatus")
    private String dnsHostnameStatus;

    @com.aliyun.core.annotation.NameInMap("EnabledIpv6")
    private Boolean enabledIpv6;

    @com.aliyun.core.annotation.NameInMap("Ipv4GatewayId")
    private String ipv4GatewayId;

    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlocks")
    private Ipv6CidrBlocks ipv6CidrBlocks;

    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlocks")
    private SecondaryCidrBlocks secondaryCidrBlocks;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportIpv4Gateway")
    private Boolean supportIpv4Gateway;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("UserCidrs")
    private UserCidrs userCidrs;

    @com.aliyun.core.annotation.NameInMap("VRouterId")
    private String vRouterId;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private VSwitchIds vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VpcName")
    private String vpcName;

    private DescribeVpcAttributeResponseBody(Builder builder) {
        this.associatedCens = builder.associatedCens;
        this.associatedPropagationSources = builder.associatedPropagationSources;
        this.cidrBlock = builder.cidrBlock;
        this.classicLinkEnabled = builder.classicLinkEnabled;
        this.cloudResources = builder.cloudResources;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.dhcpOptionsSetStatus = builder.dhcpOptionsSetStatus;
        this.dnsHostnameStatus = builder.dnsHostnameStatus;
        this.enabledIpv6 = builder.enabledIpv6;
        this.ipv4GatewayId = builder.ipv4GatewayId;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.ipv6CidrBlocks = builder.ipv6CidrBlocks;
        this.isDefault = builder.isDefault;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.secondaryCidrBlocks = builder.secondaryCidrBlocks;
        this.status = builder.status;
        this.supportIpv4Gateway = builder.supportIpv4Gateway;
        this.tags = builder.tags;
        this.userCidrs = builder.userCidrs;
        this.vRouterId = builder.vRouterId;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.vpcName = builder.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return associatedCens
     */
    public AssociatedCens getAssociatedCens() {
        return this.associatedCens;
    }

    /**
     * @return associatedPropagationSources
     */
    public AssociatedPropagationSources getAssociatedPropagationSources() {
        return this.associatedPropagationSources;
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return classicLinkEnabled
     */
    public Boolean getClassicLinkEnabled() {
        return this.classicLinkEnabled;
    }

    /**
     * @return cloudResources
     */
    public CloudResources getCloudResources() {
        return this.cloudResources;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dhcpOptionsSetId
     */
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    /**
     * @return dhcpOptionsSetStatus
     */
    public String getDhcpOptionsSetStatus() {
        return this.dhcpOptionsSetStatus;
    }

    /**
     * @return dnsHostnameStatus
     */
    public String getDnsHostnameStatus() {
        return this.dnsHostnameStatus;
    }

    /**
     * @return enabledIpv6
     */
    public Boolean getEnabledIpv6() {
        return this.enabledIpv6;
    }

    /**
     * @return ipv4GatewayId
     */
    public String getIpv4GatewayId() {
        return this.ipv4GatewayId;
    }

    /**
     * @return ipv6CidrBlock
     */
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * @return ipv6CidrBlocks
     */
    public Ipv6CidrBlocks getIpv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return secondaryCidrBlocks
     */
    public SecondaryCidrBlocks getSecondaryCidrBlocks() {
        return this.secondaryCidrBlocks;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportIpv4Gateway
     */
    public Boolean getSupportIpv4Gateway() {
        return this.supportIpv4Gateway;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return userCidrs
     */
    public UserCidrs getUserCidrs() {
        return this.userCidrs;
    }

    /**
     * @return vRouterId
     */
    public String getVRouterId() {
        return this.vRouterId;
    }

    /**
     * @return vSwitchIds
     */
    public VSwitchIds getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcName
     */
    public String getVpcName() {
        return this.vpcName;
    }

    public static final class Builder {
        private AssociatedCens associatedCens; 
        private AssociatedPropagationSources associatedPropagationSources; 
        private String cidrBlock; 
        private Boolean classicLinkEnabled; 
        private CloudResources cloudResources; 
        private String creationTime; 
        private String description; 
        private String dhcpOptionsSetId; 
        private String dhcpOptionsSetStatus; 
        private String dnsHostnameStatus; 
        private Boolean enabledIpv6; 
        private String ipv4GatewayId; 
        private String ipv6CidrBlock; 
        private Ipv6CidrBlocks ipv6CidrBlocks; 
        private Boolean isDefault; 
        private Long ownerId; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private SecondaryCidrBlocks secondaryCidrBlocks; 
        private String status; 
        private Boolean supportIpv4Gateway; 
        private Tags tags; 
        private UserCidrs userCidrs; 
        private String vRouterId; 
        private VSwitchIds vSwitchIds; 
        private String vpcId; 
        private String vpcName; 

        /**
         * <p>The list of Cloud Enterprise Network (CEN) instances to which the VPC is attached.</p>
         * <p>If the VPC is not attached to a CEN instance, the parameter is not returned.</p>
         */
        public Builder associatedCens(AssociatedCens associatedCens) {
            this.associatedCens = associatedCens;
            return this;
        }

        /**
         * <p>The route source associated with the VPC.</p>
         */
        public Builder associatedPropagationSources(AssociatedPropagationSources associatedPropagationSources) {
            this.associatedPropagationSources = associatedPropagationSources;
            return this;
        }

        /**
         * <p>The IPv4 CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>Indicates whether the ClassicLink feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder classicLinkEnabled(Boolean classicLinkEnabled) {
            this.classicLinkEnabled = classicLinkEnabled;
            return this;
        }

        /**
         * <p>The list of resources deployed in the VPC.</p>
         */
        public Builder cloudResources(CloudResources cloudResources) {
            this.cloudResources = cloudResources;
            return this;
        }

        /**
         * <p>The time when the VPC was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-16T07:31:09Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the DHCP options set.</p>
         * 
         * <strong>example:</strong>
         * <p>dopt-o6w0df4epg9zo8isy****</p>
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * <p>The status of the DHCP options set. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>InUse</strong></li>
         * <li><strong>Deleted</strong></li>
         * <li><strong>Pending</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder dhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
            this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
            return this;
        }

        /**
         * DnsHostnameStatus.
         */
        public Builder dnsHostnameStatus(String dnsHostnameStatus) {
            this.dnsHostnameStatus = dnsHostnameStatus;
            return this;
        }

        /**
         * <p>Indicates whether the VPC enables IPv6 .</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enabledIpv6(Boolean enabledIpv6) {
            this.enabledIpv6 = enabledIpv6;
            return this;
        }

        /**
         * <p>The ID of the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4gw-5tsnc6s4ogsedtp3k****</p>
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:a600::/56</p>
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * <p>The IPv6 CIDR block of the VPC.</p>
         */
        public Builder ipv6CidrBlocks(Ipv6CidrBlocks ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        /**
         * <p>Indicates whether the VPC is the default VPC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>28311773240248****</p>
         */
        public Builder ownerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7486AE4A-129D-43DB-A714-2432C074BA04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazbvgb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The secondary IPv4 CIDR block of the VPC.</p>
         */
        public Builder secondaryCidrBlocks(SecondaryCidrBlocks secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }

        /**
         * <p>The status of the VPC. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong></li>
         * <li><strong>Pending</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the VPC supports IPv4 gateways.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportIpv4Gateway(Boolean supportIpv4Gateway) {
            this.supportIpv4Gateway = supportIpv4Gateway;
            return this;
        }

        /**
         * <p>The information about the tags.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The user CIDR block. Multiple CIDR blocks are separated by commas (,). At most three CIDR blocks are returned.</p>
         */
        public Builder userCidrs(UserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }

        /**
         * <p>The ID of the vRouter that belongs to the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1jso6ng1at0ajsc****</p>
         */
        public Builder vRouterId(String vRouterId) {
            this.vRouterId = vRouterId;
            return this;
        }

        /**
         * <p>The list of vSwitches deployed in the VPC.</p>
         */
        public Builder vSwitchIds(VSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp18sth14qii3pnvo****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>doctest2</p>
         */
        public Builder vpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }

        public DescribeVpcAttributeResponseBody build() {
            return new DescribeVpcAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class AssociatedCen extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @com.aliyun.core.annotation.NameInMap("CenStatus")
        private String cenStatus;

        private AssociatedCen(Builder builder) {
            this.cenId = builder.cenId;
            this.cenOwnerId = builder.cenOwnerId;
            this.cenStatus = builder.cenStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedCen create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cenOwnerId
         */
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        /**
         * @return cenStatus
         */
        public String getCenStatus() {
            return this.cenStatus;
        }

        public static final class Builder {
            private String cenId; 
            private Long cenOwnerId; 
            private String cenStatus; 

            /**
             * <p>The ID of the CEN instance to which the VPC is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-7qthudw0ll6jmc****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The ID of the account to which the CEN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>28311773240248****</p>
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * <p>The status of the CEN instance.</p>
             * <p><strong>Attached</strong> is returned only when the VPC is attached to a CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Attached</p>
             */
            public Builder cenStatus(String cenStatus) {
                this.cenStatus = cenStatus;
                return this;
            }

            public AssociatedCen build() {
                return new AssociatedCen(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class AssociatedCens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedCen")
        private java.util.List<AssociatedCen> associatedCen;

        private AssociatedCens(Builder builder) {
            this.associatedCen = builder.associatedCen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedCens create() {
            return builder().build();
        }

        /**
         * @return associatedCen
         */
        public java.util.List<AssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

        public static final class Builder {
            private java.util.List<AssociatedCen> associatedCen; 

            /**
             * AssociatedCen.
             */
            public Builder associatedCen(java.util.List<AssociatedCen> associatedCen) {
                this.associatedCen = associatedCen;
                return this;
            }

            public AssociatedCens build() {
                return new AssociatedCens(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class AssociatedPropagationSourcesAssociatedPropagationSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoutePropagated")
        private Boolean routePropagated;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceOwnerId")
        private Long sourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AssociatedPropagationSourcesAssociatedPropagationSources(Builder builder) {
            this.routePropagated = builder.routePropagated;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceOwnerId = builder.sourceOwnerId;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedPropagationSourcesAssociatedPropagationSources create() {
            return builder().build();
        }

        /**
         * @return routePropagated
         */
        public Boolean getRoutePropagated() {
            return this.routePropagated;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceOwnerId
         */
        public Long getSourceOwnerId() {
            return this.sourceOwnerId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean routePropagated; 
            private String sourceInstanceId; 
            private Long sourceOwnerId; 
            private String sourceType; 
            private String status; 

            /**
             * <p>Indicates whether routes are advertised to the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder routePropagated(Boolean routePropagated) {
                this.routePropagated = routePropagated;
                return this;
            }

            /**
             * <p>The instance ID of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-dc4vwznpwbobrl****</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The account ID of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>153980532164****</p>
             */
            public Builder sourceOwnerId(Long sourceOwnerId) {
                this.sourceOwnerId = sourceOwnerId;
                return this;
            }

            /**
             * <p>The source type.</p>
             * <ul>
             * <li><strong>CEN</strong></li>
             * <li><strong>VPN</strong></li>
             * <li><strong>TR</strong></li>
             * <li><strong>ECR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CEN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The binding status.</p>
             * <ul>
             * <li><strong>Attaching</strong></li>
             * <li><strong>Attached</strong></li>
             * <li><strong>Detaching</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Attaching</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AssociatedPropagationSourcesAssociatedPropagationSources build() {
                return new AssociatedPropagationSourcesAssociatedPropagationSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class AssociatedPropagationSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedPropagationSources")
        private java.util.List<AssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources;

        private AssociatedPropagationSources(Builder builder) {
            this.associatedPropagationSources = builder.associatedPropagationSources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedPropagationSources create() {
            return builder().build();
        }

        /**
         * @return associatedPropagationSources
         */
        public java.util.List<AssociatedPropagationSourcesAssociatedPropagationSources> getAssociatedPropagationSources() {
            return this.associatedPropagationSources;
        }

        public static final class Builder {
            private java.util.List<AssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources; 

            /**
             * <p>The route source associated with the VPC.</p>
             */
            public Builder associatedPropagationSources(java.util.List<AssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources) {
                this.associatedPropagationSources = associatedPropagationSources;
                return this;
            }

            public AssociatedPropagationSources build() {
                return new AssociatedPropagationSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class CloudResourceSetType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Integer resourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private CloudResourceSetType(Builder builder) {
            this.resourceCount = builder.resourceCount;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResourceSetType create() {
            return builder().build();
        }

        /**
         * @return resourceCount
         */
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Integer resourceCount; 
            private String resourceType; 

            /**
             * <p>The number of resources in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * <p>The type of resource deployed in the VPC. Valid values: Valid values:</p>
             * <ul>
             * <li><strong>VSwitch</strong></li>
             * <li><strong>VRouter</strong></li>
             * <li><strong>RouteTable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public CloudResourceSetType build() {
                return new CloudResourceSetType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class CloudResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudResourceSetType")
        private java.util.List<CloudResourceSetType> cloudResourceSetType;

        private CloudResources(Builder builder) {
            this.cloudResourceSetType = builder.cloudResourceSetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudResources create() {
            return builder().build();
        }

        /**
         * @return cloudResourceSetType
         */
        public java.util.List<CloudResourceSetType> getCloudResourceSetType() {
            return this.cloudResourceSetType;
        }

        public static final class Builder {
            private java.util.List<CloudResourceSetType> cloudResourceSetType; 

            /**
             * CloudResourceSetType.
             */
            public Builder cloudResourceSetType(java.util.List<CloudResourceSetType> cloudResourceSetType) {
                this.cloudResourceSetType = cloudResourceSetType;
                return this;
            }

            public CloudResources build() {
                return new CloudResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class Ipv6CidrBlock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @com.aliyun.core.annotation.NameInMap("Ipv6Isp")
        private String ipv6Isp;

        private Ipv6CidrBlock(Builder builder) {
            this.ipv6CidrBlock = builder.ipv6CidrBlock;
            this.ipv6Isp = builder.ipv6Isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6CidrBlock create() {
            return builder().build();
        }

        /**
         * @return ipv6CidrBlock
         */
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        /**
         * @return ipv6Isp
         */
        public String getIpv6Isp() {
            return this.ipv6Isp;
        }

        public static final class Builder {
            private String ipv6CidrBlock; 
            private String ipv6Isp; 

            /**
             * <p>The IPv6 CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:XXXX:0:6a::/56</p>
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * <p>The IPv6 CIDR block type of the VPC. Valid values:</p>
             * <ul>
             * <li><strong>BGP</strong> (default)</li>
             * <li><strong>ChinaMobile</strong></li>
             * <li><strong>ChinaUnicom</strong></li>
             * <li><strong>ChinaTelecom</strong></li>
             * </ul>
             * <blockquote>
             * <p> If you are allowed to use single-ISP bandwidth, valid values are <strong>ChinaTelecom</strong>, <strong>ChinaUnicom</strong>, and <strong>ChinaMobile</strong></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder ipv6Isp(String ipv6Isp) {
                this.ipv6Isp = ipv6Isp;
                return this;
            }

            public Ipv6CidrBlock build() {
                return new Ipv6CidrBlock(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class Ipv6CidrBlocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
        private java.util.List<Ipv6CidrBlock> ipv6CidrBlock;

        private Ipv6CidrBlocks(Builder builder) {
            this.ipv6CidrBlock = builder.ipv6CidrBlock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6CidrBlocks create() {
            return builder().build();
        }

        /**
         * @return ipv6CidrBlock
         */
        public java.util.List<Ipv6CidrBlock> getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public static final class Builder {
            private java.util.List<Ipv6CidrBlock> ipv6CidrBlock; 

            /**
             * <p>The IPv6 CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:XXXX:0:6a::/56</p>
             */
            public Builder ipv6CidrBlock(java.util.List<Ipv6CidrBlock> ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            public Ipv6CidrBlocks build() {
                return new Ipv6CidrBlocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class SecondaryCidrBlocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlock")
        private java.util.List<String> secondaryCidrBlock;

        private SecondaryCidrBlocks(Builder builder) {
            this.secondaryCidrBlock = builder.secondaryCidrBlock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecondaryCidrBlocks create() {
            return builder().build();
        }

        /**
         * @return secondaryCidrBlock
         */
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

        public static final class Builder {
            private java.util.List<String> secondaryCidrBlock; 

            /**
             * SecondaryCidrBlock.
             */
            public Builder secondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
                this.secondaryCidrBlock = secondaryCidrBlock;
                return this;
            }

            public SecondaryCidrBlocks build() {
                return new SecondaryCidrBlocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
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
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
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
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class UserCidrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserCidr")
        private java.util.List<String> userCidr;

        private UserCidrs(Builder builder) {
            this.userCidr = builder.userCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCidrs create() {
            return builder().build();
        }

        /**
         * @return userCidr
         */
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

        public static final class Builder {
            private java.util.List<String> userCidr; 

            /**
             * UserCidr.
             */
            public Builder userCidr(java.util.List<String> userCidr) {
                this.userCidr = userCidr;
                return this;
            }

            public UserCidrs build() {
                return new UserCidrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAttributeResponseBody</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private java.util.List<String> vSwitchId;

        private VSwitchIds(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List<String> vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
}
