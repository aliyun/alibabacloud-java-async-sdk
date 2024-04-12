// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyAssetScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyAssetScopeResponseBody</p>
 */
public class GetPolicyAssetScopeResponseBody extends TeaModel {
    @NameInMap("AssetScope")
    private AssetScope assetScope;

    @NameInMap("RequestId")
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

        /**
         * AssetScope.
         */
        public Builder assetScope(AssetScope assetScope) {
            this.assetScope = assetScope;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicyAssetScopeResponseBody build() {
            return new GetPolicyAssetScopeResponseBody(this);
        } 

    } 

    public static class Databases extends TeaModel {
        @NameInMap("AccountScopeType")
        private String accountScopeType;

        @NameInMap("DatabaseAccountIds")
        private java.util.List < String > databaseAccountIds;

        @NameInMap("DatabaseId")
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
        public java.util.List < String > getDatabaseAccountIds() {
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
            private java.util.List < String > databaseAccountIds; 
            private String databaseId; 

            /**
             * AccountScopeType.
             */
            public Builder accountScopeType(String accountScopeType) {
                this.accountScopeType = accountScopeType;
                return this;
            }

            /**
             * DatabaseAccountIds.
             */
            public Builder databaseAccountIds(java.util.List < String > databaseAccountIds) {
                this.databaseAccountIds = databaseAccountIds;
                return this;
            }

            /**
             * DatabaseId.
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
    public static class HostGroups extends TeaModel {
        @NameInMap("AccountNames")
        private java.util.List < String > accountNames;

        @NameInMap("AccountScopeType")
        private String accountScopeType;

        @NameInMap("HostGroupId")
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
        public java.util.List < String > getAccountNames() {
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
            private java.util.List < String > accountNames; 
            private String accountScopeType; 
            private String hostGroupId; 

            /**
             * AccountNames.
             */
            public Builder accountNames(java.util.List < String > accountNames) {
                this.accountNames = accountNames;
                return this;
            }

            /**
             * AccountScopeType.
             */
            public Builder accountScopeType(String accountScopeType) {
                this.accountScopeType = accountScopeType;
                return this;
            }

            /**
             * HostGroupId.
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
    public static class Hosts extends TeaModel {
        @NameInMap("AccountScopeType")
        private String accountScopeType;

        @NameInMap("HostAccountIds")
        private java.util.List < String > hostAccountIds;

        @NameInMap("HostId")
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
        public java.util.List < String > getHostAccountIds() {
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
            private java.util.List < String > hostAccountIds; 
            private String hostId; 

            /**
             * AccountScopeType.
             */
            public Builder accountScopeType(String accountScopeType) {
                this.accountScopeType = accountScopeType;
                return this;
            }

            /**
             * HostAccountIds.
             */
            public Builder hostAccountIds(java.util.List < String > hostAccountIds) {
                this.hostAccountIds = hostAccountIds;
                return this;
            }

            /**
             * HostId.
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
    public static class AssetScope extends TeaModel {
        @NameInMap("Databases")
        private java.util.List < Databases> databases;

        @NameInMap("HostGroups")
        private java.util.List < HostGroups> hostGroups;

        @NameInMap("Hosts")
        private java.util.List < Hosts> hosts;

        @NameInMap("ScopeType")
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
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return hostGroups
         */
        public java.util.List < HostGroups> getHostGroups() {
            return this.hostGroups;
        }

        /**
         * @return hosts
         */
        public java.util.List < Hosts> getHosts() {
            return this.hosts;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        public static final class Builder {
            private java.util.List < Databases> databases; 
            private java.util.List < HostGroups> hostGroups; 
            private java.util.List < Hosts> hosts; 
            private String scopeType; 

            /**
             * Databases.
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * HostGroups.
             */
            public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
                this.hostGroups = hostGroups;
                return this;
            }

            /**
             * Hosts.
             */
            public Builder hosts(java.util.List < Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * ScopeType.
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
