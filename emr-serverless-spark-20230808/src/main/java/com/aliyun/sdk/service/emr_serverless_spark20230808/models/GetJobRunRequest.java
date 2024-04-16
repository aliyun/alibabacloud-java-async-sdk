// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobRunRequest} extends {@link RequestModel}
 *
 * <p>GetJobRunRequest</p>
 */
public class GetJobRunRequest extends Request {
    @Path
    @NameInMap("workspaceId")
    private String workspaceId;

    @Path
    @NameInMap("jobRunId")
    private String jobRunId;

    @Query
    @NameInMap("regionId")
    private String regionId;

    private GetJobRunRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.jobRunId = builder.jobRunId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRunRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return jobRunId
     */
    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetJobRunRequest, Builder> {
        private String workspaceId; 
        private String jobRunId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetJobRunRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.jobRunId = request.jobRunId;
            this.regionId = request.regionId;
        } 

        /**
         * 工作空间id。
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * 任务实例ID。
         */
        public Builder jobRunId(String jobRunId) {
            this.putPathParameter("jobRunId", jobRunId);
            this.jobRunId = jobRunId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetJobRunRequest build() {
            return new GetJobRunRequest(this);
        } 

    } 

}
