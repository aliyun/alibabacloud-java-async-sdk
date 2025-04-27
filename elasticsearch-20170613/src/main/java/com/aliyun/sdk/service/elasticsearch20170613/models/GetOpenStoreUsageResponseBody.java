// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOpenStoreUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpenStoreUsageResponseBody</p>
 */
public class GetOpenStoreUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetOpenStoreUsageResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E1DE2491-804F-4C86-BAB4-548DD70B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The current request result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetOpenStoreUsageResponseBody build() {
            return new GetOpenStoreUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOpenStoreUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpenStoreUsageResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentUsage")
        private Long currentUsage;

        @com.aliyun.core.annotation.NameInMap("lastDayUsage")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.currentUsage = model.currentUsage;
                this.lastDayUsage = model.lastDayUsage;
            } 

            /**
             * <p>The current OpenStore storage capacity (estimated value based on actual indexes). Unit: Byte.</p>
             * 
             * <strong>example:</strong>
             * <p>204800</p>
             */
            public Builder currentUsage(Long currentUsage) {
                this.currentUsage = currentUsage;
                return this;
            }

            /**
             * <p>The storage capacity of OpenStore yesterday. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>184320</p>
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
