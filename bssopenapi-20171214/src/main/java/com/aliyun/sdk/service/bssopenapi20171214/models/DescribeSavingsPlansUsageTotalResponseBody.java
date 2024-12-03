// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSavingsPlansUsageTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSavingsPlansUsageTotalResponseBody</p>
 */
public class DescribeSavingsPlansUsageTotalResponseBody extends TeaModel {
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

    private DescribeSavingsPlansUsageTotalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansUsageTotalResponseBody create() {
        return builder().build();
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSavingsPlansUsageTotalResponseBody build() {
            return new DescribeSavingsPlansUsageTotalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSavingsPlansUsageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansUsageTotalResponseBody</p>
     */
    public static class PeriodCoverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Float percentage;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        private PeriodCoverage(Builder builder) {
            this.percentage = builder.percentage;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodCoverage create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Float getPercentage() {
            return this.percentage;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private Float percentage; 
            private String period; 

            /**
             * <p>The usage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder percentage(Float percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * <p>The period.</p>
             * <p>The value is in the format of yyyyMMddHH.</p>
             * 
             * <strong>example:</strong>
             * <p>2021041500</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            public PeriodCoverage build() {
                return new PeriodCoverage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSavingsPlansUsageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansUsageTotalResponseBody</p>
     */
    public static class TotalUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PoolValue")
        private Float poolValue;

        @com.aliyun.core.annotation.NameInMap("PostpaidCost")
        private Float postpaidCost;

        @com.aliyun.core.annotation.NameInMap("SavedCost")
        private Float savedCost;

        @com.aliyun.core.annotation.NameInMap("UsagePercentage")
        private Float usagePercentage;

        private TotalUsage(Builder builder) {
            this.poolValue = builder.poolValue;
            this.postpaidCost = builder.postpaidCost;
            this.savedCost = builder.savedCost;
            this.usagePercentage = builder.usagePercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalUsage create() {
            return builder().build();
        }

        /**
         * @return poolValue
         */
        public Float getPoolValue() {
            return this.poolValue;
        }

        /**
         * @return postpaidCost
         */
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        /**
         * @return savedCost
         */
        public Float getSavedCost() {
            return this.savedCost;
        }

        /**
         * @return usagePercentage
         */
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        public static final class Builder {
            private Float poolValue; 
            private Float postpaidCost; 
            private Float savedCost; 
            private Float usagePercentage; 

            /**
             * <p>The total amount of the savings plan.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder poolValue(Float poolValue) {
                this.poolValue = poolValue;
                return this;
            }

            /**
             * <p>The pay-as-you-go cost.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder postpaidCost(Float postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * <p>The amount that is saved.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder savedCost(Float savedCost) {
                this.savedCost = savedCost;
                return this;
            }

            /**
             * <p>The total usage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usagePercentage(Float usagePercentage) {
                this.usagePercentage = usagePercentage;
                return this;
            }

            public TotalUsage build() {
                return new TotalUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSavingsPlansUsageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSavingsPlansUsageTotalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodCoverage")
        private java.util.List < PeriodCoverage> periodCoverage;

        @com.aliyun.core.annotation.NameInMap("TotalUsage")
        private TotalUsage totalUsage;

        private Data(Builder builder) {
            this.periodCoverage = builder.periodCoverage;
            this.totalUsage = builder.totalUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return periodCoverage
         */
        public java.util.List < PeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        /**
         * @return totalUsage
         */
        public TotalUsage getTotalUsage() {
            return this.totalUsage;
        }

        public static final class Builder {
            private java.util.List < PeriodCoverage> periodCoverage; 
            private TotalUsage totalUsage; 

            /**
             * <p>The usage in different periods.</p>
             */
            public Builder periodCoverage(java.util.List < PeriodCoverage> periodCoverage) {
                this.periodCoverage = periodCoverage;
                return this;
            }

            /**
             * <p>The usage summary.</p>
             */
            public Builder totalUsage(TotalUsage totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
