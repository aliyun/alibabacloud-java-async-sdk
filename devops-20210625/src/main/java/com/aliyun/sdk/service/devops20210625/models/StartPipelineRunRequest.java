// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPipelineRunRequest} extends {@link RequestModel}
 *
 * <p>StartPipelineRunRequest</p>
 */
public class StartPipelineRunRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Body
    @NameInMap("params")
    private String params;

    private StartPipelineRunRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPipelineRunRequest create() {
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
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<StartPipelineRunRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(StartPipelineRunRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.params = request.params;
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
         * 流水线ID，可在流水线链接中获取，如  https:// flow.aliyun.com/pipelines/【PipelineId】/current
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * 流水线运行参数,json字符串 branchModeBranchs  分支模式运行的分支 envs  环境变量 runningBranchs 运行分支 runningTags  运行代码tag comment  运行备注
         */
        public Builder params(String params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        @Override
        public StartPipelineRunRequest build() {
            return new StartPipelineRunRequest(this);
        } 

    } 

}
