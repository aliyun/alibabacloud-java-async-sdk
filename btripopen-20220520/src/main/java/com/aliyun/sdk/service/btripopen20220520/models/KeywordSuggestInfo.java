// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link KeywordSuggestInfo} extends {@link TeaModel}
 *
 * <p>KeywordSuggestInfo</p>
 */
public class KeywordSuggestInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("business_area_with_city")
    private KeywordSuggestInfo businessAreaWithCity;

    @com.aliyun.core.annotation.NameInMap("city_code")
    private Integer cityCode;

    @com.aliyun.core.annotation.NameInMap("city_name")
    private String cityName;

    @com.aliyun.core.annotation.NameInMap("display_name")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("hotel_id")
    private String hotelId;

    @com.aliyun.core.annotation.NameInMap("icon")
    private String icon;

    @com.aliyun.core.annotation.NameInMap("point")
    private String point;

    @com.aliyun.core.annotation.NameInMap("price")
    private String price;

    @com.aliyun.core.annotation.NameInMap("region")
    private Integer region;

    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("type_desc")
    private String typeDesc;

    private KeywordSuggestInfo(Builder builder) {
        this.address = builder.address;
        this.businessAreaWithCity = builder.businessAreaWithCity;
        this.cityCode = builder.cityCode;
        this.cityName = builder.cityName;
        this.displayName = builder.displayName;
        this.hotelId = builder.hotelId;
        this.icon = builder.icon;
        this.point = builder.point;
        this.price = builder.price;
        this.region = builder.region;
        this.type = builder.type;
        this.typeDesc = builder.typeDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KeywordSuggestInfo create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return businessAreaWithCity
     */
    public KeywordSuggestInfo getBusinessAreaWithCity() {
        return this.businessAreaWithCity;
    }

    /**
     * @return cityCode
     */
    public Integer getCityCode() {
        return this.cityCode;
    }

    /**
     * @return cityName
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return point
     */
    public String getPoint() {
        return this.point;
    }

    /**
     * @return price
     */
    public String getPrice() {
        return this.price;
    }

    /**
     * @return region
     */
    public Integer getRegion() {
        return this.region;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return typeDesc
     */
    public String getTypeDesc() {
        return this.typeDesc;
    }

    public static final class Builder {
        private String address; 
        private KeywordSuggestInfo businessAreaWithCity; 
        private Integer cityCode; 
        private String cityName; 
        private String displayName; 
        private String hotelId; 
        private String icon; 
        private String point; 
        private String price; 
        private Integer region; 
        private Integer type; 
        private String typeDesc; 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * business_area_with_city.
         */
        public Builder businessAreaWithCity(KeywordSuggestInfo businessAreaWithCity) {
            this.businessAreaWithCity = businessAreaWithCity;
            return this;
        }

        /**
         * city_code.
         */
        public Builder cityCode(Integer cityCode) {
            this.cityCode = cityCode;
            return this;
        }

        /**
         * city_name.
         */
        public Builder cityName(String cityName) {
            this.cityName = cityName;
            return this;
        }

        /**
         * display_name.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * hotel_id.
         */
        public Builder hotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }

        /**
         * icon.
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * point.
         */
        public Builder point(String point) {
            this.point = point;
            return this;
        }

        /**
         * price.
         */
        public Builder price(String price) {
            this.price = price;
            return this;
        }

        /**
         * region.
         */
        public Builder region(Integer region) {
            this.region = region;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * type_desc.
         */
        public Builder typeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
            return this;
        }

        public KeywordSuggestInfo build() {
            return new KeywordSuggestInfo(this);
        } 

    } 

}
