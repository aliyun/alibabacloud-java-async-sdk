// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomRoutingEndpointsResponseBody</p>
 */
public class CreateCustomRoutingEndpointsResponseBody extends TeaModel {
    @NameInMap("EndpointIds")
    private java.util.List < String > endpointIds;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCustomRoutingEndpointsResponseBody(Builder builder) {
        this.endpointIds = builder.endpointIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoutingEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointIds
     */
    public java.util.List < String > getEndpointIds() {
        return this.endpointIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > endpointIds; 
        private String requestId; 

        /**
         * The IDs of the endpoints.
         */
        public Builder endpointIds(java.util.List < String > endpointIds) {
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * The IDs of the endpoints.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomRoutingEndpointsResponseBody build() {
            return new CreateCustomRoutingEndpointsResponseBody(this);
        } 

    } 

}
