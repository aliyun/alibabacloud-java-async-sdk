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
         * <p>The name of the field. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the field.</p>
         * <blockquote>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/141870.html">ListColumns</a> operation to obtain the name of the field.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_column</p>
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the ID of the database.</p>
         * <blockquote>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to obtain the ID of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to obtain the ID of a logical database.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>325</p>
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li>true: The database is a physical database.</li>
         * <li>false: The database is a logical database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isLogic(Boolean isLogic) {
            this.putQueryParameter("IsLogic", isLogic);
            this.isLogic = isLogic;
            return this;
        }

        /**
         * <p>The new sensitivity level of the field that you want to specify. Valid values:</p>
         * <ul>
         * <li>INNER: low sensitivity level</li>
         * <li>SENSITIVE: medium sensitivity level</li>
         * <li>CONFIDENTIAL: high sensitivity level</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SENSITIVE</p>
         */
        public Builder newLevel(String newLevel) {
            this.putQueryParameter("NewLevel", newLevel);
            this.newLevel = newLevel;
            return this;
        }

        /**
         * <p>The name of the database. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the database.</p>
         * <ul>
         * <li>You can also call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the name of the database.</li>
         * <li>You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to obtain the name of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to obtain the name of a logical database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_schema</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the table.</p>
         * <blockquote>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to obtain the name of the table.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>43253</p>
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
