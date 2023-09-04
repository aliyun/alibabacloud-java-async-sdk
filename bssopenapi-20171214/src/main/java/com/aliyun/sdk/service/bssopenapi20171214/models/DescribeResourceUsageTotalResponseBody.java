// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageTotalResponseBody</p>
 */
public class DescribeResourceUsageTotalResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The total savings.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The usage of deduction plans within the specified period.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The total costs of pay-as-you-go instances.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The status code.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to DescribeResourceUsageTotal.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourceUsageTotalResponseBody build() {
            return new DescribeResourceUsageTotalResponseBody(this);
        } 

    } 

    public static class PeriodCoverage extends TeaModel {
        @NameInMap("Period")
        private String period;

        @NameInMap("UsagePercentage")
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
             * The returned data.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The fee of purchased deduction plans.
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
    public static class TotalUsage extends TeaModel {
        @NameInMap("PostpaidCost")
        private Float postpaidCost;

        @NameInMap("PotentialSavedCost")
        private Float potentialSavedCost;

        @NameInMap("ReservationCost")
        private Float reservationCost;

        @NameInMap("SavedCost")
        private Float savedCost;

        @NameInMap("UsagePercentage")
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
             * The ID of the request.
             */
            public Builder postpaidCost(Float postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * PotentialSavedCost.
             */
            public Builder potentialSavedCost(Float potentialSavedCost) {
                this.potentialSavedCost = potentialSavedCost;
                return this;
            }

            /**
             * ReservationCost.
             */
            public Builder reservationCost(Float reservationCost) {
                this.reservationCost = reservationCost;
                return this;
            }

            /**
             * Queries the total usage data of reserved instances (RIs) or storage capacity units (SCUs).
             */
            public Builder savedCost(Float savedCost) {
                this.savedCost = savedCost;
                return this;
            }

            /**
             * The fee of purchased deduction plans.
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
    public static class Data extends TeaModel {
        @NameInMap("PeriodCoverage")
        private java.util.List < PeriodCoverage> periodCoverage;

        @NameInMap("TotalUsage")
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
             * The total potential savings.
             */
            public Builder periodCoverage(java.util.List < PeriodCoverage> periodCoverage) {
                this.periodCoverage = periodCoverage;
                return this;
            }

            /**
             * The total usage of deduction plans.
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
