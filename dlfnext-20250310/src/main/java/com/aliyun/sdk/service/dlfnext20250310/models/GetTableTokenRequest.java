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
 * {@link GetTableTokenRequest} extends {@link RequestModel}
 *
 * <p>GetTableTokenRequest</p>
 */
public class GetTableTokenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isInternal")
    private Boolean isInternal;

    private GetTableTokenRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.table = builder.table;
        this.isInternal = builder.isInternal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableTokenRequest create() {
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
     * @return isInternal
     */
    public Boolean getIsInternal() {
        return this.isInternal;
    }

    public static final class Builder extends Request.Builder<GetTableTokenRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String table; 
        private Boolean isInternal; 

        private Builder() {
            super();
        } 

        private Builder(GetTableTokenRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.table = request.table;
            this.isInternal = request.isInternal;
        } 

        /**
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * isInternal.
         */
        public Builder isInternal(Boolean isInternal) {
            this.putQueryParameter("isInternal", isInternal);
            this.isInternal = isInternal;
            return this;
        }

        @Override
        public GetTableTokenRequest build() {
            return new GetTableTokenRequest(this);
        } 

    } 

}
