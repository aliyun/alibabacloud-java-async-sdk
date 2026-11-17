// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ClearAgentInstanceMemoryRequest} extends {@link RequestModel}
 *
 * <p>ClearAgentInstanceMemoryRequest</p>
 */
public class ClearAgentInstanceMemoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentInstanceId")
    private String agentInstanceId;

    private ClearAgentInstanceMemoryRequest(Builder builder) {
        super(builder);
        this.agentInstanceId = builder.agentInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearAgentInstanceMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentInstanceId
     */
    public String getAgentInstanceId() {
        return this.agentInstanceId;
    }

    public static final class Builder extends Request.Builder<ClearAgentInstanceMemoryRequest, Builder> {
        private String agentInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ClearAgentInstanceMemoryRequest request) {
            super(request);
            this.agentInstanceId = request.agentInstanceId;
        } 

        /**
         * <p>The ID of the agent instance whose memory you want to clear. This parameter is required and can be obtained from the response of ListAgentInstanceMemory.</p>
         * 
         * <strong>example:</strong>
         * <p>agi-08vm****</p>
         */
        public Builder agentInstanceId(String agentInstanceId) {
            this.putBodyParameter("AgentInstanceId", agentInstanceId);
            this.agentInstanceId = agentInstanceId;
            return this;
        }

        @Override
        public ClearAgentInstanceMemoryRequest build() {
            return new ClearAgentInstanceMemoryRequest(this);
        } 

    } 

}
