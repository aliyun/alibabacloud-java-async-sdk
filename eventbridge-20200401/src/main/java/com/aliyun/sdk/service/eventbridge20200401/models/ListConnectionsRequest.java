// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListConnectionsRequest</p>
 */
public class ListConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionNamePrefix")
    private String connectionNamePrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListConnectionsRequest(Builder builder) {
        super(builder);
        this.connectionNamePrefix = builder.connectionNamePrefix;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionNamePrefix
     */
    public String getConnectionNamePrefix() {
        return this.connectionNamePrefix;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListConnectionsRequest, Builder> {
        private String connectionNamePrefix; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectionsRequest request) {
            super(request);
            this.connectionNamePrefix = request.connectionNamePrefix;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The key word that you specify to query connections. Connections can be queried by prefixes.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        public Builder connectionNamePrefix(String connectionNamePrefix) {
            this.putBodyParameter("ConnectionNamePrefix", connectionNamePrefix);
            this.connectionNamePrefix = connectionNamePrefix;
            return this;
        }

        /**
         * <p>The maximum number of entries to be returned in a single call. You can use this parameter and the NextToken parameter to implement paging.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>If you set the Limit parameter and excess return values exist, this parameter is returned.</p>
         * <ul>
         * <li>Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListConnectionsRequest build() {
            return new ListConnectionsRequest(this);
        } 

    } 

}
