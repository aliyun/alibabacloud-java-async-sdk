// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CancelArtifactBuildTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelArtifactBuildTaskRequest</p>
 */
public class CancelArtifactBuildTaskRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BuildTaskId")
    private String buildTaskId;


    private CancelArtifactBuildTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.buildTaskId = builder.buildTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelArtifactBuildTaskRequest create() {
        return builder().build();
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

    /**
     * @return buildTaskId
     */
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String regionId; 
        private String buildTaskId; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the product build task.</p>
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        public CancelArtifactBuildTaskRequest build() {
            return new CancelArtifactBuildTaskRequest(this);
        } 

    } 

}
