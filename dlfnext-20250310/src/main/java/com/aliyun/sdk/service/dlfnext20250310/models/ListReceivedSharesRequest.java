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
 * {@link ListReceivedSharesRequest} extends {@link RequestModel}
 *
 * <p>ListReceivedSharesRequest</p>
 */
public class ListReceivedSharesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    private ListReceivedSharesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReceivedSharesRequest create() {
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
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    public static final class Builder extends Request.Builder<ListReceivedSharesRequest, Builder> {
        private Integer maxResults; 
        private String pageToken; 

        private Builder() {
            super();
        } 

        private Builder(ListReceivedSharesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
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
        public ListReceivedSharesRequest build() {
            return new ListReceivedSharesRequest(this);
        } 

    } 

}
