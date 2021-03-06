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
         * CustomerGateways.
         */
        public Builder customerGateways(CustomerGateways customerGateways) {
            this.customerGateways = customerGateways;
            return this;
        }

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

        public DescribeCustomerGatewaysResponseBody build() {
            return new DescribeCustomerGatewaysResponseBody(this);
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

        private CustomerGateway(Builder builder) {
            this.asn = builder.asn;
            this.authKey = builder.authKey;
            this.createTime = builder.createTime;
            this.customerGatewayId = builder.customerGatewayId;
            this.description = builder.description;
            this.ipAddress = builder.ipAddress;
            this.name = builder.name;
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

        public static final class Builder {
            private Long asn; 
            private String authKey; 
            private Long createTime; 
            private String customerGatewayId; 
            private String description; 
            private String ipAddress; 
            private String name; 

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
