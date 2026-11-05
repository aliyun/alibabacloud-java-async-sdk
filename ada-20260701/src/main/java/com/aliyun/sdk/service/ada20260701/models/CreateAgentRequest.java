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
 * {@link CreateAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRequest</p>
 */
public class CreateAgentRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("KnowledgeBases")
    private Object knowledgeBases;

    @com.aliyun.core.annotation.Body
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

    private CreateAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.displayName = builder.displayName;
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

    public static CreateAgentRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAgentRequest, Builder> {
        private String regionId; 
        private String description; 
        private String displayName; 
        private Object knowledgeBases; 
        private String name; 
        private Object skills; 
        private String systemPrompt; 
        private Object tools; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.displayName = request.displayName;
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
         * <p>The description of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyzes code changes and generates code review comments</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Code Review Agent</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The list of knowledge base references, which can contain at most one element.</p>
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
         * <p>The name of the agent, which is also the unique identifier that cannot be modified after creation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-agent</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of skill references. For specific fields, refer to the supplementary description of request parameters.</p>
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
         * <p>The system prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Check the correctness, security, and maintainability of code changes in the code review, and provide review comments based on severity</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putBodyParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The list of MCP server and connector name references. The same array supports both types of entries. Specify only one type of reference for each entry. For MCP, omitting items indicates all public tools, and historically specified items retain their original values.</p>
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
         * <p>The visibility scope of the agent. Valid values: <code>user</code> and <code>tenant</code>. Default value: <code>user</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder visibility(String visibility) {
            this.putBodyParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public CreateAgentRequest build() {
            return new CreateAgentRequest(this);
        } 

    } 

}
