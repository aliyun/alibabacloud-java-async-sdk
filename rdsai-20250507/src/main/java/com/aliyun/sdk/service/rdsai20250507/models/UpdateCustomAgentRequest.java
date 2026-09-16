// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link UpdateCustomAgentRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomAgentRequest</p>
 */
public class UpdateCustomAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTools")
    private Boolean enableTools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    private java.util.List<String> skillIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tools")
    private java.util.List<String> tools;

    private UpdateCustomAgentRequest(Builder builder) {
        super(builder);
        this.customAgentId = builder.customAgentId;
        this.enableTools = builder.enableTools;
        this.name = builder.name;
        this.skillIds = builder.skillIds;
        this.systemPrompt = builder.systemPrompt;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customAgentId
     */
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    /**
     * @return enableTools
     */
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skillIds
     */
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
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
    public java.util.List<String> getTools() {
        return this.tools;
    }

    public static final class Builder extends Request.Builder<UpdateCustomAgentRequest, Builder> {
        private String customAgentId; 
        private Boolean enableTools; 
        private String name; 
        private java.util.List<String> skillIds; 
        private String systemPrompt; 
        private java.util.List<String> tools; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomAgentRequest request) {
            super(request);
            this.customAgentId = request.customAgentId;
            this.enableTools = request.enableTools;
            this.name = request.name;
            this.skillIds = request.skillIds;
            this.systemPrompt = request.systemPrompt;
            this.tools = request.tools;
        } 

        /**
         * <p>AgentId。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ebe44453-3b41-4c74-94d1-01d088d7****</p>
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        /**
         * <p>Specifies whether to enable tools.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTools(Boolean enableTools) {
            this.putQueryParameter("EnableTools", enableTools);
            this.enableTools = enableTools;
            return this;
        }

        /**
         * <p>The name of the dedicated agent.</p>
         * 
         * <strong>example:</strong>
         * <p>QueryInstanceListAgent</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SkillIds.
         */
        public Builder skillIds(java.util.List<String> skillIds) {
            String skillIdsShrink = shrink(skillIds, "SkillIds", "json");
            this.putQueryParameter("SkillIds", skillIdsShrink);
            this.skillIds = skillIds;
            return this;
        }

        /**
         * <p>The system prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>I am your dedicated agent for querying instance lists</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putQueryParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The tool information.</p>
         */
        public Builder tools(java.util.List<String> tools) {
            String toolsShrink = shrink(tools, "Tools", "json");
            this.putQueryParameter("Tools", toolsShrink);
            this.tools = tools;
            return this;
        }

        @Override
        public UpdateCustomAgentRequest build() {
            return new UpdateCustomAgentRequest(this);
        } 

    } 

}
