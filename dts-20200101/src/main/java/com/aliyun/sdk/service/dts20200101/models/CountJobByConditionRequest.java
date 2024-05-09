// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountJobByConditionRequest} extends {@link RequestModel}
 *
 * <p>CountJobByConditionRequest</p>
 */
public class CountJobByConditionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDbType")
    private String destDbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDbType")
    private String srcDbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CountJobByConditionRequest(Builder builder) {
        super(builder);
        this.destDbType = builder.destDbType;
        this.groupId = builder.groupId;
        this.jobType = builder.jobType;
        this.params = builder.params;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.srcDbType = builder.srcDbType;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountJobByConditionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destDbType
     */
    public String getDestDbType() {
        return this.destDbType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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
     * @return srcDbType
     */
    public String getSrcDbType() {
        return this.srcDbType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CountJobByConditionRequest, Builder> {
        private String destDbType; 
        private String groupId; 
        private String jobType; 
        private String params; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private String srcDbType; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CountJobByConditionRequest request) {
            super(request);
            this.destDbType = request.destDbType;
            this.groupId = request.groupId;
            this.jobType = request.jobType;
            this.params = request.params;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.srcDbType = request.srcDbType;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * The type of the destination database.
         */
        public Builder destDbType(String destDbType) {
            this.putQueryParameter("DestDbType", destDbType);
            this.destDbType = destDbType;
            return this;
        }

        /**
         * The ID of the DTS task.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The type of the DTS task. Valid values:
         * <p>
         * 
         * *   **MIGRATION**: data migration task
         * *   **SYNC**: data synchronization task
         * *   **SUBSCRIBE**: change tracking task
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * The content of the query condition, which corresponds to the value of the JobType parameter.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * One of the query conditions. The ID of the region. For more information, see [Supported regions](~~141033~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The ID of the region in which the DTS instance resides. For more information, see [Supported regions](~~141033~~).
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
         * The type of the source database.
         */
        public Builder srcDbType(String srcDbType) {
            this.putQueryParameter("SrcDbType", srcDbType);
            this.srcDbType = srcDbType;
            return this;
        }

        /**
         * The status of the DTS task.
         * <p>
         * 
         * Valid values for a data migration task:
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is in precheck.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **PreCheckPass**: The task passed the precheck.
         * *   **NotConfigured**: The task is not configured.
         * *   **Migrating**: The task is in progress.
         * *   **Suspending**: The task is paused.
         * *   **MigrationFailed**: The task failed to migrate data.
         * *   **Finished**: The task is complete.
         * *   **Retrying**: The task is being retried.
         * *   **Upgrade**: The task is being upgraded.
         * *   **Locked**: The task is locked.
         * *   **Downgrade**: The task is being downgraded.
         * 
         * Valid values for a data synchronization task:
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is in precheck.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **PreCheckPass**: The task passed the precheck.
         * *   **NotConfigured**: The task is not configured.
         * *   **Initializing**: The task is performing initial synchronization.
         * *   **InitializeFailed**: Initial synchronization failed.
         * *   **Synchronizing**: The task is in progress.
         * *   **Failed**: The task failed to synchronize data.
         * *   **Suspending**: The task is paused.
         * *   **Modifying**: The objects in the task are being modified.
         * *   **Finished**: The task is complete.
         * *   **Retrying**: The task is being retried.
         * *   **Upgrade**: The task is being upgraded.
         * *   **Locked**: The task is locked.
         * *   **Downgrade**: The task is being downgraded.
         * 
         * Valid values for a change tracking task:
         * 
         * *   **NotConfigured**: The task is not configured.
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is in precheck.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **PreCheckPass**: The task passed the precheck.
         * *   **Starting**: The task is being started.
         * *   **Normal**: The task is running as expected.
         * *   **Retrying**: The task is being retried.
         * *   **Abnormal**: The task is not running as expected.
         * *   **Upgrade**: The task is being upgraded.
         * *   **Locked**: The task is locked.
         * *   **Downgrade**: The task is being downgraded.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The content of the query condition. Valid values:
         * <p>
         * 
         * *   **name**: the name of the task
         * *   **rds**: the ID of the destination instance
         * *   **instance**: the ID of the Data Transmission Service (DTS) instance
         * *   **srcRds**: the ID of the source instance
         * 
         * > The value of this parameter corresponds to the value of the **JobType** parameter.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CountJobByConditionRequest build() {
            return new CountJobByConditionRequest(this);
        } 

    } 

}
