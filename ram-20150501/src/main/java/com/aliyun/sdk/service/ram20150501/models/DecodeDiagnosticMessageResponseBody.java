// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecodeDiagnosticMessageResponseBody} extends {@link TeaModel}
 *
 * <p>DecodeDiagnosticMessageResponseBody</p>
 */
public class DecodeDiagnosticMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DecodedDiagnosticMessage")
    private DecodedDiagnosticMessage decodedDiagnosticMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DecodeDiagnosticMessageResponseBody(Builder builder) {
        this.decodedDiagnosticMessage = builder.decodedDiagnosticMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecodeDiagnosticMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return decodedDiagnosticMessage
     */
    public DecodedDiagnosticMessage getDecodedDiagnosticMessage() {
        return this.decodedDiagnosticMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DecodedDiagnosticMessage decodedDiagnosticMessage; 
        private String requestId; 

        /**
         * The decoded diagnostic information.
         */
        public Builder decodedDiagnosticMessage(DecodedDiagnosticMessage decodedDiagnosticMessage) {
            this.decodedDiagnosticMessage = decodedDiagnosticMessage;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DecodeDiagnosticMessageResponseBody build() {
            return new DecodeDiagnosticMessageResponseBody(this);
        } 

    } 

    public static class AuthConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
        private java.util.List < String > conditionValues;

        private AuthConditions(Builder builder) {
            this.conditionKey = builder.conditionKey;
            this.conditionValues = builder.conditionValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConditions create() {
            return builder().build();
        }

        /**
         * @return conditionKey
         */
        public String getConditionKey() {
            return this.conditionKey;
        }

        /**
         * @return conditionValues
         */
        public java.util.List < String > getConditionValues() {
            return this.conditionValues;
        }

        public static final class Builder {
            private String conditionKey; 
            private java.util.List < String > conditionValues; 

            /**
             * The key of the condition.
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * The values that correspond to the key.
             */
            public Builder conditionValues(java.util.List < String > conditionValues) {
                this.conditionValues = conditionValues;
                return this;
            }

            public AuthConditions build() {
                return new AuthConditions(this);
            } 

        } 

    }
    public static class AuthPrincipal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        private AuthPrincipal(Builder builder) {
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthPrincipal create() {
            return builder().build();
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public static final class Builder {
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 

            /**
             * The identity.
             * <p>
             * 
             * *   If the operator is a RAM user, the ID of the user is displayed.
             * *   If the operator is a RAM role, the name and session name of the role are displayed. Example: RoleName:RoleSessionName.
             * *   If the operator is an SSO federated identity, the type and name of the identity provider (IdP) are displayed. Example: saml-provider/AzureAD.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the identity belongs.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * The identity type that is used for authentication in the request.
             * <p>
             * 
             * Valid values:
             * 
             * *   SubUser: RAM user
             * *   AssumedRoleUser: RAM role
             * *   Federated: SSO federated identity
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            public AuthPrincipal build() {
                return new AuthPrincipal(this);
            } 

        } 

    }
    public static class MatchedPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedEntityType")
        private String attachedEntityType;

        @com.aliyun.core.annotation.NameInMap("AttachedScope")
        private String attachedScope;

        @com.aliyun.core.annotation.NameInMap("Effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
        private String policyIdentifier;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("PolicyVersion")
        private String policyVersion;

        private MatchedPolicies(Builder builder) {
            this.attachedEntityType = builder.attachedEntityType;
            this.attachedScope = builder.attachedScope;
            this.effect = builder.effect;
            this.policyIdentifier = builder.policyIdentifier;
            this.policyType = builder.policyType;
            this.policyVersion = builder.policyVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchedPolicies create() {
            return builder().build();
        }

        /**
         * @return attachedEntityType
         */
        public String getAttachedEntityType() {
            return this.attachedEntityType;
        }

        /**
         * @return attachedScope
         */
        public String getAttachedScope() {
            return this.attachedScope;
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return policyIdentifier
         */
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return policyVersion
         */
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public static final class Builder {
            private String attachedEntityType; 
            private String attachedScope; 
            private String effect; 
            private String policyIdentifier; 
            private String policyType; 
            private String policyVersion; 

            /**
             * The type of the entity to which the policy is attached.
             * <p>
             * 
             * Valid values:
             * 
             * *   RamUser: RAM user
             * *   RamRole: RAM role
             * *   ResourceDirectoryTarget: entity in a resource directory
             * *   RamGroup: RAM user group
             */
            public Builder attachedEntityType(String attachedEntityType) {
                this.attachedEntityType = attachedEntityType;
                return this;
            }

            /**
             * The authorization scope of the policy.
             * <p>
             * 
             * Valid values:
             * 
             * *   Account: Alibaba Cloud account
             * *   Folder: folder in the resource directory
             * *   ResourceGroup: resource group
             */
            public Builder attachedScope(String attachedScope) {
                this.attachedScope = attachedScope;
                return this;
            }

            /**
             * The effect of the policy.
             * <p>
             * 
             * Valid values:
             * 
             * *   Deny
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Allow
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * The identifier of the policy.
             * <p>
             * 
             * *   Control policy: the ID of the control policy
             * *   RAM policy: the name of the policy
             */
            public Builder policyIdentifier(String policyIdentifier) {
                this.policyIdentifier = policyIdentifier;
                return this;
            }

            /**
             * The type of the policy.
             * <p>
             * 
             * Valid values:
             * *   Custom: custom policy
             * *   System: system policy
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The version number of the policy.
             * <p>
             * 
             * > Only custom policies have version numbers.
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            public MatchedPolicies build() {
                return new MatchedPolicies(this);
            } 

        } 

    }
    public static class DecodedDiagnosticMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthConditions")
        private java.util.List < AuthConditions> authConditions;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipal")
        private AuthPrincipal authPrincipal;

        @com.aliyun.core.annotation.NameInMap("AuthResource")
        private String authResource;

        @com.aliyun.core.annotation.NameInMap("ExplicitDeny")
        private Boolean explicitDeny;

        @com.aliyun.core.annotation.NameInMap("MatchedPolicies")
        private java.util.List < MatchedPolicies> matchedPolicies;

        @com.aliyun.core.annotation.NameInMap("NoPermissionPolicyType")
        private String noPermissionPolicyType;

        private DecodedDiagnosticMessage(Builder builder) {
            this.authAction = builder.authAction;
            this.authConditions = builder.authConditions;
            this.authPrincipal = builder.authPrincipal;
            this.authResource = builder.authResource;
            this.explicitDeny = builder.explicitDeny;
            this.matchedPolicies = builder.matchedPolicies;
            this.noPermissionPolicyType = builder.noPermissionPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DecodedDiagnosticMessage create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authConditions
         */
        public java.util.List < AuthConditions> getAuthConditions() {
            return this.authConditions;
        }

        /**
         * @return authPrincipal
         */
        public AuthPrincipal getAuthPrincipal() {
            return this.authPrincipal;
        }

        /**
         * @return authResource
         */
        public String getAuthResource() {
            return this.authResource;
        }

        /**
         * @return explicitDeny
         */
        public Boolean getExplicitDeny() {
            return this.explicitDeny;
        }

        /**
         * @return matchedPolicies
         */
        public java.util.List < MatchedPolicies> getMatchedPolicies() {
            return this.matchedPolicies;
        }

        /**
         * @return noPermissionPolicyType
         */
        public String getNoPermissionPolicyType() {
            return this.noPermissionPolicyType;
        }

        public static final class Builder {
            private String authAction; 
            private java.util.List < AuthConditions> authConditions; 
            private AuthPrincipal authPrincipal; 
            private String authResource; 
            private Boolean explicitDeny; 
            private java.util.List < MatchedPolicies> matchedPolicies; 
            private String noPermissionPolicyType; 

            /**
             * The operation that is used for authentication in the request.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * The conditions that are used for authentication in the request.
             */
            public Builder authConditions(java.util.List < AuthConditions> authConditions) {
                this.authConditions = authConditions;
                return this;
            }

            /**
             * The operator that is used for authentication in the request.
             */
            public Builder authPrincipal(AuthPrincipal authPrincipal) {
                this.authPrincipal = authPrincipal;
                return this;
            }

            /**
             * The resource that is used for authentication in the request.
             */
            public Builder authResource(String authResource) {
                this.authResource = authResource;
                return this;
            }

            /**
             * Indicates whether the access denied error is caused by an explicit deny.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder explicitDeny(Boolean explicitDeny) {
                this.explicitDeny = explicitDeny;
                return this;
            }

            /**
             * The policies that are matched.
             */
            public Builder matchedPolicies(java.util.List < MatchedPolicies> matchedPolicies) {
                this.matchedPolicies = matchedPolicies;
                return this;
            }

            /**
             * The type of the policy that causes the access denied error.
             * <p>
             * 
             * Valid values:
             * 
             * *   AssumeRolePolicy: role-specific trust policy
             * *   ControlPolicy: control policy
             * *   AccountLevelIdentityBasedPolicy: identity-based policy at the account level
             * *   ResourceGroupLevelIdentityBasedPolicy: identity-based policy at the resource group level
             * *   SessionPolicy: session policy
             */
            public Builder noPermissionPolicyType(String noPermissionPolicyType) {
                this.noPermissionPolicyType = noPermissionPolicyType;
                return this;
            }

            public DecodedDiagnosticMessage build() {
                return new DecodedDiagnosticMessage(this);
            } 

        } 

    }
}
