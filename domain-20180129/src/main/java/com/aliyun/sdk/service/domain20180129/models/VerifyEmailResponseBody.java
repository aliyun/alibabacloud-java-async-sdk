// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyEmailResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyEmailResponseBody</p>
 */
public class VerifyEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private VerifyEmailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyEmailResponseBody create() {
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

        public VerifyEmailResponseBody build() {
            return new VerifyEmailResponseBody(this);
        } 

    } 

}
