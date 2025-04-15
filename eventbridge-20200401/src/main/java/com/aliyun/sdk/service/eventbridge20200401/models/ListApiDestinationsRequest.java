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
 * {@link ListApiDestinationsRequest} extends {@link RequestModel}
 *
 * <p>ListApiDestinationsRequest</p>
 */
public class ListApiDestinationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiDestinationNamePrefix")
    private String apiDestinationNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListApiDestinationsRequest(Builder builder) {
        super(builder);
        this.apiDestinationNamePrefix = builder.apiDestinationNamePrefix;
        this.connectionName = builder.connectionName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiDestinationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiDestinationNamePrefix
     */
    public String getApiDestinationNamePrefix() {
        return this.apiDestinationNamePrefix;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
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

    public static final class Builder extends Request.Builder<ListApiDestinationsRequest, Builder> {
        private String apiDestinationNamePrefix; 
        private String connectionName; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListApiDestinationsRequest request) {
            super(request);
            this.apiDestinationNamePrefix = request.apiDestinationNamePrefix;
            this.connectionName = request.connectionName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The prefix of the API destination name.</p>
         * 
         * <strong>example:</strong>
         * <p>api-demo</p>
         */
        public Builder apiDestinationNamePrefix(String apiDestinationNamePrefix) {
            this.putQueryParameter("ApiDestinationNamePrefix", apiDestinationNamePrefix);
            this.apiDestinationNamePrefix = apiDestinationNamePrefix;
            return this;
        }

        /**
         * <p>The connection name.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>If you set Limit and excess return values exist, this parameter is returned.</p>
         * <ul>
         * <li>Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListApiDestinationsRequest build() {
            return new ListApiDestinationsRequest(this);
        } 

    } 

}
