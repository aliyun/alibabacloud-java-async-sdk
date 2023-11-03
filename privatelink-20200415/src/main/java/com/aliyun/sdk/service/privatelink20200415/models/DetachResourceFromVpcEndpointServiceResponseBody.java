// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachResourceFromVpcEndpointServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DetachResourceFromVpcEndpointServiceResponseBody</p>
 */
public class DetachResourceFromVpcEndpointServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DetachResourceFromVpcEndpointServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachResourceFromVpcEndpointServiceResponseBody create() {
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

        public DetachResourceFromVpcEndpointServiceResponseBody build() {
            return new DetachResourceFromVpcEndpointServiceResponseBody(this);
        } 

    } 

}
