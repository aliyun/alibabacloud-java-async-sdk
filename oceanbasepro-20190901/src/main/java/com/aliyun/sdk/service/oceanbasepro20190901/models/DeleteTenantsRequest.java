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
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TenantIds")
    @Validation(required = true)
    private String tenantIds;

    private DeleteTenantsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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
     * @return tenantIds
     */
    public String getTenantIds() {
        return this.tenantIds;
    }

    public static final class Builder extends Request.Builder<DeleteTenantsRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String tenantIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTenantsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.tenantIds = response.tenantIds;
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
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 租户的ID列表。 其为Json格式的数组，数组中每个对象都为租户名称的字符串。
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
