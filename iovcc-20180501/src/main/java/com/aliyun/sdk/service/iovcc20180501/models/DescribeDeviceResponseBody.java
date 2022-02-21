// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceResponseBody</p>
 */
public class DescribeDeviceResponseBody extends TeaModel {
    @NameInMap("DeviceInfo")
    private DeviceInfo deviceInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeviceResponseBody(Builder builder) {
        this.deviceInfo = builder.deviceInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceInfo
     */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceInfo deviceInfo; 
        private String requestId; 

        /**
         * DeviceInfo.
         */
        public Builder deviceInfo(DeviceInfo deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeviceResponseBody build() {
            return new DescribeDeviceResponseBody(this);
        } 

    } 

    public static class DeviceInfo extends TeaModel {
        @NameInMap("Attributes")
        private String attributes;

        @NameInMap("DeviceBrand")
        private String deviceBrand;

        @NameInMap("DeviceBrandId")
        private Long deviceBrandId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceModelId")
        private Long deviceModelId;

        @NameInMap("DeviceProduct")
        private String deviceProduct;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("HardwareId")
        private String hardwareId;

        @NameInMap("MacAddress")
        private String macAddress;

        @NameInMap("Name")
        private String name;

        @NameInMap("OsPlatform")
        private String osPlatform;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Region")
        private String region;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("SoftwareId")
        private String softwareId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UsageType")
        private Integer usageType;

        @NameInMap("UsageTypeDesc")
        private String usageTypeDesc;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Vin")
        private String vin;

        private DeviceInfo(Builder builder) {
            this.attributes = builder.attributes;
            this.deviceBrand = builder.deviceBrand;
            this.deviceBrandId = builder.deviceBrandId;
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.deviceModelId = builder.deviceModelId;
            this.deviceProduct = builder.deviceProduct;
            this.deviceType = builder.deviceType;
            this.hardwareId = builder.hardwareId;
            this.macAddress = builder.macAddress;
            this.name = builder.name;
            this.osPlatform = builder.osPlatform;
            this.projectId = builder.projectId;
            this.region = builder.region;
            this.serialNumber = builder.serialNumber;
            this.softwareId = builder.softwareId;
            this.status = builder.status;
            this.usageType = builder.usageType;
            this.usageTypeDesc = builder.usageTypeDesc;
            this.uuid = builder.uuid;
            this.vin = builder.vin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return deviceBrand
         */
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        /**
         * @return deviceBrandId
         */
        public Long getDeviceBrandId() {
            return this.deviceBrandId;
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
         * @return deviceModelId
         */
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        /**
         * @return deviceProduct
         */
        public String getDeviceProduct() {
            return this.deviceProduct;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return hardwareId
         */
        public String getHardwareId() {
            return this.hardwareId;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return osPlatform
         */
        public String getOsPlatform() {
            return this.osPlatform;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usageType
         */
        public Integer getUsageType() {
            return this.usageType;
        }

        /**
         * @return usageTypeDesc
         */
        public String getUsageTypeDesc() {
            return this.usageTypeDesc;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vin
         */
        public String getVin() {
            return this.vin;
        }

        public static final class Builder {
            private String attributes; 
            private String deviceBrand; 
            private Long deviceBrandId; 
            private String deviceId; 
            private String deviceModel; 
            private Long deviceModelId; 
            private String deviceProduct; 
            private String deviceType; 
            private String hardwareId; 
            private String macAddress; 
            private String name; 
            private String osPlatform; 
            private String projectId; 
            private String region; 
            private String serialNumber; 
            private String softwareId; 
            private String status; 
            private Integer usageType; 
            private String usageTypeDesc; 
            private String uuid; 
            private String vin; 

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * DeviceBrand.
             */
            public Builder deviceBrand(String deviceBrand) {
                this.deviceBrand = deviceBrand;
                return this;
            }

            /**
             * DeviceBrandId.
             */
            public Builder deviceBrandId(Long deviceBrandId) {
                this.deviceBrandId = deviceBrandId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * DeviceModelId.
             */
            public Builder deviceModelId(Long deviceModelId) {
                this.deviceModelId = deviceModelId;
                return this;
            }

            /**
             * DeviceProduct.
             */
            public Builder deviceProduct(String deviceProduct) {
                this.deviceProduct = deviceProduct;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
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
             * MacAddress.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OsPlatform.
             */
            public Builder osPlatform(String osPlatform) {
                this.osPlatform = osPlatform;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * SoftwareId.
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UsageType.
             */
            public Builder usageType(Integer usageType) {
                this.usageType = usageType;
                return this;
            }

            /**
             * UsageTypeDesc.
             */
            public Builder usageTypeDesc(String usageTypeDesc) {
                this.usageTypeDesc = usageTypeDesc;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Vin.
             */
            public Builder vin(String vin) {
                this.vin = vin;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
}
