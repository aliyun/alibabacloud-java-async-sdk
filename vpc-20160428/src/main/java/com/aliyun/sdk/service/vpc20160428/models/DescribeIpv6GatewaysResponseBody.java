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
 * {@link DescribeIpv6GatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6GatewaysResponseBody</p>
 */
public class DescribeIpv6GatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6Gateways")
    private Ipv6Gateways ipv6Gateways;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpv6GatewaysResponseBody(Builder builder) {
        this.ipv6Gateways = builder.ipv6Gateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6GatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipv6Gateways
     */
    public Ipv6Gateways getIpv6Gateways() {
        return this.ipv6Gateways;
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

    public static final class Builder {
        private Ipv6Gateways ipv6Gateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeIpv6GatewaysResponseBody model) {
            this.ipv6Gateways = model.ipv6Gateways;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the IPv6 gateway.</p>
         */
        public Builder ipv6Gateways(Ipv6Gateways ipv6Gateways) {
            this.ipv6Gateways = ipv6Gateways;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>E3A06196-3E7C-490D-8F39-CB4B5A0CE8AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIpv6GatewaysResponseBody build() {
            return new DescribeIpv6GatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpv6GatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6GatewaysResponseBody</p>
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
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
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
     * {@link DescribeIpv6GatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6GatewaysResponseBody</p>
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
     * {@link DescribeIpv6GatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6GatewaysResponseBody</p>
     */
    public static class Ipv6Gateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("Ipv6GatewayId")
        private String ipv6GatewayId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Ipv6Gateway(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.ipv6GatewayId = builder.ipv6GatewayId;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Gateway create() {
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
        public String getOwnerId() {
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
            private String instanceChargeType; 
            private String ipv6GatewayId; 
            private String name; 
            private String ownerId; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Ipv6Gateway model) {
                this.businessStatus = model.businessStatus;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.instanceChargeType = model.instanceChargeType;
                this.ipv6GatewayId = model.ipv6GatewayId;
                this.name = model.name;
                this.ownerId = model.ownerId;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The status of the IPv6 gateway. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * <li><strong>SecurityLocked</strong></li>
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
             * <p>2020-12-20T14:51:23Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the IPv6 gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>descriptionforIPv6GW</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the IPv6 gateway expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-20T14:51:23Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The billing method of the IPv6 gateway.</p>
             * <p>Only <strong>PostPaid</strong> may be returned, which indicates that the IPv6 gateway uses the pay-as-you-go billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The ID of the IPv6 gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6gw-hp3rwmtmfhgisipv6gw-hp3rwmtmfhgis****</p>
             */
            public Builder ipv6GatewayId(String ipv6GatewayId) {
                this.ipv6GatewayId = ipv6GatewayId;
                return this;
            }

            /**
             * <p>The name of the IPv6 gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6GW</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the region in which the IPv6 gateway is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the IPv6 gateway. Valid values:</p>
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
             * <p>The information about the tags.</p>
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

            public Ipv6Gateway build() {
                return new Ipv6Gateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIpv6GatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpv6GatewaysResponseBody</p>
     */
    public static class Ipv6Gateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Gateway")
        private java.util.List<Ipv6Gateway> ipv6Gateway;

        private Ipv6Gateways(Builder builder) {
            this.ipv6Gateway = builder.ipv6Gateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6Gateways create() {
            return builder().build();
        }

        /**
         * @return ipv6Gateway
         */
        public java.util.List<Ipv6Gateway> getIpv6Gateway() {
            return this.ipv6Gateway;
        }

        public static final class Builder {
            private java.util.List<Ipv6Gateway> ipv6Gateway; 

            private Builder() {
            } 

            private Builder(Ipv6Gateways model) {
                this.ipv6Gateway = model.ipv6Gateway;
            } 

            /**
             * Ipv6Gateway.
             */
            public Builder ipv6Gateway(java.util.List<Ipv6Gateway> ipv6Gateway) {
                this.ipv6Gateway = ipv6Gateway;
                return this;
            }

            public Ipv6Gateways build() {
                return new Ipv6Gateways(this);
            } 

        } 

    }
}
