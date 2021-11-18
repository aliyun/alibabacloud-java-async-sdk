// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoSyncTaskRequest} extends {@link RequestModel}
 *
 * <p>GetRepoSyncTaskRequest</p>
 */
public class GetRepoSyncTaskRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SyncTaskId")
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

    public static final class Builder extends Request.Builder {
        private String instanceId; 
        private String regionId; 
        private String syncTaskId; 

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Geographical</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Synchronous task ID</p>
         */
        public Builder syncTaskId(String syncTaskId) {
            this.putQueryParameter("SyncTaskId", syncTaskId);
            this.syncTaskId = syncTaskId;
            return this;
        }

        public GetRepoSyncTaskRequest build() {
            return new GetRepoSyncTaskRequest(this);
        } 

    } 

}
