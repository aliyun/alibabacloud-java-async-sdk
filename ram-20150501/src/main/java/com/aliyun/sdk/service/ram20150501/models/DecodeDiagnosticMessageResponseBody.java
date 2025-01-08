// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
         * <p>The decoded diagnostic information.</p>
         */
        public Builder decodedDiagnosticMessage(DecodedDiagnosticMessage decodedDiagnosticMessage) {
            this.decodedDiagnosticMessage = decodedDiagnosticMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D2331703-AADF-5564-BA9B-26CD51A33BA0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DecodeDiagnosticMessageResponseBody build() {
            return new DecodeDiagnosticMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DecodeDiagnosticMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DecodeDiagnosticMessageResponseBody</p>
     */
    public static class AuthConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
        private java.util.List<String> conditionValues;

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
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

        public static final class Builder {
            private String conditionKey; 
            private java.util.List<String> conditionValues; 

            /**
             * <p>The key of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:SourceIp</p>
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * <p>The values that correspond to the key.</p>
             */
            public Builder conditionValues(java.util.List<String> conditionValues) {
                this.conditionValues = conditionValues;
                return this;
            }

            public AuthConditions build() {
                return new AuthConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DecodeDiagnosticMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DecodeDiagnosticMessageResponseBody</p>
     */
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
             * <p>The identity.</p>
             * <ul>
             * <li>If the operator is a RAM user, the ID of the user is displayed.</li>
             * <li>If the operator is a RAM role, the name and session name of the role are displayed. Example: RoleName:RoleSessionName.</li>
             * <li>If the operator is an SSO federated identity, the type and name of the identity provider (IdP) are displayed. Example: saml-provider/AzureAD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>28877424437521****</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the identity belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>196813200012****</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The identity type that is used for authentication in the request.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SubUser: RAM user</li>
             * <li>AssumedRoleUser: RAM role</li>
             * <li>Federated: SSO federated identity</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SubUser</p>
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
    /**
     * 
     * {@link DecodeDiagnosticMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DecodeDiagnosticMessageResponseBody</p>
     */
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
             * <p>The type of the entity to which the policy is attached.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RamUser: RAM user</li>
             * <li>RamRole: RAM role</li>
             * <li>ResourceDirectoryTarget: entity in a resource directory</li>
             * <li>RamGroup: RAM user group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
             */
            public Builder attachedEntityType(String attachedEntityType) {
                this.attachedEntityType = attachedEntityType;
                return this;
            }

            /**
             * <p>The authorization scope of the policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Account: Alibaba Cloud account</li>
             * <li>Folder: folder in the resource directory</li>
             * <li>ResourceGroup: resource group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Account</p>
             */
            public Builder attachedScope(String attachedScope) {
                this.attachedScope = attachedScope;
                return this;
            }

            /**
             * <p>The effect of the policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Deny</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Allow</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deny</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>The identifier of the policy.</p>
             * <ul>
             * <li>Control policy: the ID of the control policy</li>
             * <li>RAM policy: the name of the policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MyPolicyName</p>
             */
            public Builder policyIdentifier(String policyIdentifier) {
                this.policyIdentifier = policyIdentifier;
                return this;
            }

            /**
             * <p>The type of the policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Custom: custom policy</li>
             * <li>System: system policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The version number of the policy.</p>
             * <blockquote>
             * <p>Only custom policies have version numbers.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
    /**
     * 
     * {@link DecodeDiagnosticMessageResponseBody} extends {@link TeaModel}
     *
     * <p>DecodeDiagnosticMessageResponseBody</p>
     */
    public static class DecodedDiagnosticMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthConditions")
        private java.util.List<AuthConditions> authConditions;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipal")
        private AuthPrincipal authPrincipal;

        @com.aliyun.core.annotation.NameInMap("AuthResource")
        private String authResource;

        @com.aliyun.core.annotation.NameInMap("ExplicitDeny")
        private Boolean explicitDeny;

        @com.aliyun.core.annotation.NameInMap("MatchedPolicies")
        private java.util.List<MatchedPolicies> matchedPolicies;

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
        public java.util.List<AuthConditions> getAuthConditions() {
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
        public java.util.List<MatchedPolicies> getMatchedPolicies() {
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
            private java.util.List<AuthConditions> authConditions; 
            private AuthPrincipal authPrincipal; 
            private String authResource; 
            private Boolean explicitDeny; 
            private java.util.List<MatchedPolicies> matchedPolicies; 
            private String noPermissionPolicyType; 

            /**
             * <p>The operation that is used for authentication in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>ram:DecodeDiagnosticMessage</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The conditions that are used for authentication in the request.</p>
             */
            public Builder authConditions(java.util.List<AuthConditions> authConditions) {
                this.authConditions = authConditions;
                return this;
            }

            /**
             * <p>The operator that is used for authentication in the request.</p>
             */
            public Builder authPrincipal(AuthPrincipal authPrincipal) {
                this.authPrincipal = authPrincipal;
                return this;
            }

            /**
             * <p>The resource that is used for authentication in the request.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder authResource(String authResource) {
                this.authResource = authResource;
                return this;
            }

            /**
             * <p>Indicates whether the access denied error is caused by an explicit deny.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>false</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder explicitDeny(Boolean explicitDeny) {
                this.explicitDeny = explicitDeny;
                return this;
            }

            /**
             * <p>The policies that are matched.</p>
             */
            public Builder matchedPolicies(java.util.List<MatchedPolicies> matchedPolicies) {
                this.matchedPolicies = matchedPolicies;
                return this;
            }

            /**
             * <p>The type of the policy that causes the access denied error.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AssumeRolePolicy: role-specific trust policy</li>
             * <li>ControlPolicy: control policy</li>
             * <li>AccountLevelIdentityBasedPolicy: identity-based policy at the account level</li>
             * <li>ResourceGroupLevelIdentityBasedPolicy: identity-based policy at the resource group level</li>
             * <li>SessionPolicy: session policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AccountLevelIdentityBasedPolicy</p>
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
