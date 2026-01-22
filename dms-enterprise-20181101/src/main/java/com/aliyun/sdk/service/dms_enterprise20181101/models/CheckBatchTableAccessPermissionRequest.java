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
 * {@link CheckBatchTableAccessPermissionRequest} extends {@link RequestModel}
 *
 * <p>CheckBatchTableAccessPermissionRequest</p>
 */
public class CheckBatchTableAccessPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logic")
    private Boolean logic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String permissionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tableNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private CheckBatchTableAccessPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.permissionType = builder.permissionType;
        this.tableNameList = builder.tableNameList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBatchTableAccessPermissionRequest create() {
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
    public Long getDbId() {
        return this.dbId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
    }

    /**
     * @return permissionType
     */
    public String getPermissionType() {
        return this.permissionType;
    }

    /**
     * @return tableNameList
     */
    public java.util.List<String> getTableNameList() {
        return this.tableNameList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CheckBatchTableAccessPermissionRequest, Builder> {
        private String regionId; 
        private Long dbId; 
        private Boolean logic; 
        private String permissionType; 
        private java.util.List<String> tableNameList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CheckBatchTableAccessPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.logic = request.logic;
            this.permissionType = request.permissionType;
            this.tableNameList = request.tableNameList;
            this.tid = request.tid;
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
         * <p>The database ID. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the ID of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the ID of a logical database.</p>
         * <blockquote>
         * <p> The value of DatabaseId is that of DbId.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>43153</p>
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li>true: Logical database.</li>
         * <li>false: Physical database.</li>
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
         * <p>The type of the permission to be verified.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>QUERY</li>
         * <li>EXPORT</li>
         * <li>CORRECT</li>
         * <li>LOGIN</li>
         * <li>PERF</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY</p>
         */
        public Builder permissionType(String permissionType) {
            this.putQueryParameter("PermissionType", permissionType);
            this.permissionType = permissionType;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         */
        public Builder tableNameList(java.util.List<String> tableNameList) {
            String tableNameListShrink = shrink(tableNameList, "TableNameList", "json");
            this.putQueryParameter("TableNameList", tableNameListShrink);
            this.tableNameList = tableNameList;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> View Tenant ID by hovering over your profile icon in the DMS console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CheckBatchTableAccessPermissionRequest build() {
            return new CheckBatchTableAccessPermissionRequest(this);
        } 

    } 

}
