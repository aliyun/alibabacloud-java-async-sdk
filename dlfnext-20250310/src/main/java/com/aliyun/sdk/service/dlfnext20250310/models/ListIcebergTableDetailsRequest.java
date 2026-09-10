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
 * {@link ListIcebergTableDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListIcebergTableDetailsRequest</p>
 */
public class ListIcebergTableDetailsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tableNamePattern")
    private String tableNamePattern;

    private ListIcebergTableDetailsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.namespace = builder.namespace;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.tableNamePattern = builder.tableNamePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIcebergTableDetailsRequest create() {
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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

    public static final class Builder extends Request.Builder<ListIcebergTableDetailsRequest, Builder> {
        private String catalogId; 
        private String namespace; 
        private Integer maxResults; 
        private String pageToken; 
        private String tableNamePattern; 

        private Builder() {
            super();
        } 

        private Builder(ListIcebergTableDetailsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.namespace = request.namespace;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.tableNamePattern = request.tableNamePattern;
        } 

        /**
         * <p>The catalog ID.</p>
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
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace_name</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The maximum number of records to return in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If this parameter is not returned in the response, pass an empty string (&quot;&quot;).</p>
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
         * <p>The pattern to filter table names.</p>
         * 
         * <strong>example:</strong>
         * <p>table%</p>
         */
        public Builder tableNamePattern(String tableNamePattern) {
            this.putQueryParameter("tableNamePattern", tableNamePattern);
            this.tableNamePattern = tableNamePattern;
            return this;
        }

        @Override
        public ListIcebergTableDetailsRequest build() {
            return new ListIcebergTableDetailsRequest(this);
        } 

    } 

}
