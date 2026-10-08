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
 * {@link AddressForStory} extends {@link TeaModel}
 *
 * <p>AddressForStory</p>
 */
public class AddressForStory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.NameInMap("District")
    private String district;

    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("Township")
    private String township;

    private AddressForStory(Builder builder) {
        this.city = builder.city;
        this.country = builder.country;
        this.district = builder.district;
        this.province = builder.province;
        this.township = builder.township;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressForStory create() {
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

        private Builder(AddressForStory model) {
            this.city = model.city;
            this.country = model.country;
            this.district = model.district;
            this.province = model.province;
            this.township = model.township;
        } 

        /**
         * <p>The city.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * <p>The country.</p>
         * 
         * <strong>example:</strong>
         * <p>中国</p>
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * <p>The district.</p>
         * 
         * <strong>example:</strong>
         * <p>滨江区</p>
         */
        public Builder district(String district) {
            this.district = district;
            return this;
        }

        /**
         * <p>The province.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省</p>
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * <p>The township.</p>
         * 
         * <strong>example:</strong>
         * <p>长河街道</p>
         */
        public Builder township(String township) {
            this.township = township;
            return this;
        }

        public AddressForStory build() {
            return new AddressForStory(this);
        } 

    } 

}
