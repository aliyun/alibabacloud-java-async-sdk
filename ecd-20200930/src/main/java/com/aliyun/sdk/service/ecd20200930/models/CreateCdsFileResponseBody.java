// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateCdsFileResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCdsFileResponseBody</p>
 */
public class CreateCdsFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileModel")
    private FileModel fileModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCdsFileResponseBody(Builder builder) {
        this.fileModel = builder.fileModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdsFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileModel
     */
    public FileModel getFileModel() {
        return this.fileModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FileModel fileModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCdsFileResponseBody model) {
            this.fileModel = model.fileModel;
            this.requestId = model.requestId;
        } 

        /**
         * FileModel.
         */
        public Builder fileModel(FileModel fileModel) {
            this.fileModel = fileModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2BAFE05D-FFB9-5938-96D0-08017DB9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCdsFileResponseBody build() {
            return new CreateCdsFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCdsFileResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCdsFileResponseBody</p>
     */
    public static class FileModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("UploadId")
        private String uploadId;

        @com.aliyun.core.annotation.NameInMap("UploadUrl")
        private String uploadUrl;

        private FileModel(Builder builder) {
            this.fileId = builder.fileId;
            this.uploadId = builder.uploadId;
            this.uploadUrl = builder.uploadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileModel create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private String fileId; 
            private String uploadId; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(FileModel model) {
                this.fileId = model.fileId;
                this.uploadId = model.uploadId;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * UploadId.
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            /**
             * UploadUrl.
             */
            public Builder uploadUrl(String uploadUrl) {
                this.uploadUrl = uploadUrl;
                return this;
            }

            public FileModel build() {
                return new FileModel(this);
            } 

        } 

    }
}
