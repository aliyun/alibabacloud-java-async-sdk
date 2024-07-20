// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicEndpointGroupResponseBody</p>
 */
public class GetBasicEndpointGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EndpointAddress")
    private String endpointAddress;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupRegion")
    private String endpointGroupRegion;

    @com.aliyun.core.annotation.NameInMap("EndpointSubAddress")
    private String endpointSubAddress;

    @com.aliyun.core.annotation.NameInMap("EndpointType")
    private String endpointType;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private GetBasicEndpointGroupResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.description = builder.description;
        this.endpointAddress = builder.endpointAddress;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.endpointSubAddress = builder.endpointSubAddress;
        this.endpointType = builder.endpointType;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicEndpointGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpointAddress
     */
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointGroupRegion
     */
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
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

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String description; 
        private String endpointAddress; 
        private String endpointGroupId; 
        private String endpointGroupRegion; 
        private String endpointSubAddress; 
        private String endpointType; 
        private String name; 
        private String requestId; 
        private String state; 

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The description of the endpoint group.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The address of the endpoint.
         */
        public Builder endpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the region where the endpoint group resides.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
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
         * The type of endpoint. Valid values:
         * <p>
         * 
         * *   **ENI**: elastic network interface (ENI).
         * *   **SLB**: Classic Load Balancer (CLB) instance.
         * *   **ECS**: Elastic Compute Service (ECS) instance.
         * *   **NLB**: Network Load Balancer (NLB) instance
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The name of the endpoint group.
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

        /**
         * The status of the endpoint group. Valid values:
         * <p>
         * 
         * *   **init**: being initialized.
         * *   **active**: running as expected.
         * *   **updating**: being updated.
         * *   **deleting**: being deleted.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetBasicEndpointGroupResponseBody build() {
            return new GetBasicEndpointGroupResponseBody(this);
        } 

    } 

}
