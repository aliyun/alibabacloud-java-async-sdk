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
    @Validation(required = true)
    private String endpointAddress;

    @Query
    @NameInMap("EndpointGroupRegion")
    @Validation(required = true)
    private String endpointGroupRegion;

    @Query
    @NameInMap("EndpointType")
    @Validation(required = true)
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
        private String endpointType; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicEndpointGroupRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.endpointAddress = response.endpointAddress;
            this.endpointGroupRegion = response.endpointGroupRegion;
            this.endpointType = response.endpointType;
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * 全球加速实例Id
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * 客户端Token
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 终端节点组描述
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 终端节点地址
         */
        public Builder endpointAddress(String endpointAddress) {
            this.putQueryParameter("EndpointAddress", endpointAddress);
            this.endpointAddress = endpointAddress;
            return this;
        }

        /**
         * 终端节点组所在地域
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.putQueryParameter("EndpointGroupRegion", endpointGroupRegion);
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * 终端节点类型
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * 终端节点组名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Regionid
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
