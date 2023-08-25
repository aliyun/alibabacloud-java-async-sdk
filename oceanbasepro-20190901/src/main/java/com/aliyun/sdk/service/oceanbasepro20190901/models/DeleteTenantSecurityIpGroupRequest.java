// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTenantSecurityIpGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteTenantSecurityIpGroupRequest</p>
 */
public class DeleteTenantSecurityIpGroupRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("SecurityIpGroupName")
    @Validation(required = true)
    private String securityIpGroupName;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DeleteTenantSecurityIpGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.securityIpGroupName = builder.securityIpGroupName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTenantSecurityIpGroupRequest create() {
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
     * @return securityIpGroupName
     */
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DeleteTenantSecurityIpGroupRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String securityIpGroupName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTenantSecurityIpGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.securityIpGroupName = request.securityIpGroupName;
            this.tenantId = request.tenantId;
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
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The group name of the whitelist group of IP addresses.
         * <p>
         * 
         * It starts with lowercase letters and ends with lowercase letters or numbers. It can only contain lowercase letters, numbers, and underscores, and should be 2~32 characters in length.
         */
        public Builder securityIpGroupName(String securityIpGroupName) {
            this.putBodyParameter("SecurityIpGroupName", securityIpGroupName);
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DeleteTenantSecurityIpGroupRequest build() {
            return new DeleteTenantSecurityIpGroupRequest(this);
        } 

    } 

}
