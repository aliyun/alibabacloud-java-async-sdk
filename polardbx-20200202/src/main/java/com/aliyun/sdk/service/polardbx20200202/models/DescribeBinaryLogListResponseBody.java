// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBinaryLogListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBinaryLogListResponseBody</p>
 */
public class DescribeBinaryLogListResponseBody extends TeaModel {
    @NameInMap("LogList")
    private java.util.List < LogList> logList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNumber")
    private Integer totalNumber;

    private DescribeBinaryLogListResponseBody(Builder builder) {
        this.logList = builder.logList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNumber = builder.totalNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBinaryLogListResponseBody create() {
        return builder().build();
    }

    /**
     * @return logList
     */
    public java.util.List < LogList> getLogList() {
        return this.logList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static final class Builder {
        private java.util.List < LogList> logList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNumber; 

        /**
         * LogList.
         */
        public Builder logList(java.util.List < LogList> logList) {
            this.logList = logList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalNumber.
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public DescribeBinaryLogListResponseBody build() {
            return new DescribeBinaryLogListResponseBody(this);
        } 

    } 

    public static class LogList extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DownloadLink")
        private String downloadLink;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LogSize")
        private Long logSize;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("PurgeStatus")
        private Integer purgeStatus;

        @NameInMap("UploadHost")
        private String uploadHost;

        @NameInMap("UploadStatus")
        private Integer uploadStatus;

        private LogList(Builder builder) {
            this.beginTime = builder.beginTime;
            this.createdTime = builder.createdTime;
            this.downloadLink = builder.downloadLink;
            this.endTime = builder.endTime;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.logSize = builder.logSize;
            this.modifiedTime = builder.modifiedTime;
            this.purgeStatus = builder.purgeStatus;
            this.uploadHost = builder.uploadHost;
            this.uploadStatus = builder.uploadStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogList create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return logSize
         */
        public Long getLogSize() {
            return this.logSize;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return purgeStatus
         */
        public Integer getPurgeStatus() {
            return this.purgeStatus;
        }

        /**
         * @return uploadHost
         */
        public String getUploadHost() {
            return this.uploadHost;
        }

        /**
         * @return uploadStatus
         */
        public Integer getUploadStatus() {
            return this.uploadStatus;
        }

        public static final class Builder {
            private String beginTime; 
            private String createdTime; 
            private String downloadLink; 
            private String endTime; 
            private String fileName; 
            private Long id; 
            private Long logSize; 
            private String modifiedTime; 
            private Integer purgeStatus; 
            private String uploadHost; 
            private Integer uploadStatus; 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DownloadLink.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LogSize.
             */
            public Builder logSize(Long logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PurgeStatus.
             */
            public Builder purgeStatus(Integer purgeStatus) {
                this.purgeStatus = purgeStatus;
                return this;
            }

            /**
             * UploadHost.
             */
            public Builder uploadHost(String uploadHost) {
                this.uploadHost = uploadHost;
                return this;
            }

            /**
             * UploadStatus.
             */
            public Builder uploadStatus(Integer uploadStatus) {
                this.uploadStatus = uploadStatus;
                return this;
            }

            public LogList build() {
                return new LogList(this);
            } 

        } 

    }
}
