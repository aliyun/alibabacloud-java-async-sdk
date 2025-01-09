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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UdPullConfiguration.
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

            /**
             * <p>组成员标识</p>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder groupMemberAttributeName(String groupMemberAttributeName) {
                this.groupMemberAttributeName = groupMemberAttributeName;
                return this;
            }

            /**
             * <p>组objectClass</p>
             * 
             * <strong>example:</strong>
             * <p>member</p>
             */
            public Builder groupObjectClass(String groupObjectClass) {
                this.groupObjectClass = groupObjectClass;
                return this;
            }

            /**
             * <p>组自定义Filter</p>
             * 
             * <strong>example:</strong>
             * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
             */
            public Builder groupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
                this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
                return this;
            }

            /**
             * <p>组织objectClass</p>
             * 
             * <strong>example:</strong>
             * <p>ou,top</p>
             */
            public Builder organizationUnitObjectClass(String organizationUnitObjectClass) {
                this.organizationUnitObjectClass = organizationUnitObjectClass;
                return this;
            }

            /**
             * <p>用户objectClass</p>
             * 
             * <strong>example:</strong>
             * <p>ou,top</p>
             */
            public Builder userObjectClass(String userObjectClass) {
                this.userObjectClass = userObjectClass;
                return this;
            }

            /**
             * <p>用户自定义Filter</p>
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

            /**
             * <p>同步保护规则-删除组数量</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder groupDeletedThreshold(Integer groupDeletedThreshold) {
                this.groupDeletedThreshold = groupDeletedThreshold;
                return this;
            }

            /**
             * <p>IDaaS EIAM 钉钉一方应用同步保护规则-删除组织数量</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder organizationalUnitDeletedThreshold(Integer organizationalUnitDeletedThreshold) {
                this.organizationalUnitDeletedThreshold = organizationalUnitDeletedThreshold;
                return this;
            }

            /**
             * <p>IDaaS EIAM 钉钉一方应用同步保护规则-删除账户数量</p>
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

            /**
             * <p>同步来源节点</p>
             */
            public Builder sourceScopes(java.util.List<String> sourceScopes) {
                this.sourceScopes = sourceScopes;
                return this;
            }

            /**
             * <p>同步目标节点</p>
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
            private String periodicSyncStatus; 
            private PullProtectedRule pullProtectedRule; 
            private UdSyncScopeConfig udSyncScopeConfig; 

            /**
             * <p>组同步状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder groupSyncStatus(String groupSyncStatus) {
                this.groupSyncStatus = groupSyncStatus;
                return this;
            }

            /**
             * <p>IDaaS EIAM 身份提供方ID</p>
             * 
             * <strong>example:</strong>
             * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
             */
            public Builder identityProviderId(String identityProviderId) {
                this.identityProviderId = identityProviderId;
                return this;
            }

            /**
             * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder incrementalCallbackStatus(String incrementalCallbackStatus) {
                this.incrementalCallbackStatus = incrementalCallbackStatus;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>ldap同步侧相关配置信息</p>
             */
            public Builder ldapUdPullConfig(LdapUdPullConfig ldapUdPullConfig) {
                this.ldapUdPullConfig = ldapUdPullConfig;
                return this;
            }

            /**
             * PeriodicSyncStatus.
             */
            public Builder periodicSyncStatus(String periodicSyncStatus) {
                this.periodicSyncStatus = periodicSyncStatus;
                return this;
            }

            /**
             * <p>同步入用户映射字段配置列表</p>
             */
            public Builder pullProtectedRule(PullProtectedRule pullProtectedRule) {
                this.pullProtectedRule = pullProtectedRule;
                return this;
            }

            /**
             * <p>同步入配置信息</p>
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
