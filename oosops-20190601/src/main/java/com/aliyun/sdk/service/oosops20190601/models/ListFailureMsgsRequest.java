// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFailureMsgsRequest} extends {@link RequestModel}
 *
 * <p>ListFailureMsgsRequest</p>
 */
public class ListFailureMsgsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RequestFingerprint")
    private String requestFingerprint;

    private ListFailureMsgsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestFingerprint = builder.requestFingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFailureMsgsRequest create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestFingerprint
     */
    public String getRequestFingerprint() {
        return this.requestFingerprint;
    }

    public static final class Builder extends Request.Builder<ListFailureMsgsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String requestFingerprint; 

        private Builder() {
            super();
        } 

        private Builder(ListFailureMsgsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.requestFingerprint = request.requestFingerprint;
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
         * RequestFingerprint.
         */
        public Builder requestFingerprint(String requestFingerprint) {
            this.putQueryParameter("RequestFingerprint", requestFingerprint);
            this.requestFingerprint = requestFingerprint;
            return this;
        }

        @Override
        public ListFailureMsgsRequest build() {
            return new ListFailureMsgsRequest(this);
        } 

    } 

}
