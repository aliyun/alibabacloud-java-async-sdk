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
 * {@link ListFunctionsRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionsRequest</p>
 */
public class ListFunctionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("functionNamePattern")
    private String functionNamePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    private ListFunctionsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.functionNamePattern = builder.functionNamePattern;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsRequest create() {
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
     * @return functionNamePattern
     */
    public String getFunctionNamePattern() {
        return this.functionNamePattern;
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

    public static final class Builder extends Request.Builder<ListFunctionsRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String functionNamePattern; 
        private Integer maxResults; 
        private String pageToken; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.functionNamePattern = request.functionNamePattern;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-iceberg-xxxx</p>
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
         * functionNamePattern.
         */
        public Builder functionNamePattern(String functionNamePattern) {
            this.putQueryParameter("functionNamePattern", functionNamePattern);
            this.functionNamePattern = functionNamePattern;
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

        @Override
        public ListFunctionsRequest build() {
            return new ListFunctionsRequest(this);
        } 

    } 

}
