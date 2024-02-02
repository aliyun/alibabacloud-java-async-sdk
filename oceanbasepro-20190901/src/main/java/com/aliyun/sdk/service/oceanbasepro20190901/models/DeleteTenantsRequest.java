// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTenantsRequest} extends {@link RequestModel}
 *
 * <p>DeleteTenantsRequest</p>
 */
public class DeleteTenantsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TenantIds")
    @Validation(required = true)
    private String tenantIds;

    private DeleteTenantsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.tenantIds = builder.tenantIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTenantsRequest create() {
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
     * @return tenantIds
     */
    public String getTenantIds() {
        return this.tenantIds;
    }

    public static final class Builder extends Request.Builder<DeleteTenantsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String tenantIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTenantsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.tenantIds = request.tenantIds;
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
         * You can call this operation to delete one or more tenants from an OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=DeleteTenants
         * &TenantIds=["ob2mr3oae0****", "ob2mr3oae1****"]
         * &InstanceId=ob317v4uif****
         * &Common request parameters
         * ```
         */
        public Builder tenantIds(String tenantIds) {
            this.putBodyParameter("TenantIds", tenantIds);
            this.tenantIds = tenantIds;
            return this;
        }

        @Override
        public DeleteTenantsRequest build() {
            return new DeleteTenantsRequest(this);
        } 

    } 

}
