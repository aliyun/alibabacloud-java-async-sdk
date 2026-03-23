// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link SetApAddressRequest} extends {@link RequestModel}
 *
 * <p>SetApAddressRequest</p>
 */
public class SetApAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApAreaName")
    private String apAreaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApBuildingName")
    private String apBuildingName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApCampusName")
    private String apCampusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApCityName")
    private String apCityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApFloor")
    private String apFloor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApGroup")
    private String apGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApName")
    private String apName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApNationName")
    private String apNationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApProvinceName")
    private String apProvinceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApUnitId")
    private Long apUnitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApUnitName")
    private String apUnitName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lat")
    private String lat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lng")
    private String lng;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mac;

    private SetApAddressRequest(Builder builder) {
        super(builder);
        this.apAreaName = builder.apAreaName;
        this.apBuildingName = builder.apBuildingName;
        this.apCampusName = builder.apCampusName;
        this.apCityName = builder.apCityName;
        this.apFloor = builder.apFloor;
        this.apGroup = builder.apGroup;
        this.apName = builder.apName;
        this.apNationName = builder.apNationName;
        this.apProvinceName = builder.apProvinceName;
        this.apUnitId = builder.apUnitId;
        this.apUnitName = builder.apUnitName;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.direction = builder.direction;
        this.language = builder.language;
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.mac = builder.mac;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetApAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apAreaName
     */
    public String getApAreaName() {
        return this.apAreaName;
    }

    /**
     * @return apBuildingName
     */
    public String getApBuildingName() {
        return this.apBuildingName;
    }

    /**
     * @return apCampusName
     */
    public String getApCampusName() {
        return this.apCampusName;
    }

    /**
     * @return apCityName
     */
    public String getApCityName() {
        return this.apCityName;
    }

    /**
     * @return apFloor
     */
    public String getApFloor() {
        return this.apFloor;
    }

    /**
     * @return apGroup
     */
    public String getApGroup() {
        return this.apGroup;
    }

    /**
     * @return apName
     */
    public String getApName() {
        return this.apName;
    }

    /**
     * @return apNationName
     */
    public String getApNationName() {
        return this.apNationName;
    }

    /**
     * @return apProvinceName
     */
    public String getApProvinceName() {
        return this.apProvinceName;
    }

    /**
     * @return apUnitId
     */
    public Long getApUnitId() {
        return this.apUnitId;
    }

    /**
     * @return apUnitName
     */
    public String getApUnitName() {
        return this.apUnitName;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return lat
     */
    public String getLat() {
        return this.lat;
    }

    /**
     * @return lng
     */
    public String getLng() {
        return this.lng;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    public static final class Builder extends Request.Builder<SetApAddressRequest, Builder> {
        private String apAreaName; 
        private String apBuildingName; 
        private String apCampusName; 
        private String apCityName; 
        private String apFloor; 
        private String apGroup; 
        private String apName; 
        private String apNationName; 
        private String apProvinceName; 
        private Long apUnitId; 
        private String apUnitName; 
        private String appCode; 
        private String appName; 
        private String direction; 
        private String language; 
        private String lat; 
        private String lng; 
        private String mac; 

        private Builder() {
            super();
        } 

        private Builder(SetApAddressRequest request) {
            super(request);
            this.apAreaName = request.apAreaName;
            this.apBuildingName = request.apBuildingName;
            this.apCampusName = request.apCampusName;
            this.apCityName = request.apCityName;
            this.apFloor = request.apFloor;
            this.apGroup = request.apGroup;
            this.apName = request.apName;
            this.apNationName = request.apNationName;
            this.apProvinceName = request.apProvinceName;
            this.apUnitId = request.apUnitId;
            this.apUnitName = request.apUnitName;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.direction = request.direction;
            this.language = request.language;
            this.lat = request.lat;
            this.lng = request.lng;
            this.mac = request.mac;
        } 

        /**
         * ApAreaName.
         */
        public Builder apAreaName(String apAreaName) {
            this.putQueryParameter("ApAreaName", apAreaName);
            this.apAreaName = apAreaName;
            return this;
        }

        /**
         * ApBuildingName.
         */
        public Builder apBuildingName(String apBuildingName) {
            this.putQueryParameter("ApBuildingName", apBuildingName);
            this.apBuildingName = apBuildingName;
            return this;
        }

        /**
         * ApCampusName.
         */
        public Builder apCampusName(String apCampusName) {
            this.putQueryParameter("ApCampusName", apCampusName);
            this.apCampusName = apCampusName;
            return this;
        }

        /**
         * ApCityName.
         */
        public Builder apCityName(String apCityName) {
            this.putQueryParameter("ApCityName", apCityName);
            this.apCityName = apCityName;
            return this;
        }

        /**
         * ApFloor.
         */
        public Builder apFloor(String apFloor) {
            this.putQueryParameter("ApFloor", apFloor);
            this.apFloor = apFloor;
            return this;
        }

        /**
         * ApGroup.
         */
        public Builder apGroup(String apGroup) {
            this.putQueryParameter("ApGroup", apGroup);
            this.apGroup = apGroup;
            return this;
        }

        /**
         * ApName.
         */
        public Builder apName(String apName) {
            this.putQueryParameter("ApName", apName);
            this.apName = apName;
            return this;
        }

        /**
         * ApNationName.
         */
        public Builder apNationName(String apNationName) {
            this.putQueryParameter("ApNationName", apNationName);
            this.apNationName = apNationName;
            return this;
        }

        /**
         * ApProvinceName.
         */
        public Builder apProvinceName(String apProvinceName) {
            this.putQueryParameter("ApProvinceName", apProvinceName);
            this.apProvinceName = apProvinceName;
            return this;
        }

        /**
         * ApUnitId.
         */
        public Builder apUnitId(Long apUnitId) {
            this.putQueryParameter("ApUnitId", apUnitId);
            this.apUnitId = apUnitId;
            return this;
        }

        /**
         * ApUnitName.
         */
        public Builder apUnitName(String apUnitName) {
            this.putQueryParameter("ApUnitName", apUnitName);
            this.apUnitName = apUnitName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Lat.
         */
        public Builder lat(String lat) {
            this.putQueryParameter("Lat", lat);
            this.lat = lat;
            return this;
        }

        /**
         * Lng.
         */
        public Builder lng(String lng) {
            this.putQueryParameter("Lng", lng);
            this.lng = lng;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        @Override
        public SetApAddressRequest build() {
            return new SetApAddressRequest(this);
        } 

    } 

}
