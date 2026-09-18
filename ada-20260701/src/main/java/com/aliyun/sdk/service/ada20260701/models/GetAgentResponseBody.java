// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link GetAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentResponseBody</p>
 */
public class GetAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private Long agentVersion;

    @com.aliyun.core.annotation.NameInMap("CanDelete")
    private Boolean canDelete;

    @com.aliyun.core.annotation.NameInMap("CanModify")
    private Boolean canModify;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBases")
    private Object knowledgeBases;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Object model;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Official")
    private Boolean official;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Skills")
    private Object skills;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.NameInMap("Tools")
    private Object tools;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private GetAgentResponseBody(Builder builder) {
        this.agentId = builder.agentId;
        this.agentVersion = builder.agentVersion;
        this.canDelete = builder.canDelete;
        this.canModify = builder.canModify;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.knowledgeBases = builder.knowledgeBases;
        this.metadata = builder.metadata;
        this.model = builder.model;
        this.name = builder.name;
        this.official = builder.official;
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.status = builder.status;
        this.systemPrompt = builder.systemPrompt;
        this.tools = builder.tools;
        this.updatedAt = builder.updatedAt;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentResponseBody create() {
        return builder().build();
    }

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
     * @return agentVersion
     */
    public Long getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    /**
     * @return canModify
     */
    public Boolean getCanModify() {
        return this.canModify;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return knowledgeBases
     */
    public Object getKnowledgeBases() {
        return this.knowledgeBases;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return model
     */
    public Object getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return official
     */
    public Boolean getOfficial() {
        return this.official;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skills
     */
    public Object getSkills() {
        return this.skills;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return systemPrompt
     */
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    /**
     * @return tools
     */
    public Object getTools() {
        return this.tools;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String agentId; 
        private Long agentVersion; 
        private Boolean canDelete; 
        private Boolean canModify; 
        private Long createdAt; 
        private String description; 
        private String displayName; 
        private Object knowledgeBases; 
        private Object metadata; 
        private Object model; 
        private String name; 
        private Boolean official; 
        private String requestId; 
        private Object skills; 
        private String status; 
        private String systemPrompt; 
        private Object tools; 
        private Long updatedAt; 
        private String visibility; 

        private Builder() {
        } 

        private Builder(GetAgentResponseBody model) {
            this.agentId = model.agentId;
            this.agentVersion = model.agentVersion;
            this.canDelete = model.canDelete;
            this.canModify = model.canModify;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.displayName = model.displayName;
            this.knowledgeBases = model.knowledgeBases;
            this.metadata = model.metadata;
            this.model = model.model;
            this.name = model.name;
            this.official = model.official;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.status = model.status;
            this.systemPrompt = model.systemPrompt;
            this.tools = model.tools;
            this.updatedAt = model.updatedAt;
            this.visibility = model.visibility;
        } 

        /**
         * <p>Agent ID。</p>
         * 
         * <strong>example:</strong>
         * <p>agent_00000000000000000000000000000001</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The current configuration revision number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder agentVersion(Long agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * <p>Indicates whether the current identity can delete the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }

        /**
         * <p>Indicates whether the current identity can modify the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canModify(Boolean canModify) {
            this.canModify = canModify;
            return this;
        }

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788332400000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The description of the agent. This field may not be returned if it is not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyzes code changes and generates CR review comments</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the agent. This field may not be returned if it is not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>CR Code Review Agent</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The list of knowledge base references. The list contains at most one element.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;code-review-guidelines&quot;}]</p>
         */
        public Builder knowledgeBases(Object knowledgeBases) {
            this.knowledgeBases = knowledgeBases;
            return this;
        }

        /**
         * <p>The display metadata of the agent. For specific fields, see &quot;Supplementary description of response elements&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;iconUrl&quot;:&quot;<a href="https://example.com/icons/code-review-agent.png%22%7D">https://example.com/icons/code-review-agent.png&quot;}</a></p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The saved model configuration. This field is returned only for official agents. The value supports an object array and is compatible with legacy single objects and strings. An empty array returns [ \]. Object arrays preserve the original order, duplicate names, and object fields.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;base&quot;,&quot;default&quot;:true},{&quot;name&quot;:&quot;base&quot;},{&quot;name&quot;:&quot;base&quot;,&quot;settings&quot;:{&quot;thinking&quot;:false,&quot;topK&quot;:5}}]</p>
         */
        public Builder model(Object model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-agent</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether the agent is an official agent provided by the platform.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder official(Boolean official) {
            this.official = official;
            return this;
        }

        /**
         * <p>The request ID, which is used for Tracing Analysis and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of skill references. For specific fields, see &quot;Supplementary description of response elements&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;code-review&quot;}]</p>
         */
        public Builder skills(Object skills) {
            this.skills = skills;
            return this;
        }

        /**
         * <p>The status of the agent. The default status of a newly created agent is <code>draft</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The system prompt. This field may not be returned if it is not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>Check the correctness, security, and maintainability of code changes in the CR, and provide review comments by severity</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The list of MCP Server and Connector name references. For element fields, see the following section.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mcpServerName&quot;:&quot;code-repository-mcp&quot;},{&quot;connectorName&quot;:&quot;code-review-data&quot;}]</p>
         */
        public Builder tools(Object tools) {
            this.tools = tools;
            return this;
        }

        /**
         * <p>The most recent update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788332700000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The visibility scope of the agent. Valid values: <code>user</code> and <code>tenant</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public GetAgentResponseBody build() {
            return new GetAgentResponseBody(this);
        } 

    } 

}
