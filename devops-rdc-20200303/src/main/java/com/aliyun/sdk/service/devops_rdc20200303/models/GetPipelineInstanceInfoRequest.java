// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceInfoRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineInstanceInfoRequest</p>
 */
public class GetPipelineInstanceInfoRequest extends Request {
    @Body
    @NameInMap("FlowInstanceId")
    @Validation(required = true)
    private String flowInstanceId;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("PipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private GetPipelineInstanceInfoRequest(Builder builder) {
        super(builder);
        this.flowInstanceId = builder.flowInstanceId;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineInstanceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowInstanceId
     */
    public String getFlowInstanceId() {
        return this.flowInstanceId;
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
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<GetPipelineInstanceInfoRequest, Builder> {
        private String flowInstanceId; 
        private String orgId; 
        private Long pipelineId; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineInstanceInfoRequest response) {
            super(response);
            this.flowInstanceId = response.flowInstanceId;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
            this.userPk = response.userPk;
        } 

        /**
         * FlowInstanceId.
         */
        public Builder flowInstanceId(String flowInstanceId) {
            this.putBodyParameter("FlowInstanceId", flowInstanceId);
            this.flowInstanceId = flowInstanceId;
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
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public GetPipelineInstanceInfoRequest build() {
            return new GetPipelineInstanceInfoRequest(this);
        } 

    } 

}
