// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MTRSOCRServiceResponseBody} extends {@link TeaModel}
 *
 * <p>MTRSOCRServiceResponseBody</p>
 */
public class MTRSOCRServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private MTRSOCRServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MTRSOCRServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String msg; 
        private String requestId; 
        private String result; 
        private Boolean status; 
        private String traceId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public MTRSOCRServiceResponseBody build() {
            return new MTRSOCRServiceResponseBody(this);
        } 

    } 

}
