// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExchangeResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteExchangeResponseBody</p>
 */
public class DeleteExchangeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteExchangeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExchangeResponseBody create() {
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

        public DeleteExchangeResponseBody build() {
            return new DeleteExchangeResponseBody(this);
        } 

    } 

}
