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
 * {@link SetIdentityProviderUdPullConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetIdentityProviderUdPullConfigurationRequest</p>
 */
public class SetIdentityProviderUdPullConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupSyncStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String groupSyncStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String identityProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncrementalCallbackStatus")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String incrementalCallbackStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LdapUdPullConfig")
    private LdapUdPullConfig ldapUdPullConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodicSyncConfig")
    private PeriodicSyncConfig periodicSyncConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodicSyncStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String periodicSyncStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullProtectedRule")
    private PullProtectedRule pullProtectedRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UdSyncScopeConfig")
    private UdSyncScopeConfig udSyncScopeConfig;

    private SetIdentityProviderUdPullConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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

    public static SetIdentityProviderUdPullConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<SetIdentityProviderUdPullConfigurationRequest, Builder> {
        private String regionId; 
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
            super();
        } 

        private Builder(SetIdentityProviderUdPullConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.groupSyncStatus = request.groupSyncStatus;
            this.identityProviderId = request.identityProviderId;
            this.incrementalCallbackStatus = request.incrementalCallbackStatus;
            this.instanceId = request.instanceId;
            this.ldapUdPullConfig = request.ldapUdPullConfig;
            this.periodicSyncConfig = request.periodicSyncConfig;
            this.periodicSyncStatus = request.periodicSyncStatus;
            this.pullProtectedRule = request.pullProtectedRule;
            this.udSyncScopeConfig = request.udSyncScopeConfig;
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
         * <p>Group synchronization status.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        public Builder groupSyncStatus(String groupSyncStatus) {
            this.putQueryParameter("GroupSyncStatus", groupSyncStatus);
            this.groupSyncStatus = groupSyncStatus;
            return this;
        }

        /**
         * <p>Identity provider ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
         */
        public Builder identityProviderId(String identityProviderId) {
            this.putQueryParameter("IdentityProviderId", identityProviderId);
            this.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * <p>Incremental callback status, whether to process incremental callback data from IdP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
            this.putQueryParameter("IncrementalCallbackStatus", incrementalCallbackStatus);
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>Ldap ud pull config</p>
         */
        public Builder ldapUdPullConfig(LdapUdPullConfig ldapUdPullConfig) {
            this.putQueryParameter("LdapUdPullConfig", ldapUdPullConfig);
            this.ldapUdPullConfig = ldapUdPullConfig;
            return this;
        }

        /**
         * <p>Periodic synchronize config</p>
         */
        public Builder periodicSyncConfig(PeriodicSyncConfig periodicSyncConfig) {
            this.putQueryParameter("PeriodicSyncConfig", periodicSyncConfig);
            this.periodicSyncConfig = periodicSyncConfig;
            return this;
        }

        /**
         * <p>Periodic synchronize status</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        public Builder periodicSyncStatus(String periodicSyncStatus) {
            this.putQueryParameter("PeriodicSyncStatus", periodicSyncStatus);
            this.periodicSyncStatus = periodicSyncStatus;
            return this;
        }

        /**
         * <p>Synchronize protected rule</p>
         */
        public Builder pullProtectedRule(PullProtectedRule pullProtectedRule) {
            this.putQueryParameter("PullProtectedRule", pullProtectedRule);
            this.pullProtectedRule = pullProtectedRule;
            return this;
        }

        /**
         * <p>Synchronize configuration information.</p>
         */
        public Builder udSyncScopeConfig(UdSyncScopeConfig udSyncScopeConfig) {
            this.putQueryParameter("UdSyncScopeConfig", udSyncScopeConfig);
            this.udSyncScopeConfig = udSyncScopeConfig;
            return this;
        }

        @Override
        public SetIdentityProviderUdPullConfigurationRequest build() {
            return new SetIdentityProviderUdPullConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetIdentityProviderUdPullConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderUdPullConfigurationRequest</p>
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
             * <p>Group member attribute name</p>
             * 
             * <strong>example:</strong>
             * <p>memberxxx</p>
             */
            public Builder groupMemberAttributeName(String groupMemberAttributeName) {
                this.groupMemberAttributeName = groupMemberAttributeName;
                return this;
            }

            /**
             * <p>GroupObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>groupxxx</p>
             */
            public Builder groupObjectClass(String groupObjectClass) {
                this.groupObjectClass = groupObjectClass;
                return this;
            }

            /**
             * <p>GroupObjectClass custom filter</p>
             * 
             * <strong>example:</strong>
             * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
             */
            public Builder groupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
                this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
                return this;
            }

            /**
             * <p>OrganizationUnitObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>organizationUnitxxx,top</p>
             */
            public Builder organizationUnitObjectClass(String organizationUnitObjectClass) {
                this.organizationUnitObjectClass = organizationUnitObjectClass;
                return this;
            }

            /**
             * <p>UserObjectClass</p>
             * 
             * <strong>example:</strong>
             * <p>userPrincipalNamexxx, mail</p>
             */
            public Builder userObjectClass(String userObjectClass) {
                this.userObjectClass = userObjectClass;
                return this;
            }

            /**
             * <p>UserObjectClass custom filter</p>
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
     * {@link SetIdentityProviderUdPullConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderUdPullConfigurationRequest</p>
     */
    public static class PeriodicSyncConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodicSyncCron")
        private String periodicSyncCron;

        @com.aliyun.core.annotation.NameInMap("PeriodicSyncTimes")
        private java.util.List<Integer> periodicSyncTimes;

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
        public java.util.List<Integer> getPeriodicSyncTimes() {
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
            private java.util.List<Integer> periodicSyncTimes; 
            private String periodicSyncType; 

            private Builder() {
            } 

            private Builder(PeriodicSyncConfig model) {
                this.periodicSyncCron = model.periodicSyncCron;
                this.periodicSyncTimes = model.periodicSyncTimes;
                this.periodicSyncType = model.periodicSyncType;
            } 

            /**
             * <p>Periodic synchronize cron</p>
             * 
             * <strong>example:</strong>
             * <p>0 45 1 * * ?</p>
             */
            public Builder periodicSyncCron(String periodicSyncCron) {
                this.periodicSyncCron = periodicSyncCron;
                return this;
            }

            /**
             * <p>Periodic synchronize times</p>
             */
            public Builder periodicSyncTimes(java.util.List<Integer> periodicSyncTimes) {
                this.periodicSyncTimes = periodicSyncTimes;
                return this;
            }

            /**
             * <p>Periodic synchronize type</p>
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
     * {@link SetIdentityProviderUdPullConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderUdPullConfigurationRequest</p>
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
             * <p>Group deleted threshold</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder groupDeletedThreshold(Integer groupDeletedThreshold) {
                this.groupDeletedThreshold = groupDeletedThreshold;
                return this;
            }

            /**
             * <p>OrganizationalUnit deleted threshold</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder organizationalUnitDeletedThreshold(Integer organizationalUnitDeletedThreshold) {
                this.organizationalUnitDeletedThreshold = organizationalUnitDeletedThreshold;
                return this;
            }

            /**
             * <p>User deleted threshold</p>
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
     * {@link SetIdentityProviderUdPullConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetIdentityProviderUdPullConfigurationRequest</p>
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
             * <p>Synchronize source scopes</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>Synchronize target scope</p>
             * 
             * <strong>example:</strong>
             * <p>ou_asdaq1addsxzdq1XXX</p>
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
}
