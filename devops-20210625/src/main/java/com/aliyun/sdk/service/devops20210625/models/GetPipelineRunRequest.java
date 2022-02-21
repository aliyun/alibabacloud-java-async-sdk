// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineRunRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineRunRequest</p>
 */
public class GetPipelineRunRequest extends Request {
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

    private GetPipelineRunRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.pipelineRunId = builder.pipelineRunId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRunRequest create() {
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

    public static final class Builder extends Request.Builder<GetPipelineRunRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long pipelineRunId; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineRunRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.pipelineId = response.pipelineId;
            this.pipelineRunId = response.pipelineRunId;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 流水线id
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

        @Override
        public GetPipelineRunRequest build() {
            return new GetPipelineRunRequest(this);
        } 

    } 

}
