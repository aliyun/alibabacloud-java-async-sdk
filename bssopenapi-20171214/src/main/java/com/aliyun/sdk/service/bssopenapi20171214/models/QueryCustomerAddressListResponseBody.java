// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryCustomerAddressListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomerAddressListResponseBody</p>
 */
public class QueryCustomerAddressListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCustomerAddressListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomerAddressListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BBEF51A3-E933-4F40-A534-C673CBDB9C80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCustomerAddressListResponseBody build() {
            return new QueryCustomerAddressListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCustomerAddressListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomerAddressListResponseBody</p>
     */
    public static class CustomerInvoiceAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addressee")
        private String addressee;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("County")
        private String county;

        @com.aliyun.core.annotation.NameInMap("DeliveryAddress")
        private String deliveryAddress;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("PostalCode")
        private String postalCode;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Street")
        private String street;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserNick")
        private String userNick;

        private CustomerInvoiceAddress(Builder builder) {
            this.addressee = builder.addressee;
            this.bizType = builder.bizType;
            this.city = builder.city;
            this.county = builder.county;
            this.deliveryAddress = builder.deliveryAddress;
            this.id = builder.id;
            this.phone = builder.phone;
            this.postalCode = builder.postalCode;
            this.province = builder.province;
            this.street = builder.street;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerInvoiceAddress create() {
            return builder().build();
        }

        /**
         * @return addressee
         */
        public String getAddressee() {
            return this.addressee;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return county
         */
        public String getCounty() {
            return this.county;
        }

        /**
         * @return deliveryAddress
         */
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return postalCode
         */
        public String getPostalCode() {
            return this.postalCode;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return street
         */
        public String getStreet() {
            return this.street;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String addressee; 
            private String bizType; 
            private String city; 
            private String county; 
            private String deliveryAddress; 
            private Long id; 
            private String phone; 
            private String postalCode; 
            private String province; 
            private String street; 
            private Long userId; 
            private String userNick; 

            /**
             * <p>The addressee.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder addressee(String addressee) {
                this.addressee = addressee;
                return this;
            }

            /**
             * <p>The business type.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The city to which the invoice is mailed.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The name of the district to which the invoice is mailed.</p>
             * 
             * <strong>example:</strong>
             * <p>Test District</p>
             */
            public Builder county(String county) {
                this.county = county;
                return this;
            }

            /**
             * <p>The detailed address to which the invoice is mailed. This parameter is returned after fields are concatenated.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Address</p>
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>311601051</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The phone number of the addressee.</p>
             * 
             * <strong>example:</strong>
             * <p>138xxxxxxxx</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The postcode.</p>
             * 
             * <strong>example:</strong>
             * <p>000000</p>
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * <p>The province to which the invoice is mailed.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The name of the street to which the invoice is mailed.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Street</p>
             */
            public Builder street(String street) {
                this.street = street;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>4382956342857</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>testNick</p>
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public CustomerInvoiceAddress build() {
                return new CustomerInvoiceAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCustomerAddressListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomerAddressListResponseBody</p>
     */
    public static class CustomerInvoiceAddressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerInvoiceAddress")
        private java.util.List<CustomerInvoiceAddress> customerInvoiceAddress;

        private CustomerInvoiceAddressList(Builder builder) {
            this.customerInvoiceAddress = builder.customerInvoiceAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomerInvoiceAddressList create() {
            return builder().build();
        }

        /**
         * @return customerInvoiceAddress
         */
        public java.util.List<CustomerInvoiceAddress> getCustomerInvoiceAddress() {
            return this.customerInvoiceAddress;
        }

        public static final class Builder {
            private java.util.List<CustomerInvoiceAddress> customerInvoiceAddress; 

            /**
             * CustomerInvoiceAddress.
             */
            public Builder customerInvoiceAddress(java.util.List<CustomerInvoiceAddress> customerInvoiceAddress) {
                this.customerInvoiceAddress = customerInvoiceAddress;
                return this;
            }

            public CustomerInvoiceAddressList build() {
                return new CustomerInvoiceAddressList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCustomerAddressListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomerAddressListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerInvoiceAddressList")
        private CustomerInvoiceAddressList customerInvoiceAddressList;

        private Data(Builder builder) {
            this.customerInvoiceAddressList = builder.customerInvoiceAddressList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customerInvoiceAddressList
         */
        public CustomerInvoiceAddressList getCustomerInvoiceAddressList() {
            return this.customerInvoiceAddressList;
        }

        public static final class Builder {
            private CustomerInvoiceAddressList customerInvoiceAddressList; 

            /**
             * <p>The details of addresses to which invoices are mailed.</p>
             */
            public Builder customerInvoiceAddressList(CustomerInvoiceAddressList customerInvoiceAddressList) {
                this.customerInvoiceAddressList = customerInvoiceAddressList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
