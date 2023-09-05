// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBasicEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBasicEndpointResponseBody</p>
 */
public class UpdateBasicEndpointResponseBody extends TeaModel {
    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateBasicEndpointResponseBody(Builder builder) {
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointId = builder.endpointId;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBasicEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String endpointGroupId; 
        private String endpointId; 
        private String name; 
        private String requestId; 

        /**
         * The ID of the endpoint group to which the endpoints belong.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the endpoint.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The name of the endpoint.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBasicEndpointResponseBody build() {
            return new UpdateBasicEndpointResponseBody(this);
        } 

    } 

}
