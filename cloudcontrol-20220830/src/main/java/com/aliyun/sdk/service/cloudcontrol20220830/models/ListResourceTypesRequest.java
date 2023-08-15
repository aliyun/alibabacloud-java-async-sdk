// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypesRequest</p>
 */
public class ListResourceTypesRequest extends Request {
    @Path
    @NameInMap("provider")
    @Validation(required = true)
    private String provider;

    @Path
    @NameInMap("product")
    @Validation(required = true)
    private String product;

    @Query
    @NameInMap("maxResults")
    private Integer maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("resourceTypes")
    private java.util.List < String > resourceTypes;

    @Header
    @NameInMap("x-acs-accept-language")
    private String xAcsAcceptLanguage;

    private ListResourceTypesRequest(Builder builder) {
        super(builder);
        this.provider = builder.provider;
        this.product = builder.product;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceTypes = builder.resourceTypes;
        this.xAcsAcceptLanguage = builder.xAcsAcceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesRequest create() {
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
     * @return product
     */
    public String getProduct() {
        return this.product;
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
     * @return resourceTypes
     */
    public java.util.List < String > getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return xAcsAcceptLanguage
     */
    public String getXAcsAcceptLanguage() {
        return this.xAcsAcceptLanguage;
    }

    public static final class Builder extends Request.Builder<ListResourceTypesRequest, Builder> {
        private String provider; 
        private String product; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > resourceTypes; 
        private String xAcsAcceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTypesRequest request) {
            super(request);
            this.provider = request.provider;
            this.product = request.product;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceTypes = request.resourceTypes;
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
         * product.
         */
        public Builder product(String product) {
            this.putPathParameter("product", product);
            this.product = product;
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
         * resourceTypes.
         */
        public Builder resourceTypes(java.util.List < String > resourceTypes) {
            String resourceTypesShrink = shrink(resourceTypes, "resourceTypes", "simple");
            this.putQueryParameter("resourceTypes", resourceTypesShrink);
            this.resourceTypes = resourceTypes;
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
        public ListResourceTypesRequest build() {
            return new ListResourceTypesRequest(this);
        } 

    } 

}
