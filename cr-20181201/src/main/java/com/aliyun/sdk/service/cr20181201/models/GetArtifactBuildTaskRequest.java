// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactBuildTaskRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactBuildTaskRequest</p>
 */
public class GetArtifactBuildTaskRequest extends Request {
    @Query
    @NameInMap("BuildTaskId")
    @Validation(required = true)
    private String buildTaskId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetArtifactBuildTaskRequest(Builder builder) {
        super(builder);
        this.buildTaskId = builder.buildTaskId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactBuildTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildTaskId
     */
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetArtifactBuildTaskRequest, Builder> {
        private String buildTaskId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactBuildTaskRequest response) {
            super(response);
            this.buildTaskId = response.buildTaskId;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * BuildTaskId.
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public GetArtifactBuildTaskRequest build() {
            return new GetArtifactBuildTaskRequest(this);
        } 

    } 

}
