// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDeviceRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceRequest</p>
 */
public class AddDeviceRequest extends Request {
    @Body
    @NameInMap("BitRate")
    private String bitRate;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("DeviceAddress")
    private String deviceAddress;

    @Body
    @NameInMap("DeviceDirection")
    private String deviceDirection;

    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Body
    @NameInMap("DeviceResolution")
    private String deviceResolution;

    @Body
    @NameInMap("DeviceSite")
    private String deviceSite;

    @Body
    @NameInMap("DeviceType")
    private String deviceType;

    @Body
    @NameInMap("GbId")
    private String gbId;

    @Body
    @NameInMap("Vendor")
    private String vendor;

    private AddDeviceRequest(Builder builder) {
        super(builder);
        this.bitRate = builder.bitRate;
        this.corpId = builder.corpId;
        this.deviceAddress = builder.deviceAddress;
        this.deviceDirection = builder.deviceDirection;
        this.deviceName = builder.deviceName;
        this.deviceResolution = builder.deviceResolution;
        this.deviceSite = builder.deviceSite;
        this.deviceType = builder.deviceType;
        this.gbId = builder.gbId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bitRate
     */
    public String getBitRate() {
        return this.bitRate;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
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
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
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
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<AddDeviceRequest, Builder> {
        private String bitRate; 
        private String corpId; 
        private String deviceAddress; 
        private String deviceDirection; 
        private String deviceName; 
        private String deviceResolution; 
        private String deviceSite; 
        private String deviceType; 
        private String gbId; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(AddDeviceRequest response) {
            super(response);
            this.bitRate = response.bitRate;
            this.corpId = response.corpId;
            this.deviceAddress = response.deviceAddress;
            this.deviceDirection = response.deviceDirection;
            this.deviceName = response.deviceName;
            this.deviceResolution = response.deviceResolution;
            this.deviceSite = response.deviceSite;
            this.deviceType = response.deviceType;
            this.gbId = response.gbId;
            this.vendor = response.vendor;
        } 

        /**
         * BitRate.
         */
        public Builder bitRate(String bitRate) {
            this.putBodyParameter("BitRate", bitRate);
            this.bitRate = bitRate;
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
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
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
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putBodyParameter("GbId", gbId);
            this.gbId = gbId;
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
        public AddDeviceRequest build() {
            return new AddDeviceRequest(this);
        } 

    } 

}
