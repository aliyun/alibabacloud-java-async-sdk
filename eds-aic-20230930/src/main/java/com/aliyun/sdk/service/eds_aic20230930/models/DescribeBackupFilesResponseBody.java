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

        /**
         * <p>List of returned result objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum amount of data read this time.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Indicates the position of the current read in the call return. An empty value means that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The unique ID of the request. If you encounter any issues, please provide this request ID for troubleshooting by the support staff.</p>
         * 
         * <strong>example:</strong>
         * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of items.</p>
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
            private String taskId; 
            private String uploadEndpoint; 
            private String uploadType; 

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-34pqe4r0kd9kn****</p>
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * <p>Instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>defaultInstanceName</p>
             */
            public Builder androidInstanceName(String androidInstanceName) {
                this.androidInstanceName = androidInstanceName;
                return this;
            }

            /**
             * <p>Is all data to be backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder backupAll(Boolean backupAll) {
                this.backupAll = backupAll;
                return this;
            }

            /**
             * <p>Backup file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bf-b0qbg3pbpjkn7****</p>
             */
            public Builder backupFileId(String backupFileId) {
                this.backupFileId = backupFileId;
                return this;
            }

            /**
             * <p>Backup file name.</p>
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
             * <p>The description information of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>This is default description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Owner of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>Total size of the source backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>10227168</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-15 17:33:59</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>Update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-15 17:33:59</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Instance group ID.</p>
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
             * <p>List of apps to be backed up.</p>
             */
            public Builder sourceAppInfoList(java.util.List<String> sourceAppInfoList) {
                this.sourceAppInfoList = sourceAppInfoList;
                return this;
            }

            /**
             * <p>List of directories for the source backup files.</p>
             */
            public Builder sourceFilePathList(java.util.List<String> sourceFilePathList) {
                this.sourceFilePathList = sourceFilePathList;
                return this;
            }

            /**
             * <p>Backup file status.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
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
             * <p>The domain name of the upload address.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder uploadEndpoint(String uploadEndpoint) {
                this.uploadEndpoint = uploadEndpoint;
                return this;
            }

            /**
             * <p>Backup type.</p>
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
