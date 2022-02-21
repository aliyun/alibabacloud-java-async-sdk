// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateDeviceRequest</p>
 */
public class CreateDeviceRequest extends Request {
    @Query
    @NameInMap("HardwareId")
    private String hardwareId;

    @Query
    @NameInMap("ModelName")
    private String modelName;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateDeviceRequest(Builder builder) {
        super(builder);
        this.hardwareId = builder.hardwareId;
        this.modelName = builder.modelName;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hardwareId
     */
    public String getHardwareId() {
        return this.hardwareId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
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

    public static final class Builder extends Request.Builder<CreateDeviceRequest, Builder> {
        private String hardwareId; 
        private String modelName; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeviceRequest response) {
            super(response);
            this.hardwareId = response.hardwareId;
            this.modelName = response.modelName;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * HardwareId.
         */
        public Builder hardwareId(String hardwareId) {
            this.putQueryParameter("HardwareId", hardwareId);
            this.hardwareId = hardwareId;
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
        public CreateDeviceRequest build() {
            return new CreateDeviceRequest(this);
        } 

    } 

}
