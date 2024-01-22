// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcAttributeResponseBody</p>
 */
public class DescribeVpcAttributeResponseBody extends TeaModel {
    @NameInMap("AssociatedCens")
    private AssociatedCens associatedCens;

    @NameInMap("AssociatedPropagationSources")
    private AssociatedPropagationSources associatedPropagationSources;

    @NameInMap("CidrBlock")
    private String cidrBlock;

    @NameInMap("ClassicLinkEnabled")
    private Boolean classicLinkEnabled;

    @NameInMap("CloudResources")
    private CloudResources cloudResources;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DhcpOptionsSetId")
    private String dhcpOptionsSetId;

    @NameInMap("DhcpOptionsSetStatus")
    private String dhcpOptionsSetStatus;

    @NameInMap("Ipv4GatewayId")
    private String ipv4GatewayId;

    @NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

    @NameInMap("Ipv6CidrBlocks")
    private Ipv6CidrBlocks ipv6CidrBlocks;

    @NameInMap("IsDefault")
    private Boolean isDefault;

    @NameInMap("OwnerId")
    private Long ownerId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SecondaryCidrBlocks")
    private SecondaryCidrBlocks secondaryCidrBlocks;

    @NameInMap("Status")
    private String status;

    @NameInMap("SupportIpv4Gateway")
    private Boolean supportIpv4Gateway;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("UserCidrs")
    private UserCidrs userCidrs;

    @NameInMap("VRouterId")
    private String vRouterId;

    @NameInMap("VSwitchIds")
    private VSwitchIds vSwitchIds;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("VpcName")
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
         * The list of Cloud Enterprise Network (CEN) instances to which the VPC is attached.
         * <p>
         * 
         * If the VPC is not attached to a CEN instance, the parameter is not returned.
         */
        public Builder associatedCens(AssociatedCens associatedCens) {
            this.associatedCens = associatedCens;
            return this;
        }

        /**
         * AssociatedPropagationSources.
         */
        public Builder associatedPropagationSources(AssociatedPropagationSources associatedPropagationSources) {
            this.associatedPropagationSources = associatedPropagationSources;
            return this;
        }

        /**
         * The IPv4 CIDR block of the VPC.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * Indicates whether the ClassicLink feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder classicLinkEnabled(Boolean classicLinkEnabled) {
            this.classicLinkEnabled = classicLinkEnabled;
            return this;
        }

        /**
         * The list of resources deployed in the VPC.
         */
        public Builder cloudResources(CloudResources cloudResources) {
            this.cloudResources = cloudResources;
            return this;
        }

