// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetPolicyAssetScopeRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyAssetScopeRequest</p>
 */
public class SetPolicyAssetScopeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List < Databases> databases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostGroups")
    private java.util.List < HostGroups> hostGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hosts")
    private java.util.List < Hosts> hosts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The databases to which the control policy applies.</p>
         * <blockquote>
         * <p> This parameter is required if ScopeType is set to Database. You can specify up to 500 databases.</p>
         * </blockquote>
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.putQueryParameter("Databases", databases);
            this.databases = databases;
            return this;
        }

        /**
         * <p>The asset groups to which the control policy applies.</p>
         * <blockquote>
         * <p>This parameter is required if ScopeType is set to HostGroup. You can specify up to 100 asset groups.</p>
         * </blockquote>
         */
        public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
            this.putQueryParameter("HostGroups", hostGroups);
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * <p>The hosts to which the control policy applies.</p>
         * <blockquote>
         * <p>This parameter is required if ScopeType is set to Host. You can specify up to 500 hosts.</p>
         * </blockquote>
         */
        public Builder hosts(java.util.List < Hosts> hosts) {
            this.putQueryParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the control policy that you want to modify.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The scope of assets to which the control policy applies. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: The control policy applies to all assets.</li>
         * <li><strong>Host</strong>: The control policy applies to specified hosts.</li>
         * <li><strong>Database</strong>: The control policy applies to specified databases.</li>
         * <li><strong>HostGroup</strong>: The control policy applies to specified asset groups.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
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

    /**
     * 
     * {@link SetPolicyAssetScopeRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyAssetScopeRequest</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountScopeType")
        private String accountScopeType;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountIds")
        private java.util.List < String > databaseAccountIds;

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
             * <p>The database accounts to which the control policy applies.</p>
             * <blockquote>
             * <p> This parameter is required if AccountScopeType is set to AccountId.</p>
             * </blockquote>
             */
            public Builder databaseAccountIds(java.util.List < String > databaseAccountIds) {
                this.databaseAccountIds = databaseAccountIds;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
     * {@link SetPolicyAssetScopeRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyAssetScopeRequest</p>
     */
    public static class HostGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNames")
        private java.util.List < String > accountNames;

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
             * <p>The asset accounts to which the control policy applies.</p>
             * <blockquote>
             * <p>This parameter is required if AccountScopeType is set to AccountName.</p>
             * </blockquote>
             */
            public Builder accountNames(java.util.List < String > accountNames) {
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
             * <p>86</p>
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
     * {@link SetPolicyAssetScopeRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyAssetScopeRequest</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountScopeType")
        private String accountScopeType;

        @com.aliyun.core.annotation.NameInMap("HostAccountIds")
        private java.util.List < String > hostAccountIds;

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
             * <p>The scope of host accounts to which the control policy applies. Valid values:</p>
             * <ul>
             * <li><strong>All</strong>: The control policy applies to all accounts of the host.</li>
             * <li><strong>AccountId</strong>: The control policy applies specified accounts of the host.</li>
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
             * <blockquote>
             * <p>This parameter is required if AccountScopeType is set to AccountId.</p>
             * </blockquote>
             */
            public Builder hostAccountIds(java.util.List < String > hostAccountIds) {
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
}
