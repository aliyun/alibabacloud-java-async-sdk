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
 * {@link UpdateKVCacheStoreResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKVCacheStoreResponseBody</p>
 */
public class UpdateKVCacheStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KvcsId")
    private String kvcsId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateKVCacheStoreResponseBody(Builder builder) {
        this.kvcsId = builder.kvcsId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKVCacheStoreResponseBody create() {
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

        private Builder(UpdateKVCacheStoreResponseBody model) {
            this.kvcsId = model.kvcsId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the modified KVCacheStore.</p>
         * 
         * <strong>example:</strong>
         * <p>kvs-xxxxx</p>
         */
        public Builder kvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }

        /**
         * <p>The specification change order ID. Returned only when Capacity is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>order-xxxxx</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID. The request ID is returned regardless of whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>6AA27F1A-A62C-59C3-BCC7-D1DFA4E7EEA0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateKVCacheStoreResponseBody build() {
            return new UpdateKVCacheStoreResponseBody(this);
        } 

    } 

}
