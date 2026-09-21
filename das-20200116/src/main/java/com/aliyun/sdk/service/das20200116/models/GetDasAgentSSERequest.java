// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetDasAgentSSERequest} extends {@link RequestModel}
 *
 * <p>GetDasAgentSSERequest</p>
 */
public class GetDasAgentSSERequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private GetDasAgentSSERequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.instanceId = builder.instanceId;
        this.query = builder.query;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDasAgentSSERequest create() {
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

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<GetDasAgentSSERequest, Builder> {
        private String agentId; 
        private String instanceId; 
        private String query; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDasAgentSSERequest request) {
            super(request);
            this.agentId = request.agentId;
            this.instanceId = request.instanceId;
            this.query = request.query;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>Optional. By default, the default agent is used. You can also specify an agent that was generated after enabling the DAS Agent service or an agent that you manually created.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-472T0DxtmjIxxxxx</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>Deprecated parameter. The instance ID is passed through the Query field.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The natural language description for the query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Are there any issues or abnormalities with my instance rm-xxx?</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Optional. The session ID in UUID string format. If not specified, a new session is created. To maintain context across conversations, use the same session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetDasAgentSSERequest build() {
            return new GetDasAgentSSERequest(this);
        } 

    } 

}
