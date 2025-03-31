// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstanceVpcEndpointLinkedVpcRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceVpcEndpointLinkedVpcRequest</p>
 */
public class CreateInstanceVpcEndpointLinkedVpcRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCreateDNSRecordInPvzt")
    private Boolean enableCreateDNSRecordInPvzt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create Alibaba Cloud DNS PrivateZone records. Valid values:</p>
         * <blockquote>
         * <p> If you enable automatic creation of PrivateZone records, a PrivateZone record is automatically created when you associate a VPC with the instance.</p>
         * </blockquote>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCreateDNSRecordInPvzt(Boolean enableCreateDNSRecordInPvzt) {
            this.putQueryParameter("EnableCreateDNSRecordInPvzt", enableCreateDNSRecordInPvzt);
            this.enableCreateDNSRecordInPvzt = enableCreateDNSRecordInPvzt;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the module that you want to access. Valid values:</p>
         * <ul>
         * <li><code>Registry</code>: image repositories.</li>
         * <li><code>Chart</code>: Helm charts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Registry</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6pa68zxnnlc48dd****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch that is associated with the specified VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6u0kn8x2gbzxfn2****</p>
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
