// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeviceModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceModelRequest</p>
 */
public class UpdateDeviceModelRequest extends Request {
    @Query
    @NameInMap("BrandName")
    private String brandName;

    @Query
    @NameInMap("CanCreateDeviceId")
    private String canCreateDeviceId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("DeviceType")
    private String deviceType;

    @Query
    @NameInMap("HardwareType")
    private String hardwareType;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InitUsageType")
    private String initUsageType;

    @Query
    @NameInMap("ModelName")
    private String modelName;

    @Query
    @NameInMap("ObjectKey")
    private String objectKey;

    @Query
    @NameInMap("OsPlatform")
    private String osPlatform;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityChip")
    private String securityChip;

    private UpdateDeviceModelRequest(Builder builder) {
        super(builder);
        this.brandName = builder.brandName;
        this.canCreateDeviceId = builder.canCreateDeviceId;
        this.description = builder.description;
        this.deviceName = builder.deviceName;
        this.deviceType = builder.deviceType;
        this.hardwareType = builder.hardwareType;
        this.id = builder.id;
        this.initUsageType = builder.initUsageType;
        this.modelName = builder.modelName;
        this.objectKey = builder.objectKey;
        this.osPlatform = builder.osPlatform;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.securityChip = builder.securityChip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @return canCreateDeviceId
     */
    public String getCanCreateDeviceId() {
        return this.canCreateDeviceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return initUsageType
     */
    public String getInitUsageType() {
        return this.initUsageType;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityChip
     */
    public String getSecurityChip() {
        return this.securityChip;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceModelRequest, Builder> {
        private String brandName; 
        private String canCreateDeviceId; 
        private String description; 
        private String deviceName; 
        private String deviceType; 
        private String hardwareType; 
        private String id; 
        private String initUsageType; 
        private String modelName; 
        private String objectKey; 
        private String osPlatform; 
        private String projectId; 
        private String regionId; 
        private String securityChip; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceModelRequest response) {
            super(response);
            this.brandName = response.brandName;
            this.canCreateDeviceId = response.canCreateDeviceId;
            this.description = response.description;
            this.deviceName = response.deviceName;
            this.deviceType = response.deviceType;
            this.hardwareType = response.hardwareType;
            this.id = response.id;
            this.initUsageType = response.initUsageType;
            this.modelName = response.modelName;
            this.objectKey = response.objectKey;
            this.osPlatform = response.osPlatform;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.securityChip = response.securityChip;
        } 

        /**
         * BrandName.
         */
        public Builder brandName(String brandName) {
            this.putQueryParameter("BrandName", brandName);
            this.brandName = brandName;
            return this;
        }

        /**
         * CanCreateDeviceId.
         */
        public Builder canCreateDeviceId(String canCreateDeviceId) {
            this.putQueryParameter("CanCreateDeviceId", canCreateDeviceId);
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * HardwareType.
         */
        public Builder hardwareType(String hardwareType) {
            this.putQueryParameter("HardwareType", hardwareType);
            this.hardwareType = hardwareType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InitUsageType.
         */
        public Builder initUsageType(String initUsageType) {
            this.putQueryParameter("InitUsageType", initUsageType);
            this.initUsageType = initUsageType;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * ObjectKey.
         */
        public Builder objectKey(String objectKey) {
            this.putQueryParameter("ObjectKey", objectKey);
            this.objectKey = objectKey;
            return this;
        }

        /**
         * OsPlatform.
         */
        public Builder osPlatform(String osPlatform) {
            this.putQueryParameter("OsPlatform", osPlatform);
            this.osPlatform = osPlatform;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
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
         * SecurityChip.
         */
        public Builder securityChip(String securityChip) {
            this.putQueryParameter("SecurityChip", securityChip);
            this.securityChip = securityChip;
            return this;
        }

        @Override
        public UpdateDeviceModelRequest build() {
            return new UpdateDeviceModelRequest(this);
        } 

    } 

}
