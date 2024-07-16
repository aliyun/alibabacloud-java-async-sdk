// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardLockReasonResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardLockReasonResponseBody</p>
 */
public class GetCardLockReasonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LockReason")
    private String lockReason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * RequestId.
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
