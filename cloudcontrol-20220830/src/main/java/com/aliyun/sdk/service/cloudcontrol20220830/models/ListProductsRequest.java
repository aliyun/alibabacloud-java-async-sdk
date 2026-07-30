// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-accept-language")
    private String xAcsAcceptLanguage;

    private ListProductsRequest(Builder builder) {
        super(builder);
        this.provider = builder.provider;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.xAcsAcceptLanguage = builder.xAcsAcceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return xAcsAcceptLanguage
     */
    public String getXAcsAcceptLanguage() {
        return this.xAcsAcceptLanguage;
    }

    public static final class Builder extends Request.Builder<ListProductsRequest, Builder> {
        private String provider; 
        private Integer maxResults; 
        private String nextToken; 
        private String xAcsAcceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ListProductsRequest request) {
            super(request);
            this.provider = request.provider;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.xAcsAcceptLanguage = request.xAcsAcceptLanguage;
        } 

        /**
         * <p>The Cloud service provider. Only Aliyun is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder provider(String provider) {
            this.putPathParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Select the language in which the response is returned.</p>
         * <p>zh_CH: Chinese (default).</p>
         * <p>en_US: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_CH</p>
         */
        public Builder xAcsAcceptLanguage(String xAcsAcceptLanguage) {
            this.putHeaderParameter("x-acs-accept-language", xAcsAcceptLanguage);
            this.xAcsAcceptLanguage = xAcsAcceptLanguage;
            return this;
        }

        @Override
        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        } 

    } 

}
