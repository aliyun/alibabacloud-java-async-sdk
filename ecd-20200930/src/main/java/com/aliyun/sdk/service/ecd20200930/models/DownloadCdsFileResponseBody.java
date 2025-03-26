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
         * DownloadFileModel.
         */
        public Builder downloadFileModel(DownloadFileModel downloadFileModel) {
            this.downloadFileModel = downloadFileModel;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * DownloadType.
             */
            public Builder downloadType(String downloadType) {
                this.downloadType = downloadType;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * ExpirationSecond.
             */
            public Builder expirationSecond(String expirationSecond) {
                this.expirationSecond = expirationSecond;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * StreamUrl.
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
