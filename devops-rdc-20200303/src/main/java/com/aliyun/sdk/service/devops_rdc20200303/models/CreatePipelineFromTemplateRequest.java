// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineFromTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineFromTemplateRequest</p>
 */
public class CreatePipelineFromTemplateRequest extends Request {
    @Query
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Query
    @NameInMap("PipelineName")
    @Validation(required = true)
    private String pipelineName;

    @Query
    @NameInMap("PipelineTemplateId")
    @Validation(required = true)
    private Long pipelineTemplateId;

    private CreatePipelineFromTemplateRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.pipelineName = builder.pipelineName;
        this.pipelineTemplateId = builder.pipelineTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineFromTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return pipelineTemplateId
     */
    public Long getPipelineTemplateId() {
        return this.pipelineTemplateId;
    }

    public static final class Builder extends Request.Builder<CreatePipelineFromTemplateRequest, Builder> {
        private String orgId; 
        private String pipelineName; 
        private Long pipelineTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineFromTemplateRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.pipelineName = response.pipelineName;
            this.pipelineTemplateId = response.pipelineTemplateId;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * 流水线名称
         */
        public Builder pipelineName(String pipelineName) {
            this.putQueryParameter("PipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * 流水线模板的ID，可通过GetPipelineTemplates获取到该信息
         */
        public Builder pipelineTemplateId(Long pipelineTemplateId) {
            this.putQueryParameter("PipelineTemplateId", pipelineTemplateId);
            this.pipelineTemplateId = pipelineTemplateId;
            return this;
        }

        @Override
        public CreatePipelineFromTemplateRequest build() {
            return new CreatePipelineFromTemplateRequest(this);
        } 

    } 

}
