// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeBinaryLogListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBinaryLogListResponseBody</p>
 */
public class DescribeBinaryLogListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogList")
    private java.util.List<LogList> logList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNumber")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logList
     */
    public java.util.List<LogList> getLogList() {
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
        private java.util.List<LogList> logList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNumber; 

        private Builder() {
        } 

        private Builder(DescribeBinaryLogListResponseBody model) {
            this.logList = model.logList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNumber = model.totalNumber;
        } 

        /**
         * <p>The list of binary log files.</p>
         */
        public Builder logList(java.util.List<LogList> logList) {
            this.logList = logList;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of binary logs returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2DFF784E-DC31-5BBC-9B25-9261CD9E0AA9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of binary log files returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public DescribeBinaryLogListResponseBody build() {
            return new DescribeBinaryLogListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBinaryLogListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBinaryLogListResponseBody</p>
     */
    public static class LogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LogSize")
        private Long logSize;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("PurgeStatus")
        private Integer purgeStatus;

        @com.aliyun.core.annotation.NameInMap("UploadHost")
        private String uploadHost;

        @com.aliyun.core.annotation.NameInMap("UploadStatus")
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

            private Builder() {
            } 

            private Builder(LogList model) {
                this.beginTime = model.beginTime;
                this.createdTime = model.createdTime;
                this.downloadLink = model.downloadLink;
                this.endTime = model.endTime;
                this.fileName = model.fileName;
                this.id = model.id;
                this.logSize = model.logSize;
                this.modifiedTime = model.modifiedTime;
                this.purgeStatus = model.purgeStatus;
                this.uploadHost = model.uploadHost;
                this.uploadStatus = model.uploadStatus;
            } 

            /**
             * <p>The start time of the log. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-09 10:27:46</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The creation time of the file. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-09 10:27:46</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The download URL of the file. The URL is valid for two days.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://polarx-cdc-binlog-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/polardbx_cdc/pxc-hzfd132143sfds1/binlog.000001?Expires=1636469502&OSSAccessKeyId=LT13fds12dsafddsf&Signature=fdpm%bdsfadsa%2F%bdsafdsaf%3D">http://polarx-cdc-binlog-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/polardbx_cdc/pxc-hzfd132143sfds1/binlog.000001?Expires=1636469502&amp;OSSAccessKeyId=LT13fds12dsafddsf&amp;Signature=fdpm%bdsfadsa%2F%bdsafdsaf%3D</a></p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The end time of the binary log. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-09 10:27:46</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the binary log file.</p>
             * 
             * <strong>example:</strong>
             * <p>binlog.000001</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The unique ID of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The size of the log file.</p>
             * 
             * <strong>example:</strong>
             * <p>536870912</p>
             */
            public Builder logSize(Long logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * <p>The last update time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-09 10:27:46</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The cleanup status. Valid values:</p>
             * <ul>
             * <li>0: Not deleted. </li>
             * <li>1: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder purgeStatus(Integer purgeStatus) {
                this.purgeStatus = purgeStatus;
                return this;
            }

            /**
             * <p>The backup host.</p>
             * 
             * <strong>example:</strong>
             * <p>10.110.88.9</p>
             */
            public Builder uploadHost(String uploadHost) {
                this.uploadHost = uploadHost;
                return this;
            }

            /**
             * <p>The backup status. Valid values:</p>
             * <ul>
             * <li>0: Not backed up. </li>
             * <li>1: Being backed up. </li>
             * <li>2: Backed up.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
