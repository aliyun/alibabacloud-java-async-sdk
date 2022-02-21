// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecutePipelineRequest} extends {@link RequestModel}
 *
 * <p>ExecutePipelineRequest</p>
 */
public class ExecutePipelineRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("Parameters")
    private String parameters;

    @Body
    @NameInMap("PipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private ExecutePipelineRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.parameters = builder.parameters;
        this.pipelineId = builder.pipelineId;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecutePipelineRequest create() {
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
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<ExecutePipelineRequest, Builder> {
        private String orgId; 
        private String parameters; 
        private Long pipelineId; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(ExecutePipelineRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.parameters = response.parameters;
            this.pipelineId = response.pipelineId;
            this.userPk = response.userPk;
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
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
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
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public ExecutePipelineRequest build() {
            return new ExecutePipelineRequest(this);
        } 

    } 

}
