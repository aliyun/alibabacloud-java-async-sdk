// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CancelRepoSyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelRepoSyncTaskRequest</p>
 */
public class CancelRepoSyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String syncTaskId;

    private CancelRepoSyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.syncTaskId = builder.syncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRepoSyncTaskRequest create() {
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
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    public static final class Builder extends Request.Builder<CancelRepoSyncTaskRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String syncTaskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRepoSyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.syncTaskId = request.syncTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the replication task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rst-biu4u4pm4it5****</p>
         */
        public Builder syncTaskId(String syncTaskId) {
            this.putQueryParameter("SyncTaskId", syncTaskId);
            this.syncTaskId = syncTaskId;
            return this;
        }

        @Override
        public CancelRepoSyncTaskRequest build() {
            return new CancelRepoSyncTaskRequest(this);
        } 

    } 

}
