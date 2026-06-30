// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawSkillDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawSkillDetailResponseBody</p>
 */
public class DescribePolarClawSkillDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private LatestVersion latestVersion;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private Owner owner;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Skill")
    private Skill skill;

    private DescribePolarClawSkillDetailResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.latestVersion = builder.latestVersion;
        this.message = builder.message;
        this.owner = builder.owner;
        this.requestId = builder.requestId;
        this.skill = builder.skill;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return latestVersion
     */
    public LatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
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
        private String applicationId; 
        private Integer code; 
        private LatestVersion latestVersion; 
        private String message; 
        private Owner owner; 
        private String requestId; 
        private Skill skill; 

        private Builder() {
        } 

        private Builder(DescribePolarClawSkillDetailResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.latestVersion = model.latestVersion;
            this.message = model.message;
            this.owner = model.owner;
            this.requestId = model.requestId;
            this.skill = model.skill;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * LatestVersion.
         */
        public Builder latestVersion(LatestVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Skill.
         */
        public Builder skill(Skill skill) {
            this.skill = skill;
            return this;
        }

        public DescribePolarClawSkillDetailResponseBody build() {
            return new DescribePolarClawSkillDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawSkillDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillDetailResponseBody</p>
     */
    public static class LatestVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Changelog")
        private String changelog;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private LatestVersion(Builder builder) {
            this.changelog = builder.changelog;
            this.createdAt = builder.createdAt;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestVersion create() {
            return builder().build();
        }

        /**
         * @return changelog
         */
        public String getChangelog() {
            return this.changelog;
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

        public static final class Builder {
            private String changelog; 
            private Long createdAt; 
            private String version; 

            private Builder() {
            } 

            private Builder(LatestVersion model) {
                this.changelog = model.changelog;
                this.createdAt = model.createdAt;
                this.version = model.version;
            } 

            /**
             * Changelog.
             */
            public Builder changelog(String changelog) {
                this.changelog = changelog;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public LatestVersion build() {
                return new LatestVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawSkillDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillDetailResponseBody</p>
     */
    public static class Owner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Handle")
        private String handle;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Owner(Builder builder) {
            this.displayName = builder.displayName;
            this.handle = builder.handle;
            this.image = builder.image;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owner create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return handle
         */
        public String getHandle() {
            return this.handle;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String handle; 
            private String image; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Owner model) {
                this.displayName = model.displayName;
                this.handle = model.handle;
                this.image = model.image;
                this.userId = model.userId;
            } 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Handle.
             */
            public Builder handle(String handle) {
                this.handle = handle;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Owner build() {
                return new Owner(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawSkillDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillDetailResponseBody</p>
     */
    public static class Stats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private Long comments;

        @com.aliyun.core.annotation.NameInMap("Downloads")
        private Long downloads;

        @com.aliyun.core.annotation.NameInMap("InstallsAllTime")
        private Long installsAllTime;

        @com.aliyun.core.annotation.NameInMap("InstallsCurrent")
        private Long installsCurrent;

        @com.aliyun.core.annotation.NameInMap("Stars")
        private Long stars;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private Long versions;

        private Stats(Builder builder) {
            this.comments = builder.comments;
            this.downloads = builder.downloads;
            this.installsAllTime = builder.installsAllTime;
            this.installsCurrent = builder.installsCurrent;
            this.stars = builder.stars;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stats create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public Long getComments() {
            return this.comments;
        }

        /**
         * @return downloads
         */
        public Long getDownloads() {
            return this.downloads;
        }

        /**
         * @return installsAllTime
         */
        public Long getInstallsAllTime() {
            return this.installsAllTime;
        }

        /**
         * @return installsCurrent
         */
        public Long getInstallsCurrent() {
            return this.installsCurrent;
        }

        /**
         * @return stars
         */
        public Long getStars() {
            return this.stars;
        }

        /**
         * @return versions
         */
        public Long getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private Long comments; 
            private Long downloads; 
            private Long installsAllTime; 
            private Long installsCurrent; 
            private Long stars; 
            private Long versions; 

            private Builder() {
            } 

            private Builder(Stats model) {
                this.comments = model.comments;
                this.downloads = model.downloads;
                this.installsAllTime = model.installsAllTime;
                this.installsCurrent = model.installsCurrent;
                this.stars = model.stars;
                this.versions = model.versions;
            } 

            /**
             * Comments.
             */
            public Builder comments(Long comments) {
                this.comments = comments;
                return this;
            }

            /**
             * Downloads.
             */
            public Builder downloads(Long downloads) {
                this.downloads = downloads;
                return this;
            }

            /**
             * InstallsAllTime.
             */
            public Builder installsAllTime(Long installsAllTime) {
                this.installsAllTime = installsAllTime;
                return this;
            }

            /**
             * InstallsCurrent.
             */
            public Builder installsCurrent(Long installsCurrent) {
                this.installsCurrent = installsCurrent;
                return this;
            }

            /**
             * Stars.
             */
            public Builder stars(Long stars) {
                this.stars = stars;
                return this;
            }

            /**
             * Versions.
             */
            public Builder versions(Long versions) {
                this.versions = versions;
                return this;
            }

            public Stats build() {
                return new Stats(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawSkillDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawSkillDetailResponseBody</p>
     */
    public static class Skill extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("Stats")
        private Stats stats;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private Long updatedAt;

        private Skill(Builder builder) {
            this.createdAt = builder.createdAt;
            this.displayName = builder.displayName;
            this.slug = builder.slug;
            this.stats = builder.stats;
            this.summary = builder.summary;
            this.tags = builder.tags;
            this.updatedAt = builder.updatedAt;
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
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return stats
         */
        public Stats getStats() {
            return this.stats;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Long createdAt; 
            private String displayName; 
            private String slug; 
            private Stats stats; 
            private String summary; 
            private java.util.Map<String, ?> tags; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(Skill model) {
                this.createdAt = model.createdAt;
                this.displayName = model.displayName;
                this.slug = model.slug;
                this.stats = model.stats;
                this.summary = model.summary;
                this.tags = model.tags;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Slug.
             */
            public Builder slug(String slug) {
                this.slug = slug;
                return this;
            }

            /**
             * Stats.
             */
            public Builder stats(Stats stats) {
                this.stats = stats;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Skill build() {
                return new Skill(this);
            } 

        } 

    }
}
