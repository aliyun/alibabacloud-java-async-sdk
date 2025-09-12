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
 * {@link IntlFlightRefundApplyResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightRefundApplyResponseBody</p>
 */
public class IntlFlightRefundApplyResponseBody extends TeaModel {
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

    private IntlFlightRefundApplyResponseBody(Builder builder) {
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

    public static IntlFlightRefundApplyResponseBody create() {
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

        private Builder(IntlFlightRefundApplyResponseBody model) {
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

        public IntlFlightRefundApplyResponseBody build() {
            return new IntlFlightRefundApplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightRefundApplyResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundApplyResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("out_refund_apply_id")
        private String outRefundApplyId;

        @com.aliyun.core.annotation.NameInMap("refund_apply_id")
        private String refundApplyId;

        private Module(Builder builder) {
            this.outRefundApplyId = builder.outRefundApplyId;
            this.refundApplyId = builder.refundApplyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return outRefundApplyId
         */
        public String getOutRefundApplyId() {
            return this.outRefundApplyId;
        }

        /**
         * @return refundApplyId
         */
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

        public static final class Builder {
            private String outRefundApplyId; 
            private String refundApplyId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.outRefundApplyId = model.outRefundApplyId;
                this.refundApplyId = model.refundApplyId;
            } 

            /**
             * out_refund_apply_id.
             */
            public Builder outRefundApplyId(String outRefundApplyId) {
                this.outRefundApplyId = outRefundApplyId;
                return this;
            }

            /**
             * refund_apply_id.
             */
            public Builder refundApplyId(String refundApplyId) {
                this.refundApplyId = refundApplyId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
