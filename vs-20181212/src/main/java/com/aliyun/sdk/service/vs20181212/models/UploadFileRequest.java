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
 * {@link UploadFileRequest} extends {@link RequestModel}
 *
 * <p>UploadFileRequest</p>
 */
public class UploadFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 8)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Md5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String md5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetPath;

    private UploadFileRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.md5 = builder.md5;
        this.originUrl = builder.originUrl;
        this.targetPath = builder.targetPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return originUrl
     */
    public String getOriginUrl() {
        return this.originUrl;
    }

    /**
     * @return targetPath
     */
    public String getTargetPath() {
        return this.targetPath;
    }

    public static final class Builder extends Request.Builder<UploadFileRequest, Builder> {
        private String description; 
        private String fileName; 
        private String md5; 
        private String originUrl; 
        private String targetPath; 

        private Builder() {
            super();
        } 

        private Builder(UploadFileRequest request) {
            super(request);
            this.description = request.description;
            this.fileName = request.fileName;
            this.md5 = request.md5;
            this.originUrl = request.originUrl;
            this.targetPath = request.targetPath;
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
         * <p>mytest</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>150b6083f50dd08159d45a0d5e4b56f9</p>
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.xxx.xxx.tar">https://xxx.xxx.xxx.tar</a></p>
         */
        public Builder originUrl(String originUrl) {
            this.putQueryParameter("OriginUrl", originUrl);
            this.originUrl = originUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/tmp/test/xxx.tar</p>
         */
        public Builder targetPath(String targetPath) {
            this.putQueryParameter("TargetPath", targetPath);
            this.targetPath = targetPath;
            return this;
        }

        @Override
        public UploadFileRequest build() {
            return new UploadFileRequest(this);
        } 

    } 

}
