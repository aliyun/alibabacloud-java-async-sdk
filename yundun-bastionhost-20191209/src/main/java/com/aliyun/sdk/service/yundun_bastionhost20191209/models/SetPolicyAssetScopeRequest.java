// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPolicyAssetScopeRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyAssetScopeRequest</p>
 */
public class SetPolicyAssetScopeRequest extends Request {
    @Query
    @NameInMap("Databases")
    private java.util.List < Databases> databases;

    @Query
    @NameInMap("HostGroups")
    private java.util.List < HostGroups> hostGroups;

    @Query
    @NameInMap("Hosts")
    private java.util.List < Hosts> hosts;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ScopeType")
    @Validation(required = true)
    private String scopeType;

    private SetPolicyAssetScopeRequest(Builder builder) {
        super(builder);
        this.databases = builder.databases;
        this.hostGroups = builder.hostGroups;
        this.hosts = builder.hosts;
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyAssetScopeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<SetPolicyAssetScopeRequest, Builder> {
        private java.util.List < Databases> databases; 
        private java.util.List < HostGroups> hostGroups; 
        private java.util.List < Hosts> hosts; 
        private String instanceId; 
        private String policyId; 
        private String regionId; 
        private String scopeType; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyAssetScopeRequest request) {
            super(request);
            this.databases = request.databases;
            this.hostGroups = request.hostGroups;
            this.hosts = request.hosts;
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
            this.scopeType = request.scopeType;
        } 

        /**
         * Databases.
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.putQueryParameter("Databases", databases);
            this.databases = databases;
            return this;
        }

        /**
         * HostGroups.
         */
        public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
            this.putQueryParameter("HostGroups", hostGroups);
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * Hosts.
         */
        public Builder hosts(java.util.List < Hosts> hosts) {
            this.putQueryParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScopeType.
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public SetPolicyAssetScopeRequest build() {
            return new SetPolicyAssetScopeRequest(this);
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
}
