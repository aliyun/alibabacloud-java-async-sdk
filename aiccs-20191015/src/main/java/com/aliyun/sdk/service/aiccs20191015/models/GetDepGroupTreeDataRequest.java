// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDepGroupTreeDataRequest} extends {@link RequestModel}
 *
 * <p>GetDepGroupTreeDataRequest</p>
 */
public class GetDepGroupTreeDataRequest extends Request {
    @Query
    @NameInMap("AgentId")
    @Validation(required = true)
    private Long agentId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetDepGroupTreeDataRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDepGroupTreeDataRequest create() {
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

    public static final class Builder extends Request.Builder<GetDepGroupTreeDataRequest, Builder> {
        private Long agentId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDepGroupTreeDataRequest response) {
            super(response);
            this.agentId = response.agentId;
            this.instanceId = response.instanceId;
        } 

        /**
         * 坐席ID
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * 租户实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetDepGroupTreeDataRequest build() {
            return new GetDepGroupTreeDataRequest(this);
        } 

    } 

}
