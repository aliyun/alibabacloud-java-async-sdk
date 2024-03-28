// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAccelerateIpEndpointRelationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicAccelerateIpEndpointRelationResponseBody</p>
 */
public class CreateBasicAccelerateIpEndpointRelationResponseBody extends TeaModel {
    @NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private CreateBasicAccelerateIpEndpointRelationResponseBody(Builder builder) {
        this.accelerateIpId = builder.accelerateIpId;
        this.acceleratorId = builder.acceleratorId;
        this.endpointId = builder.endpointId;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicAccelerateIpEndpointRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerateIpId
     */
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
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

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String accelerateIpId; 
        private String acceleratorId; 
        private String endpointId; 
        private String requestId; 
        private String state; 

        /**
         * The ID of the accelerated IP address of the basic GA instance.
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the endpoint that is associated with the basic GA instance.
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

        /**
         * The status of the mapping between the accelerated IP address and the endpoint.
         * <p>
         * 
         * >  This parameter is not in use.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public CreateBasicAccelerateIpEndpointRelationResponseBody build() {
            return new CreateBasicAccelerateIpEndpointRelationResponseBody(this);
        } 

    } 

}
