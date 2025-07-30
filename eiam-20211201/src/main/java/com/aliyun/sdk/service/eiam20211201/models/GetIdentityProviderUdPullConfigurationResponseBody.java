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
 * {@link GetIdentityProviderUdPullConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderUdPullConfigurationResponseBody</p>
 */
public class GetIdentityProviderUdPullConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UdPullConfiguration")
    private UdPullConfiguration udPullConfiguration;

    private GetIdentityProviderUdPullConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.udPullConfiguration = builder.udPullConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderUdPullConfigurationResponseBody create() {
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
     * @return udPullConfiguration
     */
    public UdPullConfiguration getUdPullConfiguration() {
        return this.udPullConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private UdPullConfiguration udPullConfiguration; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderUdPullConfigurationResponseBody model) {
            this.requestId = model.requestId;
            this.udPullConfiguration = model.udPullConfiguration;
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

        /**
         * <p>Inbound Synchronization Configuration Information</p>
         */
        public Builder udPullConfiguration(UdPullConfiguration udPullConfiguration) {
            this.udPullConfiguration = udPullConfiguration;
            return this;
        }

        public GetIdentityProviderUdPullConfigurationResponseBody build() {
            return new GetIdentityProviderUdPullConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderUdPullConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPullConfigurationResponseBody</p>
     */
    public static class LdapUdPullConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupMemberAttributeName")
        private String groupMemberAttributeName;

        @com.aliyun.core.annotation.NameInMap("GroupObjectClass")
        private String groupObjectClass;

        @com.aliyun.core.annotation.NameInMap("GroupObjectClassCustomFilter")
        private String groupObjectClassCustomFilter;

        @com.aliyun.core.annotation.NameInMap("OrganizationUnitObjectClass")
        private String organizationUnitObjectClass;

        @com.aliyun.core.annotation.NameInMap("UserObjectClass")
        private String userObjectClass;

        @com.aliyun.core.annotation.NameInMap("UserObjectClassCustomFilter")
        private String userObjectClassCustomFilter;

        private LdapUdPullConfig(Builder builder) {
            this.groupMemberAttributeName = builder.groupMemberAttributeName;
            this.groupObjectClass = builder.groupObjectClass;
            this.groupObjectClassCustomFilter = builder.groupObjectClassCustomFilter;
            this.organizationUnitObjectClass = builder.organizationUnitObjectClass;
            this.userObjectClass = builder.userObjectClass;
            this.userObjectClassCustomFilter = builder.userObjectClassCustomFilter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LdapUdPullConfig create() {
            return builder().build();
        }

        /**
         * @return groupMemberAttributeName
         */
        public String getGroupMemberAttributeName() {
            return this.groupMemberAttributeName;
        }

        /**
         * @return groupObjectClass
         */
        public String getGroupObjectClass() {
            return this.groupObjectClass;
        }

        /**
         * @return groupObjectClassCustomFilter
         */
        public String getGroupObjectClassCustomFilter() {
            return this.groupObjectClassCustomFilter;
        }

        /**
         * @return organizationUnitObjectClass
         */
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        /**
         * @return userObjectClass
         */
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        /**
         * @return userObjectClassCustomFilter
         */
        public String getUserObjectClassCustomFilter() {
            return this.userObjectClassCustomFilter;
        }

        public static final class Builder {
            private String groupMemberAttributeName; 
            private String groupObjectClass; 
            private String groupObjectClassCustomFilter; 
            private String organizationUnitObjectClass; 
            private String userObjectClass; 
            private String userObjectClassCustomFilter; 

            private Builder() {
            } 

            private Builder(LdapUdPullConfig model) {
                this.groupMemberAttributeName = model.groupMemberAttributeName;
                this.groupObjectClass = model.groupObjectClass;
                this.groupObjectClassCustomFilter = model.groupObjectClassCustomFilter;
                this.organizationUnitObjectClass = model.organizationUnitObjectClass;
                this.userObjectClass = model.userObjectClass;
                this.userObjectClassCustomFilter = model.userObjectClassCustomFilter;
            } 

            /**
             * <p>Group Member Identifier</p>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder groupMemberAttributeName(String groupMemberAttributeName) {
                this.groupMemberAttributeName = groupMemberAttributeName;
                return this;
            }

            /**
             * <p>Group ObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>member</p>
             */
            public Builder groupObjectClass(String groupObjectClass) {
                this.groupObjectClass = groupObjectClass;
                return this;
            }

            /**
             * <p>Group Custom Filter</p>
             * 
             * <strong>example:</strong>
             * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
             */
            public Builder groupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
                this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
                return this;
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
             * <p>User ObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>ou,top</p>
             */
            public Builder userObjectClass(String userObjectClass) {
                this.userObjectClass = userObjectClass;
                return this;
            }

            /**
             * <p>User ObjectClass Custom Filter</p>
             * 
             * <strong>example:</strong>
             * <p>(|(cn=test)(mail=<a href="mailto:test@test.com">test@test.com</a>))</p>
             */
            public Builder userObjectClassCustomFilter(String userObjectClassCustomFilter) {
                this.userObjectClassCustomFilter = userObjectClassCustomFilter;
                return this;
            }

            public LdapUdPullConfig build() {
                return new LdapUdPullConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderUdPullConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPullConfigurationResponseBody</p>
     */
    public static class PeriodicSyncConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodicSyncCron")
        private String periodicSyncCron;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncTimes")
        private Integer periodicSyncTimes;

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
        public Integer getPeriodicSyncTimes() {
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
            private Integer periodicSyncTimes; 
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
             * <p>Execution time slots, for example 3,5, meaning the task runs once between 03:00–04:00 and once between 05:00–06:00.</p>
             * 
             * <strong>example:</strong>
             * <p>[3,5]</p>
             */
            public Builder periodicSyncTimes(Integer periodicSyncTimes) {
                this.periodicSyncTimes = periodicSyncTimes;
                return this;
            }

            /**
             * <p>type</p>
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
     * {@link GetIdentityProviderUdPullConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPullConfigurationResponseBody</p>
     */
    public static class PullProtectedRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupDeletedThreshold")
        private Integer groupDeletedThreshold;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitDeletedThreshold")
        private Integer organizationalUnitDeletedThreshold;

        @com.aliyun.core.annotation.NameInMap("UserDeletedThreshold")
        private Integer userDeletedThreshold;

        private PullProtectedRule(Builder builder) {
            this.groupDeletedThreshold = builder.groupDeletedThreshold;
            this.organizationalUnitDeletedThreshold = builder.organizationalUnitDeletedThreshold;
            this.userDeletedThreshold = builder.userDeletedThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PullProtectedRule create() {
            return builder().build();
        }

        /**
         * @return groupDeletedThreshold
         */
        public Integer getGroupDeletedThreshold() {
            return this.groupDeletedThreshold;
        }

        /**
         * @return organizationalUnitDeletedThreshold
         */
        public Integer getOrganizationalUnitDeletedThreshold() {
            return this.organizationalUnitDeletedThreshold;
        }

        /**
         * @return userDeletedThreshold
         */
        public Integer getUserDeletedThreshold() {
            return this.userDeletedThreshold;
        }

        public static final class Builder {
            private Integer groupDeletedThreshold; 
            private Integer organizationalUnitDeletedThreshold; 
            private Integer userDeletedThreshold; 

            private Builder() {
            } 

            private Builder(PullProtectedRule model) {
                this.groupDeletedThreshold = model.groupDeletedThreshold;
                this.organizationalUnitDeletedThreshold = model.organizationalUnitDeletedThreshold;
                this.userDeletedThreshold = model.userDeletedThreshold;
            } 

            /**
             * <p>Group Deletion Threshold: If the number of deleted groups exceeds this value, the synchronization task will be terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder groupDeletedThreshold(Integer groupDeletedThreshold) {
                this.groupDeletedThreshold = groupDeletedThreshold;
                return this;
            }

            /**
             * <p>Organization Deletion Threshold: If the number of deleted organizations exceeds this value, the synchronization task will be terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder organizationalUnitDeletedThreshold(Integer organizationalUnitDeletedThreshold) {
                this.organizationalUnitDeletedThreshold = organizationalUnitDeletedThreshold;
                return this;
            }

            /**
             * <p>Account Deletion Threshold: If the number of deleted users exceeds this value, the synchronization task will be terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder userDeletedThreshold(Integer userDeletedThreshold) {
                this.userDeletedThreshold = userDeletedThreshold;
                return this;
            }

            public PullProtectedRule build() {
                return new PullProtectedRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderUdPullConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPullConfigurationResponseBody</p>
     */
    public static class UdSyncScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceScopes")
        private java.util.List<String> sourceScopes;

        @com.aliyun.core.annotation.NameInMap("TargetScope")
        private String targetScope;

        private UdSyncScopeConfig(Builder builder) {
            this.sourceScopes = builder.sourceScopes;
            this.targetScope = builder.targetScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdSyncScopeConfig create() {
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

            private Builder(UdSyncScopeConfig model) {
                this.sourceScopes = model.sourceScopes;
                this.targetScope = model.targetScope;
            } 

            /**
             * <p>Synchronization Source Node</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>Synchronization Target Node</p>
             * 
             * <strong>example:</strong>
             * <p>ou_asjdfhaskfhw213mnsj33sXXX</p>
             */
            public Builder targetScope(String targetScope) {
                this.targetScope = targetScope;
                return this;
            }

            public UdSyncScopeConfig build() {
                return new UdSyncScopeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderUdPullConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderUdPullConfigurationResponseBody</p>
     */
    public static class UdPullConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupSyncStatus")
        private String groupSyncStatus;

        @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
        private String identityProviderId;

        @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
        private String incrementalCallbackStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LdapUdPullConfig")
        private LdapUdPullConfig ldapUdPullConfig;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncConfig")
        private PeriodicSyncConfig periodicSyncConfig;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncStatus")
        private String periodicSyncStatus;

        @com.aliyun.core.annotation.NameInMap("PullProtectedRule")
        private PullProtectedRule pullProtectedRule;

        @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfig")
        private UdSyncScopeConfig udSyncScopeConfig;

        private UdPullConfiguration(Builder builder) {
            this.groupSyncStatus = builder.groupSyncStatus;
            this.identityProviderId = builder.identityProviderId;
            this.incrementalCallbackStatus = builder.incrementalCallbackStatus;
            this.instanceId = builder.instanceId;
            this.ldapUdPullConfig = builder.ldapUdPullConfig;
            this.periodicSyncConfig = builder.periodicSyncConfig;
            this.periodicSyncStatus = builder.periodicSyncStatus;
            this.pullProtectedRule = builder.pullProtectedRule;
            this.udSyncScopeConfig = builder.udSyncScopeConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdPullConfiguration create() {
            return builder().build();
        }

        /**
         * @return groupSyncStatus
         */
        public String getGroupSyncStatus() {
            return this.groupSyncStatus;
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
         * @return ldapUdPullConfig
         */
        public LdapUdPullConfig getLdapUdPullConfig() {
            return this.ldapUdPullConfig;
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
         * @return pullProtectedRule
         */
        public PullProtectedRule getPullProtectedRule() {
            return this.pullProtectedRule;
        }

        /**
         * @return udSyncScopeConfig
         */
        public UdSyncScopeConfig getUdSyncScopeConfig() {
            return this.udSyncScopeConfig;
        }

        public static final class Builder {
            private String groupSyncStatus; 
            private String identityProviderId; 
            private String incrementalCallbackStatus; 
            private String instanceId; 
            private LdapUdPullConfig ldapUdPullConfig; 
            private PeriodicSyncConfig periodicSyncConfig; 
            private String periodicSyncStatus; 
            private PullProtectedRule pullProtectedRule; 
            private UdSyncScopeConfig udSyncScopeConfig; 

            private Builder() {
            } 

            private Builder(UdPullConfiguration model) {
                this.groupSyncStatus = model.groupSyncStatus;
                this.identityProviderId = model.identityProviderId;
                this.incrementalCallbackStatus = model.incrementalCallbackStatus;
                this.instanceId = model.instanceId;
                this.ldapUdPullConfig = model.ldapUdPullConfig;
                this.periodicSyncConfig = model.periodicSyncConfig;
                this.periodicSyncStatus = model.periodicSyncStatus;
                this.pullProtectedRule = model.pullProtectedRule;
                this.udSyncScopeConfig = model.udSyncScopeConfig;
            } 

            /**
             * <p>Group Synchronization Status
             * Possible values:</p>
             * <p>Disabled: disabled</p>
             * <p>Enabled: enabled</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder groupSyncStatus(String groupSyncStatus) {
                this.groupSyncStatus = groupSyncStatus;
                return this;
            }

            /**
             * <p>Identity provider ID</p>
             * 
             * <strong>example:</strong>
             * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>Incremental Callback Status: Whether to process incremental callback data from the IdP</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>LDAP Synchronization Side Related Configuration Information</p>
             */
            public Builder ldapUdPullConfig(LdapUdPullConfig ldapUdPullConfig) {
                this.ldapUdPullConfig = ldapUdPullConfig;
                return this;
            }

            /**
             * <p>Scheduled sync configuration</p>
             */
            public Builder periodicSyncConfig(PeriodicSyncConfig periodicSyncConfig) {
                this.periodicSyncConfig = periodicSyncConfig;
                return this;
            }

            /**
             * <p>Scheduled Validation Status: Whether to periodically validate data discrepancies between IDaaS and the Identity Provider. Possible values:</p>
             * <p>Disabled: disabled</p>
             * <p>Enabled: enabled</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>Inbound Synchronization Protection Rule Configuration</p>
             */
            public Builder pullProtectedRule(PullProtectedRule pullProtectedRule) {
                this.pullProtectedRule = pullProtectedRule;
                return this;
            }

            /**
             * <p>Synchronization Scope Configuration Information</p>
             */
            public Builder udSyncScopeConfig(UdSyncScopeConfig udSyncScopeConfig) {
                this.udSyncScopeConfig = udSyncScopeConfig;
                return this;
            }

            public UdPullConfiguration build() {
                return new UdPullConfiguration(this);
            } 

        } 

    }
}
