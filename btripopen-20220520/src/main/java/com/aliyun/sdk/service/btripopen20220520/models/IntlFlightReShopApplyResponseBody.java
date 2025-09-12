// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link IntlFlightReShopApplyResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightReShopApplyResponseBody</p>
 */
public class IntlFlightReShopApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

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

    private IntlFlightReShopApplyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightReShopApplyResponseBody create() {
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
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(IntlFlightReShopApplyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IntlFlightReShopApplyResponseBody build() {
            return new IntlFlightReShopApplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightReShopApplyResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopApplyResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("async_apply_key")
        private String asyncApplyKey;

        @com.aliyun.core.annotation.NameInMap("out_re_shop_apply_id")
        private String outReShopApplyId;

        @com.aliyun.core.annotation.NameInMap("re_shop_apply_id")
        private String reShopApplyId;

        private Module(Builder builder) {
            this.asyncApplyKey = builder.asyncApplyKey;
            this.outReShopApplyId = builder.outReShopApplyId;
            this.reShopApplyId = builder.reShopApplyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return asyncApplyKey
         */
        public String getAsyncApplyKey() {
            return this.asyncApplyKey;
        }

        /**
         * @return outReShopApplyId
         */
        public String getOutReShopApplyId() {
            return this.outReShopApplyId;
        }

        /**
         * @return reShopApplyId
         */
        public String getReShopApplyId() {
            return this.reShopApplyId;
        }

        public static final class Builder {
            private String asyncApplyKey; 
            private String outReShopApplyId; 
            private String reShopApplyId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.asyncApplyKey = model.asyncApplyKey;
                this.outReShopApplyId = model.outReShopApplyId;
                this.reShopApplyId = model.reShopApplyId;
            } 

            /**
             * async_apply_key.
             */
            public Builder asyncApplyKey(String asyncApplyKey) {
                this.asyncApplyKey = asyncApplyKey;
                return this;
            }

            /**
             * out_re_shop_apply_id.
             */
            public Builder outReShopApplyId(String outReShopApplyId) {
                this.outReShopApplyId = outReShopApplyId;
                return this;
            }

            /**
             * re_shop_apply_id.
             */
            public Builder reShopApplyId(String reShopApplyId) {
                this.reShopApplyId = reShopApplyId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
