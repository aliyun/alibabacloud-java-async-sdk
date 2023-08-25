// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantSecurityIpGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantSecurityIpGroupRequest</p>
 */
public class CreateTenantSecurityIpGroupRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
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
    @NameInMap("SecurityIps")
    @Validation(required = true)
    private String securityIps;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private CreateTenantSecurityIpGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.securityIpGroupName = builder.securityIpGroupName;
        this.securityIps = builder.securityIps;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantSecurityIpGroupRequest create() {
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
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateTenantSecurityIpGroupRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String securityIpGroupName; 
        private String securityIps; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantSecurityIpGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.securityIpGroupName = request.securityIpGroupName;
            this.securityIps = request.securityIps;
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
         * The list of IP addresses in the whitelist group.
         * <p>
         * 
         * It is a JSON array. Each object in the array is an IP address or a CIDR block. You can have up to 40 whitelists.
         */
        public Builder securityIps(String securityIps) {
            this.putBodyParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
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
        public CreateTenantSecurityIpGroupRequest build() {
            return new CreateTenantSecurityIpGroupRequest(this);
        } 

    } 

}
