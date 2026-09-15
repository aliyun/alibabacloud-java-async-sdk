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

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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
        this.ownerId = builder.ownerId;
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

    public Builder toBuilder() {
        return new Builder(this);
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
        private Long ownerId; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private Tags tags; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribeIpv6GatewayAttributeResponseBody model) {
            this.businessStatus = model.businessStatus;
            this.creationTime = model.creationTime;
            this.description = model.description;
            this.expiredTime = model.expiredTime;
            this.gatewayRouteTableId = model.gatewayRouteTableId;
            this.instanceChargeType = model.instanceChargeType;
            this.ipv6GatewayId = model.ipv6GatewayId;
            this.name = model.name;
            this.ownerId = model.ownerId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.tags = model.tags;
            this.vpcId = model.vpcId;
        } 

        /**
         * <p>The business status of the IPv6 gateway. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Normal.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: financial lock.</p>
         * </li>
         * <li><p><strong>SecurityLocked</strong>: security lock.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder businessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * <p>The time when the IPv6 gateway was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-05T09:21:35Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The expiration time of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-1-05T09:21:35Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The ID of the gateway route table associated with the IPv6 gateway.</p>
         * <blockquote>
         * <p>This parameter is displayed only for IPv6 gateways that are associated with a gateway route table.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vtb-5ts0ohchwkp3dydt2****</p>
         */
        public Builder gatewayRouteTableId(String gatewayRouteTableId) {
            this.gatewayRouteTableId = gatewayRouteTableId;
            return this;
        }

        /**
         * <p>The billing method of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance ID of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6gw-hp3y0l3ln89j8cdvf****</p>
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }

        /**
         * <p>The name of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the IPv6 gateway owner.</p>
         * <blockquote>
         * <p>Notice: This value is of the Long type. Precision loss may occur in certain programming languages. Use this value with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2546073170691****</p>
         */
        public Builder ownerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The status of the IPv6 gateway. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: being configured.</p>
         * </li>
         * <li><p><strong>Available</strong>: active.</p>
         * </li>
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
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the IPv6 gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-123sedrfswd23****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeIpv6GatewayAttributeResponseBody build() {
            return new DescribeIpv6GatewayAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpv6GatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6GatewayAttributeResponseBody</p>
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
    /**
     * 
     * {@link DescribeIpv6GatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6GatewayAttributeResponseBody</p>
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
}
