// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcsResponseBody</p>
 */
public class DescribeVpcsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Vpcs")
    private Vpcs vpcs;

    private DescribeVpcsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcs = builder.vpcs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcsResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcs
     */
    public Vpcs getVpcs() {
        return this.vpcs;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Vpcs vpcs; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Vpcs.
         */
        public Builder vpcs(Vpcs vpcs) {
            this.vpcs = vpcs;
            return this;
        }

        public DescribeVpcsResponseBody build() {
            return new DescribeVpcsResponseBody(this);
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
             * Ipv6CidrBlock.
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * Ipv6Isp.
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
             * Ipv6CidrBlock.
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
    public static class NatGatewayIds extends TeaModel {
        @NameInMap("NatGatewayIds")
        private java.util.List < String > natGatewayIds;

        private NatGatewayIds(Builder builder) {
            this.natGatewayIds = builder.natGatewayIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayIds create() {
            return builder().build();
        }

        /**
         * @return natGatewayIds
         */
        public java.util.List < String > getNatGatewayIds() {
            return this.natGatewayIds;
        }

        public static final class Builder {
            private java.util.List < String > natGatewayIds; 

            /**
             * NatGatewayIds.
             */
            public Builder natGatewayIds(java.util.List < String > natGatewayIds) {
                this.natGatewayIds = natGatewayIds;
                return this;
            }

            public NatGatewayIds build() {
                return new NatGatewayIds(this);
            } 

        } 

    }
    public static class RouterTableIds extends TeaModel {
        @NameInMap("RouterTableIds")
        private java.util.List < String > routerTableIds;

        private RouterTableIds(Builder builder) {
            this.routerTableIds = builder.routerTableIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterTableIds create() {
            return builder().build();
        }

        /**
         * @return routerTableIds
         */
        public java.util.List < String > getRouterTableIds() {
            return this.routerTableIds;
        }

        public static final class Builder {
            private java.util.List < String > routerTableIds; 

            /**
             * RouterTableIds.
             */
            public Builder routerTableIds(java.util.List < String > routerTableIds) {
                this.routerTableIds = routerTableIds;
                return this;
            }

            public RouterTableIds build() {
                return new RouterTableIds(this);
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Vpc extends TeaModel {
        @NameInMap("CenStatus")
        private String cenStatus;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DhcpOptionsSetId")
        private String dhcpOptionsSetId;

        @NameInMap("DhcpOptionsSetStatus")
        private String dhcpOptionsSetStatus;

        @NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @NameInMap("Ipv6CidrBlocks")
        private Ipv6CidrBlocks ipv6CidrBlocks;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("NatGatewayIds")
        private NatGatewayIds natGatewayIds;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RouterTableIds")
        private RouterTableIds routerTableIds;

        @NameInMap("SecondaryCidrBlocks")
        private SecondaryCidrBlocks secondaryCidrBlocks;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("UserCidrs")
        private UserCidrs userCidrs;

        @NameInMap("VRouterId")
        private String VRouterId;

        @NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private Vpc(Builder builder) {
            this.cenStatus = builder.cenStatus;
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
            this.dhcpOptionsSetStatus = builder.dhcpOptionsSetStatus;
            this.ipv6CidrBlock = builder.ipv6CidrBlock;
            this.ipv6CidrBlocks = builder.ipv6CidrBlocks;
            this.isDefault = builder.isDefault;
            this.natGatewayIds = builder.natGatewayIds;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routerTableIds = builder.routerTableIds;
            this.secondaryCidrBlocks = builder.secondaryCidrBlocks;
            this.status = builder.status;
            this.tags = builder.tags;
            this.userCidrs = builder.userCidrs;
            this.VRouterId = builder.VRouterId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return cenStatus
         */
        public String getCenStatus() {
            return this.cenStatus;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
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
         * @return natGatewayIds
         */
        public NatGatewayIds getNatGatewayIds() {
            return this.natGatewayIds;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routerTableIds
         */
        public RouterTableIds getRouterTableIds() {
            return this.routerTableIds;
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
         * @return VRouterId
         */
        public String getVRouterId() {
            return this.VRouterId;
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
            private String cenStatus; 
            private String cidrBlock; 
            private String creationTime; 
            private String description; 
            private String dhcpOptionsSetId; 
            private String dhcpOptionsSetStatus; 
            private String ipv6CidrBlock; 
            private Ipv6CidrBlocks ipv6CidrBlocks; 
            private Boolean isDefault; 
            private NatGatewayIds natGatewayIds; 
            private Long ownerId; 
            private String regionId; 
            private String resourceGroupId; 
            private RouterTableIds routerTableIds; 
            private SecondaryCidrBlocks secondaryCidrBlocks; 
            private String status; 
            private Tags tags; 
            private UserCidrs userCidrs; 
            private String VRouterId; 
            private VSwitchIds vSwitchIds; 
            private String vpcId; 
            private String vpcName; 

            /**
             * CenStatus.
             */
            public Builder cenStatus(String cenStatus) {
                this.cenStatus = cenStatus;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DhcpOptionsSetId.
             */
            public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
                this.dhcpOptionsSetId = dhcpOptionsSetId;
                return this;
            }

            /**
             * DhcpOptionsSetStatus.
             */
            public Builder dhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
                this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
                return this;
            }

            /**
             * Ipv6CidrBlock.
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * Ipv6CidrBlocks.
             */
            public Builder ipv6CidrBlocks(Ipv6CidrBlocks ipv6CidrBlocks) {
                this.ipv6CidrBlocks = ipv6CidrBlocks;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * NatGatewayIds.
             */
            public Builder natGatewayIds(NatGatewayIds natGatewayIds) {
                this.natGatewayIds = natGatewayIds;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RouterTableIds.
             */
            public Builder routerTableIds(RouterTableIds routerTableIds) {
                this.routerTableIds = routerTableIds;
                return this;
            }

            /**
             * SecondaryCidrBlocks.
             */
            public Builder secondaryCidrBlocks(SecondaryCidrBlocks secondaryCidrBlocks) {
                this.secondaryCidrBlocks = secondaryCidrBlocks;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UserCidrs.
             */
            public Builder userCidrs(UserCidrs userCidrs) {
                this.userCidrs = userCidrs;
                return this;
            }

            /**
             * VRouterId.
             */
            public Builder VRouterId(String VRouterId) {
                this.VRouterId = VRouterId;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    public static class Vpcs extends TeaModel {
        @NameInMap("Vpc")
        private java.util.List < Vpc> vpc;

        private Vpcs(Builder builder) {
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpcs create() {
            return builder().build();
        }

        /**
         * @return vpc
         */
        public java.util.List < Vpc> getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private java.util.List < Vpc> vpc; 

            /**
             * Vpc.
             */
            public Builder vpc(java.util.List < Vpc> vpc) {
                this.vpc = vpc;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
