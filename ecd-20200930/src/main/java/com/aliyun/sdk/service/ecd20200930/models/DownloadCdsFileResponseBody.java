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
 * {@link DownloadCdsFileResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadCdsFileResponseBody</p>
 */
public class DownloadCdsFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadFileModel")
    private DownloadFileModel downloadFileModel;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DownloadCdsFileResponseBody(Builder builder) {
        this.downloadFileModel = builder.downloadFileModel;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadCdsFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadFileModel
     */
    public DownloadFileModel getDownloadFileModel() {
        return this.downloadFileModel;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DownloadFileModel downloadFileModel; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DownloadCdsFileResponseBody model) {
            this.downloadFileModel = model.downloadFileModel;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The download URL of the file.</p>
         */
        public Builder downloadFileModel(DownloadFileModel downloadFileModel) {
            this.downloadFileModel = downloadFileModel;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E3ED9519-DD73-5C86-9C0A-43C9281C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DownloadCdsFileResponseBody build() {
            return new DownloadCdsFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DownloadCdsFileResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadCdsFileResponseBody</p>
     */
    public static class DownloadFileModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadType")
        private String downloadType;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExpirationSecond")
        private String expirationSecond;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private String streamUrl;

        private DownloadFileModel(Builder builder) {
            this.downloadType = builder.downloadType;
            this.downloadUrl = builder.downloadUrl;
            this.expirationSecond = builder.expirationSecond;
            this.expirationTime = builder.expirationTime;
            this.fileId = builder.fileId;
            this.size = builder.size;
            this.streamUrl = builder.streamUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadFileModel create() {
            return builder().build();
        }

        /**
         * @return downloadType
         */
        public String getDownloadType() {
            return this.downloadType;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return expirationSecond
         */
        public String getExpirationSecond() {
            return this.expirationSecond;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return streamUrl
         */
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public static final class Builder {
            private String downloadType; 
            private String downloadUrl; 
            private String expirationSecond; 
            private String expirationTime; 
            private String fileId; 
            private Long size; 
            private String streamUrl; 

            private Builder() {
            } 

            private Builder(DownloadFileModel model) {
                this.downloadType = model.downloadType;
                this.downloadUrl = model.downloadUrl;
                this.expirationSecond = model.expirationSecond;
                this.expirationTime = model.expirationTime;
                this.fileId = model.fileId;
                this.size = model.size;
                this.streamUrl = model.streamUrl;
            } 

            /**
             * <p>This parameter is deprecated.</p>
             */
            public Builder downloadType(String downloadType) {
                this.downloadType = downloadType;
                return this;
            }

            /**
             * <p>The download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://pds-XXXX-bj-1693807057.oss-cn-beijing.aliyuncs.com/A0SKfLOp%2F2%2F6662612e0570fb2bdd5549759716d433439f0572%2F6662612ee3804e4901794928b14f9a7477640ee7?di=XXXX&dr=1030&f=667d5a322ebf7409e91c485d808fb3bd8a73efbb&response-content-disposition=attachment%3B%20">https://pds-XXXX-bj-1693807057.oss-cn-beijing.aliyuncs.com/A0SKfLOp%2F2%2F6662612e0570fb2bdd5549759716d433439f0572%2F6662612ee3804e4901794928b14f9a7477640ee7?di=XXXX&amp;dr=1030&amp;f=667d5a322ebf7409e91c485d808fb3bd8a73efbb&amp;response-content-disposition=attachment%3B%20</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             */
            public Builder expirationSecond(String expirationSecond) {
                this.expirationSecond = expirationSecond;
                return this;
            }

            /**
             * <p>The validity period of the download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-18T02:55:49.795Z</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>667d5a322ebf7409e91c485d808fb3bd8a73efbb</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1594642</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             */
            public Builder streamUrl(String streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            public DownloadFileModel build() {
                return new DownloadFileModel(this);
            } 

        } 

    }
}
