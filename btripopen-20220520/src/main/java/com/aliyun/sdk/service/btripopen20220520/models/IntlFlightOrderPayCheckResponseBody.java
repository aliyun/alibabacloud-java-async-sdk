// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightOrderPayCheckResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightOrderPayCheckResponseBody</p>
 */
public class IntlFlightOrderPayCheckResponseBody extends TeaModel {
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

    private IntlFlightOrderPayCheckResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightOrderPayCheckResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

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

        public IntlFlightOrderPayCheckResponseBody build() {
            return new IntlFlightOrderPayCheckResponseBody(this);
        } 

    } 

}
