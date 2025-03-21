// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link GetAppQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppQuotaResponseBody</p>
 */
public class GetAppQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetAppQuotaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppQuotaResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetAppQuotaResponseBody build() {
            return new GetAppQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppQuotaResponseBody</p>
     */
    public static class Limiters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("immutable")
        private Boolean immutable;

        @com.aliyun.core.annotation.NameInMap("maxValue")
        private Long maxValue;

        @com.aliyun.core.annotation.NameInMap("minValue")
        private Long minValue;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Limiters(Builder builder) {
            this.immutable = builder.immutable;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Limiters create() {
            return builder().build();
        }

        /**
         * @return immutable
         */
        public Boolean getImmutable() {
            return this.immutable;
        }

        /**
         * @return maxValue
         */
        public Long getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Long getMinValue() {
            return this.minValue;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean immutable; 
            private Long maxValue; 
            private Long minValue; 
            private String type; 

            /**
             * immutable.
             */
            public Builder immutable(Boolean immutable) {
                this.immutable = immutable;
                return this;
            }

            /**
             * maxValue.
             */
            public Builder maxValue(Long maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * minValue.
             */
            public Builder minValue(Long minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Limiters build() {
                return new Limiters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppQuotaResponseBody</p>
     */
    public static class LimiterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limiters")
        private java.util.List<Limiters> limiters;

        private LimiterInfo(Builder builder) {
            this.limiters = builder.limiters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimiterInfo create() {
            return builder().build();
        }

        /**
         * @return limiters
         */
        public java.util.List<Limiters> getLimiters() {
            return this.limiters;
        }

        public static final class Builder {
            private java.util.List<Limiters> limiters; 

            /**
             * limiters.
             */
            public Builder limiters(java.util.List<Limiters> limiters) {
                this.limiters = limiters;
                return this;
            }

            public LimiterInfo build() {
                return new LimiterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppQuotaResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limiterInfo")
        private LimiterInfo limiterInfo;

        @com.aliyun.core.annotation.NameInMap("quotaInfo")
        private java.util.Map<String, ?> quotaInfo;

        private Result(Builder builder) {
            this.limiterInfo = builder.limiterInfo;
            this.quotaInfo = builder.quotaInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return limiterInfo
         */
        public LimiterInfo getLimiterInfo() {
            return this.limiterInfo;
        }

        /**
         * @return quotaInfo
         */
        public java.util.Map<String, ?> getQuotaInfo() {
            return this.quotaInfo;
        }

        public static final class Builder {
            private LimiterInfo limiterInfo; 
            private java.util.Map<String, ?> quotaInfo; 

            /**
             * limiterInfo.
             */
            public Builder limiterInfo(LimiterInfo limiterInfo) {
                this.limiterInfo = limiterInfo;
                return this;
            }

            /**
             * quotaInfo.
             */
            public Builder quotaInfo(java.util.Map<String, ?> quotaInfo) {
                this.quotaInfo = quotaInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
