// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceModelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceModelResponseBody</p>
 */
public class DescribeDeviceModelResponseBody extends TeaModel {
    @NameInMap("DeviceModel")
    private DeviceModel deviceModel;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeviceModelResponseBody(Builder builder) {
        this.deviceModel = builder.deviceModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceModel
     */
    public DeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceModel deviceModel; 
        private String requestId; 

        /**
         * DeviceModel.
         */
        public Builder deviceModel(DeviceModel deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeviceModelResponseBody build() {
            return new DescribeDeviceModelResponseBody(this);
        } 

    } 

    public static class DeviceModel extends TeaModel {
        @NameInMap("CanCreateDeviceId")
        private Integer canCreateDeviceId;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceBrand")
        private String deviceBrand;

        @NameInMap("DeviceLogoUrl")
        private String deviceLogoUrl;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceModelId")
        private Long deviceModelId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("HardwareType")
        private String hardwareType;

        @NameInMap("InitUsageType")
        private Integer initUsageType;

        @NameInMap("InitUsageTypeDesc")
        private String initUsageTypeDesc;

        @NameInMap("ObjectKey")
        private String objectKey;

        @NameInMap("OsPlatform")
        private String osPlatform;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("SecurityChip")
        private String securityChip;

        private DeviceModel(Builder builder) {
            this.canCreateDeviceId = builder.canCreateDeviceId;
            this.description = builder.description;
            this.deviceBrand = builder.deviceBrand;
            this.deviceLogoUrl = builder.deviceLogoUrl;
            this.deviceModel = builder.deviceModel;
            this.deviceModelId = builder.deviceModelId;
            this.deviceName = builder.deviceName;
            this.deviceType = builder.deviceType;
            this.hardwareType = builder.hardwareType;
            this.initUsageType = builder.initUsageType;
            this.initUsageTypeDesc = builder.initUsageTypeDesc;
            this.objectKey = builder.objectKey;
            this.osPlatform = builder.osPlatform;
            this.projectId = builder.projectId;
            this.securityChip = builder.securityChip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceModel create() {
            return builder().build();
        }

        /**
         * @return canCreateDeviceId
         */
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceBrand
         */
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        /**
         * @return deviceLogoUrl
         */
        public String getDeviceLogoUrl() {
            return this.deviceLogoUrl;
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
         * @return hardwareType
         */
        public String getHardwareType() {
            return this.hardwareType;
        }

        /**
         * @return initUsageType
         */
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        /**
         * @return initUsageTypeDesc
         */
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
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
         * @return securityChip
         */
        public String getSecurityChip() {
            return this.securityChip;
        }

        public static final class Builder {
            private Integer canCreateDeviceId; 
            private String description; 
            private String deviceBrand; 
            private String deviceLogoUrl; 
            private String deviceModel; 
            private Long deviceModelId; 
            private String deviceName; 
            private String deviceType; 
            private String hardwareType; 
            private Integer initUsageType; 
            private String initUsageTypeDesc; 
            private String objectKey; 
            private String osPlatform; 
            private String projectId; 
            private String securityChip; 

            /**
             * CanCreateDeviceId.
             */
            public Builder canCreateDeviceId(Integer canCreateDeviceId) {
                this.canCreateDeviceId = canCreateDeviceId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * DeviceLogoUrl.
             */
            public Builder deviceLogoUrl(String deviceLogoUrl) {
                this.deviceLogoUrl = deviceLogoUrl;
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
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
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
             * HardwareType.
             */
            public Builder hardwareType(String hardwareType) {
                this.hardwareType = hardwareType;
                return this;
            }

            /**
             * InitUsageType.
             */
            public Builder initUsageType(Integer initUsageType) {
                this.initUsageType = initUsageType;
                return this;
            }

            /**
             * InitUsageTypeDesc.
             */
            public Builder initUsageTypeDesc(String initUsageTypeDesc) {
                this.initUsageTypeDesc = initUsageTypeDesc;
                return this;
            }

            /**
             * ObjectKey.
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
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
             * SecurityChip.
             */
            public Builder securityChip(String securityChip) {
                this.securityChip = securityChip;
                return this;
            }

            public DeviceModel build() {
                return new DeviceModel(this);
            } 

        } 

    }
}
