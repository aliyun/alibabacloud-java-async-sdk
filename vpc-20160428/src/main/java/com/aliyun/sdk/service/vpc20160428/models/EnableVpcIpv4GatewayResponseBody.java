// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableVpcIpv4GatewayResponseBody} extends {@link TeaModel}
 *
 * <p>EnableVpcIpv4GatewayResponseBody</p>
 */
public class EnableVpcIpv4GatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableVpcIpv4GatewayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableVpcIpv4GatewayResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableVpcIpv4GatewayResponseBody build() {
            return new EnableVpcIpv4GatewayResponseBody(this);
        } 

    } 

}
