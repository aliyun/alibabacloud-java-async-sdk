// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTensorboardSharedUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetTensorboardSharedUrlResponseBody</p>
 */
public class GetTensorboardSharedUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TensorboardSharedUrl")
    private String tensorboardSharedUrl;

    private GetTensorboardSharedUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tensorboardSharedUrl = builder.tensorboardSharedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTensorboardSharedUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tensorboardSharedUrl
     */
    public String getTensorboardSharedUrl() {
        return this.tensorboardSharedUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String tensorboardSharedUrl; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TensorboardSharedUrl.
         */
        public Builder tensorboardSharedUrl(String tensorboardSharedUrl) {
            this.tensorboardSharedUrl = tensorboardSharedUrl;
            return this;
        }

        public GetTensorboardSharedUrlResponseBody build() {
            return new GetTensorboardSharedUrlResponseBody(this);
        } 

    } 

}
