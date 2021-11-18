// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteInstanceVpcEndpointLinkedVpcRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceVpcEndpointLinkedVpcRequest</p>
 */
public class DeleteInstanceVpcEndpointLinkedVpcRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VswitchId")
    private String vswitchId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;


    private DeleteInstanceVpcEndpointLinkedVpcRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.vpcId = builder.vpcId;
        this.regionId = builder.regionId;
        this.vswitchId = builder.vswitchId;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceVpcEndpointLinkedVpcRequest create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String vpcId; 
        private String regionId; 
        private String vswitchId; 
        private String moduleName; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * <p>The ID of the vSwitch.</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

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

        public DeleteInstanceVpcEndpointLinkedVpcRequest build() {
            return new DeleteInstanceVpcEndpointLinkedVpcRequest(this);
        } 

    } 

}
