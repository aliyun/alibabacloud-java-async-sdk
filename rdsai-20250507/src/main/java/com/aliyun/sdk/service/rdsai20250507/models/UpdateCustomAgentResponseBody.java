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
 * {@link UpdateCustomAgentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomAgentResponseBody</p>
 */
public class UpdateCustomAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableTools")
    private String enableTools;

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

    private UpdateCustomAgentResponseBody(Builder builder) {
        this.enableTools = builder.enableTools;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.systemPrompt = builder.systemPrompt;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableTools
     */
    public String getEnableTools() {
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

    public static final class Builder {
        private String enableTools; 
        private String id; 
        private String name; 
        private String requestId; 
        private java.util.List<Skills> skills; 
        private String systemPrompt; 
        private java.util.List<String> tools; 

        private Builder() {
        } 

        private Builder(UpdateCustomAgentResponseBody model) {
            this.enableTools = model.enableTools;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.systemPrompt = model.systemPrompt;
            this.tools = model.tools;
        } 

        /**
         * <p>Indicates whether tools are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTools(String enableTools) {
            this.enableTools = enableTools;
            return this;
        }

        /**
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>82cf3d62-0add-47bd-869f-877131f7****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the agent.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
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
         * <p>The information about the tool.</p>
         */
        public Builder tools(java.util.List<String> tools) {
            this.tools = tools;
            return this;
        }

        public UpdateCustomAgentResponseBody build() {
            return new UpdateCustomAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCustomAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateCustomAgentResponseBody</p>
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
             * <p>The ID of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>82cf3d62-0add-47bd-869f-877131f7****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the agent.</p>
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
