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
 * {@link DescribeResourceCoverageTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceCoverageTotalResponseBody</p>
 */
public class DescribeResourceCoverageTotalResponseBody extends TeaModel {
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

        private Builder() {
        } 

        private Builder(DescribeResourceCoverageTotalResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourceCoverageTotalResponseBody build() {
            return new DescribeResourceCoverageTotalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceCoverageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceCoverageTotalResponseBody</p>
     */
    public static class PeriodCoverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @com.aliyun.core.annotation.NameInMap("Period")
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

            private Builder() {
            } 

            private Builder(PeriodCoverage model) {
                this.coveragePercentage = model.coveragePercentage;
                this.period = model.period;
            } 

            /**
             * <p>The coverage rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

            /**
             * <p>The time period. Format: yyyyMMddHH.</p>
             * 
             * <strong>example:</strong>
             * <p>2020110100</p>
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
     * {@link DescribeResourceCoverageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceCoverageTotalResponseBody</p>
     */
    public static class TotalCoverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private String capacityUnit;

        @com.aliyun.core.annotation.NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @com.aliyun.core.annotation.NameInMap("DeductQuantity")
        private Float deductQuantity;

        @com.aliyun.core.annotation.NameInMap("TotalQuantity")
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

            private Builder() {
            } 

            private Builder(TotalCoverage model) {
                this.capacityUnit = model.capacityUnit;
                this.coveragePercentage = model.coveragePercentage;
                this.deductQuantity = model.deductQuantity;
                this.totalQuantity = model.totalQuantity;
            } 

            /**
             * <p>The offset unit.</p>
             * 
             * <strong>example:</strong>
             * <p>Computing power*hours</p>
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * <p>The total coverage rate.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
                return this;
            }

            /**
             * <p>The total offset amount.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder deductQuantity(Float deductQuantity) {
                this.deductQuantity = deductQuantity;
                return this;
            }

            /**
             * <p>The total usage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeResourceCoverageTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceCoverageTotalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodCoverage")
        private java.util.List<PeriodCoverage> periodCoverage;

        @com.aliyun.core.annotation.NameInMap("TotalCoverage")
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
        public java.util.List<PeriodCoverage> getPeriodCoverage() {
            return this.periodCoverage;
        }

        /**
         * @return totalCoverage
         */
        public TotalCoverage getTotalCoverage() {
            return this.totalCoverage;
        }

        public static final class Builder {
            private java.util.List<PeriodCoverage> periodCoverage; 
            private TotalCoverage totalCoverage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.periodCoverage = model.periodCoverage;
                this.totalCoverage = model.totalCoverage;
            } 

            /**
             * <p>The coverage rate by time period.</p>
             */
            public Builder periodCoverage(java.util.List<PeriodCoverage> periodCoverage) {
                this.periodCoverage = periodCoverage;
                return this;
            }

            /**
             * <p>The total coverage rate.</p>
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
