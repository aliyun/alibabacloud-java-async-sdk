// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RpcDataUploadAndDownloadResponseBody} extends {@link TeaModel}
 *
 * <p>RpcDataUploadAndDownloadResponseBody</p>
 */
public class RpcDataUploadAndDownloadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private RpcDataUploadAndDownloadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcDataUploadAndDownloadResponseBody create() {
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

        public RpcDataUploadAndDownloadResponseBody build() {
            return new RpcDataUploadAndDownloadResponseBody(this);
        } 

    } 

}
