// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PhysicalSpace} extends {@link TeaModel}
 *
 * <p>PhysicalSpace</p>
 */
public class PhysicalSpace extends TeaModel {
    @NameInMap("Address")
    private String address;

    @NameInMap("City")
    private String city;

    @NameInMap("Country")
    private String country;

    @NameInMap("Province")
    private String province;

    @NameInMap("SpaceId")
    private String spaceId;

    @NameInMap("SpaceName")
    private String spaceName;

    private PhysicalSpace(Builder builder) {
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.province = builder.province;
        this.spaceId = builder.spaceId;
        this.spaceName = builder.spaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhysicalSpace create() {
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
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return spaceName
     */
    public String getSpaceName() {
        return this.spaceName;
    }

    public static final class Builder {
        private String address; 
        private String city; 
        private String country; 
        private String province; 
        private String spaceId; 
        private String spaceName; 

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
         * Province.
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * SpaceName.
         */
        public Builder spaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }

        public PhysicalSpace build() {
            return new PhysicalSpace(this);
        } 

    } 

}
