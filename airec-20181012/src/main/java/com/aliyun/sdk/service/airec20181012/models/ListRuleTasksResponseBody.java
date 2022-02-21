// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRuleTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListRuleTasksResponseBody</p>
 */
public class ListRuleTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListRuleTasksResponseBody(Builder builder) {
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

        public ListRuleTasksResponseBody build() {
            return new ListRuleTasksResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("FinishRate")
        private Integer finishRate;

        @NameInMap("FinishTime")
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
             * FinishRate.
             */
            public Builder finishRate(Integer finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * FinishTime.
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
