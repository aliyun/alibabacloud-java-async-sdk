// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeInstanceRequest} extends {@link RequestModel}
 *
 * <p>ResumeInstanceRequest</p>
 */
public class ResumeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    private ResumeInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeInstanceRequest create() {
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
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public static final class Builder extends Request.Builder<ResumeInstanceRequest, Builder> {
        private String regionId; 
        private Long instanceId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(ResumeInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.projectEnv = request.projectEnv;
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
         * The instance ID.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public ResumeInstanceRequest build() {
            return new ResumeInstanceRequest(this);
        } 

    } 

}
