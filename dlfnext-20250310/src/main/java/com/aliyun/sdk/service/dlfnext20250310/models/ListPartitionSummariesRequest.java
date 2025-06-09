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
 * {@link ListPartitionSummariesRequest} extends {@link RequestModel}
 *
 * <p>ListPartitionSummariesRequest</p>
 */
public class ListPartitionSummariesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partitionNamePattern")
    private String partitionNamePattern;

    private ListPartitionSummariesRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.database = builder.database;
        this.table = builder.table;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.partitionNamePattern = builder.partitionNamePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartitionSummariesRequest create() {
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
     * @return partitionNamePattern
     */
    public String getPartitionNamePattern() {
        return this.partitionNamePattern;
    }

    public static final class Builder extends Request.Builder<ListPartitionSummariesRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String table; 
        private Integer maxResults; 
        private String pageToken; 
        private String partitionNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListPartitionSummariesRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.table = request.table;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.partitionNamePattern = request.partitionNamePattern;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        public Builder table(String table) {
            this.putPathParameter("table", table);
            this.table = table;
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
         * partitionNamePattern.
         */
        public Builder partitionNamePattern(String partitionNamePattern) {
            this.putQueryParameter("partitionNamePattern", partitionNamePattern);
            this.partitionNamePattern = partitionNamePattern;
            return this;
        }

        @Override
        public ListPartitionSummariesRequest build() {
            return new ListPartitionSummariesRequest(this);
        } 

    } 

}
