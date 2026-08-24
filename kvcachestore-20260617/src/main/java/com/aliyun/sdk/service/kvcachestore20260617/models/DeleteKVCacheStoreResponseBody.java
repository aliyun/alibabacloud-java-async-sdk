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
 * {@link DeleteKVCacheStoreResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteKVCacheStoreResponseBody</p>
 */
public class DeleteKVCacheStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KvcsId")
    private String kvcsId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteKVCacheStoreResponseBody(Builder builder) {
        this.kvcsId = builder.kvcsId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKVCacheStoreResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String kvcsId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteKVCacheStoreResponseBody model) {
            this.kvcsId = model.kvcsId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>KVCacheStore KvcsId</p>
         * 
         * <strong>example:</strong>
         * <p>kvcs-your-id</p>
         */
        public Builder kvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteKVCacheStoreResponseBody build() {
            return new DeleteKVCacheStoreResponseBody(this);
        } 

    } 

}
