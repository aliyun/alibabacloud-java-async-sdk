// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreTaskListResponseBody</p>
 */
public class DescribeRestoreTaskListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalElements")
    private Integer totalElements;

    @NameInMap("TotalPages")
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

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalElements.
         */
        public Builder totalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeRestoreTaskListResponseBody build() {
            return new DescribeRestoreTaskListResponseBody(this);
        } 

    } 

    public static class RestoreTaskDetail extends TeaModel {
        @NameInMap("BackupGatewayId")
        private Long backupGatewayId;

        @NameInMap("BackupPlanId")
        private String backupPlanId;

        @NameInMap("BackupSetId")
        private String backupSetId;

        @NameInMap("ContinuousRestoreProgress")
        private Integer continuousRestoreProgress;

        @NameInMap("CrossAliyunId")
        private String crossAliyunId;

        @NameInMap("CrossRoleName")
        private String crossRoleName;

        @NameInMap("DestinationEndpointDatabaseName")
        private String destinationEndpointDatabaseName;

        @NameInMap("DestinationEndpointInstanceID")
        private String destinationEndpointInstanceID;

        @NameInMap("DestinationEndpointInstanceType")
        private String destinationEndpointInstanceType;

        @NameInMap("DestinationEndpointIpPort")
        private String destinationEndpointIpPort;

        @NameInMap("DestinationEndpointOracleSID")
        private String destinationEndpointOracleSID;

        @NameInMap("DestinationEndpointRegion")
        private String destinationEndpointRegion;

        @NameInMap("DestinationEndpointUserName")
        private String destinationEndpointUserName;

        @NameInMap("ErrMessage")
        private String errMessage;

        @NameInMap("FullDataRestoreProgress")
        private Integer fullDataRestoreProgress;

        @NameInMap("FullStruAfterRestoreProgress")
        private Integer fullStruAfterRestoreProgress;

        @NameInMap("FullStruforeRestoreProgress")
        private Integer fullStruforeRestoreProgress;

        @NameInMap("RestoreDir")
        private String restoreDir;

        @NameInMap("RestoreObjects")
        private String restoreObjects;

        @NameInMap("RestoreStatus")
        private String restoreStatus;

        @NameInMap("RestoreTaskCreateTime")
        private Long restoreTaskCreateTime;

        @NameInMap("RestoreTaskFinishTime")
        private Long restoreTaskFinishTime;

        @NameInMap("RestoreTaskId")
        private String restoreTaskId;

        @NameInMap("RestoreTaskName")
        private String restoreTaskName;

        @NameInMap("RestoreTime")
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

            /**
             * BackupGatewayId.
             */
            public Builder backupGatewayId(Long backupGatewayId) {
                this.backupGatewayId = backupGatewayId;
                return this;
            }

            /**
             * BackupPlanId.
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * BackupSetId.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * ContinuousRestoreProgress.
             */
            public Builder continuousRestoreProgress(Integer continuousRestoreProgress) {
                this.continuousRestoreProgress = continuousRestoreProgress;
                return this;
            }

            /**
             * CrossAliyunId.
             */
            public Builder crossAliyunId(String crossAliyunId) {
                this.crossAliyunId = crossAliyunId;
                return this;
            }

            /**
             * CrossRoleName.
             */
            public Builder crossRoleName(String crossRoleName) {
                this.crossRoleName = crossRoleName;
                return this;
            }

            /**
             * DestinationEndpointDatabaseName.
             */
            public Builder destinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
                this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
                return this;
            }

            /**
             * DestinationEndpointInstanceID.
             */
            public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
                this.destinationEndpointInstanceID = destinationEndpointInstanceID;
                return this;
            }

            /**
             * DestinationEndpointInstanceType.
             */
            public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
                this.destinationEndpointInstanceType = destinationEndpointInstanceType;
                return this;
            }

            /**
             * DestinationEndpointIpPort.
             */
            public Builder destinationEndpointIpPort(String destinationEndpointIpPort) {
                this.destinationEndpointIpPort = destinationEndpointIpPort;
                return this;
            }

            /**
             * DestinationEndpointOracleSID.
             */
            public Builder destinationEndpointOracleSID(String destinationEndpointOracleSID) {
                this.destinationEndpointOracleSID = destinationEndpointOracleSID;
                return this;
            }

            /**
             * DestinationEndpointRegion.
             */
            public Builder destinationEndpointRegion(String destinationEndpointRegion) {
                this.destinationEndpointRegion = destinationEndpointRegion;
                return this;
            }

            /**
             * DestinationEndpointUserName.
             */
            public Builder destinationEndpointUserName(String destinationEndpointUserName) {
                this.destinationEndpointUserName = destinationEndpointUserName;
                return this;
            }

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * FullDataRestoreProgress.
             */
            public Builder fullDataRestoreProgress(Integer fullDataRestoreProgress) {
                this.fullDataRestoreProgress = fullDataRestoreProgress;
                return this;
            }

            /**
             * FullStruAfterRestoreProgress.
             */
            public Builder fullStruAfterRestoreProgress(Integer fullStruAfterRestoreProgress) {
                this.fullStruAfterRestoreProgress = fullStruAfterRestoreProgress;
                return this;
            }

            /**
             * FullStruforeRestoreProgress.
             */
            public Builder fullStruforeRestoreProgress(Integer fullStruforeRestoreProgress) {
                this.fullStruforeRestoreProgress = fullStruforeRestoreProgress;
                return this;
            }

            /**
             * RestoreDir.
             */
            public Builder restoreDir(String restoreDir) {
                this.restoreDir = restoreDir;
                return this;
            }

            /**
             * RestoreObjects.
             */
            public Builder restoreObjects(String restoreObjects) {
                this.restoreObjects = restoreObjects;
                return this;
            }

            /**
             * RestoreStatus.
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
                return this;
            }

            /**
             * RestoreTaskCreateTime.
             */
            public Builder restoreTaskCreateTime(Long restoreTaskCreateTime) {
                this.restoreTaskCreateTime = restoreTaskCreateTime;
                return this;
            }

            /**
             * RestoreTaskFinishTime.
             */
            public Builder restoreTaskFinishTime(Long restoreTaskFinishTime) {
                this.restoreTaskFinishTime = restoreTaskFinishTime;
                return this;
            }

            /**
             * RestoreTaskId.
             */
            public Builder restoreTaskId(String restoreTaskId) {
                this.restoreTaskId = restoreTaskId;
                return this;
            }

            /**
             * RestoreTaskName.
             */
            public Builder restoreTaskName(String restoreTaskName) {
                this.restoreTaskName = restoreTaskName;
                return this;
            }

            /**
             * RestoreTime.
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
    public static class Items extends TeaModel {
        @NameInMap("RestoreTaskDetail")
        private java.util.List < RestoreTaskDetail> restoreTaskDetail;

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
        public java.util.List < RestoreTaskDetail> getRestoreTaskDetail() {
            return this.restoreTaskDetail;
        }

        public static final class Builder {
            private java.util.List < RestoreTaskDetail> restoreTaskDetail; 

            /**
             * RestoreTaskDetail.
             */
            public Builder restoreTaskDetail(java.util.List < RestoreTaskDetail> restoreTaskDetail) {
                this.restoreTaskDetail = restoreTaskDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
