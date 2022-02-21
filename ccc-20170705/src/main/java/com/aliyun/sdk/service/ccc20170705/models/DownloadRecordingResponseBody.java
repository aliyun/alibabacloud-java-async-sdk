// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadRecordingResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadRecordingResponseBody</p>
 */
public class DownloadRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("MediaDownloadParam")
    private MediaDownloadParam mediaDownloadParam;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DownloadRecordingResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.mediaDownloadParam = builder.mediaDownloadParam;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadRecordingResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return mediaDownloadParam
     */
    public MediaDownloadParam getMediaDownloadParam() {
        return this.mediaDownloadParam;
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
        private String code; 
        private Integer httpStatusCode; 
        private MediaDownloadParam mediaDownloadParam; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * MediaDownloadParam.
         */
        public Builder mediaDownloadParam(MediaDownloadParam mediaDownloadParam) {
            this.mediaDownloadParam = mediaDownloadParam;
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

        public DownloadRecordingResponseBody build() {
            return new DownloadRecordingResponseBody(this);
        } 

    } 

    public static class MediaDownloadParam extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("SignatureUrl")
        private String signatureUrl;

        private MediaDownloadParam(Builder builder) {
            this.fileName = builder.fileName;
            this.signatureUrl = builder.signatureUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaDownloadParam create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return signatureUrl
         */
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

        public static final class Builder {
            private String fileName; 
            private String signatureUrl; 

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * SignatureUrl.
             */
            public Builder signatureUrl(String signatureUrl) {
                this.signatureUrl = signatureUrl;
                return this;
            }

            public MediaDownloadParam build() {
                return new MediaDownloadParam(this);
            } 

        } 

    }
}
