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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The latest version information.</p>
         */
        public Builder latestVersion(LatestVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The Skill author information.</p>
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
         * <p>The core information of the Skill.</p>
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
             * <p>The version changelog.</p>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
             */
            public Builder changelog(String changelog) {
                this.changelog = changelog;
                return this;
            }

            /**
             * <p>The version publish timestamp in Unix milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1767545394459</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
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
             * <p>The display name of the author.</p>
             * 
             * <strong>example:</strong>
             * <p>Peter Steinberger</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The account identifier of the author.</p>
             * 
             * <strong>example:</strong>
             * <p>steipete</p>
             */
            public Builder handle(String handle) {
                this.handle = handle;
                return this;
            }

            /**
             * <p>The profile picture URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://avatars.githubusercontent.com/u/58493?v=4">https://avatars.githubusercontent.com/u/58493?v=4</a></p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The user ID of the author.</p>
             * 
             * <strong>example:</strong>
             * <p>s179zksw999xz8ms4cy7pb2fr183m5jq</p>
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
             * <p>The number of comments.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder comments(Long comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The number of downloads.</p>
             * 
             * <strong>example:</strong>
             * <p>155765</p>
             */
            public Builder downloads(Long downloads) {
                this.downloads = downloads;
                return this;
            }

            /**
             * <p>The total number of installations of all time.</p>
             * 
             * <strong>example:</strong>
             * <p>3787</p>
             */
            public Builder installsAllTime(Long installsAllTime) {
                this.installsAllTime = installsAllTime;
                return this;
            }

            /**
             * <p>The current number of installations.</p>
             * 
             * <strong>example:</strong>
             * <p>3664</p>
             */
            public Builder installsCurrent(Long installsCurrent) {
                this.installsCurrent = installsCurrent;
                return this;
            }

            /**
             * <p>The number of stars.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder stars(Long stars) {
                this.stars = stars;
                return this;
            }

            /**
             * <p>The number of versions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The first publish timestamp in Unix milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1767545394459</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Weather</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The Skill identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>weather</p>
             */
            public Builder slug(String slug) {
                this.slug = slug;
                return this;
            }

            /**
             * <p>The statistics information.</p>
             */
            public Builder stats(Stats stats) {
                this.stats = stats;
                return this;
            }

            /**
             * <p>The brief description.</p>
             * 
             * <strong>example:</strong>
             * <p>Get current weather and forecasts (no API key required).</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The tag key-value pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;latest&quot;: &quot;1.0.0&quot;
             * }</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The last update timestamp in Unix milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1778485729679</p>
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
