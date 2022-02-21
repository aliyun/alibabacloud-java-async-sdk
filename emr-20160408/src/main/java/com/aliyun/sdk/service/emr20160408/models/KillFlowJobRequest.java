// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillFlowJobRequest} extends {@link RequestModel}
 *
 * <p>KillFlowJobRequest</p>
 */
public class KillFlowJobRequest extends Request {
    @Query
    @NameInMap("JobInstanceId")
    @Validation(required = true)
    private String jobInstanceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private KillFlowJobRequest(Builder builder) {
        super(builder);
        this.jobInstanceId = builder.jobInstanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillFlowJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobInstanceId
     */
    public String getJobInstanceId() {
        return this.jobInstanceId;
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

    public static final class Builder extends Request.Builder<KillFlowJobRequest, Builder> {
        private String jobInstanceId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(KillFlowJobRequest response) {
            super(response);
            this.jobInstanceId = response.jobInstanceId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * JobInstanceId.
         */
        public Builder jobInstanceId(String jobInstanceId) {
            this.putQueryParameter("JobInstanceId", jobInstanceId);
            this.jobInstanceId = jobInstanceId;
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public KillFlowJobRequest build() {
            return new KillFlowJobRequest(this);
        } 

    } 

}
