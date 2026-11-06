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
 * {@link CreateAgentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgentResponseBody</p>
 */
public class CreateAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Agent")
    private Agent agent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAgentResponseBody(Builder builder) {
        this.agent = builder.agent;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentResponseBody create() {
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

        private Builder(CreateAgentResponseBody model) {
            this.agent = model.agent;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the created agent.</p>
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

        public CreateAgentResponseBody build() {
            return new CreateAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentResponseBody</p>
     */
    public static class ExpertSuites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SuiteId")
        private String suiteId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VersionSelector")
        private String versionSelector;

        private ExpertSuites(Builder builder) {
            this.packageVersion = builder.packageVersion;
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
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
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
            private String packageVersion; 
            private String source; 
            private String suiteId; 
            private Integer version; 
            private String versionSelector; 

            private Builder() {
            } 

            private Builder(ExpertSuites model) {
                this.packageVersion = model.packageVersion;
                this.source = model.source;
                this.suiteId = model.suiteId;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>This field is not returned during creation. Use GetAgent to explicitly query the published version to obtain the fixed official suite artifact version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0.202610211408</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
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
             * <p>dataworks-data-analysis-extension</p>
             */
            public Builder suiteId(String suiteId) {
                this.suiteId = suiteId;
                return this;
            }

            /**
             * <p>The release version number of the custom suite.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The saved version selection strategy is returned only for personal or enterprise resources and is mutually exclusive with the fixed integer Version. It does not represent the specific revision actually loaded in the session. This field is not returned for official resources.</p>
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
     * {@link CreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

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
            this.packageVersion = builder.packageVersion;
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
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
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
            private String packageVersion; 
            private String skillId; 
            private String source; 
            private Integer version; 
            private String versionSelector; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.name = model.name;
                this.packageVersion = model.packageVersion;
                this.skillId = model.skillId;
                this.source = model.source;
                this.version = model.version;
                this.versionSelector = model.versionSelector;
            } 

            /**
             * <p>The name of the custom skill.</p>
             * 
             * <strong>example:</strong>
             * <p>my-business-skill</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This field is not returned during creation. Use GetAgent to explicitly query the published version to obtain the fixed official artifact version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6.0.202608201110</p>
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
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
             * <p>The release version number of the custom skill.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The saved version selection strategy is returned only for personal or enterprise resources and is mutually exclusive with the fixed integer Version. It does not represent the specific revision actually loaded in the session. This field is not returned for official resources.</p>
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
     * {@link CreateAgentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentResponseBody</p>
     */
    public static class Agent extends TeaModel {
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
            private java.util.List<ExpertSuites> expertSuites; 
            private Long gmtCreateTime; 
            private Long gmtModifiedTime; 
            private String name; 
            private java.util.List<Skills> skills; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.expertSuites = model.expertSuites;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.name = model.name;
                this.skills = model.skills;
            } 

            /**
             * <p>The saved suite references. Official resources return the source and directory ID. The published artifact version is represented by PackageVersion.</p>
             */
            public Builder expertSuites(java.util.List<ExpertSuites> expertSuites) {
                this.expertSuites = expertSuites;
                return this;
            }

            /**
             * <p>The creation time, expressed as a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1780555634000</p>
             */
            public Builder gmtCreateTime(Long gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The last modification time, expressed as a timestamp in milliseconds.</p>
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
             * <p>The saved skill references. Official skills return a fixed PackageVersion after the agent is published.</p>
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
