// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link DescribeDownloadTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadTaskRequest</p>
 */
public class DescribeDownloadTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    private String datasourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderDirect")
    private String orderDirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private DescribeDownloadTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupSetId = builder.backupSetId;
        this.clusterName = builder.clusterName;
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
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
        private String clusterName; 
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
            this.clusterName = request.clusterName;
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
         * <p>The ID of the backup set generated when you create a download task. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>216****</p>
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the Database Backup (DBS) data source. Specify the parameter in the format of <em>ds-${Instance ID}_${regionId}</em>.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-rm-2ze8g2am97624****_cn-hangzhou</p>
         */
        public Builder datasourceId(String datasourceId) {
            this.putQueryParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify this parameter as a timestamp of the LONG type. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1661941556000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1imnmcjxdz7****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The column based on which the entries are sorted. By default, the entries are sorted by the time when the download task was created. Set the value to <strong>gmt_create</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>gmt_create</p>
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * <p>The order in which you want to sort the entries. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: the ascending order.</li>
         * <li><strong>desc</strong>: the descending order. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder orderDirect(String orderDirect) {
            this.putQueryParameter("OrderDirect", orderDirect);
            this.orderDirect = orderDirect;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/26231.html">DescribeDBInstanceAttribute</a> operation to query the region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify this parameter as a timestamp of the LONG type. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1661941554000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The state of the download task. Valid values:</p>
         * <ul>
         * <li><strong>Initializing</strong>: The download task is being initialized.</li>
         * <li><strong>queueing</strong>: The download task is queuing.</li>
         * <li><strong>running</strong>: The download task is running.</li>
         * <li><strong>failed</strong>: The download task fails.</li>
         * <li><strong>finished</strong>: The download task is complete.</li>
         * <li><strong>expired</strong>: The download task expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>queueing</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The type of the download task. Valid values:</p>
         * <ul>
         * <li><strong>full</strong>: downloads a full backup set.</li>
         * <li><strong>pitr</strong>: downloads a backup set at a specific point in time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>full</p>
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
