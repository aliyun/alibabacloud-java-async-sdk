// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link RunInventorySynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>RunInventorySynchronizationJobRequest</p>
 */
public class RunInventorySynchronizationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InventorySourceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String inventorySourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InventoryTypes")
    private java.util.List<String> inventoryTypes;

    private RunInventorySynchronizationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.inventorySourceId = builder.inventorySourceId;
        this.inventoryTypes = builder.inventoryTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInventorySynchronizationJobRequest create() {
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
     * @return inventorySourceId
     */
    public String getInventorySourceId() {
        return this.inventorySourceId;
    }

    /**
     * @return inventoryTypes
     */
    public java.util.List<String> getInventoryTypes() {
        return this.inventoryTypes;
    }

    public static final class Builder extends Request.Builder<RunInventorySynchronizationJobRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String inventorySourceId; 
        private java.util.List<String> inventoryTypes; 

        private Builder() {
            super();
        } 

        private Builder(RunInventorySynchronizationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.inventorySourceId = request.inventorySourceId;
            this.inventoryTypes = request.inventoryTypes;
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
         * <p>The ID of the IDaaS EIAM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the synchronization target.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_xxxxxx</p>
         */
        public Builder inventorySourceId(String inventorySourceId) {
            this.putQueryParameter("InventorySourceId", inventorySourceId);
            this.inventorySourceId = inventorySourceId;
            return this;
        }

        /**
         * <p>The resource types.</p>
         */
        public Builder inventoryTypes(java.util.List<String> inventoryTypes) {
            this.putQueryParameter("InventoryTypes", inventoryTypes);
            this.inventoryTypes = inventoryTypes;
            return this;
        }

        @Override
        public RunInventorySynchronizationJobRequest build() {
            return new RunInventorySynchronizationJobRequest(this);
        } 

    } 

}
