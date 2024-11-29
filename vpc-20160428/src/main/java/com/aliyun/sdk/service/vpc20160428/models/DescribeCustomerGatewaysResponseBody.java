// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomerGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerGatewaysResponseBody</p>
 */
public class DescribeCustomerGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomerGateways")
    private CustomerGateways customerGateways;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCustomerGatewaysResponseBody(Builder builder) {
        this.customerGateways = builder.customerGateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerGatewaysResponseBody create() {
        return builder().build();
    }

    /**
     * @return customerGateways
     */
    public CustomerGateways getCustomerGateways() {
        return this.customerGateways;
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
        private CustomerGateways customerGateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about customer gateways.</p>
         */
        public Builder customerGateways(CustomerGateways customerGateways) {
            this.customerGateways = customerGateways;
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
         * <p>E82612A9-CB90-4D7E-B394-1DB7F6509B29</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCustomerGatewaysResponseBody build() {
            return new DescribeCustomerGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomerGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerGatewaysResponseBody</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
     * {@link DescribeCustomerGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerGatewaysResponseBody</p>
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
    /**
     * 
     * {@link DescribeCustomerGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerGatewaysResponseBody</p>
     */
    public static class CustomerGateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Asn")
        private Long asn;

        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private CustomerGateway(Builder builder) {
            this.asn = builder.asn;
            this.authKey = builder.authKey;
            this.createTime = builder.createTime;
            this.customerGatewayId = builder.customerGatewayId;
            this.description = builder.description;
            this.ipAddress = builder.ipAddress;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerGateway create() {
            return builder().build();
        }

        /**
         * @return asn
         */
        public Long getAsn() {
            return this.asn;
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customerGatewayId
         */
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long asn; 
            private String authKey; 
            private Long createTime; 
            private String customerGatewayId; 
            private String description; 
            private String ipAddress; 
            private String name; 
            private String resourceGroupId; 
            private Tags tags; 

            /**
             * <p>The autonomous system number (ASN) of the gateway device in the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>65530</p>
             */
            public Builder asn(Long asn) {
                this.asn = asn;
                return this;
            }

            /**
             * <p>The authentication key that is used to connect to the gateway device in the data center by using Border Gateway Protocol (BGP).</p>
             * 
             * <strong>example:</strong>
             * <p>AuthKey****</p>
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * <p>The time when the customer gateway was created. Unit: millisecond.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1492747187000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The customer gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cgw-bp1pvpl9r9adju6l5****</p>
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * <p>The description of the customer gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The IP address of the gateway device in the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>139.32.XX.XX</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The name of the customer gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the customer gateway belongs.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzs372yg****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags that are added to the customer gateway.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public CustomerGateway build() {
                return new CustomerGateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomerGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerGatewaysResponseBody</p>
     */
    public static class CustomerGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerGateway")
        private java.util.List < CustomerGateway> customerGateway;

        private CustomerGateways(Builder builder) {
            this.customerGateway = builder.customerGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerGateways create() {
            return builder().build();
        }

        /**
         * @return customerGateway
         */
        public java.util.List < CustomerGateway> getCustomerGateway() {
            return this.customerGateway;
        }

        public static final class Builder {
            private java.util.List < CustomerGateway> customerGateway; 

            /**
             * CustomerGateway.
             */
            public Builder customerGateway(java.util.List < CustomerGateway> customerGateway) {
                this.customerGateway = customerGateway;
                return this;
            }

            public CustomerGateways build() {
                return new CustomerGateways(this);
            } 

        } 

    }
}
