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
 * {@link GetDatabaseSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetDatabaseSummaryRequest</p>
 */
public class GetDatabaseSummaryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    private String date;

    private GetDatabaseSummaryRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.date = builder.date;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseSummaryRequest create() {
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
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    public static final class Builder extends Request.Builder<GetDatabaseSummaryRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String date; 

        private Builder() {
            super();
        } 

        private Builder(GetDatabaseSummaryRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.date = request.date;
        } 

        /**
         * <p>The ID of the data catalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-xxxx</p>
         */
        public Builder catalogId(String catalogId) {
            this.putPathParameter("catalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The date of the storage overview.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-26</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
            return this;
        }

        @Override
        public GetDatabaseSummaryRequest build() {
            return new GetDatabaseSummaryRequest(this);
        } 

    } 

}
