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
 * {@link ListPartitionsRequest} extends {@link RequestModel}
 *
 * <p>ListPartitionsRequest</p>
 */
public class ListPartitionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("partitionNamePattern")
    private String partitionNamePattern;

    private ListPartitionsRequest(Builder builder) {
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

    public static ListPartitionsRequest create() {
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
    public Long getMaxResults() {
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

    public static final class Builder extends Request.Builder<ListPartitionsRequest, Builder> {
        private String catalogId; 
        private String database; 
        private String table; 
        private Long maxResults; 
        private String pageToken; 
        private String partitionNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListPartitionsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.database = request.database;
            this.table = request.table;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.partitionNamePattern = request.partitionNamePattern;
        } 

        /**
         * <p>The ID of the catalog.</p>
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
         * <p>The name of the database.</p>
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
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        public Builder table(String table) {
            this.putPathParameter("table", table);
            this.table = table;
            return this;
        }

        /**
         * <p>The maximum number of records to return in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to retrieve the next page of results. If the response does not include this token, pass an empty string (&quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder pageToken(String pageToken) {
            this.putQueryParameter("pageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * <p>The partition name pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>partition</p>
         */
        public Builder partitionNamePattern(String partitionNamePattern) {
            this.putQueryParameter("partitionNamePattern", partitionNamePattern);
            this.partitionNamePattern = partitionNamePattern;
            return this;
        }

        @Override
        public ListPartitionsRequest build() {
            return new ListPartitionsRequest(this);
        } 

    } 

}
