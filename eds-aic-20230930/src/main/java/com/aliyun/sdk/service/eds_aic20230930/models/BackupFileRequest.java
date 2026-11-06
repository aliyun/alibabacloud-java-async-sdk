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
 * {@link BackupFileRequest} extends {@link RequestModel}
 *
 * <p>BackupFileRequest</p>
 */
public class BackupFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> androidInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupAll")
    private Boolean backupAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFileName")
    private String backupFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomScripts")
    private java.util.List<CustomScripts> customScripts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeAppList")
    private java.util.List<String> excludeAppList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeSourceFilePathList")
    private java.util.List<String> excludeSourceFilePathList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceAppList")
    private java.util.List<String> sourceAppList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceFilePathList")
    private java.util.List<String> sourceFilePathList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
    private String uploadEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadType")
    private String uploadType;

    private BackupFileRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.backupAll = builder.backupAll;
        this.backupFileName = builder.backupFileName;
        this.backupFilePath = builder.backupFilePath;
        this.customScripts = builder.customScripts;
        this.description = builder.description;
        this.excludeAppList = builder.excludeAppList;
        this.excludeSourceFilePathList = builder.excludeSourceFilePathList;
        this.sourceAppList = builder.sourceAppList;
        this.sourceFilePathList = builder.sourceFilePathList;
        this.uploadEndpoint = builder.uploadEndpoint;
        this.uploadType = builder.uploadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackupFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIdList
     */
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    /**
     * @return backupAll
     */
    public Boolean getBackupAll() {
        return this.backupAll;
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
     * @return customScripts
     */
    public java.util.List<CustomScripts> getCustomScripts() {
        return this.customScripts;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return excludeAppList
     */
    public java.util.List<String> getExcludeAppList() {
        return this.excludeAppList;
    }

    /**
     * @return excludeSourceFilePathList
     */
    public java.util.List<String> getExcludeSourceFilePathList() {
        return this.excludeSourceFilePathList;
    }

    /**
     * @return sourceAppList
     */
    public java.util.List<String> getSourceAppList() {
        return this.sourceAppList;
    }

    /**
     * @return sourceFilePathList
     */
    public java.util.List<String> getSourceFilePathList() {
        return this.sourceFilePathList;
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

    public static final class Builder extends Request.Builder<BackupFileRequest, Builder> {
        private java.util.List<String> androidInstanceIdList; 
        private Boolean backupAll; 
        private String backupFileName; 
        private String backupFilePath; 
        private java.util.List<CustomScripts> customScripts; 
        private String description; 
        private java.util.List<String> excludeAppList; 
        private java.util.List<String> excludeSourceFilePathList; 
        private java.util.List<String> sourceAppList; 
        private java.util.List<String> sourceFilePathList; 
        private String uploadEndpoint; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(BackupFileRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.backupAll = request.backupAll;
            this.backupFileName = request.backupFileName;
            this.backupFilePath = request.backupFilePath;
            this.customScripts = request.customScripts;
            this.description = request.description;
            this.excludeAppList = request.excludeAppList;
            this.excludeSourceFilePathList = request.excludeSourceFilePathList;
            this.sourceAppList = request.sourceAppList;
            this.sourceFilePathList = request.sourceFilePathList;
            this.uploadEndpoint = request.uploadEndpoint;
            this.uploadType = request.uploadType;
        } 

        /**
         * <p>The list of instance IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder androidInstanceIdList(java.util.List<String> androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * <p>Specifies whether to back up the entire instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder backupAll(Boolean backupAll) {
            this.putQueryParameter("BackupAll", backupAll);
            this.backupAll = backupAll;
            return this;
        }

        /**
         * <p>The name of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>MyBackup</p>
         */
        public Builder backupFileName(String backupFileName) {
            this.putQueryParameter("BackupFileName", backupFileName);
            this.backupFileName = backupFileName;
            return this;
        }

        /**
         * <p>The upload address of the backup file.</p>
         * <blockquote>
         * <p>If you upload the backup file to an OSS bucket, call the describeBuckets operation to obtain the bucketName, and select ossObjectList to obtain the key. The key is the folder path in the OSS bucket. Concatenate them into <code>oss://${bucketName}/${key}</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder backupFilePath(String backupFilePath) {
            this.putQueryParameter("BackupFilePath", backupFilePath);
            this.backupFilePath = backupFilePath;
            return this;
        }

        /**
         * CustomScripts.
         */
        public Builder customScripts(java.util.List<CustomScripts> customScripts) {
            this.putQueryParameter("CustomScripts", customScripts);
            this.customScripts = customScripts;
            return this;
        }

        /**
         * <p>The description of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a request to back up /data</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of application package names excluded from full instance backup. Matched applications only skip APK collection, and user data is backed up as usual. If this parameter is not specified, no applications are excluded.</p>
         */
        public Builder excludeAppList(java.util.List<String> excludeAppList) {
            this.putQueryParameter("ExcludeAppList", excludeAppList);
            this.excludeAppList = excludeAppList;
            return this;
        }

        /**
         * <p>The list of file paths in the Android container to exclude from the backup.</p>
         */
        public Builder excludeSourceFilePathList(java.util.List<String> excludeSourceFilePathList) {
            this.putQueryParameter("ExcludeSourceFilePathList", excludeSourceFilePathList);
            this.excludeSourceFilePathList = excludeSourceFilePathList;
            return this;
        }

        /**
         * <p>The list of package names of the applications to back up.</p>
         */
        public Builder sourceAppList(java.util.List<String> sourceAppList) {
            this.putQueryParameter("SourceAppList", sourceAppList);
            this.sourceAppList = sourceAppList;
            return this;
        }

        /**
         * <p>The list of file paths to back up.</p>
         */
        public Builder sourceFilePathList(java.util.List<String> sourceFilePathList) {
            this.putQueryParameter("SourceFilePathList", sourceFilePathList);
            this.sourceFilePathList = sourceFilePathList;
            return this;
        }

        /**
         * <p>The domain name of the backup address.</p>
         * <blockquote>
         * <p>If you upload the backup file to an OSS bucket, call the describeBuckets operation to obtain the bucket. If the Cloud Phone instance and the bucket are in the same region, obtain the intranetEndpoint field. If they are in different regions, obtain the extranetEndpoint field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai-internal.aliyuncs.com</p>
         */
        public Builder uploadEndpoint(String uploadEndpoint) {
            this.putQueryParameter("UploadEndpoint", uploadEndpoint);
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
            this.putQueryParameter("UploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        @Override
        public BackupFileRequest build() {
            return new BackupFileRequest(this);
        } 

    } 

    /**
     * 
     * {@link BackupFileRequest} extends {@link TeaModel}
     *
     * <p>BackupFileRequest</p>
     */
    public static class CustomScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssObjectKey")
        private String ossObjectKey;

        @com.aliyun.core.annotation.NameInMap("OssRegion")
        private String ossRegion;

        @com.aliyun.core.annotation.NameInMap("TestInstanceIds")
        private java.util.List<String> testInstanceIds;

        private CustomScripts(Builder builder) {
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObjectKey = builder.ossObjectKey;
            this.ossRegion = builder.ossRegion;
            this.testInstanceIds = builder.testInstanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomScripts create() {
            return builder().build();
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return ossObjectKey
         */
        public String getOssObjectKey() {
            return this.ossObjectKey;
        }

        /**
         * @return ossRegion
         */
        public String getOssRegion() {
            return this.ossRegion;
        }

        /**
         * @return testInstanceIds
         */
        public java.util.List<String> getTestInstanceIds() {
            return this.testInstanceIds;
        }

        public static final class Builder {
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObjectKey; 
            private String ossRegion; 
            private java.util.List<String> testInstanceIds; 

            private Builder() {
            } 

            private Builder(CustomScripts model) {
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.ossObjectKey = model.ossObjectKey;
                this.ossRegion = model.ossRegion;
                this.testInstanceIds = model.testInstanceIds;
            } 

            /**
             * OssBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * OssObjectKey.
             */
            public Builder ossObjectKey(String ossObjectKey) {
                this.ossObjectKey = ossObjectKey;
                return this;
            }

            /**
             * OssRegion.
             */
            public Builder ossRegion(String ossRegion) {
                this.ossRegion = ossRegion;
                return this;
            }

            /**
             * TestInstanceIds.
             */
            public Builder testInstanceIds(java.util.List<String> testInstanceIds) {
                this.testInstanceIds = testInstanceIds;
                return this;
            }

            public CustomScripts build() {
                return new CustomScripts(this);
            } 

        } 

    }
}
