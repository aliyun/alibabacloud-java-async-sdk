// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DownloadRecordingResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadRecordingResponseBody</p>
 */
public class DownloadRecordingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DownloadParams")
    private DownloadParams downloadParams;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DownloadRecordingResponseBody model) {
            this.code = model.code;
            this.downloadParams = model.downloadParams;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The download URL.</p>
         */
        public Builder downloadParams(DownloadParams downloadParams) {
            this.downloadParams = downloadParams;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
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

        public DownloadRecordingResponseBody build() {
            return new DownloadRecordingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DownloadRecordingResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadRecordingResponseBody</p>
     */
    public static class DownloadParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EarlyMediaSignatureUrl")
        private String earlyMediaSignatureUrl;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("SignatureUrl")
        private String signatureUrl;

        @com.aliyun.core.annotation.NameInMap("VoiceSliceRecordingListJson")
        private String voiceSliceRecordingListJson;

        private DownloadParams(Builder builder) {
            this.earlyMediaSignatureUrl = builder.earlyMediaSignatureUrl;
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
         * @return earlyMediaSignatureUrl
         */
        public String getEarlyMediaSignatureUrl() {
            return this.earlyMediaSignatureUrl;
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
            private String earlyMediaSignatureUrl; 
            private String fileName; 
            private String signatureUrl; 
            private String voiceSliceRecordingListJson; 

            private Builder() {
            } 

            private Builder(DownloadParams model) {
                this.earlyMediaSignatureUrl = model.earlyMediaSignatureUrl;
                this.fileName = model.fileName;
                this.signatureUrl = model.signatureUrl;
                this.voiceSliceRecordingListJson = model.voiceSliceRecordingListJson;
            } 

            /**
             * <p>The signed download URL for the early media recording file.</p>
             */
            public Builder earlyMediaSignatureUrl(String earlyMediaSignatureUrl) {
                this.earlyMediaSignatureUrl = earlyMediaSignatureUrl;
                return this;
            }

            /**
             * <p>The name of the recording file, which is typically a UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>281eb174-3865-41c1-9274-7b6813edadab.wav</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The URL used to download the recording file over HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&OSSAccessKeyId=LTAI****cqw&Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D">http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&amp;OSSAccessKeyId=LTAI****cqw&amp;Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D</a></p>
             */
            public Builder signatureUrl(String signatureUrl) {
                this.signatureUrl = signatureUrl;
                return this;
            }

            /**
             * <p>The list of segmented recordings, including the file names and file URLs.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;fileName&quot;:&quot;10a17c447415424c99491884abe27d8a-1.wav&quot;,&quot;filePath&quot;:&quot;<a href="https://ssml-test.oss-cn-shanghai.aliyuncs.com/7253/voiceSlice/10a17c447415424c99491884abe27d8a/10a17c447415424c99491884abe27d8a-1.wav?Expires=1686645470&OSSAccessKeyId=LTA*********kr8M9&Signature=V23OhiV5yIOoouriu6SiWkO9h8E%3D%22%7D%5D">https://ssml-test.oss-cn-shanghai.aliyuncs.com/7253/voiceSlice/10a17c447415424c99491884abe27d8a/10a17c447415424c99491884abe27d8a-1.wav?Expires=1686645470&amp;OSSAccessKeyId=LTA*********kr8M9&amp;Signature=V23OhiV5yIOoouriu6SiWkO9h8E%3D&quot;}]</a></p>
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
