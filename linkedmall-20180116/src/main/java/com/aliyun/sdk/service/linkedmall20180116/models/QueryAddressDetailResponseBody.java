// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAddressDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAddressDetailResponseBody</p>
 */
public class QueryAddressDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DeliveryAddress")
    private DeliveryAddress deliveryAddress;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryAddressDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.deliveryAddress = builder.deliveryAddress;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAddressDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deliveryAddress
     */
    public DeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
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

    public static final class Builder {
        private String code; 
        private DeliveryAddress deliveryAddress; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DeliveryAddress.
         */
        public Builder deliveryAddress(DeliveryAddress deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAddressDetailResponseBody build() {
            return new QueryAddressDetailResponseBody(this);
        } 

    } 

    public static class DeliveryAddress extends TeaModel {
        @NameInMap("AddressDetail")
        private String addressDetail;

        @NameInMap("AddressId")
        private Long addressId;

        @NameInMap("Area")
        private String area;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("DivisionCode")
        private String divisionCode;

        @NameInMap("FullName")
        private String fullName;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("PostCode")
        private String postCode;

        @NameInMap("Province")
        private String province;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Town")
        private String town;

        @NameInMap("TownDivisionCode")
        private String townDivisionCode;

        private DeliveryAddress(Builder builder) {
            this.addressDetail = builder.addressDetail;
            this.addressId = builder.addressId;
            this.area = builder.area;
            this.city = builder.city;
            this.country = builder.country;
            this.divisionCode = builder.divisionCode;
            this.fullName = builder.fullName;
            this.mobile = builder.mobile;
            this.postCode = builder.postCode;
            this.province = builder.province;
            this.status = builder.status;
            this.town = builder.town;
            this.townDivisionCode = builder.townDivisionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryAddress create() {
            return builder().build();
        }

        /**
         * @return addressDetail
         */
        public String getAddressDetail() {
            return this.addressDetail;
        }

        /**
         * @return addressId
         */
        public Long getAddressId() {
            return this.addressId;
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return divisionCode
         */
        public String getDivisionCode() {
            return this.divisionCode;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return postCode
         */
        public String getPostCode() {
            return this.postCode;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return town
         */
        public String getTown() {
            return this.town;
        }

        /**
         * @return townDivisionCode
         */
        public String getTownDivisionCode() {
            return this.townDivisionCode;
        }

        public static final class Builder {
            private String addressDetail; 
            private Long addressId; 
            private String area; 
            private String city; 
            private String country; 
            private String divisionCode; 
            private String fullName; 
            private String mobile; 
            private String postCode; 
            private String province; 
            private Integer status; 
            private String town; 
            private String townDivisionCode; 

            /**
             * AddressDetail.
             */
            public Builder addressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
                return this;
            }

            /**
             * AddressId.
             */
            public Builder addressId(Long addressId) {
                this.addressId = addressId;
                return this;
            }

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * DivisionCode.
             */
            public Builder divisionCode(String divisionCode) {
                this.divisionCode = divisionCode;
                return this;
            }

            /**
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * PostCode.
             */
            public Builder postCode(String postCode) {
                this.postCode = postCode;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Town.
             */
            public Builder town(String town) {
                this.town = town;
                return this;
            }

            /**
             * TownDivisionCode.
             */
            public Builder townDivisionCode(String townDivisionCode) {
                this.townDivisionCode = townDivisionCode;
                return this;
            }

            public DeliveryAddress build() {
                return new DeliveryAddress(this);
            } 

        } 

    }
}
