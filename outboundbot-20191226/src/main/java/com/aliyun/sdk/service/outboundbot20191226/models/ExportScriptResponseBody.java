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
 * {@link ExportScriptResponseBody} extends {@link TeaModel}
 *
 * <p>ExportScriptResponseBody</p>
 */
public class ExportScriptResponseBody extends TeaModel {
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

    private ExportScriptResponseBody(Builder builder) {
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

    public static ExportScriptResponseBody create() {
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

        private Builder(ExportScriptResponseBody model) {
            this.code = model.code;
            this.downloadParams = model.downloadParams;
            this.httpStatusCode = model.httpStatusCode;
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

        public ExportScriptResponseBody build() {
            return new ExportScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportScriptResponseBody} extends {@link TeaModel}
     *
     * <p>ExportScriptResponseBody</p>
     */
    public static class DownloadParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SignatureUrl")
        private String signatureUrl;

        private DownloadParams(Builder builder) {
            this.signatureUrl = builder.signatureUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownloadParams create() {
            return builder().build();
        }

        /**
         * @return signatureUrl
         */
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

        public static final class Builder {
            private String signatureUrl; 

            private Builder() {
            } 

            private Builder(DownloadParams model) {
                this.signatureUrl = model.signatureUrl;
            } 

            /**
             * SignatureUrl.
             */
            public Builder signatureUrl(String signatureUrl) {
                this.signatureUrl = signatureUrl;
                return this;
            }

            public DownloadParams build() {
                return new DownloadParams(this);
            } 

        } 

    }
}
