// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchAttributesResponseBody</p>
 */
public class DescribeVSwitchAttributesResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private DescribeVSwitchAttributesResponseBody(Builder builder) {
        this.availableIpAddressCount = builder.availableIpAddressCount;
        this.cidrBlock = builder.cidrBlock;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.enabledIpv6 = builder.enabledIpv6;
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.isDefault = builder.isDefault;
        this.networkAclId = builder.networkAclId;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
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

    public static DescribeVSwitchAttributesResponseBody create() {
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
        private String requestId; 
        private String resourceGroupId; 
        private RouteTable routeTable; 
        private String shareType; 
        private String status; 
        private Tags tags; 
        private String vSwitchId; 
        private String vSwitchName; 
        private String vpcId; 
        private String zoneId; 

        /**
         * <p>The number of available IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder availableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }

        /**
         * <p>The CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The time when the vSwitch was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-22T10:40:25Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether IPv6 is enabled for the vSwitch. If you enable IPv6, you must configure the IPv6 CIDR block of the vSwitch. Valid values:</p>
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
         * <p>2408:XXXX:3c5:44e::/64</p>
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
         * <p>false</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>The network access control list (ACL) rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>287683832402436789</p>
         */
        public Builder ownerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B48B4B9-1EAD-469F-B488-594DAB4B6A1A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the ACL belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The information about the route table that is associated with the vSwitch.</p>
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
         * <p>Pending</p>
         */
        public Builder status(String status) {
            this.status = status;
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
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-25b7pv15t****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The vSwitch name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder vSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-257gq642n****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the zone to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeVSwitchAttributesResponseBody build() {
            return new DescribeVSwitchAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
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

            /**
             * <p>The ID of the route table that is associated with the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp145q7glnuzdv****</p>
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
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
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
             * <p>The key of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the resource.</p>
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
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
}
