// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadTaskRequest</p>
 */
public class DescribeDownloadTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BackupSetId")
    private String backupSetId;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("DatasourceId")
    private String datasourceId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("OrderColumn")
    private String orderColumn;

    @Query
    @NameInMap("OrderDirect")
    private String orderDirect;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionCode")
    @Validation(required = true)
    private String regionCode;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    private DescribeDownloadTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupSetId = builder.backupSetId;
        this.currentPage = builder.currentPage;
        this.datasourceId = builder.datasourceId;
        this.endTime = builder.endTime;
        this.instanceName = builder.instanceName;
        this.orderColumn = builder.orderColumn;
        this.orderDirect = builder.orderDirect;
        this.pageSize = builder.pageSize;
        this.regionCode = builder.regionCode;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadTaskRequest create() {
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
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return datasourceId
     */
    public String getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return orderDirect
     */
    public String getOrderDirect() {
        return this.orderDirect;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeDownloadTaskRequest, Builder> {
        private String regionId; 
        private String backupSetId; 
        private String currentPage; 
        private String datasourceId; 
        private String endTime; 
        private String instanceName; 
        private String orderColumn; 
        private String orderDirect; 
        private String pageSize; 
        private String regionCode; 
        private String startTime; 
        private String state; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupSetId = request.backupSetId;
            this.currentPage = request.currentPage;
            this.datasourceId = request.datasourceId;
            this.endTime = request.endTime;
            this.instanceName = request.instanceName;
            this.orderColumn = request.orderColumn;
            this.orderDirect = request.orderDirect;
            this.pageSize = request.pageSize;
            this.regionCode = request.regionCode;
            this.startTime = request.startTime;
            this.state = request.state;
            this.taskType = request.taskType;
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
         * The ID of the backup set generated when you create a download task. You can call the [DescribeBackups](~~26273~~) operation to query the ID.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * The page number of the page to return.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the Database Backup (DBS) data source. Specify the parameter in the format of *ds-${Instance ID}\_${regionId}*.
         */
        public Builder datasourceId(String datasourceId) {
            this.putQueryParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * The end of the time range to query. Specify this parameter as a timestamp of the LONG type. Unit: milliseconds.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > This parameter is required.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The column based on which the entries are sorted. By default, the entries are sorted by the time when the download task was created. Set the value to **gmt_create**.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * The order in which you want to sort the entries. Valid values:
         * <p>
         * 
         * *   **asc**: the ascending order.
         * *   **desc**: the descending order. This is the default value.
         */
        public Builder orderDirect(String orderDirect) {
            this.putQueryParameter("OrderDirect", orderDirect);
            this.orderDirect = orderDirect;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region in which the instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify this parameter as a timestamp of the LONG type. Unit: milliseconds.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The state of the download task. Valid values:
         * <p>
         * 
         * *   **Initializing**: The download task is being initialized.
         * *   **queuing**: The download task is queuing.
         * *   **running**: The download task is running.
         * *   **failed**: The download task fails.
         * *   **finished**: The download task is complete.
         * *   **expired**: The download task expires.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * The type of the download task. Valid values:
         * <p>
         * 
         * *   **full**: downloads a full backup set.
         * *   **pitr**: downloads a backup set at a specific point in time.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeDownloadTaskRequest build() {
            return new DescribeDownloadTaskRequest(this);
        } 

    } 

}
