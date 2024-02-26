// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEndpointResponseBody</p>
 */
public class DeleteEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEndpointResponseBody create() {
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

        public DeleteEndpointResponseBody build() {
            return new DeleteEndpointResponseBody(this);
        } 

    } 

}
