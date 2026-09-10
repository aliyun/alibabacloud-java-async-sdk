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
 * {@link ListReceiversRequest} extends {@link RequestModel}
 *
 * <p>ListReceiversRequest</p>
 */
public class ListReceiversRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageToken")
    private String pageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("receiverName")
    private String receiverName;

    private ListReceiversRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.pageToken = builder.pageToken;
        this.receiverName = builder.receiverName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReceiversRequest create() {
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

    /**
     * @return receiverName
     */
    public String getReceiverName() {
        return this.receiverName;
    }

    public static final class Builder extends Request.Builder<ListReceiversRequest, Builder> {
        private Integer maxResults; 
        private String pageToken; 
        private String receiverName; 

        private Builder() {
            super();
        } 

        private Builder(ListReceiversRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.pageToken = request.pageToken;
            this.receiverName = request.receiverName;
        } 

        /**
         * <p>The maximum number of records to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If the response does not include this token, pass an empty string (&quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder pageToken(String pageToken) {
            this.putQueryParameter("pageToken", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * <p>The name of the receiver.</p>
         * 
         * <strong>example:</strong>
         * <p>receiver_name</p>
         */
        public Builder receiverName(String receiverName) {
            this.putQueryParameter("receiverName", receiverName);
            this.receiverName = receiverName;
            return this;
        }

        @Override
        public ListReceiversRequest build() {
            return new ListReceiversRequest(this);
        } 

    } 

}
