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
    private java.util.List<String> callableAgents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

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
    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<String> skills;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tools")
    private java.util.List<String> tools;

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
        this.metadata = builder.metadata;
        this.model = builder.model;
        this.name = builder.name;
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
    public java.util.List<String> getCallableAgents() {
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
     * @return skills
     */
    public java.util.List<String> getSkills() {
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
    public java.util.List<String> getTools() {
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
        private java.util.List<String> callableAgents; 
        private String description; 
        private String displayName; 
        private java.util.Map<String, ?> metadata; 
        private java.util.Map<String, ?> model; 
        private String name; 
        private java.util.List<String> skills; 
        private String systemPrompt; 
        private java.util.List<String> tools; 
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
            this.metadata = request.metadata;
            this.model = request.model;
            this.name = request.name;
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
         * CallableAgents.
         */
        public Builder callableAgents(java.util.List<String> callableAgents) {
            String callableAgentsShrink = shrink(callableAgents, "CallableAgents", "json");
            this.putBodyParameter("CallableAgents", callableAgentsShrink);
            this.callableAgents = callableAgents;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            String metadataShrink = shrink(metadata, "Metadata", "json");
            this.putBodyParameter("Metadata", metadataShrink);
            this.metadata = metadata;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(java.util.Map<String, ?> model) {
            String modelShrink = shrink(model, "Model", "json");
            this.putBodyParameter("Model", modelShrink);
            this.model = model;
            return this;
        }

        /**
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
         * Skills.
         */
        public Builder skills(java.util.List<String> skills) {
            String skillsShrink = shrink(skills, "Skills", "json");
            this.putBodyParameter("Skills", skillsShrink);
            this.skills = skills;
            return this;
        }

        /**
         * SystemPrompt.
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putBodyParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * Tools.
         */
        public Builder tools(java.util.List<String> tools) {
            String toolsShrink = shrink(tools, "Tools", "json");
            this.putBodyParameter("Tools", toolsShrink);
            this.tools = tools;
            return this;
        }

        /**
         * Visibility.
         */
        public Builder visibility(String visibility) {
            this.putBodyParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        /**
         * VisibilityScope.
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
             * ProjectIds.
             */
            public Builder projectIds(java.util.List<String> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * UserIds.
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
