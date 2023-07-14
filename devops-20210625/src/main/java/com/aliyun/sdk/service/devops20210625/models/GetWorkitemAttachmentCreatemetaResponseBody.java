// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemAttachmentCreatemetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkitemAttachmentCreatemetaResponseBody</p>
 */
public class GetWorkitemAttachmentCreatemetaResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private String success;

    @NameInMap("uploadInfo")
    private UploadInfo uploadInfo;

    private GetWorkitemAttachmentCreatemetaResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.uploadInfo = builder.uploadInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemAttachmentCreatemetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return uploadInfo
     */
    public UploadInfo getUploadInfo() {
        return this.uploadInfo;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private String success; 
        private UploadInfo uploadInfo; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * uploadInfo.
         */
        public Builder uploadInfo(UploadInfo uploadInfo) {
            this.uploadInfo = uploadInfo;
            return this;
        }

        public GetWorkitemAttachmentCreatemetaResponseBody build() {
            return new GetWorkitemAttachmentCreatemetaResponseBody(this);
        } 

    } 

    public static class UploadInfo extends TeaModel {
        @NameInMap("accessid")
        private String accessid;

        @NameInMap("dir")
        private String dir;

        @NameInMap("host")
        private String host;

        @NameInMap("policy")
        private String policy;

        @NameInMap("signature")
        private String signature;

        private UploadInfo(Builder builder) {
            this.accessid = builder.accessid;
            this.dir = builder.dir;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadInfo create() {
            return builder().build();
        }

        /**
         * @return accessid
         */
        public String getAccessid() {
            return this.accessid;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
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
            private String accessid; 
            private String dir; 
            private String host; 
            private String policy; 
            private String signature; 

            /**
             * accessid.
             */
            public Builder accessid(String accessid) {
                this.accessid = accessid;
                return this;
            }

            /**
             * dir.
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public UploadInfo build() {
                return new UploadInfo(this);
            } 

        } 

    }
}
