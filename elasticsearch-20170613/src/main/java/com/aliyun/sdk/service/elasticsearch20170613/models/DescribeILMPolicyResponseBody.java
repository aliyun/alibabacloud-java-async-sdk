// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeILMPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeILMPolicyResponseBody</p>
 */
public class DescribeILMPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeILMPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeILMPolicyResponseBody create() {
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

        public DescribeILMPolicyResponseBody build() {
            return new DescribeILMPolicyResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("phases")
        private java.util.Map < String, ? > phases;

        private Result(Builder builder) {
            this.name = builder.name;
            this.phases = builder.phases;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phases
         */
        public java.util.Map < String, ? > getPhases() {
            return this.phases;
        }

        public static final class Builder {
            private String name; 
            private java.util.Map < String, ? > phases; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * phases.
             */
            public Builder phases(java.util.Map < String, ? > phases) {
                this.phases = phases;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
