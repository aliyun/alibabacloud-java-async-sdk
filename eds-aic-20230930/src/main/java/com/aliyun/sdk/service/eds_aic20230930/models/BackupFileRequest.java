// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BackupFileRequest} extends {@link RequestModel}
 *
 * <p>BackupFileRequest</p>
 */
public class BackupFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > androidInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceFilePathList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > sourceFilePathList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
    private String uploadEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadType")
    private String uploadType;

    private BackupFileRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.backupFilePath = builder.backupFilePath;
        this.description = builder.description;
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
    public java.util.List < String > getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
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
     * @return sourceFilePathList
     */
    public java.util.List < String > getSourceFilePathList() {
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
        private java.util.List < String > androidInstanceIdList; 
        private String backupFilePath; 
        private String description; 
        private java.util.List < String > sourceFilePathList; 
        private String uploadEndpoint; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(BackupFileRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.backupFilePath = request.backupFilePath;
            this.description = request.description;
            this.sourceFilePathList = request.sourceFilePathList;
            this.uploadEndpoint = request.uploadEndpoint;
            this.uploadType = request.uploadType;
        } 

        /**
         * AndroidInstanceIdList.
         */
        public Builder androidInstanceIdList(java.util.List < String > androidInstanceIdList) {
            this.putQueryParameter("AndroidInstanceIdList", androidInstanceIdList);
            this.androidInstanceIdList = androidInstanceIdList;
            return this;
        }

        /**
         * BackupFilePath.
         */
        public Builder backupFilePath(String backupFilePath) {
            this.putQueryParameter("BackupFilePath", backupFilePath);
            this.backupFilePath = backupFilePath;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * SourceFilePathList.
         */
        public Builder sourceFilePathList(java.util.List < String > sourceFilePathList) {
            this.putQueryParameter("SourceFilePathList", sourceFilePathList);
            this.sourceFilePathList = sourceFilePathList;
            return this;
        }

        /**
         * UploadEndpoint.
         */
        public Builder uploadEndpoint(String uploadEndpoint) {
            this.putQueryParameter("UploadEndpoint", uploadEndpoint);
            this.uploadEndpoint = uploadEndpoint;
            return this;
        }

        /**
         * UploadType.
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
