// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceGroupStatusRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineInstanceGroupStatusRequest</p>
 */
public class GetPipelineInstanceGroupStatusRequest extends Request {
    @Body
    @NameInMap("FlowInstanceId")
    @Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private Long flowInstanceId;

    @Query
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Query
    @NameInMap("PipelineId")
    @Validation(required = true, maximum = 999999999999999D, minimum = 1)
    private Long pipelineId;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private GetPipelineInstanceGroupStatusRequest(Builder builder) {
        super(builder);
        this.flowInstanceId = builder.flowInstanceId;
        this.orgId = builder.orgId;
        this.pipelineId = builder.pipelineId;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineInstanceGroupStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowInstanceId
     */
    public Long getFlowInstanceId() {
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

    public static final class Builder extends Request.Builder<GetPipelineInstanceGroupStatusRequest, Builder> {
        private Long flowInstanceId; 
        private String orgId; 
        private Long pipelineId; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineInstanceGroupStatusRequest response) {
            super(response);
            this.flowInstanceId = response.flowInstanceId;
            this.orgId = response.orgId;
            this.pipelineId = response.pipelineId;
            this.userPk = response.userPk;
        } 

        /**
         * FlowInstanceId.
         */
        public Builder flowInstanceId(Long flowInstanceId) {
            this.putBodyParameter("FlowInstanceId", flowInstanceId);
            this.flowInstanceId = flowInstanceId;
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
         * PipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
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
        public GetPipelineInstanceGroupStatusRequest build() {
            return new GetPipelineInstanceGroupStatusRequest(this);
        } 

    } 

}
