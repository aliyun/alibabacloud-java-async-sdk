// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicEndpointRequest</p>
 */
public class CreateBasicEndpointRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointAddress")
    @Validation(required = true)
    private String endpointAddress;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    @Query
    @NameInMap("EndpointSubAddress")
    private String endpointSubAddress;

    @Query
    @NameInMap("EndpointSubAddressType")
    private String endpointSubAddressType;

    @Query
    @NameInMap("EndpointType")
    @Validation(required = true)
    private String endpointType;

    @Query
    @NameInMap("EndpointZoneId")
    private String endpointZoneId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
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
         * The name of the endpoint.
         * <p>
         * 
         * The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
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
