// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicEndpointGroupRequest</p>
 */
public class CreateBasicEndpointGroupRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndpointAddress")
    private String endpointAddress;

    @Query
    @NameInMap("EndpointGroupRegion")
    @Validation(required = true)
    private String endpointGroupRegion;

    @Query
    @NameInMap("EndpointSubAddress")
    private String endpointSubAddress;

    @Query
    @NameInMap("EndpointType")
    private String endpointType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateBasicEndpointGroupRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.endpointAddress = builder.endpointAddress;
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.endpointSubAddress = builder.endpointSubAddress;
        this.endpointType = builder.endpointType;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicEndpointGroupRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicEndpointGroupRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String description; 
        private String endpointAddress; 
        private String endpointGroupRegion; 
        private String endpointSubAddress; 
        private String endpointType; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicEndpointGroupRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.endpointAddress = request.endpointAddress;
            this.endpointGroupRegion = request.endpointGroupRegion;
            this.endpointSubAddress = request.endpointSubAddress;
            this.endpointType = request.endpointType;
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
         * You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the endpoint group.
         * <p>
         * 
         * The description cannot exceed 256 characters in length and cannot contain `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The endpoint address.
         */
        public Builder endpointAddress(String endpointAddress) {
            this.putQueryParameter("EndpointAddress", endpointAddress);
            this.endpointAddress = endpointAddress;
            return this;
        }

        /**
         * The ID of the region where you want to create the endpoint group.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.putQueryParameter("EndpointGroupRegion", endpointGroupRegion);
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * The secondary address of the endpoint.
         * <p>
         * 
         * You must specify this parameter when the accelerated IP address is associated with the secondary private IP address of an Elastic Compute Service (ECS) instance or an elastic network interface (ENI).
         * 
         * *   When the endpoint type is **ECS**, you can set **EndpointSubAddress** to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.
         * *   If the endpoint type is **ENI**, you can set **EndpointSubAddress** to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.
         */
        public Builder endpointSubAddress(String endpointSubAddress) {
            this.putQueryParameter("EndpointSubAddress", endpointSubAddress);
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }

        /**
         * The type of the endpoint. Valid values:
         * <p>
         * 
         * *   **ENI**
         * *   **SLB**
         * *   **ECS**
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The name of the endpoint group.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateBasicEndpointGroupRequest build() {
            return new CreateBasicEndpointGroupRequest(this);
        } 

    } 

}
