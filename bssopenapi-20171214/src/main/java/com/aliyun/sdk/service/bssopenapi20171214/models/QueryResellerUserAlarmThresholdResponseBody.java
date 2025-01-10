// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryResellerUserAlarmThresholdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryResellerUserAlarmThresholdResponseBody</p>
 */
public class QueryResellerUserAlarmThresholdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryResellerUserAlarmThresholdResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResellerUserAlarmThresholdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private String code; 
        private Integer count; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public QueryResellerUserAlarmThresholdResponseBody build() {
            return new QueryResellerUserAlarmThresholdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryResellerUserAlarmThresholdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryResellerUserAlarmThresholdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Denominator")
        private Integer denominator;

        @com.aliyun.core.annotation.NameInMap("Numerator")
        private Integer numerator;

        @com.aliyun.core.annotation.NameInMap("ThresholdAmount")
        private String thresholdAmount;

        @com.aliyun.core.annotation.NameInMap("ThresholdType")
        private Integer thresholdType;

        private Data(Builder builder) {
            this.denominator = builder.denominator;
            this.numerator = builder.numerator;
            this.thresholdAmount = builder.thresholdAmount;
            this.thresholdType = builder.thresholdType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return denominator
         */
        public Integer getDenominator() {
            return this.denominator;
        }

        /**
         * @return numerator
         */
        public Integer getNumerator() {
            return this.numerator;
        }

        /**
         * @return thresholdAmount
         */
        public String getThresholdAmount() {
            return this.thresholdAmount;
        }

        /**
         * @return thresholdType
         */
        public Integer getThresholdType() {
            return this.thresholdType;
        }

        public static final class Builder {
            private Integer denominator; 
            private Integer numerator; 
            private String thresholdAmount; 
            private Integer thresholdType; 

            /**
             * Denominator.
             */
            public Builder denominator(Integer denominator) {
                this.denominator = denominator;
                return this;
            }

            /**
             * Numerator.
             */
            public Builder numerator(Integer numerator) {
                this.numerator = numerator;
                return this;
            }

            /**
             * ThresholdAmount.
             */
            public Builder thresholdAmount(String thresholdAmount) {
                this.thresholdAmount = thresholdAmount;
                return this;
            }

            /**
             * ThresholdType.
             */
            public Builder thresholdType(Integer thresholdType) {
                this.thresholdType = thresholdType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
