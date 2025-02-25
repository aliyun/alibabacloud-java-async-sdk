// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCollectorResponseBody</p>
 */
public class CreateCollectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CreateCollectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCollectorResponseBody create() {
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

        public CreateCollectorResponseBody build() {
            return new CreateCollectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCollectorResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCollectorResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resId")
        private String resId;

        private Result(Builder builder) {
            this.resId = builder.resId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return resId
         */
        public String getResId() {
            return this.resId;
        }

        public static final class Builder {
            private String resId; 

            /**
             * resId.
             */
            public Builder resId(String resId) {
                this.resId = resId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
