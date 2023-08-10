// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsJobsRequest</p>
 */
public class DescribeDtsJobsRequest extends Request {
    @Query
    @NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @Query
    @NameInMap("DtsBisLabel")
    private String dtsBisLabel;

    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("JobType")
    private String jobType;

    @Query
    @NameInMap("OrderColumn")
    private String orderColumn;

    @Query
    @NameInMap("OrderDirection")
    private String orderDirection;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("WithoutDbList")
    private Boolean withoutDbList;

    private DescribeDtsJobsRequest(Builder builder) {
        super(builder);
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.dtsBisLabel = builder.dtsBisLabel;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.groupId = builder.groupId;
        this.jobType = builder.jobType;
        this.orderColumn = builder.orderColumn;
        this.orderDirection = builder.orderDirection;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.params = builder.params;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.type = builder.type;
        this.withoutDbList = builder.withoutDbList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return dtsBisLabel
     */
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
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
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return withoutDbList
     */
    public Boolean getWithoutDbList() {
        return this.withoutDbList;
    }

    public static final class Builder extends Request.Builder<DescribeDtsJobsRequest, Builder> {
        private String dedicatedClusterId; 
        private String dtsBisLabel; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String groupId; 
        private String jobType; 
        private String orderColumn; 
        private String orderDirection; 
        private String ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String params; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private String tags; 
        private String type; 
        private Boolean withoutDbList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDtsJobsRequest request) {
            super(request);
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.dtsBisLabel = request.dtsBisLabel;
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.groupId = request.groupId;
            this.jobType = request.jobType;
            this.orderColumn = request.orderColumn;
            this.orderDirection = request.orderDirection;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.params = request.params;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.tags = request.tags;
            this.type = request.type;
            this.withoutDbList = request.withoutDbList;
        } 

        /**
         * The ID of the DTS dedicated cluster on which the task runs.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * DtsBisLabel.
         */
        public Builder dtsBisLabel(String dtsBisLabel) {
            this.putQueryParameter("DtsBisLabel", dtsBisLabel);
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking instance.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The ID of the parent task.
         * <p>
         * 
         * >  In most cases, you do not need to specify this parameter.
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
         * *   **MIGRATION**: data migration. This is the default value.
         * *   **SYNC**: data synchronization.
         * *   **SUBSCRIBE**: change tracking.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * The basis on which the returned DTS tasks are sorted. Valid values:
         * <p>
         * 
         * *   **CreateTime**: sorts the DTS tasks based on the points in time when the DTS tasks are created.
         * *   **FinishTime**: sorts the DTS tasks based on the points in time when the DTS tasks are complete.
         * *   **duLimit** sorts the DTS tasks based on the upper limits on DTS Units (DUs) that the DTS tasks can use. This option applies only to the DTS tasks that are run on a DTS dedicated cluster.
         * 
         * >  You can also set the **OrderDirection** parameter to specify whether to sort the DTS tasks in ascending or descending order.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * The order in which the returned DTS tasks are sorted. Valid values:
         * <p>
         * 
         * *   **ASC**: sorts the DTS tasks in ascending order. This is the default value.
         * *   **DESC**: sorts the DTS tasks in descending order.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of the page to return. The value must be an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The content of the query condition.
         * <p>
         * 
         * >  You must set the **Type** parameter to specify the type of the query condition.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * This parameter is discontinued.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The state of the DTS task.
         * <p>
         * 
         * Valid values for a data migration task:
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is being prechecked.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **PreCheckPass**: The task passed the precheck.
         * *   **NotConfigured**: The task is not configured.
         * *   **Migrating**: The task is in progress.
         * *   **Suspending**: The task is paused.
         * *   **MigrationFailed**: The task failed.
         * *   **Finished**: The task is complete.
         * *   **Retrying**: The task is being retried.
         * *   **Upgrade**: The task is being upgraded.
         * *   **Locked**: The task is locked.
         * *   **Downgrade**: The task is being downgraded.
         * 
         * Valid values for a data synchronization task:
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is being prechecked.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **PreCheckPass**: The task passed the precheck.
         * *   **NotConfigured**: The task is not configured.
         * *   **Initializing**: The task is being initialized.
         * *   **InitializeFailed**: Initialization failed.
         * *   **Synchronizing**: The task is in progress.
         * *   **Failed**: The task failed.
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
         * *   **Prechecking**: The task is being prechecked.
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
         * The tags of the DTS task to be queried. Specify tags in the JSON format.
         * <p>
         * 
         * >  You can call the **ListTagResources** operation to query the tag key and tag value.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The type of the query condition. Valid values:
         * <p>
         * 
         * *   **instance**: queries DTS tasks based on the ID of a DTS instance.
         * *   **name**: queries DTS tasks based on the name of a DTS instance. Fuzzy match is supported.
         * *   **srcRds**: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the source instance of a DTS task.
         * *   **rds**: queries DTS tasks based on the ID of an ApsaraDB RDS instance. The ApsaraDB RDS instance is the destination instance of a DTS task.
         * 
         * >  You must set the **Params** parameter to specify the content of the query condition.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Specifies whether to skip the **DbObject** parameter in the response. The DbObject parameter specifies the objects of the data migration, data synchronization, or change tracking task. Valid values:
         * <p>
         * 
         * - **true**: does not return **DbObject**.
         * - **false**: returns **DbObject**. If you set this parameter to false, the response time is shortened.
         */
        public Builder withoutDbList(Boolean withoutDbList) {
            this.putQueryParameter("WithoutDbList", withoutDbList);
            this.withoutDbList = withoutDbList;
            return this;
        }

        @Override
        public DescribeDtsJobsRequest build() {
            return new DescribeDtsJobsRequest(this);
        } 

    } 

}
