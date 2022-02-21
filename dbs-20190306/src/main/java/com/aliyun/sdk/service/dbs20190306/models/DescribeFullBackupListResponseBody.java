// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFullBackupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFullBackupListResponseBody</p>
 */
public class DescribeFullBackupListResponseBody extends TeaModel {
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

    private DescribeFullBackupListResponseBody(Builder builder) {
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

    public static DescribeFullBackupListResponseBody create() {
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

        public DescribeFullBackupListResponseBody build() {
            return new DescribeFullBackupListResponseBody(this);
        } 

    } 

    public static class FullBackupFile extends TeaModel {
        @NameInMap("BackupObjects")
        private String backupObjects;

        @NameInMap("BackupSetExpiredTime")
        private Long backupSetExpiredTime;

        @NameInMap("BackupSetId")
        private String backupSetId;

        @NameInMap("BackupSize")
        private Long backupSize;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ErrMessage")
        private String errMessage;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("SourceEndpointIpPort")
        private String sourceEndpointIpPort;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("StorageMethod")
        private String storageMethod;

        private FullBackupFile(Builder builder) {
            this.backupObjects = builder.backupObjects;
            this.backupSetExpiredTime = builder.backupSetExpiredTime;
            this.backupSetId = builder.backupSetId;
            this.backupSize = builder.backupSize;
            this.backupStatus = builder.backupStatus;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.errMessage = builder.errMessage;
            this.finishTime = builder.finishTime;
            this.sourceEndpointIpPort = builder.sourceEndpointIpPort;
            this.startTime = builder.startTime;
            this.storageMethod = builder.storageMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullBackupFile create() {
            return builder().build();
        }

        /**
         * @return backupObjects
         */
        public String getBackupObjects() {
            return this.backupObjects;
        }

        /**
         * @return backupSetExpiredTime
         */
        public Long getBackupSetExpiredTime() {
            return this.backupSetExpiredTime;
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return backupSize
         */
        public Long getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return sourceEndpointIpPort
         */
        public String getSourceEndpointIpPort() {
            return this.sourceEndpointIpPort;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return storageMethod
         */
        public String getStorageMethod() {
            return this.storageMethod;
        }

        public static final class Builder {
            private String backupObjects; 
            private Long backupSetExpiredTime; 
            private String backupSetId; 
            private Long backupSize; 
            private String backupStatus; 
            private Long createTime; 
            private Long endTime; 
            private String errMessage; 
            private Long finishTime; 
            private String sourceEndpointIpPort; 
            private Long startTime; 
            private String storageMethod; 

            /**
             * BackupObjects.
             */
            public Builder backupObjects(String backupObjects) {
                this.backupObjects = backupObjects;
                return this;
            }

            /**
             * BackupSetExpiredTime.
             */
            public Builder backupSetExpiredTime(Long backupSetExpiredTime) {
                this.backupSetExpiredTime = backupSetExpiredTime;
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
             * BackupSize.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * SourceEndpointIpPort.
             */
            public Builder sourceEndpointIpPort(String sourceEndpointIpPort) {
                this.sourceEndpointIpPort = sourceEndpointIpPort;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StorageMethod.
             */
            public Builder storageMethod(String storageMethod) {
                this.storageMethod = storageMethod;
                return this;
            }

            public FullBackupFile build() {
                return new FullBackupFile(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("FullBackupFile")
        private java.util.List < FullBackupFile> fullBackupFile;

        private Items(Builder builder) {
            this.fullBackupFile = builder.fullBackupFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return fullBackupFile
         */
        public java.util.List < FullBackupFile> getFullBackupFile() {
            return this.fullBackupFile;
        }

        public static final class Builder {
            private java.util.List < FullBackupFile> fullBackupFile; 

            /**
             * FullBackupFile.
             */
            public Builder fullBackupFile(java.util.List < FullBackupFile> fullBackupFile) {
                this.fullBackupFile = fullBackupFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
