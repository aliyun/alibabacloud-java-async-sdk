// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCustomRoutingEndpointGroupDestinationsResponseBody</p>
 */
public class DeleteCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCustomRoutingEndpointGroupDestinationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomRoutingEndpointGroupDestinationsResponseBody create() {
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

        public DeleteCustomRoutingEndpointGroupDestinationsResponseBody build() {
            return new DeleteCustomRoutingEndpointGroupDestinationsResponseBody(this);
        } 

    } 

}
