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
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 8)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 1)
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

    private UploadCloudAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appVersion = builder.appVersion;
        this.description = builder.description;
        this.downloadUrl = builder.downloadUrl;
        this.md5 = builder.md5;
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

    public static final class Builder extends Request.Builder<UploadCloudAppRequest, Builder> {
        private String appName; 
        private String appVersion; 
        private String description; 
        private String downloadUrl; 
        private String md5; 

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
        } 

        /**
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
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

        @Override
        public UploadCloudAppRequest build() {
            return new UploadCloudAppRequest(this);
        } 

    } 

}
