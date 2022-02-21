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
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PrimaryZone")
    @Validation(required = true)
    private String primaryZone;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private ModifyTenantPrimaryZoneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.primaryZone = builder.primaryZone;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return primaryZone
     */
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ModifyTenantPrimaryZoneRequest, Builder> {
        private String instanceId; 
        private String primaryZone; 
        private String regionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantPrimaryZoneRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.primaryZone = response.primaryZone;
            this.regionId = response.regionId;
            this.tenantId = response.tenantId;
        } 

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 租户的主可用区。 其为集群部署可用区中的一个。
         */
        public Builder primaryZone(String primaryZone) {
            this.putBodyParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 租户ID。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ModifyTenantPrimaryZoneRequest build() {
            return new ModifyTenantPrimaryZoneRequest(this);
        } 

    } 

}
