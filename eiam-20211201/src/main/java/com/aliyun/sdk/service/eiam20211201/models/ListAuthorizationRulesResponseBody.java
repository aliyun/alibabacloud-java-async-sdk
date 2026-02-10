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
         * AuthorizationRules.
         */
        public Builder authorizationRules(java.util.List<AuthorizationRules> authorizationRules) {
            this.authorizationRules = authorizationRules;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
             * <p>授权资源范围，枚举值：global（项目下所有资源）、custom（指定资源）。</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder authorizationResourceScope(String authorizationResourceScope) {
                this.authorizationResourceScope = authorizationResourceScope;
                return this;
            }

            /**
             * <p>授权规则的创建类型，枚举类型：user_created（用户创建)，approval_created（审批创建)。</p>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder authorizationRuleCreationType(String authorizationRuleCreationType) {
                this.authorizationRuleCreationType = authorizationRuleCreationType;
                return this;
            }

            /**
             * <p>授权规则标识。</p>
             * 
             * <strong>example:</strong>
             * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * <p>授权规则名称。</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder authorizationRuleName(String authorizationRuleName) {
                this.authorizationRuleName = authorizationRuleName;
                return this;
            }

            /**
             * <p>授权规则主体ID，主体类型对应的主体ID。</p>
             */
            public Builder authorizationRuleSubjectId(String authorizationRuleSubjectId) {
                this.authorizationRuleSubjectId = authorizationRuleSubjectId;
                return this;
            }

            /**
             * <p>授权规则主体范围，枚举类型：shared（共享型，即支持所有主体，包括账户、应用），exclusive（专属类型）</p>
             */
            public Builder authorizationRuleSubjectScope(String authorizationRuleSubjectScope) {
                this.authorizationRuleSubjectScope = authorizationRuleSubjectScope;
                return this;
            }

            /**
             * <p>授权规则主体类型，枚举类型：application（应用)，user（账户)。</p>
             */
            public Builder authorizationRuleSubjectType(String authorizationRuleSubjectType) {
                this.authorizationRuleSubjectType = authorizationRuleSubjectType;
                return this;
            }

            /**
             * <p>创建时间，Unix时间戳格式，单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1652085686179</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>授权规则描述，长度限制为128字符。</p>
             * 
             * <strong>example:</strong>
             * <p>this is a test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>授权规则关联的项目标识。</p>
             * 
             * <strong>example:</strong>
             * <p>iprj_system_default</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>授权规则状态，枚举值：enabled（启用）、disabled（禁用）。</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>最近一次更新时间，Unix时间戳格式，单位为毫秒。</p>
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
