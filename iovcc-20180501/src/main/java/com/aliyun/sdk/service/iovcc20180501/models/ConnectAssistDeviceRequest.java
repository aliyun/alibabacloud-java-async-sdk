// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConnectAssistDeviceRequest} extends {@link RequestModel}
 *
 * <p>ConnectAssistDeviceRequest</p>
 */
public class ConnectAssistDeviceRequest extends Request {
    @Body
    @NameInMap("AllowCommandExtension")
    private Boolean allowCommandExtension;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("HardwareId")
    private String hardwareId;

    @Body
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SerialNumber")
    private String serialNumber;

    @Body
    @NameInMap("UUID")
    private String UUID;

    @Body
    @NameInMap("VIN")
    private String VIN;

    private ConnectAssistDeviceRequest(Builder builder) {
        super(builder);
        this.allowCommandExtension = builder.allowCommandExtension;
        this.deviceId = builder.deviceId;
        this.hardwareId = builder.hardwareId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.serialNumber = builder.serialNumber;
        this.UUID = builder.UUID;
        this.VIN = builder.VIN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectAssistDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowCommandExtension
     */
    public Boolean getAllowCommandExtension() {
        return this.allowCommandExtension;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return hardwareId
     */
    public String getHardwareId() {
        return this.hardwareId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * @return VIN
     */
    public String getVIN() {
        return this.VIN;
    }

    public static final class Builder extends Request.Builder<ConnectAssistDeviceRequest, Builder> {
        private Boolean allowCommandExtension; 
        private String deviceId; 
        private String hardwareId; 
        private String projectId; 
        private String regionId; 
        private String serialNumber; 
        private String UUID; 
        private String VIN; 

        private Builder() {
            super();
        } 

        private Builder(ConnectAssistDeviceRequest response) {
            super(response);
            this.allowCommandExtension = response.allowCommandExtension;
            this.deviceId = response.deviceId;
            this.hardwareId = response.hardwareId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.serialNumber = response.serialNumber;
            this.UUID = response.UUID;
            this.VIN = response.VIN;
        } 

        /**
         * AllowCommandExtension.
         */
        public Builder allowCommandExtension(Boolean allowCommandExtension) {
            this.putBodyParameter("AllowCommandExtension", allowCommandExtension);
            this.allowCommandExtension = allowCommandExtension;
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
         * HardwareId.
         */
        public Builder hardwareId(String hardwareId) {
            this.putBodyParameter("HardwareId", hardwareId);
            this.hardwareId = hardwareId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.putBodyParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * UUID.
         */
        public Builder UUID(String UUID) {
            this.putBodyParameter("UUID", UUID);
            this.UUID = UUID;
            return this;
        }

        /**
         * VIN.
         */
        public Builder VIN(String VIN) {
            this.putBodyParameter("VIN", VIN);
            this.VIN = VIN;
            return this;
        }

        @Override
        public ConnectAssistDeviceRequest build() {
            return new ConnectAssistDeviceRequest(this);
        } 

    } 

}
