// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeColumnSecLevelRequest} extends {@link RequestModel}
 *
 * <p>ChangeColumnSecLevelRequest</p>
 */
public class ChangeColumnSecLevelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsLogic")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isLogic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ChangeColumnSecLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnName = builder.columnName;
        this.dbId = builder.dbId;
        this.isLogic = builder.isLogic;
        this.newLevel = builder.newLevel;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeColumnSecLevelRequest create() {
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
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
    }

    /**
     * @return isLogic
     */
    public Boolean getIsLogic() {
        return this.isLogic;
    }

    /**
     * @return newLevel
     */
    public String getNewLevel() {
        return this.newLevel;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
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

    public static final class Builder extends Request.Builder<ChangeColumnSecLevelRequest, Builder> {
        private String regionId; 
        private String columnName; 
        private Long dbId; 
        private Boolean isLogic; 
        private String newLevel; 
        private String schemaName; 
        private String tableName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ChangeColumnSecLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnName = request.columnName;
            this.dbId = request.dbId;
            this.isLogic = request.isLogic;
            this.newLevel = request.newLevel;
            this.schemaName = request.schemaName;
            this.tableName = request.tableName;
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
         * The name of the field. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the name of the field.
         * <p>
         * 
         * > You can also call the [ListColumns](~~141870~~) operation to obtain the name of the field.
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * The ID of the database. You can call the [SearchDatabase](~~141876~~) operation to obtain the ID of the database.
         * <p>
         * 
         * > You can also call the [ListDatabases](~~141873~~) operation to obtain the ID of a physical database and the [ListLogicDatabases](~~141874~~) operation to obtain the ID of a logical database.
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * Specifies whether the database is a logical database. Valid values:
         * <p>
         * 
         * *   true: The database is a physical database.
         * *   false: The database is a logical database.
         */
        public Builder isLogic(Boolean isLogic) {
            this.putQueryParameter("IsLogic", isLogic);
            this.isLogic = isLogic;
            return this;
        }

        /**
         * The new sensitivity level of the field that you want to specify. Valid values:
         * <p>
         * 
         * *   INNER: low sensitivity level
         * *   SENSITIVE: medium sensitivity level
         * *   CONFIDENTIAL: high sensitivity level
         */
        public Builder newLevel(String newLevel) {
            this.putQueryParameter("NewLevel", newLevel);
            this.newLevel = newLevel;
            return this;
        }

        /**
         * The name of the database. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the name of the database.
         * <p>
         * 
         * *   You can also call the [SearchDatabase](~~141876~~) operation to obtain the name of the database.
         * *   You can also call the [ListDatabases](~~141873~~) operation to obtain the name of a physical database and the [ListLogicDatabases](~~141874~~) operation to obtain the name of a logical database.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * The name of the table. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the name of the table.
         * <p>
         * 
         * > You can also call the [ListTables](~~141878~~) operation to obtain the name of the table.
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
         * > To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ChangeColumnSecLevelRequest build() {
            return new ChangeColumnSecLevelRequest(this);
        } 

    } 

}
