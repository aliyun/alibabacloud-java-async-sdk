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

    @com.aliyun.core.annotation.NameInMap("BundleHash")
    private String bundleHash;

    @com.aliyun.core.annotation.NameInMap("BundleSizeBytes")
    private Long bundleSizeBytes;

    @com.aliyun.core.annotation.NameInMap("Capabilities")
    private Capabilities capabilities;

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

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("File")
    private java.util.Map<String, ?> file;

    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<java.util.Map<String, ?>> files;

    @com.aliyun.core.annotation.NameInMap("Frontmatter")
    private java.util.Map<String, ?> frontmatter;

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

    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    @com.aliyun.core.annotation.NameInMap("SkillMarkdown")
    private String skillMarkdown;

    @com.aliyun.core.annotation.NameInMap("SkillType")
    private String skillType;

    @com.aliyun.core.annotation.NameInMap("Slug")
    private String slug;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List<Versions> versions;

    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private GetSkillResponseBody(Builder builder) {
        this.activeVersionId = builder.activeVersionId;
        this.bundleHash = builder.bundleHash;
        this.bundleSizeBytes = builder.bundleSizeBytes;
        this.capabilities = builder.capabilities;
        this.category = builder.category;
        this.content = builder.content;
        this.createdAt = builder.createdAt;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.downloadUrl = builder.downloadUrl;
        this.expiresAt = builder.expiresAt;
        this.file = builder.file;
        this.files = builder.files;
        this.frontmatter = builder.frontmatter;
        this.icon = builder.icon;
        this.id = builder.id;
        this.isDeleted = builder.isDeleted;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
        this.skillId = builder.skillId;
        this.skillMarkdown = builder.skillMarkdown;
        this.skillType = builder.skillType;
        this.slug = builder.slug;
        this.updatedAt = builder.updatedAt;
        this.version = builder.version;
        this.versionId = builder.versionId;
        this.versions = builder.versions;
        this.visibility = builder.visibility;
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
     * @return bundleHash
     */
    public String getBundleHash() {
        return this.bundleHash;
    }

    /**
     * @return bundleSizeBytes
     */
    public Long getBundleSizeBytes() {
        return this.bundleSizeBytes;
    }

    /**
     * @return capabilities
     */
    public Capabilities getCapabilities() {
        return this.capabilities;
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
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return expiresAt
     */
    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return file
     */
    public java.util.Map<String, ?> getFile() {
        return this.file;
    }

    /**
     * @return files
     */
    public java.util.List<java.util.Map<String, ?>> getFiles() {
        return this.files;
    }

    /**
     * @return frontmatter
     */
    public java.util.Map<String, ?> getFrontmatter() {
        return this.frontmatter;
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versions
     */
    public java.util.List<Versions> getVersions() {
        return this.versions;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String activeVersionId; 
        private String bundleHash; 
        private Long bundleSizeBytes; 
        private Capabilities capabilities; 
        private String category; 
        private java.util.Map<String, ?> content; 
        private String createdAt; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String displayName; 
        private String downloadUrl; 
        private String expiresAt; 
        private java.util.Map<String, ?> file; 
        private java.util.List<java.util.Map<String, ?>> files; 
        private java.util.Map<String, ?> frontmatter; 
        private String icon; 
        private String id; 
        private Boolean isDeleted; 
        private String name; 
        private String requestId; 
        private String scope; 
        private String skillId; 
        private String skillMarkdown; 
        private String skillType; 
        private String slug; 
        private String updatedAt; 
        private String version; 
        private String versionId; 
        private java.util.List<Versions> versions; 
        private String visibility; 

        private Builder() {
        } 

        private Builder(GetSkillResponseBody model) {
            this.activeVersionId = model.activeVersionId;
            this.bundleHash = model.bundleHash;
            this.bundleSizeBytes = model.bundleSizeBytes;
            this.capabilities = model.capabilities;
            this.category = model.category;
            this.content = model.content;
            this.createdAt = model.createdAt;
            this.dbtypes = model.dbtypes;
            this.description = model.description;
            this.displayName = model.displayName;
            this.downloadUrl = model.downloadUrl;
            this.expiresAt = model.expiresAt;
            this.file = model.file;
            this.files = model.files;
            this.frontmatter = model.frontmatter;
            this.icon = model.icon;
            this.id = model.id;
            this.isDeleted = model.isDeleted;
            this.name = model.name;
            this.requestId = model.requestId;
            this.scope = model.scope;
            this.skillId = model.skillId;
            this.skillMarkdown = model.skillMarkdown;
            this.skillType = model.skillType;
            this.slug = model.slug;
            this.updatedAt = model.updatedAt;
            this.version = model.version;
            this.versionId = model.versionId;
            this.versions = model.versions;
            this.visibility = model.visibility;
        } 

        /**
         * <p>The current active version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>version-example</p>
         */
        public Builder activeVersionId(String activeVersionId) {
            this.activeVersionId = activeVersionId;
            return this;
        }

        /**
         * <p>The content digest of the current skill bundle.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
         */
        public Builder bundleHash(String bundleHash) {
            this.bundleHash = bundleHash;
            return this;
        }

        /**
         * <p>The size of the current skill bundle, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder bundleSizeBytes(Long bundleSizeBytes) {
            this.bundleSizeBytes = bundleSizeBytes;
            return this;
        }

        /**
         * <p>The skill operations that the current user can perform.</p>
         */
        public Builder capabilities(Capabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>The skill category.</p>
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
         * <p>The skill description. The description can be up to 1000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Review Expert: Comprehensively reviews SQL for security, performance, and compliance, identifies risks, and provides optimization suggestions. Activated immediately when a user submits SQL or asks about &quot;SQL review&quot;, &quot;SQL Review&quot;, &quot;any risks&quot;, or &quot;how to optimize&quot;</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Skill</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The temporary download URL of the skill bundle.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/skill-package.zip">https://example.com/skill-package.zip</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The expiration time of the temporary download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-15T11:00:00Z</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The file in the bundle that is read based on the specified path.</p>
         */
        public Builder file(java.util.Map<String, ?> file) {
            this.file = file;
            return this;
        }

        /**
         * <p>The list of files in the current skill bundle.</p>
         */
        public Builder files(java.util.List<java.util.Map<String, ?>> files) {
            this.files = files;
            return this;
        }

        /**
         * <p>The metadata fields of SKILL.md.</p>
         */
        public Builder frontmatter(java.util.Map<String, ?> frontmatter) {
            this.frontmatter = frontmatter;
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
         * <p>The unique identifier of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Indicates whether the skill is deleted.</p>
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * <p>The skill name. The name can contain only lowercase letters, digits, and hyphens.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-optimization</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The unique request identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The visibility scope of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * <p>The current skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        /**
         * <p>The full Markdown content of SKILL.md.</p>
         * 
         * <strong>example:</strong>
         * <h1>Example Skill</h1>
         */
        public Builder skillMarkdown(String skillMarkdown) {
            this.skillMarkdown = skillMarkdown;
            return this;
        }

        /**
         * <p>The skill type.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder skillType(String skillType) {
            this.skillType = skillType;
            return this;
        }

        /**
         * <p>The stable identifier of the private skill.</p>
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
         * <p>The current skill version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The current skill version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>version-example</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The list of versions visible to the current principal.</p>
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        /**
         * <p>The visibility of the skill to the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
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
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delete")
        private Boolean delete;

        @com.aliyun.core.annotation.NameInMap("Download")
        private Boolean download;

        @com.aliyun.core.annotation.NameInMap("Edit")
        private Boolean edit;

        @com.aliyun.core.annotation.NameInMap("Rollback")
        private Boolean rollback;

        @com.aliyun.core.annotation.NameInMap("Share")
        private Boolean share;

        @com.aliyun.core.annotation.NameInMap("Upload")
        private Boolean upload;

        private Capabilities(Builder builder) {
            this.delete = builder.delete;
            this.download = builder.download;
            this.edit = builder.edit;
            this.rollback = builder.rollback;
            this.share = builder.share;
            this.upload = builder.upload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
        }

        /**
         * @return delete
         */
        public Boolean getDelete() {
            return this.delete;
        }

        /**
         * @return download
         */
        public Boolean getDownload() {
            return this.download;
        }

        /**
         * @return edit
         */
        public Boolean getEdit() {
            return this.edit;
        }

        /**
         * @return rollback
         */
        public Boolean getRollback() {
            return this.rollback;
        }

        /**
         * @return share
         */
        public Boolean getShare() {
            return this.share;
        }

        /**
         * @return upload
         */
        public Boolean getUpload() {
            return this.upload;
        }

        public static final class Builder {
            private Boolean delete; 
            private Boolean download; 
            private Boolean edit; 
            private Boolean rollback; 
            private Boolean share; 
            private Boolean upload; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.delete = model.delete;
                this.download = model.download;
                this.edit = model.edit;
                this.rollback = model.rollback;
                this.share = model.share;
                this.upload = model.upload;
            } 

            /**
             * <p>Indicates whether the skill can be deleted.</p>
             */
            public Builder delete(Boolean delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>Indicates whether the skill bundle can be downloaded.</p>
             */
            public Builder download(Boolean download) {
                this.download = download;
                return this;
            }

            /**
             * <p>Indicates whether the skill can be edited.</p>
             */
            public Builder edit(Boolean edit) {
                this.edit = edit;
                return this;
            }

            /**
             * <p>Indicates whether the skill version can be rolled back.</p>
             */
            public Builder rollback(Boolean rollback) {
                this.rollback = rollback;
                return this;
            }

            /**
             * <p>Indicates whether the skill can be shared.</p>
             */
            public Builder share(Boolean share) {
                this.share = share;
                return this;
            }

            /**
             * <p>Indicates whether a new version can be uploaded.</p>
             */
            public Builder upload(Boolean upload) {
                this.upload = upload;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("FileCount")
        private Long fileCount;

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

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateNote")
        private String updateNote;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Versions(Builder builder) {
            this.activatedAt = builder.activatedAt;
            this.createdAt = builder.createdAt;
            this.credentialRequired = builder.credentialRequired;
            this.fileCount = builder.fileCount;
            this.id = builder.id;
            this.packageSize = builder.packageSize;
            this.revokeReason = builder.revokeReason;
            this.revokedAt = builder.revokedAt;
            this.sha256 = builder.sha256;
            this.skillId = builder.skillId;
            this.skillMarkdown = builder.skillMarkdown;
            this.source = builder.source;
            this.status = builder.status;
            this.updateNote = builder.updateNote;
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
         * @return fileCount
         */
        public Long getFileCount() {
            return this.fileCount;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateNote
         */
        public String getUpdateNote() {
            return this.updateNote;
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
            private Long fileCount; 
            private String id; 
            private Long packageSize; 
            private String revokeReason; 
            private String revokedAt; 
            private String sha256; 
            private String skillId; 
            private String skillMarkdown; 
            private String source; 
            private String status; 
            private String updateNote; 
            private String version; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.activatedAt = model.activatedAt;
                this.createdAt = model.createdAt;
                this.credentialRequired = model.credentialRequired;
                this.fileCount = model.fileCount;
                this.id = model.id;
                this.packageSize = model.packageSize;
                this.revokeReason = model.revokeReason;
                this.revokedAt = model.revokedAt;
                this.sha256 = model.sha256;
                this.skillId = model.skillId;
                this.skillMarkdown = model.skillMarkdown;
                this.source = model.source;
                this.status = model.status;
                this.updateNote = model.updateNote;
                this.version = model.version;
            } 

            /**
             * <p>The activation time of the skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-15T10:00:00Z</p>
             */
            public Builder activatedAt(String activatedAt) {
                this.activatedAt = activatedAt;
                return this;
            }

            /**
             * <p>The creation time of the skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-15T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Indicates whether the skill requires a credential.</p>
             */
            public Builder credentialRequired(Boolean credentialRequired) {
                this.credentialRequired = credentialRequired;
                return this;
            }

            /**
             * <p>The number of files in the skill bundle.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The skill version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>version-example</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The size of the skill bundle, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder packageSize(Long packageSize) {
                this.packageSize = packageSize;
                return this;
            }

            /**
             * <p>The reason for revoking the skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>Replaced by a newer version</p>
             */
            public Builder revokeReason(String revokeReason) {
                this.revokeReason = revokeReason;
                return this;
            }

            /**
             * <p>The revocation time of the skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-15T11:00:00Z</p>
             */
            public Builder revokedAt(String revokedAt) {
                this.revokedAt = revokedAt;
                return this;
            }

            /**
             * <p>The SHA-256 digest of the skill package.</p>
             * 
             * <strong>example:</strong>
             * <p>0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            /**
             * <p>The ID of the skill to which the version belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-example</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>The Markdown content of the skill.</p>
             * 
             * <strong>example:</strong>
             * <h1>Example Skill</h1>
             */
            public Builder skillMarkdown(String skillMarkdown) {
                this.skillMarkdown = skillMarkdown;
                return this;
            }

            /**
             * <p>The creation source of the skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>UPLOAD</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the skill version.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update note for the version.</p>
             * 
             * <strong>example:</strong>
             * <p>Update Skill documentation</p>
             */
            public Builder updateNote(String updateNote) {
                this.updateNote = updateNote;
                return this;
            }

            /**
             * <p>The version number of the skill.</p>
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
