// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataBackupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataBackupsRequest</p>
 */
public class DescribeDataBackupsRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("BackupMode")
    private String backupMode;

    @Query
    @NameInMap("BackupStatus")
    private String backupStatus;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DataType")
    private String dataType;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 30)
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeDataBackupsRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.backupMode = builder.backupMode;
        this.backupStatus = builder.backupStatus;
        this.DBInstanceId = builder.DBInstanceId;
        this.dataType = builder.dataType;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataBackupsRequest create() {
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
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return backupStatus
     */
    public String getBackupStatus() {
        return this.backupStatus;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDataBackupsRequest, Builder> {
        private String backupId; 
        private String backupMode; 
        private String backupStatus; 
        private String DBInstanceId; 
        private String dataType; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataBackupsRequest response) {
            super(response);
            this.backupId = response.backupId;
            this.backupMode = response.backupMode;
            this.backupStatus = response.backupStatus;
            this.DBInstanceId = response.DBInstanceId;
            this.dataType = response.dataType;
            this.endTime = response.endTime;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
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
         * BackupMode.
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * BackupStatus.
         */
        public Builder backupStatus(String backupStatus) {
            this.putQueryParameter("BackupStatus", backupStatus);
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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

        @Override
        public DescribeDataBackupsRequest build() {
            return new DescribeDataBackupsRequest(this);
        } 

    } 

}
