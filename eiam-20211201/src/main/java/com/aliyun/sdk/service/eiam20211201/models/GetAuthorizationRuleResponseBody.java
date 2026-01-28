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
 * {@link GetAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorizationRuleResponseBody</p>
 */
public class GetAuthorizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationRule")
    private AuthorizationRule authorizationRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAuthorizationRuleResponseBody(Builder builder) {
        this.authorizationRule = builder.authorizationRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRule
     */
    public AuthorizationRule getAuthorizationRule() {
        return this.authorizationRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AuthorizationRule authorizationRule; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAuthorizationRuleResponseBody model) {
            this.authorizationRule = model.authorizationRule;
            this.requestId = model.requestId;
        } 

        /**
         * AuthorizationRule.
         */
        public Builder authorizationRule(AuthorizationRule authorizationRule) {
            this.authorizationRule = authorizationRule;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuthorizationRuleResponseBody build() {
            return new GetAuthorizationRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthorizationRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthorizationRuleResponseBody</p>
     */
    public static class AuthorizationRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationResourceScope")
        private String authorizationResourceScope;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleCreationType")
        private String authorizationRuleCreationType;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
        private String authorizationRuleId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRuleName")
        private String authorizationRuleName;

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

        private AuthorizationRule(Builder builder) {
            this.authorizationResourceScope = builder.authorizationResourceScope;
            this.authorizationRuleCreationType = builder.authorizationRuleCreationType;
            this.authorizationRuleId = builder.authorizationRuleId;
            this.authorizationRuleName = builder.authorizationRuleName;
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

        public static AuthorizationRule create() {
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
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private String projectId; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(AuthorizationRule model) {
                this.authorizationResourceScope = model.authorizationResourceScope;
                this.authorizationRuleCreationType = model.authorizationRuleCreationType;
                this.authorizationRuleId = model.authorizationRuleId;
                this.authorizationRuleName = model.authorizationRuleName;
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

            public AuthorizationRule build() {
                return new AuthorizationRule(this);
            } 

        } 

    }
}
