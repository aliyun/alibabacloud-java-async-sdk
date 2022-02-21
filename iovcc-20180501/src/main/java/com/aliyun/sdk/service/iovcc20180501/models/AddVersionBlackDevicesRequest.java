// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVersionBlackDevicesRequest} extends {@link RequestModel}
 *
 * <p>AddVersionBlackDevicesRequest</p>
 */
public class AddVersionBlackDevicesRequest extends Request {
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
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    @Query
    @NameInMap("VersionType")
    @Validation(required = true)
    private String versionType;

    private AddVersionBlackDevicesRequest(Builder builder) {
        super(builder);
        this.deviceIdType = builder.deviceIdType;
        this.deviceIds = builder.deviceIds;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.versionId = builder.versionId;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVersionBlackDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionType
     */
    public String getVersionType() {
        return this.versionType;
    }

    public static final class Builder extends Request.Builder<AddVersionBlackDevicesRequest, Builder> {
        private String deviceIdType; 
        private String deviceIds; 
        private String projectId; 
        private String regionId; 
        private String versionId; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(AddVersionBlackDevicesRequest response) {
            super(response);
            this.deviceIdType = response.deviceIdType;
            this.deviceIds = response.deviceIds;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.versionId = response.versionId;
            this.versionType = response.versionType;
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

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * VersionType.
         */
        public Builder versionType(String versionType) {
            this.putQueryParameter("VersionType", versionType);
            this.versionType = versionType;
            return this;
        }

        @Override
        public AddVersionBlackDevicesRequest build() {
            return new AddVersionBlackDevicesRequest(this);
        } 

    } 

}
