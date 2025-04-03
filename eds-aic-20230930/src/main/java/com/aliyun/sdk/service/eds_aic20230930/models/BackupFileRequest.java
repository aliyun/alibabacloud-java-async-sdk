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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
        this.description = builder.description;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private String description; 
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
            this.description = request.description;
            this.sourceAppList = request.sourceAppList;
            this.sourceFilePathList = request.sourceFilePathList;
            this.uploadEndpoint = request.uploadEndpoint;
            this.uploadType = request.uploadType;
        } 

        /**
         * <p>The IDs of the instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder androidInstanceIdList(java.util.List<String> androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * <p>Specifies whether to back up the whole instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>defaultBackupFile</p>
         */
        public Builder backupFileName(String backupFileName) {
            this.putQueryParameter("BackupFileName", backupFileName);
            this.backupFileName = backupFileName;
            return this;
        }

        /**
         * <p>The OSS path of the backup file.</p>
         * <blockquote>
         * <p> To upload a backup file to an OSS bucket, you must obtain the name of the bucket. When calling the describeBuckets operation to retrieve a bucket name, you must also call the ossObjectList operation to obtain the object key. Combine these to form the full path: oss://${bucketName}/${key}.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder backupFilePath(String backupFilePath) {
            this.putQueryParameter("BackupFilePath", backupFilePath);
            this.backupFilePath = backupFilePath;
            return this;
        }

        /**
         * <p>The description of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a backup file description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The names of the application packages that you want to back up.</p>
         */
        public Builder sourceAppList(java.util.List<String> sourceAppList) {
            this.putQueryParameter("SourceAppList", sourceAppList);
            this.sourceAppList = sourceAppList;
            return this;
        }

        /**
         * <p>The paths to the source files.</p>
         */
        public Builder sourceFilePathList(java.util.List<String> sourceFilePathList) {
            this.putQueryParameter("SourceFilePathList", sourceFilePathList);
            this.sourceFilePathList = sourceFilePathList;
            return this;
        }

        /**
         * <p>The endpoint of the OSS bucket to which you want to upload the backup file.</p>
         * <blockquote>
         * <p>: When calling the DescribeBuckets operation to query buckets, retrieve the IntranetEndpoint value if the cloud phone and the OSS bucket are in the same region. If they are in different regions, retrieve the ExtranetEndpoint value instead.</p>
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
         * <p>The type of the backup.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OSS: uploads the backup file to an OSS bucket.</li>
         * </ul>
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

}
