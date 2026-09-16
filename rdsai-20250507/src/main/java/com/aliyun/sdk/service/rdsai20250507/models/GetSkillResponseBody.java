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
 * {@link GetSkillResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillResponseBody</p>
 */
public class GetSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActiveVersionId")
    private String activeVersionId;

    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Dbtypes")
    private java.util.List<String> dbtypes;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("Icon")
    private String icon;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("IsDeleted")
    private Boolean isDeleted;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("SkillType")
    private String skillType;

    @com.aliyun.core.annotation.NameInMap("Slug")
    private String slug;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List<Versions> versions;

    private GetSkillResponseBody(Builder builder) {
        this.activeVersionId = builder.activeVersionId;
        this.category = builder.category;
        this.content = builder.content;
        this.createdAt = builder.createdAt;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.icon = builder.icon;
        this.id = builder.id;
        this.isDeleted = builder.isDeleted;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.skillType = builder.skillType;
        this.slug = builder.slug;
        this.updatedAt = builder.updatedAt;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeVersionId
     */
    public String getActiveVersionId() {
        return this.activeVersionId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return content
     */
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return dbtypes
     */
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
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
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return skillType
     */
    public String getSkillType() {
        return this.skillType;
    }

    /**
     * @return slug
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return versions
     */
    public java.util.List<Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String activeVersionId; 
        private String category; 
        private java.util.Map<String, ?> content; 
        private String createdAt; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String displayName; 
        private String icon; 
        private String id; 
        private Boolean isDeleted; 
        private String name; 
        private String requestId; 
        private String scope; 
        private String skillType; 
        private String slug; 
        private String updatedAt; 
        private java.util.List<Versions> versions; 

        private Builder() {
        } 

        private Builder(GetSkillResponseBody model) {
            this.activeVersionId = model.activeVersionId;
            this.category = model.category;
            this.content = model.content;
            this.createdAt = model.createdAt;
            this.dbtypes = model.dbtypes;
            this.description = model.description;
            this.displayName = model.displayName;
            this.icon = model.icon;
            this.id = model.id;
            this.isDeleted = model.isDeleted;
            this.name = model.name;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.skillType = model.skillType;
            this.slug = model.slug;
            this.updatedAt = model.updatedAt;
            this.versions = model.versions;
        } 

        /**
         * <p>The currently active version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>version-example</p>
         */
        public Builder activeVersionId(String activeVersionId) {
            this.activeVersionId = activeVersionId;
            return this;
        }

        /**
         * <p>The Skill category.</p>
         * 
         * <strong>example:</strong>
         * <p>productivity</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MySQL&quot;: &quot;MySQL optimization guide...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL optimization guide...&quot;}</p>
         */
        public Builder content(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-04T02:25:43Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The list of database types.</p>
         */
        public Builder dbtypes(java.util.List<String> dbtypes) {
            this.dbtypes = dbtypes;
            return this;
        }

        /**
         * <p>The Skill description, up to 1000 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Review Expert: Comprehensively reviews SQL for security, performance, and compliance, identifies risks, and provides optimization suggestions. Activated immediately when a user submits SQL or asks about &quot;SQL review&quot;, &quot;SQL Review&quot;, &quot;any risks&quot;, or &quot;how to optimize&quot;</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The Skill display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Skill</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The public HTTPS URL of the current icon. This value is empty if no icon is configured.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/skill-icon.png">https://example.com/skill-icon.png</a></p>
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * <p>The unique identifier of the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Indicates whether the Skill is deleted.</p>
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * <p>The Skill name. The name can contain only lowercase letters, digits, and hyphens.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-optimization</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The visibility scope of the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>The Skill type.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder skillType(String skillType) {
            this.skillType = skillType;
            return this;
        }

        /**
         * <p>The stable identifier of a private Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>example-skill</p>
         */
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T21:14:45Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The list of versions visible to the current principal.</p>
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        public GetSkillResponseBody build() {
            return new GetSkillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivatedAt")
        private String activatedAt;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("CredentialRequired")
        private Boolean credentialRequired;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PackageSize")
        private Long packageSize;

        @com.aliyun.core.annotation.NameInMap("RevokeReason")
        private String revokeReason;

        @com.aliyun.core.annotation.NameInMap("RevokedAt")
        private String revokedAt;

        @com.aliyun.core.annotation.NameInMap("Sha256")
        private String sha256;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillMarkdown")
        private String skillMarkdown;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Versions(Builder builder) {
            this.activatedAt = builder.activatedAt;
            this.createdAt = builder.createdAt;
            this.credentialRequired = builder.credentialRequired;
            this.id = builder.id;
            this.packageSize = builder.packageSize;
            this.revokeReason = builder.revokeReason;
            this.revokedAt = builder.revokedAt;
            this.sha256 = builder.sha256;
            this.skillId = builder.skillId;
            this.skillMarkdown = builder.skillMarkdown;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return activatedAt
         */
        public String getActivatedAt() {
            return this.activatedAt;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return credentialRequired
         */
        public Boolean getCredentialRequired() {
            return this.credentialRequired;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return packageSize
         */
        public Long getPackageSize() {
            return this.packageSize;
        }

        /**
         * @return revokeReason
         */
        public String getRevokeReason() {
            return this.revokeReason;
        }

        /**
         * @return revokedAt
         */
        public String getRevokedAt() {
            return this.revokedAt;
        }

        /**
         * @return sha256
         */
        public String getSha256() {
            return this.sha256;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillMarkdown
         */
        public String getSkillMarkdown() {
            return this.skillMarkdown;
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

        public static final class Builder {
            private String activatedAt; 
            private String createdAt; 
            private Boolean credentialRequired; 
            private String id; 
            private Long packageSize; 
            private String revokeReason; 
            private String revokedAt; 
            private String sha256; 
            private String skillId; 
            private String skillMarkdown; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.activatedAt = model.activatedAt;
                this.createdAt = model.createdAt;
                this.credentialRequired = model.credentialRequired;
                this.id = model.id;
                this.packageSize = model.packageSize;
                this.revokeReason = model.revokeReason;
                this.revokedAt = model.revokedAt;
                this.sha256 = model.sha256;
                this.skillId = model.skillId;
                this.skillMarkdown = model.skillMarkdown;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The activation time of the Skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-15T10:00:00Z</p>
             */
            public Builder activatedAt(String activatedAt) {
                this.activatedAt = activatedAt;
                return this;
            }

            /**
             * <p>The creation time of the Skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-15T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Indicates whether the Skill requires a credential.</p>
             */
            public Builder credentialRequired(Boolean credentialRequired) {
                this.credentialRequired = credentialRequired;
                return this;
            }

            /**
             * <p>The Skill version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>version-example</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The Skill package size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder packageSize(Long packageSize) {
                this.packageSize = packageSize;
                return this;
            }

            /**
             * <p>The reason for revoking the Skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>Replaced by a newer version</p>
             */
            public Builder revokeReason(String revokeReason) {
                this.revokeReason = revokeReason;
                return this;
            }

            /**
             * <p>The revocation time of the Skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-15T11:00:00Z</p>
             */
            public Builder revokedAt(String revokedAt) {
                this.revokedAt = revokedAt;
                return this;
            }

            /**
             * <p>The SHA-256 digest of the Skill package.</p>
             * 
             * <strong>example:</strong>
             * <p>0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            /**
             * <p>The ID of the Skill to which this version belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-example</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>The Markdown content of the Skill.</p>
             * 
             * <strong>example:</strong>
             * <h1>Example Skill</h1>
             */
            public Builder skillMarkdown(String skillMarkdown) {
                this.skillMarkdown = skillMarkdown;
                return this;
            }

            /**
             * <p>The status of the Skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version number of the Skill.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
