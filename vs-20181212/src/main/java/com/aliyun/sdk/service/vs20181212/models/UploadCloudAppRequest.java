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
         * <p>The application name. For Android applications, use the package name, such as com.aaa.bbb.</p>
         * <p>Value rules:</p>
         * <ol>
         * <li>Length: 4 to 50 characters.</li>
         * <li>Lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
         * <li>The first and last characters must be letters or digits.</li>
         * </ol>
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
         * <p>The application version. For Android applications, use the VersionName, such as 1.1.1.</p>
         * <p>Value rules:</p>
         * <ol>
         * <li>Length: 1 to 50 characters.</li>
         * <li>Lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
         * <li>The first and last characters must be letters or digits.</li>
         * </ol>
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
         * <p>The MD5 checksum of the application package, used to verify package integrity.</p>
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
         * <p>The package format. The default value is the file extension of the download URL. Valid values:</p>
         * <ol>
         * <li>apk</li>
         * <li>tar.gz</li>
         * <li>tar</li>
         * <li>zip</li>
         * <li>rar</li>
         * </ol>
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
         * <p>The cloud application labels. You can select multiple values. Valid values:</p>
         * <ol>
         * <li>hot</li>
         * <li>game</li>
         * <li>app</li>
         * </ol>
         */
        public Builder pkgLabels(java.util.List<String> pkgLabels) {
            String pkgLabelsShrink = shrink(pkgLabels, "PkgLabels", "json");
            this.putQueryParameter("PkgLabels", pkgLabelsShrink);
            this.pkgLabels = pkgLabels;
            return this;
        }

        /**
         * <p>The package type.</p>
         * <h2>Valid values:</h2>
         * <ol>
         * <li>android</li>
         * <li>win</li>
         * <li>android_appmarket: corresponds to the Android app marketplace scenario. In this scenario, the actual APK PackageName is restricted:
         * a. Different AppName values cannot share the same PackageName.
         * b. The same AppName with different AppVersion values can be associated with different PackageName values.</li>
         * </ol>
         * <h2>Default value:</h2>
         * <p>If not specified, the package type is automatically mapped based on PkgFormat (or the file extension of DownloadUrl). Default mappings between PkgFormat and package type:</p>
         * <ol>
         * <li>android: apk (the apk format is mapped to android by default).</li>
         * <li>win: tar.gz, tar, zip, rar.</li>
         * <li>android_appmarket: apk.</li>
         * </ol>
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
         * <p>The relative path of the post-installation command within the application package. Only supported for win type applications.</p>
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
         * <p>The timeout period (in seconds) for the post-installation command. Only supported for win type applications.</p>
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
