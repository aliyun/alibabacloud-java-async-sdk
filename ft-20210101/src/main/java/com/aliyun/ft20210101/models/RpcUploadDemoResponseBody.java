// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RpcUploadDemoResponseBody} extends {@link TeaModel}
 *
 * <p>RpcUploadDemoResponseBody</p>
 */
public class RpcUploadDemoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private RpcUploadDemoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcUploadDemoResponseBody create() {
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
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RpcUploadDemoResponseBody build() {
            return new RpcUploadDemoResponseBody(this);
        } 

    } 

}
