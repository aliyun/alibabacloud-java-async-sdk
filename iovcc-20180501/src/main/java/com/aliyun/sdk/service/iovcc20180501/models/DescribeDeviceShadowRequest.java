// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceShadowRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceShadowRequest</p>
 */
public class DescribeDeviceShadowRequest extends Request {
    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ViewSubscribed")
    private Boolean viewSubscribed;

    private DescribeDeviceShadowRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.deviceModel = builder.deviceModel;
        this.path = builder.path;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.viewSubscribed = builder.viewSubscribed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceShadowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return path
     */
    public String getPath() {
        return this.path;
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
     * @return viewSubscribed
     */
    public Boolean getViewSubscribed() {
        return this.viewSubscribed;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceShadowRequest, Builder> {
        private String deviceId; 
        private String deviceModel; 
        private String path; 
        private String projectId; 
        private String regionId; 
        private Boolean viewSubscribed; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceShadowRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.deviceModel = response.deviceModel;
            this.path = response.path;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.viewSubscribed = response.viewSubscribed;
        } 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
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
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
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
         * ViewSubscribed.
         */
        public Builder viewSubscribed(Boolean viewSubscribed) {
            this.putQueryParameter("ViewSubscribed", viewSubscribed);
            this.viewSubscribed = viewSubscribed;
            return this;
        }

        @Override
        public DescribeDeviceShadowRequest build() {
            return new DescribeDeviceShadowRequest(this);
        } 

    } 

}
