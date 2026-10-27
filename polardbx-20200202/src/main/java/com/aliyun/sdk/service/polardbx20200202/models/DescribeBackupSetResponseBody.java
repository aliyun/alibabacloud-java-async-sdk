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
 * {@link DescribeBackupSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetResponseBody</p>
 */
public class DescribeBackupSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeBackupSetResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successs</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupSetResponseBody build() {
            return new DescribeBackupSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OSSList model) {
                this.backupSetFile = model.backupSetFile;
                this.downloadLink = model.downloadLink;
                this.intranetDownloadLink = model.intranetDownloadLink;
                this.linkExpiredTime = model.linkExpiredTime;
            } 

            /**
             * <p>The OSS file name.</p>
             * 
             * <strong>example:</strong>
             * <p>hins3084_data_20220418110623_qp.xb</p>
             */
            public Builder backupSetFile(String backupSetFile) {
                this.backupSetFile = backupSetFile;
                return this;
            }

            /**
             * <p>The public download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://pre-rdsbak-cn-xxx.oss-cn-beijing.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb?OSSAccessKeyId=LTAI****************&Expires=1650441697&dd=7KJzkUSbXf6dwy">https://pre-rdsbak-cn-xxx.oss-cn-beijing.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb?OSSAccessKeyId=LTAI****************&amp;Expires=1650441697&amp;dd=7KJzkUSbXf6dwy</a></p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The internal network OSS download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://pre-rdsbak-cn-beijing.oss-cn-beijing-internal.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb">http://pre-rdsbak-cn-beijing.oss-cn-beijing-internal.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb</a>?</p>
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * <p>The expiration time of the OSS file link.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-20T08:01:37Z</p>
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
    /**
     * 
     * {@link DescribeBackupSetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetResponseBody</p>
     */
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
        private java.util.List<OSSList> OSSList;

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
        public java.util.List<OSSList> getOSSList() {
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
            private java.util.List<OSSList> OSSList; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.backupModel = model.backupModel;
                this.backupSetId = model.backupSetId;
                this.backupSetSize = model.backupSetSize;
                this.backupType = model.backupType;
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
                this.OSSList = model.OSSList;
                this.status = model.status;
            } 

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Automatic backup.</li>
             * <li><strong>1</strong>: Manual backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backupModel(Integer backupModel) {
                this.backupModel = backupModel;
                return this;
            }

            /**
             * <p>The backup set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder backupSetId(Long backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The size of the backup set, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>88803195</p>
             */
            public Builder backupSetSize(Long backupSetSize) {
                this.backupSetSize = backupSetSize;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Fast backup.</li>
             * <li><strong>1</strong>: Consistent backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backupType(Integer backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The backup start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1650250861754</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The backup end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1650251308000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The list of OSS information for the backup set.</p>
             */
            public Builder OSSList(java.util.List<OSSList> OSSList) {
                this.OSSList = OSSList;
                return this;
            }

            /**
             * <p>The status of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Backing up.</li>
             * <li><strong>1</strong>: Backup succeeded.</li>
             * <li><strong>2</strong>: Backup failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
