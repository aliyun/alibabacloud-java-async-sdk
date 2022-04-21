// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>RunFunctionResponseBody</p>
 */
public class RunFunctionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("RuntimeMeta")
    private RuntimeMeta runtimeMeta;

    private RunFunctionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.runtimeMeta = builder.runtimeMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunFunctionResponseBody create() {
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
    public String getResult() {
        return this.result;
    }

    /**
     * @return runtimeMeta
     */
    public RuntimeMeta getRuntimeMeta() {
        return this.runtimeMeta;
    }

    public static final class Builder {
        private String requestId; 
        private String result; 
        private RuntimeMeta runtimeMeta; 

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
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * RuntimeMeta.
         */
        public Builder runtimeMeta(RuntimeMeta runtimeMeta) {
            this.runtimeMeta = runtimeMeta;
            return this;
        }

        public RunFunctionResponseBody build() {
            return new RunFunctionResponseBody(this);
        } 

    } 

    public static class RuntimeMeta extends TeaModel {
        @NameInMap("BillingDuration")
        private Integer billingDuration;

        @NameInMap("InvocationDuration")
        private Integer invocationDuration;

        @NameInMap("MaxMemoryUsage")
        private Integer maxMemoryUsage;

        @NameInMap("RequestId")
        private String requestId;

        private RuntimeMeta(Builder builder) {
            this.billingDuration = builder.billingDuration;
            this.invocationDuration = builder.invocationDuration;
            this.maxMemoryUsage = builder.maxMemoryUsage;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeMeta create() {
            return builder().build();
        }

        /**
         * @return billingDuration
         */
        public Integer getBillingDuration() {
            return this.billingDuration;
        }

        /**
         * @return invocationDuration
         */
        public Integer getInvocationDuration() {
            return this.invocationDuration;
        }

        /**
         * @return maxMemoryUsage
         */
        public Integer getMaxMemoryUsage() {
            return this.maxMemoryUsage;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private Integer billingDuration; 
            private Integer invocationDuration; 
            private Integer maxMemoryUsage; 
            private String requestId; 

            /**
             * BillingDuration.
             */
            public Builder billingDuration(Integer billingDuration) {
                this.billingDuration = billingDuration;
                return this;
            }

            /**
             * InvocationDuration.
             */
            public Builder invocationDuration(Integer invocationDuration) {
                this.invocationDuration = invocationDuration;
                return this;
            }

            /**
             * MaxMemoryUsage.
             */
            public Builder maxMemoryUsage(Integer maxMemoryUsage) {
                this.maxMemoryUsage = maxMemoryUsage;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public RuntimeMeta build() {
                return new RuntimeMeta(this);
            } 

        } 

    }
}
