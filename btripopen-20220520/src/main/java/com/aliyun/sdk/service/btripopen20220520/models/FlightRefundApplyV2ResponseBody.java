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
 * {@link FlightRefundApplyV2ResponseBody} extends {@link TeaModel}
 *
 * <p>FlightRefundApplyV2ResponseBody</p>
 */
public class FlightRefundApplyV2ResponseBody extends TeaModel {
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

    private FlightRefundApplyV2ResponseBody(Builder builder) {
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

    public static FlightRefundApplyV2ResponseBody create() {
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightRefundApplyV2ResponseBody build() {
            return new FlightRefundApplyV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightRefundApplyV2ResponseBody} extends {@link TeaModel}
     *
     * <p>FlightRefundApplyV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("out_order_id")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("out_sub_order_id")
        private String outSubOrderId;

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private String subOrderId;

        private Module(Builder builder) {
            this.orderId = builder.orderId;
            this.outOrderId = builder.outOrderId;
            this.outSubOrderId = builder.outSubOrderId;
            this.subOrderId = builder.subOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return outSubOrderId
         */
        public String getOutSubOrderId() {
            return this.outSubOrderId;
        }

        /**
         * @return subOrderId
         */
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public static final class Builder {
            private String orderId; 
            private String outOrderId; 
            private String outSubOrderId; 
            private String subOrderId; 

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * out_order_id.
             */
            public Builder outOrderId(String outOrderId) {
                this.outOrderId = outOrderId;
                return this;
            }

            /**
             * out_sub_order_id.
             */
            public Builder outSubOrderId(String outSubOrderId) {
                this.outSubOrderId = outSubOrderId;
                return this;
            }

            /**
             * sub_order_id.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
