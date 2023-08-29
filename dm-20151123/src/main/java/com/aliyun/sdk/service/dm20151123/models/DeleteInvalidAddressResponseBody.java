// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInvalidAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInvalidAddressResponseBody</p>
 */
public class DeleteInvalidAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteInvalidAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInvalidAddressResponseBody create() {
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

        public DeleteInvalidAddressResponseBody build() {
            return new DeleteInvalidAddressResponseBody(this);
        } 

    } 

}
