// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockSpaceModelResponseBody} extends {@link TeaModel}
 *
 * <p>LockSpaceModelResponseBody</p>
 */
public class LockSpaceModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private LockSpaceModelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockSpaceModelResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LockSpaceModelResponseBody build() {
            return new LockSpaceModelResponseBody(this);
        } 

    } 

}
