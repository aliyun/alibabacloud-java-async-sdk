// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link ListRegionsRequest} extends {@link RequestModel}
 *
 * <p>ListRegionsRequest</p>
 */
public class ListRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecCode")
    private String specCode;

    private ListRegionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.specCode = builder.specCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
     * @return specCode
     */
    public String getSpecCode() {
        return this.specCode;
    }

    public static final class Builder extends Request.Builder<ListRegionsRequest, Builder> {
        private String acceptLanguage; 
        private Integer maxResults; 
        private String nextToken; 
        private String specCode; 

        private Builder() {
            super();
        } 

        private Builder(ListRegionsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.specCode = request.specCode;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SpecCode.
         */
        public Builder specCode(String specCode) {
            this.putQueryParameter("SpecCode", specCode);
            this.specCode = specCode;
            return this;
        }

        @Override
        public ListRegionsRequest build() {
            return new ListRegionsRequest(this);
        } 

    } 

}
