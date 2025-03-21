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
 * {@link ListConditionalAccessPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListConditionalAccessPoliciesResponseBody</p>
 */
public class ListConditionalAccessPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicies")
    private java.util.List<ConditionalAccessPolicies> conditionalAccessPolicies;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListConditionalAccessPoliciesResponseBody(Builder builder) {
        this.conditionalAccessPolicies = builder.conditionalAccessPolicies;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConditionalAccessPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return conditionalAccessPolicies
     */
    public java.util.List<ConditionalAccessPolicies> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
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
        private java.util.List<ConditionalAccessPolicies> conditionalAccessPolicies; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>Collection of conditional access policies</p>
         */
        public Builder conditionalAccessPolicies(java.util.List<ConditionalAccessPolicies> conditionalAccessPolicies) {
            this.conditionalAccessPolicies = conditionalAccessPolicies;
            return this;
        }

        /**
         * <p>The token value returned by this call for the next page query.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Previous page query token (Token)</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of items in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConditionalAccessPoliciesResponseBody build() {
            return new ListConditionalAccessPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConditionalAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesResponseBody</p>
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

            /**
             * <p>Excluded applications</p>
             */
            public Builder excludeApplications(java.util.List<String> excludeApplications) {
                this.excludeApplications = excludeApplications;
                return this;
            }

            /**
             * <p>Selected applications</p>
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
     * {@link ListConditionalAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesResponseBody</p>
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

            /**
             * <p>Excluded network zones</p>
             */
            public Builder excludeNetworkZones(java.util.List<String> excludeNetworkZones) {
                this.excludeNetworkZones = excludeNetworkZones;
                return this;
            }

            /**
             * <p>Included network ranges</p>
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
     * {@link ListConditionalAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesResponseBody</p>
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

            /**
             * <p>Excluded user groups</p>
             */
            public Builder excludeGroups(java.util.List<String> excludeGroups) {
                this.excludeGroups = excludeGroups;
                return this;
            }

            /**
             * <p>Excluded organizations</p>
             */
            public Builder excludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
                this.excludeOrganizationalUnits = excludeOrganizationalUnits;
                return this;
            }

            /**
             * <p>Excluded users</p>
             */
            public Builder excludeUsers(java.util.List<String> excludeUsers) {
                this.excludeUsers = excludeUsers;
                return this;
            }

            /**
             * <p>Included user groups</p>
             */
            public Builder includeGroups(java.util.List<String> includeGroups) {
                this.includeGroups = includeGroups;
                return this;
            }

            /**
             * <p>Included organizations</p>
             */
            public Builder includeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
                this.includeOrganizationalUnits = includeOrganizationalUnits;
                return this;
            }

            /**
             * <p>Selected users</p>
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
     * {@link ListConditionalAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesResponseBody</p>
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

            /**
             * <p>Target applications of the conditional access policy</p>
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>Network zones for conditional access policies</p>
             */
            public Builder networkZones(NetworkZones networkZones) {
                this.networkZones = networkZones;
                return this;
            }

            /**
             * <p>Target users of the conditional access policy</p>
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
     * {@link ListConditionalAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesResponseBody</p>
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

            /**
             * <p>Whether to enable session reuse for secondary authentication</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder activeSessionReuseStatus(String activeSessionReuseStatus) {
                this.activeSessionReuseStatus = activeSessionReuseStatus;
                return this;
            }

            /**
             * <p>Decision action of the conditional access policy:
             * deny  Deny
             * allow Allow</p>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>Re-authentication interval for the conditional access policy (in seconds) 300-86400</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder mfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
                this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
                return this;
            }

            /**
             * <p>MFA types allowed by the conditional access policy</p>
             */
            public Builder mfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
                this.mfaAuthenticationMethods = mfaAuthenticationMethods;
                return this;
            }

            /**
             * <p>Conditional Access Policy Mfa Type</p>
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
     * {@link ListConditionalAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListConditionalAccessPoliciesResponseBody</p>
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

            /**
             * <p>Conditional access policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>cp_xxxxx</p>
             */
            public Builder conditionalAccessPolicyId(String conditionalAccessPolicyId) {
                this.conditionalAccessPolicyId = conditionalAccessPolicyId;
                return this;
            }

            /**
             * <p>Conditional access policy name</p>
             * 
             * <strong>example:</strong>
             * <p>My Policy</p>
             */
            public Builder conditionalAccessPolicyName(String conditionalAccessPolicyName) {
                this.conditionalAccessPolicyName = conditionalAccessPolicyName;
                return this;
            }

            /**
             * <p>Type of the conditional access policy</p>
             * 
             * <strong>example:</strong>
             * <p>arn:alibaba:idaas:authn:access:policy:system</p>
             */
            public Builder conditionalAccessPolicyType(String conditionalAccessPolicyType) {
                this.conditionalAccessPolicyType = conditionalAccessPolicyType;
                return this;
            }

            /**
             * <p>Content of the conditional access policy</p>
             */
            public Builder conditionsConfig(ConditionsConfig conditionsConfig) {
                this.conditionsConfig = conditionsConfig;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1741857554000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Action of the conditional access policy</p>
             */
            public Builder decisionConfig(DecisionConfig decisionConfig) {
                this.decisionConfig = decisionConfig;
                return this;
            }

            /**
             * <p>Execution type of the conditional access policy</p>
             * 
             * <strong>example:</strong>
             * <p>enforcement</p>
             */
            public Builder decisionType(String decisionType) {
                this.decisionType = decisionType;
                return this;
            }

            /**
             * <p>Description of the conditional access policy</p>
             * 
             * <strong>example:</strong>
             * <p>My Policy Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Execution point of the conditional access policy</p>
             * 
             * <strong>example:</strong>
             * <p>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1</p>
             */
            public Builder evaluateAt(String evaluateAt) {
                this.evaluateAt = evaluateAt;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ksvv5c7f2l6uzh6oqspeks23ni</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Last updated time</p>
             * 
             * <strong>example:</strong>
             * <p>1741857554000</p>
             */
            public Builder lastUpdatedTime(Long lastUpdatedTime) {
                this.lastUpdatedTime = lastUpdatedTime;
                return this;
            }

            /**
             * <p>Priority, 1-100</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Enable or disable status of the conditional access policy</p>
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
