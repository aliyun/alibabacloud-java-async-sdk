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
 * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchesResponseBody</p>
 */
public class DescribeVSwitchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private VSwitches vSwitches;

    private DescribeVSwitchesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vSwitches = builder.vSwitches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return vSwitches
     */
    public VSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VSwitches vSwitches; 

        private Builder() {
        } 

        private Builder(DescribeVSwitchesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vSwitches = model.vSwitches;
        } 

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A572171-4E27-40D1-BD36-D26C9E71E29E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The details about the vSwitch.</p>
         */
        public Builder vSwitches(VSwitches vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        public DescribeVSwitchesResponseBody build() {
            return new DescribeVSwitchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchesResponseBody</p>
     */
    public static class RouteTable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("RouteTableType")
        private String routeTableType;

        private RouteTable(Builder builder) {
            this.routeTableId = builder.routeTableId;
            this.routeTableType = builder.routeTableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTable create() {
            return builder().build();
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return routeTableType
         */
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public static final class Builder {
            private String routeTableId; 
            private String routeTableType; 

            private Builder() {
            } 

            private Builder(RouteTable model) {
                this.routeTableId = model.routeTableId;
                this.routeTableType = model.routeTableType;
            } 

            /**
             * <p>The ID of the route table that is associated with the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vrt-bp145q7glnuzdv****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The type of the route table. Valid values:</p>
             * <ul>
             * <li><strong>System</strong></li>
             * <li><strong>Custom</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder routeTableType(String routeTableType) {
                this.routeTableType = routeTableType;
                return this;
            }

            public RouteTable build() {
                return new RouteTable(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
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
     * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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
     * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchesResponseBody</p>
     */
    public static class VSwitch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIpAddressCount")
        private Long availableIpAddressCount;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnabledIpv6")
        private Boolean enabledIpv6;

        @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
        private String ipv6CidrBlock;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("NetworkAclId")
        private String networkAclId;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouteTable")
        private RouteTable routeTable;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitch(Builder builder) {
            this.availableIpAddressCount = builder.availableIpAddressCount;
            this.cidrBlock = builder.cidrBlock;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.enabledIpv6 = builder.enabledIpv6;
            this.ipv6CidrBlock = builder.ipv6CidrBlock;
            this.isDefault = builder.isDefault;
            this.networkAclId = builder.networkAclId;
            this.ownerId = builder.ownerId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routeTable = builder.routeTable;
            this.shareType = builder.shareType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitch create() {
            return builder().build();
        }

        /**
         * @return availableIpAddressCount
         */
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
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
         * @return enabledIpv6
         */
        public Boolean getEnabledIpv6() {
            return this.enabledIpv6;
        }

        /**
         * @return ipv6CidrBlock
         */
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return networkAclId
         */
        public String getNetworkAclId() {
            return this.networkAclId;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return routeTable
         */
        public RouteTable getRouteTable() {
            return this.routeTable;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
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

        public static final class Builder {
            private Long availableIpAddressCount; 
            private String cidrBlock; 
            private String creationTime; 
            private String description; 
            private Boolean enabledIpv6; 
            private String ipv6CidrBlock; 
            private Boolean isDefault; 
            private String networkAclId; 
            private Long ownerId; 
            private String resourceGroupId; 
            private RouteTable routeTable; 
            private String shareType; 
            private String status; 
            private Tags tags; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitch model) {
                this.availableIpAddressCount = model.availableIpAddressCount;
                this.cidrBlock = model.cidrBlock;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.enabledIpv6 = model.enabledIpv6;
                this.ipv6CidrBlock = model.ipv6CidrBlock;
                this.isDefault = model.isDefault;
                this.networkAclId = model.networkAclId;
                this.ownerId = model.ownerId;
                this.resourceGroupId = model.resourceGroupId;
                this.routeTable = model.routeTable;
                this.shareType = model.shareType;
                this.status = model.status;
                this.tags = model.tags;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of available IP addresses in the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder availableIpAddressCount(Long availableIpAddressCount) {
                this.availableIpAddressCount = availableIpAddressCount;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time when the vSwitch was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-18T12:43:57Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>VSwitchDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is enabled for the vSwitch. If you enable IPv6, you must configure an IPv6 CIDR block for the vSwitch. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabledIpv6(Boolean enabledIpv6) {
                this.enabledIpv6 = enabledIpv6;
                return this;
            }

            /**
             * <p>The IPv6 CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:4002:10c4:4e03::/64</p>
             */
            public Builder ipv6CidrBlock(String ipv6CidrBlock) {
                this.ipv6CidrBlock = ipv6CidrBlock;
                return this;
            }

            /**
             * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the network access control list (ACL).</p>
             * 
             * <strong>example:</strong>
             * <p>nacl-a2do9e413e0spzasx****</p>
             */
            public Builder networkAclId(String networkAclId) {
                this.networkAclId = networkAclId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>25346073170691****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the vSwitch belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph6aiy****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The information about the route table.</p>
             */
            public Builder routeTable(RouteTable routeTable) {
                this.routeTable = routeTable;
                return this;
            }

            /**
             * <p>Indicates whether the vSwitch is shared.</p>
             * <ul>
             * <li>If no value is returned, the vSwitch is a regular vSwitch.</li>
             * <li>If <strong>Shared</strong> is returned, the vSwitch is shared.</li>
             * <li>If <strong>Sharing</strong> is returned, the vSwitch is being shared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shared</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The status of the vSwitch. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Available</strong></li>
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
             * <p>The tags of the vSwitch.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-25bcdxs7pv1****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The vSwitch name.</p>
             * 
             * <strong>example:</strong>
             * <p>vSwitch</p>
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the vSwitch belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-257gcdcdq64****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone to which the vSwitch belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-d</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitch build() {
                return new VSwitch(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchesResponseBody</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitch")
        private java.util.List<VSwitch> vSwitch;

        private VSwitches(Builder builder) {
            this.vSwitch = builder.vSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vSwitch
         */
        public java.util.List<VSwitch> getVSwitch() {
            return this.vSwitch;
        }

        public static final class Builder {
            private java.util.List<VSwitch> vSwitch; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vSwitch = model.vSwitch;
            } 

            /**
             * VSwitch.
             */
            public Builder vSwitch(java.util.List<VSwitch> vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
