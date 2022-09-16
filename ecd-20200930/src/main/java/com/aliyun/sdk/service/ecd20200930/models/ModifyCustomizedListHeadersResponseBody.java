// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustomizedListHeadersResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCustomizedListHeadersResponseBody</p>
 */
public class ModifyCustomizedListHeadersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyCustomizedListHeadersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomizedListHeadersResponseBody create() {
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

        public ModifyCustomizedListHeadersResponseBody build() {
            return new ModifyCustomizedListHeadersResponseBody(this);
        } 

    } 

}
