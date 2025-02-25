// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRequest</p>
 */
public class StartInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSecurityGroupIds")
    private java.util.List < String > clientSecurityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePortalPrivateAccess")
    private Boolean enablePortalPrivateAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > securityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveVswitchId")
    private String slaveVswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.clientSecurityGroupIds = builder.clientSecurityGroupIds;
        this.enablePortalPrivateAccess = builder.enablePortalPrivateAccess;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.securityGroupIds = builder.securityGroupIds;
        this.slaveVswitchId = builder.slaveVswitchId;
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
     * @return clientSecurityGroupIds
     */
    public java.util.List < String > getClientSecurityGroupIds() {
        return this.clientSecurityGroupIds;
    }

    /**
     * @return enablePortalPrivateAccess
     */
    public Boolean getEnablePortalPrivateAccess() {
        return this.enablePortalPrivateAccess;
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
     * @return slaveVswitchId
     */
    public String getSlaveVswitchId() {
        return this.slaveVswitchId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private java.util.List < String > clientSecurityGroupIds; 
        private Boolean enablePortalPrivateAccess; 
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > securityGroupIds; 
        private String slaveVswitchId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest request) {
            super(request);
            this.clientSecurityGroupIds = request.clientSecurityGroupIds;
            this.enablePortalPrivateAccess = request.enablePortalPrivateAccess;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.securityGroupIds = request.securityGroupIds;
            this.slaveVswitchId = request.slaveVswitchId;
            this.vswitchId = request.vswitchId;
        } 

        /**
         * ClientSecurityGroupIds.
         */
        public Builder clientSecurityGroupIds(java.util.List < String > clientSecurityGroupIds) {
            this.putQueryParameter("ClientSecurityGroupIds", clientSecurityGroupIds);
            this.clientSecurityGroupIds = clientSecurityGroupIds;
            return this;
        }

        /**
         * EnablePortalPrivateAccess.
         */
        public Builder enablePortalPrivateAccess(Boolean enablePortalPrivateAccess) {
            this.putQueryParameter("EnablePortalPrivateAccess", enablePortalPrivateAccess);
            this.enablePortalPrivateAccess = enablePortalPrivateAccess;
            return this;
        }

        /**
         * <p>The ID of the bastion host that you want to enable.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1gh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>An array consisting of the IDs of security groups to which the bastion host is added.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1aiupc4yjqgmm****</p>
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * SlaveVswitchId.
         */
        public Builder slaveVswitchId(String slaveVswitchId) {
            this.putQueryParameter("SlaveVswitchId", slaveVswitchId);
            this.slaveVswitchId = slaveVswitchId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the bastion host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xfwzzfti0kjbf****</p>
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
