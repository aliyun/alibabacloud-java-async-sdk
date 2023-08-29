// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMessageResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterMessageResponseBody</p>
 */
public class RegisterMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RegisterMessageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMessageResponseBody create() {
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

        public RegisterMessageResponseBody build() {
            return new RegisterMessageResponseBody(this);
        } 

    } 

}
