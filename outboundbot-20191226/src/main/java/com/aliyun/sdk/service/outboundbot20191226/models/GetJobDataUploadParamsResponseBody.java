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
 * {@link GetJobDataUploadParamsResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobDataUploadParamsResponseBody</p>
 */
public class GetJobDataUploadParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UploadParams")
    private UploadParams uploadParams;

    private GetJobDataUploadParamsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.uploadParams = builder.uploadParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobDataUploadParamsResponseBody create() {
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

    /**
     * @return uploadParams
     */
    public UploadParams getUploadParams() {
        return this.uploadParams;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private UploadParams uploadParams; 

        private Builder() {
        } 

        private Builder(GetJobDataUploadParamsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.uploadParams = model.uploadParams;
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

        /**
         * UploadParams.
         */
        public Builder uploadParams(UploadParams uploadParams) {
            this.uploadParams = uploadParams;
            return this;
        }

        public GetJobDataUploadParamsResponseBody build() {
            return new GetJobDataUploadParamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobDataUploadParamsResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDataUploadParamsResponseBody</p>
     */
    public static class UploadParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private Integer expire;

        @com.aliyun.core.annotation.NameInMap("Folder")
        private String folder;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private UploadParams(Builder builder) {
            this.accessId = builder.accessId;
            this.expire = builder.expire;
            this.folder = builder.folder;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadParams create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return expire
         */
        public Integer getExpire() {
            return this.expire;
        }

        /**
         * @return folder
         */
        public String getFolder() {
            return this.folder;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private Integer expire; 
            private String folder; 
            private String host; 
            private String policy; 
            private String signature; 

            private Builder() {
            } 

            private Builder(UploadParams model) {
                this.accessId = model.accessId;
                this.expire = model.expire;
                this.folder = model.folder;
                this.host = model.host;
                this.policy = model.policy;
                this.signature = model.signature;
            } 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * Expire.
             */
            public Builder expire(Integer expire) {
                this.expire = expire;
                return this;
            }

            /**
             * Folder.
             */
            public Builder folder(String folder) {
                this.folder = folder;
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
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public UploadParams build() {
                return new UploadParams(this);
            } 

        } 

    }
}
