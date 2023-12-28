// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceTemporaryCapacityResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceTemporaryCapacityResponseBody</p>
 */
public class ModifyInstanceTemporaryCapacityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceTemporaryCapacityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTemporaryCapacityResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceTemporaryCapacityResponseBody build() {
            return new ModifyInstanceTemporaryCapacityResponseBody(this);
        } 

    } 

}
