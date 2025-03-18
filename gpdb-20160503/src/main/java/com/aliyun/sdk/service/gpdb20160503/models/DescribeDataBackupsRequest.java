// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDataBackupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataBackupsRequest</p>
 */
public class DescribeDataBackupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStatus")
    private String backupStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 30)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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

        private Builder(DescribeDataBackupsRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.backupMode = request.backupMode;
            this.backupStatus = request.backupStatus;
            this.DBInstanceId = request.DBInstanceId;
            this.dataType = request.dataType;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the backup set. If you specify BackupId, the details of the backup set are returned.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the information about all backup sets of an instance, including backup set IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>327329803</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li>Automated</li>
         * <li>Manual</li>
         * </ul>
         * <p>If you do not specify this parameter, all backup sets are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The state of the backup set. Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Failed</li>
         * </ul>
         * <p>If you do not specify this parameter, all backup sets are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder backupStatus(String backupStatus) {
            this.putQueryParameter("BackupStatus", backupStatus);
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>DATA</strong>: full backup.</li>
         * <li><strong>RESTOREPOI</strong>: point-in-time recovery backup.</li>
         * </ul>
         * <p>If you do not specify this parameter, the backup sets of full backup are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-06-01T16:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1</p>
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
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li>30</li>
         * <li>50</li>
         * <li>100</li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2011-06-01T15:00Z</p>
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
