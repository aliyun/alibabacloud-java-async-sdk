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
 * {@link ModifyTenantResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantResourceRequest</p>
 */
public class ModifyTenantResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogDisk")
    private Long logDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReadOnlyZoneList")
    @Deprecated
    private String readOnlyZoneList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private ModifyTenantResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cpu = builder.cpu;
        this.instanceId = builder.instanceId;
        this.logDisk = builder.logDisk;
        this.memory = builder.memory;
        this.readOnlyZoneList = builder.readOnlyZoneList;
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
     * @return logDisk
     */
    public Long getLogDisk() {
        return this.logDisk;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return readOnlyZoneList
     */
    public String getReadOnlyZoneList() {
        return this.readOnlyZoneList;
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
        private Long logDisk; 
        private Integer memory; 
        private String readOnlyZoneList; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cpu = request.cpu;
            this.instanceId = request.instanceId;
            this.logDisk = request.logDisk;
            this.memory = request.memory;
            this.readOnlyZoneList = request.readOnlyZoneList;
            this.tenantId = request.tenantId;
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
         * <p>The information about the CPU resources of the tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Integer cpu) {
            this.putBodyParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
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
         * <p>The size of the log disk allocated to the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder logDisk(Long logDisk) {
            this.putBodyParameter("LogDisk", logDisk);
            this.logDisk = logDisk;
            return this;
        }

        /**
         * <p>The memory size of the tenant, in GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder memory(Integer memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>Specifies to create a read-only zone. Separate the names of multiple zones with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-g-ro,cn-shanghai-h-ro</p>
         */
        public Builder readOnlyZoneList(String readOnlyZoneList) {
            this.putBodyParameter("ReadOnlyZoneList", readOnlyZoneList);
            this.readOnlyZoneList = readOnlyZoneList;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
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

        @Override
        public ModifyTenantResourceRequest build() {
            return new ModifyTenantResourceRequest(this);
        } 

    } 

}
