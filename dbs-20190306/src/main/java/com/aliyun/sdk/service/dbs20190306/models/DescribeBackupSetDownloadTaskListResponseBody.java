// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetDownloadTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetDownloadTaskListResponseBody</p>
 */
public class DescribeBackupSetDownloadTaskListResponseBody extends TeaModel {
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

        public DescribeBackupSetDownloadTaskListResponseBody build() {
            return new DescribeBackupSetDownloadTaskListResponseBody(this);
        } 

    } 

    public static class BackupSetDownloadTaskDetail extends TeaModel {
        @NameInMap("BackupGatewayId")
        private Long backupGatewayId;

        @NameInMap("BackupPlanId")
        private String backupPlanId;

        @NameInMap("BackupSetCode")
        private String backupSetCode;

        @NameInMap("BackupSetDataFormat")
        private String backupSetDataFormat;

        @NameInMap("BackupSetDataSize")
        private Long backupSetDataSize;

        @NameInMap("BackupSetDbType")
        private String backupSetDbType;

        @NameInMap("BackupSetDownloadCreateTime")
        private Long backupSetDownloadCreateTime;

        @NameInMap("BackupSetDownloadDir")
        private String backupSetDownloadDir;

        @NameInMap("BackupSetDownloadFinishTime")
        private Long backupSetDownloadFinishTime;

        @NameInMap("BackupSetDownloadInternetUrl")
        private String backupSetDownloadInternetUrl;

        @NameInMap("BackupSetDownloadIntranetUrl")
        private String backupSetDownloadIntranetUrl;

        @NameInMap("BackupSetDownloadStatus")
        private String backupSetDownloadStatus;

        @NameInMap("BackupSetDownloadTargetType")
        private String backupSetDownloadTargetType;

        @NameInMap("BackupSetDownloadTaskId")
        private String backupSetDownloadTaskId;

        @NameInMap("BackupSetDownloadTaskName")
        private String backupSetDownloadTaskName;

        @NameInMap("BackupSetDownloadWay")
        private String backupSetDownloadWay;

        @NameInMap("BackupSetId")
        private String backupSetId;

        @NameInMap("BackupSetJobType")
        private String backupSetJobType;

        @NameInMap("ErrMessage")
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
             * BackupSetCode.
             */
            public Builder backupSetCode(String backupSetCode) {
                this.backupSetCode = backupSetCode;
                return this;
            }

            /**
             * BackupSetDataFormat.
             */
            public Builder backupSetDataFormat(String backupSetDataFormat) {
                this.backupSetDataFormat = backupSetDataFormat;
                return this;
            }

            /**
             * BackupSetDataSize.
             */
            public Builder backupSetDataSize(Long backupSetDataSize) {
                this.backupSetDataSize = backupSetDataSize;
                return this;
            }

            /**
             * BackupSetDbType.
             */
            public Builder backupSetDbType(String backupSetDbType) {
                this.backupSetDbType = backupSetDbType;
                return this;
            }

            /**
             * BackupSetDownloadCreateTime.
             */
            public Builder backupSetDownloadCreateTime(Long backupSetDownloadCreateTime) {
                this.backupSetDownloadCreateTime = backupSetDownloadCreateTime;
                return this;
            }

            /**
             * BackupSetDownloadDir.
             */
            public Builder backupSetDownloadDir(String backupSetDownloadDir) {
                this.backupSetDownloadDir = backupSetDownloadDir;
                return this;
            }

            /**
             * BackupSetDownloadFinishTime.
             */
            public Builder backupSetDownloadFinishTime(Long backupSetDownloadFinishTime) {
                this.backupSetDownloadFinishTime = backupSetDownloadFinishTime;
                return this;
            }

            /**
             * BackupSetDownloadInternetUrl.
             */
            public Builder backupSetDownloadInternetUrl(String backupSetDownloadInternetUrl) {
                this.backupSetDownloadInternetUrl = backupSetDownloadInternetUrl;
                return this;
            }

            /**
             * BackupSetDownloadIntranetUrl.
             */
            public Builder backupSetDownloadIntranetUrl(String backupSetDownloadIntranetUrl) {
                this.backupSetDownloadIntranetUrl = backupSetDownloadIntranetUrl;
                return this;
            }

            /**
             * BackupSetDownloadStatus.
             */
            public Builder backupSetDownloadStatus(String backupSetDownloadStatus) {
                this.backupSetDownloadStatus = backupSetDownloadStatus;
                return this;
            }

            /**
             * BackupSetDownloadTargetType.
             */
            public Builder backupSetDownloadTargetType(String backupSetDownloadTargetType) {
                this.backupSetDownloadTargetType = backupSetDownloadTargetType;
                return this;
            }

            /**
             * BackupSetDownloadTaskId.
             */
            public Builder backupSetDownloadTaskId(String backupSetDownloadTaskId) {
                this.backupSetDownloadTaskId = backupSetDownloadTaskId;
                return this;
            }

            /**
             * BackupSetDownloadTaskName.
             */
            public Builder backupSetDownloadTaskName(String backupSetDownloadTaskName) {
                this.backupSetDownloadTaskName = backupSetDownloadTaskName;
                return this;
            }

            /**
             * BackupSetDownloadWay.
             */
            public Builder backupSetDownloadWay(String backupSetDownloadWay) {
                this.backupSetDownloadWay = backupSetDownloadWay;
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
             * BackupSetJobType.
             */
            public Builder backupSetJobType(String backupSetJobType) {
                this.backupSetJobType = backupSetJobType;
                return this;
            }

            /**
             * ErrMessage.
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
    public static class Items extends TeaModel {
        @NameInMap("BackupSetDownloadTaskDetail")
        private java.util.List < BackupSetDownloadTaskDetail> backupSetDownloadTaskDetail;

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
        public java.util.List < BackupSetDownloadTaskDetail> getBackupSetDownloadTaskDetail() {
            return this.backupSetDownloadTaskDetail;
        }

        public static final class Builder {
            private java.util.List < BackupSetDownloadTaskDetail> backupSetDownloadTaskDetail; 

            /**
             * BackupSetDownloadTaskDetail.
             */
            public Builder backupSetDownloadTaskDetail(java.util.List < BackupSetDownloadTaskDetail> backupSetDownloadTaskDetail) {
                this.backupSetDownloadTaskDetail = backupSetDownloadTaskDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
