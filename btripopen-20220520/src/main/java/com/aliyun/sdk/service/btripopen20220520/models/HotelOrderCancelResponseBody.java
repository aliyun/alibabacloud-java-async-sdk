// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderCancelResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderCancelResponseBody</p>
 */
public class HotelOrderCancelResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private HotelOrderCancelResponseBody(Builder builder) {
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

    public static HotelOrderCancelResponseBody create() {
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
         * module。
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

        public HotelOrderCancelResponseBody build() {
            return new HotelOrderCancelResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("cancel_success")
        private Boolean cancelSuccess;

        @NameInMap("code")
        private String code;

        @NameInMap("desc")
        private String desc;

        @NameInMap("forfeit_fee")
        private Long forfeitFee;

        private Module(Builder builder) {
            this.cancelSuccess = builder.cancelSuccess;
            this.code = builder.code;
            this.desc = builder.desc;
            this.forfeitFee = builder.forfeitFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return cancelSuccess
         */
        public Boolean getCancelSuccess() {
            return this.cancelSuccess;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return forfeitFee
         */
        public Long getForfeitFee() {
            return this.forfeitFee;
        }

        public static final class Builder {
            private Boolean cancelSuccess; 
            private String code; 
            private String desc; 
            private Long forfeitFee; 

            /**
             * cancel_success.
             */
            public Builder cancelSuccess(Boolean cancelSuccess) {
                this.cancelSuccess = cancelSuccess;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * forfeit_fee.
             */
            public Builder forfeitFee(Long forfeitFee) {
                this.forfeitFee = forfeitFee;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
