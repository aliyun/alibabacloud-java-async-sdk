// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceVpcEndpointLinkedVpcRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceVpcEndpointLinkedVpcRequest</p>
 */
public class DeleteInstanceVpcEndpointLinkedVpcRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("VswitchId")
    @Validation(required = true)
    private String vswitchId;

    private DeleteInstanceVpcEndpointLinkedVpcRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceVpcEndpointLinkedVpcRequest create() {
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
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
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

    public static final class Builder extends Request.Builder<DeleteInstanceVpcEndpointLinkedVpcRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String moduleName; 
        private String vpcId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceVpcEndpointLinkedVpcRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.moduleName = request.moduleName;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the module that you want to access. Valid values:
         * <p>
         * 
         * *   `Registry`: the image repository.
         * *   `Chart`: a Helm chart.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public DeleteInstanceVpcEndpointLinkedVpcRequest build() {
            return new DeleteInstanceVpcEndpointLinkedVpcRequest(this);
        } 

    } 

}
