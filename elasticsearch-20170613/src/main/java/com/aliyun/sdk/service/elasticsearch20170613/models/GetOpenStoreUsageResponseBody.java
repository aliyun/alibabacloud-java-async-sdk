// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpenStoreUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpenStoreUsageResponseBody</p>
 */
public class GetOpenStoreUsageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetOpenStoreUsageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenStoreUsageResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The current request result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetOpenStoreUsageResponseBody build() {
            return new GetOpenStoreUsageResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("currentUsage")
        private Long currentUsage;

        @NameInMap("lastDayUsage")
        private Long lastDayUsage;

        private Result(Builder builder) {
            this.currentUsage = builder.currentUsage;
            this.lastDayUsage = builder.lastDayUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return currentUsage
         */
        public Long getCurrentUsage() {
            return this.currentUsage;
        }

        /**
         * @return lastDayUsage
         */
        public Long getLastDayUsage() {
            return this.lastDayUsage;
        }

        public static final class Builder {
            private Long currentUsage; 
            private Long lastDayUsage; 

            /**
             * The current OpenStore storage capacity (estimated value based on actual indexes). Unit: Byte.
             */
            public Builder currentUsage(Long currentUsage) {
                this.currentUsage = currentUsage;
                return this;
            }

            /**
             * The storage capacity of OpenStore yesterday. Unit: bytes.
             */
            public Builder lastDayUsage(Long lastDayUsage) {
                this.lastDayUsage = lastDayUsage;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
