// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefaultSchemaRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefaultSchemaRequest</p>
 */
public class DescribeDefaultSchemaRequest extends Request {
    @Query
    @NameInMap("DeviceModelId")
    @Validation(required = true)
    private String deviceModelId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeDefaultSchemaRequest(Builder builder) {
        super(builder);
        this.deviceModelId = builder.deviceModelId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultSchemaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceModelId
     */
    public String getDeviceModelId() {
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

    public static final class Builder extends Request.Builder<DescribeDefaultSchemaRequest, Builder> {
        private String deviceModelId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefaultSchemaRequest response) {
            super(response);
            this.deviceModelId = response.deviceModelId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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
        public DescribeDefaultSchemaRequest build() {
            return new DescribeDefaultSchemaRequest(this);
        } 

    } 

}
