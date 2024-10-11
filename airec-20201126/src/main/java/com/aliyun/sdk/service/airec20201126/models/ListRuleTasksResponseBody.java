// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRuleTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleTasksResponseBody</p>
 */
public class ListRuleTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListRuleTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuleTasksResponseBody create() {
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
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * <p>Queries the status of a rule-specific task.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error message.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListRuleTasksResponseBody build() {
            return new ListRuleTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRuleTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListRuleTasksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishRate")
        private Integer finishRate;

        @com.aliyun.core.annotation.NameInMap("finishTime")
        private Integer finishTime;

        private Result(Builder builder) {
            this.finishRate = builder.finishRate;
            this.finishTime = builder.finishTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return finishRate
         */
        public Integer getFinishRate() {
            return this.finishRate;
        }

        /**
         * @return finishTime
         */
        public Integer getFinishTime() {
            return this.finishTime;
        }

        public static final class Builder {
            private Integer finishRate; 
            private Integer finishTime; 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder finishRate(Integer finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1588240081</p>
             */
            public Builder finishTime(Integer finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
