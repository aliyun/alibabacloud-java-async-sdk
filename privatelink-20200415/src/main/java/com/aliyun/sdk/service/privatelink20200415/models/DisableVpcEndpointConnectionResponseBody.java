// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableVpcEndpointConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>DisableVpcEndpointConnectionResponseBody</p>
 */
public class DisableVpcEndpointConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableVpcEndpointConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableVpcEndpointConnectionResponseBody create() {
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

        public DisableVpcEndpointConnectionResponseBody build() {
            return new DisableVpcEndpointConnectionResponseBody(this);
        } 

    } 

}
