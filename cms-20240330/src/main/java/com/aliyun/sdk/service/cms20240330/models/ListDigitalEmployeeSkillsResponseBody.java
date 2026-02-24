// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListDigitalEmployeeSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDigitalEmployeeSkillsResponseBody</p>
 */
public class ListDigitalEmployeeSkillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skills")
    private java.util.List<Skills> skills;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListDigitalEmployeeSkillsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDigitalEmployeeSkillsResponseBody create() {
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Skills> skills; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListDigitalEmployeeSkillsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.total = model.total;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-XXXX-XXXX-XXXX-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * skills.
         */
        public Builder skills(java.util.List<Skills> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListDigitalEmployeeSkillsResponseBody build() {
            return new ListDigitalEmployeeSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDigitalEmployeeSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDigitalEmployeeSkillsResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Skills(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.skillName = builder.skillName;
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
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private String skillName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.skillName = model.skillName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-06T14:09:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * skillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-06T14:09:11Z</p>
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
