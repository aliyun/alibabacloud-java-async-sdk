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
 * {@link ListDatabaseDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListDatabaseDetailsRequest</p>
 */
public class ListDatabaseDetailsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("databaseNamePattern")
    private String databaseNamePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListDatabaseDetailsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseNamePattern = builder.databaseNamePattern;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseDetailsRequest create() {
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
     * @return databaseNamePattern
     */
    public String getDatabaseNamePattern() {
        return this.databaseNamePattern;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListDatabaseDetailsRequest, Builder> {
        private String catalogId; 
        private String databaseNamePattern; 
        private Integer maxResults; 
        private String pageToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListDatabaseDetailsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.databaseNamePattern = request.databaseNamePattern;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.status = request.status;
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
         * databaseNamePattern.
         */
        public Builder databaseNamePattern(String databaseNamePattern) {
            this.putQueryParameter("databaseNamePattern", databaseNamePattern);
            this.databaseNamePattern = databaseNamePattern;
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
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDatabaseDetailsRequest build() {
            return new ListDatabaseDetailsRequest(this);
        } 

    } 

}
