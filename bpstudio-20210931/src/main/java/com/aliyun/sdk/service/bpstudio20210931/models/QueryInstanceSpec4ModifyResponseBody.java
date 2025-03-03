// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link QueryInstanceSpec4ModifyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInstanceSpec4ModifyResponseBody</p>
 */
public class QueryInstanceSpec4ModifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryInstanceSpec4ModifyResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceSpec4ModifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryInstanceSpec4ModifyResponseBody build() {
            return new QueryInstanceSpec4ModifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInstanceSpec4ModifyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInstanceSpec4ModifyResponseBody</p>
     */
    public static class OptionalValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Double max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Double min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Double step;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OptionalValues(Builder builder) {
            this.label = builder.label;
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalValues create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return max
         */
        public Double getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Double getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Double getStep() {
            return this.step;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private Double max; 
            private Double min; 
            private Double step; 
            private String value; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Max.
             */
            public Builder max(Double max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Double min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Double step) {
                this.step = step;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OptionalValues build() {
                return new OptionalValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInstanceSpec4ModifyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInstanceSpec4ModifyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OptionalValues")
        private java.util.List<OptionalValues> optionalValues;

        private Data(Builder builder) {
            this.optionalValues = builder.optionalValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return optionalValues
         */
        public java.util.List<OptionalValues> getOptionalValues() {
            return this.optionalValues;
        }

        public static final class Builder {
            private java.util.List<OptionalValues> optionalValues; 

            /**
             * OptionalValues.
             */
            public Builder optionalValues(java.util.List<OptionalValues> optionalValues) {
                this.optionalValues = optionalValues;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
