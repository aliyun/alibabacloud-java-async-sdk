// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

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
    @NameInMap("ActivateCode")
    private String activateCode;

    @Body
    @NameInMap("AudioEnable")
    private String audioEnable;

    @Body
    @NameInMap("CityCode")
    private String cityCode;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Body
    @NameInMap("DeviceAddress")
    @Validation(required = true)
    private String deviceAddress;

    @Body
    @NameInMap("DeviceDirection")
    private String deviceDirection;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Body
    @NameInMap("DeviceName")
    @Validation(required = true)
    private String deviceName;

    @Body
    @NameInMap("DeviceRate")
    private String deviceRate;

    @Body
    @NameInMap("DeviceResolution")
    private String deviceResolution;

    @Body
    @NameInMap("DeviceSite")
    private String deviceSite;

    @Body
    @NameInMap("DeviceSn")
    private String deviceSn;

    @Body
    @NameInMap("DeviceType")
    @Validation(required = true)
    private String deviceType;

    @Body
    @NameInMap("EncodeFormat")
    private String encodeFormat;

    @Body
    @NameInMap("FrameRate")
    private String frameRate;

    @Body
    @NameInMap("GovLength")
    private String govLength;

    @Body
    @NameInMap("InProtocol")
    private String inProtocol;

    @Body
    @NameInMap("Latitude")
    private String latitude;

    @Body
    @NameInMap("Longitude")
    private String longitude;

    @Body
    @NameInMap("OSDTimeEnable")
    private String OSDTimeEnable;

    @Body
    @NameInMap("OSDTimeType")
    private String OSDTimeType;

    @Body
    @NameInMap("OSDTimeX")
    private String OSDTimeX;

    @Body
    @NameInMap("OSDTimeY")
    private String OSDTimeY;

    @Body
    @NameInMap("ParentDeviceId")
    private String parentDeviceId;

    @Body
    @NameInMap("SubDeviceCount")
    private Long subDeviceCount;

    @Body
    @NameInMap("SubDeviceIdList")
    private String subDeviceIdList;

    @Body
    @NameInMap("Vendor")
    private String vendor;

    private CreateDeviceRequest(Builder builder) {
        super(builder);
        this.activateCode = builder.activateCode;
        this.audioEnable = builder.audioEnable;
        this.cityCode = builder.cityCode;
        this.corpId = builder.corpId;
        this.dataSourceType = builder.dataSourceType;
        this.deviceAddress = builder.deviceAddress;
        this.deviceDirection = builder.deviceDirection;
        this.deviceId = builder.deviceId;
        this.deviceModel = builder.deviceModel;
        this.deviceName = builder.deviceName;
        this.deviceRate = builder.deviceRate;
        this.deviceResolution = builder.deviceResolution;
        this.deviceSite = builder.deviceSite;
        this.deviceSn = builder.deviceSn;
        this.deviceType = builder.deviceType;
        this.encodeFormat = builder.encodeFormat;
        this.frameRate = builder.frameRate;
        this.govLength = builder.govLength;
        this.inProtocol = builder.inProtocol;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.OSDTimeEnable = builder.OSDTimeEnable;
        this.OSDTimeType = builder.OSDTimeType;
        this.OSDTimeX = builder.OSDTimeX;
        this.OSDTimeY = builder.OSDTimeY;
        this.parentDeviceId = builder.parentDeviceId;
        this.subDeviceCount = builder.subDeviceCount;
        this.subDeviceIdList = builder.subDeviceIdList;
        this.vendor = builder.vendor;
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
     * @return activateCode
     */
    public String getActivateCode() {
        return this.activateCode;
    }

    /**
     * @return audioEnable
     */
    public String getAudioEnable() {
        return this.audioEnable;
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return deviceAddress
     */
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    /**
     * @return deviceDirection
     */
    public String getDeviceDirection() {
        return this.deviceDirection;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceRate
     */
    public String getDeviceRate() {
        return this.deviceRate;
    }

    /**
     * @return deviceResolution
     */
    public String getDeviceResolution() {
        return this.deviceResolution;
    }

    /**
     * @return deviceSite
     */
    public String getDeviceSite() {
        return this.deviceSite;
    }

    /**
     * @return deviceSn
     */
    public String getDeviceSn() {
        return this.deviceSn;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return encodeFormat
     */
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    /**
     * @return frameRate
     */
    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * @return govLength
     */
    public String getGovLength() {
        return this.govLength;
    }

    /**
     * @return inProtocol
     */
    public String getInProtocol() {
        return this.inProtocol;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return OSDTimeEnable
     */
    public String getOSDTimeEnable() {
        return this.OSDTimeEnable;
    }

    /**
     * @return OSDTimeType
     */
    public String getOSDTimeType() {
        return this.OSDTimeType;
    }

    /**
     * @return OSDTimeX
     */
    public String getOSDTimeX() {
        return this.OSDTimeX;
    }

    /**
     * @return OSDTimeY
     */
    public String getOSDTimeY() {
        return this.OSDTimeY;
    }

    /**
     * @return parentDeviceId
     */
    public String getParentDeviceId() {
        return this.parentDeviceId;
    }

    /**
     * @return subDeviceCount
     */
    public Long getSubDeviceCount() {
        return this.subDeviceCount;
    }

    /**
     * @return subDeviceIdList
     */
    public String getSubDeviceIdList() {
        return this.subDeviceIdList;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<CreateDeviceRequest, Builder> {
        private String activateCode; 
        private String audioEnable; 
        private String cityCode; 
        private String corpId; 
        private String dataSourceType; 
        private String deviceAddress; 
        private String deviceDirection; 
        private String deviceId; 
        private String deviceModel; 
        private String deviceName; 
        private String deviceRate; 
        private String deviceResolution; 
        private String deviceSite; 
        private String deviceSn; 
        private String deviceType; 
        private String encodeFormat; 
        private String frameRate; 
        private String govLength; 
        private String inProtocol; 
        private String latitude; 
        private String longitude; 
        private String OSDTimeEnable; 
        private String OSDTimeType; 
        private String OSDTimeX; 
        private String OSDTimeY; 
        private String parentDeviceId; 
        private Long subDeviceCount; 
        private String subDeviceIdList; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceRequest response) {
            super(response);
            this.activateCode = response.activateCode;
            this.audioEnable = response.audioEnable;
            this.cityCode = response.cityCode;
            this.corpId = response.corpId;
            this.dataSourceType = response.dataSourceType;
            this.deviceAddress = response.deviceAddress;
            this.deviceDirection = response.deviceDirection;
            this.deviceId = response.deviceId;
            this.deviceModel = response.deviceModel;
            this.deviceName = response.deviceName;
            this.deviceRate = response.deviceRate;
            this.deviceResolution = response.deviceResolution;
            this.deviceSite = response.deviceSite;
            this.deviceSn = response.deviceSn;
            this.deviceType = response.deviceType;
            this.encodeFormat = response.encodeFormat;
            this.frameRate = response.frameRate;
            this.govLength = response.govLength;
            this.inProtocol = response.inProtocol;
            this.latitude = response.latitude;
            this.longitude = response.longitude;
            this.OSDTimeEnable = response.OSDTimeEnable;
            this.OSDTimeType = response.OSDTimeType;
            this.OSDTimeX = response.OSDTimeX;
            this.OSDTimeY = response.OSDTimeY;
            this.parentDeviceId = response.parentDeviceId;
            this.subDeviceCount = response.subDeviceCount;
            this.subDeviceIdList = response.subDeviceIdList;
            this.vendor = response.vendor;
        } 

        /**
         * ActivateCode.
         */
        public Builder activateCode(String activateCode) {
            this.putBodyParameter("ActivateCode", activateCode);
            this.activateCode = activateCode;
            return this;
        }

        /**
         * AudioEnable.
         */
        public Builder audioEnable(String audioEnable) {
            this.putBodyParameter("AudioEnable", audioEnable);
            this.audioEnable = audioEnable;
            return this;
        }

        /**
         * CityCode.
         */
        public Builder cityCode(String cityCode) {
            this.putBodyParameter("CityCode", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DeviceAddress.
         */
        public Builder deviceAddress(String deviceAddress) {
            this.putBodyParameter("DeviceAddress", deviceAddress);
            this.deviceAddress = deviceAddress;
            return this;
        }

        /**
         * DeviceDirection.
         */
        public Builder deviceDirection(String deviceDirection) {
            this.putBodyParameter("DeviceDirection", deviceDirection);
            this.deviceDirection = deviceDirection;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceModel.
         */
        public Builder deviceModel(String deviceModel) {
            this.putBodyParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
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
         * DeviceRate.
         */
        public Builder deviceRate(String deviceRate) {
            this.putBodyParameter("DeviceRate", deviceRate);
            this.deviceRate = deviceRate;
            return this;
        }

        /**
         * DeviceResolution.
         */
        public Builder deviceResolution(String deviceResolution) {
            this.putBodyParameter("DeviceResolution", deviceResolution);
            this.deviceResolution = deviceResolution;
            return this;
        }

        /**
         * DeviceSite.
         */
        public Builder deviceSite(String deviceSite) {
            this.putBodyParameter("DeviceSite", deviceSite);
            this.deviceSite = deviceSite;
            return this;
        }

        /**
         * DeviceSn.
         */
        public Builder deviceSn(String deviceSn) {
            this.putBodyParameter("DeviceSn", deviceSn);
            this.deviceSn = deviceSn;
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
         * EncodeFormat.
         */
        public Builder encodeFormat(String encodeFormat) {
            this.putBodyParameter("EncodeFormat", encodeFormat);
            this.encodeFormat = encodeFormat;
            return this;
        }

        /**
         * FrameRate.
         */
        public Builder frameRate(String frameRate) {
            this.putBodyParameter("FrameRate", frameRate);
            this.frameRate = frameRate;
            return this;
        }

        /**
         * GovLength.
         */
        public Builder govLength(String govLength) {
            this.putBodyParameter("GovLength", govLength);
            this.govLength = govLength;
            return this;
        }

        /**
         * InProtocol.
         */
        public Builder inProtocol(String inProtocol) {
            this.putBodyParameter("InProtocol", inProtocol);
            this.inProtocol = inProtocol;
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
         * Longitude.
         */
        public Builder longitude(String longitude) {
            this.putBodyParameter("Longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * OSDTimeEnable.
         */
        public Builder OSDTimeEnable(String OSDTimeEnable) {
            this.putBodyParameter("OSDTimeEnable", OSDTimeEnable);
            this.OSDTimeEnable = OSDTimeEnable;
            return this;
        }

        /**
         * OSDTimeType.
         */
        public Builder OSDTimeType(String OSDTimeType) {
            this.putBodyParameter("OSDTimeType", OSDTimeType);
            this.OSDTimeType = OSDTimeType;
            return this;
        }

        /**
         * OSDTimeX.
         */
        public Builder OSDTimeX(String OSDTimeX) {
            this.putBodyParameter("OSDTimeX", OSDTimeX);
            this.OSDTimeX = OSDTimeX;
            return this;
        }

        /**
         * OSDTimeY.
         */
        public Builder OSDTimeY(String OSDTimeY) {
            this.putBodyParameter("OSDTimeY", OSDTimeY);
            this.OSDTimeY = OSDTimeY;
            return this;
        }

        /**
         * ParentDeviceId.
         */
        public Builder parentDeviceId(String parentDeviceId) {
            this.putBodyParameter("ParentDeviceId", parentDeviceId);
            this.parentDeviceId = parentDeviceId;
            return this;
        }

        /**
         * SubDeviceCount.
         */
        public Builder subDeviceCount(Long subDeviceCount) {
            this.putBodyParameter("SubDeviceCount", subDeviceCount);
            this.subDeviceCount = subDeviceCount;
            return this;
        }

        /**
         * SubDeviceIdList.
         */
        public Builder subDeviceIdList(String subDeviceIdList) {
            this.putBodyParameter("SubDeviceIdList", subDeviceIdList);
            this.subDeviceIdList = subDeviceIdList;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public CreateDeviceRequest build() {
            return new CreateDeviceRequest(this);
        } 

    } 

}
