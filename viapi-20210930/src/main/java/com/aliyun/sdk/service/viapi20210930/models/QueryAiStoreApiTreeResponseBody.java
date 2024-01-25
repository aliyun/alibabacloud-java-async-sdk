// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAiStoreApiTreeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiStoreApiTreeResponseBody</p>
 */
public class QueryAiStoreApiTreeResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < AiStoreApiNode > data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryAiStoreApiTreeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiStoreApiTreeResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < AiStoreApiNode > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AiStoreApiNode > data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < AiStoreApiNode > data) {
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

        public QueryAiStoreApiTreeResponseBody build() {
            return new QueryAiStoreApiTreeResponseBody(this);
        } 

    } 

}
