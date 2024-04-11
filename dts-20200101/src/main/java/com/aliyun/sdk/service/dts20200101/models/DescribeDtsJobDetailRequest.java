// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsJobDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsJobDetailRequest</p>
 */
public class DescribeDtsJobDetailRequest extends Request {
    @Query
    @NameInMap("DtsInstanceID")
    private String dtsInstanceID;

    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SyncSubJobHistory")
    private Boolean syncSubJobHistory;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @Query
    @NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private DescribeDtsJobDetailRequest(Builder builder) {
        super(builder);
        this.dtsInstanceID = builder.dtsInstanceID;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.syncSubJobHistory = builder.syncSubJobHistory;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceID
     */
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return syncSubJobHistory
     */
    public Boolean getSyncSubJobHistory() {
        return this.syncSubJobHistory;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<DescribeDtsJobDetailRequest, Builder> {
        private String dtsInstanceID; 
        private String dtsJobId; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean syncSubJobHistory; 
        private String synchronizationDirection; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDtsJobDetailRequest request) {
            super(request);
            this.dtsInstanceID = request.dtsInstanceID;
            this.dtsJobId = request.dtsJobId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.syncSubJobHistory = request.syncSubJobHistory;
            this.synchronizationDirection = request.synchronizationDirection;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * DescribeDtsJobDetail
         */
        public Builder dtsInstanceID(String dtsInstanceID) {
            this.putQueryParameter("DtsInstanceID", dtsInstanceID);
            this.dtsInstanceID = dtsInstanceID;
            return this;
        }

        /**
         * The state of the data migration or data synchronization task.
         * <p>
         * 
         * Valid values for a data migration task:
         * 
         * *   **NotStarted**: The migration is not started.
         * *   **Migrating**: The migration is in progress.
         * *   **Failed**: The migration failed.
         * *   **Finished**: The migration is complete.
         * 
         * Valid values for a data synchronization task:
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is in precheck.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **Initializing**: The task is performing initial synchronization.
         * *   **InitializeFailed**: Initial synchronization failed.
         * *   **Synchronizing**: The task is in progress.
         * *   **Failed**: The task failed to synchronize data.
         * *   **Suspending**: The task is paused.
         * *   **Modifying**: The objects in the task are being modified.
         * *   **Finished**: The task is complete.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SyncSubJobHistory.
         */
        public Builder syncSubJobHistory(Boolean syncSubJobHistory) {
            this.putQueryParameter("SyncSubJobHistory", syncSubJobHistory);
            this.syncSubJobHistory = syncSubJobHistory;
            return this;
        }

        /**
         * Queries the details of a data migration, data synchronization, or change tracking task.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * ZeroEtlJob.
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public DescribeDtsJobDetailRequest build() {
            return new DescribeDtsJobDetailRequest(this);
        } 

    } 

}
