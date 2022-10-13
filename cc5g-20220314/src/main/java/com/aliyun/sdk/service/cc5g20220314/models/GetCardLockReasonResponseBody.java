// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardLockReasonResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardLockReasonResponseBody</p>
 */
public class GetCardLockReasonResponseBody extends TeaModel {
    @NameInMap("LockReason")
    private String lockReason;

    @NameInMap("RequestId")
    private String requestId;

    private GetCardLockReasonResponseBody(Builder builder) {
        this.lockReason = builder.lockReason;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardLockReasonResponseBody create() {
        return builder().build();
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String lockReason; 
        private String requestId; 

        /**
         * LockReason.
         */
        public Builder lockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCardLockReasonResponseBody build() {
            return new GetCardLockReasonResponseBody(this);
        } 

    } 

}
