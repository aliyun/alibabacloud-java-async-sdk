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
 * {@link GetInventorySynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>GetInventorySynchronizationJobRequest</p>
 */
public class GetInventorySynchronizationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InventorySynchronizationJobId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String inventorySynchronizationJobId;

    private GetInventorySynchronizationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.inventorySynchronizationJobId = builder.inventorySynchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventorySynchronizationJobRequest create() {
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
     * @return inventorySynchronizationJobId
     */
    public String getInventorySynchronizationJobId() {
        return this.inventorySynchronizationJobId;
    }

    public static final class Builder extends Request.Builder<GetInventorySynchronizationJobRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String inventorySynchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetInventorySynchronizationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.inventorySynchronizationJobId = request.inventorySynchronizationJobId;
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
         * <p>The ID of the synchronization task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_xxxxxxx</p>
         */
        public Builder inventorySynchronizationJobId(String inventorySynchronizationJobId) {
            this.putQueryParameter("InventorySynchronizationJobId", inventorySynchronizationJobId);
            this.inventorySynchronizationJobId = inventorySynchronizationJobId;
            return this;
        }

        @Override
        public GetInventorySynchronizationJobRequest build() {
            return new GetInventorySynchronizationJobRequest(this);
        } 

    } 

}
