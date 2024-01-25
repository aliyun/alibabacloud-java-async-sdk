// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAiStoreRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiStoreRegionsResponseBody</p>
 */
public class QueryAiStoreRegionsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < AiStoreUserTask > data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryAiStoreRegionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiStoreRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < AiStoreUserTask > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AiStoreUserTask > data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < AiStoreUserTask > data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAiStoreRegionsResponseBody build() {
            return new QueryAiStoreRegionsResponseBody(this);
        } 

    } 

}
