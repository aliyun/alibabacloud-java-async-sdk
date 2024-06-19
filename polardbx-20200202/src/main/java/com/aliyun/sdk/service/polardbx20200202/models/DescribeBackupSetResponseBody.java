// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetResponseBody</p>
 */
public class DescribeBackupSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeBackupSetResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeBackupSetResponseBody build() {
            return new DescribeBackupSetResponseBody(this);
        } 

    } 

    public static class OSSList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetFile")
        private String backupSetFile;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        private OSSList(Builder builder) {
            this.backupSetFile = builder.backupSetFile;
            this.downloadLink = builder.downloadLink;
            this.intranetDownloadLink = builder.intranetDownloadLink;
            this.linkExpiredTime = builder.linkExpiredTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OSSList create() {
            return builder().build();
        }

        /**
         * @return backupSetFile
         */
        public String getBackupSetFile() {
            return this.backupSetFile;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return intranetDownloadLink
         */
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        /**
         * @return linkExpiredTime
         */
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public static final class Builder {
            private String backupSetFile; 
            private String downloadLink; 
            private String intranetDownloadLink; 
            private String linkExpiredTime; 

            /**
             * BackupSetFile.
             */
            public Builder backupSetFile(String backupSetFile) {
                this.backupSetFile = backupSetFile;
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
             * IntranetDownloadLink.
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * LinkExpiredTime.
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            public OSSList build() {
                return new OSSList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupModel")
        private Integer backupModel;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private Long backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSetSize")
        private Long backupSetSize;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private Integer backupType;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("OSSList")
        private java.util.List < OSSList> OSSList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.backupModel = builder.backupModel;
            this.backupSetId = builder.backupSetId;
            this.backupSetSize = builder.backupSetSize;
            this.backupType = builder.backupType;
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.OSSList = builder.OSSList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupModel
         */
        public Integer getBackupModel() {
            return this.backupModel;
        }

        /**
         * @return backupSetId
         */
        public Long getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return backupSetSize
         */
        public Long getBackupSetSize() {
            return this.backupSetSize;
        }

        /**
         * @return backupType
         */
        public Integer getBackupType() {
            return this.backupType;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return OSSList
         */
        public java.util.List < OSSList> getOSSList() {
            return this.OSSList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer backupModel; 
            private Long backupSetId; 
            private Long backupSetSize; 
            private Integer backupType; 
            private Long beginTime; 
            private Long endTime; 
            private java.util.List < OSSList> OSSList; 
            private Integer status; 

            /**
             * BackupModel.
             */
            public Builder backupModel(Integer backupModel) {
                this.backupModel = backupModel;
                return this;
            }

            /**
             * BackupSetId.
             */
            public Builder backupSetId(Long backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * BackupSetSize.
             */
            public Builder backupSetSize(Long backupSetSize) {
                this.backupSetSize = backupSetSize;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(Integer backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
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
             * OSSList.
             */
            public Builder OSSList(java.util.List < OSSList> OSSList) {
                this.OSSList = OSSList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
