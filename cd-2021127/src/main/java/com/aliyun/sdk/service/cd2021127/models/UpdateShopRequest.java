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
 * {@link UpdateShopRequest} extends {@link RequestModel}
 *
 * <p>UpdateShopRequest</p>
 */
public class UpdateShopRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private Integer businessStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Latitude")
    private String latitude;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Longitude")
    private String longitude;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionAddress")
    private String regionAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    private String regionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopGroupIds")
    private java.util.List<String> shopGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shopName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WeekdaysEndTime")
    private String weekdaysEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WeekdaysStartTime")
    private String weekdaysStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WeekendEndTime")
    private String weekendEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WeekendStartTime")
    private String weekendStartTime;

    private UpdateShopRequest(Builder builder) {
        super(builder);
        this.businessStatus = builder.businessStatus;
        this.country = builder.country;
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

    public static UpdateShopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessStatus
     */
    public Integer getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
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

    public static final class Builder extends Request.Builder<UpdateShopRequest, Builder> {
        private Integer businessStatus; 
        private String country; 
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

        private Builder() {
            super();
        } 

        private Builder(UpdateShopRequest request) {
            super(request);
            this.businessStatus = request.businessStatus;
            this.country = request.country;
            this.latitude = request.latitude;
            this.location = request.location;
            this.longitude = request.longitude;
            this.regionAddress = request.regionAddress;
            this.regionCode = request.regionCode;
            this.remark = request.remark;
            this.shopGroupIds = request.shopGroupIds;
            this.shopId = request.shopId;
            this.shopName = request.shopName;
            this.weekdaysEndTime = request.weekdaysEndTime;
            this.weekdaysStartTime = request.weekdaysStartTime;
            this.weekendEndTime = request.weekendEndTime;
            this.weekendStartTime = request.weekendStartTime;
        } 

        /**
         * BusinessStatus.
         */
        public Builder businessStatus(Integer businessStatus) {
            this.putBodyParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
            return this;
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
         * Latitude.
         */
        public Builder latitude(String latitude) {
            this.putBodyParameter("Latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * Longitude.
         */
        public Builder longitude(String longitude) {
            this.putBodyParameter("Longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * RegionAddress.
         */
        public Builder regionAddress(String regionAddress) {
            this.putBodyParameter("RegionAddress", regionAddress);
            this.regionAddress = regionAddress;
            return this;
        }

        /**
         * RegionCode.
         */
        public Builder regionCode(String regionCode) {
            this.putBodyParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ShopGroupIds.
         */
        public Builder shopGroupIds(java.util.List<String> shopGroupIds) {
            String shopGroupIdsShrink = shrink(shopGroupIds, "ShopGroupIds", "json");
            this.putBodyParameter("ShopGroupIds", shopGroupIdsShrink);
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
            this.putBodyParameter("ShopId", shopId);
            this.shopId = shopId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder shopName(String shopName) {
            this.putBodyParameter("ShopName", shopName);
            this.shopName = shopName;
            return this;
        }

        /**
         * WeekdaysEndTime.
         */
        public Builder weekdaysEndTime(String weekdaysEndTime) {
            this.putBodyParameter("WeekdaysEndTime", weekdaysEndTime);
            this.weekdaysEndTime = weekdaysEndTime;
            return this;
        }

        /**
         * WeekdaysStartTime.
         */
        public Builder weekdaysStartTime(String weekdaysStartTime) {
            this.putBodyParameter("WeekdaysStartTime", weekdaysStartTime);
            this.weekdaysStartTime = weekdaysStartTime;
            return this;
        }

        /**
         * WeekendEndTime.
         */
        public Builder weekendEndTime(String weekendEndTime) {
            this.putBodyParameter("WeekendEndTime", weekendEndTime);
            this.weekendEndTime = weekendEndTime;
            return this;
        }

        /**
         * WeekendStartTime.
         */
        public Builder weekendStartTime(String weekendStartTime) {
            this.putBodyParameter("WeekendStartTime", weekendStartTime);
            this.weekendStartTime = weekendStartTime;
            return this;
        }

        @Override
        public UpdateShopRequest build() {
            return new UpdateShopRequest(this);
        } 

    } 

}
