// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumDeletableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEthereumDeletableResponseBody</p>
 */
public class DescribeEthereumDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeEthereumDeletableResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumDeletableResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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

        public DescribeEthereumDeletableResponseBody build() {
            return new DescribeEthereumDeletableResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Deletable")
        private Boolean deletable;

        @NameInMap("EthereumId")
        private String ethereumId;

        private Result(Builder builder) {
            this.deletable = builder.deletable;
            this.ethereumId = builder.ethereumId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        /**
         * @return ethereumId
         */
        public String getEthereumId() {
            return this.ethereumId;
        }

        public static final class Builder {
            private Boolean deletable; 
            private String ethereumId; 

            /**
             * Deletable.
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
                return this;
            }

            /**
             * EthereumId.
             */
            public Builder ethereumId(String ethereumId) {
                this.ethereumId = ethereumId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
