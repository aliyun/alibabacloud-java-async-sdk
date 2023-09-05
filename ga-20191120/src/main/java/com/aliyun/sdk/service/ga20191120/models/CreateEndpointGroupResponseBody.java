// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEndpointGroupResponseBody</p>
 */
public class CreateEndpointGroupResponseBody extends TeaModel {
    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateEndpointGroupResponseBody(Builder builder) {
        this.endpointGroupId = builder.endpointGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEndpointGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String endpointGroupId; 
        private String requestId; 

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEndpointGroupResponseBody build() {
            return new CreateEndpointGroupResponseBody(this);
        } 

    } 

}
