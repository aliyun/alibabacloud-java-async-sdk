// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStorageSetResponseBody</p>
 */
public class CreateStorageSetResponseBody extends TeaModel {
    @NameInMap("StorageSetId")
    private String storageSetId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateStorageSetResponseBody(Builder builder) {
        this.storageSetId = builder.storageSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return storageSetId
     */
    public String getStorageSetId() {
        return this.storageSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String storageSetId; 
        private String requestId; 

        /**
         * The ID of the storage set.
         */
        public Builder storageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateStorageSetResponseBody build() {
            return new CreateStorageSetResponseBody(this);
        } 

    } 

}
