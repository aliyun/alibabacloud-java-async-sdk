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
         * <p>The authorization rule object.</p>
         */
        public Builder authorizationRule(AuthorizationRule authorizationRule) {
            this.authorizationRule = authorizationRule;
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

        private AuthorizationRule(Builder builder) {
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

            private Builder(AuthorizationRule model) {
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
             * <p>The authorization resource scope. Valid values:</p>
             * <ul>
             * <li>global: All resources under the project.</li>
             * <li>custom: Specified resources within the project scope.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder authorizationResourceScope(String authorizationResourceScope) {
                this.authorizationResourceScope = authorizationResourceScope;
                return this;
            }

            /**
             * <p>The creation type of the authorization rule. Valid values:</p>
             * <ul>
             * <li>system_init: Created by the system.</li>
             * <li>user_custom: Created by the user.</li>
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
             * <p>The authorization rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
             */
            public Builder authorizationRuleId(String authorizationRuleId) {
                this.authorizationRuleId = authorizationRuleId;
                return this;
            }

            /**
             * <p>The authorization rule name.</p>
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
             * <p>Asset</p>
             */
            public Builder authorizationRuleScenarioLabel(String authorizationRuleScenarioLabel) {
                this.authorizationRuleScenarioLabel = authorizationRuleScenarioLabel;
                return this;
            }

            /**
             * <p>The subject ID associated with the authorization rule.</p>
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
             * <li>shared: Shared type, which supports all subjects, including accounts and applications.</li>
             * <li>exclusive: Exclusive type.</li>
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
             * <p>The subject type associated with the authorization rule. This parameter is valid only when the authorization rule subject scope is exclusive. Valid values:</p>
             * <ul>
             * <li>application: Application.</li>
             * <li>user: Account.</li>
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
             * <p>The creation time, in UNIX timestamp format. Unit: milliseconds.</p>
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
             * <p>The project ID associated with the authorization rule.</p>
             * 
             * <strong>example:</strong>
             * <p>iprj_system_default</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The authorization rule status. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
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
             * <p>The last update time, in UNIX timestamp format. Unit: milliseconds.</p>
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
