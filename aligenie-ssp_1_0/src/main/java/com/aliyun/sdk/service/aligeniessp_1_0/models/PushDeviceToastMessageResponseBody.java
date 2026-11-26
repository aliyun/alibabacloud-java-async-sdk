// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link PushDeviceToastMessageResponseBody} extends {@link TeaModel}
 *
 * <p>PushDeviceToastMessageResponseBody</p>
 */
public class PushDeviceToastMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private PushDeviceToastMessageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDeviceToastMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(PushDeviceToastMessageResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public PushDeviceToastMessageResponseBody build() {
            return new PushDeviceToastMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PushDeviceToastMessageResponseBody} extends {@link TeaModel}
     *
     * <p>PushDeviceToastMessageResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accepted")
        private Boolean accepted;

        @com.aliyun.core.annotation.NameInMap("FailCode")
        private String failCode;

        private Result(Builder builder) {
            this.accepted = builder.accepted;
            this.failCode = builder.failCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accepted
         */
        public Boolean getAccepted() {
            return this.accepted;
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        public static final class Builder {
            private Boolean accepted; 
            private String failCode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.accepted = model.accepted;
                this.failCode = model.failCode;
            } 

            /**
             * Accepted.
             */
            public Builder accepted(Boolean accepted) {
                this.accepted = accepted;
                return this;
            }

            /**
             * FailCode.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
