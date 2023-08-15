// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
    @Path
    @NameInMap("provider")
    @Validation(required = true)
    private String provider;

    @Query
    @NameInMap("maxResults")
    private Integer maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Header
    @NameInMap("x-acs-accept-language")
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
         * provider.
         */
        public Builder provider(String provider) {
            this.putPathParameter("provider", provider);
            this.provider = provider;
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
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * x-acs-accept-language.
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
