// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link ListSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillsResponseBody</p>
 */
public class ListSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<Skills> skills;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSkillsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsResponseBody create() {
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
     * @return skills
     */
    public java.util.List<Skills> getSkills() {
        return this.skills;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Skills> skills; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSkillsResponseBody model) {
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSkillsResponseBody build() {
            return new ListSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillsResponseBody</p>
     */
    public static class SkillVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeLog")
        private String changeLog;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("SecurityScanFailReason")
        private String securityScanFailReason;

        @com.aliyun.core.annotation.NameInMap("SecurityScanScore")
        private Integer securityScanScore;

        @com.aliyun.core.annotation.NameInMap("SecurityScanStatus")
        private String securityScanStatus;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SkillVersions(Builder builder) {
            this.changeLog = builder.changeLog;
            this.createdAt = builder.createdAt;
            this.publishStatus = builder.publishStatus;
            this.securityScanFailReason = builder.securityScanFailReason;
            this.securityScanScore = builder.securityScanScore;
            this.securityScanStatus = builder.securityScanStatus;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillVersions create() {
            return builder().build();
        }

        /**
         * @return changeLog
         */
        public String getChangeLog() {
            return this.changeLog;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return securityScanFailReason
         */
        public String getSecurityScanFailReason() {
            return this.securityScanFailReason;
        }

        /**
         * @return securityScanScore
         */
        public Integer getSecurityScanScore() {
            return this.securityScanScore;
        }

        /**
         * @return securityScanStatus
         */
        public String getSecurityScanStatus() {
            return this.securityScanStatus;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String changeLog; 
            private Long createdAt; 
            private String publishStatus; 
            private String securityScanFailReason; 
            private Integer securityScanScore; 
            private String securityScanStatus; 
            private String version; 

            private Builder() {
            } 

            private Builder(SkillVersions model) {
                this.changeLog = model.changeLog;
                this.createdAt = model.createdAt;
                this.publishStatus = model.publishStatus;
                this.securityScanFailReason = model.securityScanFailReason;
                this.securityScanScore = model.securityScanScore;
                this.securityScanStatus = model.securityScanStatus;
                this.version = model.version;
            } 

            /**
             * ChangeLog.
             */
            public Builder changeLog(String changeLog) {
                this.changeLog = changeLog;
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
             * PublishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * SecurityScanFailReason.
             */
            public Builder securityScanFailReason(String securityScanFailReason) {
                this.securityScanFailReason = securityScanFailReason;
                return this;
            }

            /**
             * SecurityScanScore.
             */
            public Builder securityScanScore(Integer securityScanScore) {
                this.securityScanScore = securityScanScore;
                return this;
            }

            /**
             * SecurityScanStatus.
             */
            public Builder securityScanStatus(String securityScanStatus) {
                this.securityScanStatus = securityScanStatus;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SkillVersions build() {
                return new SkillVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillsResponseBody</p>
     */
    public static class SupportAgentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private SupportAgentList(Builder builder) {
            this.tagId = builder.tagId;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportAgentList create() {
            return builder().build();
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagId; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(SupportAgentList model) {
                this.tagId = model.tagId;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public SupportAgentList build() {
                return new SupportAgentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillsResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EnvVars")
        private java.util.Map<String, String> envVars;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("SkillIconUrl")
        private String skillIconUrl;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("SkillVersions")
        private java.util.List<SkillVersions> skillVersions;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("SourceMarket")
        private String sourceMarket;

        @com.aliyun.core.annotation.NameInMap("SourceMarketName")
        private String sourceMarketName;

        @com.aliyun.core.annotation.NameInMap("SupplierType")
        private String supplierType;

        @com.aliyun.core.annotation.NameInMap("SupportAgentList")
        private java.util.List<SupportAgentList> supportAgentList;

        private Skills(Builder builder) {
            this.apiKey = builder.apiKey;
            this.author = builder.author;
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.envVars = builder.envVars;
            this.gmtCreated = builder.gmtCreated;
            this.skillIconUrl = builder.skillIconUrl;
            this.skillId = builder.skillId;
            this.skillName = builder.skillName;
            this.skillVersions = builder.skillVersions;
            this.slug = builder.slug;
            this.sourceMarket = builder.sourceMarket;
            this.sourceMarketName = builder.sourceMarketName;
            this.supplierType = builder.supplierType;
            this.supportAgentList = builder.supportAgentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
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
         * @return envVars
         */
        public java.util.Map<String, String> getEnvVars() {
            return this.envVars;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return skillIconUrl
         */
        public String getSkillIconUrl() {
            return this.skillIconUrl;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return skillVersions
         */
        public java.util.List<SkillVersions> getSkillVersions() {
            return this.skillVersions;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return sourceMarket
         */
        public String getSourceMarket() {
            return this.sourceMarket;
        }

        /**
         * @return sourceMarketName
         */
        public String getSourceMarketName() {
            return this.sourceMarketName;
        }

        /**
         * @return supplierType
         */
        public String getSupplierType() {
            return this.supplierType;
        }

        /**
         * @return supportAgentList
         */
        public java.util.List<SupportAgentList> getSupportAgentList() {
            return this.supportAgentList;
        }

        public static final class Builder {
            private String apiKey; 
            private String author; 
            private String defaultVersion; 
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private java.util.Map<String, String> envVars; 
            private String gmtCreated; 
            private String skillIconUrl; 
            private String skillId; 
            private String skillName; 
            private java.util.List<SkillVersions> skillVersions; 
            private String slug; 
            private String sourceMarket; 
            private String sourceMarketName; 
            private String supplierType; 
            private java.util.List<SupportAgentList> supportAgentList; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.apiKey = model.apiKey;
                this.author = model.author;
                this.defaultVersion = model.defaultVersion;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.envVars = model.envVars;
                this.gmtCreated = model.gmtCreated;
                this.skillIconUrl = model.skillIconUrl;
                this.skillId = model.skillId;
                this.skillName = model.skillName;
                this.skillVersions = model.skillVersions;
                this.slug = model.slug;
                this.sourceMarket = model.sourceMarket;
                this.sourceMarketName = model.sourceMarketName;
                this.supplierType = model.supplierType;
                this.supportAgentList = model.supportAgentList;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
                return this;
            }

            /**
             * DefaultVersion.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EnvVars.
             */
            public Builder envVars(java.util.Map<String, String> envVars) {
                this.envVars = envVars;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * SkillIconUrl.
             */
            public Builder skillIconUrl(String skillIconUrl) {
                this.skillIconUrl = skillIconUrl;
                return this;
            }

            /**
             * SkillId.
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * SkillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * SkillVersions.
             */
            public Builder skillVersions(java.util.List<SkillVersions> skillVersions) {
                this.skillVersions = skillVersions;
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
             * SourceMarket.
             */
            public Builder sourceMarket(String sourceMarket) {
                this.sourceMarket = sourceMarket;
                return this;
            }

            /**
             * SourceMarketName.
             */
            public Builder sourceMarketName(String sourceMarketName) {
                this.sourceMarketName = sourceMarketName;
                return this;
            }

            /**
             * SupplierType.
             */
            public Builder supplierType(String supplierType) {
                this.supplierType = supplierType;
                return this;
            }

            /**
             * SupportAgentList.
             */
            public Builder supportAgentList(java.util.List<SupportAgentList> supportAgentList) {
                this.supportAgentList = supportAgentList;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
}
