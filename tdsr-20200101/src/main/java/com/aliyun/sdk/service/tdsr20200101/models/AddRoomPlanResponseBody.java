// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRoomPlanResponseBody} extends {@link TeaModel}
 *
 * <p>AddRoomPlanResponseBody</p>
 */
public class AddRoomPlanResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private AddRoomPlanResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRoomPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 文件上传凭据
         */
        public Builder data(Data data) {
            this.data = data;
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
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddRoomPlanResponseBody build() {
            return new AddRoomPlanResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Callback")
        private String callback;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("Host")
        private String host;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
        private String signature;

        private Data(Builder builder) {
            this.accessId = builder.accessId;
            this.callback = builder.callback;
            this.dir = builder.dir;
            this.expire = builder.expire;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
            private String callback; 
            private String dir; 
            private String expire; 
            private String host; 
            private String policy; 
            private String signature; 

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
             * 授权
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * 签名
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
