// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ListPublicSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicSkillsResponseBody</p>
 */
public class ListPublicSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<Skills> skills;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublicSkillsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicSkillsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Skills> skills; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPublicSkillsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAZ9FmxgN6wKfeK/GOKRnnjU=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of skills.</p>
         */
        public Builder skills(java.util.List<Skills> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublicSkillsResponseBody build() {
            return new ListPublicSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublicSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublicSkillsResponseBody</p>
     */
    public static class Locales extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnValue")
        private String enValue;

        @com.aliyun.core.annotation.NameInMap("OriginalValue")
        private String originalValue;

        @com.aliyun.core.annotation.NameInMap("ZhValue")
        private String zhValue;

        private Locales(Builder builder) {
            this.enValue = builder.enValue;
            this.originalValue = builder.originalValue;
            this.zhValue = builder.zhValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Locales create() {
            return builder().build();
        }

        /**
         * @return enValue
         */
        public String getEnValue() {
            return this.enValue;
        }

        /**
         * @return originalValue
         */
        public String getOriginalValue() {
            return this.originalValue;
        }

        /**
         * @return zhValue
         */
        public String getZhValue() {
            return this.zhValue;
        }

        public static final class Builder {
            private String enValue; 
            private String originalValue; 
            private String zhValue; 

            private Builder() {
            } 

            private Builder(Locales model) {
                this.enValue = model.enValue;
                this.originalValue = model.originalValue;
                this.zhValue = model.zhValue;
            } 

            /**
             * EnValue.
             */
            public Builder enValue(String enValue) {
                this.enValue = enValue;
                return this;
            }

            /**
             * OriginalValue.
             */
            public Builder originalValue(String originalValue) {
                this.originalValue = originalValue;
                return this;
            }

            /**
             * ZhValue.
             */
            public Builder zhValue(String zhValue) {
                this.zhValue = zhValue;
                return this;
            }

            public Locales build() {
                return new Locales(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPublicSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublicSkillsResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("Locales")
        private java.util.List<Locales> locales;

        @com.aliyun.core.annotation.NameInMap("RequiredConnections")
        private java.util.List<String> requiredConnections;

        @com.aliyun.core.annotation.NameInMap("SecurityScanStatus")
        private String securityScanStatus;

        @com.aliyun.core.annotation.NameInMap("SkillDescription")
        private String skillDescription;

        @com.aliyun.core.annotation.NameInMap("SkillDisplayName")
        private String skillDisplayName;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillLabels")
        private java.util.List<String> skillLabels;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
        private String skillSpaceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Skills(Builder builder) {
            this.createTime = builder.createTime;
            this.downloadUrl = builder.downloadUrl;
            this.locales = builder.locales;
            this.requiredConnections = builder.requiredConnections;
            this.securityScanStatus = builder.securityScanStatus;
            this.skillDescription = builder.skillDescription;
            this.skillDisplayName = builder.skillDisplayName;
            this.skillId = builder.skillId;
            this.skillLabels = builder.skillLabels;
            this.skillName = builder.skillName;
            this.skillSpaceId = builder.skillSpaceId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return locales
         */
        public java.util.List<Locales> getLocales() {
            return this.locales;
        }

        /**
         * @return requiredConnections
         */
        public java.util.List<String> getRequiredConnections() {
            return this.requiredConnections;
        }

        /**
         * @return securityScanStatus
         */
        public String getSecurityScanStatus() {
            return this.securityScanStatus;
        }

        /**
         * @return skillDescription
         */
        public String getSkillDescription() {
            return this.skillDescription;
        }

        /**
         * @return skillDisplayName
         */
        public String getSkillDisplayName() {
            return this.skillDisplayName;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillLabels
         */
        public java.util.List<String> getSkillLabels() {
            return this.skillLabels;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return skillSpaceId
         */
        public String getSkillSpaceId() {
            return this.skillSpaceId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String downloadUrl; 
            private java.util.List<Locales> locales; 
            private java.util.List<String> requiredConnections; 
            private String securityScanStatus; 
            private String skillDescription; 
            private String skillDisplayName; 
            private String skillId; 
            private java.util.List<String> skillLabels; 
            private String skillName; 
            private String skillSpaceId; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.createTime = model.createTime;
                this.downloadUrl = model.downloadUrl;
                this.locales = model.locales;
                this.requiredConnections = model.requiredConnections;
                this.securityScanStatus = model.securityScanStatus;
                this.skillDescription = model.skillDescription;
                this.skillDisplayName = model.skillDisplayName;
                this.skillId = model.skillId;
                this.skillLabels = model.skillLabels;
                this.skillName = model.skillName;
                this.skillSpaceId = model.skillSpaceId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-11T02:18:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The download URL for the skill package.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator.zip">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/skill-creator.zip</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * Locales.
             */
            public Builder locales(java.util.List<Locales> locales) {
                this.locales = locales;
                return this;
            }

            /**
             * <p>The set of connection types that the skill depends on.</p>
             */
            public Builder requiredConnections(java.util.List<String> requiredConnections) {
                this.requiredConnections = requiredConnections;
                return this;
            }

            /**
             * <p>The security scan status of the source file.</p>
             */
            public Builder securityScanStatus(String securityScanStatus) {
                this.securityScanStatus = securityScanStatus;
                return this;
            }

            /**
             * <p>The skill description.</p>
             * 
             * <strong>example:</strong>
             * <p>Create new skills, modify and improve existing skills, and measure skill performance.</p>
             */
            public Builder skillDescription(String skillDescription) {
                this.skillDescription = skillDescription;
                return this;
            }

            /**
             * <p>The skill display name.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS 补丁管理</p>
             */
            public Builder skillDisplayName(String skillDisplayName) {
                this.skillDisplayName = skillDisplayName;
                return this;
            }

            /**
             * <p>Skill ID</p>
             * 
             * <strong>example:</strong>
             * <p>s-xxxxx</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>The skill label set.</p>
             */
            public Builder skillLabels(java.util.List<String> skillLabels) {
                this.skillLabels = skillLabels;
                return this;
            }

            /**
             * <p>The skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>skill-creator</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>The ID of the SkillSpace to which the skill belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ss-xxxxx</p>
             */
            public Builder skillSpaceId(String skillSpaceId) {
                this.skillSpaceId = skillSpaceId;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-03T22:58:52Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
}
