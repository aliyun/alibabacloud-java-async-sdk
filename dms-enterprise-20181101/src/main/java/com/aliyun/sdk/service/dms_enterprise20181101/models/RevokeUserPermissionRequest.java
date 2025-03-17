// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link RevokeUserPermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeUserPermissionRequest</p>
 */
public class RevokeUserPermissionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserAccessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The database ID. The database can be a physical database or a logical database.</p>
         * <ul>
         * <li>To query the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * <li>To query the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1860****</p>
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>The type of the object on which you want to revoke permissions from a user. Valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong>: instances.</li>
         * <li><strong>DATABASE</strong>: physical databases.</li>
         * <li><strong>LOGIC_DATABASE</strong>: logical databases.</li>
         * <li><strong>TABLE</strong>: physical tables.</li>
         * <li><strong>LOGIC_TABLE</strong>: logical tables.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        public Builder dsType(String dsType) {
            this.putQueryParameter("DsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * <p>The database instance ID. You must specify this parameter if you revoke a permission from the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>174****</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is a physical database.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the database is a logical database, set this parameter to <strong>true</strong>.</p>
         * </li>
         * <li><p>If the database is a physical database, set this parameter to <strong>false</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * <p>The type of the permissions. Valid values:</p>
         * <ul>
         * <li><strong>QUERY</strong>: query permissions.</li>
         * <li><strong>EXPORT</strong>: export permissions.</li>
         * <li><strong>CORRECT</strong>: change permissions.</li>
         * <li><strong>LOGIN</strong>: logon permissions.</li>
         * <li><strong>PERF</strong>: query permissions on the performance details of an instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CORRECT</p>
         */
        public Builder permTypes(String permTypes) {
            this.putQueryParameter("PermTypes", permTypes);
            this.permTypes = permTypes;
            return this;
        }

        /**
         * <p>The table ID. You must specify this parameter if you revoke a permission from the table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13****</p>
         */
        public Builder tableId(String tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The permission ID. You can call the <a href="https://help.aliyun.com/document_detail/146957.html">ListUserPermission</a> operation to query the permission ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>774****</p>
         */
        public Builder userAccessId(String userAccessId) {
            this.putQueryParameter("UserAccessId", userAccessId);
            this.userAccessId = userAccessId;
            return this;
        }

        /**
         * <p>The user ID. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation to query the ID of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
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
