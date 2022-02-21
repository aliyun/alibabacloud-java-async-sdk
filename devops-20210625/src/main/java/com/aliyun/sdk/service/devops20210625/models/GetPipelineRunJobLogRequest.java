// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineRunJobLogRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineRunJobLogRequest</p>
 */
public class GetPipelineRunJobLogRequest extends Request {
    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Body
    @NameInMap("Limit")
    private Integer limit;

    @Body
    @NameInMap("Offset")
    private Integer offset;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("PipelineId")
    @Validation(required = true)
    private Long pipelineId;

    private GetPipelineRunJobLogRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRunJobLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<GetPipelineRunJobLogRequest, Builder> {
        private Long jobId; 
        private Integer limit; 
        private Integer offset; 
        private String orgId; 
        private Long pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineRunJobLogRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.limit = response.limit;
            this.offset = response.offset;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putBodyParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public GetPipelineRunJobLogRequest build() {
            return new GetPipelineRunJobLogRequest(this);
        } 

    } 

}
