// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link AlterTableSchemaRequest} extends {@link RequestModel}
 *
 * <p>AlterTableSchemaRequest</p>
 */
public class AlterTableSchemaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schema")
    private Schema schema;

    private AlterTableSchemaRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.table = builder.table;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterTableSchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    public static final class Builder extends Request.Builder<AlterTableSchemaRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String table; 
        private Schema schema; 

        private Builder() {
            super();
        } 

        private Builder(AlterTableSchemaRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.table = request.table;
            this.schema = request.schema;
        } 

        /**
         * <p>The ID of the data catalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-xxx</p>
         */
        public Builder catalogId(String catalogId) {
            this.putPathParameter("catalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>database_name</p>
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        public Builder table(String table) {
            this.putPathParameter("table", table);
            this.table = table;
            return this;
        }

        /**
         * <p>The table schema.</p>
         */
        public Builder schema(Schema schema) {
            this.putBodyParameter("schema", schema);
            this.schema = schema;
            return this;
        }

        @Override
        public AlterTableSchemaRequest build() {
            return new AlterTableSchemaRequest(this);
        } 

    } 

}
