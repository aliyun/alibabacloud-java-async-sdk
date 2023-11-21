// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpv6GatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIpv6GatewayResponseBody</p>
 */
public class DeleteIpv6GatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteIpv6GatewayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpv6GatewayResponseBody create() {
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

        public DeleteIpv6GatewayResponseBody build() {
            return new DeleteIpv6GatewayResponseBody(this);
        } 

    } 

}
