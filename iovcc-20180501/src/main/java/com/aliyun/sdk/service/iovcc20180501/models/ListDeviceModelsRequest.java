// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceModelsRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceModelsRequest</p>
 */
public class ListDeviceModelsRequest extends Request {
    @Query
    @NameInMap("DeviceBrand")
    private String deviceBrand;

    @Query
    @NameInMap("DeviceBrandId")
    private Long deviceBrandId;

    @Query
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Query
    @NameInMap("DeviceModelId")
    private Integer deviceModelId;

    @Query
    @NameInMap("Length")
    private String length;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Start")
    private String start;

    private ListDeviceModelsRequest(Builder builder) {
        super(builder);
        this.deviceBrand = builder.deviceBrand;
        this.deviceBrandId = builder.deviceBrandId;
        this.deviceModel = builder.deviceModel;
        this.deviceModelId = builder.deviceModelId;
        this.length = builder.length;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceModelsRequest create() {
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
    public Long getDeviceBrandId() {
        return this.deviceBrandId;
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
     * @return length
     */
    public String getLength() {
        return this.length;
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
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<ListDeviceModelsRequest, Builder> {
        private String deviceBrand; 
        private Long deviceBrandId; 
        private String deviceModel; 
        private Integer deviceModelId; 
        private String length; 
        private String projectId; 
        private String regionId; 
        private String start; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceModelsRequest response) {
            super(response);
            this.deviceBrand = response.deviceBrand;
            this.deviceBrandId = response.deviceBrandId;
            this.deviceModel = response.deviceModel;
            this.deviceModelId = response.deviceModelId;
            this.length = response.length;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.start = response.start;
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
        public Builder deviceBrandId(Long deviceBrandId) {
            this.putQueryParameter("DeviceBrandId", deviceBrandId);
            this.deviceBrandId = deviceBrandId;
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
         * Length.
         */
        public Builder length(String length) {
            this.putQueryParameter("Length", length);
            this.length = length;
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
         * Start.
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public ListDeviceModelsRequest build() {
            return new ListDeviceModelsRequest(this);
        } 

    } 

}
