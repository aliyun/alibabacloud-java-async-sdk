// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentByIdRequest} extends {@link RequestModel}
 *
 * <p>GetAgentByIdRequest</p>
 */
public class GetAgentByIdRequest extends Request {
    @Body
    @NameInMap("AgentId")
    @Validation(required = true, minimum = 1)
    private Long agentId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetAgentByIdRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetAgentByIdRequest, Builder> {
        private Long agentId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentByIdRequest response) {
            super(response);
            this.agentId = response.agentId;
            this.instanceId = response.instanceId;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(Long agentId) {
            this.putBodyParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetAgentByIdRequest build() {
            return new GetAgentByIdRequest(this);
        } 

    } 

}
