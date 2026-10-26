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
         * <p>The list of child agents that can be called by this agent.</p>
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
         * <p>Agent 绑定的已发布专家套件。个人或企业套件使用 SuiteId，可选 Version；官方套件必须显式指定 Source=OFFICIAL 和官方目录中的 SuiteId，不传 Version。未传时创建为空，不会默认加载所有官方套件。</p>
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
         * <p>是否在创建 Agent 后立即发布。true 发布创建的版本；false 或省略保持原有仅创建草稿行为。保存与发布不是原子操作，发布失败时草稿可能已存在；重试前应先查询 Agent，避免重复创建。</p>
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
         * <p>You are a data analytics assistant</p>
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
         * <p>The visibility level.<br>
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
         * <p>The visibility scope. The corresponding field is used based on the visibility level.</p>
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

        private ExpertSuites(Builder builder) {
            this.source = builder.source;
            this.suiteId = builder.suiteId;
            this.version = builder.version;
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

        public static final class Builder {
            private String source; 
            private String suiteId; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(ExpertSuites model) {
                this.source = model.source;
                this.suiteId = model.suiteId;
                this.version = model.version;
            } 

            /**
             * <p>OFFICIAL 表示官方目录资源；DB 表示个人或企业资源。省略时保持原有数据库资源查询语义。官方资源在 Agent 发布时固定制品版本。</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>传入专家套件引用时，每项需提供 SuiteId，由服务端校验。Source=OFFICIAL 时为官方目录 ID；其他情况为专家套件管理返回的 ID。引用资源必须对调用者可见。</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks-data-analysis-extension</p>
             */
            public Builder suiteId(String suiteId) {
                this.suiteId = suiteId;
                return this;
            }

            /**
             * <p>仅用于个人或企业套件，必须为已发布快照的整数版本号。省略时在 Agent 发布时固定当前已发布版本。Source=OFFICIAL 时不传此字段。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
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

        private Skills(Builder builder) {
            this.name = builder.name;
            this.skillId = builder.skillId;
            this.source = builder.source;
            this.version = builder.version;
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

        public static final class Builder {
            private String name; 
            private String skillId; 
            private String source; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.skillId = model.skillId;
                this.source = model.source;
                this.version = model.version;
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
             * <p>Source=OFFICIAL 时传官方目录 ID，不传 Name 或 Version。个人或企业 Skill 不传此字段。</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks-semantic</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>OFFICIAL 表示官方目录资源；DB 表示个人或企业资源，省略时保持原有按名称查询语义。</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>仅用于个人或企业 Skill，必须为已发布快照的整数版本。省略时在 Agent 发布时固定当前已发布版本；Source=OFFICIAL 时不传。</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
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
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Tools(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
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

            private Builder(Tools model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the McpServer.</p>
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
