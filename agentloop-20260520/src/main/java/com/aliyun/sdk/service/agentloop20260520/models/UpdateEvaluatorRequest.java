// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link UpdateEvaluatorRequest} extends {@link RequestModel}
 *
 * <p>UpdateEvaluatorRequest</p>
 */
public class UpdateEvaluatorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.List<String> annotations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createVersion")
    private Boolean createVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skills")
    private java.util.List<Skills> skills;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateEvaluatorRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.name = builder.name;
        this.annotations = builder.annotations;
        this.config = builder.config;
        this.createVersion = builder.createVersion;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.properties = builder.properties;
        this.skills = builder.skills;
        this.status = builder.status;
        this.version = builder.version;
        this.versionDescription = builder.versionDescription;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEvaluatorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return annotations
     */
    public java.util.List<String> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return createVersion
     */
    public Boolean getCreateVersion() {
        return this.createVersion;
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
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return skills
     */
    public java.util.List<Skills> getSkills() {
        return this.skills;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateEvaluatorRequest, Builder> {
        private String agentSpace; 
        private String name; 
        private java.util.List<String> annotations; 
        private java.util.Map<String, ?> config; 
        private Boolean createVersion; 
        private String description; 
        private String displayName; 
        private java.util.Map<String, ?> properties; 
        private java.util.List<Skills> skills; 
        private String status; 
        private String version; 
        private String versionDescription; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEvaluatorRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.name = request.name;
            this.annotations = request.annotations;
            this.config = request.config;
            this.createVersion = request.createVersion;
            this.description = request.description;
            this.displayName = request.displayName;
            this.properties = request.properties;
            this.skills = request.skills;
            this.status = request.status;
            this.version = request.version;
            this.versionDescription = request.versionDescription;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The name of the AgentSpace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the evaluator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of annotation tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;__en&quot;]</p>
         */
        public Builder annotations(java.util.List<String> annotations) {
            this.putBodyParameter("annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>The configuration for the new version. This parameter is typically required when version is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;prompt&quot;:&quot;Evaluate task completion more strictly&quot;}</p>
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether to create a new draft. Set to true to create a new draft, or false to update a specified existing draft. When this parameter is specified, the version status defaults to DRAFT.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createVersion(Boolean createVersion) {
            this.putBodyParameter("createVersion", createVersion);
            this.createVersion = createVersion;
            return this;
        }

        /**
         * <p>The description of the evaluator.</p>
         * 
         * <strong>example:</strong>
         * <p>Determines whether the agent completes the user task</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Pipeline task completion</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The evaluator properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.putBodyParameter("properties", properties);
            this.properties = properties;
            return this;
        }

        /**
         * <p>The complete list of business skills saved for the standard agent evaluator in this request. Pass an empty array to clear the business skills for this version.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;skillName&quot;:&quot;fact-check&quot;,&quot;files&quot;:[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: Verify factual basis in responses\n---\nVerify the facts in the response item by item and list the basis.&quot;}]}]</p>
         */
        public Builder skills(java.util.List<Skills> skills) {
            this.putBodyParameter("skills", skills);
            this.skills = skills;
            return this;
        }

        /**
         * <p>The status of the evaluator version to be written. Only DRAFT is supported when explicitly specified. To publish a draft, call UpdateEvaluatorVersionStatus.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The new version number. A new version is created when this parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>Optimized scoring instructions</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("versionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency checks.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateEvaluatorRequest build() {
            return new UpdateEvaluatorRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEvaluatorRequest} extends {@link TeaModel}
     *
     * <p>UpdateEvaluatorRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Files(Builder builder) {
            this.content = builder.content;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String content; 
            private String name; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.content = model.content;
                this.name = model.name;
            } 

            /**
             * <p>The text content of the file.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             * <h2>name: fact-check
             * description: Verify factual basis in responses</h2>
             * <p>Verify the facts in the response item by item and list the basis</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The path of the file relative to the root directory of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>SKILL.md</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEvaluatorRequest} extends {@link TeaModel}
     *
     * <p>UpdateEvaluatorRequest</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        private Skills(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.files = builder.files;
            this.skillName = builder.skillName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
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
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private java.util.List<Files> files; 
            private String skillName; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.files = model.files;
                this.skillName = model.skillName;
            } 

            /**
             * <p>The description of the skill purpose.</p>
             * 
             * <strong>example:</strong>
             * <p>Verify factual basis in responses</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>Fact-checking</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Specifies whether to enable the skill. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The complete list of files for the skill, which must include SKILL.md in the root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: Verify factual basis in responses\n---\nVerify the facts in the response item by item and list the basis.&quot;}]</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The name of the skill, which must be unique in the list of skills submitted in this request.</p>
             * 
             * <strong>example:</strong>
             * <p>fact-check</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
}
