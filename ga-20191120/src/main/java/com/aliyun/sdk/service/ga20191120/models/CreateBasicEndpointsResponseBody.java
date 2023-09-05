// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicEndpointsResponseBody</p>
 */
public class CreateBasicEndpointsResponseBody extends TeaModel {
    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBasicEndpointsResponseBody(Builder builder) {
        this.endpointGroupId = builder.endpointGroupId;
        this.endpoints = builder.endpoints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String endpointGroupId; 
        private java.util.List < Endpoints> endpoints; 
        private String requestId; 

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The endpoints in the endpoint group.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBasicEndpointsResponseBody build() {
            return new CreateBasicEndpointsResponseBody(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @NameInMap("EndpointAddress")
        private String endpointAddress;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointSubAddress")
        private String endpointSubAddress;

        @NameInMap("EndpointType")
        private String endpointType;

        private Endpoints(Builder builder) {
            this.endpointAddress = builder.endpointAddress;
            this.endpointId = builder.endpointId;
            this.endpointSubAddress = builder.endpointSubAddress;
            this.endpointType = builder.endpointType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpointAddress
         */
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointSubAddress
         */
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        public static final class Builder {
            private String endpointAddress; 
            private String endpointId; 
            private String endpointSubAddress; 
            private String endpointType; 

            /**
             * The address of the endpoint.
             */
            public Builder endpointAddress(String endpointAddress) {
                this.endpointAddress = endpointAddress;
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
             * The secondary address of the endpoint.
             * <p>
             * 
             * This parameter is returned if the endpoint type is **ECS**, **ENI**, or **NLB**.
             * 
             * *   If the endpoint type is **ECS**, **EndpointSubAddress** returns the primary or secondary private IP address of the primary ENI.
             * *   If the endpoint type is **ENI**, **EndpointSubAddress** returns the primary or secondary private IP address of the secondary ENI.
             * *   If the endpoint type is **NLB**, **EndpointSubAddress** returns the primary private IP address of the NLB backend server.
             */
            public Builder endpointSubAddress(String endpointSubAddress) {
                this.endpointSubAddress = endpointSubAddress;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **ENI:** ENI.
             * *   **SLB:** CLB instance.
             * *   **ECS:** ECS instance.
             * *   **NLB:** NLB instance.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
