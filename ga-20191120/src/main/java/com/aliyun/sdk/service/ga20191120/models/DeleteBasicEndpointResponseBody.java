// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBasicEndpointResponseBody</p>
 */
public class DeleteBasicEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteBasicEndpointResponseBody(Builder builder) {
        this.endpointId = builder.endpointId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String endpointId; 
        private String requestId; 

        /**
         * The ID of the endpoint.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBasicEndpointResponseBody build() {
            return new DeleteBasicEndpointResponseBody(this);
        } 

    } 

}
