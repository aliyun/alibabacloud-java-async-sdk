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
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SyncTaskId")
    @Validation(required = true)
    private String syncTaskId;

    private GetRepoSyncTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    public static final class Builder extends Request.Builder<GetRepoSyncTaskRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String syncTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetRepoSyncTaskRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.syncTaskId = response.syncTaskId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * SyncTaskId.
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
