// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResourceUsageTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageTotalResponseBody</p>
 */
public class DescribeResourceUsageTotalResponseBody extends TeaModel {
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

    private DescribeResourceUsageTotalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageTotalResponseBody create() {
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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>364C7C81-5E5E-51A0-B738-1969D2671B05</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourceUsageTotalResponseBody build() {
            return new DescribeResourceUsageTotalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceUsageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceUsageTotalResponseBody</p>
     */
    public static class PeriodCoverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("UsagePercentage")
        private Float usagePercentage;

        private PeriodCoverage(Builder builder) {
            this.period = builder.period;
            this.usagePercentage = builder.usagePercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodCoverage create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return usagePercentage
         */
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        public static final class Builder {
            private String period; 
            private Float usagePercentage; 

            /**
             * <p>The period.</p>
             * 
             * <strong>example:</strong>
             * <p>2021071500</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The usage of resource plans.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder usagePercentage(Float usagePercentage) {
                this.usagePercentage = usagePercentage;
                return this;
            }

            public PeriodCoverage build() {
                return new PeriodCoverage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceUsageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceUsageTotalResponseBody</p>
     */
    public static class TotalUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PostpaidCost")
        private Float postpaidCost;

        @com.aliyun.core.annotation.NameInMap("PotentialSavedCost")
        private Float potentialSavedCost;

        @com.aliyun.core.annotation.NameInMap("ReservationCost")
        private Float reservationCost;

        @com.aliyun.core.annotation.NameInMap("SavedCost")
        private Float savedCost;

        @com.aliyun.core.annotation.NameInMap("UsagePercentage")
        private Float usagePercentage;

        private TotalUsage(Builder builder) {
            this.postpaidCost = builder.postpaidCost;
            this.potentialSavedCost = builder.potentialSavedCost;
            this.reservationCost = builder.reservationCost;
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
         * @return postpaidCost
         */
        public Float getPostpaidCost() {
            return this.postpaidCost;
        }

        /**
         * @return potentialSavedCost
         */
        public Float getPotentialSavedCost() {
            return this.potentialSavedCost;
        }

        /**
         * @return reservationCost
         */
        public Float getReservationCost() {
            return this.reservationCost;
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
            private Float postpaidCost; 
            private Float potentialSavedCost; 
            private Float reservationCost; 
            private Float savedCost; 
            private Float usagePercentage; 

            /**
             * <p>The total costs of pay-as-you-go instances.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder postpaidCost(Float postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * <p>The total potential savings.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder potentialSavedCost(Float potentialSavedCost) {
                this.potentialSavedCost = potentialSavedCost;
                return this;
            }

            /**
             * <p>The fee of purchased resource plans.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder reservationCost(Float reservationCost) {
                this.reservationCost = reservationCost;
                return this;
            }

            /**
             * <p>The total savings.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder savedCost(Float savedCost) {
                this.savedCost = savedCost;
                return this;
            }

            /**
             * <p>The total usage of resource plans.</p>
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
     * {@link DescribeResourceUsageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceUsageTotalResponseBody</p>
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
             * <p>The usage of resource plans in the specified period.</p>
             */
            public Builder periodCoverage(java.util.List < PeriodCoverage> periodCoverage) {
                this.periodCoverage = periodCoverage;
                return this;
            }

            /**
             * <p>The total usage of resource plans.</p>
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
