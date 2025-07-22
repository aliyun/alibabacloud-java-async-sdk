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
 * {@link ListTableDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListTableDetailsRequest</p>
 */
public class ListTableDetailsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tableNamePattern")
    private String tableNamePattern;

    private ListTableDetailsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.tableNamePattern = builder.tableNamePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableDetailsRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return tableNamePattern
     */
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

    public static final class Builder extends Request.Builder<ListTableDetailsRequest, Builder> {
        private String catalogId; 
        private String database; 
        private Integer maxResults; 
        private String pageToken; 
        private String tableNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListTableDetailsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.tableNamePattern = request.tableNamePattern;
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
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * pageToken.
         */
        public Builder pageToken(String pageToken) {
            this.putQueryParameter("pageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * tableNamePattern.
         */
        public Builder tableNamePattern(String tableNamePattern) {
            this.putQueryParameter("tableNamePattern", tableNamePattern);
            this.tableNamePattern = tableNamePattern;
            return this;
        }

        @Override
        public ListTableDetailsRequest build() {
            return new ListTableDetailsRequest(this);
        } 

    } 

}
