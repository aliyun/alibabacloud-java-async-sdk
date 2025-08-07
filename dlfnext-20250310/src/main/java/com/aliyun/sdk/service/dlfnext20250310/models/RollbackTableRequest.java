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
 * {@link RollbackTableRequest} extends {@link RequestModel}
 *
 * <p>RollbackTableRequest</p>
 */
public class RollbackTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instant")
    private FullInstant instant;

    private RollbackTableRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.table = builder.table;
        this.instant = builder.instant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackTableRequest create() {
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
     * @return instant
     */
    public FullInstant getInstant() {
        return this.instant;
    }

    public static final class Builder extends Request.Builder<RollbackTableRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String table; 
        private FullInstant instant; 

        private Builder() {
            super();
        } 

        private Builder(RollbackTableRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.table = request.table;
            this.instant = request.instant;
        } 

        /**
         * catalogId.
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

        /**
         * instant.
         */
        public Builder instant(FullInstant instant) {
            this.putBodyParameter("instant", instant);
            this.instant = instant;
            return this;
        }

        @Override
        public RollbackTableRequest build() {
            return new RollbackTableRequest(this);
        } 

    } 

}
