// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List < Databases> databases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveEndTime")
    private Long effectiveEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveStartTime")
    private Long effectiveStartTime;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List < String > userGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List < String > userIds;

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.databases = builder.databases;
        this.effectiveEndTime = builder.effectiveEndTime;
        this.effectiveStartTime = builder.effectiveStartTime;
        this.hostGroups = builder.hostGroups;
        this.hosts = builder.hosts;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.ruleName = builder.ruleName;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return databases
     */
    public java.util.List < Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return effectiveEndTime
     */
    public Long getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    /**
     * @return effectiveStartTime
     */
    public Long getEffectiveStartTime() {
        return this.effectiveStartTime;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List < String > getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userIds
     */
    public java.util.List < String > getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private String comment; 
        private java.util.List < Databases> databases; 
        private Long effectiveEndTime; 
        private Long effectiveStartTime; 
        private java.util.List < HostGroups> hostGroups; 
        private java.util.List < Hosts> hosts; 
        private String instanceId; 
        private String regionId; 
        private String ruleName; 
        private java.util.List < String > userGroupIds; 
        private java.util.List < String > userIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleRequest request) {
            super(request);
            this.comment = request.comment;
            this.databases = request.databases;
            this.effectiveEndTime = request.effectiveEndTime;
            this.effectiveStartTime = request.effectiveStartTime;
            this.hostGroups = request.hostGroups;
            this.hosts = request.hosts;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.ruleName = request.ruleName;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
        } 

        /**
         * <p>The remarks of the authorization rule. The remarks can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The information about the database that runs on your server.</p>
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.putQueryParameter("Databases", databases);
            this.databases = databases;
            return this;
        }

        /**
         * <p>The end time of the validity period of the authorization rule. Specify a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1672502400</p>
         */
        public Builder effectiveEndTime(Long effectiveEndTime) {
            this.putQueryParameter("EffectiveEndTime", effectiveEndTime);
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }

        /**
         * <p>The start time of the validity period of the authorization rule. Specify a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1669630029</p>
         */
        public Builder effectiveStartTime(Long effectiveStartTime) {
            this.putQueryParameter("EffectiveStartTime", effectiveStartTime);
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }

        /**
         * <p>The information about the asset group that you want to authorize to manage.</p>
         */
        public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
            this.putQueryParameter("HostGroups", hostGroups);
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * <p>The host information.</p>
         */
        public Builder hosts(java.util.List < Hosts> hosts) {
            this.putQueryParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-5yd2ymfsa0e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The name of the authorization rule. The name can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>An array that consists of user group IDs.</p>
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>An array that consists of user IDs.</p>
         */
        public Builder userIds(java.util.List < String > userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseAccountIds")
        private java.util.List < String > databaseAccountIds;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        private Databases(Builder builder) {
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
            private java.util.List < String > databaseAccountIds; 
            private String databaseId; 

            /**
             * <p>An array that consists of database account IDs.</p>
             */
            public Builder databaseAccountIds(java.util.List < String > databaseAccountIds) {
                this.databaseAccountIds = databaseAccountIds;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;DatabaseId&quot;: &quot;1&quot;
             *     }
             * ]</p>
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
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class HostGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountNames")
        private java.util.List < String > hostAccountNames;

        @com.aliyun.core.annotation.NameInMap("HostGroupId")
        private String hostGroupId;

        private HostGroups(Builder builder) {
            this.hostAccountNames = builder.hostAccountNames;
            this.hostGroupId = builder.hostGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroups create() {
            return builder().build();
        }

        /**
         * @return hostAccountNames
         */
        public java.util.List < String > getHostAccountNames() {
            return this.hostAccountNames;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public static final class Builder {
            private java.util.List < String > hostAccountNames; 
            private String hostGroupId; 

            /**
             * <p>An array that consists of asset account names.</p>
             */
            public Builder hostAccountNames(java.util.List < String > hostAccountNames) {
                this.hostAccountNames = hostAccountNames;
                return this;
            }

            /**
             * <p>The asset group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;HostGroupId&quot;:&quot;1&quot;}]</p>
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
     * {@link CreateRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateRuleRequest</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostAccountIds")
        private java.util.List < String > hostAccountIds;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        private Hosts(Builder builder) {
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
            private java.util.List < String > hostAccountIds; 
            private String hostId; 

            /**
             * <p>An array that consists of host account IDs.</p>
             */
            public Builder hostAccountIds(java.util.List < String > hostAccountIds) {
                this.hostAccountIds = hostAccountIds;
                return this;
            }

            /**
             * <p>The host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;HostId&quot;:&quot;1&quot;}]</p>
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
