// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateInstanceVpcEndpointLinkedVpcRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceVpcEndpointLinkedVpcRequest</p>
 */
public class CreateInstanceVpcEndpointLinkedVpcRequest extends Request {
    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("VswitchId")
    private String vswitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Host
    @NameInMap("RegionId")
    private String regionId;


    private CreateInstanceVpcEndpointLinkedVpcRequest(Builder builder) {
        super(builder);
        this.moduleName = builder.moduleName;
        this.instanceId = builder.instanceId;
        this.vswitchId = builder.vswitchId;
        this.vpcId = builder.vpcId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceVpcEndpointLinkedVpcRequest create() {
        return builder().build();
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String moduleName; 
        private String instanceId; 
        private String vswitchId; 
        private String vpcId; 
        private String regionId; 

        /**
         * <p>The module to be accessed. Valid values:

-"Registration": Access the image repository

-"Chart": access Helm Chart</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public CreateInstanceVpcEndpointLinkedVpcRequest build() {
            return new CreateInstanceVpcEndpointLinkedVpcRequest(this);
        } 

    } 

}
