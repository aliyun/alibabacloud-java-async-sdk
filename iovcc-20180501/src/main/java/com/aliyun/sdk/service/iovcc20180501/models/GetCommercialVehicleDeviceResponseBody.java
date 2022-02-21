// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialVehicleDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommercialVehicleDeviceResponseBody</p>
 */
public class GetCommercialVehicleDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VehicleDevice")
    private VehicleDevice vehicleDevice;

    private GetCommercialVehicleDeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vehicleDevice = builder.vehicleDevice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommercialVehicleDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vehicleDevice
     */
    public VehicleDevice getVehicleDevice() {
        return this.vehicleDevice;
    }

    public static final class Builder {
        private String requestId; 
        private VehicleDevice vehicleDevice; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VehicleDevice.
         */
        public Builder vehicleDevice(VehicleDevice vehicleDevice) {
            this.vehicleDevice = vehicleDevice;
            return this;
        }

        public GetCommercialVehicleDeviceResponseBody build() {
            return new GetCommercialVehicleDeviceResponseBody(this);
        } 

    } 

    public static class VehicleDevice extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("HardwareId")
        private String hardwareId;

        @NameInMap("Imei")
        private String imei;

        @NameInMap("LastAuthTime")
        private Long lastAuthTime;

        @NameInMap("ManufacturerId")
        private String manufacturerId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("OnlineStatus")
        private Long onlineStatus;

        @NameInMap("PlateColor")
        private Long plateColor;

        @NameInMap("PlateNumber")
        private String plateNumber;

        @NameInMap("SoftVersion")
        private String softVersion;

        @NameInMap("Vin")
        private String vin;

        private VehicleDevice(Builder builder) {
            this.clientId = builder.clientId;
            this.createTime = builder.createTime;
            this.deviceModel = builder.deviceModel;
            this.hardwareId = builder.hardwareId;
            this.imei = builder.imei;
            this.lastAuthTime = builder.lastAuthTime;
            this.manufacturerId = builder.manufacturerId;
            this.modifiedTime = builder.modifiedTime;
            this.onlineStatus = builder.onlineStatus;
            this.plateColor = builder.plateColor;
            this.plateNumber = builder.plateNumber;
            this.softVersion = builder.softVersion;
            this.vin = builder.vin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VehicleDevice create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return hardwareId
         */
        public String getHardwareId() {
            return this.hardwareId;
        }

        /**
         * @return imei
         */
        public String getImei() {
            return this.imei;
        }

        /**
         * @return lastAuthTime
         */
        public Long getLastAuthTime() {
            return this.lastAuthTime;
        }

        /**
         * @return manufacturerId
         */
        public String getManufacturerId() {
            return this.manufacturerId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return onlineStatus
         */
        public Long getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return plateColor
         */
        public Long getPlateColor() {
            return this.plateColor;
        }

        /**
         * @return plateNumber
         */
        public String getPlateNumber() {
            return this.plateNumber;
        }

        /**
         * @return softVersion
         */
        public String getSoftVersion() {
            return this.softVersion;
        }

        /**
         * @return vin
         */
        public String getVin() {
            return this.vin;
        }

        public static final class Builder {
            private String clientId; 
            private Long createTime; 
            private String deviceModel; 
            private String hardwareId; 
            private String imei; 
            private Long lastAuthTime; 
            private String manufacturerId; 
            private Long modifiedTime; 
            private Long onlineStatus; 
            private Long plateColor; 
            private String plateNumber; 
            private String softVersion; 
            private String vin; 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * HardwareId.
             */
            public Builder hardwareId(String hardwareId) {
                this.hardwareId = hardwareId;
                return this;
            }

            /**
             * Imei.
             */
            public Builder imei(String imei) {
                this.imei = imei;
                return this;
            }

            /**
             * LastAuthTime.
             */
            public Builder lastAuthTime(Long lastAuthTime) {
                this.lastAuthTime = lastAuthTime;
                return this;
            }

            /**
             * ManufacturerId.
             */
            public Builder manufacturerId(String manufacturerId) {
                this.manufacturerId = manufacturerId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(Long onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * PlateColor.
             */
            public Builder plateColor(Long plateColor) {
                this.plateColor = plateColor;
                return this;
            }

            /**
             * PlateNumber.
             */
            public Builder plateNumber(String plateNumber) {
                this.plateNumber = plateNumber;
                return this;
            }

            /**
             * SoftVersion.
             */
            public Builder softVersion(String softVersion) {
                this.softVersion = softVersion;
                return this;
            }

            /**
             * Vin.
             */
            public Builder vin(String vin) {
                this.vin = vin;
                return this;
            }

            public VehicleDevice build() {
                return new VehicleDevice(this);
            } 

        } 

    }
}
