// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link WebSearchRequest} extends {@link RequestModel}
 *
 * <p>WebSearchRequest</p>
 */
public class WebSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrlScopeDomains")
    private String urlScopeDomains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrlScopeMode")
    private String urlScopeMode;

    private WebSearchRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.urlScopeDomains = builder.urlScopeDomains;
        this.urlScopeMode = builder.urlScopeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return urlScopeDomains
     */
    public String getUrlScopeDomains() {
        return this.urlScopeDomains;
    }

    /**
     * @return urlScopeMode
     */
    public String getUrlScopeMode() {
        return this.urlScopeMode;
    }

    public static final class Builder extends Request.Builder<WebSearchRequest, Builder> {
        private Integer maxResults; 
        private String query; 
        private String regionId; 
        private String urlScopeDomains; 
        private String urlScopeMode; 

        private Builder() {
            super();
        } 

        private Builder(WebSearchRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.query = request.query;
            this.regionId = request.regionId;
            this.urlScopeDomains = request.urlScopeDomains;
            this.urlScopeMode = request.urlScopeMode;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Spring Boot</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UrlScopeDomains.
         */
        public Builder urlScopeDomains(String urlScopeDomains) {
            this.putQueryParameter("UrlScopeDomains", urlScopeDomains);
            this.urlScopeDomains = urlScopeDomains;
            return this;
        }

        /**
         * UrlScopeMode.
         */
        public Builder urlScopeMode(String urlScopeMode) {
            this.putQueryParameter("UrlScopeMode", urlScopeMode);
            this.urlScopeMode = urlScopeMode;
            return this;
        }

        @Override
        public WebSearchRequest build() {
            return new WebSearchRequest(this);
        } 

    } 

}
