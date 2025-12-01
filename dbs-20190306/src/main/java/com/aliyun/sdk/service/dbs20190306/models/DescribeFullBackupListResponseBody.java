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
 * {@link DescribeFullBackupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFullBackupListResponseBody</p>
 */
public class DescribeFullBackupListResponseBody extends TeaModel {
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

        private Builder(DescribeFullBackupListResponseBody model) {
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

    /**
     * 
     * {@link DescribeFullBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFullBackupListResponseBody</p>
     */
    public static class FullBackupFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupObjects")
        private String backupObjects;

        @com.aliyun.core.annotation.NameInMap("BackupSetExpiredTime")
        private Long backupSetExpiredTime;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointIpPort")
        private String sourceEndpointIpPort;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StorageMethod")
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

            private Builder() {
            } 

            private Builder(FullBackupFile model) {
                this.backupObjects = model.backupObjects;
                this.backupSetExpiredTime = model.backupSetExpiredTime;
                this.backupSetId = model.backupSetId;
                this.backupSize = model.backupSize;
                this.backupStatus = model.backupStatus;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.errMessage = model.errMessage;
                this.finishTime = model.finishTime;
                this.sourceEndpointIpPort = model.sourceEndpointIpPort;
                this.startTime = model.startTime;
                this.storageMethod = model.storageMethod;
            } 

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
    /**
     * 
     * {@link DescribeFullBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFullBackupListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullBackupFile")
        private java.util.List<FullBackupFile> fullBackupFile;

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
        public java.util.List<FullBackupFile> getFullBackupFile() {
            return this.fullBackupFile;
        }

        public static final class Builder {
            private java.util.List<FullBackupFile> fullBackupFile; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.fullBackupFile = model.fullBackupFile;
            } 

            /**
             * FullBackupFile.
             */
            public Builder fullBackupFile(java.util.List<FullBackupFile> fullBackupFile) {
                this.fullBackupFile = fullBackupFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
