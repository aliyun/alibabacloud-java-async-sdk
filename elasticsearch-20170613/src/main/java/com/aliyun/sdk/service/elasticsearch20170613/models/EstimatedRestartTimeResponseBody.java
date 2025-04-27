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
 * {@link EstimatedRestartTimeResponseBody} extends {@link TeaModel}
 *
 * <p>EstimatedRestartTimeResponseBody</p>
 */
public class EstimatedRestartTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private EstimatedRestartTimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstimatedRestartTimeResponseBody create() {
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

        private Builder(EstimatedRestartTimeResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public EstimatedRestartTimeResponseBody build() {
            return new EstimatedRestartTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EstimatedRestartTimeResponseBody} extends {@link TeaModel}
     *
     * <p>EstimatedRestartTimeResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("value")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>second</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The estimated restart time.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
