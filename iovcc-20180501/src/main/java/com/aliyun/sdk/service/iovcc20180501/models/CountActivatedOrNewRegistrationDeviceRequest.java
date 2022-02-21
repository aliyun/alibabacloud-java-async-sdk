// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountActivatedOrNewRegistrationDeviceRequest} extends {@link RequestModel}
 *
 * <p>CountActivatedOrNewRegistrationDeviceRequest</p>
 */
public class CountActivatedOrNewRegistrationDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceBrand")
    private String deviceBrand;

    @Query
    @NameInMap("DeviceBrandId")
    private String deviceBrandId;

    @Query
    @NameInMap("DeviceCountStatType")
    private String deviceCountStatType;

    @Query
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Query
    @NameInMap("DeviceModelId")
    private String deviceModelId;

    @Query
    @NameInMap("DeviceType")
    private String deviceType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("IsQueryNewRegistrationDevice")
    private String isQueryNewRegistrationDevice;

    @Query
    @NameInMap("IsQueryYearlyActivate")
    private String isQueryYearlyActivate;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private CountActivatedOrNewRegistrationDeviceRequest(Builder builder) {
        super(builder);
        this.deviceBrand = builder.deviceBrand;
        this.deviceBrandId = builder.deviceBrandId;
        this.deviceCountStatType = builder.deviceCountStatType;
        this.deviceModel = builder.deviceModel;
        this.deviceModelId = builder.deviceModelId;
        this.deviceType = builder.deviceType;
        this.endTime = builder.endTime;
        this.isQueryNewRegistrationDevice = builder.isQueryNewRegistrationDevice;
        this.isQueryYearlyActivate = builder.isQueryYearlyActivate;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountActivatedOrNewRegistrationDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getDeviceBrandId() {
        return this.deviceBrandId;
    }

    /**
     * @return deviceCountStatType
     */
    public String getDeviceCountStatType() {
        return this.deviceCountStatType;
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
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isQueryNewRegistrationDevice
     */
    public String getIsQueryNewRegistrationDevice() {
        return this.isQueryNewRegistrationDevice;
    }

    /**
     * @return isQueryYearlyActivate
     */
    public String getIsQueryYearlyActivate() {
        return this.isQueryYearlyActivate;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CountActivatedOrNewRegistrationDeviceRequest, Builder> {
        private String deviceBrand; 
        private String deviceBrandId; 
        private String deviceCountStatType; 
        private String deviceModel; 
        private String deviceModelId; 
        private String deviceType; 
        private String endTime; 
        private String isQueryNewRegistrationDevice; 
        private String isQueryYearlyActivate; 
        private String projectId; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CountActivatedOrNewRegistrationDeviceRequest response) {
            super(response);
            this.deviceBrand = response.deviceBrand;
            this.deviceBrandId = response.deviceBrandId;
            this.deviceCountStatType = response.deviceCountStatType;
            this.deviceModel = response.deviceModel;
            this.deviceModelId = response.deviceModelId;
            this.deviceType = response.deviceType;
            this.endTime = response.endTime;
            this.isQueryNewRegistrationDevice = response.isQueryNewRegistrationDevice;
            this.isQueryYearlyActivate = response.isQueryYearlyActivate;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
        } 

        /**
         * DeviceBrand.
         */
        public Builder deviceBrand(String deviceBrand) {
            this.putQueryParameter("DeviceBrand", deviceBrand);
            this.deviceBrand = deviceBrand;
            return this;
        }

        /**
         * DeviceBrandId.
         */
        public Builder deviceBrandId(String deviceBrandId) {
            this.putQueryParameter("DeviceBrandId", deviceBrandId);
            this.deviceBrandId = deviceBrandId;
            return this;
        }

        /**
         * DeviceCountStatType.
         */
        public Builder deviceCountStatType(String deviceCountStatType) {
            this.putQueryParameter("DeviceCountStatType", deviceCountStatType);
            this.deviceCountStatType = deviceCountStatType;
            return this;
        }

        /**
         * DeviceModel.
         */
        public Builder deviceModel(String deviceModel) {
            this.putQueryParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * DeviceModelId.
         */
        public Builder deviceModelId(String deviceModelId) {
            this.putQueryParameter("DeviceModelId", deviceModelId);
            this.deviceModelId = deviceModelId;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IsQueryNewRegistrationDevice.
         */
        public Builder isQueryNewRegistrationDevice(String isQueryNewRegistrationDevice) {
            this.putQueryParameter("IsQueryNewRegistrationDevice", isQueryNewRegistrationDevice);
            this.isQueryNewRegistrationDevice = isQueryNewRegistrationDevice;
            return this;
        }

        /**
         * IsQueryYearlyActivate.
         */
        public Builder isQueryYearlyActivate(String isQueryYearlyActivate) {
            this.putQueryParameter("IsQueryYearlyActivate", isQueryYearlyActivate);
            this.isQueryYearlyActivate = isQueryYearlyActivate;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CountActivatedOrNewRegistrationDeviceRequest build() {
            return new CountActivatedOrNewRegistrationDeviceRequest(this);
        } 

    } 

}
