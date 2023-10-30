// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRequest</p>
 */
public class StartInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("VswitchId")
    private String vswitchId;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.securityGroupIds = builder.securityGroupIds;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > securityGroupIds; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.securityGroupIds = request.securityGroupIds;
            this.vswitchId = request.vswitchId;
        } 

        /**
         * The ID of the bastion host that you want to enable.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the bastion host.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * An array consisting of the IDs of security groups to which the bastion host is added.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The ID of the vSwitch to which the bastion host belongs.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public StartInstanceRequest build() {
            return new StartInstanceRequest(this);
        } 

    } 

}
