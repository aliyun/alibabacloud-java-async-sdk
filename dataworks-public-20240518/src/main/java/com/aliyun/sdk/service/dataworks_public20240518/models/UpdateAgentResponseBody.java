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
 * {@link UpdateAgentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAgentResponseBody</p>
 */
public class UpdateAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Agent")
    private Agent agent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAgentResponseBody(Builder builder) {
        this.agent = builder.agent;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agent
     */
    public Agent getAgent() {
        return this.agent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Agent agent; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateAgentResponseBody model) {
            this.agent = model.agent;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the updated agent.</p>
         */
        public Builder agent(Agent agent) {
            this.agent = agent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAgentResponseBody build() {
            return new UpdateAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAgentResponseBody</p>
     */
    public static class ExpertSuites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SemanticVersion")
        private String semanticVersion;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SuiteId")
        private String suiteId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSelector")
        private String versionSelector;

        private ExpertSuites(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.semanticVersion = builder.semanticVersion;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return semanticVersion
         */
        public String getSemanticVersion() {
            return this.semanticVersion;
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
            private String description; 
            private String displayName; 
            private String name; 
            private String semanticVersion; 
            private String source; 
            private String suiteId; 
            private Integer version; 
            private String versionSelector; 

            private Builder() {
            } 

            private Builder(ExpertSuites model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.semanticVersion = model.semanticVersion;
                this.source = model.source;
                this.suiteId = model.suiteId;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The suite description of the bound version.</p>
             * 
             * <strong>example:</strong>
             * <p>Collection of data analytics expert capabilities</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the bound version.</p>
             * 
             * <strong>example:</strong>
             * <p>Data analytics expert suite</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The suite name of the bound version.</p>
             * 
             * <strong>example:</strong>
             * <p>analysis-suite</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The semantic version of the bound version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.0</p>
             */
            public Builder semanticVersion(String semanticVersion) {
                this.semanticVersion = semanticVersion;
                return this;
            }

            /**
             * <p>The source of the expert suite.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the expert suite.</p>
             * 
             * <strong>example:</strong>
             * <p>suite_example</p>
             */
            public Builder suiteId(String suiteId) {
                this.suiteId = suiteId;
                return this;
            }

            /**
             * <p>The bound published version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version selection expression.</p>
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
     * {@link UpdateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAgentResponseBody</p>
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
             * <p>The name of the bound custom skill.</p>
             * 
             * <strong>example:</strong>
             * <p>my-business-skill</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the official skill.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks-semantic</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>The source of the skill.</p>
             * 
             * <strong>example:</strong>
             * <p>OFFICIAL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The published version number of the bound custom skill.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version selection expression.</p>
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
     * {@link UpdateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAgentResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private Integer agentVersion;

        @com.aliyun.core.annotation.NameInMap("ExpertSuites")
        private java.util.List<ExpertSuites> expertSuites;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private Long gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private Long gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<Skills> skills;

        private Agent(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.expertSuites = builder.expertSuites;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.skills = builder.skills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public Integer getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return expertSuites
         */
        public java.util.List<ExpertSuites> getExpertSuites() {
            return this.expertSuites;
        }

        /**
         * @return gmtCreateTime
         */
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
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
        public java.util.List<Skills> getSkills() {
            return this.skills;
        }

        public static final class Builder {
            private Integer agentVersion; 
            private java.util.List<ExpertSuites> expertSuites; 
            private Long gmtCreateTime; 
            private Long gmtModifiedTime; 
            private String name; 
            private java.util.List<Skills> skills; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.agentVersion = model.agentVersion;
                this.expertSuites = model.expertSuites;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.name = model.name;
                this.skills = model.skills;
            } 

            /**
             * <p>The version of the updated agent definition.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder agentVersion(Integer agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The bound expert suites.</p>
             */
            public Builder expertSuites(java.util.List<ExpertSuites> expertSuites) {
                this.expertSuites = expertSuites;
                return this;
            }

            /**
             * <p>The creation time of the agent. It is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(Long gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The last modified time of the agent. It is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtModifiedTime(Long gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The name of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of bound skill references after the update.</p>
             */
            public Builder skills(java.util.List<Skills> skills) {
                this.skills = skills;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
}
