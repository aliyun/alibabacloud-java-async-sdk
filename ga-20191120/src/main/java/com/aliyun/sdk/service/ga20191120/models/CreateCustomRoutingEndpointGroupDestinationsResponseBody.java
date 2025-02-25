// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomRoutingEndpointGroupDestinationsResponseBody</p>
 */
public class CreateCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DestinationIds")
    private java.util.List < String > destinationIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomRoutingEndpointGroupDestinationsResponseBody(Builder builder) {
        this.destinationIds = builder.destinationIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoutingEndpointGroupDestinationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return destinationIds
     */
    public java.util.List < String > getDestinationIds() {
        return this.destinationIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > destinationIds; 
        private String requestId; 

        /**
         * The IDs of the endpoint group mappings.
         */
        public Builder destinationIds(java.util.List < String > destinationIds) {
            this.destinationIds = destinationIds;
            return this;
        }

        /**
         * The IDs of the endpoint group mappings.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomRoutingEndpointGroupDestinationsResponseBody build() {
            return new CreateCustomRoutingEndpointGroupDestinationsResponseBody(this);
        } 

    } 

}
