// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAgentRequest} extends {@link RequestModel}
 *
 * <p>GetAgentRequest</p>
 */
public class GetAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agent_id")
    private String agentId;

    private GetAgentRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    public static final class Builder extends Request.Builder<GetAgentRequest, Builder> {
        private String agentId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentRequest request) {
            super(request);
            this.agentId = request.agentId;
        } 

        /**
         * agent_id.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agent_id", agentId);
            this.agentId = agentId;
            return this;
        }

        @Override
        public GetAgentRequest build() {
            return new GetAgentRequest(this);
        } 

    } 

}
