// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceRequest</p>
 */
public class ModifyDeviceRequest extends Request {
    @Body
    @NameInMap("AudioEnable")
    private String audioEnable;

    @Body
    @NameInMap("DeviceAddress")
    private String deviceAddress;

    @Body
    @NameInMap("DeviceDirection")
    private String deviceDirection;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("DeviceIp")
    private String deviceIp;

    @Body
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Body
    @NameInMap("DeviceName")
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
    @NameInMap("DeviceSubType")
    private String deviceSubType;

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
    @NameInMap("Password")
    private String password;

    @Body
    @NameInMap("Vendor")
    private String vendor;

    private ModifyDeviceRequest(Builder builder) {
        super(builder);
        this.audioEnable = builder.audioEnable;
        this.deviceAddress = builder.deviceAddress;
        this.deviceDirection = builder.deviceDirection;
        this.deviceId = builder.deviceId;
        this.deviceIp = builder.deviceIp;
        this.deviceModel = builder.deviceModel;
        this.deviceName = builder.deviceName;
        this.deviceRate = builder.deviceRate;
        this.deviceResolution = builder.deviceResolution;
        this.deviceSite = builder.deviceSite;
        this.deviceSubType = builder.deviceSubType;
        this.encodeFormat = builder.encodeFormat;
        this.frameRate = builder.frameRate;
        this.govLength = builder.govLength;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.OSDTimeEnable = builder.OSDTimeEnable;
        this.OSDTimeType = builder.OSDTimeType;
        this.OSDTimeX = builder.OSDTimeX;
        this.OSDTimeY = builder.OSDTimeY;
        this.password = builder.password;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioEnable
     */
    public String getAudioEnable() {
        return this.audioEnable;
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
     * @return deviceIp
     */
    public String getDeviceIp() {
        return this.deviceIp;
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
     * @return deviceSubType
     */
    public String getDeviceSubType() {
        return this.deviceSubType;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ModifyDeviceRequest, Builder> {
        private String audioEnable; 
        private String deviceAddress; 
        private String deviceDirection; 
        private String deviceId; 
        private String deviceIp; 
        private String deviceModel; 
        private String deviceName; 
        private String deviceRate; 
        private String deviceResolution; 
        private String deviceSite; 
        private String deviceSubType; 
        private String encodeFormat; 
        private String frameRate; 
        private String govLength; 
        private String latitude; 
        private String longitude; 
        private String OSDTimeEnable; 
        private String OSDTimeType; 
        private String OSDTimeX; 
        private String OSDTimeY; 
        private String password; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDeviceRequest response) {
            super(response);
            this.audioEnable = response.audioEnable;
            this.deviceAddress = response.deviceAddress;
            this.deviceDirection = response.deviceDirection;
            this.deviceId = response.deviceId;
            this.deviceIp = response.deviceIp;
            this.deviceModel = response.deviceModel;
            this.deviceName = response.deviceName;
            this.deviceRate = response.deviceRate;
            this.deviceResolution = response.deviceResolution;
            this.deviceSite = response.deviceSite;
            this.deviceSubType = response.deviceSubType;
            this.encodeFormat = response.encodeFormat;
            this.frameRate = response.frameRate;
            this.govLength = response.govLength;
            this.latitude = response.latitude;
            this.longitude = response.longitude;
            this.OSDTimeEnable = response.OSDTimeEnable;
            this.OSDTimeType = response.OSDTimeType;
            this.OSDTimeX = response.OSDTimeX;
            this.OSDTimeY = response.OSDTimeY;
            this.password = response.password;
            this.vendor = response.vendor;
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
         * 设备安装地址
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
         * 设备国标编码
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceIp.
         */
        public Builder deviceIp(String deviceIp) {
            this.putBodyParameter("DeviceIp", deviceIp);
            this.deviceIp = deviceIp;
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
         * 设备名称
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
         * DeviceSubType.
         */
        public Builder deviceSubType(String deviceSubType) {
            this.putBodyParameter("DeviceSubType", deviceSubType);
            this.deviceSubType = deviceSubType;
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
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
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
        public ModifyDeviceRequest build() {
            return new ModifyDeviceRequest(this);
        } 

    } 

}
