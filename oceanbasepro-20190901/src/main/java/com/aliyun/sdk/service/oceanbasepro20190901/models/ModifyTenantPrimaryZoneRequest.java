// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link ModifyTenantPrimaryZoneRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantPrimaryZoneRequest</p>
 */
public class ModifyTenantPrimaryZoneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MasterIntranetAddressZone")
    private String masterIntranetAddressZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrimaryZone")
    private String primaryZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantEndpointDirectId")
    private String tenantEndpointDirectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantEndpointId")
    private String tenantEndpointId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserDirectVSwitchId")
    private String userDirectVSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVSwitchId")
    private String userVSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpcOwnerId")
    private String userVpcOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ModifyTenantPrimaryZoneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.masterIntranetAddressZone = builder.masterIntranetAddressZone;
        this.primaryZone = builder.primaryZone;
        this.tenantEndpointDirectId = builder.tenantEndpointDirectId;
        this.tenantEndpointId = builder.tenantEndpointId;
        this.tenantId = builder.tenantId;
        this.userDirectVSwitchId = builder.userDirectVSwitchId;
        this.userVSwitchId = builder.userVSwitchId;
        this.userVpcOwnerId = builder.userVpcOwnerId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantPrimaryZoneRequest create() {
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
     * @return masterIntranetAddressZone
     */
    public String getMasterIntranetAddressZone() {
        return this.masterIntranetAddressZone;
    }

    /**
     * @return primaryZone
     */
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    /**
     * @return tenantEndpointDirectId
     */
    public String getTenantEndpointDirectId() {
        return this.tenantEndpointDirectId;
    }

    /**
     * @return tenantEndpointId
     */
    public String getTenantEndpointId() {
        return this.tenantEndpointId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userDirectVSwitchId
     */
    public String getUserDirectVSwitchId() {
        return this.userDirectVSwitchId;
    }

    /**
     * @return userVSwitchId
     */
    public String getUserVSwitchId() {
        return this.userVSwitchId;
    }

    /**
     * @return userVpcOwnerId
     */
    public String getUserVpcOwnerId() {
        return this.userVpcOwnerId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyTenantPrimaryZoneRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String masterIntranetAddressZone; 
        private String primaryZone; 
        private String tenantEndpointDirectId; 
        private String tenantEndpointId; 
        private String tenantId; 
        private String userDirectVSwitchId; 
        private String userVSwitchId; 
        private String userVpcOwnerId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantPrimaryZoneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.masterIntranetAddressZone = request.masterIntranetAddressZone;
            this.primaryZone = request.primaryZone;
            this.tenantEndpointDirectId = request.tenantEndpointDirectId;
            this.tenantEndpointId = request.tenantEndpointId;
            this.tenantId = request.tenantId;
            this.userDirectVSwitchId = request.userDirectVSwitchId;
            this.userVSwitchId = request.userVSwitchId;
            this.userVpcOwnerId = request.userVpcOwnerId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The primary zone of the tenant.<br>It is one of the zones in which the cluster is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <pre><code>http(s)://[Endpoint]/?Action=ModifyTenantPrimaryZone
         * &amp;TenantId=ob2mr3oae0****
         * &amp;InstanceId=ob317v4uif****
         * &amp;PrimaryZone=cn-hangzhou-h
         * &amp;Common request parameters
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder masterIntranetAddressZone(String masterIntranetAddressZone) {
            this.putBodyParameter("MasterIntranetAddressZone", masterIntranetAddressZone);
            this.masterIntranetAddressZone = masterIntranetAddressZone;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder primaryZone(String primaryZone) {
            this.putBodyParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * TenantEndpointDirectId.
         */
        public Builder tenantEndpointDirectId(String tenantEndpointDirectId) {
            this.putBodyParameter("TenantEndpointDirectId", tenantEndpointDirectId);
            this.tenantEndpointDirectId = tenantEndpointDirectId;
            return this;
        }

        /**
         * TenantEndpointId.
         */
        public Builder tenantEndpointId(String tenantEndpointId) {
            this.putBodyParameter("TenantEndpointId", tenantEndpointId);
            this.tenantEndpointId = tenantEndpointId;
            return this;
        }

        /**
         * <p>The return result of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob2mr3oae0****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserDirectVSwitchId.
         */
        public Builder userDirectVSwitchId(String userDirectVSwitchId) {
            this.putBodyParameter("UserDirectVSwitchId", userDirectVSwitchId);
            this.userDirectVSwitchId = userDirectVSwitchId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        public Builder userVSwitchId(String userVSwitchId) {
            this.putBodyParameter("UserVSwitchId", userVSwitchId);
            this.userVSwitchId = userVSwitchId;
            return this;
        }

        /**
         * UserVpcOwnerId.
         */
        public Builder userVpcOwnerId(String userVpcOwnerId) {
            this.putBodyParameter("UserVpcOwnerId", userVpcOwnerId);
            this.userVpcOwnerId = userVpcOwnerId;
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

        @Override
        public ModifyTenantPrimaryZoneRequest build() {
            return new ModifyTenantPrimaryZoneRequest(this);
        } 

    } 

}
