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
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("BuildTaskId")
    @Validation(required = true)
    private String buildTaskId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetArtifactBuildTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildTaskId = builder.buildTaskId;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetArtifactBuildTaskRequest, Builder> {
        private String regionId; 
        private String buildTaskId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactBuildTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildTaskId = request.buildTaskId;
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the artifact building task.
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetArtifactBuildTaskRequest build() {
            return new GetArtifactBuildTaskRequest(this);
        } 

    } 

}
