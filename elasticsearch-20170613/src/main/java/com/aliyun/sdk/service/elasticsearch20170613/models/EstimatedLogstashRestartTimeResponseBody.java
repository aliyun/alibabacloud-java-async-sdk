// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EstimatedLogstashRestartTimeResponseBody} extends {@link TeaModel}
 *
 * <p>EstimatedLogstashRestartTimeResponseBody</p>
 */
public class EstimatedLogstashRestartTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private EstimatedLogstashRestartTimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstimatedLogstashRestartTimeResponseBody create() {
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

        public EstimatedLogstashRestartTimeResponseBody build() {
            return new EstimatedLogstashRestartTimeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("unit")
        private String unit;

        @NameInMap("value")
        private Long value;

        private Result(Builder builder) {
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String unit; 
            private Long value; 

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
