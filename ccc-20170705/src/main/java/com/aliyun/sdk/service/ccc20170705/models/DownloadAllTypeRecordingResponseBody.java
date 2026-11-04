// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link DownloadAllTypeRecordingResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadAllTypeRecordingResponseBody</p>
 */
public class DownloadAllTypeRecordingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MediaDownloadParamList")
    private MediaDownloadParamList mediaDownloadParamList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DownloadAllTypeRecordingResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.mediaDownloadParamList = builder.mediaDownloadParamList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadAllTypeRecordingResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return mediaDownloadParamList
     */
    public MediaDownloadParamList getMediaDownloadParamList() {
        return this.mediaDownloadParamList;
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
        private MediaDownloadParamList mediaDownloadParamList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DownloadAllTypeRecordingResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.mediaDownloadParamList = model.mediaDownloadParamList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * MediaDownloadParamList.
         */
        public Builder mediaDownloadParamList(MediaDownloadParamList mediaDownloadParamList) {
            this.mediaDownloadParamList = mediaDownloadParamList;
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

        public DownloadAllTypeRecordingResponseBody build() {
            return new DownloadAllTypeRecordingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DownloadAllTypeRecordingResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadAllTypeRecordingResponseBody</p>
     */
    public static class MediaDownloadParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("SignatureUrl")
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

            private Builder() {
            } 

            private Builder(MediaDownloadParam model) {
                this.fileName = model.fileName;
                this.signatureUrl = model.signatureUrl;
            } 

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
    /**
     * 
     * {@link DownloadAllTypeRecordingResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadAllTypeRecordingResponseBody</p>
     */
    public static class MediaDownloadParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaDownloadParam")
        private java.util.List<MediaDownloadParam> mediaDownloadParam;

        private MediaDownloadParamList(Builder builder) {
            this.mediaDownloadParam = builder.mediaDownloadParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaDownloadParamList create() {
            return builder().build();
        }

        /**
         * @return mediaDownloadParam
         */
        public java.util.List<MediaDownloadParam> getMediaDownloadParam() {
            return this.mediaDownloadParam;
        }

        public static final class Builder {
            private java.util.List<MediaDownloadParam> mediaDownloadParam; 

            private Builder() {
            } 

            private Builder(MediaDownloadParamList model) {
                this.mediaDownloadParam = model.mediaDownloadParam;
            } 

            /**
             * MediaDownloadParam.
             */
            public Builder mediaDownloadParam(java.util.List<MediaDownloadParam> mediaDownloadParam) {
                this.mediaDownloadParam = mediaDownloadParam;
                return this;
            }

            public MediaDownloadParamList build() {
                return new MediaDownloadParamList(this);
            } 

        } 

    }
}
