// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantPrimaryZoneRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantPrimaryZoneRequest</p>
 */
public class ModifyTenantPrimaryZoneRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("MasterIntranetAddressZone")
    private String masterIntranetAddressZone;

    @Body
    @NameInMap("PrimaryZone")
    private String primaryZone;

    @Body
    @NameInMap("TenantEndpointDirectId")
    private String tenantEndpointDirectId;

    @Body
    @NameInMap("TenantEndpointId")
    private String tenantEndpointId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("UserDirectVSwitchId")
    private String userDirectVSwitchId;

    @Body
    @NameInMap("UserVSwitchId")
    private String userVSwitchId;

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
         * The primary zone of the tenant.    
         * <p>
         * It is one of the zones in which the cluster is deployed.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=ModifyTenantPrimaryZone
         * &TenantId=ob2mr3oae0****
         * &InstanceId=ob317v4uif****
         * &PrimaryZone=cn-hangzhou-h
         * &Common request parameters
         * ```
         */
        public Builder masterIntranetAddressZone(String masterIntranetAddressZone) {
            this.putBodyParameter("MasterIntranetAddressZone", masterIntranetAddressZone);
            this.masterIntranetAddressZone = masterIntranetAddressZone;
            return this;
        }

        /**
         * The ID of the vSwitch.
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
         * The return result of the request.
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
         * The request ID.
         */
        public Builder userVSwitchId(String userVSwitchId) {
            this.putBodyParameter("UserVSwitchId", userVSwitchId);
            this.userVSwitchId = userVSwitchId;
            return this;
        }

        @Override
        public ModifyTenantPrimaryZoneRequest build() {
            return new ModifyTenantPrimaryZoneRequest(this);
        } 

    } 

}
