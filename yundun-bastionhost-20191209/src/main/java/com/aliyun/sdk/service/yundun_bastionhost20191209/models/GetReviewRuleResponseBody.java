// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetReviewRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetReviewRuleResponseBody</p>
 */
public class GetReviewRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReviewRule")
    private ReviewRule reviewRule;

    private GetReviewRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.reviewRule = builder.reviewRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReviewRuleResponseBody create() {
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
     * @return reviewRule
     */
    public ReviewRule getReviewRule() {
        return this.reviewRule;
    }

    public static final class Builder {
        private String requestId; 
        private ReviewRule reviewRule; 

        private Builder() {
        } 

        private Builder(GetReviewRuleResponseBody model) {
            this.requestId = model.requestId;
            this.reviewRule = model.reviewRule;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReviewRule.
         */
        public Builder reviewRule(ReviewRule reviewRule) {
            this.reviewRule = reviewRule;
            return this;
        }

        public GetReviewRuleResponseBody build() {
            return new GetReviewRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetReviewRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetReviewRuleResponseBody</p>
     */
    public static class Principals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Principals(Builder builder) {
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Principals create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalName; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Principals model) {
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * PrincipalName.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Principals build() {
                return new Principals(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetReviewRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetReviewRuleResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Projects(Builder builder) {
            this.description = builder.description;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String description; 
            private Boolean isDefault; 
            private String name; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Projects model) {
                this.description = model.description;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.projectId = model.projectId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetReviewRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetReviewRuleResponseBody</p>
     */
    public static class ReviewRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Principals")
        private java.util.List<Principals> principals;

        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<Long> projectIds;

        @com.aliyun.core.annotation.NameInMap("Projects")
        private java.util.List<Projects> projects;

        @com.aliyun.core.annotation.NameInMap("ReviewRuleId")
        private String reviewRuleId;

        @com.aliyun.core.annotation.NameInMap("ReviewRuleName")
        private String reviewRuleName;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private Integer scopeType;

        private ReviewRule(Builder builder) {
            this.description = builder.description;
            this.principals = builder.principals;
            this.projectIds = builder.projectIds;
            this.projects = builder.projects;
            this.reviewRuleId = builder.reviewRuleId;
            this.reviewRuleName = builder.reviewRuleName;
            this.scopeType = builder.scopeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewRule create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return principals
         */
        public java.util.List<Principals> getPrincipals() {
            return this.principals;
        }

        /**
         * @return projectIds
         */
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return projects
         */
        public java.util.List<Projects> getProjects() {
            return this.projects;
        }

        /**
         * @return reviewRuleId
         */
        public String getReviewRuleId() {
            return this.reviewRuleId;
        }

        /**
         * @return reviewRuleName
         */
        public String getReviewRuleName() {
            return this.reviewRuleName;
        }

        /**
         * @return scopeType
         */
        public Integer getScopeType() {
            return this.scopeType;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<Principals> principals; 
            private java.util.List<Long> projectIds; 
            private java.util.List<Projects> projects; 
            private String reviewRuleId; 
            private String reviewRuleName; 
            private Integer scopeType; 

            private Builder() {
            } 

            private Builder(ReviewRule model) {
                this.description = model.description;
                this.principals = model.principals;
                this.projectIds = model.projectIds;
                this.projects = model.projects;
                this.reviewRuleId = model.reviewRuleId;
                this.reviewRuleName = model.reviewRuleName;
                this.scopeType = model.scopeType;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Principals.
             */
            public Builder principals(java.util.List<Principals> principals) {
                this.principals = principals;
                return this;
            }

            /**
             * ProjectIds.
             */
            public Builder projectIds(java.util.List<Long> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * Projects.
             */
            public Builder projects(java.util.List<Projects> projects) {
                this.projects = projects;
                return this;
            }

            /**
             * ReviewRuleId.
             */
            public Builder reviewRuleId(String reviewRuleId) {
                this.reviewRuleId = reviewRuleId;
                return this;
            }

            /**
             * ReviewRuleName.
             */
            public Builder reviewRuleName(String reviewRuleName) {
                this.reviewRuleName = reviewRuleName;
                return this;
            }

            /**
             * ScopeType.
             */
            public Builder scopeType(Integer scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            public ReviewRule build() {
                return new ReviewRule(this);
            } 

        } 

    }
}
