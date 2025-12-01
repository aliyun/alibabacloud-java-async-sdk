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
 * {@link DescribeBackupSetDownloadTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetDownloadTaskListResponseBody</p>
 */
public class DescribeBackupSetDownloadTaskListResponseBody extends TeaModel {
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

    private DescribeBackupSetDownloadTaskListResponseBody(Builder builder) {
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

    public static DescribeBackupSetDownloadTaskListResponseBody create() {
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

        private Builder(DescribeBackupSetDownloadTaskListResponseBody model) {
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
         * <p>The details of the backup schedules.</p>
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
         * <p>6DC3D286-E0E6-5988-A558-2184984B****</p>
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
         * <p>The total number of backup set download tasks.</p>
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

        public DescribeBackupSetDownloadTaskListResponseBody build() {
            return new DescribeBackupSetDownloadTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupSetDownloadTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetDownloadTaskListResponseBody</p>
     */
    public static class BackupSetDownloadTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
        private Long backupGatewayId;

        @com.aliyun.core.annotation.NameInMap("BackupPlanId")
        private String backupPlanId;

        @com.aliyun.core.annotation.NameInMap("BackupSetCode")
        private String backupSetCode;

        @com.aliyun.core.annotation.NameInMap("BackupSetDataFormat")
        private String backupSetDataFormat;

        @com.aliyun.core.annotation.NameInMap("BackupSetDataSize")
        private Long backupSetDataSize;

        @com.aliyun.core.annotation.NameInMap("BackupSetDbType")
        private String backupSetDbType;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadCreateTime")
        private Long backupSetDownloadCreateTime;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadDir")
        private String backupSetDownloadDir;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadFinishTime")
        private Long backupSetDownloadFinishTime;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadInternetUrl")
        private String backupSetDownloadInternetUrl;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadIntranetUrl")
        private String backupSetDownloadIntranetUrl;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadStatus")
        private String backupSetDownloadStatus;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTargetType")
        private String backupSetDownloadTargetType;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTaskId")
        private String backupSetDownloadTaskId;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTaskName")
        private String backupSetDownloadTaskName;

        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadWay")
        private String backupSetDownloadWay;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSetJobType")
        private String backupSetJobType;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        private BackupSetDownloadTaskDetail(Builder builder) {
            this.backupGatewayId = builder.backupGatewayId;
            this.backupPlanId = builder.backupPlanId;
            this.backupSetCode = builder.backupSetCode;
            this.backupSetDataFormat = builder.backupSetDataFormat;
            this.backupSetDataSize = builder.backupSetDataSize;
            this.backupSetDbType = builder.backupSetDbType;
            this.backupSetDownloadCreateTime = builder.backupSetDownloadCreateTime;
            this.backupSetDownloadDir = builder.backupSetDownloadDir;
            this.backupSetDownloadFinishTime = builder.backupSetDownloadFinishTime;
            this.backupSetDownloadInternetUrl = builder.backupSetDownloadInternetUrl;
            this.backupSetDownloadIntranetUrl = builder.backupSetDownloadIntranetUrl;
            this.backupSetDownloadStatus = builder.backupSetDownloadStatus;
            this.backupSetDownloadTargetType = builder.backupSetDownloadTargetType;
            this.backupSetDownloadTaskId = builder.backupSetDownloadTaskId;
            this.backupSetDownloadTaskName = builder.backupSetDownloadTaskName;
            this.backupSetDownloadWay = builder.backupSetDownloadWay;
            this.backupSetId = builder.backupSetId;
            this.backupSetJobType = builder.backupSetJobType;
            this.errMessage = builder.errMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupSetDownloadTaskDetail create() {
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
         * @return backupSetCode
         */
        public String getBackupSetCode() {
            return this.backupSetCode;
        }

        /**
         * @return backupSetDataFormat
         */
        public String getBackupSetDataFormat() {
            return this.backupSetDataFormat;
        }

        /**
         * @return backupSetDataSize
         */
        public Long getBackupSetDataSize() {
            return this.backupSetDataSize;
        }

        /**
         * @return backupSetDbType
         */
        public String getBackupSetDbType() {
            return this.backupSetDbType;
        }

        /**
         * @return backupSetDownloadCreateTime
         */
        public Long getBackupSetDownloadCreateTime() {
            return this.backupSetDownloadCreateTime;
        }

        /**
         * @return backupSetDownloadDir
         */
        public String getBackupSetDownloadDir() {
            return this.backupSetDownloadDir;
        }

        /**
         * @return backupSetDownloadFinishTime
         */
        public Long getBackupSetDownloadFinishTime() {
            return this.backupSetDownloadFinishTime;
        }

        /**
         * @return backupSetDownloadInternetUrl
         */
        public String getBackupSetDownloadInternetUrl() {
            return this.backupSetDownloadInternetUrl;
        }

        /**
         * @return backupSetDownloadIntranetUrl
         */
        public String getBackupSetDownloadIntranetUrl() {
            return this.backupSetDownloadIntranetUrl;
        }

        /**
         * @return backupSetDownloadStatus
         */
        public String getBackupSetDownloadStatus() {
            return this.backupSetDownloadStatus;
        }

        /**
         * @return backupSetDownloadTargetType
         */
        public String getBackupSetDownloadTargetType() {
            return this.backupSetDownloadTargetType;
        }

        /**
         * @return backupSetDownloadTaskId
         */
        public String getBackupSetDownloadTaskId() {
            return this.backupSetDownloadTaskId;
        }

        /**
         * @return backupSetDownloadTaskName
         */
        public String getBackupSetDownloadTaskName() {
            return this.backupSetDownloadTaskName;
        }

        /**
         * @return backupSetDownloadWay
         */
        public String getBackupSetDownloadWay() {
            return this.backupSetDownloadWay;
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return backupSetJobType
         */
        public String getBackupSetJobType() {
            return this.backupSetJobType;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        public static final class Builder {
            private Long backupGatewayId; 
            private String backupPlanId; 
            private String backupSetCode; 
            private String backupSetDataFormat; 
            private Long backupSetDataSize; 
            private String backupSetDbType; 
            private Long backupSetDownloadCreateTime; 
            private String backupSetDownloadDir; 
            private Long backupSetDownloadFinishTime; 
            private String backupSetDownloadInternetUrl; 
            private String backupSetDownloadIntranetUrl; 
            private String backupSetDownloadStatus; 
            private String backupSetDownloadTargetType; 
            private String backupSetDownloadTaskId; 
            private String backupSetDownloadTaskName; 
            private String backupSetDownloadWay; 
            private String backupSetId; 
            private String backupSetJobType; 
            private String errMessage; 

            private Builder() {
            } 

            private Builder(BackupSetDownloadTaskDetail model) {
                this.backupGatewayId = model.backupGatewayId;
                this.backupPlanId = model.backupPlanId;
                this.backupSetCode = model.backupSetCode;
                this.backupSetDataFormat = model.backupSetDataFormat;
                this.backupSetDataSize = model.backupSetDataSize;
                this.backupSetDbType = model.backupSetDbType;
                this.backupSetDownloadCreateTime = model.backupSetDownloadCreateTime;
                this.backupSetDownloadDir = model.backupSetDownloadDir;
                this.backupSetDownloadFinishTime = model.backupSetDownloadFinishTime;
                this.backupSetDownloadInternetUrl = model.backupSetDownloadInternetUrl;
                this.backupSetDownloadIntranetUrl = model.backupSetDownloadIntranetUrl;
                this.backupSetDownloadStatus = model.backupSetDownloadStatus;
                this.backupSetDownloadTargetType = model.backupSetDownloadTargetType;
                this.backupSetDownloadTaskId = model.backupSetDownloadTaskId;
                this.backupSetDownloadTaskName = model.backupSetDownloadTaskName;
                this.backupSetDownloadWay = model.backupSetDownloadWay;
                this.backupSetId = model.backupSetId;
                this.backupSetJobType = model.backupSetJobType;
                this.errMessage = model.errMessage;
            } 

            /**
             * <p>The backup gateway that is used to download the backup set. This parameter is available only if the value of the BackupSetDownloadWay parameter is auto.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder backupGatewayId(Long backupGatewayId) {
                this.backupGatewayId = backupGatewayId;
                return this;
            }

            /**
             * <p>The ID of the backup schedule.</p>
             * 
             * <strong>example:</strong>
             * <p>qhnuhyw3****</p>
             */
            public Builder backupPlanId(String backupPlanId) {
                this.backupPlanId = backupPlanId;
                return this;
            }

            /**
             * <p>The code of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql-bin.00XXXX</p>
             */
            public Builder backupSetCode(String backupSetCode) {
                this.backupSetCode = backupSetCode;
                return this;
            }

            /**
             * <p>The format in which the backup set is downloaded. Valid values:</p>
             * <ul>
             * <li><strong>Native</strong></li>
             * <li><strong>SQL</strong></li>
             * <li><strong>CSV</strong></li>
             * <li><strong>JSON</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Native</p>
             */
            public Builder backupSetDataFormat(String backupSetDataFormat) {
                this.backupSetDataFormat = backupSetDataFormat;
                return this;
            }

            /**
             * <p>The size of the data in the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>237837</p>
             */
            public Builder backupSetDataSize(Long backupSetDataSize) {
                this.backupSetDataSize = backupSetDataSize;
                return this;
            }

            /**
             * <p>The type of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder backupSetDbType(String backupSetDbType) {
                this.backupSetDbType = backupSetDbType;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the backup set download task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1642044001000</p>
             */
            public Builder backupSetDownloadCreateTime(Long backupSetDownloadCreateTime) {
                this.backupSetDownloadCreateTime = backupSetDownloadCreateTime;
                return this;
            }

            /**
             * <p>The server directory to which the backup set is downloaded.</p>
             * <blockquote>
             * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is auto.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder backupSetDownloadDir(String backupSetDownloadDir) {
                this.backupSetDownloadDir = backupSetDownloadDir;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the backup set download task is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>1642044013000</p>
             */
            public Builder backupSetDownloadFinishTime(Long backupSetDownloadFinishTime) {
                this.backupSetDownloadFinishTime = backupSetDownloadFinishTime;
                return this;
            }

            /**
             * <p>The public download URL of the backup set.</p>
             * <blockquote>
             * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is manual and the conversion is complete.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>&quot;//dbs-137XXXX-cn-hangzhou-1hr5cpbtmXXXX.oss-cn-hangzhou.example&quot;</p>
             */
            public Builder backupSetDownloadInternetUrl(String backupSetDownloadInternetUrl) {
                this.backupSetDownloadInternetUrl = backupSetDownloadInternetUrl;
                return this;
            }

            /**
             * <p>The internal download URL of the backup set.</p>
             * <blockquote>
             * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is manual and the conversion is complete.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>&quot;//dbs-13XXXX-cn-hangzhou-1hr5cpbtmXXXX.oss-cn-hangzhou-internal.example&quot;</p>
             */
            public Builder backupSetDownloadIntranetUrl(String backupSetDownloadIntranetUrl) {
                this.backupSetDownloadIntranetUrl = backupSetDownloadIntranetUrl;
                return this;
            }

            /**
             * <p>The status of the backup set download task. Valid values:</p>
             * <ul>
             * <li><strong>checking</strong>: The backup set download task is being prechecked.</li>
             * <li><strong>init</strong>: The backup set download task is not started and fails to pass the precheck.</li>
             * <li><strong>check_pass</strong>: The backup set download task passes the precheck.</li>
             * <li><strong>pause</strong>: The backup set download task is paused.</li>
             * <li><strong>schedule</strong>: The backup set download task is waiting to be scheduled</li>
             * <li><strong>running</strong>: The backup set download task is running.</li>
             * <li><strong>stop</strong>: The backup set download task fails.</li>
             * <li><strong>finish</strong>: The backup set download task is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder backupSetDownloadStatus(String backupSetDownloadStatus) {
                this.backupSetDownloadStatus = backupSetDownloadStatus;
                return this;
            }

            /**
             * <p>The type of the destination server to which the backup set is downloaded.</p>
             * <blockquote>
             * <p>This parameter is available only if the value of the BackupSetDownloadWay parameter is auto. A value of agent indicates a server on which a backup gateway is installed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder backupSetDownloadTargetType(String backupSetDownloadTargetType) {
                this.backupSetDownloadTargetType = backupSetDownloadTargetType;
                return this;
            }

            /**
             * <p>The ID of the backup set download task.</p>
             * 
             * <strong>example:</strong>
             * <p>urxgrxt7****</p>
             */
            public Builder backupSetDownloadTaskId(String backupSetDownloadTaskId) {
                this.backupSetDownloadTaskId = backupSetDownloadTaskId;
                return this;
            }

            /**
             * <p>The name of the backup set download task.</p>
             * 
             * <strong>example:</strong>
             * <p>1h7za2yws****-ManualCont</p>
             */
            public Builder backupSetDownloadTaskName(String backupSetDownloadTaskName) {
                this.backupSetDownloadTaskName = backupSetDownloadTaskName;
                return this;
            }

            /**
             * <p>The method in which the backup set is downloaded. Valid values:</p>
             * <ul>
             * <li><strong>manual</strong>: The backup set is manually downloaded.</li>
             * <li><strong>auto</strong>: The backup set is automatically downloaded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder backupSetDownloadWay(String backupSetDownloadWay) {
                this.backupSetDownloadWay = backupSetDownloadWay;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>1h7za2yws****</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The type of the backup set task. Valid values:</p>
             * <ul>
             * <li><strong>cbs_backup_sub_full</strong>: logical full backup set download task</li>
             * <li><strong>cbs_backup_sub_cont</strong>: logical incremental backup set download task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cbs_backup_sub_cont</p>
             */
            public Builder backupSetJobType(String backupSetJobType) {
                this.backupSetJobType = backupSetJobType;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.IndexOutOfBoundsException.</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            public BackupSetDownloadTaskDetail build() {
                return new BackupSetDownloadTaskDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupSetDownloadTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetDownloadTaskListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTaskDetail")
        private java.util.List<BackupSetDownloadTaskDetail> backupSetDownloadTaskDetail;

        private Items(Builder builder) {
            this.backupSetDownloadTaskDetail = builder.backupSetDownloadTaskDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupSetDownloadTaskDetail
         */
        public java.util.List<BackupSetDownloadTaskDetail> getBackupSetDownloadTaskDetail() {
            return this.backupSetDownloadTaskDetail;
        }

        public static final class Builder {
            private java.util.List<BackupSetDownloadTaskDetail> backupSetDownloadTaskDetail; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backupSetDownloadTaskDetail = model.backupSetDownloadTaskDetail;
            } 

            /**
             * BackupSetDownloadTaskDetail.
             */
            public Builder backupSetDownloadTaskDetail(java.util.List<BackupSetDownloadTaskDetail> backupSetDownloadTaskDetail) {
                this.backupSetDownloadTaskDetail = backupSetDownloadTaskDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
