// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link UploadCloudAppRequest} extends {@link RequestModel}
 *
 * <p>UploadCloudAppRequest</p>
 */
public class UploadCloudAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50, minLength = 4)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 50, minLength = 1)
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String downloadUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String md5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgFormat")
    private String pkgFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgLabels")
    private java.util.List<String> pkgLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgType")
    private String pkgType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCommandPath")
    private String postCommandPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostCommandTimeoutSec")
    private Integer postCommandTimeoutSec;

    private UploadCloudAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appVersion = builder.appVersion;
        this.description = builder.description;
        this.downloadUrl = builder.downloadUrl;
        this.md5 = builder.md5;
        this.pkgFormat = builder.pkgFormat;
        this.pkgLabels = builder.pkgLabels;
        this.pkgType = builder.pkgType;
        this.postCommandPath = builder.postCommandPath;
        this.postCommandTimeoutSec = builder.postCommandTimeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadCloudAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return pkgFormat
     */
    public String getPkgFormat() {
        return this.pkgFormat;
    }

    /**
     * @return pkgLabels
     */
    public java.util.List<String> getPkgLabels() {
        return this.pkgLabels;
    }

    /**
     * @return pkgType
     */
    public String getPkgType() {
        return this.pkgType;
    }

    /**
     * @return postCommandPath
     */
    public String getPostCommandPath() {
        return this.postCommandPath;
    }

    /**
     * @return postCommandTimeoutSec
     */
    public Integer getPostCommandTimeoutSec() {
        return this.postCommandTimeoutSec;
    }

    public static final class Builder extends Request.Builder<UploadCloudAppRequest, Builder> {
        private String appName; 
        private String appVersion; 
        private String description; 
        private String downloadUrl; 
        private String md5; 
        private String pkgFormat; 
        private java.util.List<String> pkgLabels; 
        private String pkgType; 
        private String postCommandPath; 
        private Integer postCommandTimeoutSec; 

        private Builder() {
            super();
        } 

        private Builder(UploadCloudAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.appVersion = request.appVersion;
            this.description = request.description;
            this.downloadUrl = request.downloadUrl;
            this.md5 = request.md5;
            this.pkgFormat = request.pkgFormat;
            this.pkgLabels = request.pkgLabels;
            this.pkgType = request.pkgType;
            this.postCommandPath = request.postCommandPath;
            this.postCommandTimeoutSec = request.postCommandTimeoutSec;
        } 

        /**
         * <p>The application name. For Android applications, we recommend that you use the package name, such as com.aaa.bbb. Naming conventions: 1. The length is 4 to 50 characters. 2. The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). 3. The first and last characters must be letters or digits.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aaa.bbb</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The application version. For Android applications, we recommend that you use the VersionName, such as 1.1.1. Naming conventions: 1. The length is 1 to 50 characters. 2. The version can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.). 3. The first and last characters must be letters or digits.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1</p>
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Test application package</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The download URL of the application package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.xxx.xxx.apk">https://xxx.xxx.xxx.apk</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.putQueryParameter("DownloadUrl", downloadUrl);
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The MD5 hash of the application package, which is used to check the integrity of the application package.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0CFBB7BD10CDD7279642ADAB8FEF3DEE</p>
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * <p>The format of the installation package. The default value is the file name extension of the download URL. Valid values: 1. apk 2. tar.gz 3. tar 4. zip 5. rar.</p>
         * 
         * <strong>example:</strong>
         * <p>apk</p>
         */
        public Builder pkgFormat(String pkgFormat) {
            this.putQueryParameter("PkgFormat", pkgFormat);
            this.pkgFormat = pkgFormat;
            return this;
        }

        /**
         * <p>The tags of the cloud application. You can specify multiple tags. Valid values: 1. hot 2. game 3. app.</p>
         */
        public Builder pkgLabels(java.util.List<String> pkgLabels) {
            String pkgLabelsShrink = shrink(pkgLabels, "PkgLabels", "json");
            this.putQueryParameter("PkgLabels", pkgLabelsShrink);
            this.pkgLabels = pkgLabels;
            return this;
        }

        /**
         * <p>The type of the installation package. ## Valid values: 1. android 2. win 3. android_appmarket: This value applies to Android app marketplace scenarios. In this scenario, the actual package name of the APK is restricted. a. The package names of different AppName values cannot be duplicated. b. Different AppVersion values of the same AppName can be associated with different package names. ## Default value description: If this parameter is not specified, the installation package type is automatically mapped based on the PkgFormat parameter or the file name extension of the DownloadUrl parameter. The default mapping between PkgFormat and the installation package type is as follows: 1. android: apk. The apk format is mapped to android by default. 2. win: tar.gz, tar, zip, and rar. 3. android_appmarket: apk.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder pkgType(String pkgType) {
            this.putQueryParameter("PkgType", pkgType);
            this.pkgType = pkgType;
            return this;
        }

        /**
         * <p>The relative path of the post-command in the application package. This parameter is supported only for Windows applications.</p>
         * 
         * <strong>example:</strong>
         * <p>install.ps1</p>
         */
        public Builder postCommandPath(String postCommandPath) {
            this.putQueryParameter("PostCommandPath", postCommandPath);
            this.postCommandPath = postCommandPath;
            return this;
        }

        /**
         * <p>The timeout period for executing the post-command, in seconds. This parameter is supported only for Windows applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder postCommandTimeoutSec(Integer postCommandTimeoutSec) {
            this.putQueryParameter("PostCommandTimeoutSec", postCommandTimeoutSec);
            this.postCommandTimeoutSec = postCommandTimeoutSec;
            return this;
        }

        @Override
        public UploadCloudAppRequest build() {
            return new UploadCloudAppRequest(this);
        } 

    } 

}
