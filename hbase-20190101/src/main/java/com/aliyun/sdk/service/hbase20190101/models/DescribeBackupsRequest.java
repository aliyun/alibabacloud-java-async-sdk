// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupsRequest</p>
 */
public class DescribeBackupsRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EndTimeUTC")
    private String endTimeUTC;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("StartTimeUTC")
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
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EndTimeUTC.
         */
        public Builder endTimeUTC(String endTimeUTC) {
            this.putQueryParameter("EndTimeUTC", endTimeUTC);
            this.endTimeUTC = endTimeUTC;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StartTimeUTC.
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
