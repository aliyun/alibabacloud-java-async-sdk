// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListIndexesRequest} extends {@link RequestModel}
 *
 * <p>ListIndexesRequest</p>
 */
public class ListIndexesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("catalog")
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("newMode")
    private Boolean newMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    private ListIndexesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.catalog = builder.catalog;
        this.database = builder.database;
        this.newMode = builder.newMode;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return newMode
     */
    public Boolean getNewMode() {
        return this.newMode;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder extends Request.Builder<ListIndexesRequest, Builder> {
        private String instanceId; 
        private String catalog; 
        private String database; 
        private Boolean newMode; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(ListIndexesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.catalog = request.catalog;
            this.database = request.database;
            this.newMode = request.newMode;
            this.table = request.table;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ostoc01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * catalog.
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.putQueryParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>Specifies whether the OpenSearch Vector Search Edition instance is of the new version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder newMode(Boolean newMode) {
            this.putQueryParameter("newMode", newMode);
            this.newMode = newMode;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.putQueryParameter("table", table);
            this.table = table;
            return this;
        }

        @Override
        public ListIndexesRequest build() {
            return new ListIndexesRequest(this);
        } 

    } 

}
