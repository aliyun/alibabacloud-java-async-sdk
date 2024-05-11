// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
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
         * The prefix of the API destination name.
         */
        public Builder apiDestinationNamePrefix(String apiDestinationNamePrefix) {
            this.putQueryParameter("ApiDestinationNamePrefix", apiDestinationNamePrefix);
            this.apiDestinationNamePrefix = apiDestinationNamePrefix;
            return this;
        }

        /**
         * The connection name.
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging.
         * <p>
         * 
         * *   Default value: 10.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * If you set Limit and excess return values exist, this parameter is returned.
         * <p>
         * 
         * *   Default value: 0.
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
