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
 * {@link CreateAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRequest</p>
 */
public class CreateAgentRequest extends Request {
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

    private CreateAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callableAgents = builder.callableAgents;
        this.description = builder.description;
        this.displayName = builder.displayName;
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

    public static final class Builder extends Request.Builder<CreateAgentRequest, Builder> {
        private String regionId; 
        private java.util.List<CallableAgents> callableAgents; 
        private String description; 
        private String displayName; 
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

        private Builder(CreateAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callableAgents = request.callableAgents;
            this.description = request.description;
            this.displayName = request.displayName;
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
         * <p>The list of sub-agents that can be called by this agent.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
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
         * <p>The published expert suites bound to the agent. For personal or enterprise suites, use SuiteId, and optionally specify a fixed Version or VersionSelector. For official suites, you must explicitly specify Source=OFFICIAL and the SuiteId from the official catalog, and do not specify Version or VersionSelector. If not specified, an empty list is created, and all official suites are not loaded by default.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Source&quot;:&quot;OFFICIAL&quot;,&quot;SuiteId&quot;:&quot;dataworks-data-analysis-extension&quot;},{&quot;SuiteId&quot;:&quot;suite_example&quot;,&quot;Version&quot;:1}]</p>
         */
        public Builder expertSuites(java.util.List<ExpertSuites> expertSuites) {
            String expertSuitesShrink = shrink(expertSuites, "ExpertSuites", "json");
            this.putBodyParameter("ExpertSuites", expertSuitesShrink);
            this.expertSuites = expertSuites;
            return this;
        }

        /**
         * <p>The extended metadata in key-value pairs.</p>
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
         * <p>The name of the agent. The name must be unique within the current account.</p>
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
         * <p>Specifies whether to publish the agent immediately after creation. A value of true publishes the created version. A value of false or omitting this parameter maintains the original behavior of creating a draft only. Saving and publishing are not atomic operations. If publishing fails, the draft may already exist. Before retrying, query the agent first to avoid duplicate creation.</p>
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
         * <p>The list of skills.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
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
         * <p>You are a data analytics assistant.</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putBodyParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The list of tools.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder tools(java.util.List<Tools> tools) {
            String toolsShrink = shrink(tools, "Tools", "json");
            this.putBodyParameter("Tools", toolsShrink);
            this.tools = tools;
            return this;
        }

        /**
         * <p>The visibility level. Valid values:<br>
         * <code>TENANT</code>: Visible within the account.<br>
         * <code>PROJECT</code>: Visible to specified projects.<br>
         * <code>USER</code>: Visible to specified users.</p>
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
         * <p>The visibility scope. Specify the corresponding fields based on the Visibility value.</p>
         */
        public Builder visibilityScope(VisibilityScope visibilityScope) {
            String visibilityScopeShrink = shrink(visibilityScope, "VisibilityScope", "json");
            this.putBodyParameter("VisibilityScope", visibilityScopeShrink);
            this.visibilityScope = visibilityScope;
            return this;
        }

        @Override
        public CreateAgentRequest build() {
            return new CreateAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentRequest</p>
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
             * <p>The name of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-1</p>
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
     * {@link CreateAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentRequest</p>
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
             * <p>OFFICIAL indicates an official catalog resource. DB indicates a personal or enterprise resource. If omitted, the original database resource query semantics are maintained. For official resources, the artifact version is fixed when the agent is published.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>When passing expert suite references, each item must provide a SuiteId, which is validated by the server. When Source is OFFICIAL, this is the official catalog ID. Otherwise, this is the ID returned by expert suite management. The referenced resource must be visible to the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks-data-analysis-extension</p>
             */
            public Builder suiteId(String suiteId) {
                this.suiteId = suiteId;
                return this;
            }

            /**
             * <p>Used only for personal or enterprise suites. Specifies the fixed integer revision number of a published snapshot. This parameter is mutually exclusive with VersionSelector. Publishing a new version does not change the fixed reference. If both are omitted, the latest version is used for each new session. Do not specify this parameter when Source is OFFICIAL.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Used only for personal or enterprise resources. This parameter is mutually exclusive with Version. Supports exact semantic versions, latest, and full npm/node-semver range syntax, such as 1.2.*, ^1.2.3, ~1.2.3, &gt;=1.0.0 &lt;2.0.0, and 1.x || 2.x. If both are omitted, the latest version is used, and the highest matching published version is selected for each new session. Existing fixed integer references remain unchanged. Do not specify this parameter when Source is OFFICIAL.</p>
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
     * {@link CreateAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentRequest</p>
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
             * <p>The name of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>When Source is OFFICIAL, specify the official catalog ID. Do not specify Name, Version, or VersionSelector. Do not specify this field for personal or enterprise skills.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks-semantic</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>OFFICIAL indicates an official catalog resource. DB indicates a personal or enterprise resource. If omitted, the original query-by-name semantics are maintained.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Used only for personal or enterprise skills. Specifies the fixed integer revision number of a published snapshot. This parameter is mutually exclusive with VersionSelector. Publishing a new version does not change the fixed reference. If both are omitted, the latest version is used for each new session. Do not specify this parameter when Source is OFFICIAL.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Used only for personal or enterprise resources. This parameter is mutually exclusive with Version. Supports exact semantic versions, latest, and full npm/node-semver range syntax, such as 1.2.*, ^1.2.3, ~1.2.3, &gt;=1.0.0 &lt;2.0.0, and 1.x || 2.x. If both are omitted, the latest version is used, and the highest matching published version is selected for each new session. Existing fixed integer references remain unchanged. Do not specify this parameter when Source is OFFICIAL.</p>
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
     * {@link CreateAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentRequest</p>
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
             * <p>Required when Kind is BUILTIN_TOOLSET. Specifies the name of the built-in toolset supported by the target server. Omit this parameter when Kind is MCP_TOOLSET.</p>
             * 
             * <strong>example:</strong>
             * <p>web_search</p>
             */
            public Builder builtinName(String builtinName) {
                this.builtinName = builtinName;
                return this;
            }

            /**
             * <p>Required for valid tool references. BUILTIN_TOOLSET indicates a built-in toolset, and BuiltinName must be specified. MCP_TOOLSET indicates an MCP toolset, and McpServerName must be specified. The target server validates the parameter based on the tool type.</p>
             * 
             * <strong>example:</strong>
             * <p>MCP_TOOLSET</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>Optional when Kind is MCP_TOOLSET. If specified, only the listed tools are used. If omitted or left as an empty array, tools are not filtered by name. Each item must be the name of an actual tool in the target MCP service.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;only-this-tool&quot;]</p>
             */
            public Builder mcpItems(java.util.List<String> mcpItems) {
                this.mcpItems = mcpItems;
                return this;
            }

            /**
             * <p>Required when Kind is MCP_TOOLSET. Specifies the MCP service name that the current caller has permission to reference and that has an active published version.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-a</p>
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * <p>The name of the MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>server-1</p>
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
     * {@link CreateAgentRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentRequest</p>
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
             * <p>The list of visible user IDs. This parameter takes effect when Visibility is set to <code>USER</code>.</p>
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
