// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageSetId")
    private String storageSetId;

    private CreateStorageSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageSetId = builder.storageSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageSetId
     */
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public static final class Builder {
        private String requestId; 
        private String storageSetId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the storage set.
         */
        public Builder storageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }

        public CreateStorageSetResponseBody build() {
            return new CreateStorageSetResponseBody(this);
        } 

    } 

}
