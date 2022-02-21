// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PassPipelineValidateRequest} extends {@link RequestModel}
 *
 * <p>PassPipelineValidateRequest</p>
 */
public class PassPipelineValidateRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Path
    @NameInMap("pipelineRunId")
    @Validation(required = true)
    private Long pipelineRunId;

    @Path
    @NameInMap("jobId")
    @Validation(required = true)
    private String jobId;

    private PassPipelineValidateRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PassPipelineValidateRequest create() {
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

    public static final class Builder extends Request.Builder<PassPipelineValidateRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long pipelineRunId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(PassPipelineValidateRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.pipelineId = response.pipelineId;
            this.pipelineRunId = response.pipelineRunId;
            this.jobId = response.jobId;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 流水线ID，可在流水线链接中获取，如https://flow.aliyun.com/pipelines/【PipelineId】/current
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * 流水线运行实例id
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.putPathParameter("pipelineRunId", pipelineRunId);
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * 1111
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public PassPipelineValidateRequest build() {
            return new PassPipelineValidateRequest(this);
        } 

    } 

}
