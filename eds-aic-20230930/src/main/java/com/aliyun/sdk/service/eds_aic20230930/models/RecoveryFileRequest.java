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
 * {@link RecoveryFileRequest} extends {@link RequestModel}
 *
 * <p>RecoveryFileRequest</p>
 */
public class RecoveryFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> androidInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupAll")
    private Boolean backupAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFileId")
    private String backupFileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupFilePath")
    private String backupFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomScripts")
    private java.util.List<CustomScripts> customScripts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeAppList")
    private java.util.List<String> excludeAppList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadEndpoint")
    private String uploadEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadType")
    private String uploadType;

    private RecoveryFileRequest(Builder builder) {
        super(builder);
        this.androidInstanceIdList = builder.androidInstanceIdList;
        this.backupAll = builder.backupAll;
        this.backupFileId = builder.backupFileId;
        this.backupFilePath = builder.backupFilePath;
        this.customScripts = builder.customScripts;
        this.excludeAppList = builder.excludeAppList;
        this.uploadEndpoint = builder.uploadEndpoint;
        this.uploadType = builder.uploadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoveryFileRequest create() {
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
     * @return backupFileId
     */
    public String getBackupFileId() {
        return this.backupFileId;
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

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    public static final class Builder extends Request.Builder<RecoveryFileRequest, Builder> {
        private java.util.List<String> androidInstanceIdList; 
        private Boolean backupAll; 
        private String backupFileId; 
        private String backupFilePath; 
        private java.util.List<CustomScripts> customScripts; 
        private java.util.List<String> excludeAppList; 
        private String uploadEndpoint; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(RecoveryFileRequest request) {
            super(request);
            this.androidInstanceIdList = request.androidInstanceIdList;
            this.backupAll = request.backupAll;
            this.backupFileId = request.backupFileId;
            this.backupFilePath = request.backupFilePath;
            this.customScripts = request.customScripts;
            this.excludeAppList = request.excludeAppList;
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
         * <p>Specifies whether it is a full-device backup.</p>
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
         * <p>The ID of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>bf-azhps4rdyi2th****</p>
         */
        public Builder backupFileId(String backupFileId) {
            this.putQueryParameter("BackupFileId", backupFileId);
            this.backupFileId = backupFileId;
            return this;
        }

        /**
         * <p>The OSS address to which the backup file is uploaded.
         * <notice>Call the describeBuckets operation to obtain the bucketName, and select ossObjectList to obtain the key. The key is the path of the backup file. Concatenate them into &quot;oss://${bucketName}/${key}&quot;.</notice></p>
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
         * <p>The list of excluded app package names for full-device restore. Matched apps are not uninstalled, and their APKs are not installed (compatible with legacy backups that contain APKs). Only user data is replaced. The empty shell must be installed by the customer using pm install. If this parameter is not specified, no apps are excluded.</p>
         */
        public Builder excludeAppList(java.util.List<String> excludeAppList) {
            this.putQueryParameter("ExcludeAppList", excludeAppList);
            this.excludeAppList = excludeAppList;
            return this;
        }

        /**
         * <p>The domain name of the backup address.
         * <notice>Call the DescribeBuckets operation to obtain the bucket. If the cloud phone and the bucket are in the same region, obtain the IntranetEndpoint field. If they are in different regions, obtain the ExtranetEndpoint field.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
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
        public RecoveryFileRequest build() {
            return new RecoveryFileRequest(this);
        } 

    } 

    /**
     * 
     * {@link RecoveryFileRequest} extends {@link TeaModel}
     *
     * <p>RecoveryFileRequest</p>
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
