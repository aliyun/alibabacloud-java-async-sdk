// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoSyncTaskRequest} extends {@link RequestModel}
 *
 * <p>GetRepoSyncTaskRequest</p>
 */
public class GetRepoSyncTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SyncTaskId")
    @Validation(required = true)
    private String syncTaskId;

    private GetRepoSyncTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.syncTaskId = builder.syncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoSyncTaskRequest create() {
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

    public static final class Builder extends Request.Builder<GetRepoSyncTaskRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String syncTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoSyncTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.syncTaskId = request.syncTaskId;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the synchronization task.
         */
        public Builder syncTaskId(String syncTaskId) {
            this.putQueryParameter("SyncTaskId", syncTaskId);
            this.syncTaskId = syncTaskId;
            return this;
        }

        @Override
        public GetRepoSyncTaskRequest build() {
            return new GetRepoSyncTaskRequest(this);
        } 

    } 

}
