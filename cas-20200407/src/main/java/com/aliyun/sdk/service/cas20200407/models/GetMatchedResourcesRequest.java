// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetMatchedResourcesRequest} extends {@link RequestModel}
 *
 * <p>GetMatchedResourcesRequest</p>
 */
public class GetMatchedResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceScope")
    private String resourceScope;

    private GetMatchedResourcesRequest(Builder builder) {
        super(builder);
        this.certIds = builder.certIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceScope = builder.resourceScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMatchedResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIds
     */
    public String getCertIds() {
        return this.certIds;
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
     * @return resourceScope
     */
    public String getResourceScope() {
        return this.resourceScope;
    }

    public static final class Builder extends Request.Builder<GetMatchedResourcesRequest, Builder> {
        private String certIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceScope; 

        private Builder() {
            super();
        } 

        private Builder(GetMatchedResourcesRequest request) {
            super(request);
            this.certIds = request.certIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceScope = request.resourceScope;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19736665</p>
         */
        public Builder certIds(String certIds) {
            this.putQueryParameter("CertIds", certIds);
            this.certIds = certIds;
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
         * ResourceScope.
         */
        public Builder resourceScope(String resourceScope) {
            this.putQueryParameter("ResourceScope", resourceScope);
            this.resourceScope = resourceScope;
            return this;
        }

        @Override
        public GetMatchedResourcesRequest build() {
            return new GetMatchedResourcesRequest(this);
        } 

    } 

}
