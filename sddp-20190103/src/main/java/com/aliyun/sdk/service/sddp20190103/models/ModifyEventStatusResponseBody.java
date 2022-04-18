// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyEventStatusResponseBody</p>
 */
public class ModifyEventStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyEventStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventStatusResponseBody create() {
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

        public ModifyEventStatusResponseBody build() {
            return new ModifyEventStatusResponseBody(this);
        } 

    } 

}
