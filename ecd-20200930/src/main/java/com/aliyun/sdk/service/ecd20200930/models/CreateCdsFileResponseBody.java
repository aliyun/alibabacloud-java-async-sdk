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
         * <p>File upload response object.</p>
         */
        public Builder fileModel(FileModel fileModel) {
            this.fileModel = fileModel;
            return this;
        }

        /**
         * <p>Request ID.</p>
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
             * <p>File ID.</p>
             * 
             * <strong>example:</strong>
             * <p>646ec2f662b1e08f7a2b4d648982f906****</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>File upload task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20BE155AC20943BE9D405B0997A9****</p>
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            /**
             * <p>File upload URL. Valid for 15 minutes by default.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://data.aliyunpds.com/xxx/xxx?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx&partNumber=1&uploadId=0CC175B9C0F1B6A831C399E26977">https://data.aliyunpds.com/xxx/xxx?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx&amp;partNumber=1&amp;uploadId=0CC175B9C0F1B6A831C399E26977</a>****</p>
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
