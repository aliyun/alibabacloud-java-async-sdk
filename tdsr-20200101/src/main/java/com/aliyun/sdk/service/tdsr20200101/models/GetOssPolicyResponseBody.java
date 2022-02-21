// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssPolicyResponseBody</p>
 */
public class GetOssPolicyResponseBody extends TeaModel {
    @NameInMap("AccessId")
    private String accessId;

    @NameInMap("Callback")
    private String callback;

    @NameInMap("Code")
    private Long code;

    @NameInMap("Dir")
    private String dir;

    @NameInMap("Expire")
    private String expire;

    @NameInMap("Host")
    private String host;

    @NameInMap("Message")
    private String message;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Signature")
    private String signature;

    @NameInMap("Success")
    private Boolean success;

    private GetOssPolicyResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.callback = builder.callback;
        this.code = builder.code;
        this.dir = builder.dir;
        this.expire = builder.expire;
        this.host = builder.host;
        this.message = builder.message;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return dir
     */
    public String getDir() {
        return this.dir;
    }

    /**
     * @return expire
     */
    public String getExpire() {
        return this.expire;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String accessId; 
        private String callback; 
        private Long code; 
        private String dir; 
        private String expire; 
        private String host; 
        private String message; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private Boolean success; 

        /**
         * accessId
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * 上传回调
         */
        public Builder callback(String callback) {
            this.callback = callback;
            return this;
        }

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 授权路径
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * 授权失效时间(s)
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * 上传地址
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 授权
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 签名
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOssPolicyResponseBody build() {
            return new GetOssPolicyResponseBody(this);
        } 

    } 

}
