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
 * {@link CreateConditionalAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateConditionalAccessPolicyRequest</p>
 */
public class CreateConditionalAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String conditionalAccessPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConditionalAccessPolicyType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String conditionalAccessPolicyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConditionsConfig")
    private ConditionsConfig conditionsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecisionConfig")
    private DecisionConfig decisionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecisionType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String decisionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluateAt")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String evaluateAt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    private CreateConditionalAccessPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.conditionalAccessPolicyName = builder.conditionalAccessPolicyName;
        this.conditionalAccessPolicyType = builder.conditionalAccessPolicyType;
        this.conditionsConfig = builder.conditionsConfig;
        this.decisionConfig = builder.decisionConfig;
        this.decisionType = builder.decisionType;
        this.description = builder.description;
        this.evaluateAt = builder.evaluateAt;
        this.instanceId = builder.instanceId;
        this.priority = builder.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConditionalAccessPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    public static final class Builder extends Request.Builder<CreateConditionalAccessPolicyRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String conditionalAccessPolicyName; 
        private String conditionalAccessPolicyType; 
        private ConditionsConfig conditionsConfig; 
        private DecisionConfig decisionConfig; 
        private String decisionType; 
        private String description; 
        private String evaluateAt; 
        private String instanceId; 
        private Integer priority; 

        private Builder() {
            super();
        } 

        private Builder(CreateConditionalAccessPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.conditionalAccessPolicyName = request.conditionalAccessPolicyName;
            this.conditionalAccessPolicyType = request.conditionalAccessPolicyType;
            this.conditionsConfig = request.conditionsConfig;
            this.decisionConfig = request.decisionConfig;
            this.decisionType = request.decisionType;
            this.description = request.description;
            this.evaluateAt = request.evaluateAt;
            this.instanceId = request.instanceId;
            this.priority = request.priority;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Conditional access policy name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>My conditional access policy</p>
         */
        public Builder conditionalAccessPolicyName(String conditionalAccessPolicyName) {
            this.putQueryParameter("ConditionalAccessPolicyName", conditionalAccessPolicyName);
            this.conditionalAccessPolicyName = conditionalAccessPolicyName;
            return this;
        }

        /**
         * <p>Conditional access policy type. Valid values:</p>
         * <p>arn:alibaba:idaas:authn:access:policy:system: system policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:policy:system</p>
         */
        public Builder conditionalAccessPolicyType(String conditionalAccessPolicyType) {
            this.putQueryParameter("ConditionalAccessPolicyType", conditionalAccessPolicyType);
            this.conditionalAccessPolicyType = conditionalAccessPolicyType;
            return this;
        }

        /**
         * <p>Conditional access policy condition configuration.</p>
         */
        public Builder conditionsConfig(ConditionsConfig conditionsConfig) {
            this.putQueryParameter("ConditionsConfig", conditionsConfig);
            this.conditionsConfig = conditionsConfig;
            return this;
        }

        /**
         * <p>Conditional access policy action configuration.</p>
         */
        public Builder decisionConfig(DecisionConfig decisionConfig) {
            this.putQueryParameter("DecisionConfig", decisionConfig);
            this.decisionConfig = decisionConfig;
            return this;
        }

        /**
         * <p>Conditional access policy execution type. Valid values:</p>
         * <p>enforcement: enforcement policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enforcement</p>
         */
        public Builder decisionType(String decisionType) {
            this.putQueryParameter("DecisionType", decisionType);
            this.decisionType = decisionType;
            return this;
        }

        /**
         * <p>Conditional access policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Conditional access policy evaluation point. Valid values:</p>
         * <ul>
         * <li>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1: allow.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1</p>
         */
        public Builder evaluateAt(String evaluateAt) {
            this.putQueryParameter("EvaluateAt", evaluateAt);
            this.evaluateAt = evaluateAt;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Conditional access policy priority. A smaller value indicates a higher priority.
         * Minimum value: 1.
         * Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        @Override
        public CreateConditionalAccessPolicyRequest build() {
            return new CreateConditionalAccessPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateConditionalAccessPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateConditionalAccessPolicyRequest</p>
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
             * <p>Excluded applications.</p>
             */
            public Builder excludeApplications(java.util.List<String> excludeApplications) {
                this.excludeApplications = excludeApplications;
                return this;
            }

            /**
             * <p>Included applications.</p>
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
     * {@link CreateConditionalAccessPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateConditionalAccessPolicyRequest</p>
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
             * <p>Excluded network zones.</p>
             */
            public Builder excludeNetworkZones(java.util.List<String> excludeNetworkZones) {
                this.excludeNetworkZones = excludeNetworkZones;
                return this;
            }

            /**
             * <p>Included network zones.</p>
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
     * {@link CreateConditionalAccessPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateConditionalAccessPolicyRequest</p>
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
             * <p>Excluded user groups.</p>
             */
            public Builder excludeGroups(java.util.List<String> excludeGroups) {
                this.excludeGroups = excludeGroups;
                return this;
            }

            /**
             * <p>Excluded organizational units.</p>
             */
            public Builder excludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
                this.excludeOrganizationalUnits = excludeOrganizationalUnits;
                return this;
            }

            /**
             * <p>Excluded users.</p>
             */
            public Builder excludeUsers(java.util.List<String> excludeUsers) {
                this.excludeUsers = excludeUsers;
                return this;
            }

            /**
             * <p>Included user groups.</p>
             */
            public Builder includeGroups(java.util.List<String> includeGroups) {
                this.includeGroups = includeGroups;
                return this;
            }

            /**
             * <p>Included organizational units.</p>
             */
            public Builder includeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
                this.includeOrganizationalUnits = includeOrganizationalUnits;
                return this;
            }

            /**
             * <p>Included users.</p>
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
     * {@link CreateConditionalAccessPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateConditionalAccessPolicyRequest</p>
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
             * <p>Conditional access policy target applications.</p>
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>Conditional access policy network zones.</p>
             */
            public Builder networkZones(NetworkZones networkZones) {
                this.networkZones = networkZones;
                return this;
            }

            /**
             * <p>Conditional access policy target users.</p>
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
     * {@link CreateConditionalAccessPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateConditionalAccessPolicyRequest</p>
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
             * <p>Specifies whether to enable session reuse.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder activeSessionReuseStatus(String activeSessionReuseStatus) {
                this.activeSessionReuseStatus = activeSessionReuseStatus;
                return this;
            }

            /**
             * <p>Conditional access policy decision action. Valid values:</p>
             * <ul>
             * <li>allow: allow.</li>
             * <li>deny: deny.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allow or deny</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>Conditional access policy re-authentication interval (seconds).</p>
             * <ul>
             * <li>Maximum MFA authentication interval: 86400.</li>
             * <li>Minimum MFA authentication interval: 300.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder mfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
                this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
                return this;
            }

            /**
             * <p>MFA types allowed by the conditional access policy. Valid values:</p>
             * <ul>
             * <li>ia_otp_sms: SMS verification code.</li>
             * <li>ia_otp_email: email verification code.</li>
             * <li>ia_totp: OTP dynamic password.</li>
             * <li>ia_webauthn: WebAuthn.</li>
             * </ul>
             */
            public Builder mfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
                this.mfaAuthenticationMethods = mfaAuthenticationMethods;
                return this;
            }

            /**
             * <p>Conditional access policy MFA type. Valid values:</p>
             * <ul>
             * <li>directly_access: direct access.</li>
             * <li>mfa_required: MFA required.</li>
             * </ul>
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
}
