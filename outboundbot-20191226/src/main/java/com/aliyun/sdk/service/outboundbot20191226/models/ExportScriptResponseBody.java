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
         * <p>The status code of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The signed URL that you can use to download the script. This parameter is returned only for legacy canvases.</p>
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
         * <p>The message returned for the request.</p>
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
             * <p>The download URL. This parameter is returned only for legacy canvases.</p>
             * <blockquote>
             * <p><strong>For modern canvases</strong>: After the scenario is exported, call the <strong>ListDownloadTasks</strong> operation to obtain the \<code>TaskId\\</code> (for example, \<code>5d352db754fe430xxxxxxx\\</code>) and \<code>FileId\\</code> (for example, \<code>5d000f3f6eae4228b2731427xxxxxx\\</code>). Then, call the <strong>CreateDownloadUrl</strong> operation to obtain the download URL.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&OSSAccessKeyId=LTAI****cqw&Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D">http://tiangong-staging.oss-cn-shanghai.aliyuncs.com/record/281eb174-3865-41c1-9274-7b6813edadab.wav?Expires=1578624046&amp;OSSAccessKeyId=LTAI****cqw&amp;Signature=dL2dxWS6VcdZrvG9xOMOBMSP3Fg%3D</a></p>
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
