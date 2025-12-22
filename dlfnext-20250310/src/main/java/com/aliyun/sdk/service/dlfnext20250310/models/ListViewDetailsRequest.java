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
 * {@link ListViewDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListViewDetailsRequest</p>
 */
public class ListViewDetailsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("viewNamePattern")
    private String viewNamePattern;

    private ListViewDetailsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.viewNamePattern = builder.viewNamePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListViewDetailsRequest create() {
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
     * @return viewNamePattern
     */
    public String getViewNamePattern() {
        return this.viewNamePattern;
    }

    public static final class Builder extends Request.Builder<ListViewDetailsRequest, Builder> {
        private String catalogId; 
        private String database; 
        private Integer maxResults; 
        private String pageToken; 
        private String viewNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListViewDetailsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.viewNamePattern = request.viewNamePattern;
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
         * viewNamePattern.
         */
        public Builder viewNamePattern(String viewNamePattern) {
            this.putQueryParameter("viewNamePattern", viewNamePattern);
            this.viewNamePattern = viewNamePattern;
            return this;
        }

        @Override
        public ListViewDetailsRequest build() {
            return new ListViewDetailsRequest(this);
        } 

    } 

}
