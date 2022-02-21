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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        this.enableCreateDNSRecordInPvzt = builder.enableCreateDNSRecordInPvzt;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private Boolean enableCreateDNSRecordInPvzt; 
        private String instanceId; 
        private String moduleName; 
        private String regionId; 
        private String vpcId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceVpcEndpointLinkedVpcRequest response) {
            super(response);
            this.enableCreateDNSRecordInPvzt = response.enableCreateDNSRecordInPvzt;
            this.instanceId = response.instanceId;
            this.moduleName = response.moduleName;
            this.regionId = response.regionId;
            this.vpcId = response.vpcId;
            this.vswitchId = response.vswitchId;
        } 

        /**
         * EnableCreateDNSRecordInPvzt.
         */
        public Builder enableCreateDNSRecordInPvzt(Boolean enableCreateDNSRecordInPvzt) {
            this.putQueryParameter("EnableCreateDNSRecordInPvzt", enableCreateDNSRecordInPvzt);
            this.enableCreateDNSRecordInPvzt = enableCreateDNSRecordInPvzt;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VswitchId.
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
