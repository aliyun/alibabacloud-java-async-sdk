// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointsResponseBody</p>
 */
public class UpdateCustomRoutingEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointIds")
    private java.util.List < String > endpointIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCustomRoutingEndpointsResponseBody(Builder builder) {
        this.endpointIds = builder.endpointIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomRoutingEndpointsResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCustomRoutingEndpointsResponseBody build() {
            return new UpdateCustomRoutingEndpointsResponseBody(this);
        } 

    } 

}
