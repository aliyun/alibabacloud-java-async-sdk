// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link CreateMemoryRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryRequest</p>
 */
public class CreateMemoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agent_id")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enhancements")
    private java.util.Map<String, ?> enhancements;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    private Object messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("run_id")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private CreateMemoryRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.agentId = builder.agentId;
        this.enhancements = builder.enhancements;
        this.messages = builder.messages;
        this.runId = builder.runId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return enhancements
     */
    public java.util.Map<String, ?> getEnhancements() {
        return this.enhancements;
    }

    /**
     * @return messages
     */
    public Object getMessages() {
        return this.messages;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateMemoryRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private String agentId; 
        private java.util.Map<String, ?> enhancements; 
        private Object messages; 
        private String runId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.agentId = request.agentId;
            this.enhancements = request.enhancements;
            this.messages = request.messages;
            this.runId = request.runId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * agent_id.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agent_id", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * enhancements.
         */
        public Builder enhancements(java.util.Map<String, ?> enhancements) {
            this.putBodyParameter("enhancements", enhancements);
            this.enhancements = enhancements;
            return this;
        }

        /**
         * messages.
         */
        public Builder messages(Object messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * run_id.
         */
        public Builder runId(String runId) {
            this.putBodyParameter("run_id", runId);
            this.runId = runId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateMemoryRequest build() {
            return new CreateMemoryRequest(this);
        } 

    } 

}
