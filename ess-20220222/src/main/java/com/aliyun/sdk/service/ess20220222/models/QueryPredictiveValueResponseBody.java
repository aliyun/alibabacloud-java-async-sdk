// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link QueryPredictiveValueResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPredictiveValueResponseBody</p>
 */
public class QueryPredictiveValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PredictiveValues")
    private PredictiveValues predictiveValues;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryPredictiveValueResponseBody(Builder builder) {
        this.predictiveValues = builder.predictiveValues;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPredictiveValueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return predictiveValues
     */
    public PredictiveValues getPredictiveValues() {
        return this.predictiveValues;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PredictiveValues predictiveValues; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryPredictiveValueResponseBody model) {
            this.predictiveValues = model.predictiveValues;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of predicted instances in the scaling group.</p>
         */
        public Builder predictiveValues(PredictiveValues predictiveValues) {
            this.predictiveValues = predictiveValues;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FA5F448E-DC84-5EBC-B6D5-F659ADxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPredictiveValueResponseBody build() {
            return new QueryPredictiveValueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPredictiveValueResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPredictiveValueResponseBody</p>
     */
    public static class PredictiveValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private PredictiveValue(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredictiveValue create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String time; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(PredictiveValue model) {
                this.time = model.time;
                this.value = model.value;
            } 

            /**
             * <p>The point in time, in the ISO 8601 standard, in the yyyy-MM-ddTHH:mmZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-17T10:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public PredictiveValue build() {
                return new PredictiveValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPredictiveValueResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPredictiveValueResponseBody</p>
     */
    public static class PredictiveValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PredictiveValue")
        private java.util.List<PredictiveValue> predictiveValue;

        private PredictiveValues(Builder builder) {
            this.predictiveValue = builder.predictiveValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredictiveValues create() {
            return builder().build();
        }

        /**
         * @return predictiveValue
         */
        public java.util.List<PredictiveValue> getPredictiveValue() {
            return this.predictiveValue;
        }

        public static final class Builder {
            private java.util.List<PredictiveValue> predictiveValue; 

            private Builder() {
            } 

            private Builder(PredictiveValues model) {
                this.predictiveValue = model.predictiveValue;
            } 

            /**
             * PredictiveValue.
             */
            public Builder predictiveValue(java.util.List<PredictiveValue> predictiveValue) {
                this.predictiveValue = predictiveValue;
                return this;
            }

            public PredictiveValues build() {
                return new PredictiveValues(this);
            } 

        } 

    }
}
