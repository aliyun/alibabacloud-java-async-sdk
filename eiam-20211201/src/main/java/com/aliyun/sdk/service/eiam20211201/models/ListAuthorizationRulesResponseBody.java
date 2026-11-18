// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizationRulesResponseBody</p>
 */
public class ListAuthorizationRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationRules")
    private java.util.List<AuthorizationRules> authorizationRules;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthorizationRulesResponseBody(Builder builder) {
        this.authorizationRules = builder.authorizationRules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRules
     */
    public java.util.List<AuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AuthorizationRules> authorizationRules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAuthorizationRulesResponseBody model) {
            this.authorizationRules = model.authorizationRules;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of authorization rules.</p>
         */
        public Builder authorizationRules(java.util.List<AuthorizationRules> authorizationRules) {
            this.authorizationRules = authorizationRules;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for paging in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token returned in the current response for querying the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthorizationRulesResponseBody build() {
            return new ListAuthorizationRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizationRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizationRulesResponseBody</p>
     */
    public static class AuthorizationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceScope")
        private String authorizationResourceScope;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleCreationType")
        private String authorizationRuleCreationType;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleName")
        private String authorizationRuleName;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleScenarioLabel")
        private String authorizationRuleScenarioLabel;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleSubjectId")
        private String authorizationRuleSubjectId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleSubjectScope")
        private String authorizationRuleSubjectScope;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleSubjectType")
        private String authorizationRuleSubjectType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private AuthorizationRules(Builder builder) {
            this.authorizationResourceScope = builder.authorizationResourceScope;
            this.authorizationRuleCreationType = builder.authorizationRuleCreationType;
            this.authorizationRuleId = builder.authorizationRuleId;
            this.authorizationRuleName = builder.authorizationRuleName;
            this.authorizationRuleScenarioLabel = builder.authorizationRuleScenarioLabel;
            this.authorizationRuleSubjectId = builder.authorizationRuleSubjectId;
            this.authorizationRuleSubjectScope = builder.authorizationRuleSubjectScope;
            this.authorizationRuleSubjectType = builder.authorizationRuleSubjectType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationRules create() {
            return builder().build();
        }

        /**
         * @return authorizationResourceScope
         */
        public String getAuthorizationResourceScope() {
            return this.authorizationResourceScope;
        }

        /**
         * @return authorizationRuleCreationType
         */
        public String getAuthorizationRuleCreationType() {
            return this.authorizationRuleCreationType;
        }

        /**
         * @return authorizationRuleId
         */
        public String getAuthorizationRuleId() {
            return this.authorizationRuleId;
        }

        /**
         * @return authorizationRuleName
         */
        public String getAuthorizationRuleName() {
            return this.authorizationRuleName;
        }

        /**
         * @return authorizationRuleScenarioLabel
         */
        public String getAuthorizationRuleScenarioLabel() {
            return this.authorizationRuleScenarioLabel;
        }

        /**
         * @return authorizationRuleSubjectId
         */
        public String getAuthorizationRuleSubjectId() {
            return this.authorizationRuleSubjectId;
        }

        /**
         * @return authorizationRuleSubjectScope
         */
        public String getAuthorizationRuleSubjectScope() {
            return this.authorizationRuleSubjectScope;
        }

        /**
         * @return authorizationRuleSubjectType
         */
        public String getAuthorizationRuleSubjectType() {
            return this.authorizationRuleSubjectType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String authorizationResourceScope; 
            private String authorizationRuleCreationType; 
            private String authorizationRuleId; 
            private String authorizationRuleName; 
            private String authorizationRuleScenarioLabel; 
            private String authorizationRuleSubjectId; 
            private String authorizationRuleSubjectScope; 
            private String authorizationRuleSubjectType; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private String projectId; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(AuthorizationRules model) {
                this.authorizationResourceScope = model.authorizationResourceScope;
                this.authorizationRuleCreationType = model.authorizationRuleCreationType;
                this.authorizationRuleId = model.authorizationRuleId;
                this.authorizationRuleName = model.authorizationRuleName;
                this.authorizationRuleScenarioLabel = model.authorizationRuleScenarioLabel;
                this.authorizationRuleSubjectId = model.authorizationRuleSubjectId;
                this.authorizationRuleSubjectScope = model.authorizationRuleSubjectScope;
                this.authorizationRuleSubjectType = model.authorizationRuleSubjectType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.projectId = model.projectId;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The scope of authorized resources. Valid values:</p>
             * <ul>
             * <li>custom: Resources within the specified project scope.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder authorizationResourceScope(String authorizationResourceScope) {
                this.authorizationResourceScope = authorizationResourceScope;
                return this;
            }

            /**
             * <p>The creation type of the authorization rule. Valid values:</p>
             * <ul>
             * <li>system_init: Created by the system.</li>
             * <li>user_custom: Created by a user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder authorizationRuleCreationType(String authorizationRuleCreationType) {
                this.authorizationRuleCreationType = authorizationRuleCreationType;
                return this;
            }

            /**
             * <p>The ID of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * <p>The name of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder authorizationRuleName(String authorizationRuleName) {
                this.authorizationRuleName = authorizationRuleName;
                return this;
            }

            /**
             * <p>The scenario label of the authorization rule. Valid values:</p>
             * <ul>
             * <li>privileged_cloud_account: Privileged cloud account scenario.</li>
             * <li>asset: Asset scenario.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>privileged_cloud_account</p>
             */
            public Builder authorizationRuleScenarioLabel(String authorizationRuleScenarioLabel) {
                this.authorizationRuleScenarioLabel = authorizationRuleScenarioLabel;
                return this;
            }

            /**
             * <p>The ID of the subject associated with the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
             */
            public Builder authorizationRuleSubjectId(String authorizationRuleSubjectId) {
                this.authorizationRuleSubjectId = authorizationRuleSubjectId;
                return this;
            }

            /**
             * <p>The subject scope of the authorization rule. Valid values:</p>
             * <ul>
             * <li>shared: Shared. A single rule can be used by multiple subjects that meet the rule constraints.</li>
             * <li>exclusive: Exclusive. A single rule can only be used by the specified subject.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>shared</p>
             */
            public Builder authorizationRuleSubjectScope(String authorizationRuleSubjectScope) {
                this.authorizationRuleSubjectScope = authorizationRuleSubjectScope;
                return this;
            }

            /**
             * <p>The subject type applicable to the authorization rule. For an exclusive rule, this field indicates the type of the specified subject. For a shared rule with a specified subject type, this field indicates the subject types that the rule can be associated with. Valid values:</p>
             * <ul>
             * <li>application: Application.</li>
             * <li>user: Account. For a shared privileged cloud account rule, this value indicates the human user type and can be associated with accounts, user groups, and organizational units.<blockquote>
             * <p>If the subject type is not specified for the rule, this field may be empty. The actual subjects associated with a shared rule are subject to the query results of subject associations.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder authorizationRuleSubjectType(String authorizationRuleSubjectType) {
                this.authorizationRuleSubjectType = authorizationRuleSubjectType;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the project associated with the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>iprj_system_default</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the authorization rule. Valid values:</p>
             * <ul>
             * <li>enabled: The rule is enabled.</li>
             * <li>disabled: The rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AuthorizationRules build() {
                return new AuthorizationRules(this);
            } 

        } 

    }
}
