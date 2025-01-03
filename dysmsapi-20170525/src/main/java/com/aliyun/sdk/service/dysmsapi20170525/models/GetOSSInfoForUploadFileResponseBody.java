// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link GetOSSInfoForUploadFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetOSSInfoForUploadFileResponseBody</p>
 */
public class GetOSSInfoForUploadFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOSSInfoForUploadFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOSSInfoForUploadFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Request status code.</p>
         * <ul>
         * <li>OK return represents a successful request.</li>
         * <li>For other error codes, please refer to the <a href="https://help.aliyun.com/document_detail/101346.htm">Error Code List</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Return result.</p>
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The ID of this call request, which is a unique identifier generated by Alibaba Cloud for the request, can be used for troubleshooting and issue定位.</p>
         * 
         * <strong>example:</strong>
         * <p>A90E4451-FED7-49D2-87C8-00700EDCFD0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates success. Values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOSSInfoForUploadFileResponseBody build() {
            return new GetOSSInfoForUploadFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOSSInfoForUploadFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetOSSInfoForUploadFileResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("StartPath")
        private String startPath;

        private Model(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.expireTime = builder.expireTime;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
            this.startPath = builder.startPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
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

        /**
         * @return startPath
         */
        public String getStartPath() {
            return this.startPath;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String expireTime; 
            private String host; 
            private String policy; 
            private String signature; 
            private String startPath; 

            /**
             * <p>AccessKey ID used for signing.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAIxetqt1Dg****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>Expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1719297445</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Host address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com">https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Signature policy.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjoiMjAyN<em><strong>Ni0yNVQwNjozNzoyNS45NzBaI</strong>iY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJzdGFydHMtd2l0</em>**sIiRrZXkiLCIiXV19</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>Signature information calculated based on <strong>AccessKey Secret</strong> and <strong>Policy</strong>. When calling the OSS API, OSS verifies this signature information to confirm the legitimacy of the Post request.</p>
             * 
             * <strong>example:</strong>
             * <p>BXnwCWPrhVb*****aoZHZfli5KE=</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>Policy path.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder startPath(String startPath) {
                this.startPath = startPath;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
