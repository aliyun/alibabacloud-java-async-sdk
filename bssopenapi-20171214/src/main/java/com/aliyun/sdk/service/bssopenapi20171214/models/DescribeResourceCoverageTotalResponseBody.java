// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceCoverageTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceCoverageTotalResponseBody</p>
 */
public class DescribeResourceCoverageTotalResponseBody extends TeaModel {
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

    private DescribeResourceCoverageTotalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceCoverageTotalResponseBody create() {
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
         * The operation that you want to perform. Set the value to DescribeResourceCoverageTotal.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the total coverage data of deduction plans.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The type of deduction plans whose total coverage data is queried. Valid values: RI and SCU.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The coverage rate of deduction plans within the specified period.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range to query. The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourceCoverageTotalResponseBody build() {
            return new DescribeResourceCoverageTotalResponseBody(this);
        } 

    } 

    public static class PeriodCoverage extends TeaModel {
        @NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @NameInMap("Period")
        private String period;

        private PeriodCoverage(Builder builder) {
            this.coveragePercentage = builder.coveragePercentage;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodCoverage create() {
            return builder().build();
        }

        /**
         * @return coveragePercentage
         */
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private Float coveragePercentage; 
            private String period; 

            /**
             * The returned data.
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

            /**
             * The ID of the request.
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
    public static class TotalCoverage extends TeaModel {
        @NameInMap("CapacityUnit")
        private String capacityUnit;

        @NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @NameInMap("DeductQuantity")
        private Float deductQuantity;

        @NameInMap("TotalQuantity")
        private Float totalQuantity;

        private TotalCoverage(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
            this.coveragePercentage = builder.coveragePercentage;
            this.deductQuantity = builder.deductQuantity;
            this.totalQuantity = builder.totalQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalCoverage create() {
            return builder().build();
        }

        /**
         * @return capacityUnit
         */
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        /**
         * @return coveragePercentage
         */
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
        }

        /**
         * @return deductQuantity
         */
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        /**
         * @return totalQuantity
         */
        public Float getTotalQuantity() {
            return this.totalQuantity;
        }

        public static final class Builder {
            private String capacityUnit; 
            private Float coveragePercentage; 
            private Float deductQuantity; 
            private Float totalQuantity; 

            /**
             * Queries the total coverage data of reserved instances (RIs) or storage capacity units (SCUs).
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * The returned data.
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

            /**
             * DeductQuantity.
             */
            public Builder deductQuantity(Float deductQuantity) {
                this.deductQuantity = deductQuantity;
                return this;
            }

            /**
             * TotalQuantity.
             */
            public Builder totalQuantity(Float totalQuantity) {
                this.totalQuantity = totalQuantity;
                return this;
            }

            public TotalCoverage build() {
                return new TotalCoverage(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PeriodCoverage")
        private java.util.List < PeriodCoverage> periodCoverage;

        @NameInMap("TotalCoverage")
        private TotalCoverage totalCoverage;

        private Data(Builder builder) {
            this.periodCoverage = builder.periodCoverage;
            this.totalCoverage = builder.totalCoverage;
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
         * @return totalCoverage
         */
        public TotalCoverage getTotalCoverage() {
            return this.totalCoverage;
        }

        public static final class Builder {
            private java.util.List < PeriodCoverage> periodCoverage; 
            private TotalCoverage totalCoverage; 

            /**
             * The ID of the account for which you want to query total coverage data. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.
             */
            public Builder periodCoverage(java.util.List < PeriodCoverage> periodCoverage) {
                this.periodCoverage = periodCoverage;
                return this;
            }

            /**
             * The unit that is used to measure the resources deducted from deduction plans.
             */
            public Builder totalCoverage(TotalCoverage totalCoverage) {
                this.totalCoverage = totalCoverage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
