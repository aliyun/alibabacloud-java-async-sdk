// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeFunctionResponseBody</p>
 */
public class InvokeFunctionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private InvokeFunctionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeFunctionResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Result result; 

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

        public InvokeFunctionResponseBody build() {
            return new InvokeFunctionResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("BackEndRequestId")
        private String backEndRequestId;

        @NameInMap("Output")
        private String output;

        private Result(Builder builder) {
            this.backEndRequestId = builder.backEndRequestId;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return backEndRequestId
         */
        public String getBackEndRequestId() {
            return this.backEndRequestId;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String backEndRequestId; 
            private String output; 

            /**
             * BackEndRequestId.
             */
            public Builder backEndRequestId(String backEndRequestId) {
                this.backEndRequestId = backEndRequestId;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
