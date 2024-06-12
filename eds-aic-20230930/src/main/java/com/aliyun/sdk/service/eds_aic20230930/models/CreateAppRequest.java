// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

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

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.iconUrl = builder.iconUrl;
        this.installParam = builder.installParam;
        this.ossAppUrl = builder.ossAppUrl;
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

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String appName; 
        private String description; 
        private String fileName; 
        private String filePath; 
        private String iconUrl; 
        private String installParam; 
        private String ossAppUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.description = request.description;
            this.fileName = request.fileName;
            this.filePath = request.filePath;
            this.iconUrl = request.iconUrl;
            this.installParam = request.installParam;
            this.ossAppUrl = request.ossAppUrl;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * IconUrl.
         */
        public Builder iconUrl(String iconUrl) {
            this.putQueryParameter("IconUrl", iconUrl);
            this.iconUrl = iconUrl;
            return this;
        }

        /**
         * InstallParam.
         */
        public Builder installParam(String installParam) {
            this.putQueryParameter("InstallParam", installParam);
            this.installParam = installParam;
            return this;
        }

        /**
         * OssAppUrl.
         */
        public Builder ossAppUrl(String ossAppUrl) {
            this.putQueryParameter("OssAppUrl", ossAppUrl);
            this.ossAppUrl = ossAppUrl;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

}
