// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuthConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuthConfigResponseBody</p>
 */
public class QueryAuthConfigResponseBody extends TeaModel {
    @NameInMap("Key1")
    private String key1;

    @NameInMap("Key2")
    private String key2;

    @NameInMap("RequestId")
    private String requestId;

    private QueryAuthConfigResponseBody(Builder builder) {
        this.key1 = builder.key1;
        this.key2 = builder.key2;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return key1
     */
    public String getKey1() {
        return this.key1;
    }

    /**
     * @return key2
     */
    public String getKey2() {
        return this.key2;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String key1; 
        private String key2; 
        private String requestId; 

        /**
         * Key1.
         */
        public Builder key1(String key1) {
            this.key1 = key1;
            return this;
        }

        /**
         * Key2.
         */
        public Builder key2(String key2) {
            this.key2 = key2;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAuthConfigResponseBody build() {
            return new QueryAuthConfigResponseBody(this);
        } 

    } 

}
