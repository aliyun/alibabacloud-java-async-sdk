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
 * {@link UpdateAgentRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentRequest</p>
 */
public class UpdateAgentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectedVersion")
    private Long expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBases")
    private Object knowledgeBases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skills")
    private Object skills;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tools")
    private Object tools;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private UpdateAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.expectedVersion = builder.expectedVersion;
        this.knowledgeBases = builder.knowledgeBases;
        this.name = builder.name;
        this.skills = builder.skills;
        this.systemPrompt = builder.systemPrompt;
        this.tools = builder.tools;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * @return knowledgeBases
     */
    public Object getKnowledgeBases() {
        return this.knowledgeBases;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skills
     */
    public Object getSkills() {
        return this.skills;
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
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<UpdateAgentRequest, Builder> {
        private String regionId; 
        private String description; 
        private String displayName; 
        private Long expectedVersion; 
        private Object knowledgeBases; 
        private String name; 
        private Object skills; 
        private String systemPrompt; 
        private Object tools; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.displayName = request.displayName;
            this.expectedVersion = request.expectedVersion;
            this.knowledgeBases = request.knowledgeBases;
            this.name = request.name;
            this.skills = request.skills;
            this.systemPrompt = request.systemPrompt;
            this.tools = request.tools;
            this.visibility = request.visibility;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The new description. If not specified, the existing value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyzes CR code changes and checks for correctness, security, and maintainability</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The new display name. If not specified, the existing value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>CR Code and Security Review Agent</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The expected current configuration revision number. This parameter is omitted by default. For concurrency protection, pass in the <code>AgentVersion</code> returned by the most recent <code>GetAgent</code> call.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.putBodyParameter("ExpectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>The list of knowledge base bindings, which contains at most one element. If not specified, the existing value is retained. A non-empty array replaces the entire value. Passing <code>[ ]</code> removes all bindings.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;code-review-guidelines&quot;}]</p>
         */
        public Builder knowledgeBases(Object knowledgeBases) {
            this.putBodyParameter("KnowledgeBases", knowledgeBases);
            this.knowledgeBases = knowledgeBases;
            return this;
        }

        /**
         * <p>The name of the Agent to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-agent</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of Skill references. If not specified, the existing value is retained. A non-empty array replaces the entire value. Passing <code>[ ]</code> removes all bindings.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;code-review&quot;}]</p>
         */
        public Builder skills(Object skills) {
            this.putBodyParameter("Skills", skills);
            this.skills = skills;
            return this;
        }

        /**
         * <p>The new system prompt. If not specified, the existing value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Check the CR for code defects, security risks, and compatibility issues, and provide actionable suggestions for fixes</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putBodyParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The list of MCP Server and Connector name references. The same array supports both types of entries. Each entry specifies one type of reference. If items is omitted for an MCP entry, all public tools are included. Previously specified items retain their existing values.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mcpServerName&quot;:&quot;code-repository-mcp&quot;},{&quot;connectorName&quot;:&quot;code-review-data&quot;}]</p>
         */
        public Builder tools(Object tools) {
            this.putBodyParameter("Tools", tools);
            this.tools = tools;
            return this;
        }

        /**
         * <p>The new visibility scope. Valid values:</p>
         * <ul>
         * <li>user</li>
         * <li>tenant</li>
         * </ul>
         * <p>If not specified, the existing value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant</p>
         */
        public Builder visibility(String visibility) {
            this.putBodyParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public UpdateAgentRequest build() {
            return new UpdateAgentRequest(this);
        } 

    } 

}
