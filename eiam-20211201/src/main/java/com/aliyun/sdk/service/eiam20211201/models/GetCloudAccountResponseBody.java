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
 * {@link GetCloudAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAccountResponseBody</p>
 */
public class GetCloudAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccount")
    private CloudAccount cloudAccount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCloudAccountResponseBody(Builder builder) {
        this.cloudAccount = builder.cloudAccount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccount
     */
    public CloudAccount getCloudAccount() {
        return this.cloudAccount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CloudAccount cloudAccount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCloudAccountResponseBody model) {
            this.cloudAccount = model.cloudAccount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cloud account details.</p>
         */
        public Builder cloudAccount(CloudAccount cloudAccount) {
            this.cloudAccount = cloudAccount;
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

        public GetCloudAccountResponseBody build() {
            return new GetCloudAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountResponseBody</p>
     */
    public static class ErrorReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private ErrorReason(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorReason create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(ErrorReason model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>AuthenticationFail.NoPermission</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>There is no permission.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public ErrorReason build() {
                return new ErrorReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCloudAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountResponseBody</p>
     */
    public static class CloudAccountHealthCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorReason")
        private ErrorReason errorReason;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private Long lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private CloudAccountHealthCheckResult(Builder builder) {
            this.errorReason = builder.errorReason;
            this.lastCheckTime = builder.lastCheckTime;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountHealthCheckResult create() {
            return builder().build();
        }

        /**
         * @return errorReason
         */
        public ErrorReason getErrorReason() {
            return this.errorReason;
        }

        /**
         * @return lastCheckTime
         */
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private ErrorReason errorReason; 
            private Long lastCheckTime; 
            private String result; 

            private Builder() {
            } 

            private Builder(CloudAccountHealthCheckResult model) {
                this.errorReason = model.errorReason;
                this.lastCheckTime = model.lastCheckTime;
                this.result = model.result;
            } 

            /**
             * <p>The error reason. This field returns a value when the health check status is unhealthy.</p>
             */
            public Builder errorReason(ErrorReason errorReason) {
                this.errorReason = errorReason;
                return this;
            }

            /**
             * <p>The time of the last health check. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder lastCheckTime(Long lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>The health check result of the cloud account. Valid values:</p>
             * <ul>
             * <li>success: Succeeded.</li>
             * <li>failed: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public CloudAccountHealthCheckResult build() {
                return new CloudAccountHealthCheckResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCloudAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountResponseBody</p>
     */
    public static class CloudAccountProviderConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audience")
        private String audience;

        @com.aliyun.core.annotation.NameInMap("AuthorizationServerId")
        private String authorizationServerId;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("OidcJwksEndpoint")
        private String oidcJwksEndpoint;

        private CloudAccountProviderConfig(Builder builder) {
            this.audience = builder.audience;
            this.authorizationServerId = builder.authorizationServerId;
            this.issuer = builder.issuer;
            this.oidcJwksEndpoint = builder.oidcJwksEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountProviderConfig create() {
            return builder().build();
        }

        /**
         * @return audience
         */
        public String getAudience() {
            return this.audience;
        }

        /**
         * @return authorizationServerId
         */
        public String getAuthorizationServerId() {
            return this.authorizationServerId;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return oidcJwksEndpoint
         */
        public String getOidcJwksEndpoint() {
            return this.oidcJwksEndpoint;
        }

        public static final class Builder {
            private String audience; 
            private String authorizationServerId; 
            private String issuer; 
            private String oidcJwksEndpoint; 

            private Builder() {
            } 

            private Builder(CloudAccountProviderConfig model) {
                this.audience = model.audience;
                this.authorizationServerId = model.authorizationServerId;
                this.issuer = model.issuer;
                this.oidcJwksEndpoint = model.oidcJwksEndpoint;
            } 

            /**
             * <p>The audience identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:cloud:idaas:sts:xxx:xxx</p>
             */
            public Builder audience(String audience) {
                this.audience = audience;
                return this;
            }

            /**
             * <p>The authorization server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iauths_system</p>
             */
            public Builder authorizationServerId(String authorizationServerId) {
                this.authorizationServerId = authorizationServerId;
                return this;
            }

            /**
             * <p>Issuer。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2">https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The signature verification public key endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/jwks">https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/jwks</a></p>
             */
            public Builder oidcJwksEndpoint(String oidcJwksEndpoint) {
                this.oidcJwksEndpoint = oidcJwksEndpoint;
                return this;
            }

            public CloudAccountProviderConfig build() {
                return new CloudAccountProviderConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCloudAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountResponseBody</p>
     */
    public static class PrivilegeHostingError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private PrivilegeHostingError(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivilegeHostingError create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(PrivilegeHostingError model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * <p>The failure error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Error</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The failure message.</p>
             * 
             * <strong>example:</strong>
             * <p>test message</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public PrivilegeHostingError build() {
                return new PrivilegeHostingError(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCloudAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountResponseBody</p>
     */
    public static class CloudAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudAccountExternalId")
        private String cloudAccountExternalId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountHealth")
        private String cloudAccountHealth;

        @com.aliyun.core.annotation.NameInMap("CloudAccountHealthCheckResult")
        private CloudAccountHealthCheckResult cloudAccountHealthCheckResult;

        @com.aliyun.core.annotation.NameInMap("CloudAccountId")
        private String cloudAccountId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountName")
        private String cloudAccountName;

        @com.aliyun.core.annotation.NameInMap("CloudAccountProviderConfig")
        private CloudAccountProviderConfig cloudAccountProviderConfig;

        @com.aliyun.core.annotation.NameInMap("CloudAccountProviderName")
        private String cloudAccountProviderName;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleCreationType")
        private String cloudAccountRoleCreationType;

        @com.aliyun.core.annotation.NameInMap("CloudAccountSite")
        private String cloudAccountSite;

        @com.aliyun.core.annotation.NameInMap("CloudAccountVendorType")
        private String cloudAccountVendorType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PrivilegeApplicationIds")
        private java.util.List<String> privilegeApplicationIds;

        @com.aliyun.core.annotation.NameInMap("PrivilegeHostingError")
        private PrivilegeHostingError privilegeHostingError;

        @com.aliyun.core.annotation.NameInMap("PrivilegeHostingState")
        private String privilegeHostingState;

        @com.aliyun.core.annotation.NameInMap("PrivilegeStatus")
        private String privilegeStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private CloudAccount(Builder builder) {
            this.cloudAccountExternalId = builder.cloudAccountExternalId;
            this.cloudAccountHealth = builder.cloudAccountHealth;
            this.cloudAccountHealthCheckResult = builder.cloudAccountHealthCheckResult;
            this.cloudAccountId = builder.cloudAccountId;
            this.cloudAccountName = builder.cloudAccountName;
            this.cloudAccountProviderConfig = builder.cloudAccountProviderConfig;
            this.cloudAccountProviderName = builder.cloudAccountProviderName;
            this.cloudAccountRoleCreationType = builder.cloudAccountRoleCreationType;
            this.cloudAccountSite = builder.cloudAccountSite;
            this.cloudAccountVendorType = builder.cloudAccountVendorType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.privilegeApplicationIds = builder.privilegeApplicationIds;
            this.privilegeHostingError = builder.privilegeHostingError;
            this.privilegeHostingState = builder.privilegeHostingState;
            this.privilegeStatus = builder.privilegeStatus;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccount create() {
            return builder().build();
        }

        /**
         * @return cloudAccountExternalId
         */
        public String getCloudAccountExternalId() {
            return this.cloudAccountExternalId;
        }

        /**
         * @return cloudAccountHealth
         */
        public String getCloudAccountHealth() {
            return this.cloudAccountHealth;
        }

        /**
         * @return cloudAccountHealthCheckResult
         */
        public CloudAccountHealthCheckResult getCloudAccountHealthCheckResult() {
            return this.cloudAccountHealthCheckResult;
        }

        /**
         * @return cloudAccountId
         */
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        /**
         * @return cloudAccountName
         */
        public String getCloudAccountName() {
            return this.cloudAccountName;
        }

        /**
         * @return cloudAccountProviderConfig
         */
        public CloudAccountProviderConfig getCloudAccountProviderConfig() {
            return this.cloudAccountProviderConfig;
        }

        /**
         * @return cloudAccountProviderName
         */
        public String getCloudAccountProviderName() {
            return this.cloudAccountProviderName;
        }

        /**
         * @return cloudAccountRoleCreationType
         */
        public String getCloudAccountRoleCreationType() {
            return this.cloudAccountRoleCreationType;
        }

        /**
         * @return cloudAccountSite
         */
        public String getCloudAccountSite() {
            return this.cloudAccountSite;
        }

        /**
         * @return cloudAccountVendorType
         */
        public String getCloudAccountVendorType() {
            return this.cloudAccountVendorType;
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
         * @return privilegeApplicationIds
         */
        public java.util.List<String> getPrivilegeApplicationIds() {
            return this.privilegeApplicationIds;
        }

        /**
         * @return privilegeHostingError
         */
        public PrivilegeHostingError getPrivilegeHostingError() {
            return this.privilegeHostingError;
        }

        /**
         * @return privilegeHostingState
         */
        public String getPrivilegeHostingState() {
            return this.privilegeHostingState;
        }

        /**
         * @return privilegeStatus
         */
        public String getPrivilegeStatus() {
            return this.privilegeStatus;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String cloudAccountExternalId; 
            private String cloudAccountHealth; 
            private CloudAccountHealthCheckResult cloudAccountHealthCheckResult; 
            private String cloudAccountId; 
            private String cloudAccountName; 
            private CloudAccountProviderConfig cloudAccountProviderConfig; 
            private String cloudAccountProviderName; 
            private String cloudAccountRoleCreationType; 
            private String cloudAccountSite; 
            private String cloudAccountVendorType; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private java.util.List<String> privilegeApplicationIds; 
            private PrivilegeHostingError privilegeHostingError; 
            private String privilegeHostingState; 
            private String privilegeStatus; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(CloudAccount model) {
                this.cloudAccountExternalId = model.cloudAccountExternalId;
                this.cloudAccountHealth = model.cloudAccountHealth;
                this.cloudAccountHealthCheckResult = model.cloudAccountHealthCheckResult;
                this.cloudAccountId = model.cloudAccountId;
                this.cloudAccountName = model.cloudAccountName;
                this.cloudAccountProviderConfig = model.cloudAccountProviderConfig;
                this.cloudAccountProviderName = model.cloudAccountProviderName;
                this.cloudAccountRoleCreationType = model.cloudAccountRoleCreationType;
                this.cloudAccountSite = model.cloudAccountSite;
                this.cloudAccountVendorType = model.cloudAccountVendorType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.privilegeApplicationIds = model.privilegeApplicationIds;
                this.privilegeHostingError = model.privilegeHostingError;
                this.privilegeHostingState = model.privilegeHostingState;
                this.privilegeStatus = model.privilegeStatus;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The external unique identifier of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder cloudAccountExternalId(String cloudAccountExternalId) {
                this.cloudAccountExternalId = cloudAccountExternalId;
                return this;
            }

            /**
             * <p>The health status of the cloud account. Valid values:</p>
             * <ul>
             * <li>healthy: Healthy.</li>
             * <li>unhealthy: Unhealthy.</li>
             * <li>unknown: Unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder cloudAccountHealth(String cloudAccountHealth) {
                this.cloudAccountHealth = cloudAccountHealth;
                return this;
            }

            /**
             * <p>The health check result of the cloud account.</p>
             */
            public Builder cloudAccountHealthCheckResult(CloudAccountHealthCheckResult cloudAccountHealthCheckResult) {
                this.cloudAccountHealthCheckResult = cloudAccountHealthCheckResult;
                return this;
            }

            /**
             * <p>The cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca_01kmegjc11qa1txxxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>The cloud account name.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_accout_xxxx</p>
             */
            public Builder cloudAccountName(String cloudAccountName) {
                this.cloudAccountName = cloudAccountName;
                return this;
            }

            /**
             * <p>The identity provider configuration information.</p>
             */
            public Builder cloudAccountProviderConfig(CloudAccountProviderConfig cloudAccountProviderConfig) {
                this.cloudAccountProviderConfig = cloudAccountProviderConfig;
                return this;
            }

            /**
             * <p>The identity provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas-eiam-oidc-provider</p>
             */
            public Builder cloudAccountProviderName(String cloudAccountProviderName) {
                this.cloudAccountProviderName = cloudAccountProviderName;
                return this;
            }

            /**
             * <p>The cloud account role creation type.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder cloudAccountRoleCreationType(String cloudAccountRoleCreationType) {
                this.cloudAccountRoleCreationType = cloudAccountRoleCreationType;
                return this;
            }

            /**
             * <p>The cloud account site. Valid values:</p>
             * <ul>
             * <li>china_mainland: The Chinese mainland.</li>
             * <li>global: Global.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>china_mainland</p>
             */
            public Builder cloudAccountSite(String cloudAccountSite) {
                this.cloudAccountSite = cloudAccountSite;
                return this;
            }

            /**
             * <p>The cloud account type. Valid values:</p>
             * <ul>
             * <li>alibaba_cloud: Alibaba Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder cloudAccountVendorType(String cloudAccountVendorType) {
                this.cloudAccountVendorType = cloudAccountVendorType;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830225000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cloud account description.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_accout_description</p>
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
             * <p>The list of associated privilege application IDs.</p>
             */
            public Builder privilegeApplicationIds(java.util.List<String> privilegeApplicationIds) {
                this.privilegeApplicationIds = privilegeApplicationIds;
                return this;
            }

            /**
             * <p>The reason for the privilege hosting or removal failure.</p>
             */
            public Builder privilegeHostingError(PrivilegeHostingError privilegeHostingError) {
                this.privilegeHostingError = privilegeHostingError;
                return this;
            }

            /**
             * <p>The hosting state of the cloud account. The default value is hosting_unmanaged. Valid values:</p>
             * <ul>
             * <li>hosting_unmanaged: Unmanaged. The cloud account has not initiated hosting and is in the initial state.</li>
             * <li>hosting_pending: Hosting in progress. The hosting task has been submitted and is being executed asynchronously. Wait for the hosting process to complete before the final state is reached.</li>
             * <li>hosting_completed: Hosting completed. The cloud account hosting process was executed successfully. The related permission templates and hosting bindings have taken effect.</li>
             * <li>hosting_failed: Hosting failed. The hosting process encountered an exception. View the failure reason and re-initiate hosting.</li>
             * <li>hosting_removing: Removal in progress. The removal task has been submitted and is being executed asynchronously. Wait for the removal process to complete before the final state is reached.</li>
             * <li>hosting_remove_failed: Removal failed. The removal process encountered an exception. View the failure reason and re-initiate removal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hosting_unmanaged</p>
             */
            public Builder privilegeHostingState(String privilegeHostingState) {
                this.privilegeHostingState = privilegeHostingState;
                return this;
            }

            /**
             * <p>The privilege switch status. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled. The resource is active and can be used normally.</li>
             * <li>disabled: Disabled. The resource is deactivated and no longer takes effect. You can re-enable it to restore functionality.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder privilegeStatus(String privilegeStatus) {
                this.privilegeStatus = privilegeStatus;
                return this;
            }

            /**
             * <p>The last update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830227000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CloudAccount build() {
                return new CloudAccount(this);
            } 

        } 

    }
}
