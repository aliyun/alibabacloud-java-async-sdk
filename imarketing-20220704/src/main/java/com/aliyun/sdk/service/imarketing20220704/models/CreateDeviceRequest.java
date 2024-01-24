// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceRequest</p>
 */
public class CreateDeviceRequest extends Request {
    @Body
    @NameInMap("ChannelId")
    private String channelId;

    @Body
    @NameInMap("City")
    private String city;

    @Body
    @NameInMap("DeviceModelNumber")
    private String deviceModelNumber;

    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Body
    @NameInMap("DeviceType")
    private String deviceType;

    @Body
    @NameInMap("District")
    private String district;

    @Body
    @NameInMap("ExtraMap")
    private java.util.Map < String, ? > extraMap;

    @Body
    @NameInMap("FirstScene")
    private String firstScene;

    @Body
    @NameInMap("Floor")
    private String floor;

    @Body
    @NameInMap("LocationName")
    private String locationName;

    @Body
    @NameInMap("MediaId")
    private String mediaId;

    @Body
    @NameInMap("OuterCode")
    private String outerCode;

    @Body
    @NameInMap("Province")
    private String province;

    @Body
    @NameInMap("SecondScene")
    private String secondScene;

    private CreateDeviceRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.city = builder.city;
        this.deviceModelNumber = builder.deviceModelNumber;
        this.deviceName = builder.deviceName;
        this.deviceType = builder.deviceType;
        this.district = builder.district;
        this.extraMap = builder.extraMap;
        this.firstScene = builder.firstScene;
        this.floor = builder.floor;
        this.locationName = builder.locationName;
        this.mediaId = builder.mediaId;
        this.outerCode = builder.outerCode;
        this.province = builder.province;
        this.secondScene = builder.secondScene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return deviceModelNumber
     */
    public String getDeviceModelNumber() {
        return this.deviceModelNumber;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return district
     */
    public String getDistrict() {
        return this.district;
    }

    /**
     * @return extraMap
     */
    public java.util.Map < String, ? > getExtraMap() {
        return this.extraMap;
    }

    /**
     * @return firstScene
     */
    public String getFirstScene() {
        return this.firstScene;
    }

    /**
     * @return floor
     */
    public String getFloor() {
        return this.floor;
    }

    /**
     * @return locationName
     */
    public String getLocationName() {
        return this.locationName;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return outerCode
     */
    public String getOuterCode() {
        return this.outerCode;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return secondScene
     */
    public String getSecondScene() {
        return this.secondScene;
    }

    public static final class Builder extends Request.Builder<CreateDeviceRequest, Builder> {
        private String channelId; 
        private String city; 
        private String deviceModelNumber; 
        private String deviceName; 
        private String deviceType; 
        private String district; 
        private java.util.Map < String, ? > extraMap; 
        private String firstScene; 
        private String floor; 
        private String locationName; 
        private String mediaId; 
        private String outerCode; 
        private String province; 
        private String secondScene; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.city = request.city;
            this.deviceModelNumber = request.deviceModelNumber;
            this.deviceName = request.deviceName;
            this.deviceType = request.deviceType;
            this.district = request.district;
            this.extraMap = request.extraMap;
            this.firstScene = request.firstScene;
            this.floor = request.floor;
            this.locationName = request.locationName;
            this.mediaId = request.mediaId;
            this.outerCode = request.outerCode;
            this.province = request.province;
            this.secondScene = request.secondScene;
        } 

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putBodyParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * DeviceModelNumber.
         */
        public Builder deviceModelNumber(String deviceModelNumber) {
            this.putBodyParameter("DeviceModelNumber", deviceModelNumber);
            this.deviceModelNumber = deviceModelNumber;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * District.
         */
        public Builder district(String district) {
            this.putBodyParameter("District", district);
            this.district = district;
            return this;
        }

        /**
         * ExtraMap.
         */
        public Builder extraMap(java.util.Map < String, ? > extraMap) {
            String extraMapShrink = shrink(extraMap, "ExtraMap", "json");
            this.putBodyParameter("ExtraMap", extraMapShrink);
            this.extraMap = extraMap;
            return this;
        }

        /**
         * FirstScene.
         */
        public Builder firstScene(String firstScene) {
            this.putBodyParameter("FirstScene", firstScene);
            this.firstScene = firstScene;
            return this;
        }

        /**
         * Floor.
         */
        public Builder floor(String floor) {
            this.putBodyParameter("Floor", floor);
            this.floor = floor;
            return this;
        }

        /**
         * LocationName.
         */
        public Builder locationName(String locationName) {
            this.putBodyParameter("LocationName", locationName);
            this.locationName = locationName;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putBodyParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * OuterCode.
         */
        public Builder outerCode(String outerCode) {
            this.putBodyParameter("OuterCode", outerCode);
            this.outerCode = outerCode;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putBodyParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * SecondScene.
         */
        public Builder secondScene(String secondScene) {
            this.putBodyParameter("SecondScene", secondScene);
            this.secondScene = secondScene;
            return this;
        }

        @Override
        public CreateDeviceRequest build() {
            return new CreateDeviceRequest(this);
        } 

    } 

}
