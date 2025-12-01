// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribeRestoreTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreTaskListResponseBody</p>
 */
public class DescribeRestoreTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalElements")
    private Integer totalElements;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeRestoreTaskListResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalElements = builder.totalElements;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreTaskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalElements
     */
    public Integer getTotalElements() {
        return this.totalElements;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Items items; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalElements; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(DescribeRestoreTaskListResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalElements = model.totalElements;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backup schedule.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9C397502-B4F2-4E22-AD97-C81F0049F3F3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of restore tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeRestoreTaskListResponseBody build() {
            return new DescribeRestoreTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestoreTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreTaskListResponseBody</p>
     */
    public static class RestoreTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
        private Long backupGatewayId;

        @com.aliyun.core.annotation.NameInMap("BackupPlanId")
        private String backupPlanId;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("ContinuousRestoreProgress")
        private Integer continuousRestoreProgress;

        @com.aliyun.core.annotation.NameInMap("CrossAliyunId")
        private String crossAliyunId;

        @com.aliyun.core.annotation.NameInMap("CrossRoleName")
        private String crossRoleName;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointDatabaseName")
        private String destinationEndpointDatabaseName;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceID")
        private String destinationEndpointInstanceID;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceType")
        private String destinationEndpointInstanceType;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointIpPort")
        private String destinationEndpointIpPort;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointOracleSID")
        private String destinationEndpointOracleSID;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointRegion")
        private String destinationEndpointRegion;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointUserName")
        private String destinationEndpointUserName;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("FullDataRestoreProgress")
        private Integer fullDataRestoreProgress;

        @com.aliyun.core.annotation.NameInMap("FullStruAfterRestoreProgress")
        private Integer fullStruAfterRestoreProgress;

        @com.aliyun.core.annotation.NameInMap("FullStruforeRestoreProgress")
        private Integer fullStruforeRestoreProgress;

        @com.aliyun.core.annotation.NameInMap("RestoreDir")
        private String restoreDir;

        @com.aliyun.core.annotation.NameInMap("RestoreObjects")
        private String restoreObjects;

        @com.aliyun.core.annotation.NameInMap("RestoreStatus")
        private String restoreStatus;

        @com.aliyun.core.annotation.NameInMap("RestoreTaskCreateTime")
        private Long restoreTaskCreateTime;

        @com.aliyun.core.annotation.NameInMap("RestoreTaskFinishTime")
        private Long restoreTaskFinishTime;

        @com.aliyun.core.annotation.NameInMap("RestoreTaskId")
        private String restoreTaskId;

        @com.aliyun.core.annotation.NameInMap("RestoreTaskName")
        private String restoreTaskName;

        @com.aliyun.core.annotation.NameInMap("RestoreTime")
        private Long restoreTime;

        private RestoreTaskDetail(Builder builder) {
            this.backupGatewayId = builder.backupGatewayId;
            this.backupPlanId = builder.backupPlanId;
            this.backupSetId = builder.backupSetId;
            this.continuousRestoreProgress = builder.continuousRestoreProgress;
            this.crossAliyunId = builder.crossAliyunId;
            this.crossRoleName = builder.crossRoleName;
            this.destinationEndpointDatabaseName = builder.destinationEndpointDatabaseName;
            this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
            this.destinationEndpointInstanceType = builder.destinationEndpointInstanceType;
            this.destinationEndpointIpPort = builder.destinationEndpointIpPort;
            this.destinationEndpointOracleSID = builder.destinationEndpointOracleSID;
            this.destinationEndpointRegion = builder.destinationEndpointRegion;
            this.destinationEndpointUserName = builder.destinationEndpointUserName;
            this.errMessage = builder.errMessage;
            this.fullDataRestoreProgress = builder.fullDataRestoreProgress;
            this.fullStruAfterRestoreProgress = builder.fullStruAfterRestoreProgress;
            this.fullStruforeRestoreProgress = builder.fullStruforeRestoreProgress;
            this.restoreDir = builder.restoreDir;
            this.restoreObjects = builder.restoreObjects;
            this.restoreStatus = builder.restoreStatus;
            this.restoreTaskCreateTime = builder.restoreTaskCreateTime;
            this.restoreTaskFinishTime = builder.restoreTaskFinishTime;
            this.restoreTaskId = builder.restoreTaskId;
            this.restoreTaskName = builder.restoreTaskName;
            this.restoreTime = builder.restoreTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreTaskDetail create() {
            return builder().build();
        }

        /**
         * @return backupGatewayId
         */
        public Long getBackupGatewayId() {
            return this.backupGatewayId;
        }

        /**
         * @return backupPlanId
         */
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return continuousRestoreProgress
         */
        public Integer getContinuousRestoreProgress() {
            return this.continuousRestoreProgress;
        }

        /**
         * @return crossAliyunId
         */
        public String getCrossAliyunId() {
            return this.crossAliyunId;
        }

        /**
         * @return crossRoleName
         */
        public String getCrossRoleName() {
            return this.crossRoleName;
        }

        /**
         * @return destinationEndpointDatabaseName
         */
        public String getDestinationEndpointDatabaseName() {
            return this.destinationEndpointDatabaseName;
        }

        /**
         * @return destinationEndpointInstanceID
         */
        public String getDestinationEndpointInstanceID() {
            return this.destinationEndpointInstanceID;
        }

        /**
         * @return destinationEndpointInstanceType
         */
        public String getDestinationEndpointInstanceType() {
            return this.destinationEndpointInstanceType;
        }

        /**
         * @return destinationEndpointIpPort
         */
        public String getDestinationEndpointIpPort() {
            return this.destinationEndpointIpPort;
        }

        /**
         * @return destinationEndpointOracleSID
         */
        public String getDestinationEndpointOracleSID() {
            return this.destinationEndpointOracleSID;
        }

        /**
         * @return destinationEndpointRegion
         */
        public String getDestinationEndpointRegion() {
            return this.destinationEndpointRegion;
        }

        /**
         * @return destinationEndpointUserName
         */
        public String getDestinationEndpointUserName() {
            return this.destinationEndpointUserName;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return fullDataRestoreProgress
         */
        public Integer getFullDataRestoreProgress() {
            return this.fullDataRestoreProgress;
        }

        /**
         * @return fullStruAfterRestoreProgress
         */
        public Integer getFullStruAfterRestoreProgress() {
            return this.fullStruAfterRestoreProgress;
        }

        /**
         * @return fullStruforeRestoreProgress
         */
        public Integer getFullStruforeRestoreProgress() {
            return this.fullStruforeRestoreProgress;
        }

        /**
         * @return restoreDir
         */
        public String getRestoreDir() {
            return this.restoreDir;
        }

        /**
         * @return restoreObjects
         */
        public String getRestoreObjects() {
            return this.restoreObjects;
        }

        /**
         * @return restoreStatus
         */
        public String getRestoreStatus() {
            return this.restoreStatus;
        }

        /**
         * @return restoreTaskCreateTime
         */
        public Long getRestoreTaskCreateTime() {
            return this.restoreTaskCreateTime;
        }

        /**
         * @return restoreTaskFinishTime
         */
        public Long getRestoreTaskFinishTime() {
            return this.restoreTaskFinishTime;
        }

        /**
         * @return restoreTaskId
         */
        public String getRestoreTaskId() {
            return this.restoreTaskId;
        }

        /**
         * @return restoreTaskName
         */
        public String getRestoreTaskName() {
            return this.restoreTaskName;
        }

        /**
         * @return restoreTime
         */
        public Long getRestoreTime() {
            return this.restoreTime;
        }

        public static final class Builder {
            private Long backupGatewayId; 
            private String backupPlanId; 
            private String backupSetId; 
            private Integer continuousRestoreProgress; 
            private String crossAliyunId; 
            private String crossRoleName; 
            private String destinationEndpointDatabaseName; 
            private String destinationEndpointInstanceID; 
            private String destinationEndpointInstanceType; 
            private String destinationEndpointIpPort; 
            private String destinationEndpointOracleSID; 
            private String destinationEndpointRegion; 
            private String destinationEndpointUserName; 
            private String errMessage; 
            private Integer fullDataRestoreProgress; 
            private Integer fullStruAfterRestoreProgress; 
            private Integer fullStruforeRestoreProgress; 
            private String restoreDir; 
            private String restoreObjects; 
            private String restoreStatus; 
            private Long restoreTaskCreateTime; 
            private Long restoreTaskFinishTime; 
            private String restoreTaskId; 
            private String restoreTaskName; 
            private Long restoreTime; 

            private Builder() {
            } 

            private Builder(RestoreTaskDetail model) {
                this.backupGatewayId = model.backupGatewayId;
                this.backupPlanId = model.backupPlanId;
                this.backupSetId = model.backupSetId;
                this.continuousRestoreProgress = model.continuousRestoreProgress;
                this.crossAliyunId = model.crossAliyunId;
                this.crossRoleName = model.crossRoleName;
                this.destinationEndpointDatabaseName = model.destinationEndpointDatabaseName;
                this.destinationEndpointInstanceID = model.destinationEndpointInstanceID;
                this.destinationEndpointInstanceType = model.destinationEndpointInstanceType;
                this.destinationEndpointIpPort = model.destinationEndpointIpPort;
                this.destinationEndpointOracleSID = model.destinationEndpointOracleSID;
                this.destinationEndpointRegion = model.destinationEndpointRegion;
                this.destinationEndpointUserName = model.destinationEndpointUserName;
                this.errMessage = model.errMessage;
                this.fullDataRestoreProgress = model.fullDataRestoreProgress;
                this.fullStruAfterRestoreProgress = model.fullStruAfterRestoreProgress;
                this.fullStruforeRestoreProgress = model.fullStruforeRestoreProgress;
                this.restoreDir = model.restoreDir;
                this.restoreObjects = model.restoreObjects;
                this.restoreStatus = model.restoreStatus;
                this.restoreTaskCreateTime = model.restoreTaskCreateTime;
                this.restoreTaskFinishTime = model.restoreTaskFinishTime;
                this.restoreTaskId = model.restoreTaskId;
                this.restoreTaskName = model.restoreTaskName;
                this.restoreTime = model.restoreTime;
            } 

            /**
             * <p>The ID of the backup gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>324234332</p>
             */
            public Builder backupGatewayId(Long backupGatewayId) {
                this.backupGatewayId = backupGatewayId;
                return this;
            }

            /**
             * <p>The ID of the backup schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>dbs1hvb0wXXXX</p>
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * <p>The ID of the full backup set that is used in the restore task.</p>
             * 
             * <strong>example:</strong>
             * <p>1ibh2f5uXXX</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The restore progress of the incremental log files.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder continuousRestoreProgress(Integer continuousRestoreProgress) {
                this.continuousRestoreProgress = continuousRestoreProgress;
                return this;
            }

            /**
             * <p>The unique ID (UID) of the Alibaba Cloud account to which the backup schedule belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2xxx7778xxxxxxxxxx</p>
             */
            public Builder crossAliyunId(String crossAliyunId) {
                this.crossAliyunId = crossAliyunId;
                return this;
            }

            /**
             * <p>The name of the RAM role that can be used to perform backups across Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder crossRoleName(String crossRoleName) {
                this.crossRoleName = crossRoleName;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder destinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
                this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
                return this;
            }

            /**
             * <p>The ID of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1p8c2947XXX</p>
             */
            public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
                this.destinationEndpointInstanceID = destinationEndpointInstanceID;
                return this;
            }

            /**
             * <p>The location of the database. Valid values:</p>
             * <ul>
             * <li>RDS</li>
             * <li>ECS</li>
             * <li>Express: The database is connected to DBS by using Express Connect, VPN Gateway, or Smart Access Gateway.</li>
             * <li>Agent: The database is connected to DBS over a DBS backup gateway.</li>
             * <li>DDS: The database is an ApsaraDB for MongoDB database.</li>
             * <li>Other: The database is connected to DBS by using the IP address and port of the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
                this.destinationEndpointInstanceType = destinationEndpointInstanceType;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>100.X.X.10:33204</p>
             */
            public Builder destinationEndpointIpPort(String destinationEndpointIpPort) {
                this.destinationEndpointIpPort = destinationEndpointIpPort;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder destinationEndpointOracleSID(String destinationEndpointOracleSID) {
                this.destinationEndpointOracleSID = destinationEndpointOracleSID;
                return this;
            }

            /**
             * <p>The region in which the database is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder destinationEndpointRegion(String destinationEndpointRegion) {
                this.destinationEndpointRegion = destinationEndpointRegion;
                return this;
            }

            /**
             * <p>The username of the account that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder destinationEndpointUserName(String destinationEndpointUserName) {
                this.destinationEndpointUserName = destinationEndpointUserName;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>NULL</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>The restore progress of the full backup data.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder fullDataRestoreProgress(Integer fullDataRestoreProgress) {
                this.fullDataRestoreProgress = fullDataRestoreProgress;
                return this;
            }

            /**
             * <p>The progress of schema restore after full data restore.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder fullStruAfterRestoreProgress(Integer fullStruAfterRestoreProgress) {
                this.fullStruAfterRestoreProgress = fullStruAfterRestoreProgress;
                return this;
            }

            /**
             * <p>The progress of schema restore before full data restore.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fullStruforeRestoreProgress(Integer fullStruforeRestoreProgress) {
                this.fullStruforeRestoreProgress = fullStruforeRestoreProgress;
                return this;
            }

            /**
             * <p>The directory of the destination database to which the objects were restored.</p>
             * 
             * <strong>example:</strong>
             * <p>100.X.X.10:33204</p>
             */
            public Builder restoreDir(String restoreDir) {
                this.restoreDir = restoreDir;
                return this;
            }

            /**
             * <p>The objects to be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>[     {         &quot;DBName&quot;:&quot;test&quot;       } ]</p>
             */
            public Builder restoreObjects(String restoreObjects) {
                this.restoreObjects = restoreObjects;
                return this;
            }

            /**
             * <p>The status of the restore task. Valid values:</p>
             * <ul>
             * <li>init: The restore task is not started or does not pass the precheck.</li>
             * <li>running: The restore task is running.</li>
             * <li>stop: The restore task failed.</li>
             * <li>pause: The restore task is stopped.</li>
             * <li>check_pass: The restore task passed the precheck.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * <p>The time when the restore task was created, such as 1554560477000.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder restoreTaskCreateTime(Long restoreTaskCreateTime) {
                this.restoreTaskCreateTime = restoreTaskCreateTime;
                return this;
            }

            /**
             * <p>The time when the restore task was complete, such as 1554560477000.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder restoreTaskFinishTime(Long restoreTaskFinishTime) {
                this.restoreTaskFinishTime = restoreTaskFinishTime;
                return this;
            }

            /**
             * <p>The ID of the restore task.</p>
             * 
             * <strong>example:</strong>
             * <p>s1XXXXXX</p>
             */
            public Builder restoreTaskId(String restoreTaskId) {
                this.restoreTaskId = restoreTaskId;
                return this;
            }

            /**
             * <p>The name of the restore task.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder restoreTaskName(String restoreTaskName) {
                this.restoreTaskName = restoreTaskName;
                return this;
            }

            /**
             * <p>The time to run the restore task, such as 1554560477000.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder restoreTime(Long restoreTime) {
                this.restoreTime = restoreTime;
                return this;
            }

            public RestoreTaskDetail build() {
                return new RestoreTaskDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreTaskListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RestoreTaskDetail")
        private java.util.List<RestoreTaskDetail> restoreTaskDetail;

        private Items(Builder builder) {
            this.restoreTaskDetail = builder.restoreTaskDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return restoreTaskDetail
         */
        public java.util.List<RestoreTaskDetail> getRestoreTaskDetail() {
            return this.restoreTaskDetail;
        }

        public static final class Builder {
            private java.util.List<RestoreTaskDetail> restoreTaskDetail; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.restoreTaskDetail = model.restoreTaskDetail;
            } 

            /**
             * RestoreTaskDetail.
             */
            public Builder restoreTaskDetail(java.util.List<RestoreTaskDetail> restoreTaskDetail) {
                this.restoreTaskDetail = restoreTaskDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
