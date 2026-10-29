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
 * {@link BackupAndroidInstanceRequest} extends {@link RequestModel}
 *
 * <p>BackupAndroidInstanceRequest</p>
 */
public class BackupAndroidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> androidInstanceIdList;

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
    @com.aliyun.core.annotation.NameInMap("ExcludeAppList")
    private java.util.List<String> excludeAppList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadEndpoint;

    private BackupAndroidInstanceRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.backupFileName = builder.backupFileName;
        this.backupFilePath = builder.backupFilePath;
        this.description = builder.description;
        this.excludeAppList = builder.excludeAppList;
        this.uploadEndpoint = builder.uploadEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackupAndroidInstanceRequest create() {
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
     * @return excludeAppList
     */
    public java.util.List<String> getExcludeAppList() {
        return this.excludeAppList;
    }

    /**
     * @return uploadEndpoint
     */
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    public static final class Builder extends Request.Builder<BackupAndroidInstanceRequest, Builder> {
        private java.util.List<String> androidInstanceIdList; 
        private String backupFileName; 
        private String backupFilePath; 
        private String description; 
        private java.util.List<String> excludeAppList; 
        private String uploadEndpoint; 

        private Builder() {
            super();
        } 

        private Builder(BackupAndroidInstanceRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.backupFileName = request.backupFileName;
            this.backupFilePath = request.backupFilePath;
            this.description = request.description;
            this.excludeAppList = request.excludeAppList;
            this.uploadEndpoint = request.uploadEndpoint;
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
         * <p>The name of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder backupFileName(String backupFileName) {
            this.putQueryParameter("BackupFileName", backupFileName);
            this.backupFileName = backupFileName;
            return this;
        }

        /**
         * <p>The upload URL of the backup file.</p>
         * <p>This parameter is required.</p>
         */
        public Builder backupFilePath(String backupFilePath) {
            this.putQueryParameter("BackupFilePath", backupFilePath);
            this.backupFilePath = backupFilePath;
            return this;
        }

        /**
         * <p>The description of the full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a backup android instance</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of application package names to exclude from the full backup. For matched applications, only APK collection is skipped, and user data is backed up as usual. If this parameter is not specified, no applications are excluded.</p>
         */
        public Builder excludeAppList(java.util.List<String> excludeAppList) {
            this.putQueryParameter("ExcludeAppList", excludeAppList);
            this.excludeAppList = excludeAppList;
            return this;
        }

        /**
         * <p>The backup region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        public Builder uploadEndpoint(String uploadEndpoint) {
            this.putQueryParameter("UploadEndpoint", uploadEndpoint);
            this.uploadEndpoint = uploadEndpoint;
            return this;
        }

        @Override
        public BackupAndroidInstanceRequest build() {
            return new BackupAndroidInstanceRequest(this);
        } 

    } 

}
