// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetModelInvocationSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelInvocationSummaryResponseBody</p>
 */
public class GetModelInvocationSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetModelInvocationSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelInvocationSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetModelInvocationSummaryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetModelInvocationSummaryResponseBody build() {
            return new GetModelInvocationSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelInvocationSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInvocationSummaryResponseBody</p>
     */
    public static class ProviderDistribution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Double percentage;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        private ProviderDistribution(Builder builder) {
            this.count = builder.count;
            this.percentage = builder.percentage;
            this.providerName = builder.providerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProviderDistribution create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return percentage
         */
        public Double getPercentage() {
            return this.percentage;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        public static final class Builder {
            private Integer count; 
            private Double percentage; 
            private String providerName; 

            private Builder() {
            } 

            private Builder(ProviderDistribution model) {
                this.count = model.count;
                this.percentage = model.percentage;
                this.providerName = model.providerName;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(Double percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            public ProviderDistribution build() {
                return new ProviderDistribution(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelInvocationSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInvocationSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallFrequency")
        private Double callFrequency;

        @com.aliyun.core.annotation.NameInMap("ProviderDistribution")
        private java.util.List<ProviderDistribution> providerDistribution;

        @com.aliyun.core.annotation.NameInMap("TodayCallCount")
        private Integer todayCallCount;

        @com.aliyun.core.annotation.NameInMap("TodayChangeRate")
        private Double todayChangeRate;

        @com.aliyun.core.annotation.NameInMap("WeekCallCount")
        private Integer weekCallCount;

        @com.aliyun.core.annotation.NameInMap("WeekChangeRate")
        private Double weekChangeRate;

        private Data(Builder builder) {
            this.callFrequency = builder.callFrequency;
            this.providerDistribution = builder.providerDistribution;
            this.todayCallCount = builder.todayCallCount;
            this.todayChangeRate = builder.todayChangeRate;
            this.weekCallCount = builder.weekCallCount;
            this.weekChangeRate = builder.weekChangeRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callFrequency
         */
        public Double getCallFrequency() {
            return this.callFrequency;
        }

        /**
         * @return providerDistribution
         */
        public java.util.List<ProviderDistribution> getProviderDistribution() {
            return this.providerDistribution;
        }

        /**
         * @return todayCallCount
         */
        public Integer getTodayCallCount() {
            return this.todayCallCount;
        }

        /**
         * @return todayChangeRate
         */
        public Double getTodayChangeRate() {
            return this.todayChangeRate;
        }

        /**
         * @return weekCallCount
         */
        public Integer getWeekCallCount() {
            return this.weekCallCount;
        }

        /**
         * @return weekChangeRate
         */
        public Double getWeekChangeRate() {
            return this.weekChangeRate;
        }

        public static final class Builder {
            private Double callFrequency; 
            private java.util.List<ProviderDistribution> providerDistribution; 
            private Integer todayCallCount; 
            private Double todayChangeRate; 
            private Integer weekCallCount; 
            private Double weekChangeRate; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callFrequency = model.callFrequency;
                this.providerDistribution = model.providerDistribution;
                this.todayCallCount = model.todayCallCount;
                this.todayChangeRate = model.todayChangeRate;
                this.weekCallCount = model.weekCallCount;
                this.weekChangeRate = model.weekChangeRate;
            } 

            /**
             * CallFrequency.
             */
            public Builder callFrequency(Double callFrequency) {
                this.callFrequency = callFrequency;
                return this;
            }

            /**
             * ProviderDistribution.
             */
            public Builder providerDistribution(java.util.List<ProviderDistribution> providerDistribution) {
                this.providerDistribution = providerDistribution;
                return this;
            }

            /**
             * TodayCallCount.
             */
            public Builder todayCallCount(Integer todayCallCount) {
                this.todayCallCount = todayCallCount;
                return this;
            }

            /**
             * TodayChangeRate.
             */
            public Builder todayChangeRate(Double todayChangeRate) {
                this.todayChangeRate = todayChangeRate;
                return this;
            }

            /**
             * WeekCallCount.
             */
            public Builder weekCallCount(Integer weekCallCount) {
                this.weekCallCount = weekCallCount;
                return this;
            }

            /**
             * WeekChangeRate.
             */
            public Builder weekChangeRate(Double weekChangeRate) {
                this.weekChangeRate = weekChangeRate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
