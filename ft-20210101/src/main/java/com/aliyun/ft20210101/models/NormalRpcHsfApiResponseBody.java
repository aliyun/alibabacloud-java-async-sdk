// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link NormalRpcHsfApiResponseBody} extends {@link TeaModel}
 *
 * <p>NormalRpcHsfApiResponseBody</p>
 */
public class NormalRpcHsfApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private NormalRpcHsfApiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NormalRpcHsfApiResponseBody create() {
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

        public NormalRpcHsfApiResponseBody build() {
            return new NormalRpcHsfApiResponseBody(this);
        } 

    } 

}
