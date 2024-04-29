// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyStrategyResponseBody</p>
 */
public class ModifyStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ModifyStrategyResponseBody(Builder builder) {
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer httpStatusCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result returned.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifyStrategyResponseBody build() {
            return new ModifyStrategyResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Integer strategyId;

        private Result(Builder builder) {
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return strategyId
         */
        public Integer getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private Integer strategyId; 

            /**
             * The ID of the baseline check policy.
             */
            public Builder strategyId(Integer strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
