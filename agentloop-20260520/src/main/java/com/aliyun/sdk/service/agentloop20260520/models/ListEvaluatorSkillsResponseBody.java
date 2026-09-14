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
 * {@link ListEvaluatorSkillsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluatorSkillsResponseBody</p>
 */
public class ListEvaluatorSkillsResponseBody extends TeaModel {
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

    private ListEvaluatorSkillsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.skills = builder.skills;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluatorSkillsResponseBody create() {
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

        private Builder(ListEvaluatorSkillsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.skills = model.skills;
            this.total = model.total;
        } 

        /**
         * <p>The number of entries per page used in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJuZXh0IjoiNDAifQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
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
         * <p>The list of skill summaries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;skillName&quot;:&quot;trace_context_loader&quot;,&quot;displayName&quot;:&quot;Trace 上下文读取&quot;,&quot;enable&quot;:true}]</p>
         */
        public Builder skills(java.util.List<Skills> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * <p>The total number of skills.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListEvaluatorSkillsResponseBody build() {
            return new ListEvaluatorSkillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluatorSkillsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluatorSkillsResponseBody</p>
     */
    public static class Skills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("latestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("skillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private Long updatedAt;

        private Skills(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.enable = builder.enable;
            this.latestVersion = builder.latestVersion;
            this.skillName = builder.skillName;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skills create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
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

        public static final class Builder {
            private Long createdAt; 
            private String description; 
            private String displayName; 
            private Boolean enable; 
            private String latestVersion; 
            private String skillName; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(Skills model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.displayName = model.displayName;
                this.enable = model.enable;
                this.latestVersion = model.latestVersion;
                this.skillName = model.skillName;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The creation time. This field is declared as int64 in CloudSpec, but the backend currently returns the StarOps <code>createTime</code> string field.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816000</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
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
             * <p>The latest version. This field is declared in CloudSpec but is not currently populated in the backend response.</p>
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
             * <p>The update time. This field is declared as int64 in CloudSpec, but the backend currently returns the StarOps <code>updateTime</code> string field.</p>
             * 
             * <strong>example:</strong>
             * <p>1782816600</p>
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Skills build() {
                return new Skills(this);
            } 

        } 

    }
}
