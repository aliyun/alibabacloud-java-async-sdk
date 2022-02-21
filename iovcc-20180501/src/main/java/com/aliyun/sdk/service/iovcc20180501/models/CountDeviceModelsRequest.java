// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDeviceModelsRequest} extends {@link RequestModel}
 *
 * <p>CountDeviceModelsRequest</p>
 */
public class CountDeviceModelsRequest extends Request {
    @Query
    @NameInMap("DeviceBrand")
    private String deviceBrand;

    @Query
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Query
    @NameInMap("DeviceModelId")
    private Integer deviceModelId;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CountDeviceModelsRequest(Builder builder) {
        super(builder);
        this.deviceBrand = builder.deviceBrand;
        this.deviceModel = builder.deviceModel;
        this.deviceModelId = builder.deviceModelId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountDeviceModelsRequest create() {
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
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return deviceModelId
     */
    public Integer getDeviceModelId() {
        return this.deviceModelId;
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

    public static final class Builder extends Request.Builder<CountDeviceModelsRequest, Builder> {
        private String deviceBrand; 
        private String deviceModel; 
        private Integer deviceModelId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CountDeviceModelsRequest response) {
            super(response);
            this.deviceBrand = response.deviceBrand;
            this.deviceModel = response.deviceModel;
            this.deviceModelId = response.deviceModelId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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
        public Builder deviceModelId(Integer deviceModelId) {
            this.putQueryParameter("DeviceModelId", deviceModelId);
            this.deviceModelId = deviceModelId;
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

        @Override
        public CountDeviceModelsRequest build() {
            return new CountDeviceModelsRequest(this);
        } 

    } 

}
