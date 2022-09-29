// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMailAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMailAddressResponseBody</p>
 */
public class DeleteMailAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteMailAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMailAddressResponseBody create() {
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

        public DeleteMailAddressResponseBody build() {
            return new DeleteMailAddressResponseBody(this);
        } 

    } 

}
