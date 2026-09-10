// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeBackupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupsRequest</p>
 */
public class DescribeBackupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupTaskId")
    private String backupTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private String statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePeriodEndTime")
    private Long timePeriodEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePeriodStartTime")
    private Long timePeriodStartTime;

    private DescribeBackupsRequest(Builder builder) {
        super(builder);
        this.backupTaskId = builder.backupTaskId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.statuses = builder.statuses;
        this.timePeriodEndTime = builder.timePeriodEndTime;
        this.timePeriodStartTime = builder.timePeriodStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupTaskId
     */
    public String getBackupTaskId() {
        return this.backupTaskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return statuses
     */
    public String getStatuses() {
        return this.statuses;
    }

    /**
     * @return timePeriodEndTime
     */
    public Long getTimePeriodEndTime() {
        return this.timePeriodEndTime;
    }

    /**
     * @return timePeriodStartTime
     */
    public Long getTimePeriodStartTime() {
        return this.timePeriodStartTime;
    }

    public static final class Builder extends Request.Builder<DescribeBackupsRequest, Builder> {
        private String backupTaskId; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String statuses; 
        private Long timePeriodEndTime; 
        private Long timePeriodStartTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupsRequest request) {
            super(request);
            this.backupTaskId = request.backupTaskId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.statuses = request.statuses;
            this.timePeriodEndTime = request.timePeriodEndTime;
            this.timePeriodStartTime = request.timePeriodStartTime;
        } 

        /**
         * <p>The backup task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bt-2389hsdui12m</p>
         */
        public Builder backupTaskId(String backupTaskId) {
            this.putQueryParameter("BackupTaskId", backupTaskId);
            this.backupTaskId = backupTaskId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The query page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of statuses.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder statuses(String statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>The end time for querying backup jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1747728000</p>
         */
        public Builder timePeriodEndTime(Long timePeriodEndTime) {
            this.putQueryParameter("TimePeriodEndTime", timePeriodEndTime);
            this.timePeriodEndTime = timePeriodEndTime;
            return this;
        }

        /**
         * <p>The start time for querying backup jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1747708000</p>
         */
        public Builder timePeriodStartTime(Long timePeriodStartTime) {
            this.putQueryParameter("TimePeriodStartTime", timePeriodStartTime);
            this.timePeriodStartTime = timePeriodStartTime;
            return this;
        }

        @Override
        public DescribeBackupsRequest build() {
            return new DescribeBackupsRequest(this);
        } 

    } 

}
