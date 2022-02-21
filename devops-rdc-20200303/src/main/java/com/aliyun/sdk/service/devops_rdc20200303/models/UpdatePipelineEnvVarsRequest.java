// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineEnvVarsRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineEnvVarsRequest</p>
 */
public class UpdatePipelineEnvVarsRequest extends Request {
    @Query
    @NameInMap("EnvVars")
    private String envVars;

    @Query
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Query
    @NameInMap("PipelineId")
    private Long pipelineId;

    private UpdatePipelineEnvVarsRequest(Builder builder) {
        super(builder);
        this.envVars = builder.envVars;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineEnvVarsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envVars
     */
    public String getEnvVars() {
        return this.envVars;
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

    public static final class Builder extends Request.Builder<UpdatePipelineEnvVarsRequest, Builder> {
        private String envVars; 
        private String orgId; 
        private Long pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelineEnvVarsRequest response) {
            super(response);
            this.envVars = response.envVars;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
        } 

        /**
         * 需要修改的环境变量和默认值，json形式
         */
        public Builder envVars(String envVars) {
            this.putQueryParameter("EnvVars", envVars);
            this.envVars = envVars;
            return this;
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
         * 流水线id
         */
        public Builder pipelineId(Long pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public UpdatePipelineEnvVarsRequest build() {
            return new UpdatePipelineEnvVarsRequest(this);
        } 

    } 

}
