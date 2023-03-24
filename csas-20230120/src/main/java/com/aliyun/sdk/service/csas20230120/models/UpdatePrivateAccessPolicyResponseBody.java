// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrivateAccessPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrivateAccessPolicyResponseBody</p>
 */
public class UpdatePrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdatePrivateAccessPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateAccessPolicyResponseBody create() {
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

        public UpdatePrivateAccessPolicyResponseBody build() {
            return new UpdatePrivateAccessPolicyResponseBody(this);
        } 

    } 

}
