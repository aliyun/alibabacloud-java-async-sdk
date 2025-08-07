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
 * {@link GetTableSnapshotRequest} extends {@link RequestModel}
 *
 * <p>GetTableSnapshotRequest</p>
 */
public class GetTableSnapshotRequest extends Request {
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

    private GetTableSnapshotRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableSnapshotRequest create() {
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

    public static final class Builder extends Request.Builder<GetTableSnapshotRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(GetTableSnapshotRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.table = request.table;
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
         * database.
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.putPathParameter("table", table);
            this.table = table;
            return this;
        }

        @Override
        public GetTableSnapshotRequest build() {
            return new GetTableSnapshotRequest(this);
        } 

    } 

}
