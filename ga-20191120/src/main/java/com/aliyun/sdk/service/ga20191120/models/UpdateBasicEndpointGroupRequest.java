// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBasicEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateBasicEndpointGroupRequest</p>
 */
public class UpdateBasicEndpointGroupRequest extends Request {
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
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

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

    private UpdateBasicEndpointGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.endpointAddress = builder.endpointAddress;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointSubAddress = builder.endpointSubAddress;
        this.endpointType = builder.endpointType;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBasicEndpointGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateBasicEndpointGroupRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String endpointAddress; 
        private String endpointGroupId; 
        private String endpointSubAddress; 
        private String endpointType; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBasicEndpointGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.endpointAddress = request.endpointAddress;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointSubAddress = request.endpointSubAddress;
            this.endpointType = request.endpointType;
            this.name = request.name;
            this.regionId = request.regionId;
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
         * The description of the endpoint group.
         * <p>
         * 
         * The description can be up to 200 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * This parameter is required only if the accelerated IP address is associated with the secondary private IP address of an ECS instance or an ENI.
         * 
         * *   If you set the endpoint type to **ECS**, you can set **EndpointSubAddress** to the secondary private IP address of the primary ENI. If you leave this parameter empty, the primary private IP address of the primary ENI is used.
         * *   If you set the endpoint type to **ENI**, you can set **EndpointSubAddress** to the secondary private IP address of the secondary ENI. If you leave this parameter empty, the primary private IP address of the secondary ENI is used.
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
         * *   **ENI**: elastic network interface (ENI).
         * *   **SLB**: Classic Load Balancer (CLB) instance.
         * *   **ECS**: Elastic Compute Service (ECS) instance.
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
         * The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where the basic GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateBasicEndpointGroupRequest build() {
            return new UpdateBasicEndpointGroupRequest(this);
        } 

    } 

}
