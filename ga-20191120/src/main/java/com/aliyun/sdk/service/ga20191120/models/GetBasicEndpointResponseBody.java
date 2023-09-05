// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicEndpointResponseBody</p>
 */
public class GetBasicEndpointResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("EndPointId")
    private String endPointId;

    @NameInMap("EndpointAddress")
    private String endpointAddress;

    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("EndpointSubAddress")
    private String endpointSubAddress;

    @NameInMap("EndpointSubAddressType")
    private String endpointSubAddressType;

    @NameInMap("EndpointType")
    private String endpointType;

    @NameInMap("EndpointZoneId")
    private String endpointZoneId;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private GetBasicEndpointResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.endPointId = builder.endPointId;
        this.endpointAddress = builder.endpointAddress;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointSubAddress = builder.endpointSubAddress;
        this.endpointSubAddressType = builder.endpointSubAddressType;
        this.endpointType = builder.endpointType;
        this.endpointZoneId = builder.endpointZoneId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return endPointId
     */
    public String getEndPointId() {
        return this.endPointId;
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
     * @return endpointSubAddress
     */
    public String getEndpointSubAddress() {
        return this.endpointSubAddress;
    }

    /**
     * @return endpointSubAddressType
     */
    public String getEndpointSubAddressType() {
        return this.endpointSubAddressType;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return endpointZoneId
     */
    public String getEndpointZoneId() {
        return this.endpointZoneId;
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
        private String endPointId; 
        private String endpointAddress; 
        private String endpointGroupId; 
        private String endpointSubAddress; 
        private String endpointSubAddressType; 
        private String endpointType; 
        private String endpointZoneId; 
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
         * The ID of the endpoint that is associated with the basic GA instance.
         */
        public Builder endPointId(String endPointId) {
            this.endPointId = endPointId;
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
         * The ID of the endpoint group to which the endpoint belongs.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
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
         * The type of the secondary address of the endpoint.
         * <p>
         * 
         * *   **primary**: a primary private IP address.
         * *   **secondary**: a secondary private IP address.
         * 
         * This parameter is returned if the type of the endpoint is set to **ECS**, **ENI**, or **NLB**. If the endpoint type is set to **NLB**, **primary** is returned.
         */
        public Builder endpointSubAddressType(String endpointSubAddressType) {
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }

        /**
         * The type of endpoint. Valid values:
         * <p>
         * 
         * *   **ENI**: elastic network interface (ENI).
         * *   **SLB**: Classic Load Balancer (CLB) instance.
         * *   **ECS**: Elastic Compute Service (ECS) instance.
         * *   **NLB**: Network Load Balancer (NLB) instance.
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The ID of the zone where the endpoint is deployed.
         * <p>
         * 
         * This parameter is returned only when the endpoint type is set to **NLB**.
         */
        public Builder endpointZoneId(String endpointZoneId) {
            this.endpointZoneId = endpointZoneId;
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

        /**
         * The status of the endpoint. Valid values:
         * <p>
         * 
         * *   **init**: The endpoint is being initialized.
         * *   **active**: The endpoint is available.
         * *   **updating**: The endpoint is being configured.
         * *   **binding**: The endpoint is being associated.
         * *   **unbinding**: The endpoint is being disassociated.
         * *   **deleting**: The endpoint is being deleted.
         * *   **bound**: The endpoint is associated.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetBasicEndpointResponseBody build() {
            return new GetBasicEndpointResponseBody(this);
        } 

    } 

}
