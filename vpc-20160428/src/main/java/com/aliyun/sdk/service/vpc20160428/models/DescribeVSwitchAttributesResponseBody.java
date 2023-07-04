// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchAttributesResponseBody</p>
 */
public class DescribeVSwitchAttributesResponseBody extends TeaModel {
    @NameInMap("AvailableIpAddressCount")
    private Long availableIpAddressCount;

    @NameInMap("CidrBlock")
    private String cidrBlock;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

    @NameInMap("IsDefault")
    private Boolean isDefault;

    @NameInMap("NetworkAclId")
    private String networkAclId;

    @NameInMap("OwnerId")
    private Long ownerId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("RouteTable")
    private RouteTable routeTable;

    @NameInMap("ShareType")
    private String shareType;

    @NameInMap("Status")
    private String status;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VSwitchName")
    private String vSwitchName;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeVSwitchAttributesResponseBody(Builder builder) {
        this.availableIpAddressCount = builder.availableIpAddressCount;
        this.cidrBlock = builder.cidrBlock;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
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
         * The number of available IP addresses.
         */
        public Builder availableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }

        /**
         * The CIDR block of the vSwitch.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * The time when the vSwitch was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The description of the vSwitch.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The IPv6 CIDR block of the vSwitch.
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * Indicates whether the vSwitch is the default vSwitch. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * The network access control list (ACL) rules.
         */
        public Builder networkAclId(String networkAclId) {
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the vSwitch belongs.
         */
        public Builder ownerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the request.
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
         * The information about the route table that is associated with the vSwitch.
         */
        public Builder routeTable(RouteTable routeTable) {
            this.routeTable = routeTable;
            return this;
        }

        /**
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * The status of the vSwitch. Valid values:
         * <p>
         * 
         * *   **Pending**
         * *   **Available**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The tag list.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The name of the vSwitch.
         */
        public Builder vSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }

        /**
         * The ID of the VPC to which the vSwitch belongs.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the zone to which the vSwitch belongs.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeVSwitchAttributesResponseBody build() {
            return new DescribeVSwitchAttributesResponseBody(this);
        } 

    } 

    public static class RouteTable extends TeaModel {
        @NameInMap("RouteTableId")
        private String routeTableId;

        @NameInMap("RouteTableType")
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
             * The ID of the route table that is associated with the vSwitch.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * The type of the route table. Valid values:
             * <p>
             * 
             * *   **System**: system route table
             * *   **Custom**: custom route table
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
}
