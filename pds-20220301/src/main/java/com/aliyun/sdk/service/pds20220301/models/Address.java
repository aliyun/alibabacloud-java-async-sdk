// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    @com.aliyun.core.annotation.NameInMap("city")
    private String city;

    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("district")
    private String district;

    @com.aliyun.core.annotation.NameInMap("province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("township")
    private String township;

    private Address(Builder builder) {
        this.city = builder.city;
        this.country = builder.country;
        this.district = builder.district;
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
        private String city; 
        private String country; 
        private String district; 
        private String province; 
        private String township; 

        private Builder() {
        } 

        private Builder(Address model) {
            this.city = model.city;
            this.country = model.country;
            this.district = model.district;
            this.province = model.province;
            this.township = model.township;
        } 

        /**
         * city.
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * district.
         */
        public Builder district(String district) {
            this.district = district;
            return this;
        }

        /**
         * province.
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * township.
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
