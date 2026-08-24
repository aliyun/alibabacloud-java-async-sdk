// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link CreateKVCacheStoreResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKVCacheStoreResponseBody</p>
 */
public class CreateKVCacheStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KvcsId")
    private String kvcsId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKVCacheStoreResponseBody(Builder builder) {
        this.kvcsId = builder.kvcsId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKVCacheStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kvcsId
     */
    public String getKvcsId() {
        return this.kvcsId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String kvcsId; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateKVCacheStoreResponseBody model) {
            this.kvcsId = model.kvcsId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * KvcsId.
         */
        public Builder kvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKVCacheStoreResponseBody build() {
            return new CreateKVCacheStoreResponseBody(this);
        } 

    } 

}
