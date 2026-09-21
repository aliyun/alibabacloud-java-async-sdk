// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupFilesResponseBody</p>
 */
public class DescribeBackupFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeBackupFilesResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupFilesResponseBody create() {
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
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBackupFilesResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of returned result objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that indicates the position up to which data has been read in the current call. An empty value indicates that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID. If you encounter an issue, provide this request ID for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>91</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBackupFilesResponseBody build() {
            return new DescribeBackupFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupFilesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidInstanceId")
        private String androidInstanceId;

        @com.aliyun.core.annotation.NameInMap("AndroidInstanceName")
        private String androidInstanceName;

        @com.aliyun.core.annotation.NameInMap("BackupAll")
        private Boolean backupAll;

        @com.aliyun.core.annotation.NameInMap("BackupFileId")
        private String backupFileId;

        @com.aliyun.core.annotation.NameInMap("BackupFileName")
        private String backupFileName;

        @com.aliyun.core.annotation.NameInMap("BackupFilePath")
        private String backupFilePath;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
        private String instanceGroupId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SourceAppInfoList")
        private java.util.List<String> sourceAppInfoList;

        @com.aliyun.core.annotation.NameInMap("SourceFilePathList")
        private java.util.List<String> sourceFilePathList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemVersion")
        private String systemVersion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
        private String uploadEndpoint;

        @com.aliyun.core.annotation.NameInMap("UploadType")
        private String uploadType;

        private Data(Builder builder) {
            this.androidInstanceId = builder.androidInstanceId;
            this.androidInstanceName = builder.androidInstanceName;
            this.backupAll = builder.backupAll;
            this.backupFileId = builder.backupFileId;
            this.backupFileName = builder.backupFileName;
            this.backupFilePath = builder.backupFilePath;
            this.channel = builder.channel;
            this.description = builder.description;
            this.endUserId = builder.endUserId;
            this.fileSize = builder.fileSize;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.instanceGroupId = builder.instanceGroupId;
            this.regionId = builder.regionId;
            this.sourceAppInfoList = builder.sourceAppInfoList;
            this.sourceFilePathList = builder.sourceFilePathList;
            this.status = builder.status;
            this.systemVersion = builder.systemVersion;
            this.taskId = builder.taskId;
            this.uploadEndpoint = builder.uploadEndpoint;
            this.uploadType = builder.uploadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return androidInstanceId
         */
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        /**
         * @return androidInstanceName
         */
        public String getAndroidInstanceName() {
            return this.androidInstanceName;
        }

        /**
         * @return backupAll
         */
        public Boolean getBackupAll() {
            return this.backupAll;
        }

        /**
         * @return backupFileId
         */
        public String getBackupFileId() {
            return this.backupFileId;
        }

        /**
         * @return backupFileName
         */
        public String getBackupFileName() {
            return this.backupFileName;
        }

        /**
         * @return backupFilePath
         */
        public String getBackupFilePath() {
            return this.backupFilePath;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceGroupId
         */
        public String getInstanceGroupId() {
            return this.instanceGroupId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceAppInfoList
         */
        public java.util.List<String> getSourceAppInfoList() {
            return this.sourceAppInfoList;
        }

        /**
         * @return sourceFilePathList
         */
        public java.util.List<String> getSourceFilePathList() {
            return this.sourceFilePathList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return uploadEndpoint
         */
        public String getUploadEndpoint() {
            return this.uploadEndpoint;
        }

        /**
         * @return uploadType
         */
        public String getUploadType() {
            return this.uploadType;
        }

        public static final class Builder {
            private String androidInstanceId; 
            private String androidInstanceName; 
            private Boolean backupAll; 
            private String backupFileId; 
            private String backupFileName; 
            private String backupFilePath; 
            private String channel; 
            private String description; 
            private String endUserId; 
            private Long fileSize; 
            private String gmtCreated; 
            private String gmtModified; 
            private String instanceGroupId; 
            private String regionId; 
            private java.util.List<String> sourceAppInfoList; 
            private java.util.List<String> sourceFilePathList; 
            private String status; 
            private String systemVersion; 
            private String taskId; 
            private String uploadEndpoint; 
            private String uploadType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.androidInstanceId = model.androidInstanceId;
                this.androidInstanceName = model.androidInstanceName;
                this.backupAll = model.backupAll;
                this.backupFileId = model.backupFileId;
                this.backupFileName = model.backupFileName;
                this.backupFilePath = model.backupFilePath;
                this.channel = model.channel;
                this.description = model.description;
                this.endUserId = model.endUserId;
                this.fileSize = model.fileSize;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.instanceGroupId = model.instanceGroupId;
                this.regionId = model.regionId;
                this.sourceAppInfoList = model.sourceAppInfoList;
                this.sourceFilePathList = model.sourceFilePathList;
                this.status = model.status;
                this.systemVersion = model.systemVersion;
                this.taskId = model.taskId;
                this.uploadEndpoint = model.uploadEndpoint;
                this.uploadType = model.uploadType;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-34pqe4r0kd9kn****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test cloud phone</p>
             */
            public Builder androidInstanceName(String androidInstanceName) {
                this.androidInstanceName = androidInstanceName;
                return this;
            }

            /**
             * <p>Specifies whether to perform a full device backup.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder backupAll(Boolean backupAll) {
                this.backupAll = backupAll;
                return this;
            }

            /**
             * <p>The backup file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bf-b0qbg3pbpjkn7****</p>
             */
            public Builder backupFileId(String backupFileId) {
                this.backupFileId = backupFileId;
                return this;
            }

            /**
             * <p>The backup file name.</p>
             * 
             * <strong>example:</strong>
             * <p>a-58ftsoo90p0qa****.ab</p>
             */
            public Builder backupFileName(String backupFileName) {
                this.backupFileName = backupFileName;
                return this;
            }

            /**
             * <p>The directory where the backup file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://cloudphone-saved-bucket-cn-shanghai/backup/aic-58ftsoo90p0qa****.ab</p>
             */
            public Builder backupFilePath(String backupFilePath) {
                this.backupFilePath = backupFilePath;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The description of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>Backup file for /data/media directory.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The owner of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The total size of the source backup files.</p>
             * 
             * <strong>example:</strong>
             * <p>10227168</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-15 17:33:59</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-15 17:33:59</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ag-58ftsoo90p0qi****</p>
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The list of backed-up application package names.</p>
             */
            public Builder sourceAppInfoList(java.util.List<String> sourceAppInfoList) {
                this.sourceAppInfoList = sourceAppInfoList;
                return this;
            }

            /**
             * <p>The list of source backup file directories.</p>
             */
            public Builder sourceFilePathList(java.util.List<String> sourceFilePathList) {
                this.sourceFilePathList = sourceFilePathList;
                return this;
            }

            /**
             * <p>The backup file status.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-bp67acfmxazb4p****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The domain name of the upload endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder uploadEndpoint(String uploadEndpoint) {
                this.uploadEndpoint = uploadEndpoint;
                return this;
            }

            /**
             * <p>The backup type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder uploadType(String uploadType) {
                this.uploadType = uploadType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
