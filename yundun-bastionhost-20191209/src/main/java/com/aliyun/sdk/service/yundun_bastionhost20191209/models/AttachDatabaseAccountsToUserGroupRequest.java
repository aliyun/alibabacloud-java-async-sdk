// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachDatabaseAccountsToUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AttachDatabaseAccountsToUserGroupRequest</p>
 */
public class AttachDatabaseAccountsToUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List < Databases> databases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private AttachDatabaseAccountsToUserGroupRequest(Builder builder) {
        super(builder);
        this.databases = builder.databases;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDatabaseAccountsToUserGroupRequest create() {
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
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<AttachDatabaseAccountsToUserGroupRequest, Builder> {
        private java.util.List < Databases> databases; 
        private String instanceId; 
        private String regionId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachDatabaseAccountsToUserGroupRequest request) {
            super(request);
            this.databases = request.databases;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>An array that consists of the database objects.</p>
         * <blockquote>
         * <p> You can specify up to 10 databases and 10 database accounts. The database accounts are not required. If you do not specify a database account, the user group is authorized to manage only the databases.</p>
         * </blockquote>
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.putQueryParameter("Databases", databases);
            this.databases = databases;
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
         * <p>bastionhost-cn-zvp282aly06</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public AttachDatabaseAccountsToUserGroupRequest build() {
            return new AttachDatabaseAccountsToUserGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachDatabaseAccountsToUserGroupRequest} extends {@link TeaModel}
     *
     * <p>AttachDatabaseAccountsToUserGroupRequest</p>
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
             * <p>The ID of the database that you want to authorize the user group to manage.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
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
}
