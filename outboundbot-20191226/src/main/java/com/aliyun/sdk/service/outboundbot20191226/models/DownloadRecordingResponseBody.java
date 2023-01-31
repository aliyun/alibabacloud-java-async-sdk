// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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

    @NameInMap("DownloadParams")
    private DownloadParams downloadParams;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DownloadRecordingResponseBody(Builder builder) {
        this.code = builder.code;
        this.downloadParams = builder.downloadParams;
        this.httpStatusCode = builder.httpStatusCode;
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
     * @return downloadParams
     */
    public DownloadParams getDownloadParams() {
        return this.downloadParams;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private DownloadParams downloadParams; 
        private Integer httpStatusCode; 
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
         * DownloadParams.
         */
        public Builder downloadParams(DownloadParams downloadParams) {
            this.downloadParams = downloadParams;
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

    public static class DownloadParams extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("SignatureUrl")
        private String signatureUrl;

        @NameInMap("VoiceSliceRecordingListJson")
        private String voiceSliceRecordingListJson;

        private DownloadParams(Builder builder) {
            this.fileName = builder.fileName;
            this.signatureUrl = builder.signatureUrl;
            this.voiceSliceRecordingListJson = builder.voiceSliceRecordingListJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadParams create() {
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

        /**
         * @return voiceSliceRecordingListJson
         */
        public String getVoiceSliceRecordingListJson() {
            return this.voiceSliceRecordingListJson;
        }

        public static final class Builder {
            private String fileName; 
            private String signatureUrl; 
            private String voiceSliceRecordingListJson; 

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

            /**
             * VoiceSliceRecordingListJson.
             */
            public Builder voiceSliceRecordingListJson(String voiceSliceRecordingListJson) {
                this.voiceSliceRecordingListJson = voiceSliceRecordingListJson;
                return this;
            }

            public DownloadParams build() {
                return new DownloadParams(this);
            } 

        } 

    }
}
