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
 * {@link ListIcebergNamespaceDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListIcebergNamespaceDetailsRequest</p>
 */
public class ListIcebergNamespaceDetailsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespaceNamePattern")
    private String namespaceNamePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    private ListIcebergNamespaceDetailsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.maxResults = builder.maxResults;
        this.namespaceNamePattern = builder.namespaceNamePattern;
        this.pageToken = builder.pageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIcebergNamespaceDetailsRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return namespaceNamePattern
     */
    public String getNamespaceNamePattern() {
        return this.namespaceNamePattern;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    public static final class Builder extends Request.Builder<ListIcebergNamespaceDetailsRequest, Builder> {
        private String catalogId; 
        private Integer maxResults; 
        private String namespaceNamePattern; 
        private String pageToken; 

        private Builder() {
            super();
        } 

        private Builder(ListIcebergNamespaceDetailsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.maxResults = request.maxResults;
            this.namespaceNamePattern = request.namespaceNamePattern;
            this.pageToken = request.pageToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-iceberg-xxx</p>
         */
        public Builder catalogId(String catalogId) {
            this.putPathParameter("catalogId", catalogId);
            this.catalogId = catalogId;
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
         * namespaceNamePattern.
         */
        public Builder namespaceNamePattern(String namespaceNamePattern) {
            this.putQueryParameter("namespaceNamePattern", namespaceNamePattern);
            this.namespaceNamePattern = namespaceNamePattern;
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
        public ListIcebergNamespaceDetailsRequest build() {
            return new ListIcebergNamespaceDetailsRequest(this);
        } 

    } 

}
