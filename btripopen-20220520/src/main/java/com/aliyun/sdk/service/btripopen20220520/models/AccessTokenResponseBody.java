// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>AccessTokenResponseBody</p>
 */
public class AccessTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private AccessTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
     * @return module
     */
    public Module getModule() {
        return this.module;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
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
         * 成功标识
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public AccessTokenResponseBody build() {
            return new AccessTokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expire")
        private Long expire;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private Data(Builder builder) {
            this.expire = builder.expire;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expire
         */
        public Long getExpire() {
            return this.expire;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private Long expire; 
            private String token; 

            /**
             * expire.
             */
            public Builder expire(Long expire) {
                this.expire = expire;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expire")
        private Long expire;

        @com.aliyun.core.annotation.NameInMap("start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private Module(Builder builder) {
            this.expire = builder.expire;
            this.start = builder.start;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return expire
         */
        public Long getExpire() {
            return this.expire;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private Long expire; 
            private Long start; 
            private String token; 

            /**
             * expire.
             */
            public Builder expire(Long expire) {
                this.expire = expire;
                return this;
            }

            /**
             * start.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
