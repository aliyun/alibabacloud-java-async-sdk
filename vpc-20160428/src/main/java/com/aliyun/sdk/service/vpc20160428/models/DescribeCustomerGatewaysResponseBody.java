// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomerGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerGatewaysResponseBody</p>
 */
public class DescribeCustomerGatewaysResponseBody extends TeaModel {
    @NameInMap("CustomerGateways")
    private CustomerGateways customerGateways;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The tag value.
         */
        public Builder customerGateways(CustomerGateways customerGateways) {
            this.customerGateways = customerGateways;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCustomerGatewaysResponseBody build() {
            return new DescribeCustomerGatewaysResponseBody(this);
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
    public static class CustomerGateway extends TeaModel {
        @NameInMap("Asn")
        private Long asn;

        @NameInMap("AuthKey")
        private String authKey;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @NameInMap("Description")
        private String description;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Name")
        private String name;

        @NameInMap("Tags")
        private Tags tags;

        private CustomerGateway(Builder builder) {
            this.asn = builder.asn;
            this.authKey = builder.authKey;
            this.createTime = builder.createTime;
            this.customerGatewayId = builder.customerGatewayId;
            this.description = builder.description;
            this.ipAddress = builder.ipAddress;
            this.name = builder.name;
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
            private Tags tags; 

            /**
             * The autonomous system number (ASN) of the gateway device in the data center.
             */
            public Builder asn(Long asn) {
                this.asn = asn;
                return this;
            }

            /**
             * The authentication key of the BGP routing protocol for the gateway device in the data center.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * The timestamp generated when the customer gateway was created. Unit: milliseconds.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the customer gateway.
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * The description of the customer gateway.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The public IP address of the gateway device in the data center.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The name of the customer gateway.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The list of tags added to the customer gateway.
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
    public static class CustomerGateways extends TeaModel {
        @NameInMap("CustomerGateway")
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
