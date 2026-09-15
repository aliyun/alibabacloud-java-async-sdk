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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCustomerGatewaysResponseBody model) {
            this.customerGateways = model.customerGateways;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CustomerGateways.
         */
        public Builder customerGateways(CustomerGateways customerGateways) {
            this.customerGateways = customerGateways;
            return this;
        }

        /**
         * <p>The page number of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query.</p>
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
         * <p>The total number of entries in the list.</p>
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
     * {@link DescribeCustomerGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerGatewaysResponseBody</p>
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

            private Builder() {
            } 

            private Builder(CustomerGateway model) {
                this.asn = model.asn;
                this.authKey = model.authKey;
                this.createTime = model.createTime;
                this.customerGatewayId = model.customerGatewayId;
                this.description = model.description;
                this.ipAddress = model.ipAddress;
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
            } 

            /**
             * Asn.
             */
            public Builder asn(Long asn) {
                this.asn = asn;
                return this;
            }

            /**
             * AuthKey.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomerGatewayId.
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
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
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Tags.
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
        private java.util.List<CustomerGateway> customerGateway;

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
        public java.util.List<CustomerGateway> getCustomerGateway() {
            return this.customerGateway;
        }

        public static final class Builder {
            private java.util.List<CustomerGateway> customerGateway; 

            private Builder() {
            } 

            private Builder(CustomerGateways model) {
                this.customerGateway = model.customerGateway;
            } 

            /**
             * CustomerGateway.
             */
            public Builder customerGateway(java.util.List<CustomerGateway> customerGateway) {
                this.customerGateway = customerGateway;
                return this;
            }

            public CustomerGateways build() {
                return new CustomerGateways(this);
            } 

        } 

    }
}
