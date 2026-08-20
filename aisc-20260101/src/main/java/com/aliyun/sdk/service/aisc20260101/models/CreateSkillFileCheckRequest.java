// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link CreateSkillFileCheckRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillFileCheckRequest</p>
 */
public class CreateSkillFileCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private CreateSkillFileCheckRequest(Builder builder) {
        super(builder);
        this.files = builder.files;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillFileCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateSkillFileCheckRequest, Builder> {
        private java.util.List<Files> files; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillFileCheckRequest request) {
            super(request);
            this.files = request.files;
            this.source = request.source;
        } 

        /**
         * Files.
         */
        public Builder files(java.util.List<Files> files) {
            this.putQueryParameter("Files", files);
            this.files = files;
            return this;
        }

        /**
         * <p>上传来源；为空默认user_upload，安全运营Agent使用sec_ops_agent</p>
         * 
         * <strong>example:</strong>
         * <p>sec_ops_agent</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateSkillFileCheckRequest build() {
            return new CreateSkillFileCheckRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSkillFileCheckRequest} extends {@link TeaModel}
     *
     * <p>CreateSkillFileCheckRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("UploadKey")
        private String uploadKey;

        private Files(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.fileName = builder.fileName;
            this.uploadKey = builder.uploadKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return uploadKey
         */
        public String getUploadKey() {
            return this.uploadKey;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String fileName; 
            private String uploadKey; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.downloadUrl = model.downloadUrl;
                this.fileName = model.fileName;
                this.uploadKey = model.uploadKey;
            } 

            /**
             * <p>公网下载地址；与UploadKey二选一</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/xxxx">https://test.oss-cn-hangzhou.aliyuncs.com/xxxx</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>GenerateSkillOssUploadCredential返回的租户隔离OSS临时对象Key；与DownloadUrl二选一</p>
             * 
             * <strong>example:</strong>
             * <p>user-upload/staging/123456789/550e8400-e29b-41d4-a716-446655440000</p>
             */
            public Builder uploadKey(String uploadKey) {
                this.uploadKey = uploadKey;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
