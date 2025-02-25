// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link CreateShopRequest} extends {@link RequestModel}
 *
 * <p>CreateShopRequest</p>
 */
public class CreateShopRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopList")
    private java.util.List<ShopList> shopList;

    private CreateShopRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.shopList = builder.shopList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateShopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return shopList
     */
    public java.util.List<ShopList> getShopList() {
        return this.shopList;
    }

    public static final class Builder extends Request.Builder<CreateShopRequest, Builder> {
        private String country; 
        private java.util.List<ShopList> shopList; 

        private Builder() {
            super();
        } 

        private Builder(CreateShopRequest request) {
            super(request);
            this.country = request.country;
            this.shopList = request.shopList;
        } 

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * ShopList.
         */
        public Builder shopList(java.util.List<ShopList> shopList) {
            String shopListShrink = shrink(shopList, "ShopList", "json");
            this.putBodyParameter("ShopList", shopListShrink);
            this.shopList = shopList;
            return this;
        }

        @Override
        public CreateShopRequest build() {
            return new CreateShopRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateShopRequest} extends {@link TeaModel}
     *
     * <p>CreateShopRequest</p>
     */
    public static class ShopList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private Integer businessStatus;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("RegionAddress")
        private String regionAddress;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ShopGroupIds")
        private java.util.List<String> shopGroupIds;

        @com.aliyun.core.annotation.NameInMap("ShopId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String shopId;

        @com.aliyun.core.annotation.NameInMap("ShopName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String shopName;

        @com.aliyun.core.annotation.NameInMap("WeekdaysEndTime")
        private String weekdaysEndTime;

        @com.aliyun.core.annotation.NameInMap("WeekdaysStartTime")
        private String weekdaysStartTime;

        @com.aliyun.core.annotation.NameInMap("WeekendEndTime")
        private String weekendEndTime;

        @com.aliyun.core.annotation.NameInMap("WeekendStartTime")
        private String weekendStartTime;

        private ShopList(Builder builder) {
            this.businessStatus = builder.businessStatus;
            this.latitude = builder.latitude;
            this.location = builder.location;
            this.longitude = builder.longitude;
            this.regionAddress = builder.regionAddress;
            this.regionCode = builder.regionCode;
            this.remark = builder.remark;
            this.shopGroupIds = builder.shopGroupIds;
            this.shopId = builder.shopId;
            this.shopName = builder.shopName;
            this.weekdaysEndTime = builder.weekdaysEndTime;
            this.weekdaysStartTime = builder.weekdaysStartTime;
            this.weekendEndTime = builder.weekendEndTime;
            this.weekendStartTime = builder.weekendStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShopList create() {
            return builder().build();
        }

        /**
         * @return businessStatus
         */
        public Integer getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return regionAddress
         */
        public String getRegionAddress() {
            return this.regionAddress;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return shopGroupIds
         */
        public java.util.List<String> getShopGroupIds() {
            return this.shopGroupIds;
        }

        /**
         * @return shopId
         */
        public String getShopId() {
            return this.shopId;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        /**
         * @return weekdaysEndTime
         */
        public String getWeekdaysEndTime() {
            return this.weekdaysEndTime;
        }

        /**
         * @return weekdaysStartTime
         */
        public String getWeekdaysStartTime() {
            return this.weekdaysStartTime;
        }

        /**
         * @return weekendEndTime
         */
        public String getWeekendEndTime() {
            return this.weekendEndTime;
        }

        /**
         * @return weekendStartTime
         */
        public String getWeekendStartTime() {
            return this.weekendStartTime;
        }

        public static final class Builder {
            private Integer businessStatus; 
            private String latitude; 
            private String location; 
            private String longitude; 
            private String regionAddress; 
            private String regionCode; 
            private String remark; 
            private java.util.List<String> shopGroupIds; 
            private String shopId; 
            private String shopName; 
            private String weekdaysEndTime; 
            private String weekdaysStartTime; 
            private String weekendEndTime; 
            private String weekendStartTime; 

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(Integer businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * RegionAddress.
             */
            public Builder regionAddress(String regionAddress) {
                this.regionAddress = regionAddress;
                return this;
            }

            /**
             * RegionCode.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ShopGroupIds.
             */
            public Builder shopGroupIds(java.util.List<String> shopGroupIds) {
                this.shopGroupIds = shopGroupIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ShopId</p>
             */
            public Builder shopId(String shopId) {
                this.shopId = shopId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder shopName(String shopName) {
                this.shopName = shopName;
                return this;
            }

            /**
             * WeekdaysEndTime.
             */
            public Builder weekdaysEndTime(String weekdaysEndTime) {
                this.weekdaysEndTime = weekdaysEndTime;
                return this;
            }

            /**
             * WeekdaysStartTime.
             */
            public Builder weekdaysStartTime(String weekdaysStartTime) {
                this.weekdaysStartTime = weekdaysStartTime;
                return this;
            }

            /**
             * WeekendEndTime.
             */
            public Builder weekendEndTime(String weekendEndTime) {
                this.weekendEndTime = weekendEndTime;
                return this;
            }

            /**
             * WeekendStartTime.
             */
            public Builder weekendStartTime(String weekendStartTime) {
                this.weekendStartTime = weekendStartTime;
                return this;
            }

            public ShopList build() {
                return new ShopList(this);
            } 

        } 

    }
}
