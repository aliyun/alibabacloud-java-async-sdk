// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveBuiltinEnvoyFilterResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveBuiltinEnvoyFilterResponseBody</p>
 */
public class RemoveBuiltinEnvoyFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveBuiltinEnvoyFilterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveBuiltinEnvoyFilterResponseBody create() {
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

        public RemoveBuiltinEnvoyFilterResponseBody build() {
            return new RemoveBuiltinEnvoyFilterResponseBody(this);
        } 

    } 

}
