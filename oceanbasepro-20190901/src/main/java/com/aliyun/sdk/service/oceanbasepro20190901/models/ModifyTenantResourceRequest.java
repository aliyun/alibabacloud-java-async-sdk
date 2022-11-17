// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantResourceRequest</p>
 */
public class ModifyTenantResourceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("Cpu")
    @Validation(required = true)
    private Integer cpu;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Memory")
    @Validation(required = true)
    private Integer memory;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private ModifyTenantResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cpu = builder.cpu;
        this.instanceId = builder.instanceId;
        this.memory = builder.memory;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantResourceRequest create() {
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
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ModifyTenantResourceRequest, Builder> {
        private String regionId; 
        private Integer cpu; 
        private String instanceId; 
        private Integer memory; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cpu = request.cpu;
            this.instanceId = request.instanceId;
            this.memory = request.memory;
            this.tenantId = request.tenantId;
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
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.putBodyParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
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
         * 租户内存大小，单位GB。
         */
        public Builder memory(Integer memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
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
        public ModifyTenantResourceRequest build() {
            return new ModifyTenantResourceRequest(this);
        } 

    } 

}
