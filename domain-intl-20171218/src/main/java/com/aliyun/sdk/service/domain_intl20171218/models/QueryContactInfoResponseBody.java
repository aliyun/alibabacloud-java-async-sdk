// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryContactInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryContactInfoResponseBody</p>
 */
public class QueryContactInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("CreateDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("PostalCode")
    private String postalCode;

    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("RegistrantName")
    private String registrantName;

    @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TelArea")
    private String telArea;

    @com.aliyun.core.annotation.NameInMap("TelExt")
    private String telExt;

    @com.aliyun.core.annotation.NameInMap("Telephone")
    private String telephone;

    private QueryContactInfoResponseBody(Builder builder) {
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.createDate = builder.createDate;
        this.email = builder.email;
        this.postalCode = builder.postalCode;
        this.province = builder.province;
        this.registrantName = builder.registrantName;
        this.registrantOrganization = builder.registrantOrganization;
        this.requestId = builder.requestId;
        this.telArea = builder.telArea;
        this.telExt = builder.telExt;
        this.telephone = builder.telephone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContactInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
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
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
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
     * @return registrantName
     */
    public String getRegistrantName() {
        return this.registrantName;
    }

    /**
     * @return registrantOrganization
     */
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return telArea
     */
    public String getTelArea() {
        return this.telArea;
    }

    /**
     * @return telExt
     */
    public String getTelExt() {
        return this.telExt;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    public static final class Builder {
        private String address; 
        private String city; 
        private String country; 
        private String createDate; 
        private String email; 
        private String postalCode; 
        private String province; 
        private String registrantName; 
        private String registrantOrganization; 
        private String requestId; 
        private String telArea; 
        private String telExt; 
        private String telephone; 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
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
         * CreateDate.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * PostalCode.
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
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
         * RegistrantName.
         */
        public Builder registrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }

        /**
         * RegistrantOrganization.
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
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
         * TelArea.
         */
        public Builder telArea(String telArea) {
            this.telArea = telArea;
            return this;
        }

        /**
         * TelExt.
         */
        public Builder telExt(String telExt) {
            this.telExt = telExt;
            return this;
        }

        /**
         * Telephone.
         */
        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public QueryContactInfoResponseBody build() {
            return new QueryContactInfoResponseBody(this);
        } 

    } 

}
