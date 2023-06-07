// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadInstanceKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>UploadInstanceKeyPairResponseBody</p>
 */
public class UploadInstanceKeyPairResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UploadInstanceKeyPairResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadInstanceKeyPairResponseBody create() {
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

        public UploadInstanceKeyPairResponseBody build() {
            return new UploadInstanceKeyPairResponseBody(this);
        } 

    } 

}
