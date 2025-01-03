// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link RefusePipelineValidateRequest} extends {@link RequestModel}
 *
 * <p>RefusePipelineValidateRequest</p>
 */
public class RefusePipelineValidateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineRunId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private RefusePipelineValidateRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefusePipelineValidateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return pipelineRunId
     */
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<RefusePipelineValidateRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long pipelineRunId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(RefusePipelineValidateRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.pipelineRunId = request.pipelineRunId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>12222</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>流水线ID，可在流水线链接中获取，如<a href="https://flow.aliyun.com/pipelines/%E3%80%90PipelineId%E3%80%91/current">https://flow.aliyun.com/pipelines/【PipelineId】/current</a></p>
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>流水线运行实例id</p>
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.putPathParameter("pipelineRunId", pipelineRunId);
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public RefusePipelineValidateRequest build() {
            return new RefusePipelineValidateRequest(this);
        } 

    } 

}
