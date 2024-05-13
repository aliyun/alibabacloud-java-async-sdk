// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>GrantUserPermissionRequest</p>
 */
public class GrantUserPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    private String dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expireDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logic")
    private Boolean logic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableId")
    private String tableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private GrantUserPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.dsType = builder.dsType;
        this.expireDate = builder.expireDate;
        this.instanceId = builder.instanceId;
        this.logic = builder.logic;
        this.permTypes = builder.permTypes;
        this.tableId = builder.tableId;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantUserPermissionRequest create() {
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
     * @return dbId
     */
    public String getDbId() {
        return this.dbId;
    }

    /**
     * @return dsType
     */
    public String getDsType() {
        return this.dsType;
    }

    /**
     * @return expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
    }

    /**
     * @return permTypes
     */
    public String getPermTypes() {
        return this.permTypes;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GrantUserPermissionRequest, Builder> {
        private String regionId; 
        private String dbId; 
        private String dsType; 
        private String expireDate; 
        private Long instanceId; 
        private Boolean logic; 
        private String permTypes; 
        private String tableId; 
        private String tableName; 
        private Long tid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GrantUserPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.dsType = request.dsType;
            this.expireDate = request.expireDate;
            this.instanceId = request.instanceId;
            this.logic = request.logic;
            this.permTypes = request.permTypes;
            this.tableId = request.tableId;
            this.tableName = request.tableName;
            this.tid = request.tid;
            this.userId = request.userId;
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
         * The ID of the database. You can call the [ListDatabases](~~141873~~) operation to query the ID of a physical database and the [ListLogicDatabases](~~141874~~) operation to query the ID of a logical database.
         * <p>
         * 
         * >  The value of the DatabaseId parameter is that of the DbId parameter.
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * The permissions on a specific type of object that you want to grant to the user. Valid values:
         * <p>
         * 
         * *   INSTANCE: permissions on instances
         * *   DATABASE: permissions on physical databases
         * *   LOGIC_DATABASE: permissions on logical databases
         * *   TABLE: permissions on physical tables
         * *   LOGIC_TABLE: permissions on logical tables
         */
        public Builder dsType(String dsType) {
            this.putQueryParameter("DsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * The time when the permissions expire.
         */
        public Builder expireDate(String expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * The ID of the instance. You must specify this parameter if you grant permissions on an instance to the user. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to query the ID of the instance.
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether the database is a logical database. You must specify this parameter if you grant permissions on a database to the user. Valid values:
         * <p>
         * 
         * *   true: The database is a logical database.
         * *   false: The database is a physical database.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * The permission type. Separate multiple permission types with commas (,). Valid values:
         * <p>
         * 
         * *   **QUERY**: the query permissions
         * *   **EXPORT**: the export permissions
         * *   **CORRECT**: the change permissions
         * *   **LOGIN**: the logon permissions
         * *   **PERF**: the query permissions on the performance details of the instance
         */
        public Builder permTypes(String permTypes) {
            this.putQueryParameter("PermTypes", permTypes);
            this.permTypes = permTypes;
            return this;
        }

        /**
         * The ID of the table. You must specify this parameter if you grant permissions on a table to the user. You can call the [ListTables](~~141878~~) operation to query the table ID.
         */
        public Builder tableId(String tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * The name of the table. You must specify this parameter if you grant permissions on a table to the user.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The ID of the user. You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the ID of the user.
         * <p>
         * 
         * >  The user ID is different from the ID of your Alibaba Cloud account.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GrantUserPermissionRequest build() {
            return new GrantUserPermissionRequest(this);
        } 

    } 

}
