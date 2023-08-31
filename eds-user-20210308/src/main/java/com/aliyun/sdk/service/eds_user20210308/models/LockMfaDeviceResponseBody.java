// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockMfaDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>LockMfaDeviceResponseBody</p>
 */
public class LockMfaDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private LockMfaDeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockMfaDeviceResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LockMfaDeviceResponseBody build() {
            return new LockMfaDeviceResponseBody(this);
        } 

    } 

}
