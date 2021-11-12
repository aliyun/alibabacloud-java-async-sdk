// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    @NameInMap("TotalCount")
    private Integer totalCount;


    private ModifyStrategyResponseBody(Builder builder) {
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer httpStatusCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * <p>HttpStatusCode.</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Success.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
             * <p>StrategyId.</p>
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
