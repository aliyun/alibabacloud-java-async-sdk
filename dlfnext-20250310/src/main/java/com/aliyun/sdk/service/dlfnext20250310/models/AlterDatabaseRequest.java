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
 * {@link AlterDatabaseRequest} extends {@link RequestModel}
 *
 * <p>AlterDatabaseRequest</p>
 */
public class AlterDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("removals")
    private java.util.List<String> removals;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updates")
    private java.util.Map<String, String> updates;

    private AlterDatabaseRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.removals = builder.removals;
        this.updates = builder.updates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterDatabaseRequest create() {
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
     * @return removals
     */
    public java.util.List<String> getRemovals() {
        return this.removals;
    }

    /**
     * @return updates
     */
    public java.util.Map<String, String> getUpdates() {
        return this.updates;
    }

    public static final class Builder extends Request.Builder<AlterDatabaseRequest, Builder> {
        private String catalogId; 
        private String database; 
        private java.util.List<String> removals; 
        private java.util.Map<String, String> updates; 

        private Builder() {
            super();
        } 

        private Builder(AlterDatabaseRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.removals = request.removals;
            this.updates = request.updates;
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
         * removals.
         */
        public Builder removals(java.util.List<String> removals) {
            this.putBodyParameter("removals", removals);
            this.removals = removals;
            return this;
        }

        /**
         * updates.
         */
        public Builder updates(java.util.Map<String, String> updates) {
            this.putBodyParameter("updates", updates);
            this.updates = updates;
            return this;
        }

        @Override
        public AlterDatabaseRequest build() {
            return new AlterDatabaseRequest(this);
        } 

    } 

}
