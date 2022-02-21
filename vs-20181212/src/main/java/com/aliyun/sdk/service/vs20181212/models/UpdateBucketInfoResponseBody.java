// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBucketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBucketInfoResponseBody</p>
 */
public class UpdateBucketInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateBucketInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBucketInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBucketInfoResponseBody build() {
            return new UpdateBucketInfoResponseBody(this);
        } 

    } 

}
