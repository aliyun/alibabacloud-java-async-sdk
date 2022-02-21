// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineStepLogRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineStepLogRequest</p>
 */
public class GetPipelineStepLogRequest extends Request {
    @Body
    @NameInMap("JobId")
    @Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private Long jobId;

    @Body
    @NameInMap("Limit")
    @Validation(required = true, maximum = 2000)
    private Long limit;

    @Body
    @NameInMap("Offset")
    @Validation(required = true)
    private Long offset;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true, minLength = 1)
    private String orgId;

    @Body
    @NameInMap("PipelineId")
    @Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private Long pipelineId;

    @Body
    @NameInMap("StepIndex")
    @Validation(required = true)
    private String stepIndex;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private GetPipelineStepLogRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
        this.stepIndex = builder.stepIndex;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineStepLogRequest create() {
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
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
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

    /**
     * @return stepIndex
     */
    public String getStepIndex() {
        return this.stepIndex;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<GetPipelineStepLogRequest, Builder> {
        private Long jobId; 
        private Long limit; 
        private Long offset; 
        private String orgId; 
        private Long pipelineId; 
        private String stepIndex; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineStepLogRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.limit = response.limit;
            this.offset = response.offset;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
            this.stepIndex = response.stepIndex;
            this.userPk = response.userPk;
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
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Long offset) {
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

        /**
         * StepIndex.
         */
        public Builder stepIndex(String stepIndex) {
            this.putBodyParameter("StepIndex", stepIndex);
            this.stepIndex = stepIndex;
            return this;
        }

        /**
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public GetPipelineStepLogRequest build() {
            return new GetPipelineStepLogRequest(this);
        } 

    } 

}
