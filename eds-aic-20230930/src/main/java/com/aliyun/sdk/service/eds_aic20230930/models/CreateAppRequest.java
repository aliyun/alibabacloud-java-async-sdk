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
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAppInfo")
    private CustomAppInfo customAppInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IconUrl")
    private String iconUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstallParam")
    private String installParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssAppUrl")
    private String ossAppUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignApk")
    private String signApk;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.bizRegionId = builder.bizRegionId;
        this.customAppInfo = builder.customAppInfo;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.iconUrl = builder.iconUrl;
        this.installParam = builder.installParam;
        this.ossAppUrl = builder.ossAppUrl;
        this.signApk = builder.signApk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return customAppInfo
     */
    public CustomAppInfo getCustomAppInfo() {
        return this.customAppInfo;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return iconUrl
     */
    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * @return installParam
     */
    public String getInstallParam() {
        return this.installParam;
    }

    /**
     * @return ossAppUrl
     */
    public String getOssAppUrl() {
        return this.ossAppUrl;
    }

    /**
     * @return signApk
     */
    public String getSignApk() {
        return this.signApk;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appName; 
        private String bizRegionId; 
        private CustomAppInfo customAppInfo; 
        private String description; 
        private String fileName; 
        private String filePath; 
        private String iconUrl; 
        private String installParam; 
        private String ossAppUrl; 
        private String signApk; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.bizRegionId = request.bizRegionId;
            this.customAppInfo = request.customAppInfo;
            this.description = request.description;
            this.fileName = request.fileName;
            this.filePath = request.filePath;
            this.iconUrl = request.iconUrl;
            this.installParam = request.installParam;
            this.ossAppUrl = request.ossAppUrl;
            this.signApk = request.signApk;
        } 

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Application name 1</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The custom application information.</p>
         * <blockquote>
         * <ul>
         * <li><p>If you pass a custom application, pass the <code>CustomAppInfo</code> parameter. All six fields in this object parameter are required.</p>
         * </li>
         * <li><p>Custom applications have a higher priority than applications from the WUYING Workspace app center. If you pass the <code>CustomAppInfo</code> parameter, <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code> will be invalid.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        public Builder customAppInfo(CustomAppInfo customAppInfo) {
            String customAppInfoShrink = shrink(customAppInfo, "CustomAppInfo", "json");
            this.putQueryParameter("CustomAppInfo", customAppInfoShrink);
            this.customAppInfo = customAppInfo;
            return this;
        }

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>Application description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the application file stored in Object Storage Service (OSS). This parameter and <code>FilePath</code> together determine the unique OSS address.</p>
         * <blockquote>
         * <ul>
         * <li><p>If you pass an application from the WUYING Workspace app center, you must pass <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code>. The former takes precedence.</p>
         * </li>
         * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">WUYING Workspace console</a>. Follow the on-screen instructions to upload your application file to the WUYING Workspace app center to obtain this parameter.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testApp.apk</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The storage address of the application file in an OSS bucket. This parameter and <code>FileName</code> together determine the unique OSS address.</p>
         * <blockquote>
         * <ul>
         * <li><p>If you pass an application from the WUYING Workspace app center, you must pass <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code>. The former takes precedence.</p>
         * </li>
         * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">WUYING Workspace console</a>. Follow the on-screen instructions to upload your application file to the WUYING Workspace app center to obtain this parameter.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The URL of the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/icon.png">https://www.example.com/icon.png</a></p>
         */
        public Builder iconUrl(String iconUrl) {
            this.putQueryParameter("IconUrl", iconUrl);
            this.iconUrl = iconUrl;
            return this;
        }

        /**
         * <p>The installation parameters. The <code>-r</code> installation parameter is included by default when you install the application.</p>
         * 
         * <strong>example:</strong>
         * <p>-d</p>
         */
        public Builder installParam(String installParam) {
            this.putQueryParameter("InstallParam", installParam);
            this.installParam = installParam;
            return this;
        }

        /**
         * <p>The OSS address of the application.</p>
         * <blockquote>
         * <ul>
         * <li><p>If you pass an application from the WUYING Workspace app center, you must pass <code>FileName</code> and <code>FilePath</code>, or <code>OssAppUrl</code>. The former takes precedence.</p>
         * </li>
         * <li><p>Log on to the <a href="https://eds.console.aliyun.com/osshelp">WUYING Workspace console</a>. Follow the on-screen instructions to upload your application file to the WUYING Workspace app center to obtain this parameter.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://testApp.apk">http://testApp.apk</a></p>
         */
        public Builder ossAppUrl(String ossAppUrl) {
            this.putQueryParameter("OssAppUrl", ossAppUrl);
            this.ossAppUrl = ossAppUrl;
            return this;
        }

        /**
         * <p>Specifies whether to perform a system signature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder signApk(String signApk) {
            this.putQueryParameter("SignApk", signApk);
            this.signApk = signApk;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppRequest} extends {@link TeaModel}
     *
     * <p>CreateAppRequest</p>
     */
    public static class CustomAppInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApkSize")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String apkSize;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("Md5")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String md5;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        @com.aliyun.core.annotation.Validation(maxLength = 128)
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String versionCode;

        private CustomAppInfo(Builder builder) {
            this.apkSize = builder.apkSize;
            this.downloadUrl = builder.downloadUrl;
            this.md5 = builder.md5;
            this.packageName = builder.packageName;
            this.version = builder.version;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomAppInfo create() {
            return builder().build();
        }

        /**
         * @return apkSize
         */
        public String getApkSize() {
            return this.apkSize;
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
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String apkSize; 
            private String downloadUrl; 
            private String md5; 
            private String packageName; 
            private String version; 
            private String versionCode; 

            private Builder() {
            } 

            private Builder(CustomAppInfo model) {
                this.apkSize = model.apkSize;
                this.downloadUrl = model.downloadUrl;
                this.md5 = model.md5;
                this.packageName = model.packageName;
                this.version = model.version;
                this.versionCode = model.versionCode;
            } 

            /**
             * <p>The size of the .apk file. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder apkSize(String apkSize) {
                this.apkSize = apkSize;
                return this;
            }

            /**
             * <p>The download URL of the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://testApp.apk">http://testApp.apk</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The MD5 value of the .apk package.</p>
             * 
             * <strong>example:</strong>
             * <p>df3f46ce5844ddb278f14c5a9cd2****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The application package name.</p>
             * 
             * <strong>example:</strong>
             * <p>com.example.demo</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The application version code.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public CustomAppInfo build() {
                return new CustomAppInfo(this);
            } 

        } 

    }
}
