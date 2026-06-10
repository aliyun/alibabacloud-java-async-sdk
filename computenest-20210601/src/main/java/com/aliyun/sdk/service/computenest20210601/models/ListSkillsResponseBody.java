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
 * {@link ListSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillsResponseBody</p>
 */
public class ListSkillsResponseBody extends TeaModel {
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

    private ListSkillsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
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

        private Builder(ListSkillsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
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
        public Builder totalCount(Integer totalCount) {
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
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("SkillDescription")
        private String skillDescription;

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
            this.skillDescription = builder.skillDescription;
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
         * @return skillDescription
         */
        public String getSkillDescription() {
            return this.skillDescription;
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
            private String skillDescription; 
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
                this.skillDescription = model.skillDescription;
                this.skillId = model.skillId;
                this.skillLabels = model.skillLabels;
                this.skillName = model.skillName;
                this.skillSpaceId = model.skillSpaceId;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * SkillDescription.
             */
            public Builder skillDescription(String skillDescription) {
                this.skillDescription = skillDescription;
                return this;
            }

            /**
             * <p>Skill ID</p>
             * 
             * <strong>example:</strong>
             * <p>s-111111</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * SkillLabels.
             */
            public Builder skillLabels(java.util.List<String> skillLabels) {
                this.skillLabels = skillLabels;
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
             * SkillSpaceId.
             */
            public Builder skillSpaceId(String skillSpaceId) {
                this.skillSpaceId = skillSpaceId;
                return this;
            }

            /**
             * UpdateTime.
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
