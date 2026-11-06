// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
    @com.aliyun.core.annotation.NameInMap("CallableAgents")
    private java.util.List<CallableAgents> callableAgents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpectedVersion")
    private Integer expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpertSuites")
    private java.util.List<ExpertSuites> expertSuites;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private java.util.Map<String, ?> model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishImmediately")
    private Boolean publishImmediately;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<Skills> skills;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tools")
    private java.util.List<Tools> tools;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VisibilityScope")
    private VisibilityScope visibilityScope;

    private UpdateAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callableAgents = builder.callableAgents;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.expectedVersion = builder.expectedVersion;
        this.expertSuites = builder.expertSuites;
        this.metadata = builder.metadata;
        this.model = builder.model;
        this.name = builder.name;
        this.publishImmediately = builder.publishImmediately;
        this.skills = builder.skills;
        this.systemPrompt = builder.systemPrompt;
        this.tools = builder.tools;
        this.visibility = builder.visibility;
        this.visibilityScope = builder.visibilityScope;
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
     * @return callableAgents
     */
    public java.util.List<CallableAgents> getCallableAgents() {
        return this.callableAgents;
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
    public Integer getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * @return expertSuites
     */
    public java.util.List<ExpertSuites> getExpertSuites() {
        return this.expertSuites;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return model
     */
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return publishImmediately
     */
    public Boolean getPublishImmediately() {
        return this.publishImmediately;
    }

    /**
     * @return skills
     */
    public java.util.List<Skills> getSkills() {
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
    public java.util.List<Tools> getTools() {
        return this.tools;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    /**
     * @return visibilityScope
     */
    public VisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static final class Builder extends Request.Builder<UpdateAgentRequest, Builder> {
        private String regionId; 
        private java.util.List<CallableAgents> callableAgents; 
        private String description; 
        private String displayName; 
        private Integer expectedVersion; 
        private java.util.List<ExpertSuites> expertSuites; 
        private java.util.Map<String, ?> metadata; 
        private java.util.Map<String, ?> model; 
        private String name; 
        private Boolean publishImmediately; 
        private java.util.List<Skills> skills; 
        private String systemPrompt; 
        private java.util.List<Tools> tools; 
        private String visibility; 
        private VisibilityScope visibilityScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callableAgents = request.callableAgents;
            this.description = request.description;
            this.displayName = request.displayName;
            this.expectedVersion = request.expectedVersion;
            this.expertSuites = request.expertSuites;
            this.metadata = request.metadata;
            this.model = request.model;
            this.name = request.name;
            this.publishImmediately = request.publishImmediately;
            this.skills = request.skills;
            this.systemPrompt = request.systemPrompt;
            this.tools = request.tools;
            this.visibility = request.visibility;
            this.visibilityScope = request.visibilityScope;
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
         * <p>The list of callable sub-agent references. For non-empty references, the referenced sub-agents must be visible. The agent cannot reference itself or form a call loop. Omit this parameter if no modification is required. Do not use an empty array to express general retention or clearing semantics.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;data-analysis&quot;}]</p>
         */
        public Builder callableAgents(java.util.List<CallableAgents> callableAgents) {
            String callableAgentsShrink = shrink(callableAgents, "CallableAgents", "json");
            this.putBodyParameter("CallableAgents", callableAgentsShrink);
            this.callableAgents = callableAgents;
            return this;
        }

        /**
         * <p>The description of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analytics assistant</p>
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
         * <p>My Assistant</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The agent definition version used for concurrency control. We recommend that you explicitly specify the AgentVersion just obtained from GetAgent for each call. The update is rejected if the version does not match the current version on the server. To ensure compatibility with different deployment versions, do not rely on the server-side processing when this parameter is omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder expectedVersion(Integer expectedVersion) {
            this.putBodyParameter("ExpectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>The list of expert suite references. If omitted, existing references are retained. An explicit empty array clears the references. For official suites, specify only Source=OFFICIAL and SuiteId. Version, VersionSelector, or client artifact fields are not accepted. For custom suites, use SuiteId, and you can explicitly specify an existing integer Version.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;SuiteId&quot;:&quot;suite_example&quot;,&quot;Version&quot;:3}]</p>
         */
        public Builder expertSuites(java.util.List<ExpertSuites> expertSuites) {
            String expertSuitesShrink = shrink(expertSuites, "ExpertSuites", "json");
            this.putBodyParameter("ExpertSuites", expertSuitesShrink);
            this.expertSuites = expertSuites;
            return this;
        }

        /**
         * <p>The extended metadata. If omitted, existing metadata is retained. If passed, business metadata is updated, and the server retains protected system metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            String metadataShrink = shrink(metadata, "Metadata", "json");
            this.putBodyParameter("Metadata", metadataShrink);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *           &quot;modelName&quot;: &quot;dataworks-public-bailian/qwen-max&quot;
         *         }</p>
         */
        public Builder model(java.util.Map<String, ?> model) {
            String modelShrink = shrink(model, "Model", "json");
            this.putBodyParameter("Model", modelShrink);
            this.model = model;
            return this;
        }

        /**
         * <p>The name of the agent to be updated. Use the Name returned by GetAgent. This field is used to locate the target agent and cannot be used to rename the agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether to publish the agent immediately after the update. Valid values: true: saves a new draft version first and then requests publishing. false or omitted: saves only the definition. Saving and publishing are not atomic operations. If the operation fails, call GetAgent to read the current version back before retrying, to avoid blindly repeating the update.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder publishImmediately(Boolean publishImmediately) {
            this.putBodyParameter("PublishImmediately", publishImmediately);
            this.publishImmediately = publishImmediately;
            return this;
        }

        /**
         * <p>The list of skill references. Omit this parameter if no modification is required. Do not use an empty array to indicate retention or clearing. For official skills, specify only Source=OFFICIAL and SkillId. Name, Version, VersionSelector, or client artifact fields are not accepted. For custom skills, specify Name, and you can explicitly specify an existing integer Version.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Source&quot;:&quot;OFFICIAL&quot;,&quot;SkillId&quot;:&quot;dataworks-semantic&quot;}]</p>
         */
        public Builder skills(java.util.List<Skills> skills) {
            String skillsShrink = shrink(skills, "Skills", "json");
            this.putBodyParameter("Skills", skillsShrink);
            this.skills = skills;
            return this;
        }

        /**
         * <p>The system prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>You are an excellent ETL engineer</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putBodyParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The list of tool references. Omit this parameter if no modification is required. The current new backend retains existing tools even if an empty array is passed. A non-empty array replaces the references. Each item must include Kind and the corresponding configuration, and cannot include only Name. Replace the MCP service and tool names in the example with actual values available to the current identity.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Kind&quot;:&quot;MCP_TOOLSET&quot;,&quot;McpServerName&quot;:&quot;mcp-a&quot;,&quot;McpItems&quot;:[&quot;only-this-tool&quot;]}]</p>
         */
        public Builder tools(java.util.List<Tools> tools) {
            String toolsShrink = shrink(tools, "Tools", "json");
            this.putBodyParameter("Tools", toolsShrink);
            this.tools = tools;
            return this;
        }

        /**
         * <p>The visibility level. Valid values: <br><code>TENANT</code>: visible within the account. <br><code>PROJECT</code>: visible to specified projects. <br><code>USER</code>: visible to specified users.</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        public Builder visibility(String visibility) {
            this.putBodyParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * <p>The visibility scope. The corresponding field is used based on the Visibility parameter.</p>
         */
        public Builder visibilityScope(VisibilityScope visibilityScope) {
            String visibilityScopeShrink = shrink(visibilityScope, "VisibilityScope", "json");
            this.putBodyParameter("VisibilityScope", visibilityScopeShrink);
            this.visibilityScope = visibilityScope;
            return this;
        }

        @Override
        public UpdateAgentRequest build() {
            return new UpdateAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentRequest</p>
     */
    public static class CallableAgents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CallableAgents(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallableAgents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(CallableAgents model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the called sub-agent. The agent must be one that the current caller has permissions to use.</p>
             * 
             * <strong>example:</strong>
             * <p>data-analysis</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CallableAgents build() {
                return new CallableAgents(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentRequest</p>
     */
    public static class ExpertSuites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SuiteId")
        private String suiteId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSelector")
        private String versionSelector;

        private ExpertSuites(Builder builder) {
            this.source = builder.source;
            this.suiteId = builder.suiteId;
            this.version = builder.version;
            this.versionSelector = builder.versionSelector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpertSuites create() {
            return builder().build();
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return suiteId
         */
        public String getSuiteId() {
            return this.suiteId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return versionSelector
         */
        public String getVersionSelector() {
            return this.versionSelector;
        }

        public static final class Builder {
            private String source; 
            private String suiteId; 
            private Integer version; 
            private String versionSelector; 

            private Builder() {
            } 

            private Builder(ExpertSuites model) {
                this.source = model.source;
                this.suiteId = model.suiteId;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The source of the expert suite. OFFICIAL: official suite. DB or omitted: custom suite. Both types of references use SuiteId. Version fields apply only to custom resources.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the target expert suite. The suite must be one that the current caller has permissions to reference.</p>
             * 
             * <strong>example:</strong>
             * <p>suite_example</p>
             */
            public Builder suiteId(String suiteId) {
                this.suiteId = suiteId;
                return this;
            }

            /**
             * <p>The published integer version number of the custom expert suite, used to explicitly select an existing version. Do not pass this field when Source is set to OFFICIAL. This parameter is mutually exclusive with VersionSelector. To obtain explicit and reproducible references, do not rely on the default selection when the version is omitted.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The semantic version selection expression of the custom expert suite, such as ^1.2.3. Use this parameter only when the custom resource version selection capability is deployed on the target server. This parameter is mutually exclusive with Version. This field is not accepted when Source is set to OFFICIAL. To ensure compatibility with servers whose version capabilities are unconfirmed, use an existing integer Version.</p>
             * 
             * <strong>example:</strong>
             * <p>^1.2.3</p>
             */
            public Builder versionSelector(String versionSelector) {
                this.versionSelector = versionSelector;
                return this;
            }

            public ExpertSuites build() {
                return new ExpertSuites(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentRequest</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSelector")
        private String versionSelector;

        private Skills(Builder builder) {
            this.name = builder.name;
            this.skillId = builder.skillId;
            this.source = builder.source;
            this.version = builder.version;
            this.versionSelector = builder.versionSelector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return versionSelector
         */
        public String getVersionSelector() {
            return this.versionSelector;
        }

        public static final class Builder {
            private String name; 
            private String skillId; 
            private String source; 
            private Integer version; 
            private String versionSelector; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.skillId = model.skillId;
                this.source = model.source;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The name of the custom skill. Use the Name of a visible custom skill. For official skills, use SkillId.</p>
             * 
             * <strong>example:</strong>
             * <p>my-business-skill</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource ID of the official skill. This parameter is used when Source is set to OFFICIAL.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks-semantic</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>The source of the skill. OFFICIAL: official skill, used with SkillId. DB or omitted: custom skill, used with Name.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The published integer version number of the custom skill, used to explicitly select an existing version. Do not pass this field when Source is set to OFFICIAL. This parameter is mutually exclusive with VersionSelector.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The semantic version selection expression of the custom skill, such as ^1.2.3. Use this parameter only when the custom resource version selection capability is deployed on the target server. This parameter is mutually exclusive with Version. This field is not accepted when Source is set to OFFICIAL. To ensure compatibility with servers whose version capabilities are unconfirmed, use an existing integer Version.</p>
             * 
             * <strong>example:</strong>
             * <p>^1.2.3</p>
             */
            public Builder versionSelector(String versionSelector) {
                this.versionSelector = versionSelector;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuiltinName")
        private String builtinName;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("McpItems")
        private java.util.List<String> mcpItems;

        @com.aliyun.core.annotation.NameInMap("McpServerName")
        private String mcpServerName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Tools(Builder builder) {
            this.builtinName = builder.builtinName;
            this.kind = builder.kind;
            this.mcpItems = builder.mcpItems;
            this.mcpServerName = builder.mcpServerName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return builtinName
         */
        public String getBuiltinName() {
            return this.builtinName;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return mcpItems
         */
        public java.util.List<String> getMcpItems() {
            return this.mcpItems;
        }

        /**
         * @return mcpServerName
         */
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String builtinName; 
            private String kind; 
            private java.util.List<String> mcpItems; 
            private String mcpServerName; 
            private String name; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.builtinName = model.builtinName;
                this.kind = model.kind;
                this.mcpItems = model.mcpItems;
                this.mcpServerName = model.mcpServerName;
                this.name = model.name;
            } 

            /**
             * <p>The name of the built-in toolset. This parameter is required when Kind is set to BUILTIN_TOOLSET. Use a name supported by the target server. Omit this parameter when Kind is set to MCP_TOOLSET.</p>
             * 
             * <strong>example:</strong>
             * <p>web_search</p>
             */
            public Builder builtinName(String builtinName) {
                this.builtinName = builtinName;
                return this;
            }

            /**
             * <p>The tool type. A valid tool reference must specify BUILTIN_TOOLSET or MCP_TOOLSET. For BUILTIN_TOOLSET, BuiltinName must also be specified. For MCP_TOOLSET, McpServerName must also be specified. The target server validates the reference based on the tool type.</p>
             * 
             * <strong>example:</strong>
             * <p>MCP_TOOLSET</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The list of selected MCP tool names. If this parameter is omitted or an empty array is passed, tools are not filtered by name. Each item must be the name of a tool that actually exists in the target service.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;only-this-tool&quot;]</p>
             */
            public Builder mcpItems(java.util.List<String> mcpItems) {
                this.mcpItems = mcpItems;
                return this;
            }

            /**
             * <p>The MCP service name. This parameter is required when Kind is set to MCP_TOOLSET. The service must be one that the current invoker has permissions to reference and that has an active published version.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-a</p>
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * <p>A field retained from the legacy model. Specifying only Name does not constitute a valid tool configuration and cannot replace Kind, BuiltinName, or McpServerName.</p>
             * 
             * <strong>example:</strong>
             * <p>search_tables</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAgentRequest} extends {@link TeaModel}
     *
     * <p>UpdateAgentRequest</p>
     */
    public static class VisibilityScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<String> projectIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private VisibilityScope(Builder builder) {
            this.projectIds = builder.projectIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisibilityScope create() {
            return builder().build();
        }

        /**
         * @return projectIds
         */
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> projectIds; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(VisibilityScope model) {
                this.projectIds = model.projectIds;
                this.userIds = model.userIds;
            } 

            /**
             * <p>The list of visible project IDs. This parameter takes effect when Visibility is set to <code>PROJECT</code>.</p>
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The list of visible user IDs. This parameter is used when Visibility is set to USER.</p>
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public VisibilityScope build() {
                return new VisibilityScope(this);
            } 

        } 

    }
}
