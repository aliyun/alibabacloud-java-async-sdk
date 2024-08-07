// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexOnlineStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexOnlineStrategyResponseBody</p>
 */
public class GetIndexOnlineStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetIndexOnlineStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexOnlineStrategyResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetIndexOnlineStrategyResponseBody build() {
            return new GetIndexOnlineStrategyResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changeRate")
        private Integer changeRate;

        private Result(Builder builder) {
            this.changeRate = builder.changeRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return changeRate
         */
        public Integer getChangeRate() {
            return this.changeRate;
        }

        public static final class Builder {
            private Integer changeRate; 

            /**
             * The index change rate.
             */
            public Builder changeRate(Integer changeRate) {
                this.changeRate = changeRate;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
