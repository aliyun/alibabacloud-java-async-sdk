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
 * {@link GetEvaluatorSkillResponseBody} extends {@link TeaModel}
 *
 * <p>GetEvaluatorSkillResponseBody</p>
 */
public class GetEvaluatorSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skill")
    private Skill skill;

    private GetEvaluatorSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skill = builder.skill;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEvaluatorSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skill
     */
    public Skill getSkill() {
        return this.skill;
    }

    public static final class Builder {
        private String requestId; 
        private Skill skill; 

        private Builder() {
        } 

        private Builder(GetEvaluatorSkillResponseBody model) {
            this.requestId = model.requestId;
            this.skill = model.skill;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The skill details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;skillName&quot;:&quot;trace_context_loader&quot;,&quot;enable&quot;:true,&quot;currentVersion&quot;:&quot;1782816000000&quot;}</p>
         */
        public Builder skill(Skill skill) {
            this.skill = skill;
            return this;
        }

        public GetEvaluatorSkillResponseBody build() {
            return new GetEvaluatorSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEvaluatorSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetEvaluatorSkillResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("name")
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
             * <p>The file content.</p>
             * 
             * <strong>example:</strong>
             * <h1>Trace Context Loader</h1>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>SKILL.md</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The file remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>主技能说明</p>
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
    /**
     * 
     * {@link GetEvaluatorSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetEvaluatorSkillResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionDescription")
        private String versionDescription;

        private Versions(Builder builder) {
            this.createdAt = builder.createdAt;
            this.version = builder.version;
            this.versionDescription = builder.versionDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
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

        public static final class Builder {
            private Long createdAt; 
            private String version; 
            private String versionDescription; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.createdAt = model.createdAt;
                this.version = model.version;
                this.versionDescription = model.versionDescription;
            } 

            /**
             * <p>The time when the version was created. This value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000000</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version description.</p>
             * 
             * <strong>example:</strong>
             * <p>首次发布版本</p>
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEvaluatorSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetEvaluatorSkillResponseBody</p>
     */
    public static class Skill extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("currentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("latestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private Long updatedAt;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<Versions> versions;

        private Skill(Builder builder) {
            this.createdAt = builder.createdAt;
            this.currentVersion = builder.currentVersion;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.files = builder.files;
            this.latestVersion = builder.latestVersion;
            this.skillName = builder.skillName;
            this.updatedAt = builder.updatedAt;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skill create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
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
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private Long createdAt; 
            private String currentVersion; 
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private java.util.List<Files> files; 
            private String latestVersion; 
            private String skillName; 
            private Long updatedAt; 
            private java.util.List<Versions> versions; 

            private Builder() {
            } 

            private Builder(Skill model) {
                this.createdAt = model.createdAt;
                this.currentVersion = model.currentVersion;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.files = model.files;
                this.latestVersion = model.latestVersion;
                this.skillName = model.skillName;
                this.updatedAt = model.updatedAt;
                this.versions = model.versions;
            } 

            /**
             * <p>The time when the skill was created. This value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The current version.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000000</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The skill description.</p>
             * 
             * <strong>example:</strong>
             * <p>读取链路上下文辅助评估</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Trace 上下文读取</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether the skill is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The list of skill files.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;# Trace Context Loader&quot;,&quot;remark&quot;:&quot;主技能说明&quot;}]</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000000</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>The skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>trace_context_loader</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The time when the skill was last updated. This value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816600</p>
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The list of skill versions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;version&quot;:&quot;1782816000000&quot;,&quot;versionDescription&quot;:&quot;首次发布版本&quot;}]</p>
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Skill build() {
                return new Skill(this);
            } 

        } 

    }
}
