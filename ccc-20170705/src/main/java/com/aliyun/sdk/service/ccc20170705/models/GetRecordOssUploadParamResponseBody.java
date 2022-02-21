// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecordOssUploadParamResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecordOssUploadParamResponseBody</p>
 */
public class GetRecordOssUploadParamResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Dir")
    private String dir;

    @NameInMap("Expires")
    private String expires;

    @NameInMap("Host")
    private String host;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("OssAccessKeyId")
    private String ossAccessKeyId;

    @NameInMap("OssFileName")
    private String ossFileName;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Signature")
    private String signature;

    @NameInMap("Success")
    private Boolean success;

    private GetRecordOssUploadParamResponseBody(Builder builder) {
        this.code = builder.code;
        this.dir = builder.dir;
        this.expires = builder.expires;
        this.host = builder.host;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.ossAccessKeyId = builder.ossAccessKeyId;
        this.ossFileName = builder.ossFileName;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecordOssUploadParamResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dir
     */
    public String getDir() {
        return this.dir;
    }

    /**
     * @return expires
     */
    public String getExpires() {
        return this.expires;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
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
     * @return ossAccessKeyId
     */
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    /**
     * @return ossFileName
     */
    public String getOssFileName() {
        return this.ossFileName;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String dir; 
        private String expires; 
        private String host; 
        private Integer httpStatusCode; 
        private String message; 
        private String ossAccessKeyId; 
        private String ossFileName; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Dir.
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * Expires.
         */
        public Builder expires(String expires) {
            this.expires = expires;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
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
         * OssAccessKeyId.
         */
        public Builder ossAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }

        /**
         * OssFileName.
         */
        public Builder ossFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
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
         * Signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRecordOssUploadParamResponseBody build() {
            return new GetRecordOssUploadParamResponseBody(this);
        } 

    } 

}
