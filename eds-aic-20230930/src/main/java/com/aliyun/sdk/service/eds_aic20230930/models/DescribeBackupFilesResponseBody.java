// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
    private java.util.List < Data> data;

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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
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
        private java.util.List < String > sourceAppInfoList;

        @com.aliyun.core.annotation.NameInMap("SourceFilePathList")
        private java.util.List < String > sourceFilePathList;

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
        public java.util.List < String > getSourceAppInfoList() {
            return this.sourceAppInfoList;
        }

        /**
         * @return sourceFilePathList
         */
        public java.util.List < String > getSourceFilePathList() {
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
            private java.util.List < String > sourceAppInfoList; 
            private java.util.List < String > sourceFilePathList; 
            private String status; 
            private String taskId; 
            private String uploadEndpoint; 
            private String uploadType; 

            /**
             * AndroidInstanceId.
             */
            public Builder androidInstanceId(String androidInstanceId) {
                this.androidInstanceId = androidInstanceId;
                return this;
            }

            /**
             * AndroidInstanceName.
             */
            public Builder androidInstanceName(String androidInstanceName) {
                this.androidInstanceName = androidInstanceName;
                return this;
            }

            /**
             * BackupFileId.
             */
            public Builder backupFileId(String backupFileId) {
                this.backupFileId = backupFileId;
                return this;
            }

            /**
             * BackupFileName.
             */
            public Builder backupFileName(String backupFileName) {
                this.backupFileName = backupFileName;
                return this;
            }

            /**
             * BackupFilePath.
             */
            public Builder backupFilePath(String backupFilePath) {
                this.backupFilePath = backupFilePath;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceGroupId.
             */
            public Builder instanceGroupId(String instanceGroupId) {
                this.instanceGroupId = instanceGroupId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SourceAppInfoList.
             */
            public Builder sourceAppInfoList(java.util.List < String > sourceAppInfoList) {
                this.sourceAppInfoList = sourceAppInfoList;
                return this;
            }

            /**
             * SourceFilePathList.
             */
            public Builder sourceFilePathList(java.util.List < String > sourceFilePathList) {
                this.sourceFilePathList = sourceFilePathList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UploadEndpoint.
             */
            public Builder uploadEndpoint(String uploadEndpoint) {
                this.uploadEndpoint = uploadEndpoint;
                return this;
            }

            /**
             * UploadType.
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
