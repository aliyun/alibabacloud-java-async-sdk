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
 * {@link GetIdentityProviderUdPushConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderUdPushConfigurationResponseBody</p>
 */
public class GetIdentityProviderUdPushConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UdPushConfiguration")
    private UdPushConfiguration udPushConfiguration;

    private GetIdentityProviderUdPushConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.udPushConfiguration = builder.udPushConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderUdPushConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return udPushConfiguration
     */
    public UdPushConfiguration getUdPushConfiguration() {
        return this.udPushConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private UdPushConfiguration udPushConfiguration; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderUdPushConfigurationResponseBody model) {
            this.requestId = model.requestId;
            this.udPushConfiguration = model.udPushConfiguration;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Outbound synchronization configuration</p>
         */
        public Builder udPushConfiguration(UdPushConfiguration udPushConfiguration) {
            this.udPushConfiguration = udPushConfiguration;
            return this;
        }

        public GetIdentityProviderUdPushConfigurationResponseBody build() {
            return new GetIdentityProviderUdPushConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderUdPushConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPushConfigurationResponseBody</p>
     */
    public static class LdapUdPushConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrganizationUnitObjectClass")
        private String organizationUnitObjectClass;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitRdn")
        private String organizationalUnitRdn;

        @com.aliyun.core.annotation.NameInMap("PasswordSyncStatus")
        private String passwordSyncStatus;

        @com.aliyun.core.annotation.NameInMap("UserObjectClass")
        private String userObjectClass;

        @com.aliyun.core.annotation.NameInMap("UserRdn")
        private String userRdn;

        private LdapUdPushConfig(Builder builder) {
            this.organizationUnitObjectClass = builder.organizationUnitObjectClass;
            this.organizationalUnitRdn = builder.organizationalUnitRdn;
            this.passwordSyncStatus = builder.passwordSyncStatus;
            this.userObjectClass = builder.userObjectClass;
            this.userRdn = builder.userRdn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LdapUdPushConfig create() {
            return builder().build();
        }

        /**
         * @return organizationUnitObjectClass
         */
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        /**
         * @return organizationalUnitRdn
         */
        public String getOrganizationalUnitRdn() {
            return this.organizationalUnitRdn;
        }

        /**
         * @return passwordSyncStatus
         */
        public String getPasswordSyncStatus() {
            return this.passwordSyncStatus;
        }

        /**
         * @return userObjectClass
         */
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        /**
         * @return userRdn
         */
        public String getUserRdn() {
            return this.userRdn;
        }

        public static final class Builder {
            private String organizationUnitObjectClass; 
            private String organizationalUnitRdn; 
            private String passwordSyncStatus; 
            private String userObjectClass; 
            private String userRdn; 

            private Builder() {
            } 

            private Builder(LdapUdPushConfig model) {
                this.organizationUnitObjectClass = model.organizationUnitObjectClass;
                this.organizationalUnitRdn = model.organizationalUnitRdn;
                this.passwordSyncStatus = model.passwordSyncStatus;
                this.userObjectClass = model.userObjectClass;
                this.userRdn = model.userRdn;
            } 

            /**
             * <p>Organization ObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>ou,top</p>
             */
            public Builder organizationUnitObjectClass(String organizationUnitObjectClass) {
                this.organizationUnitObjectClass = organizationUnitObjectClass;
                return this;
            }

            /**
             * <p>Organization RDN</p>
             * 
             * <strong>example:</strong>
             * <p>ou</p>
             */
            public Builder organizationalUnitRdn(String organizationalUnitRdn) {
                this.organizationalUnitRdn = organizationalUnitRdn;
                return this;
            }

            /**
             * <p>Password synchronization status</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder passwordSyncStatus(String passwordSyncStatus) {
                this.passwordSyncStatus = passwordSyncStatus;
                return this;
            }

            /**
             * <p>User ObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>user,top</p>
             */
            public Builder userObjectClass(String userObjectClass) {
                this.userObjectClass = userObjectClass;
                return this;
            }

            /**
             * <p>User RDN</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder userRdn(String userRdn) {
                this.userRdn = userRdn;
                return this;
            }

            public LdapUdPushConfig build() {
                return new LdapUdPushConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderUdPushConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPushConfigurationResponseBody</p>
     */
    public static class PeriodicSyncConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodicSyncCron")
        private String periodicSyncCron;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncTimes")
        private java.util.List<String> periodicSyncTimes;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncType")
        private String periodicSyncType;

        private PeriodicSyncConfig(Builder builder) {
            this.periodicSyncCron = builder.periodicSyncCron;
            this.periodicSyncTimes = builder.periodicSyncTimes;
            this.periodicSyncType = builder.periodicSyncType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodicSyncConfig create() {
            return builder().build();
        }

        /**
         * @return periodicSyncCron
         */
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        /**
         * @return periodicSyncTimes
         */
        public java.util.List<String> getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        /**
         * @return periodicSyncType
         */
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

        public static final class Builder {
            private String periodicSyncCron; 
            private java.util.List<String> periodicSyncTimes; 
            private String periodicSyncType; 

            private Builder() {
            } 

            private Builder(PeriodicSyncConfig model) {
                this.periodicSyncCron = model.periodicSyncCron;
                this.periodicSyncTimes = model.periodicSyncTimes;
                this.periodicSyncType = model.periodicSyncType;
            } 

            /**
             * <p>Cron expression</p>
             * 
             * <strong>example:</strong>
             * <p>0 45 1 * * ?</p>
             */
            public Builder periodicSyncCron(String periodicSyncCron) {
                this.periodicSyncCron = periodicSyncCron;
                return this;
            }

            /**
             * <p>Collection of time points</p>
             */
            public Builder periodicSyncTimes(java.util.List<String> periodicSyncTimes) {
                this.periodicSyncTimes = periodicSyncTimes;
                return this;
            }

            /**
             * <p>Type</p>
             * 
             * <strong>example:</strong>
             * <p>cron</p>
             */
            public Builder periodicSyncType(String periodicSyncType) {
                this.periodicSyncType = periodicSyncType;
                return this;
            }

            public PeriodicSyncConfig build() {
                return new PeriodicSyncConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderUdPushConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPushConfigurationResponseBody</p>
     */
    public static class UdSyncScopeConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceScopes")
        private java.util.List<String> sourceScopes;

        @com.aliyun.core.annotation.NameInMap("TargetScope")
        private String targetScope;

        private UdSyncScopeConfigs(Builder builder) {
            this.sourceScopes = builder.sourceScopes;
            this.targetScope = builder.targetScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdSyncScopeConfigs create() {
            return builder().build();
        }

        /**
         * @return sourceScopes
         */
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        public static final class Builder {
            private java.util.List<String> sourceScopes; 
            private String targetScope; 

            private Builder() {
            } 

            private Builder(UdSyncScopeConfigs model) {
                this.sourceScopes = model.sourceScopes;
                this.targetScope = model.targetScope;
            } 

            /**
             * <p>Source nodes for synchronization</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>Target node for synchronization</p>
             * 
             * <strong>example:</strong>
             * <p>604352338</p>
             */
            public Builder targetScope(String targetScope) {
                this.targetScope = targetScope;
                return this;
            }

            public UdSyncScopeConfigs build() {
                return new UdSyncScopeConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderUdPushConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPushConfigurationResponseBody</p>
     */
    public static class UdPushConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
        private String incrementalCallbackStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LdapUdPushConfig")
        private LdapUdPushConfig ldapUdPushConfig;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncConfig")
        private PeriodicSyncConfig periodicSyncConfig;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncStatus")
        private String periodicSyncStatus;

        @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfigs")
        private java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs;

        private UdPushConfiguration(Builder builder) {
            this.identityProviderId = builder.identityProviderId;
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.instanceId = builder.instanceId;
            this.ldapUdPushConfig = builder.ldapUdPushConfig;
            this.periodicSyncConfig = builder.periodicSyncConfig;
            this.periodicSyncStatus = builder.periodicSyncStatus;
            this.udSyncScopeConfigs = builder.udSyncScopeConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdPushConfiguration create() {
            return builder().build();
        }

        /**
         * @return identityProviderId
         */
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        /**
         * @return incrementalCallbackStatus
         */
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ldapUdPushConfig
         */
        public LdapUdPushConfig getLdapUdPushConfig() {
            return this.ldapUdPushConfig;
        }

        /**
         * @return periodicSyncConfig
         */
        public PeriodicSyncConfig getPeriodicSyncConfig() {
            return this.periodicSyncConfig;
        }

        /**
         * @return periodicSyncStatus
         */
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
        }

        /**
         * @return udSyncScopeConfigs
         */
        public java.util.List<UdSyncScopeConfigs> getUdSyncScopeConfigs() {
            return this.udSyncScopeConfigs;
        }

        public static final class Builder {
            private String identityProviderId; 
            private String incrementalCallbackStatus; 
            private String instanceId; 
            private LdapUdPushConfig ldapUdPushConfig; 
            private PeriodicSyncConfig periodicSyncConfig; 
            private String periodicSyncStatus; 
            private java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs; 

            private Builder() {
            } 

            private Builder(UdPushConfiguration model) {
                this.identityProviderId = model.identityProviderId;
                this.incrementalCallbackStatus = model.incrementalCallbackStatus;
                this.instanceId = model.instanceId;
                this.ldapUdPushConfig = model.ldapUdPushConfig;
                this.periodicSyncConfig = model.periodicSyncConfig;
                this.periodicSyncStatus = model.periodicSyncStatus;
                this.udSyncScopeConfigs = model.udSyncScopeConfigs;
            } 

            /**
             * <p>Identity provider ID</p>
             * 
             * <strong>example:</strong>
             * <p>idp_na2rzpyc67zr7ixdfy35zgrxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>Incremental callback status. Indicates whether incremental callback data from the IdP is processed.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_7vdv3olzk36gymwtlaq6fixxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>LDAP synchronization-side configuration</p>
             */
            public Builder ldapUdPushConfig(LdapUdPushConfig ldapUdPushConfig) {
                this.ldapUdPushConfig = ldapUdPushConfig;
                return this;
            }

            /**
             * <p>Periodic verification configuration</p>
             */
            public Builder periodicSyncConfig(PeriodicSyncConfig periodicSyncConfig) {
                this.periodicSyncConfig = periodicSyncConfig;
                return this;
            }

            /**
             * <p>Periodic verification status</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>Outbound synchronization configuration details</p>
             */
            public Builder udSyncScopeConfigs(java.util.List<UdSyncScopeConfigs> udSyncScopeConfigs) {
                this.udSyncScopeConfigs = udSyncScopeConfigs;
                return this;
            }

            public UdPushConfiguration build() {
                return new UdPushConfiguration(this);
            } 

        } 

    }
}
