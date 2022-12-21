// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeUserPermissionRequest</p>
 */
public class RevokeUserPermissionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DbId")
    private String dbId;

    @Query
    @NameInMap("DsType")
    @Validation(required = true)
    private String dsType;

    @Query
    @NameInMap("InstanceId")
    private Long instanceId;

    @Query
    @NameInMap("Logic")
    private Boolean logic;

    @Query
    @NameInMap("PermTypes")
    @Validation(required = true)
    private String permTypes;

    @Query
    @NameInMap("TableId")
    private String tableId;

    @Query
    @NameInMap("TableName")
    private String tableName;

    @Query
    @NameInMap("Tid")
    private Long tid;

    @Query
    @NameInMap("UserAccessId")
    @Validation(required = true)
    private String userAccessId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private RevokeUserPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.dsType = builder.dsType;
        this.instanceId = builder.instanceId;
        this.logic = builder.logic;
        this.permTypes = builder.permTypes;
        this.tableId = builder.tableId;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
        this.userAccessId = builder.userAccessId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeUserPermissionRequest create() {
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
     * @return userAccessId
     */
    public String getUserAccessId() {
        return this.userAccessId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RevokeUserPermissionRequest, Builder> {
        private String regionId; 
        private String dbId; 
        private String dsType; 
        private Long instanceId; 
        private Boolean logic; 
        private String permTypes; 
        private String tableId; 
        private String tableName; 
        private Long tid; 
        private String userAccessId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeUserPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.dsType = request.dsType;
            this.instanceId = request.instanceId;
            this.logic = request.logic;
            this.permTypes = request.permTypes;
            this.tableId = request.tableId;
            this.tableName = request.tableName;
            this.tid = request.tid;
            this.userAccessId = request.userAccessId;
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
         * The ID of the database. The database can be a physical database or a logical database.
         * <p>
         * 
         * *   To query the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
         * *   To query the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * The object type on which the permission you want to revoke from the user. Valid values:
         * <p>
         * 
         * *   **INSTANCE**: database instances
         * *   **DATABASE**: physical databases
         * *   **LOGIC_DATABASE**: logical databases
         * *   **TABLE**: physical tables
         * *   **LOGIC_TABLE**: logical tables
         */
        public Builder dsType(String dsType) {
            this.putQueryParameter("DsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * The ID of the database instance. You must specify this parameter when you revoke a permission from the database instance. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to query the database instance ID.
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether the database is a logical database. Valid values:
         * <p>
         * 
         * *   **true**: The database is a logical database.
         * *   **false**: The database is a physical database.
         * 
         * > 
         * *   If the database is a logical database, set this parameter to **true**.
         * *   If the database is a physical database, set this parameter to **false**.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * The type of the permission. Valid values:
         * <p>
         * 
         * *   **QUERY**: the data query permission
         * *   **EXPORT**: the data export permission
         * *   **CORRECT**: the data change permission
         */
        public Builder permTypes(String permTypes) {
            this.putQueryParameter("PermTypes", permTypes);
            this.permTypes = permTypes;
            return this;
        }

        /**
         * The ID of the table. You must specify this parameter when you revoke a permission from the table. You can call the [ListTables](~~141878~~) operation to query the table ID.
         */
        public Builder tableId(String tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * The name of the table. You can call the [ListTables](~~141878~~) operation to query the table name.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The ID of the permission. You can call the [ListUserPermission](~~146957~~) operation to query the permission ID.
         */
        public Builder userAccessId(String userAccessId) {
            this.putQueryParameter("UserAccessId", userAccessId);
            this.userAccessId = userAccessId;
            return this;
        }

        /**
         * The ID of the user. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to query the user ID.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RevokeUserPermissionRequest build() {
            return new RevokeUserPermissionRequest(this);
        } 

    } 

}
