// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetPolicyAssetScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyAssetScopeResponseBody</p>
 */
public class GetPolicyAssetScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetScope")
    private AssetScope assetScope;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPolicyAssetScopeResponseBody(Builder builder) {
        this.assetScope = builder.assetScope;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyAssetScopeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetScope
     */
    public AssetScope getAssetScope() {
        return this.assetScope;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AssetScope assetScope; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPolicyAssetScopeResponseBody model) {
            this.assetScope = model.assetScope;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The assets to which the control policy applies.</p>
         */
        public Builder assetScope(AssetScope assetScope) {
            this.assetScope = assetScope;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicyAssetScopeResponseBody build() {
            return new GetPolicyAssetScopeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyAssetScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyAssetScopeResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountScopeType")
        private String accountScopeType;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountIds")
        private java.util.List<String> databaseAccountIds;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        private Databases(Builder builder) {
            this.accountScopeType = builder.accountScopeType;
            this.databaseAccountIds = builder.databaseAccountIds;
            this.databaseId = builder.databaseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return accountScopeType
         */
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        /**
         * @return databaseAccountIds
         */
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        public static final class Builder {
            private String accountScopeType; 
            private java.util.List<String> databaseAccountIds; 
            private String databaseId; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.accountScopeType = model.accountScopeType;
                this.databaseAccountIds = model.databaseAccountIds;
                this.databaseId = model.databaseId;
            } 

            /**
             * <p>The scope of database accounts to which the control policy applies. Valid values:</p>
             * <ul>
             * <li><strong>All</strong>: The control policy applies to all database accounts of the database.</li>
             * <li><strong>AccountId</strong>: The control policy applies to specified database accounts of the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AccountId</p>
             */
            public Builder accountScopeType(String accountScopeType) {
                this.accountScopeType = accountScopeType;
                return this;
            }

            /**
             * <p>The IDs of database accounts to which the control policy applies.</p>
             */
            public Builder databaseAccountIds(java.util.List<String> databaseAccountIds) {
                this.databaseAccountIds = databaseAccountIds;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyAssetScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyAssetScopeResponseBody</p>
     */
    public static class HostGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNames")
        private java.util.List<String> accountNames;

        @com.aliyun.core.annotation.NameInMap("AccountScopeType")
        private String accountScopeType;

        @com.aliyun.core.annotation.NameInMap("HostGroupId")
        private String hostGroupId;

        private HostGroups(Builder builder) {
            this.accountNames = builder.accountNames;
            this.accountScopeType = builder.accountScopeType;
            this.hostGroupId = builder.hostGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroups create() {
            return builder().build();
        }

        /**
         * @return accountNames
         */
        public java.util.List<String> getAccountNames() {
            return this.accountNames;
        }

        /**
         * @return accountScopeType
         */
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public static final class Builder {
            private java.util.List<String> accountNames; 
            private String accountScopeType; 
            private String hostGroupId; 

            private Builder() {
            } 

            private Builder(HostGroups model) {
                this.accountNames = model.accountNames;
                this.accountScopeType = model.accountScopeType;
                this.hostGroupId = model.hostGroupId;
            } 

            /**
             * <p>The asset accounts to which the control policy applies.</p>
             */
            public Builder accountNames(java.util.List<String> accountNames) {
                this.accountNames = accountNames;
                return this;
            }

            /**
             * <p>The scope of asset accounts to which the control policy applies. Valid values:</p>
             * <ul>
             * <li><strong>All</strong>: The control policy applies to all accounts in the asset group.</li>
             * <li><strong>AccountName</strong>: The control policy applies to specified accounts in the asset group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder accountScopeType(String accountScopeType) {
                this.accountScopeType = accountScopeType;
                return this;
            }

            /**
             * <p>The asset group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            public HostGroups build() {
                return new HostGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyAssetScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyAssetScopeResponseBody</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountScopeType")
        private String accountScopeType;

        @com.aliyun.core.annotation.NameInMap("HostAccountIds")
        private java.util.List<String> hostAccountIds;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        private Hosts(Builder builder) {
            this.accountScopeType = builder.accountScopeType;
            this.hostAccountIds = builder.hostAccountIds;
            this.hostId = builder.hostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hosts create() {
            return builder().build();
        }

        /**
         * @return accountScopeType
         */
        public String getAccountScopeType() {
            return this.accountScopeType;
        }

        /**
         * @return hostAccountIds
         */
        public java.util.List<String> getHostAccountIds() {
            return this.hostAccountIds;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        public static final class Builder {
            private String accountScopeType; 
            private java.util.List<String> hostAccountIds; 
            private String hostId; 

            private Builder() {
            } 

            private Builder(Hosts model) {
                this.accountScopeType = model.accountScopeType;
                this.hostAccountIds = model.hostAccountIds;
                this.hostId = model.hostId;
            } 

            /**
             * <p>The scope of host accounts to which the control policy applies. Valid values:</p>
             * <ul>
             * <li><strong>All</strong>: The control policy applies to all accounts of the host.</li>
             * <li><strong>AccountId</strong>: The control policy applies to specified accounts of the host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder accountScopeType(String accountScopeType) {
                this.accountScopeType = accountScopeType;
                return this;
            }

            /**
             * <p>The host accounts to which the control policy applies.</p>
             */
            public Builder hostAccountIds(java.util.List<String> hostAccountIds) {
                this.hostAccountIds = hostAccountIds;
                return this;
            }

            /**
             * <p>The host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyAssetScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyAssetScopeResponseBody</p>
     */
    public static class AssetScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List<Databases> databases;

        @com.aliyun.core.annotation.NameInMap("HostGroups")
        private java.util.List<HostGroups> hostGroups;

        @com.aliyun.core.annotation.NameInMap("Hosts")
        private java.util.List<Hosts> hosts;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        private AssetScope(Builder builder) {
            this.databases = builder.databases;
            this.hostGroups = builder.hostGroups;
            this.hosts = builder.hosts;
            this.scopeType = builder.scopeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetScope create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List<Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return hostGroups
         */
        public java.util.List<HostGroups> getHostGroups() {
            return this.hostGroups;
        }

        /**
         * @return hosts
         */
        public java.util.List<Hosts> getHosts() {
            return this.hosts;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        public static final class Builder {
            private java.util.List<Databases> databases; 
            private java.util.List<HostGroups> hostGroups; 
            private java.util.List<Hosts> hosts; 
            private String scopeType; 

            private Builder() {
            } 

            private Builder(AssetScope model) {
                this.databases = model.databases;
                this.hostGroups = model.hostGroups;
                this.hosts = model.hosts;
                this.scopeType = model.scopeType;
            } 

            /**
             * <p>The databases and database accounts to which the control policy applies.</p>
             */
            public Builder databases(java.util.List<Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * <p>The asset groups and asset accounts to which the control policy applies.</p>
             */
            public Builder hostGroups(java.util.List<HostGroups> hostGroups) {
                this.hostGroups = hostGroups;
                return this;
            }

            /**
             * <p>The hosts and host accounts to which the control policy applies.</p>
             */
            public Builder hosts(java.util.List<Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * <p>The scope of assets to which the control policy applies.</p>
             * <ul>
             * <li><p>If <strong>All</strong> is returned for this parameter, the control policy applies to all assets.</p>
             * </li>
             * <li><p>If no value is returned for this parameter, the control policy applies to the assets specified in the return values of Databases, HostGroups, and Hosts.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            public AssetScope build() {
                return new AssetScope(this);
            } 

        } 

    }
}
