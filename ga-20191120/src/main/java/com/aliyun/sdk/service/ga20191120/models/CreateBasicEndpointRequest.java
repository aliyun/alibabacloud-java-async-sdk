// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicEndpointRequest</p>
 */
public class CreateBasicEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointSubAddress")
    private String endpointSubAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointSubAddressType")
    private String endpointSubAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointZoneId")
    private String endpointZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateBasicEndpointRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointAddress = builder.endpointAddress;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointSubAddress = builder.endpointSubAddress;
        this.endpointSubAddressType = builder.endpointSubAddressType;
        this.endpointType = builder.endpointType;
        this.endpointZoneId = builder.endpointZoneId;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicEndpointRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String endpointAddress; 
        private String endpointGroupId; 
        private String endpointSubAddress; 
        private String endpointSubAddressType; 
        private String endpointType; 
        private String endpointZoneId; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicEndpointRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.endpointAddress = request.endpointAddress;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointSubAddress = request.endpointSubAddress;
            this.endpointSubAddressType = request.endpointSubAddressType;
            this.endpointType = request.endpointType;
            this.endpointZoneId = request.endpointZoneId;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The address of the endpoint.
         */
        public Builder endpointAddress(String endpointAddress) {
            this.putQueryParameter("EndpointAddress", endpointAddress);
            this.endpointAddress = endpointAddress;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The secondary address of the endpoint.
         * <p>
         * 
         * This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**.
         * 
         * *   If the endpoint type is **ECS**, you can set **EndpointSubAddress** to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.
         * *   If the endpoint type is **ENI**, you can set **EndpointSubAddress** to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.
         * *   This parameter is required if the endpoint type is **NLB**. **EndpointSubAddress** is the primary private IP address of the NLB backend server.
         */
        public Builder endpointSubAddress(String endpointSubAddress) {
            this.putQueryParameter("EndpointSubAddress", endpointSubAddress);
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }

        /**
         * The type of the secondary address of the endpoint. Valid values:
         * <p>
         * 
         * *   **primary**: a primary private IP address.
         * *   **secondary**: a secondary private IP address.
         * 
         * This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**. If the endpoint type is **NLB**, only **primary** is supported.
         */
        public Builder endpointSubAddressType(String endpointSubAddressType) {
            this.putQueryParameter("EndpointSubAddressType", endpointSubAddressType);
            this.endpointSubAddressType = endpointSubAddressType;
            return this;
        }

        /**
         * The type of endpoint. Valid values:
         * <p>
         * 
         * *   **ENI**: elastic network interface (ENI)
         * *   **SLB**: Classic Load Balancer (CLB)
         * *   **ECS**: Elastic Compute Service (ECS)
         * *   **NLB**: Network Load Balancer (NLB)
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The zone ID of the endpoint.
         * <p>
         * 
         * This parameter is required only if the endpoint type is **NLB**.
         */
        public Builder endpointZoneId(String endpointZoneId) {
            this.putQueryParameter("EndpointZoneId", endpointZoneId);
            this.endpointZoneId = endpointZoneId;
            return this;
        }

        /**
         * The name of the endpoint that is associated with the basic GA instance.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateBasicEndpointRequest build() {
            return new CreateBasicEndpointRequest(this);
        } 

    } 

}
