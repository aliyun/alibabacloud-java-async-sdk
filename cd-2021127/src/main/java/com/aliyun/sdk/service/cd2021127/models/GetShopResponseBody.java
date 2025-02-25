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
 * {@link GetShopResponseBody} extends {@link TeaModel}
 *
 * <p>GetShopResponseBody</p>
 */
public class GetShopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private Integer businessStatus;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DeviceMacList")
    private java.util.List<String> deviceMacList;

    @com.aliyun.core.annotation.NameInMap("DeviceNum")
    private Integer deviceNum;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private Long gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Latitude")
    private String latitude;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("Longitude")
    private String longitude;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RegionAddress")
    private String regionAddress;

    @com.aliyun.core.annotation.NameInMap("RegionCode")
    private String regionCode;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShopGroupIds")
    private java.util.List<String> shopGroupIds;

    @com.aliyun.core.annotation.NameInMap("ShopId")
    private String shopId;

    @com.aliyun.core.annotation.NameInMap("ShopName")
    private String shopName;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WeekdaysEndTime")
    private String weekdaysEndTime;

    @com.aliyun.core.annotation.NameInMap("WeekdaysStartTime")
    private String weekdaysStartTime;

    @com.aliyun.core.annotation.NameInMap("WeekendEndTime")
    private String weekendEndTime;

    @com.aliyun.core.annotation.NameInMap("WeekendStartTime")
    private String weekendStartTime;

    private GetShopResponseBody(Builder builder) {
        this.businessStatus = builder.businessStatus;
        this.code = builder.code;
        this.deviceMacList = builder.deviceMacList;
        this.deviceNum = builder.deviceNum;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.httpStatusCode = builder.httpStatusCode;
        this.latitude = builder.latitude;
        this.location = builder.location;
        this.longitude = builder.longitude;
        this.message = builder.message;
        this.regionAddress = builder.regionAddress;
        this.regionCode = builder.regionCode;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.shopGroupIds = builder.shopGroupIds;
        this.shopId = builder.shopId;
        this.shopName = builder.shopName;
        this.success = builder.success;
        this.weekdaysEndTime = builder.weekdaysEndTime;
        this.weekdaysStartTime = builder.weekdaysStartTime;
        this.weekendEndTime = builder.weekendEndTime;
        this.weekendStartTime = builder.weekendStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShopResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessStatus
     */
    public Integer getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceMacList
     */
    public java.util.List<String> getDeviceMacList() {
        return this.deviceMacList;
    }

    /**
     * @return deviceNum
     */
    public Integer getDeviceNum() {
        return this.deviceNum;
    }

    /**
     * @return gmtCreateTime
     */
    public Long getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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
        private String code; 
        private java.util.List<String> deviceMacList; 
        private Integer deviceNum; 
        private Long gmtCreateTime; 
        private Integer httpStatusCode; 
        private String latitude; 
        private String location; 
        private String longitude; 
        private String message; 
        private String regionAddress; 
        private String regionCode; 
        private String remark; 
        private String requestId; 
        private java.util.List<String> shopGroupIds; 
        private String shopId; 
        private String shopName; 
        private Boolean success; 
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DeviceMacList.
         */
        public Builder deviceMacList(java.util.List<String> deviceMacList) {
            this.deviceMacList = deviceMacList;
            return this;
        }

        /**
         * DeviceNum.
         */
        public Builder deviceNum(Integer deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * ShopId.
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        /**
         * ShopName.
         */
        public Builder shopName(String shopName) {
            this.shopName = shopName;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
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

        public GetShopResponseBody build() {
            return new GetShopResponseBody(this);
        } 

    } 

}