        /**
         * The time when the VPC was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The description of the VPC.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the DHCP options set.
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * The status of the DHCP options set. Valid values:
         * <p>
         * 
         * *   **Available**
         * *   **InUse**
         * *   **Deleted**
         * *   **Pending**
         */
        public Builder dhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
            this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
            return this;
        }

        /**
         * The ID of the IPv4 gateway.
         */
        public Builder ipv4GatewayId(String ipv4GatewayId) {
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }

        /**
         * The IPv6 CIDR block of the VPC.
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * The IPv6 CIDR block of the VPC.
         */
        public Builder ipv6CidrBlocks(Ipv6CidrBlocks ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            return this;
        }

        /**
         * Indicates whether the VPC is the default VPC. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the VPC belongs.
         */
        public Builder ownerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the region to which the VPC belongs.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The secondary IPv4 CIDR block of the VPC.
         */
        public Builder secondaryCidrBlocks(SecondaryCidrBlocks secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }

        /**
         * The status of the VPC. Valid values:
         * <p>
         * 
         * *   **Available**
         * *   **Pending**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether the VPC supports IPv4 gateways.
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder supportIpv4Gateway(Boolean supportIpv4Gateway) {
            this.supportIpv4Gateway = supportIpv4Gateway;
            return this;
        }

        /**
         * The information about the tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The user CIDR block. Multiple CIDR blocks are separated by commas (,). At most three CIDR blocks are returned.
         */
        public Builder userCidrs(UserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }

        /**
         * The ID of the vRouter that belongs to the VPC.
         */
        public Builder vRouterId(String vRouterId) {
            this.vRouterId = vRouterId;
            return this;
        }

        /**
         * The list of vSwitches deployed in the VPC.
         */
        public Builder vSwitchIds(VSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The name of the VPC.
         */
        public Builder vpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }

        public DescribeVpcAttributeResponseBody build() {
            return new DescribeVpcAttributeResponseBody(this);
        } 

    } 

    public static class AssociatedCen extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CenOwnerId")
        private Long cenOwnerId;

        @NameInMap("CenStatus")
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
             * The ID of the CEN instance to which the VPC is attached.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the CEN instance belongs.
             */
            public Builder cenOwnerId(Long cenOwnerId) {
                this.cenOwnerId = cenOwnerId;
                return this;
            }

            /**
             * The status of the CEN instance to which the VPC is attached.
             * <p>
             * 
             * **Attached** is returned only if the VPC is attached to a CEN instance.
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
    public static class AssociatedCens extends TeaModel {
        @NameInMap("AssociatedCen")
        private java.util.List < AssociatedCen> associatedCen;

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
        public java.util.List < AssociatedCen> getAssociatedCen() {
            return this.associatedCen;
        }

        public static final class Builder {
            private java.util.List < AssociatedCen> associatedCen; 

            /**
             * AssociatedCen.
             */
            public Builder associatedCen(java.util.List < AssociatedCen> associatedCen) {
                this.associatedCen = associatedCen;
                return this;
            }

            public AssociatedCens build() {
                return new AssociatedCens(this);
            } 

        } 

    }
    public static class AssociatedPropagationSourcesAssociatedPropagationSources extends TeaModel {
        @NameInMap("RoutePropagated")
        private Boolean routePropagated;

        @NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @NameInMap("SourceOwnerId")
        private Long sourceOwnerId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Status")
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
             * RoutePropagated.
             */
            public Builder routePropagated(Boolean routePropagated) {
                this.routePropagated = routePropagated;
                return this;
            }

            /**
             * SourceInstanceId.
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * SourceOwnerId.
             */
            public Builder sourceOwnerId(Long sourceOwnerId) {
                this.sourceOwnerId = sourceOwnerId;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The status of the VPC. Valid values:
             * <p>
             * 
             * *   **Available**
             * *   **Pending**
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
    public static class AssociatedPropagationSources extends TeaModel {
        @NameInMap("AssociatedPropagationSources")
        private java.util.List < AssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources;

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
        public java.util.List < AssociatedPropagationSourcesAssociatedPropagationSources> getAssociatedPropagationSources() {
            return this.associatedPropagationSources;
        }

        public static final class Builder {
            private java.util.List < AssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources; 

            /**
             * AssociatedPropagationSources.
             */
            public Builder associatedPropagationSources(java.util.List < AssociatedPropagationSourcesAssociatedPropagationSources> associatedPropagationSources) {
                this.associatedPropagationSources = associatedPropagationSources;
                return this;
            }

            public AssociatedPropagationSources build() {
                return new AssociatedPropagationSources(this);
            } 

        } 

    }
    public static class CloudResourceSetType extends TeaModel {
        @NameInMap("ResourceCount")
        private Integer resourceCount;

        @NameInMap("ResourceType")
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
             * The number of resources deployed in the VPC.
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * The type of resources deployed in the VPC. Valid values:
             * <p>
             * 
             * *   **VSwitch**
             * *   **VRouter**
             * *   **RouteTable**
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
    public static class CloudResources extends TeaModel {
        @NameInMap("CloudResourceSetType")
        private java.util.List < CloudResourceSetType> cloudResourceSetType;

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
        public java.util.List < CloudResourceSetType> getCloudResourceSetType() {
            return this.cloudResourceSetType;
        }

        public static final class Builder {
            private java.util.List < CloudResourceSetType> cloudResourceSetType; 

            /**
             * CloudResourceSetType.
             */
            public Builder cloudResourceSetType(java.util.List < CloudResourceSetType> cloudResourceSetType) {
                this.cloudResourceSetType = cloudResourceSetType;
                return this;
            }

            public CloudResources build() {
                return new CloudResources(this);
            } 

        } 

    }
    public static class Ipv6CidrBlock extends TeaModel {
        @NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @NameInMap("Ipv6Isp")
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
             * The IPv6 CIDR block of the VPC.
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * The type of the IPv6 CIDR block. Valid values:
             * <p>
             * 
             * *   **BGP** (default)
             * *   **ChinaMobile**
             * *   **ChinaUnicom**
             * *   **ChinaTelecom**
             * 
             * >  If your Alibaba Cloud account is allowed to activate single-ISP bandwidth, you can set this parameter to **ChinaTelecom**, **ChinaUnicom**, or **ChinaMobile**.
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
    public static class Ipv6CidrBlocks extends TeaModel {
        @NameInMap("Ipv6CidrBlock")
        private java.util.List < Ipv6CidrBlock> ipv6CidrBlock;

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
        public java.util.List < Ipv6CidrBlock> getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public static final class Builder {
            private java.util.List < Ipv6CidrBlock> ipv6CidrBlock; 

            /**
             * The IPv6 CIDR block of the VPC.
             */
            public Builder ipv6CidrBlock(java.util.List < Ipv6CidrBlock> ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            public Ipv6CidrBlocks build() {
                return new Ipv6CidrBlocks(this);
            } 

        } 

    }
    public static class SecondaryCidrBlocks extends TeaModel {
        @NameInMap("SecondaryCidrBlock")
        private java.util.List < String > secondaryCidrBlock;

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
        public java.util.List < String > getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

        public static final class Builder {
            private java.util.List < String > secondaryCidrBlock; 

            /**
             * SecondaryCidrBlock.
             */
            public Builder secondaryCidrBlock(java.util.List < String > secondaryCidrBlock) {
                this.secondaryCidrBlock = secondaryCidrBlock;
                return this;
            }

            public SecondaryCidrBlocks build() {
                return new SecondaryCidrBlocks(this);
            } 

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
             * The key of tag N added to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N added to the resource.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class UserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        private java.util.List < String > userCidr;

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
        public java.util.List < String > getUserCidr() {
            return this.userCidr;
        }

        public static final class Builder {
            private java.util.List < String > userCidr; 

            /**
             * UserCidr.
             */
            public Builder userCidr(java.util.List < String > userCidr) {
                this.userCidr = userCidr;
                return this;
            }

            public UserCidrs build() {
                return new UserCidrs(this);
            } 

        } 

    }
    public static class VSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        private java.util.List < String > vSwitchId;

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
        public java.util.List < String > getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List < String > vSwitchId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List < String > vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
}
