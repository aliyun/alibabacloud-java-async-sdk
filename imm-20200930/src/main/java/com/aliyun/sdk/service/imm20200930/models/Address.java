// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Address} extends {@link TeaModel}
 *
 * <p>Address</p>
 */
public class Address extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressLine")
    private String addressLine;

    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("District")
    private String district;

    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("Township")
    private String township;

    private Address(Builder builder) {
        this.addressLine = builder.addressLine;
        this.city = builder.city;
        this.country = builder.country;
        this.district = builder.district;
        this.language = builder.language;
        this.province = builder.province;
        this.township = builder.township;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Address create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressLine
     */
    public String getAddressLine() {
        return this.addressLine;
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
     * @return district
     */
    public String getDistrict() {
        return this.district;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return township
     */
    public String getTownship() {
        return this.township;
    }

    public static final class Builder {
        private String addressLine; 
        private String city; 
        private String country; 
        private String district; 
        private String language; 
        private String province; 
        private String township; 

        private Builder() {
        } 

        private Builder(Address model) {
            this.addressLine = model.addressLine;
            this.city = model.city;
            this.country = model.country;
            this.district = model.district;
            this.language = model.language;
            this.province = model.province;
            this.township = model.township;
        } 

        /**
         * AddressLine.
         */
        public Builder addressLine(String addressLine) {
            this.addressLine = addressLine;
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
         * District.
         */
        public Builder district(String district) {
            this.district = district;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
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
         * Township.
         */
        public Builder township(String township) {
            this.township = township;
            return this;
        }

        public Address build() {
            return new Address(this);
        } 

    } 

}
