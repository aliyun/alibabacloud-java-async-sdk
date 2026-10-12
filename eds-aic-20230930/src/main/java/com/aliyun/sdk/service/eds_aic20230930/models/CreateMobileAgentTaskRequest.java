// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateMobileAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMobileAgentTaskRequest</p>
 */
public class CreateMobileAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputParam")
    private String inputParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private String nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateMobileAgentTaskRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.inputParam = builder.inputParam;
        this.name = builder.name;
        this.nodeIds = builder.nodeIds;
        this.sessionId = builder.sessionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMobileAgentTaskRequest create() {
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
     * @return inputParam
     */
    public String getInputParam() {
        return this.inputParam;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMobileAgentTaskRequest, Builder> {
        private String agentId; 
        private String inputParam; 
        private String name; 
        private String nodeIds; 
        private String sessionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMobileAgentTaskRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.inputParam = request.inputParam;
            this.name = request.name;
            this.nodeIds = request.nodeIds;
            this.sessionId = request.sessionId;
            this.type = request.type;
        } 

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agt-mobileagent</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The task input.</p>
         * 
         * <strong>example:</strong>
         * <p>Open DingTalk and reply to the first 5 unread messages</p>
         */
        public Builder inputParam(String inputParam) {
            this.putQueryParameter("InputParam", inputParam);
            this.inputParam = inputParam;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto-reply to DingTalk messages</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of node IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-csbdhjcbvfd****</p>
         */
        public Builder nodeIds(String nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The session ID. Tasks with the same session ID share the same context.</p>
         * 
         * <strong>example:</strong>
         * <p>ses-261005-6ekkb1m9ls00</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>mobile_use_agent</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMobileAgentTaskRequest build() {
            return new CreateMobileAgentTaskRequest(this);
        } 

    } 

}
