// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceModelRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceModelRequest</p>
 */
public class DescribeDeviceModelRequest extends Request {
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

    private DescribeDeviceModelRequest(Builder builder) {
        super(builder);
        this.deviceModel = builder.deviceModel;
        this.deviceModelId = builder.deviceModelId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeDeviceModelRequest, Builder> {
        private String deviceModel; 
        private Integer deviceModelId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceModelRequest response) {
            super(response);
            this.deviceModel = response.deviceModel;
            this.deviceModelId = response.deviceModelId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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
        public DescribeDeviceModelRequest build() {
            return new DescribeDeviceModelRequest(this);
        } 

    } 

}
