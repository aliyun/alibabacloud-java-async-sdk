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
 * {@link CreateEvaluatorSkillRequest} extends {@link RequestModel}
 *
 * <p>CreateEvaluatorSkillRequest</p>
 */
public class CreateEvaluatorSkillRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("files")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateEvaluatorSkillRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.agentSpace = builder.agentSpace;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.enable = builder.enable;
        this.files = builder.files;
        this.skillName = builder.skillName;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEvaluatorSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateEvaluatorSkillRequest, Builder> {
        private String name; 
        private String agentSpace; 
        private String description; 
        private String displayName; 
        private Boolean enable; 
        private java.util.List<Files> files; 
        private String skillName; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateEvaluatorSkillRequest request) {
            super(request);
            this.name = request.name;
            this.agentSpace = request.agentSpace;
            this.description = request.description;
            this.displayName = request.displayName;
            this.enable = request.enable;
            this.files = request.files;
            this.skillName = request.skillName;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The evaluator name.</p>
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
         * <p>The AgentSpace name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putQueryParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Reads trace context to assist evaluation</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>Trace Context Loader</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The list of skill files.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;# Trace Context Loader&quot;,&quot;remark&quot;:&quot;Main skill description&quot;}]</p>
         */
        public Builder files(java.util.List<Files> files) {
            this.putBodyParameter("files", files);
            this.files = files;
            return this;
        }

        /**
         * <p>The skill name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_context_loader</p>
         */
        public Builder skillName(String skillName) {
            this.putBodyParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency comparison.</p>
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
        public CreateEvaluatorSkillRequest build() {
            return new CreateEvaluatorSkillRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEvaluatorSkillRequest} extends {@link TeaModel}
     *
     * <p>CreateEvaluatorSkillRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        private Files(Builder builder) {
            this.content = builder.content;
            this.name = builder.name;
            this.remark = builder.remark;
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

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String content; 
            private String name; 
            private String remark; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.content = model.content;
                this.name = model.name;
                this.remark = model.remark;
            } 

            /**
             * <p>The content of the skill file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <h1>Trace Context Loader</h1>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the skill file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SKILL.md</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The remark for the file.</p>
             * 
             * <strong>example:</strong>
             * <p>Main skill description</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
