// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link QueryAttractionsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAttractionsResponseBody</p>
 */
public class QueryAttractionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryResult")
    private QueryResult queryResult;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryAttractionsResponseBody(Builder builder) {
        this.queryResult = builder.queryResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAttractionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryAttractionsResponseBody model) {
            this.queryResult = model.queryResult;
            this.requestId = model.requestId;
        } 

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
         * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAttractionsResponseBody build() {
            return new QueryAttractionsResponseBody(this);
        } 

    } 

}
