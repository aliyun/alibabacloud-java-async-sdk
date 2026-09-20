// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeUTC")
    private String endTimeUTC;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeUTC")
    private String startTimeUTC;

    private DescribeBackupsRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.endTimeUTC = builder.endTimeUTC;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.startTimeUTC = builder.startTimeUTC;
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
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimeUTC
     */
    public String getEndTimeUTC() {
        return this.endTimeUTC;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return startTimeUTC
     */
    public String getStartTimeUTC() {
        return this.startTimeUTC;
    }

    public static final class Builder extends Request.Builder<DescribeBackupsRequest, Builder> {
        private String backupId; 
        private String clusterId; 
        private String endTime; 
        private String endTimeUTC; 
        private String pageNumber; 
        private String pageSize; 
        private String startTime; 
        private String startTimeUTC; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupsRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.endTimeUTC = request.endTimeUTC;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.startTimeUTC = request.startTimeUTC;
        } 

        /**
         * <p>The ID of the backup to query.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-t4naqsay5gn****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end time of the backup query. Format: yyyy-MM-dd HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23 23:59:59</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The end time of the backup query in UTC. The end time must be later than the start time. Format: yyyy-MM-ddTHH:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T15:59:59Z</p>
         */
        public Builder endTimeUTC(String endTimeUTC) {
            this.putQueryParameter("EndTimeUTC", endTimeUTC);
            this.endTimeUTC = endTimeUTC;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time of the backup query. Format: yyyy-MM-dd HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-13 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The start time of the backup query in UTC. Format: yyyy-MM-ddTHH:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-12T16:00:00Z</p>
         */
        public Builder startTimeUTC(String startTimeUTC) {
            this.putQueryParameter("StartTimeUTC", startTimeUTC);
            this.startTimeUTC = startTimeUTC;
            return this;
        }

        @Override
        public DescribeBackupsRequest build() {
            return new DescribeBackupsRequest(this);
        } 

    } 

}
