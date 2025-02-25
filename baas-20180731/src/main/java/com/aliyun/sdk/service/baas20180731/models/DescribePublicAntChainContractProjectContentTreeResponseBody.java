// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePublicAntChainContractProjectContentTreeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePublicAntChainContractProjectContentTreeResponseBody</p>
 */
public class DescribePublicAntChainContractProjectContentTreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribePublicAntChainContractProjectContentTreeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePublicAntChainContractProjectContentTreeResponseBody create() {
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

        public DescribePublicAntChainContractProjectContentTreeResponseBody build() {
            return new DescribePublicAntChainContractProjectContentTreeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List < java.util.Map<String, ?>> children;

        private Result(Builder builder) {
            this.children = builder.children;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> children; 

            /**
             * Children.
             */
            public Builder children(java.util.List < java.util.Map<String, ?>> children) {
                this.children = children;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
