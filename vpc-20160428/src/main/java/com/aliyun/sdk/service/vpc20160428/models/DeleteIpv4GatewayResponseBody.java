// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpv4GatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIpv4GatewayResponseBody</p>
 */
public class DeleteIpv4GatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteIpv4GatewayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpv4GatewayResponseBody create() {
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

        public DeleteIpv4GatewayResponseBody build() {
            return new DeleteIpv4GatewayResponseBody(this);
        } 

    } 

}
