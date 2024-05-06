// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6GatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6GatewayAttributeResponseBody</p>
 */
public class DescribeIpv6GatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("GatewayRouteTableId")
    private String gatewayRouteTableId;

    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.NameInMap("Ipv6GatewayId")
    private String ipv6GatewayId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeIpv6GatewayAttributeResponseBody(Builder builder) {
        this.businessStatus = builder.businessStatus;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.gatewayRouteTableId = builder.gatewayRouteTableId;
        this.instanceChargeType = builder.instanceChargeType;
        this.ipv6GatewayId = builder.ipv6GatewayId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6GatewayAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
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
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return gatewayRouteTableId
     */
    public String getGatewayRouteTableId() {
        return this.gatewayRouteTableId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return ipv6GatewayId
     */
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String businessStatus; 
        private String creationTime; 
        private String description; 
        private String expiredTime; 
        private String gatewayRouteTableId; 
        private String instanceChargeType; 
        private String ipv6GatewayId; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private Tags tags; 
        private String vpcId; 

        /**
         * The status of the IPv6 gateway. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **FinancialLocked**
         * *   **SecurityLocked**
         */
        public Builder businessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * The time when the IPv6 gateway was created.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The description of the IPv6 gateway.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The time when the IPv6 gateway expires.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The ID of the gateway route table associated with the IPv6 gateway.
         * <p>
         * 
         * >  This parameter is available only when the IPv6 gateway is associated with a gateway route table.
         */
        public Builder gatewayRouteTableId(String gatewayRouteTableId) {
            this.gatewayRouteTableId = gatewayRouteTableId;
            return this;
        }

        /**
         * The metering method of the IPv6 gateway.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The ID of the IPv6 gateway.
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }

        /**
         * The name of the IPv6 gateway.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where the IPv6 gateway is deployed.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The status of the IPv6 gateway. Valid values:
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
         * The information about the tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the IPv6 gateway belongs.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeIpv6GatewayAttributeResponseBody build() {
            return new DescribeIpv6GatewayAttributeResponseBody(this);
        } 

    } 

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
             * The key of tag N. You can specify at most 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 128 characters in length. It must start with a letter and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N. You can specify at most 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length. It must start with a letter and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
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
