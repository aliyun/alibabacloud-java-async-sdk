// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateStorageSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStorageSetResponseBody</p>
 */
public class CreateStorageSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageSetId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateStorageSetResponseBody model) {
            this.requestId = model.requestId;
            this.storageSetId = model.storageSetId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-bp67acfmxazb4p****</p>
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
