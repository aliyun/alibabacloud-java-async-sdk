// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryAddressListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAddressListResponseBody</p>
 */
public class QueryAddressListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressList")
    private java.util.List<AddressList> addressList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAddressListResponseBody(Builder builder) {
        this.addressList = builder.addressList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAddressListResponseBody create() {
        return builder().build();
    }

    /**
     * @return addressList
     */
    public java.util.List<AddressList> getAddressList() {
        return this.addressList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private java.util.List<AddressList> addressList; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * AddressList.
         */
        public Builder addressList(java.util.List<AddressList> addressList) {
            this.addressList = addressList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        public QueryAddressListResponseBody build() {
            return new QueryAddressListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAddressListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAddressListResponseBody</p>
     */
    public static class AddressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressDetail")
        private String addressDetail;

        @com.aliyun.core.annotation.NameInMap("AddressId")
        private Long addressId;

        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("DivisionCode")
        private String divisionCode;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("PostCode")
        private String postCode;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Town")
        private String town;

        @com.aliyun.core.annotation.NameInMap("TownDivisionCode")
        private String townDivisionCode;

        private AddressList(Builder builder) {
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

        public static AddressList create() {
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

            public AddressList build() {
                return new AddressList(this);
            } 

        } 

    }
}
