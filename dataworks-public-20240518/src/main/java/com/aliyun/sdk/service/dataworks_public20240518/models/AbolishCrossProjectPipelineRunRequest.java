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
 * {@link AbolishCrossProjectPipelineRunRequest} extends {@link RequestModel}
 *
 * <p>AbolishCrossProjectPipelineRunRequest</p>
 */
public class AbolishCrossProjectPipelineRunRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PipelineRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineRunId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String reason;

    private AbolishCrossProjectPipelineRunRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pipelineRunId = builder.pipelineRunId;
        this.projectId = builder.projectId;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbolishCrossProjectPipelineRunRequest create() {
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
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<AbolishCrossProjectPipelineRunRequest, Builder> {
        private String regionId; 
        private String pipelineRunId; 
        private Long projectId; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(AbolishCrossProjectPipelineRunRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pipelineRunId = request.pipelineRunId;
            this.projectId = request.projectId;
            this.reason = request.reason;
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
         * <p>The ID of the cross-workspace publish flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fcfd4160-e2ff-4603-9719-09128fe733df</p>
         */
        public Builder pipelineRunId(String pipelineRunId) {
            this.putBodyParameter("PipelineRunId", pipelineRunId);
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The reason for stopping the cross-workspace publish flow.</p>
         * 
         * <strong>example:</strong>
         * <p>The target publish plan has changed. Stop the flow that has not been executed</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public AbolishCrossProjectPipelineRunRequest build() {
            return new AbolishCrossProjectPipelineRunRequest(this);
        } 

    } 

}
