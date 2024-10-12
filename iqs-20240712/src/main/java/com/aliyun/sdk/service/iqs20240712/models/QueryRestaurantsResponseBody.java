// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRestaurantsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRestaurantsResponseBody</p>
 */
public class QueryRestaurantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryResult")
    private QueryResult queryResult;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryRestaurantsResponseBody(Builder builder) {
        this.queryResult = builder.queryResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRestaurantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryResult
     */
    public QueryResult getQueryResult() {
        return this.queryResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QueryResult queryResult; 
        private String requestId; 

        /**
         * queryResult.
         */
        public Builder queryResult(QueryResult queryResult) {
            this.queryResult = queryResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D78E16C0-4D44-5065-BFF7-127F7859F687</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRestaurantsResponseBody build() {
            return new QueryRestaurantsResponseBody(this);
        } 

    } 

}
