// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryHotelsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHotelsResponseBody</p>
 */
public class QueryHotelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryResult")
    private QueryResult queryResult;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryHotelsResponseBody(Builder builder) {
        this.queryResult = builder.queryResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotelsResponseBody create() {
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
         * <p>78032F8B-0157-53F9-B1A8-3BD86ADE38D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryHotelsResponseBody build() {
            return new QueryHotelsResponseBody(this);
        } 

    } 

}
