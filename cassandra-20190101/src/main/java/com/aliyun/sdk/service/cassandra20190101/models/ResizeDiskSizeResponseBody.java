// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDiskSizeResponseBody} extends {@link TeaModel}
 *
 * <p>ResizeDiskSizeResponseBody</p>
 */
public class ResizeDiskSizeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResizeDiskSizeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDiskSizeResponseBody create() {
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

        public ResizeDiskSizeResponseBody build() {
            return new ResizeDiskSizeResponseBody(this);
        } 

    } 

}
