// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GenerateSqlBySemanticSqlRequest} extends {@link RequestModel}
 *
 * <p>GenerateSqlBySemanticSqlRequest</p>
 */
public class GenerateSqlBySemanticSqlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private GenerateSqlBySemanticSqlRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.schemaName = builder.schemaName;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSqlBySemanticSqlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<GenerateSqlBySemanticSqlRequest, Builder> {
        private String DBClusterId; 
        private String schemaName; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(GenerateSqlBySemanticSqlRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.schemaName = request.schemaName;
            this.sql = request.sql;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select sum(amount) from sv_sales</p>
         */
        public Builder sql(String sql) {
            this.putQueryParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public GenerateSqlBySemanticSqlRequest build() {
            return new GenerateSqlBySemanticSqlRequest(this);
        } 

    } 

}
