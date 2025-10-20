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
 * {@link ListConditionalAccessPoliciesForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListConditionalAccessPoliciesForUserResponseBody</p>
 */
public class ListConditionalAccessPoliciesForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicies")
    private java.util.List<ConditionalAccessPolicies> conditionalAccessPolicies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListConditionalAccessPoliciesForUserResponseBody(Builder builder) {
        this.conditionalAccessPolicies = builder.conditionalAccessPolicies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConditionalAccessPoliciesForUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditionalAccessPolicies
     */
    public java.util.List<ConditionalAccessPolicies> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConditionalAccessPolicies> conditionalAccessPolicies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConditionalAccessPoliciesForUserResponseBody model) {
            this.conditionalAccessPolicies = model.conditionalAccessPolicies;
            this.requestId = model.requestId;
        } 

        /**
         * ConditionalAccessPolicies.
         */
        public Builder conditionalAccessPolicies(java.util.List<ConditionalAccessPolicies> conditionalAccessPolicies) {
            this.conditionalAccessPolicies = conditionalAccessPolicies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConditionalAccessPoliciesForUserResponseBody build() {
            return new ListConditionalAccessPoliciesForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConditionalAccessPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesForUserResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExcludeApplications")
        private java.util.List<String> excludeApplications;

        @com.aliyun.core.annotation.NameInMap("IncludeApplications")
        private java.util.List<String> includeApplications;

        private Applications(Builder builder) {
            this.excludeApplications = builder.excludeApplications;
            this.includeApplications = builder.includeApplications;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return excludeApplications
         */
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        /**
         * @return includeApplications
         */
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

        public static final class Builder {
            private java.util.List<String> excludeApplications; 
            private java.util.List<String> includeApplications; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.excludeApplications = model.excludeApplications;
                this.includeApplications = model.includeApplications;
            } 

            /**
             * <p>排除的应用</p>
             */
            public Builder excludeApplications(java.util.List<String> excludeApplications) {
                this.excludeApplications = excludeApplications;
                return this;
            }

            /**
             * <p>选择的应用</p>
             */
            public Builder includeApplications(java.util.List<String> includeApplications) {
                this.includeApplications = includeApplications;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConditionalAccessPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesForUserResponseBody</p>
     */
    public static class NetworkZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExcludeNetworkZones")
        private java.util.List<String> excludeNetworkZones;

        @com.aliyun.core.annotation.NameInMap("IncludeNetworkZones")
        private java.util.List<String> includeNetworkZones;

        private NetworkZones(Builder builder) {
            this.excludeNetworkZones = builder.excludeNetworkZones;
            this.includeNetworkZones = builder.includeNetworkZones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkZones create() {
            return builder().build();
        }

        /**
         * @return excludeNetworkZones
         */
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        /**
         * @return includeNetworkZones
         */
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

        public static final class Builder {
            private java.util.List<String> excludeNetworkZones; 
            private java.util.List<String> includeNetworkZones; 

            private Builder() {
            } 

            private Builder(NetworkZones model) {
                this.excludeNetworkZones = model.excludeNetworkZones;
                this.includeNetworkZones = model.includeNetworkZones;
            } 

            /**
             * <p>排除的网络区域</p>
             */
            public Builder excludeNetworkZones(java.util.List<String> excludeNetworkZones) {
                this.excludeNetworkZones = excludeNetworkZones;
                return this;
            }

            /**
             * <p>选择的网络区域</p>
             */
            public Builder includeNetworkZones(java.util.List<String> includeNetworkZones) {
                this.includeNetworkZones = includeNetworkZones;
                return this;
            }

            public NetworkZones build() {
                return new NetworkZones(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConditionalAccessPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesForUserResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExcludeGroups")
        private java.util.List<String> excludeGroups;

        @com.aliyun.core.annotation.NameInMap("ExcludeOrganizationalUnits")
        private java.util.List<String> excludeOrganizationalUnits;

        @com.aliyun.core.annotation.NameInMap("ExcludeUsers")
        private java.util.List<String> excludeUsers;

        @com.aliyun.core.annotation.NameInMap("IncludeGroups")
        private java.util.List<String> includeGroups;

        @com.aliyun.core.annotation.NameInMap("IncludeOrganizationalUnits")
        private java.util.List<String> includeOrganizationalUnits;

        @com.aliyun.core.annotation.NameInMap("IncludeUsers")
        private java.util.List<String> includeUsers;

        private Users(Builder builder) {
            this.excludeGroups = builder.excludeGroups;
            this.excludeOrganizationalUnits = builder.excludeOrganizationalUnits;
            this.excludeUsers = builder.excludeUsers;
            this.includeGroups = builder.includeGroups;
            this.includeOrganizationalUnits = builder.includeOrganizationalUnits;
            this.includeUsers = builder.includeUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return excludeGroups
         */
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        /**
         * @return excludeOrganizationalUnits
         */
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        /**
         * @return excludeUsers
         */
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        /**
         * @return includeGroups
         */
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        /**
         * @return includeOrganizationalUnits
         */
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        /**
         * @return includeUsers
         */
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

        public static final class Builder {
            private java.util.List<String> excludeGroups; 
            private java.util.List<String> excludeOrganizationalUnits; 
            private java.util.List<String> excludeUsers; 
            private java.util.List<String> includeGroups; 
            private java.util.List<String> includeOrganizationalUnits; 
            private java.util.List<String> includeUsers; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.excludeGroups = model.excludeGroups;
                this.excludeOrganizationalUnits = model.excludeOrganizationalUnits;
                this.excludeUsers = model.excludeUsers;
                this.includeGroups = model.includeGroups;
                this.includeOrganizationalUnits = model.includeOrganizationalUnits;
                this.includeUsers = model.includeUsers;
            } 

            /**
             * <p>排除的用户组</p>
             */
            public Builder excludeGroups(java.util.List<String> excludeGroups) {
                this.excludeGroups = excludeGroups;
                return this;
            }

            /**
             * <p>排除的组织</p>
             */
            public Builder excludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
                this.excludeOrganizationalUnits = excludeOrganizationalUnits;
                return this;
            }

            /**
             * <p>排除的用户</p>
             */
            public Builder excludeUsers(java.util.List<String> excludeUsers) {
                this.excludeUsers = excludeUsers;
                return this;
            }

            /**
             * <p>选择的用户组</p>
             */
            public Builder includeGroups(java.util.List<String> includeGroups) {
                this.includeGroups = includeGroups;
                return this;
            }

            /**
             * <p>选择的组织</p>
             */
            public Builder includeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
                this.includeOrganizationalUnits = includeOrganizationalUnits;
                return this;
            }

            /**
             * <p>选择的用户</p>
             */
            public Builder includeUsers(java.util.List<String> includeUsers) {
                this.includeUsers = includeUsers;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConditionalAccessPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesForUserResponseBody</p>
     */
    public static class ConditionsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private Applications applications;

        @com.aliyun.core.annotation.NameInMap("NetworkZones")
        private NetworkZones networkZones;

        @com.aliyun.core.annotation.NameInMap("Users")
        private Users users;

        private ConditionsConfig(Builder builder) {
            this.applications = builder.applications;
            this.networkZones = builder.networkZones;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionsConfig create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public Applications getApplications() {
            return this.applications;
        }

        /**
         * @return networkZones
         */
        public NetworkZones getNetworkZones() {
            return this.networkZones;
        }

        /**
         * @return users
         */
        public Users getUsers() {
            return this.users;
        }

        public static final class Builder {
            private Applications applications; 
            private NetworkZones networkZones; 
            private Users users; 

            private Builder() {
            } 

            private Builder(ConditionsConfig model) {
                this.applications = model.applications;
                this.networkZones = model.networkZones;
                this.users = model.users;
            } 

            /**
             * <p>条件访问策略目标应用</p>
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>条件访问策略网络区域</p>
             */
            public Builder networkZones(NetworkZones networkZones) {
                this.networkZones = networkZones;
                return this;
            }

            /**
             * <p>条件访问策略目标用户</p>
             */
            public Builder users(Users users) {
                this.users = users;
                return this;
            }

            public ConditionsConfig build() {
                return new ConditionsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConditionalAccessPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesForUserResponseBody</p>
     */
    public static class DecisionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessionReuseStatus")
        private String activeSessionReuseStatus;

        @com.aliyun.core.annotation.NameInMap("Effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("MfaAuthenticationIntervalSeconds")
        private Long mfaAuthenticationIntervalSeconds;

        @com.aliyun.core.annotation.NameInMap("MfaAuthenticationMethods")
        private java.util.List<String> mfaAuthenticationMethods;

        @com.aliyun.core.annotation.NameInMap("MfaType")
        private String mfaType;

        private DecisionConfig(Builder builder) {
            this.activeSessionReuseStatus = builder.activeSessionReuseStatus;
            this.effect = builder.effect;
            this.mfaAuthenticationIntervalSeconds = builder.mfaAuthenticationIntervalSeconds;
            this.mfaAuthenticationMethods = builder.mfaAuthenticationMethods;
            this.mfaType = builder.mfaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DecisionConfig create() {
            return builder().build();
        }

        /**
         * @return activeSessionReuseStatus
         */
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return mfaAuthenticationIntervalSeconds
         */
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        /**
         * @return mfaAuthenticationMethods
         */
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        /**
         * @return mfaType
         */
        public String getMfaType() {
            return this.mfaType;
        }

        public static final class Builder {
            private String activeSessionReuseStatus; 
            private String effect; 
            private Long mfaAuthenticationIntervalSeconds; 
            private java.util.List<String> mfaAuthenticationMethods; 
            private String mfaType; 

            private Builder() {
            } 

            private Builder(DecisionConfig model) {
                this.activeSessionReuseStatus = model.activeSessionReuseStatus;
                this.effect = model.effect;
                this.mfaAuthenticationIntervalSeconds = model.mfaAuthenticationIntervalSeconds;
                this.mfaAuthenticationMethods = model.mfaAuthenticationMethods;
                this.mfaType = model.mfaType;
            } 

            /**
             * ActiveSessionReuseStatus.
             */
            public Builder activeSessionReuseStatus(String activeSessionReuseStatus) {
                this.activeSessionReuseStatus = activeSessionReuseStatus;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略决策Action</p>
             * 
             * <strong>example:</strong>
             * <p>allow</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略重复认证时间间隔(秒)</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder mfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
                this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略允许使用的mfa类型</p>
             */
            public Builder mfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
                this.mfaAuthenticationMethods = mfaAuthenticationMethods;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略Mfa类型</p>
             * 
             * <strong>example:</strong>
             * <p>directly_access</p>
             */
            public Builder mfaType(String mfaType) {
                this.mfaType = mfaType;
                return this;
            }

            public DecisionConfig build() {
                return new DecisionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListConditionalAccessPoliciesForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesForUserResponseBody</p>
     */
    public static class ConditionalAccessPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyId")
        private String conditionalAccessPolicyId;

        @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyName")
        private String conditionalAccessPolicyName;

        @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyType")
        private String conditionalAccessPolicyType;

        @com.aliyun.core.annotation.NameInMap("ConditionsConfig")
        private ConditionsConfig conditionsConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DecisionConfig")
        private DecisionConfig decisionConfig;

        @com.aliyun.core.annotation.NameInMap("DecisionType")
        private String decisionType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EvaluateAt")
        private String evaluateAt;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUpdatedTime")
        private Long lastUpdatedTime;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ConditionalAccessPolicies(Builder builder) {
            this.conditionalAccessPolicyId = builder.conditionalAccessPolicyId;
            this.conditionalAccessPolicyName = builder.conditionalAccessPolicyName;
            this.conditionalAccessPolicyType = builder.conditionalAccessPolicyType;
            this.conditionsConfig = builder.conditionsConfig;
            this.createTime = builder.createTime;
            this.decisionConfig = builder.decisionConfig;
            this.decisionType = builder.decisionType;
            this.description = builder.description;
            this.evaluateAt = builder.evaluateAt;
            this.instanceId = builder.instanceId;
            this.lastUpdatedTime = builder.lastUpdatedTime;
            this.priority = builder.priority;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionalAccessPolicies create() {
            return builder().build();
        }

        /**
         * @return conditionalAccessPolicyId
         */
        public String getConditionalAccessPolicyId() {
            return this.conditionalAccessPolicyId;
        }

        /**
         * @return conditionalAccessPolicyName
         */
        public String getConditionalAccessPolicyName() {
            return this.conditionalAccessPolicyName;
        }

        /**
         * @return conditionalAccessPolicyType
         */
        public String getConditionalAccessPolicyType() {
            return this.conditionalAccessPolicyType;
        }

        /**
         * @return conditionsConfig
         */
        public ConditionsConfig getConditionsConfig() {
            return this.conditionsConfig;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return decisionConfig
         */
        public DecisionConfig getDecisionConfig() {
            return this.decisionConfig;
        }

        /**
         * @return decisionType
         */
        public String getDecisionType() {
            return this.decisionType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return evaluateAt
         */
        public String getEvaluateAt() {
            return this.evaluateAt;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastUpdatedTime
         */
        public Long getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String conditionalAccessPolicyId; 
            private String conditionalAccessPolicyName; 
            private String conditionalAccessPolicyType; 
            private ConditionsConfig conditionsConfig; 
            private Long createTime; 
            private DecisionConfig decisionConfig; 
            private String decisionType; 
            private String description; 
            private String evaluateAt; 
            private String instanceId; 
            private Long lastUpdatedTime; 
            private Integer priority; 
            private String status; 

            private Builder() {
            } 

            private Builder(ConditionalAccessPolicies model) {
                this.conditionalAccessPolicyId = model.conditionalAccessPolicyId;
                this.conditionalAccessPolicyName = model.conditionalAccessPolicyName;
                this.conditionalAccessPolicyType = model.conditionalAccessPolicyType;
                this.conditionsConfig = model.conditionsConfig;
                this.createTime = model.createTime;
                this.decisionConfig = model.decisionConfig;
                this.decisionType = model.decisionType;
                this.description = model.description;
                this.evaluateAt = model.evaluateAt;
                this.instanceId = model.instanceId;
                this.lastUpdatedTime = model.lastUpdatedTime;
                this.priority = model.priority;
                this.status = model.status;
            } 

            /**
             * <p>IDaaS EIAM 条件访问策略Id</p>
             * 
             * <strong>example:</strong>
             * <p>cap_m5etun43kejxphsbke6mjxxxxx</p>
             */
            public Builder conditionalAccessPolicyId(String conditionalAccessPolicyId) {
                this.conditionalAccessPolicyId = conditionalAccessPolicyId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略名称</p>
             */
            public Builder conditionalAccessPolicyName(String conditionalAccessPolicyName) {
                this.conditionalAccessPolicyName = conditionalAccessPolicyName;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略类型</p>
             * 
             * <strong>example:</strong>
             * <p>arn:alibaba:idaas:authn:access:policy:system</p>
             */
            public Builder conditionalAccessPolicyType(String conditionalAccessPolicyType) {
                this.conditionalAccessPolicyType = conditionalAccessPolicyType;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略内容</p>
             */
            public Builder conditionsConfig(ConditionsConfig conditionsConfig) {
                this.conditionsConfig = conditionsConfig;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1741857554000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略执行Action</p>
             */
            public Builder decisionConfig(DecisionConfig decisionConfig) {
                this.decisionConfig = decisionConfig;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略执行类型</p>
             * 
             * <strong>example:</strong>
             * <p>enforcement</p>
             */
            public Builder decisionType(String decisionType) {
                this.decisionType = decisionType;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略执行点</p>
             * 
             * <strong>example:</strong>
             * <p>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1</p>
             */
            public Builder evaluateAt(String evaluateAt) {
                this.evaluateAt = evaluateAt;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_oynbcyaaejuik6b37eldz4xxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>1741857554000</p>
             */
            public Builder lastUpdatedTime(Long lastUpdatedTime) {
                this.lastUpdatedTime = lastUpdatedTime;
                return this;
            }

            /**
             * <p>优先级</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>IDaaS EIAM 条件访问策略启用禁用状态</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ConditionalAccessPolicies build() {
                return new ConditionalAccessPolicies(this);
            } 

        } 

    }
}
