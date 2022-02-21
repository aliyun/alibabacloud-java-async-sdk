// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMessageResponseBody} extends {@link TeaModel}
 *
 * <p>PushMessageResponseBody</p>
 */
public class PushMessageResponseBody extends TeaModel {
    @NameInMap("Mid")
    private Long mid;

    @NameInMap("RequestId")
    private String requestId;

    private PushMessageResponseBody(Builder builder) {
        this.mid = builder.mid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return mid
     */
    public Long getMid() {
        return this.mid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long mid; 
        private String requestId; 

        /**
         * Mid.
         */
        public Builder mid(Long mid) {
            this.mid = mid;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushMessageResponseBody build() {
            return new PushMessageResponseBody(this);
        } 

    } 

}
