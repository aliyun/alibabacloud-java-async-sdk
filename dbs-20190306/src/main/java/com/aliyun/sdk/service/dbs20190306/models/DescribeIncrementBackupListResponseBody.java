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
 * {@link DescribeIncrementBackupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIncrementBackupListResponseBody</p>
 */
public class DescribeIncrementBackupListResponseBody extends TeaModel {
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

    private DescribeIncrementBackupListResponseBody(Builder builder) {
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

    public static DescribeIncrementBackupListResponseBody create() {
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

        private Builder(DescribeIncrementBackupListResponseBody model) {
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
         * <p>The details of incremental backup tasks.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>A5D52069-E8AA-5056-8C5C-654C3610****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of incremental backup tasks.</p>
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

        public DescribeIncrementBackupListResponseBody build() {
            return new DescribeIncrementBackupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIncrementBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIncrementBackupListResponseBody</p>
     */
    public static class IncrementBackupFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetExpiredTime")
        private Long backupSetExpiredTime;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSetJobId")
        private String backupSetJobId;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointIpPort")
        private String sourceEndpointIpPort;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StorageMethod")
        private String storageMethod;

        private IncrementBackupFile(Builder builder) {
            this.backupSetExpiredTime = builder.backupSetExpiredTime;
            this.backupSetId = builder.backupSetId;
            this.backupSetJobId = builder.backupSetJobId;
            this.backupSize = builder.backupSize;
            this.backupStatus = builder.backupStatus;
            this.endTime = builder.endTime;
            this.sourceEndpointIpPort = builder.sourceEndpointIpPort;
            this.startTime = builder.startTime;
            this.storageMethod = builder.storageMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncrementBackupFile create() {
            return builder().build();
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
         * @return backupSetJobId
         */
        public String getBackupSetJobId() {
            return this.backupSetJobId;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
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
            private Long backupSetExpiredTime; 
            private String backupSetId; 
            private String backupSetJobId; 
            private Long backupSize; 
            private String backupStatus; 
            private Long endTime; 
            private String sourceEndpointIpPort; 
            private Long startTime; 
            private String storageMethod; 

            private Builder() {
            } 

            private Builder(IncrementBackupFile model) {
                this.backupSetExpiredTime = model.backupSetExpiredTime;
                this.backupSetId = model.backupSetId;
                this.backupSetJobId = model.backupSetJobId;
                this.backupSize = model.backupSize;
                this.backupStatus = model.backupStatus;
                this.endTime = model.endTime;
                this.sourceEndpointIpPort = model.sourceEndpointIpPort;
                this.startTime = model.startTime;
                this.storageMethod = model.storageMethod;
            } 

            /**
             * <p>The point in time when the backup set expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1711506719000</p>
             */
            public Builder backupSetExpiredTime(Long backupSetExpiredTime) {
                this.backupSetExpiredTime = backupSetExpiredTime;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql-bin.00****</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The ID of the incremental backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>1hv5g9wk4****</p>
             */
            public Builder backupSetJobId(String backupSetJobId) {
                this.backupSetJobId = backupSetJobId;
                return this;
            }

            /**
             * <p>The size of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>18535</p>
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The status of the incremental backup task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The incremental backup task is not started.</li>
             * <li><strong>FILLING</strong>: The incremental backup task is in progress.</li>
             * <li><strong>COMPLETED</strong>: The incremental backup task is complete.</li>
             * <li><strong>UNCOMPLETED</strong>: The incremental backup task is not complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FILLING</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The end time of the incremental backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>1648434713000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>172.1XX.103.1:4XXX</p>
             */
            public Builder sourceEndpointIpPort(String sourceEndpointIpPort) {
                this.sourceEndpointIpPort = sourceEndpointIpPort;
                return this;
            }

            /**
             * <p>The start time of the incremental backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>1648433764000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The storage class of the backup data. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: The storage class is Standard.</li>
             * <li><strong>IA</strong>: The storage class is Infrequent Access (IA).</li>
             * <li><strong>Archive</strong>: The storage class is Archive.</li>
             * <li><strong>UNKNOWN</strong>: The storage class is unknown. This value is returned because the task is not complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder storageMethod(String storageMethod) {
                this.storageMethod = storageMethod;
                return this;
            }

            public IncrementBackupFile build() {
                return new IncrementBackupFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIncrementBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIncrementBackupListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncrementBackupFile")
        private java.util.List<IncrementBackupFile> incrementBackupFile;

        private Items(Builder builder) {
            this.incrementBackupFile = builder.incrementBackupFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return incrementBackupFile
         */
        public java.util.List<IncrementBackupFile> getIncrementBackupFile() {
            return this.incrementBackupFile;
        }

        public static final class Builder {
            private java.util.List<IncrementBackupFile> incrementBackupFile; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.incrementBackupFile = model.incrementBackupFile;
            } 

            /**
             * IncrementBackupFile.
             */
            public Builder incrementBackupFile(java.util.List<IncrementBackupFile> incrementBackupFile) {
                this.incrementBackupFile = incrementBackupFile;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
