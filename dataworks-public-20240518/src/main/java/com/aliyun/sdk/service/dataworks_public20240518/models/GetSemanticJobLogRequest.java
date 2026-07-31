// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSemanticJobLogRequest} extends {@link RequestModel}
 *
 * <p>GetSemanticJobLogRequest</p>
 */
public class GetSemanticJobLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutorJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executorJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private GetSemanticJobLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.executorJobId = builder.executorJobId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSemanticJobLogRequest create() {
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
     * @return executorJobId
     */
    public String getExecutorJobId() {
        return this.executorJobId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetSemanticJobLogRequest, Builder> {
        private String regionId; 
        private String executorJobId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetSemanticJobLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.executorJobId = request.executorJobId;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-job-demo</p>
         */
        public Builder executorJobId(String executorJobId) {
            this.putQueryParameter("ExecutorJobId", executorJobId);
            this.executorJobId = executorJobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetSemanticJobLogRequest build() {
            return new GetSemanticJobLogRequest(this);
        } 

    } 

}
