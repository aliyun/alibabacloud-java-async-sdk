// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomRoutingEndpointGroupDestinationsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomRoutingEndpointGroupDestinationsResponseBody</p>
 */
public class CreateCustomRoutingEndpointGroupDestinationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DestinationIds")
    private java.util.List<String> destinationIds;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationIds
     */
    public java.util.List<String> getDestinationIds() {
        return this.destinationIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> destinationIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomRoutingEndpointGroupDestinationsResponseBody model) {
            this.destinationIds = model.destinationIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the endpoint group mappings.</p>
         */
        public Builder destinationIds(java.util.List<String> destinationIds) {
            this.destinationIds = destinationIds;
            return this;
        }

        /**
         * <p>The IDs of the endpoint group mappings.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
