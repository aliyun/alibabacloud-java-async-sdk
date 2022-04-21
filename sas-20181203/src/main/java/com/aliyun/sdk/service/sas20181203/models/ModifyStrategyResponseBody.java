// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyStrategyResponseBody</p>
 */
public class ModifyStrategyResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
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
        @NameInMap("StrategyId")
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
             * StrategyId.
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
