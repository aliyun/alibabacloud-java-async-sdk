// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustomerAddressListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomerAddressListResponseBody</p>
 */
public class QueryCustomerAddressListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCustomerAddressListResponseBody build() {
            return new QueryCustomerAddressListResponseBody(this);
        } 

    } 

    public static class CustomerInvoiceAddress extends TeaModel {
        @NameInMap("Addressee")
        private String addressee;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("City")
        private String city;

        @NameInMap("County")
        private String county;

        @NameInMap("DeliveryAddress")
        private String deliveryAddress;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("PostalCode")
        private String postalCode;

        @NameInMap("Province")
        private String province;

        @NameInMap("Street")
        private String street;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("UserNick")
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
             * The addressee.
             */
            public Builder addressee(String addressee) {
                this.addressee = addressee;
                return this;
            }

            /**
             * The business type.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The city to which the invoice is mailed.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * The name of the district to which the invoice is mailed.
             */
            public Builder county(String county) {
                this.county = county;
                return this;
            }

            /**
             * The detailed address to which the invoice is mailed. This parameter is returned after fields are concatenated.
             */
            public Builder deliveryAddress(String deliveryAddress) {
                this.deliveryAddress = deliveryAddress;
                return this;
            }

            /**
             * The ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The phone number of the addressee.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The postcode.
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * The province to which the invoice is mailed.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * The name of the street to which the invoice is mailed.
             */
            public Builder street(String street) {
                this.street = street;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The nickname of the user.
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
    public static class CustomerInvoiceAddressList extends TeaModel {
        @NameInMap("CustomerInvoiceAddress")
        private java.util.List < CustomerInvoiceAddress> customerInvoiceAddress;

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
        public java.util.List < CustomerInvoiceAddress> getCustomerInvoiceAddress() {
            return this.customerInvoiceAddress;
        }

        public static final class Builder {
            private java.util.List < CustomerInvoiceAddress> customerInvoiceAddress; 

            /**
             * CustomerInvoiceAddress.
             */
            public Builder customerInvoiceAddress(java.util.List < CustomerInvoiceAddress> customerInvoiceAddress) {
                this.customerInvoiceAddress = customerInvoiceAddress;
                return this;
            }

            public CustomerInvoiceAddressList build() {
                return new CustomerInvoiceAddressList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CustomerInvoiceAddressList")
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
             * The details of addresses to which invoices are mailed.
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
