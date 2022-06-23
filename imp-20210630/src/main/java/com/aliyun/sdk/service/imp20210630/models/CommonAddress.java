// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonAddress} extends {@link TeaModel}
 *
 * <p>CommonAddress</p>
 */
public class CommonAddress extends TeaModel {
    @NameInMap("Address")
    private String address;

    @NameInMap("City")
    private String city;

    @NameInMap("Country")
    private String country;

    @NameInMap("State")
    private String state;

    @NameInMap("Zip")
    private String zip;

    private CommonAddress(Builder builder) {
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.state = builder.state;
        this.zip = builder.zip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonAddress create() {
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
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return zip
     */
    public String getZip() {
        return this.zip;
    }

    public static final class Builder {
        private String address; 
        private String city; 
        private String country; 
        private String state; 
        private String zip; 

        /**
         * 地址
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * 城市
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * 国家
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * 区域
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * zip
         */
        public Builder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public CommonAddress build() {
            return new CommonAddress(this);
        } 

    } 

}
