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
 * {@link ListSensitiveColumnsDetailRequest} extends {@link RequestModel}
 *
 * <p>ListSensitiveColumnsDetailRequest</p>
 */
public class ListSensitiveColumnsDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    private Long dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logic")
    private Boolean logic;

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

    private ListSensitiveColumnsDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnName = builder.columnName;
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveColumnsDetailRequest create() {
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
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
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

    public static final class Builder extends Request.Builder<ListSensitiveColumnsDetailRequest, Builder> {
        private String regionId; 
        private String columnName; 
        private Long dbId; 
        private Boolean logic; 
        private String schemaName; 
        private String tableName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListSensitiveColumnsDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnName = request.columnName;
            this.dbId = request.dbId;
            this.logic = request.logic;
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
         * <p> You can also call the <a href="https://help.aliyun.com/document_detail/141870.html">ListColumns</a> operation to obtain the name of the field.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ColumnName_test</p>
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The ID of the database. The database can be a physical database or a logical database.</p>
         * <ul>
         * <li>To obtain the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * <li>To obtain the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1860****</p>
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is a physical database.</li>
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
         * <p>The name of the database. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the database.</p>
         * <blockquote>
         * <ul>
         * <li>You can also call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the name of a physical database.</li>
         * <li>You can also call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the name of a logical database.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SchemaName_test</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the name of the table.</p>
         * <blockquote>
         * <p> You can also call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to obtain the name of the table.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
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
        public ListSensitiveColumnsDetailRequest build() {
            return new ListSensitiveColumnsDetailRequest(this);
        } 

    } 

}
