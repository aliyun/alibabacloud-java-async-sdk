// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceValiditySchemaRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceValiditySchemaRequest</p>
 */
public class DescribeDeviceValiditySchemaRequest extends Request {
    @Query
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SchemaVersion")
    private String schemaVersion;

    private DescribeDeviceValiditySchemaRequest(Builder builder) {
        super(builder);
        this.deviceModel = builder.deviceModel;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.schemaVersion = builder.schemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceValiditySchemaRequest create() {
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
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceValiditySchemaRequest, Builder> {
        private String deviceModel; 
        private String projectId; 
        private String regionId; 
        private String schemaVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceValiditySchemaRequest response) {
            super(response);
            this.deviceModel = response.deviceModel;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.schemaVersion = response.schemaVersion;
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
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.putQueryParameter("SchemaVersion", schemaVersion);
            this.schemaVersion = schemaVersion;
            return this;
        }

        @Override
        public DescribeDeviceValiditySchemaRequest build() {
            return new DescribeDeviceValiditySchemaRequest(this);
        } 

    } 

}
