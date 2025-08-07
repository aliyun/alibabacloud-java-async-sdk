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
 * {@link ListShareResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListShareResourcesRequest</p>
 */
public class ListShareResourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("share")
    private String share;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    private ListShareResourcesRequest(Builder builder) {
        super(builder);
        this.share = builder.share;
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShareResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return share
     */
    public String getShare() {
        return this.share;
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

    public static final class Builder extends Request.Builder<ListShareResourcesRequest, Builder> {
        private String share; 
        private Integer maxResults; 
        private String pageToken; 

        private Builder() {
            super();
        } 

        private Builder(ListShareResourcesRequest request) {
            super(request);
            this.share = request.share;
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
        } 

        /**
         * share.
         */
        public Builder share(String share) {
            this.putPathParameter("share", share);
            this.share = share;
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
        public ListShareResourcesRequest build() {
            return new ListShareResourcesRequest(this);
        } 

    } 

}
