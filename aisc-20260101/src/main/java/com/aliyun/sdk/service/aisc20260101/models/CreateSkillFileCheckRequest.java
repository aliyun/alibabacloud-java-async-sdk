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

    private CreateSkillFileCheckRequest(Builder builder) {
        super(builder);
        this.files = builder.files;
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

    public static final class Builder extends Request.Builder<CreateSkillFileCheckRequest, Builder> {
        private java.util.List<Files> files; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillFileCheckRequest request) {
            super(request);
            this.files = request.files;
        } 

        /**
         * Files.
         */
        public Builder files(java.util.List<Files> files) {
            this.putQueryParameter("Files", files);
            this.files = files;
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

        private Files(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.fileName = builder.fileName;
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

        public static final class Builder {
            private String downloadUrl; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.downloadUrl = model.downloadUrl;
                this.fileName = model.fileName;
            } 

            /**
             * DownloadUrl.
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

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
