// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVersionGroupDevicesRequest} extends {@link RequestModel}
 *
 * <p>AddVersionGroupDevicesRequest</p>
 */
public class AddVersionGroupDevicesRequest extends Request {
    @Query
    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    private String deviceGroupId;

    @Query
    @NameInMap("DeviceIdType")
    @Validation(required = true)
    private String deviceIdType;

    @Query
    @NameInMap("DeviceIds")
    @Validation(required = true)
    private String deviceIds;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private AddVersionGroupDevicesRequest(Builder builder) {
        super(builder);
        this.deviceGroupId = builder.deviceGroupId;
        this.deviceIdType = builder.deviceIdType;
        this.deviceIds = builder.deviceIds;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVersionGroupDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return deviceIdType
     */
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    /**
     * @return deviceIds
     */
    public String getDeviceIds() {
        return this.deviceIds;
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

    public static final class Builder extends Request.Builder<AddVersionGroupDevicesRequest, Builder> {
        private String deviceGroupId; 
        private String deviceIdType; 
        private String deviceIds; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddVersionGroupDevicesRequest response) {
            super(response);
            this.deviceGroupId = response.deviceGroupId;
            this.deviceIdType = response.deviceIdType;
            this.deviceIds = response.deviceIds;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * DeviceIdType.
         */
        public Builder deviceIdType(String deviceIdType) {
            this.putQueryParameter("DeviceIdType", deviceIdType);
            this.deviceIdType = deviceIdType;
            return this;
        }

        /**
         * DeviceIds.
         */
        public Builder deviceIds(String deviceIds) {
            this.putQueryParameter("DeviceIds", deviceIds);
            this.deviceIds = deviceIds;
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
        public AddVersionGroupDevicesRequest build() {
            return new AddVersionGroupDevicesRequest(this);
        } 

    } 

}
