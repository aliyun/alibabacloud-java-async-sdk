// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateEndpointRequest</p>
 */
public class CreateEndpointRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("VpcId")
    private String vpcId;

    @Body
    @NameInMap("VswitchId")
    private String vswitchId;

    private CreateEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.type = builder.type;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<CreateEndpointRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String name; 
        private String type; 
        private String vpcId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.type = request.type;
            this.vpcId = request.vpcId;
            this.vswitchId = request.vswitchId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putBodyParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public CreateEndpointRequest build() {
            return new CreateEndpointRequest(this);
        } 

    } 

}
