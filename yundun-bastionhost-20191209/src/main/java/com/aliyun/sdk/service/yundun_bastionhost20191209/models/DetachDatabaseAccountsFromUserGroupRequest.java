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
 * {@link DetachDatabaseAccountsFromUserGroupRequest} extends {@link RequestModel}
 *
 * <p>DetachDatabaseAccountsFromUserGroupRequest</p>
 */
public class DetachDatabaseAccountsFromUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<Databases> databases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private DetachDatabaseAccountsFromUserGroupRequest(Builder builder) {
        super(builder);
        this.databases = builder.databases;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDatabaseAccountsFromUserGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databases
     */
    public java.util.List<Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
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

    public static final class Builder extends Request.Builder<DetachDatabaseAccountsFromUserGroupRequest, Builder> {
        private java.util.List<Databases> databases; 
        private String instanceId; 
        private Long projectId; 
        private String regionId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DetachDatabaseAccountsFromUserGroupRequest request) {
            super(request);
            this.databases = request.databases;
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The information about the databases from which you want to remove authorization.</p>
         */
        public Builder databases(java.util.List<Databases> databases) {
            this.putQueryParameter("Databases", databases);
            this.databases = databases;
            return this;
        }

        /**
         * <p>The ID of the bastion host instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-7mz2v120f0y</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
         * <p>The ID of the user group from which you want to remove authorized databases and database accounts.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public DetachDatabaseAccountsFromUserGroupRequest build() {
            return new DetachDatabaseAccountsFromUserGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachDatabaseAccountsFromUserGroupRequest} extends {@link TeaModel}
     *
     * <p>DetachDatabaseAccountsFromUserGroupRequest</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseAccountIds")
        private java.util.List<String> databaseAccountIds;

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
            private java.util.List<String> databaseAccountIds; 
            private String databaseId; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.databaseAccountIds = model.databaseAccountIds;
                this.databaseId = model.databaseId;
            } 

            /**
             * <p>The IDs of the database accounts from which you want to remove authorization.</p>
             */
            public Builder databaseAccountIds(java.util.List<String> databaseAccountIds) {
                this.databaseAccountIds = databaseAccountIds;
                return this;
            }

            /**
             * <p>The instance ID of the database from which you want to remove authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
