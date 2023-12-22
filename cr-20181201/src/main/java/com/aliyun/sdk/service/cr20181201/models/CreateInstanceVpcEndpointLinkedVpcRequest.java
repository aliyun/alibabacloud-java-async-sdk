// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceVpcEndpointLinkedVpcRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceVpcEndpointLinkedVpcRequest</p>
 */
public class CreateInstanceVpcEndpointLinkedVpcRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("EnableCreateDNSRecordInPvzt")
    private Boolean enableCreateDNSRecordInPvzt;

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

    private CreateInstanceVpcEndpointLinkedVpcRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enableCreateDNSRecordInPvzt = builder.enableCreateDNSRecordInPvzt;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceVpcEndpointLinkedVpcRequest create() {
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
     * @return enableCreateDNSRecordInPvzt
     */
    public Boolean getEnableCreateDNSRecordInPvzt() {
        return this.enableCreateDNSRecordInPvzt;
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

    public static final class Builder extends Request.Builder<CreateInstanceVpcEndpointLinkedVpcRequest, Builder> {
        private String regionId; 
        private Boolean enableCreateDNSRecordInPvzt; 
        private String instanceId; 
        private String moduleName; 
        private String vpcId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceVpcEndpointLinkedVpcRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enableCreateDNSRecordInPvzt = request.enableCreateDNSRecordInPvzt;
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
         * Specifies whether to automatically create Alibaba Cloud DNS PrivateZone records. Valid values:
         * <p>
         * 
         * >  If you enable automatic creation of PrivateZone records, a PrivateZone record is automatically created when you associate a VPC with the instance.
         * 
         * *   `true`
         * *   `false`
         */
        public Builder enableCreateDNSRecordInPvzt(Boolean enableCreateDNSRecordInPvzt) {
            this.putQueryParameter("EnableCreateDNSRecordInPvzt", enableCreateDNSRecordInPvzt);
            this.enableCreateDNSRecordInPvzt = enableCreateDNSRecordInPvzt;
            return this;
        }

        /**
         * The instance ID.
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
         * *   `Registry`: image repositories.
         * *   `Chart`: Helm charts.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * The VPC ID.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The ID of the vSwitch that is associated with the specified VPC.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public CreateInstanceVpcEndpointLinkedVpcRequest build() {
            return new CreateInstanceVpcEndpointLinkedVpcRequest(this);
        } 

    } 

}
