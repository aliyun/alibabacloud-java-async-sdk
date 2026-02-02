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
 * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomAgentResponseBody</p>
 */
public class GetCustomAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("EnableTools")
    private Boolean enableTools;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<Skills> skills;

    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.NameInMap("Tools")
    private java.util.List<String> tools;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private GetCustomAgentResponseBody(Builder builder) {
        this.createdAt = builder.createdAt;
        this.enableTools = builder.enableTools;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.systemPrompt = builder.systemPrompt;
        this.tools = builder.tools;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return enableTools
     */
    public Boolean getEnableTools() {
        return this.enableTools;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
    public java.util.List<String> getTools() {
        return this.tools;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String createdAt; 
        private Boolean enableTools; 
        private String id; 
        private String name; 
        private String requestId; 
        private java.util.List<Skills> skills; 
        private String systemPrompt; 
        private java.util.List<String> tools; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(GetCustomAgentResponseBody model) {
            this.createdAt = model.createdAt;
            this.enableTools = model.enableTools;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.systemPrompt = model.systemPrompt;
            this.tools = model.tools;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The creation time of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-04T02:25:43Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Indicates whether tools are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTools(Boolean enableTools) {
            this.enableTools = enableTools;
            return this;
        }

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>17053</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the dedicated agent.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Skills.
         */
        public Builder skills(java.util.List<Skills> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * <p>The system prompts.</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The details of the tools.</p>
         */
        public Builder tools(java.util.List<String> tools) {
            this.tools = tools;
            return this;
        }

        /**
         * <p>The modification time of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-27 16:02:28</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetCustomAgentResponseBody build() {
            return new GetCustomAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomAgentResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillType")
        private String skillType;

        private Skills(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.skillType = builder.skillType;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillType
         */
        public String getSkillType() {
            return this.skillType;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private String name; 
            private String skillType; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.skillType = model.skillType;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>17053</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the dedicated agent.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SkillType.
             */
            public Builder skillType(String skillType) {
                this.skillType = skillType;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
}
