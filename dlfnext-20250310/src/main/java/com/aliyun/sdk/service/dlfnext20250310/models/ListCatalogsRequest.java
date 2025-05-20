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
 * {@link ListCatalogsRequest} extends {@link RequestModel}
 *
 * <p>ListCatalogsRequest</p>
 */
public class ListCatalogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("catalogNamePattern")
    private String catalogNamePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    private ListCatalogsRequest(Builder builder) {
        super(builder);
        this.catalogNamePattern = builder.catalogNamePattern;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCatalogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogNamePattern
     */
    public String getCatalogNamePattern() {
        return this.catalogNamePattern;
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

    public static final class Builder extends Request.Builder<ListCatalogsRequest, Builder> {
        private String catalogNamePattern; 
        private Integer maxResults; 
        private String pageToken; 

        private Builder() {
            super();
        } 

        private Builder(ListCatalogsRequest request) {
            super(request);
            this.catalogNamePattern = request.catalogNamePattern;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
        } 

        /**
         * catalogNamePattern.
         */
        public Builder catalogNamePattern(String catalogNamePattern) {
            this.putQueryParameter("catalogNamePattern", catalogNamePattern);
            this.catalogNamePattern = catalogNamePattern;
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
        public ListCatalogsRequest build() {
            return new ListCatalogsRequest(this);
        } 

    } 

}
