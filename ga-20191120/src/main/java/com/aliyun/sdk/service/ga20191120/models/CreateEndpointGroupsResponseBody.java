// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEndpointGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEndpointGroupsResponseBody</p>
 */
public class CreateEndpointGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointGroupIds")
    private java.util.List < String > endpointGroupIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEndpointGroupsResponseBody(Builder builder) {
        this.endpointGroupIds = builder.endpointGroupIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEndpointGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroupIds
     */
    public java.util.List < String > getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > endpointGroupIds; 
        private String requestId; 

        /**
         * The IDs of the endpoint groups.
         */
        public Builder endpointGroupIds(java.util.List < String > endpointGroupIds) {
            this.endpointGroupIds = endpointGroupIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEndpointGroupsResponseBody build() {
            return new CreateEndpointGroupsResponseBody(this);
        } 

    } 

}
