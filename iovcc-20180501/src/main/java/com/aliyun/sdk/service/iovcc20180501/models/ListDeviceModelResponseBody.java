// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceModelResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceModelResponseBody</p>
 */
public class ListDeviceModelResponseBody extends TeaModel {
    @NameInMap("ModelList")
    private java.util.List < ModelList> modelList;

    @NameInMap("RequestId")
    private String requestId;

    private ListDeviceModelResponseBody(Builder builder) {
        this.modelList = builder.modelList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return modelList
     */
    public java.util.List < ModelList> getModelList() {
        return this.modelList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ModelList> modelList; 
        private String requestId; 

        /**
         * ModelList.
         */
        public Builder modelList(java.util.List < ModelList> modelList) {
            this.modelList = modelList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeviceModelResponseBody build() {
            return new ListDeviceModelResponseBody(this);
        } 

    } 

    public static class ModelList extends TeaModel {
        @NameInMap("CanCreateDeviceId")
        private Integer canCreateDeviceId;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceBrand")
        private String deviceBrand;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceModelId")
        private Long deviceModelId;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("HardwareType")
        private String hardwareType;

        @NameInMap("InitUsageType")
        private Integer initUsageType;

        @NameInMap("InitUsageTypeDesc")
        private String initUsageTypeDesc;

        @NameInMap("OsPlatform")
        private String osPlatform;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("SecurityChip")
        private String securityChip;

        private ModelList(Builder builder) {
            this.canCreateDeviceId = builder.canCreateDeviceId;
            this.description = builder.description;
            this.deviceBrand = builder.deviceBrand;
            this.deviceModel = builder.deviceModel;
            this.deviceModelId = builder.deviceModelId;
            this.deviceType = builder.deviceType;
            this.hardwareType = builder.hardwareType;
            this.initUsageType = builder.initUsageType;
            this.initUsageTypeDesc = builder.initUsageTypeDesc;
            this.osPlatform = builder.osPlatform;
            this.projectId = builder.projectId;
            this.securityChip = builder.securityChip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelList create() {
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
            private String deviceModel; 
            private Long deviceModelId; 
            private String deviceType; 
            private String hardwareType; 
            private Integer initUsageType; 
            private String initUsageTypeDesc; 
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

            public ModelList build() {
                return new ModelList(this);
            } 

        } 

    }
}
