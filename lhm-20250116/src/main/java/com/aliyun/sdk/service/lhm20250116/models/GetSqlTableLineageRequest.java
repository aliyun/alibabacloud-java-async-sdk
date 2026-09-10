// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetSqlTableLineageRequest} extends {@link RequestModel}
 *
 * <p>GetSqlTableLineageRequest</p>
 */
public class GetSqlTableLineageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultSchema")
    private String defaultSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialect")
    private String dialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceSqlScriptBase64")
    private String sourceSqlScriptBase64;

    private GetSqlTableLineageRequest(Builder builder) {
        super(builder);
        this.defaultSchema = builder.defaultSchema;
        this.dialect = builder.dialect;
        this.sourceSqlScriptBase64 = builder.sourceSqlScriptBase64;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlTableLineageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultSchema
     */
    public String getDefaultSchema() {
        return this.defaultSchema;
    }

    /**
     * @return dialect
     */
    public String getDialect() {
        return this.dialect;
    }

    /**
     * @return sourceSqlScriptBase64
     */
    public String getSourceSqlScriptBase64() {
        return this.sourceSqlScriptBase64;
    }

    public static final class Builder extends Request.Builder<GetSqlTableLineageRequest, Builder> {
        private String defaultSchema; 
        private String dialect; 
        private String sourceSqlScriptBase64; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlTableLineageRequest request) {
            super(request);
            this.defaultSchema = request.defaultSchema;
            this.dialect = request.dialect;
            this.sourceSqlScriptBase64 = request.sourceSqlScriptBase64;
        } 

        /**
         * <p>The default schema (database) name, which is used to complete table references in the SQL script that do not explicitly specify a database name.</p>
         * 
         * <strong>example:</strong>
         * <p>db_demo</p>
         */
        public Builder defaultSchema(String defaultSchema) {
            this.putBodyParameter("defaultSchema", defaultSchema);
            this.defaultSchema = defaultSchema;
            return this;
        }

        /**
         * <p>The SQL dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder dialect(String dialect) {
            this.putBodyParameter("dialect", dialect);
            this.dialect = dialect;
            return this;
        }

        /**
         * <p>The source script content, Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>U0VMRUNUICogRlJPTSB0Ow==</p>
         */
        public Builder sourceSqlScriptBase64(String sourceSqlScriptBase64) {
            this.putBodyParameter("sourceSqlScriptBase64", sourceSqlScriptBase64);
            this.sourceSqlScriptBase64 = sourceSqlScriptBase64;
            return this;
        }

        @Override
        public GetSqlTableLineageRequest build() {
            return new GetSqlTableLineageRequest(this);
        } 

    } 

}
