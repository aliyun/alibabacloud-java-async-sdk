// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcDataUploadTestResponseBody} extends {@link TeaModel}
 *
 * <p>RpcDataUploadTestResponseBody</p>
 */
public class RpcDataUploadTestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RpcDataUploadTestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcDataUploadTestResponseBody create() {
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

        public RpcDataUploadTestResponseBody build() {
            return new RpcDataUploadTestResponseBody(this);
        } 

    } 

}
