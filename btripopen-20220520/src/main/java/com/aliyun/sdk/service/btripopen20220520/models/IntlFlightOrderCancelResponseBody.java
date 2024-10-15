// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IntlFlightOrderCancelResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightOrderCancelResponseBody</p>
 */
public class IntlFlightOrderCancelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result_code")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("result_msg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("trace_id")
    private String traceId;

    private IntlFlightOrderCancelResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightOrderCancelResponseBody create() {
        return builder().build();
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
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
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
        private Module module; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result_code.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * result_msg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
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
         * trace_id.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IntlFlightOrderCancelResponseBody build() {
            return new IntlFlightOrderCancelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightOrderCancelResponseBody} extends {@link TeaModel}
     *
     * <p>IntlFlightOrderCancelResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_time")
        private String cancelTime;

        private Module(Builder builder) {
            this.cancelTime = builder.cancelTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return cancelTime
         */
        public String getCancelTime() {
            return this.cancelTime;
        }

        public static final class Builder {
            private String cancelTime; 

            /**
             * cancel_time.
             */
            public Builder cancelTime(String cancelTime) {
                this.cancelTime = cancelTime;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
